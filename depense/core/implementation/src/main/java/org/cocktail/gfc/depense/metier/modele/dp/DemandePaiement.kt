package org.cocktail.gfc.depense.metier.modele.dp

import org.cocktail.gfc.common.bean.montant.Montant
import org.cocktail.gfc.common.bean.montant.Pourcentage
import org.cocktail.gfc.common.bean.montant.Quantite
import javax.persistence.*
import javax.persistence.JoinColumn

@Entity
@Table(name = "DEP_DP")
class DemandePaiement(

    @Column(name = "NUM_DP")
    var numero: String,

    @Column(name = "EXE_ORDRE")
    var exeOrdre: Int,

    @Column(name = "ID_DEP_FACTURE")
    var idFacture: Long,

    @Column(name = "FOU_A_PAYER")
    var idFournisseurAPayer: Long,

    @Column(name = "LIBELLE")
    var libelle: String?,

    @Column(name = "MONTANT_FACTURE_HT")
    var montantFactureHT: Montant,

    @Column(name = "MONTANT_FACTURE_TVA")
    var montantFactureTVA: Montant,

    @Column(name = "MONTANT_FACTURE_TTC")
    var montantFactureTTC: Montant,

    @Column(name = "MONTANT_A_PAYER_TTC")
    var montantAPayerTTC: Montant,

    @Column(name = "MONTANT_A_PAYER_TTC_APRES_RG")
    var montantAPayerTTCApresRG: Montant,

    @Column(name = "MONTANT_RAPPROCHER_HT")
    var montantARapprocherHT: Montant,

    @Column(name = "MONTANT_RAPPROCHER_TTC")
    var montantARapprocherTTC: Montant,

    @Column(name = "MONTANT_RETENUE_GARANTIE")
    var montantRetenueGarantie: Montant,

    @Column(name = "DATE_ECHEANCE_THEORIQUE")
    var dateEcheanceTheorique: String,

    @Column(name = "DATE_ECHEANCE_MODIFIEE")
    var dateEcheanceModifiee: String,

    @Column(name = "PERS_ID_CREATION")
    var idPrsCreateur: Long? = null,

    @Column(name = "DATE_CREATION")
    var dateCreation: String = "2017-01-01",

    // TODO : transformer en enum
    @Column(name = "TYET_ID")
    var tyetId: Long,

    @Column(name = "EN_ATTENTE")
    var enAttente: Boolean
) {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_DEP_DP")
    var id: Long? = null

    @Column(name = "PERS_ID_MODIFICATION")
    var idPrsModification: Long? = null

    @Column(name = "DATE_MODIFICATION")
    var dateModification: String? = null

    @Column(name = "LOCK_VERSION")
    @Version
    var version: Long = 0

    // https://vladmihalcea.com/2017/03/29/the-best-way-to-map-a-onetomany-association-with-jpa-and-hibernate/
    // Utilisation d'une relation bidirectionnelle diminue le nombre de requêtes generées mais impose d'ecrire un ajouterBien qui cree le lien bidirectionnel (addChild / setParent)
    // Utilisation d'une relation unidirectionnelle ajoute 1 requête update inutile ; p.e plus simple a gérer en Java
    @Embedded
    var repartArticle: DemandePaiementRepartArticle? = null

//    @OneToMany(mappedBy = "dp", fetch = FetchType.EAGER)
//    var lignes: List<DemandePaiementLigne> = listOf()
//
//    fun ajouterLigne(ligne: DemandePaiementLigne): Unit {
//        lignes.toMutableList().add(ligne)
//        ligne.dp = this
//    }
}

@Embeddable
class DemandePaiementRepartArticle {
    @OneToMany(fetch = FetchType.EAGER, cascade = arrayOf(CascadeType.ALL), orphanRemoval = true)
    @JoinColumn(name = "ID_DEP_DP", nullable = false)
    @OrderBy("ID_DEP_DP_LIGNE")
    val lignes: List<DemandePaiementLigne> = listOf()
}

@Entity
@Table(name = "DEP_DP_LIGNE")
@SequenceGenerator(name = "DP.DP_LIGNE_SEQ", sequenceName = "DEP_DP_LIGNE_SEQ")
class DemandePaiementLigne(
    @Column(name = "LIBELLE")
    var libelle: String?,

    @Column(name = "DONT_AJUSTEMENT_TVA")
    var dontAjustementTVA: Montant,

    @Column(name = "MONTANT_HT")
    var montantHT: Montant,

    @Column(name = "MONTANT_TTC")
    var montantTTC: Montant,

    @Column(name = "MONTANT_TVA")
    var montantTVA: Montant,

    @Column(name = "QUANTITE")
    var quantite: Quantite,

    @Column(name = "TAUX_TVA")
    var tauxTVA: Pourcentage,

    @Column(name = "TVA_ID")
    var idTva: Long,

    @Column(name = "TYPE_DP_LIGNE")
    var typeDpLigne: String

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="ID_DEP_DP")
//    var dp: DemandePaiement
) {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DP.DP_LIGNE_SEQ")
    @Column(name = "ID_DEP_DP_LIGNE")
    var idDepDpLigne: Long? = null
}




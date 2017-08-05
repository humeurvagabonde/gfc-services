package org.cocktail.gfc.depense.metier.modele.dp

import org.cocktail.gfc.common.bean.montant.Montant
import org.cocktail.gfc.common.bean.montant.Pourcentage
import org.cocktail.gfc.common.bean.montant.Quantite
import java.lang.invoke.MethodHandles
import javax.persistence.*

@Entity
@Table(name = "DEP_DP")
class DemandePaiement(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_DEP_DP")
    var id: Long?,

    @Column(name = "NUM_DP")
    var numero: String,

    @Column(name = "ID_DEP_FACTURE")
    var idFacture: Long,

    @Column(name = "MONTANT_FACTURE_TTC")
    var montantFactureTTC: Montant,

    @Column(name = "MONTANT_A_PAYER_TTC")
    var montantAPayerTTC: Montant,

    @Column(name = "LIBELLE")
    var libelle: String?,

    @Column(name = "MONTANT_RAPPROCHER_HT")
    var montantARapprocherHT: Montant,

    @Column(name = "MONTANT_RAPPROCHER_TTC")
    var montantARapprocherTTC: Montant,

    @Column(name = "FOU_A_PAYER")
    var idFournisseurAPayer: Long,

    @Column(name = "MONTANT_RETENUE_GARANTIE")
    var montantRetenueGarantie: Montant,

    @Column(name = "PERS_ID_CREATION")
    var idPrsCreateur: Long,

    @Column(name = "DATE_CREATION")
    var dateCreation: String,

    @Column(name = "PERS_ID_MODIFICATION")
    var idPrsModification: Long?,

    @Column(name = "DATE_MODIFICATION")
    var dateModification: String?,

    @Column(name = "EXE_ORDRE")
    var exeOrdre: Int,

    // TODO : transformer en enum
    @Column(name = "TYET_ID")
    var tyetId: Long,

    @Column(name = "MONTANT_FACTURE_HT")
    var montantFactureHT: Montant,

    @Column(name = "MONTANT_FACTURE_TVA")
    var montantFactureTVA: Montant,

    @Column(name = "MONTANT_A_PAYER_TTC_APRES_RG")
    var montantAPayerTTCApresRG: Montant,

    @Column(name = "DATE_ECHEANCE_THEORIQUE")
    var dateEcheanceTheorique: String,

    @Column(name = "DATE_ECHEANCE_MODIFIEE")
    var dateEcheanceModifiee: String,

    @Column(name = "EN_ATTENTE")
    var enAttente: Boolean,

    @Column(name = "LOCK_VERSION")
    @Version
    var version: Long,

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "DEP_DP_LIGNE", joinColumns = arrayOf(JoinColumn(name = "ID_DEP_DP")))
    @OrderColumn(name = "ID_DEP_DP_LIGNE", insertable = false, updatable = false)
    var lignes: List<DemandePaiementLigne> = listOf()
)

@Embeddable
class DemandePaiementLigne(
    @Column(name = "ID_DEP_DP_LIGNE")
    var idDepDpLigne: Long?,

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
    var typeDpLigne: String
) {

}


/**
ATT_ORDRE	NUMBER	Yes
CE_ORDRE	NUMBER	Yes
DONT_AJUSTEMENT_TVA	NUMBER(12,2)	No
ID_DEP_DP	NUMBER(38,0)	No
ID_DEP_DP_LIGNE	NUMBER(38,0)	No
ID_DEP_SF_LIGNE	NUMBER(38,0)	Yes
LIBELLE	VARCHAR2(200 BYTE)	Yes
MONTANT_HT	NUMBER(12,2)	No
MONTANT_TTC	NUMBER(12,2)	No
MONTANT_TVA	NUMBER(12,2)	No
QUANTITE	NUMBER(12,2)	No
TAUX_TVA	NUMBER(12,2)	No
TVA_ID	NUMBER	No
TYPA_ID	NUMBER	Yes
TYPE_DP_LIGNE	VARCHAR2(30 BYTE)	No
 */




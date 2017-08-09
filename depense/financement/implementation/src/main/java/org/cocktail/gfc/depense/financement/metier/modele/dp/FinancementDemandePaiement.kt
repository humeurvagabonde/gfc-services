package org.cocktail.gfc.depense.financement.metier.modele.dp

import org.cocktail.gfc.common.bean.montant.Montant
import javax.persistence.*

// TODO bosser sur les visibilites
@Entity(name = "financementDp")
@Table(name = "DEP_DP")
class FinancementDemandePaiement(
    @Column(name = "ID_DEP_DP")
    @Transient
    val idDp: Long
//    @Column(name = "NUM_DP")
//    val numeroDp: String
) {

    // proposition#1
    // val biensAPayer: Map<Long, SyntheseBienAPayer> = mapOf()
    // var repartitionsComptaGene: Map<Long, RepartitionComptaGene> = mapOf()

    // proposition#2
    // On organise les financements par identifiant de Bien
    // un Bien = un ligne DP<->Service Fait ou une ligne DP Directe
    // https://en.wikibooks.org/wiki/Java_Persistence/Relationships#Maps
    var financementParBien: MutableMap<Long, FinancementBienDp>  = mutableMapOf()

    // proposition#3
    // utiliser l'entite DemandePaiementLigne comme clé d'une Map avec un @MapKeyJoinColumn

}

class SyntheseBienAPayer(
        val idBienAPayer: Long,
        val montantHT: Montant) {

}

class FinancementBienDp(val idBien: Long) {

    var repartitionsComptaGene: MutableList<RepartitionComptaGene> = mutableListOf()
    var repartitionsComptaBud: MutableList<RepartitionComptaBud> = mutableListOf()

}

// Utiliser MappedSuperClass pour définir le SequenceGenerator
@Entity
@Table(name = "DEP_REPART_BUDGET")
@SequenceGenerator(name = "DP.DP_REPART_BUDGET_SEQ", sequenceName = "DEP_REPART_BUDGET_SEQ")
class RepartitionComptaGene() {

}

@Entity
@Table(name = "DEP_REPART_BUDGET")
@SequenceGenerator(name = "DP.DP_REPART_BUDGET_SEQ", sequenceName = "DEP_REPART_BUDGET_SEQ")
class RepartitionComptaBud() {

}
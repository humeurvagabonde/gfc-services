package org.cocktail.gfc.depense.financement.metier.modele.dp

import org.cocktail.gfc.common.bean.montant.Montant
import javax.persistence.*

// TODO bosser sur les visibilites
data class FinancementDemandePaiement(
    val idDp: Long,
    val numeroDp: String
) {
    val financementParBien: MutableMap<Long, FinancementBienDp>  = mutableMapOf()
}

data class FinancementBienDp(
        val bien: BienAPayer) {

    val repartitionsComptaGene: MutableList<RepartitionComptaGene> = mutableListOf()
    val repartitionsComptaBud: MutableList<RepartitionComptaBud> = mutableListOf()

    fun getIdBien() = bien.idBienAPayer
}

data class BienAPayer(
        val idBienAPayer: Long,
        val montantHT: Montant) {
}

data class RepartitionComptaGene(
        val idRepart: Long
) {

}

data class RepartitionComptaBud(
        val idRepart: Long
) {

}
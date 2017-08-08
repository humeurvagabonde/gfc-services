package org.cocktail.gfc.depense.financement.metier.modele.dp

import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

class FinancementDemandePaiement(
    @Column(name = "ID_DEP_DP")
    val idDp: Long,
    @Column(name = "NUM_DP")
    val numeroDp: String
) {

    // On organise les financements par identifiant de Bien
    // un Bien = un ligne DP<->Service Fait ou une ligne DP Directe
    var financementParBien: MutableMap<Long, FinancementBienDp>  = mutableMapOf()

}

class FinancementBienDp(val idBien: Long) {

    var repartitionsComptaGene: MutableList<RepartitionComptaGene> = mutableListOf()
    var repartitionsComptaBud: MutableList<RepartitionComptaBud> = mutableListOf()
}

class RepartitionComptaGene() {

}

class RepartitionComptaBud() {

}
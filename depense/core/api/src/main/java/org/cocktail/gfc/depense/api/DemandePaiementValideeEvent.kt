package org.cocktail.gfc.depense.api

class DemandePaiementValideeEvent(
        val idDp: Long,
        val numDp: String
) {
    val timestamp = System.currentTimeMillis()



}
package org.cocktail.gfc.comptabilite.generale.api

class BrouillardCreeEvent(
        val idBrouillard: Long
) {
    val timestamp = System.currentTimeMillis()
}
package org.cocktail.gfc.depense.api;

interface ServiceFaitCommand {
}

data class CreerSfCommand(
      val ejId: Long,
      val exeOrdre: Int,
      val reference: String,
      val commentaire: String,
      val dateSf: String,
      val persId: Long,
      val nomApplication: String,
      val lignesSf: String
): ServiceFaitCommand

data class MajSfCommand(
        val exeOrdre: Int,
        val reference: String,
        val commentaire: String,
        val dateSf: String,
        val persId: Long,
        val nomApplication: String,
        val lignesSf: String
): ServiceFaitCommand


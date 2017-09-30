package org.cocktail.gfc.depense.metier.modele.codeanalytique

import javax.persistence.*

@Entity
@Table(name = "ADM_CODE_ANALYTIQUE", schema = "GFC")
data class CodeAnalytique(
        @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name = "CAN_ID")
        var id: Long?,
        @Column(name = "CAN_CODE")
        var code: String = "",
        @Column(name = "CAN_LIBELLE")
        var libelle: String = ""
)
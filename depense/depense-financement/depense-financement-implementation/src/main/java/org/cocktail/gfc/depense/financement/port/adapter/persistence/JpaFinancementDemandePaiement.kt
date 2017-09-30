package org.cocktail.gfc.depense.financement.port.adapter.persistence

import org.cocktail.gfc.common.bean.montant.Montant
import java.math.BigDecimal
import javax.persistence.*

// TODO bosser sur les visibilites
@Entity(name = "jpaFinancementDp")
@Table(name = "DEP_DP")
class JpaFinancementDp(
        @Id
        @Column(name = "ID_DEP_DP")
        val idDp: Long,

        @Column(name = "NUM_DP")
        val numeroDp: String,

        @OneToMany
        @JoinColumn(name = "ID_DEP_DP", nullable = false)
        val dpLignes: MutableList<JpaFinancementDpLigne> = mutableListOf()
)

@Entity(name = "jpaFinancementDpLigne")
@Table(name = "DEP_DP_LIGNE")
class JpaFinancementDpLigne(
        @Id
        @Column(name = "ID_DEP_DP_LIGNE")
        val idDpLigne: Long,

        @Column(name = "MONTANT_HT")
        val montantHT: BigDecimal,

        @OneToMany
        @JoinColumn(name = "ID_DEP_DP_LIGNE", nullable = false)
        val dpLignes: MutableList<JpaFinancementDpLigneRepartition> = mutableListOf()
) {
}

@Entity(name = "jpaFinancementDpRepart")
@Table(name = "DEP_REPART_BUDGET")
@SequenceGenerator(name = "DP_REPART_BUDGET_SEQ", sequenceName = "DEP_REPART_BUDGET_SEQ")
class JpaFinancementDpLigneRepartition(
        @Column(name = "EXE_ORDRE")
        val exeOrdre: Int,

        @Column(name = "ID_ADM_EB")
        val idEb: Long,

        @Column(name = "ID_ADM_NATURE_DEP")
        val idNature: Long,

        @Column(name = "ID_ADM_DESTINATION_DEPENSE")
        val idDestination: Long,

        @Column(name = "ID_OPE_OPERATION")
        val idOperation: Long? = null,

        @Column(name = "PCO_NUM")
        val pcoNum: String? = null,

        @Column(name = "ID_ADM_TVA")
        val idTva: Long,

        @Column(name = "TAUX_TVA")
        val tauxTva: BigDecimal,

        @Column(name = "ID_ADM_TAUX_PRORATA")
        val idTauxProrata: Long,

        @Column(name = "TAUX_PRORATA")
        val tauxProrata: BigDecimal,

        @Column(name = "MONTANT_HT")
        val mintantHT: BigDecimal,

        @Column(name = "MONTANT_TVA")
        val montantTVA: BigDecimal,

        @Column(name = "MONTANT_TTC")
        val montantTTC: BigDecimal,

        @Column(name = "MONTANT_BUDGETAIRE")
        val montantBudgetaire: BigDecimal,

        @Column(name = "DONT_AJUSTEMENT_TVA")
        val dontAjustementTva: BigDecimal,

        @Column(name = "DONT_AJUSTEMENT_BUDGETAIRE")
        val dontAjustementBudgetaire: BigDecimal = BigDecimal.ZERO
        ) {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DP_REPART_BUDGET_SEQ")
    @Column(name = "ID_DEP_REPART_BUDGET")
    var idDpLigneRepart: Long? = null

    @Column(name = "TYPE_REPART")
    private val typeRepart: String = "DP"

    // code gestion extrait de l'EB via @Formula
//    @Formula("(select min(o.creation_date) from Orders o where o.customer_id = id)")
//    val
}

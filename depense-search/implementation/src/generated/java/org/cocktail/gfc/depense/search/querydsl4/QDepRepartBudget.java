package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepRepartBudget is a Querydsl query type for QDepRepartBudget
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepRepartBudget extends com.querydsl.sql.RelationalPathBase<QDepRepartBudget> {

    private static final long serialVersionUID = 1635350576;

    public static final QDepRepartBudget depRepartBudget = new QDepRepartBudget("DEP_REPART_BUDGET");

    public final NumberPath<java.math.BigDecimal> dontAjustementBudgetaire = createNumber("dontAjustementBudgetaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> dontAjustementTva = createNumber("dontAjustementTva", java.math.BigDecimal.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idAdmTauxProrata = createNumber("idAdmTauxProrata", Long.class);

    public final NumberPath<Long> idAdmTva = createNumber("idAdmTva", Long.class);

    public final NumberPath<Long> idDepDpLigne = createNumber("idDepDpLigne", Long.class);

    public final NumberPath<Long> idDepEjLigne = createNumber("idDepEjLigne", Long.class);

    public final NumberPath<Long> idDepRepartBudget = createNumber("idDepRepartBudget", Long.class);

    public final NumberPath<Long> idDepSfLigne = createNumber("idDepSfLigne", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<java.math.BigDecimal> montantBudgetaire = createNumber("montantBudgetaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantHt = createNumber("montantHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTtc = createNumber("montantTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTva = createNumber("montantTva", java.math.BigDecimal.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<java.math.BigDecimal> tauxProrata = createNumber("tauxProrata", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> tauxTva = createNumber("tauxTva", java.math.BigDecimal.class);

    public final StringPath typeRepart = createString("typeRepart");

    public final com.querydsl.sql.PrimaryKey<QDepRepartBudget> depRepartBudgetPk = createPrimaryKey(idDepRepartBudget);

    public QDepRepartBudget(String variable) {
        super(QDepRepartBudget.class, forVariable(variable), "GFC", "DEP_REPART_BUDGET");
        addMetadata();
    }

    public QDepRepartBudget(String variable, String schema, String table) {
        super(QDepRepartBudget.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepRepartBudget(Path<? extends QDepRepartBudget> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_REPART_BUDGET");
        addMetadata();
    }

    public QDepRepartBudget(PathMetadata metadata) {
        super(QDepRepartBudget.class, metadata, "GFC", "DEP_REPART_BUDGET");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dontAjustementBudgetaire, ColumnMetadata.named("DONT_AJUSTEMENT_BUDGETAIRE").withIndex(21).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(dontAjustementTva, ColumnMetadata.named("DONT_AJUSTEMENT_TVA").withIndex(20).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(11).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmTauxProrata, ColumnMetadata.named("ID_ADM_TAUX_PRORATA").withIndex(9).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmTva, ColumnMetadata.named("ID_ADM_TVA").withIndex(7).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepDpLigne, ColumnMetadata.named("ID_DEP_DP_LIGNE").withIndex(16).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepEjLigne, ColumnMetadata.named("ID_DEP_EJ_LIGNE").withIndex(15).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepRepartBudget, ColumnMetadata.named("ID_DEP_REPART_BUDGET").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepSfLigne, ColumnMetadata.named("ID_DEP_SF_LIGNE").withIndex(13).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(montantBudgetaire, ColumnMetadata.named("MONTANT_BUDGETAIRE").withIndex(19).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantHt, ColumnMetadata.named("MONTANT_HT").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTtc, ColumnMetadata.named("MONTANT_TTC").withIndex(18).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTva, ColumnMetadata.named("MONTANT_TVA").withIndex(17).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(6).ofType(Types.VARCHAR).withSize(20));
        addMetadata(tauxProrata, ColumnMetadata.named("TAUX_PRORATA").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(tauxTva, ColumnMetadata.named("TAUX_TVA").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(typeRepart, ColumnMetadata.named("TYPE_REPART").withIndex(14).ofType(Types.VARCHAR).withSize(10).notNull());
    }

}


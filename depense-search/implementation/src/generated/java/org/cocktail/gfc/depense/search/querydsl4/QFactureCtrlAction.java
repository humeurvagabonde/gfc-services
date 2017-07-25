package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFactureCtrlAction is a Querydsl query type for QFactureCtrlAction
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFactureCtrlAction extends com.querydsl.sql.RelationalPathBase<QFactureCtrlAction> {

    private static final long serialVersionUID = 1194891923;

    public static final QFactureCtrlAction factureCtrlAction = new QFactureCtrlAction("FACTURE_CTRL_ACTION");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> facId = createNumber("facId", Long.class);

    public final DateTimePath<java.sql.Timestamp> factDateSaisie = createDateTime("factDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> factHtSaisie = createNumber("factHtSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> factId = createNumber("factId", Long.class);

    public final NumberPath<java.math.BigDecimal> factMontantBudgetaire = createNumber("factMontantBudgetaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> factMontantBudgetaireReste = createNumber("factMontantBudgetaireReste", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> factTtcSaisie = createNumber("factTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> factTvaSaisie = createNumber("factTvaSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> lolfId = createNumber("lolfId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QFactureCtrlAction> factureCtrlActionPk = createPrimaryKey(factId);

    public QFactureCtrlAction(String variable) {
        super(QFactureCtrlAction.class, forVariable(variable), "GFC", "FACTURE_CTRL_ACTION");
        addMetadata();
    }

    public QFactureCtrlAction(String variable, String schema, String table) {
        super(QFactureCtrlAction.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFactureCtrlAction(Path<? extends QFactureCtrlAction> path) {
        super(path.getType(), path.getMetadata(), "GFC", "FACTURE_CTRL_ACTION");
        addMetadata();
    }

    public QFactureCtrlAction(PathMetadata metadata) {
        super(QFactureCtrlAction.class, metadata, "GFC", "FACTURE_CTRL_ACTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(facId, ColumnMetadata.named("FAC_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(factDateSaisie, ColumnMetadata.named("FACT_DATE_SAISIE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(factHtSaisie, ColumnMetadata.named("FACT_HT_SAISIE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(factId, ColumnMetadata.named("FACT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(factMontantBudgetaire, ColumnMetadata.named("FACT_MONTANT_BUDGETAIRE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(factMontantBudgetaireReste, ColumnMetadata.named("FACT_MONTANT_BUDGETAIRE_RESTE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(factTtcSaisie, ColumnMetadata.named("FACT_TTC_SAISIE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(factTvaSaisie, ColumnMetadata.named("FACT_TVA_SAISIE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(lolfId, ColumnMetadata.named("LOLF_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


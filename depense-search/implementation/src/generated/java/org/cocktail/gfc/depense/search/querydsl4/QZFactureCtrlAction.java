package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QZFactureCtrlAction is a Querydsl query type for QZFactureCtrlAction
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QZFactureCtrlAction extends com.querydsl.sql.RelationalPathBase<QZFactureCtrlAction> {

    private static final long serialVersionUID = 1345218829;

    public static final QZFactureCtrlAction zFactureCtrlAction = new QZFactureCtrlAction("Z_FACTURE_CTRL_ACTION");

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

    public final NumberPath<Long> zfacId = createNumber("zfacId", Long.class);

    public final NumberPath<Long> zfactId = createNumber("zfactId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QZFactureCtrlAction> zFactureCtrlActionPk = createPrimaryKey(zfactId);

    public QZFactureCtrlAction(String variable) {
        super(QZFactureCtrlAction.class, forVariable(variable), "GFC", "Z_FACTURE_CTRL_ACTION");
        addMetadata();
    }

    public QZFactureCtrlAction(String variable, String schema, String table) {
        super(QZFactureCtrlAction.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QZFactureCtrlAction(Path<? extends QZFactureCtrlAction> path) {
        super(path.getType(), path.getMetadata(), "GFC", "Z_FACTURE_CTRL_ACTION");
        addMetadata();
    }

    public QZFactureCtrlAction(PathMetadata metadata) {
        super(QZFactureCtrlAction.class, metadata, "GFC", "Z_FACTURE_CTRL_ACTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(facId, ColumnMetadata.named("FAC_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(factDateSaisie, ColumnMetadata.named("FACT_DATE_SAISIE").withIndex(11).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(factHtSaisie, ColumnMetadata.named("FACT_HT_SAISIE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(factId, ColumnMetadata.named("FACT_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(factMontantBudgetaire, ColumnMetadata.named("FACT_MONTANT_BUDGETAIRE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(factMontantBudgetaireReste, ColumnMetadata.named("FACT_MONTANT_BUDGETAIRE_RESTE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(factTtcSaisie, ColumnMetadata.named("FACT_TTC_SAISIE").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(factTvaSaisie, ColumnMetadata.named("FACT_TVA_SAISIE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(lolfId, ColumnMetadata.named("LOLF_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zfacId, ColumnMetadata.named("ZFAC_ID").withIndex(12).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zfactId, ColumnMetadata.named("ZFACT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


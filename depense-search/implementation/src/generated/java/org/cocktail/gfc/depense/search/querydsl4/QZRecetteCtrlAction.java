package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QZRecetteCtrlAction is a Querydsl query type for QZRecetteCtrlAction
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QZRecetteCtrlAction extends com.querydsl.sql.RelationalPathBase<QZRecetteCtrlAction> {

    private static final long serialVersionUID = -2092057471;

    public static final QZRecetteCtrlAction zRecetteCtrlAction = new QZRecetteCtrlAction("Z_RECETTE_CTRL_ACTION");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> lolfId = createNumber("lolfId", Long.class);

    public final DateTimePath<java.sql.Timestamp> ractDateSaisie = createDateTime("ractDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> ractHtSaisie = createNumber("ractHtSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> ractId = createNumber("ractId", Long.class);

    public final NumberPath<java.math.BigDecimal> ractMontantBudgetaire = createNumber("ractMontantBudgetaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> ractTtcSaisie = createNumber("ractTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> ractTvaSaisie = createNumber("ractTvaSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> zractId = createNumber("zractId", Long.class);

    public final NumberPath<Long> zrecId = createNumber("zrecId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QZRecetteCtrlAction> zRecetteCtrlActionPk = createPrimaryKey(zractId);

    public QZRecetteCtrlAction(String variable) {
        super(QZRecetteCtrlAction.class, forVariable(variable), "GFC", "Z_RECETTE_CTRL_ACTION");
        addMetadata();
    }

    public QZRecetteCtrlAction(String variable, String schema, String table) {
        super(QZRecetteCtrlAction.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QZRecetteCtrlAction(Path<? extends QZRecetteCtrlAction> path) {
        super(path.getType(), path.getMetadata(), "GFC", "Z_RECETTE_CTRL_ACTION");
        addMetadata();
    }

    public QZRecetteCtrlAction(PathMetadata metadata) {
        super(QZRecetteCtrlAction.class, metadata, "GFC", "Z_RECETTE_CTRL_ACTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(lolfId, ColumnMetadata.named("LOLF_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ractDateSaisie, ColumnMetadata.named("RACT_DATE_SAISIE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(ractHtSaisie, ColumnMetadata.named("RACT_HT_SAISIE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ractId, ColumnMetadata.named("RACT_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ractMontantBudgetaire, ColumnMetadata.named("RACT_MONTANT_BUDGETAIRE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ractTtcSaisie, ColumnMetadata.named("RACT_TTC_SAISIE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ractTvaSaisie, ColumnMetadata.named("RACT_TVA_SAISIE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zractId, ColumnMetadata.named("ZRACT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zrecId, ColumnMetadata.named("ZREC_ID").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


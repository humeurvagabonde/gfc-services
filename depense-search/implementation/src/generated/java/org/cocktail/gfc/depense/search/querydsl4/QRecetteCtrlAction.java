package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecetteCtrlAction is a Querydsl query type for QRecetteCtrlAction
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecetteCtrlAction extends com.querydsl.sql.RelationalPathBase<QRecetteCtrlAction> {

    private static final long serialVersionUID = 2052582919;

    public static final QRecetteCtrlAction recetteCtrlAction = new QRecetteCtrlAction("RECETTE_CTRL_ACTION");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> lolfId = createNumber("lolfId", Long.class);

    public final DateTimePath<java.sql.Timestamp> ractDateSaisie = createDateTime("ractDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> ractHtSaisie = createNumber("ractHtSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> ractId = createNumber("ractId", Long.class);

    public final NumberPath<java.math.BigDecimal> ractMontantBudgetaire = createNumber("ractMontantBudgetaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> ractTtcSaisie = createNumber("ractTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> ractTvaSaisie = createNumber("ractTvaSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRecetteCtrlAction> recetteCtrlActionPk = createPrimaryKey(ractId);

    public QRecetteCtrlAction(String variable) {
        super(QRecetteCtrlAction.class, forVariable(variable), "GFC", "RECETTE_CTRL_ACTION");
        addMetadata();
    }

    public QRecetteCtrlAction(String variable, String schema, String table) {
        super(QRecetteCtrlAction.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecetteCtrlAction(Path<? extends QRecetteCtrlAction> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RECETTE_CTRL_ACTION");
        addMetadata();
    }

    public QRecetteCtrlAction(PathMetadata metadata) {
        super(QRecetteCtrlAction.class, metadata, "GFC", "RECETTE_CTRL_ACTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(lolfId, ColumnMetadata.named("LOLF_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ractDateSaisie, ColumnMetadata.named("RACT_DATE_SAISIE").withIndex(9).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(ractHtSaisie, ColumnMetadata.named("RACT_HT_SAISIE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ractId, ColumnMetadata.named("RACT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ractMontantBudgetaire, ColumnMetadata.named("RACT_MONTANT_BUDGETAIRE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ractTtcSaisie, ColumnMetadata.named("RACT_TTC_SAISIE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ractTvaSaisie, ColumnMetadata.named("RACT_TVA_SAISIE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


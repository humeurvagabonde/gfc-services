package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecetteCtrlConvention is a Querydsl query type for QRecetteCtrlConvention
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecetteCtrlConvention extends com.querydsl.sql.RelationalPathBase<QRecetteCtrlConvention> {

    private static final long serialVersionUID = -1670677822;

    public static final QRecetteCtrlConvention recetteCtrlConvention = new QRecetteCtrlConvention("RECETTE_CTRL_CONVENTION");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final DateTimePath<java.sql.Timestamp> rconDateSaisie = createDateTime("rconDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> rconHtSaisie = createNumber("rconHtSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> rconId = createNumber("rconId", Long.class);

    public final NumberPath<java.math.BigDecimal> rconMontantBudgetaire = createNumber("rconMontantBudgetaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> rconTtcSaisie = createNumber("rconTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> rconTvaSaisie = createNumber("rconTvaSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRecetteCtrlConvention> recetteCtrlConventionPk = createPrimaryKey(rconId);

    public QRecetteCtrlConvention(String variable) {
        super(QRecetteCtrlConvention.class, forVariable(variable), "GFC", "RECETTE_CTRL_CONVENTION");
        addMetadata();
    }

    public QRecetteCtrlConvention(String variable, String schema, String table) {
        super(QRecetteCtrlConvention.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecetteCtrlConvention(Path<? extends QRecetteCtrlConvention> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RECETTE_CTRL_CONVENTION");
        addMetadata();
    }

    public QRecetteCtrlConvention(PathMetadata metadata) {
        super(QRecetteCtrlConvention.class, metadata, "GFC", "RECETTE_CTRL_CONVENTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rconDateSaisie, ColumnMetadata.named("RCON_DATE_SAISIE").withIndex(9).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(rconHtSaisie, ColumnMetadata.named("RCON_HT_SAISIE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rconId, ColumnMetadata.named("RCON_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rconMontantBudgetaire, ColumnMetadata.named("RCON_MONTANT_BUDGETAIRE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rconTtcSaisie, ColumnMetadata.named("RCON_TTC_SAISIE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rconTvaSaisie, ColumnMetadata.named("RCON_TVA_SAISIE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


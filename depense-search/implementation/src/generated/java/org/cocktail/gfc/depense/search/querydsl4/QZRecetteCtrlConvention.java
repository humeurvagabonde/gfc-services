package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QZRecetteCtrlConvention is a Querydsl query type for QZRecetteCtrlConvention
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QZRecetteCtrlConvention extends com.querydsl.sql.RelationalPathBase<QZRecetteCtrlConvention> {

    private static final long serialVersionUID = -2138997700;

    public static final QZRecetteCtrlConvention zRecetteCtrlConvention = new QZRecetteCtrlConvention("Z_RECETTE_CTRL_CONVENTION");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final DateTimePath<java.sql.Timestamp> rconDateSaisie = createDateTime("rconDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> rconHtSaisie = createNumber("rconHtSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> rconId = createNumber("rconId", Long.class);

    public final NumberPath<java.math.BigDecimal> rconMontantBudgetaire = createNumber("rconMontantBudgetaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> rconTtcSaisie = createNumber("rconTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> rconTvaSaisie = createNumber("rconTvaSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> zrconId = createNumber("zrconId", Long.class);

    public final NumberPath<Long> zrecId = createNumber("zrecId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QZRecetteCtrlConvention> zRecetteCtrlConventionPk = createPrimaryKey(zrconId);

    public QZRecetteCtrlConvention(String variable) {
        super(QZRecetteCtrlConvention.class, forVariable(variable), "GFC", "Z_RECETTE_CTRL_CONVENTION");
        addMetadata();
    }

    public QZRecetteCtrlConvention(String variable, String schema, String table) {
        super(QZRecetteCtrlConvention.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QZRecetteCtrlConvention(Path<? extends QZRecetteCtrlConvention> path) {
        super(path.getType(), path.getMetadata(), "GFC", "Z_RECETTE_CTRL_CONVENTION");
        addMetadata();
    }

    public QZRecetteCtrlConvention(PathMetadata metadata) {
        super(QZRecetteCtrlConvention.class, metadata, "GFC", "Z_RECETTE_CTRL_CONVENTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rconDateSaisie, ColumnMetadata.named("RCON_DATE_SAISIE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(rconHtSaisie, ColumnMetadata.named("RCON_HT_SAISIE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rconId, ColumnMetadata.named("RCON_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(rconMontantBudgetaire, ColumnMetadata.named("RCON_MONTANT_BUDGETAIRE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rconTtcSaisie, ColumnMetadata.named("RCON_TTC_SAISIE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rconTvaSaisie, ColumnMetadata.named("RCON_TVA_SAISIE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zrconId, ColumnMetadata.named("ZRCON_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zrecId, ColumnMetadata.named("ZREC_ID").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


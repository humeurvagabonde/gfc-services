package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QZRecetteCtrlAnalytique is a Querydsl query type for QZRecetteCtrlAnalytique
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QZRecetteCtrlAnalytique extends com.querydsl.sql.RelationalPathBase<QZRecetteCtrlAnalytique> {

    private static final long serialVersionUID = -827512010;

    public static final QZRecetteCtrlAnalytique zRecetteCtrlAnalytique = new QZRecetteCtrlAnalytique("Z_RECETTE_CTRL_ANALYTIQUE");

    public final NumberPath<Long> canId = createNumber("canId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final DateTimePath<java.sql.Timestamp> ranaDateSaisie = createDateTime("ranaDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> ranaHtSaisie = createNumber("ranaHtSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> ranaId = createNumber("ranaId", Long.class);

    public final NumberPath<java.math.BigDecimal> ranaMontantBudgetaire = createNumber("ranaMontantBudgetaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> ranaTtcSaisie = createNumber("ranaTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> ranaTvaSaisie = createNumber("ranaTvaSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> zranaId = createNumber("zranaId", Long.class);

    public final NumberPath<Long> zrecId = createNumber("zrecId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QZRecetteCtrlAnalytique> zRecetteCtrlAnalytiquePk = createPrimaryKey(zranaId);

    public QZRecetteCtrlAnalytique(String variable) {
        super(QZRecetteCtrlAnalytique.class, forVariable(variable), "GFC", "Z_RECETTE_CTRL_ANALYTIQUE");
        addMetadata();
    }

    public QZRecetteCtrlAnalytique(String variable, String schema, String table) {
        super(QZRecetteCtrlAnalytique.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QZRecetteCtrlAnalytique(Path<? extends QZRecetteCtrlAnalytique> path) {
        super(path.getType(), path.getMetadata(), "GFC", "Z_RECETTE_CTRL_ANALYTIQUE");
        addMetadata();
    }

    public QZRecetteCtrlAnalytique(PathMetadata metadata) {
        super(QZRecetteCtrlAnalytique.class, metadata, "GFC", "Z_RECETTE_CTRL_ANALYTIQUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(canId, ColumnMetadata.named("CAN_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(ranaDateSaisie, ColumnMetadata.named("RANA_DATE_SAISIE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(ranaHtSaisie, ColumnMetadata.named("RANA_HT_SAISIE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ranaId, ColumnMetadata.named("RANA_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ranaMontantBudgetaire, ColumnMetadata.named("RANA_MONTANT_BUDGETAIRE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ranaTtcSaisie, ColumnMetadata.named("RANA_TTC_SAISIE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ranaTvaSaisie, ColumnMetadata.named("RANA_TVA_SAISIE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zranaId, ColumnMetadata.named("ZRANA_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zrecId, ColumnMetadata.named("ZREC_ID").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}

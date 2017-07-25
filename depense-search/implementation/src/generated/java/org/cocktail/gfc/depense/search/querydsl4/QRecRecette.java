package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecRecette is a Querydsl query type for QRecRecette
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecRecette extends com.querydsl.sql.RelationalPathBase<QRecRecette> {

    private static final long serialVersionUID = 1388028042;

    public static final QRecRecette recRecette = new QRecRecette("REC_RECETTE");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> facId = createNumber("facId", Long.class);

    public final DateTimePath<java.sql.Timestamp> recDateSaisie = createDateTime("recDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> recHtSaisie = createNumber("recHtSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> recIdAvanceParent = createNumber("recIdAvanceParent", Long.class);

    public final NumberPath<Long> recIdReduction = createNumber("recIdReduction", Long.class);

    public final StringPath recLib = createString("recLib");

    public final NumberPath<java.math.BigDecimal> recMontantBudgetaire = createNumber("recMontantBudgetaire", java.math.BigDecimal.class);

    public final NumberPath<Long> recNumero = createNumber("recNumero", Long.class);

    public final NumberPath<java.math.BigDecimal> recTtcSaisie = createNumber("recTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recTvaSaisie = createNumber("recTvaSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> rppId = createNumber("rppId", Long.class);

    public final NumberPath<Long> tapId = createNumber("tapId", Long.class);

    public final NumberPath<Long> titId = createNumber("titId", Long.class);

    public final NumberPath<Long> tyetCycleVie = createNumber("tyetCycleVie", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRecRecette> recRecettePk = createPrimaryKey(recId);

    public QRecRecette(String variable) {
        super(QRecRecette.class, forVariable(variable), "GFC", "REC_RECETTE");
        addMetadata();
    }

    public QRecRecette(String variable, String schema, String table) {
        super(QRecRecette.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecRecette(Path<? extends QRecRecette> path) {
        super(path.getType(), path.getMetadata(), "GFC", "REC_RECETTE");
        addMetadata();
    }

    public QRecRecette(PathMetadata metadata) {
        super(QRecRecette.class, metadata, "GFC", "REC_RECETTE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(facId, ColumnMetadata.named("FAC_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recDateSaisie, ColumnMetadata.named("REC_DATE_SAISIE").withIndex(7).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(recHtSaisie, ColumnMetadata.named("REC_HT_SAISIE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recIdAvanceParent, ColumnMetadata.named("REC_ID_AVANCE_PARENT").withIndex(17).ofType(Types.DECIMAL).withSize(0));
        addMetadata(recIdReduction, ColumnMetadata.named("REC_ID_REDUCTION").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(recLib, ColumnMetadata.named("REC_LIB").withIndex(6).ofType(Types.VARCHAR).withSize(500));
        addMetadata(recMontantBudgetaire, ColumnMetadata.named("REC_MONTANT_BUDGETAIRE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recNumero, ColumnMetadata.named("REC_NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recTtcSaisie, ColumnMetadata.named("REC_TTC_SAISIE").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recTvaSaisie, ColumnMetadata.named("REC_TVA_SAISIE").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rppId, ColumnMetadata.named("RPP_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tapId, ColumnMetadata.named("TAP_ID").withIndex(12).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(titId, ColumnMetadata.named("TIT_ID").withIndex(18).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyetCycleVie, ColumnMetadata.named("TYET_CYCLE_VIE").withIndex(16).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(13).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(14).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


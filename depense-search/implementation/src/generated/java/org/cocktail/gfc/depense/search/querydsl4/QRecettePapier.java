package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecettePapier is a Querydsl query type for QRecettePapier
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecettePapier extends com.querydsl.sql.RelationalPathBase<QRecettePapier> {

    private static final long serialVersionUID = 827678301;

    public static final QRecettePapier recettePapier = new QRecettePapier("RECETTE_PAPIER");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> morOrdre = createNumber("morOrdre", Long.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> ribOrdre = createNumber("ribOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> rppDateReception = createDateTime("rppDateReception", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> rppDateRecette = createDateTime("rppDateRecette", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> rppDateSaisie = createDateTime("rppDateSaisie", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> rppDateServiceFait = createDateTime("rppDateServiceFait", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> rppHtSaisie = createNumber("rppHtSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> rppId = createNumber("rppId", Long.class);

    public final NumberPath<Long> rppNbPiece = createNumber("rppNbPiece", Long.class);

    public final StringPath rppNumero = createString("rppNumero");

    public final NumberPath<java.math.BigDecimal> rppTtcSaisie = createNumber("rppTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> rppTvaSaisie = createNumber("rppTvaSaisie", java.math.BigDecimal.class);

    public final StringPath rppVisible = createString("rppVisible");

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRecettePapier> recettePapierPk = createPrimaryKey(rppId);

    public QRecettePapier(String variable) {
        super(QRecettePapier.class, forVariable(variable), "GFC", "RECETTE_PAPIER");
        addMetadata();
    }

    public QRecettePapier(String variable, String schema, String table) {
        super(QRecettePapier.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecettePapier(Path<? extends QRecettePapier> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RECETTE_PAPIER");
        addMetadata();
    }

    public QRecettePapier(PathMetadata metadata) {
        super(QRecettePapier.class, metadata, "GFC", "RECETTE_PAPIER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(morOrdre, ColumnMetadata.named("MOR_ORDRE").withIndex(10).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ribOrdre, ColumnMetadata.named("RIB_ORDRE").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(rppDateReception, ColumnMetadata.named("RPP_DATE_RECEPTION").withIndex(13).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(rppDateRecette, ColumnMetadata.named("RPP_DATE_RECETTE").withIndex(11).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(rppDateSaisie, ColumnMetadata.named("RPP_DATE_SAISIE").withIndex(12).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(rppDateServiceFait, ColumnMetadata.named("RPP_DATE_SERVICE_FAIT").withIndex(14).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(rppHtSaisie, ColumnMetadata.named("RPP_HT_SAISIE").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rppId, ColumnMetadata.named("RPP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rppNbPiece, ColumnMetadata.named("RPP_NB_PIECE").withIndex(15).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rppNumero, ColumnMetadata.named("RPP_NUMERO").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(rppTtcSaisie, ColumnMetadata.named("RPP_TTC_SAISIE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rppTvaSaisie, ColumnMetadata.named("RPP_TVA_SAISIE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rppVisible, ColumnMetadata.named("RPP_VISIBLE").withIndex(17).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(16).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QZRecettePapier is a Querydsl query type for QZRecettePapier
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QZRecettePapier extends com.querydsl.sql.RelationalPathBase<QZRecettePapier> {

    private static final long serialVersionUID = 957970903;

    public static final QZRecettePapier zRecettePapier = new QZRecettePapier("Z_RECETTE_PAPIER");

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

    public final DateTimePath<java.sql.Timestamp> zrppDate = createDateTime("zrppDate", java.sql.Timestamp.class);

    public final NumberPath<Long> zrppId = createNumber("zrppId", Long.class);

    public final NumberPath<Long> zrppUtlOrdre = createNumber("zrppUtlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QZRecettePapier> zRecettePapierPk = createPrimaryKey(zrppId);

    public QZRecettePapier(String variable) {
        super(QZRecettePapier.class, forVariable(variable), "GFC", "Z_RECETTE_PAPIER");
        addMetadata();
    }

    public QZRecettePapier(String variable, String schema, String table) {
        super(QZRecettePapier.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QZRecettePapier(Path<? extends QZRecettePapier> path) {
        super(path.getType(), path.getMetadata(), "GFC", "Z_RECETTE_PAPIER");
        addMetadata();
    }

    public QZRecettePapier(PathMetadata metadata) {
        super(QZRecettePapier.class, metadata, "GFC", "Z_RECETTE_PAPIER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(morOrdre, ColumnMetadata.named("MOR_ORDRE").withIndex(13).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ribOrdre, ColumnMetadata.named("RIB_ORDRE").withIndex(12).ofType(Types.DECIMAL).withSize(0));
        addMetadata(rppDateReception, ColumnMetadata.named("RPP_DATE_RECEPTION").withIndex(16).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(rppDateRecette, ColumnMetadata.named("RPP_DATE_RECETTE").withIndex(14).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(rppDateSaisie, ColumnMetadata.named("RPP_DATE_SAISIE").withIndex(15).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(rppDateServiceFait, ColumnMetadata.named("RPP_DATE_SERVICE_FAIT").withIndex(17).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(rppHtSaisie, ColumnMetadata.named("RPP_HT_SAISIE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rppId, ColumnMetadata.named("RPP_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rppNbPiece, ColumnMetadata.named("RPP_NB_PIECE").withIndex(18).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rppNumero, ColumnMetadata.named("RPP_NUMERO").withIndex(6).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(rppTtcSaisie, ColumnMetadata.named("RPP_TTC_SAISIE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rppTvaSaisie, ColumnMetadata.named("RPP_TVA_SAISIE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rppVisible, ColumnMetadata.named("RPP_VISIBLE").withIndex(20).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(19).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zrppDate, ColumnMetadata.named("ZRPP_DATE").withIndex(2).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(zrppId, ColumnMetadata.named("ZRPP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zrppUtlOrdre, ColumnMetadata.named("ZRPP_UTL_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


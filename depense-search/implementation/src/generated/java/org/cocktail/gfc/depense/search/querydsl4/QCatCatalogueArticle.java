package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCatCatalogueArticle is a Querydsl query type for QCatCatalogueArticle
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCatCatalogueArticle extends com.querydsl.sql.RelationalPathBase<QCatCatalogueArticle> {

    private static final long serialVersionUID = -1041923015;

    public static final QCatCatalogueArticle catCatalogueArticle = new QCatCatalogueArticle("CAT_CATALOGUE_ARTICLE");

    public final NumberPath<Long> artId = createNumber("artId", Long.class);

    public final NumberPath<Long> caarDocId = createNumber("caarDocId", Long.class);

    public final StringPath caarDocReference = createString("caarDocReference");

    public final NumberPath<Long> caarId = createNumber("caarId", Long.class);

    public final NumberPath<java.math.BigDecimal> caarPrixHt = createNumber("caarPrixHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caarPrixTtc = createNumber("caarPrixTtc", java.math.BigDecimal.class);

    public final StringPath caarReference = createString("caarReference");

    public final NumberPath<Long> catId = createNumber("catId", Long.class);

    public final NumberPath<Long> tvaId = createNumber("tvaId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCatCatalogueArticle> catCatalogueArticlePk = createPrimaryKey(caarId);

    public QCatCatalogueArticle(String variable) {
        super(QCatCatalogueArticle.class, forVariable(variable), "GFC", "CAT_CATALOGUE_ARTICLE");
        addMetadata();
    }

    public QCatCatalogueArticle(String variable, String schema, String table) {
        super(QCatCatalogueArticle.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCatCatalogueArticle(Path<? extends QCatCatalogueArticle> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CAT_CATALOGUE_ARTICLE");
        addMetadata();
    }

    public QCatCatalogueArticle(PathMetadata metadata) {
        super(QCatCatalogueArticle.class, metadata, "GFC", "CAT_CATALOGUE_ARTICLE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artId, ColumnMetadata.named("ART_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(caarDocId, ColumnMetadata.named("CAAR_DOC_ID").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(caarDocReference, ColumnMetadata.named("CAAR_DOC_REFERENCE").withIndex(10).ofType(Types.VARCHAR).withSize(500));
        addMetadata(caarId, ColumnMetadata.named("CAAR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(caarPrixHt, ColumnMetadata.named("CAAR_PRIX_HT").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(caarPrixTtc, ColumnMetadata.named("CAAR_PRIX_TTC").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(caarReference, ColumnMetadata.named("CAAR_REFERENCE").withIndex(4).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tvaId, ColumnMetadata.named("TVA_ID").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


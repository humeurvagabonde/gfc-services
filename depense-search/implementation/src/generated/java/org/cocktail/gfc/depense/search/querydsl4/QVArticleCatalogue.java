package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVArticleCatalogue is a Querydsl query type for QVArticleCatalogue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVArticleCatalogue extends com.querydsl.sql.RelationalPathBase<QVArticleCatalogue> {

    private static final long serialVersionUID = -584638945;

    public static final QVArticleCatalogue vArticleCatalogue = new QVArticleCatalogue("V_ARTICLE_CATALOGUE");

    public final NumberPath<Long> artcId = createNumber("artcId", Long.class);

    public final NumberPath<Long> artcIdPere = createNumber("artcIdPere", Long.class);

    public final StringPath artcLibelle = createString("artcLibelle");

    public final NumberPath<java.math.BigDecimal> artcPrixHt = createNumber("artcPrixHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> artcPrixTtc = createNumber("artcPrixTtc", java.math.BigDecimal.class);

    public final StringPath artcReference = createString("artcReference");

    public final StringPath catLibelle = createString("catLibelle");

    public final NumberPath<Long> cmOrdre = createNumber("cmOrdre", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> tvaId = createNumber("tvaId", Long.class);

    public final NumberPath<Long> tyarId = createNumber("tyarId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public QVArticleCatalogue(String variable) {
        super(QVArticleCatalogue.class, forVariable(variable), "GFC", "V_ARTICLE_CATALOGUE");
        addMetadata();
    }

    public QVArticleCatalogue(String variable, String schema, String table) {
        super(QVArticleCatalogue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVArticleCatalogue(Path<? extends QVArticleCatalogue> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ARTICLE_CATALOGUE");
        addMetadata();
    }

    public QVArticleCatalogue(PathMetadata metadata) {
        super(QVArticleCatalogue.class, metadata, "GFC", "V_ARTICLE_CATALOGUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artcId, ColumnMetadata.named("ARTC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(artcIdPere, ColumnMetadata.named("ARTC_ID_PERE").withIndex(11).ofType(Types.DECIMAL).withSize(0));
        addMetadata(artcLibelle, ColumnMetadata.named("ARTC_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(artcPrixHt, ColumnMetadata.named("ARTC_PRIX_HT").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(artcPrixTtc, ColumnMetadata.named("ARTC_PRIX_TTC").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(artcReference, ColumnMetadata.named("ARTC_REFERENCE").withIndex(6).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(catLibelle, ColumnMetadata.named("CAT_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(cmOrdre, ColumnMetadata.named("CM_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tvaId, ColumnMetadata.named("TVA_ID").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyarId, ColumnMetadata.named("TYAR_ID").withIndex(12).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


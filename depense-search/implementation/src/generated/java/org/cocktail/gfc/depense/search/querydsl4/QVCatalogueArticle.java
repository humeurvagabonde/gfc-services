package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCatalogueArticle is a Querydsl query type for QVCatalogueArticle
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCatalogueArticle extends com.querydsl.sql.RelationalPathBase<QVCatalogueArticle> {

    private static final long serialVersionUID = 1234520665;

    public static final QVCatalogueArticle vCatalogueArticle = new QVCatalogueArticle("V_CATALOGUE_ARTICLE");

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Long> caarId = createNumber("caarId", Long.class);

    public final NumberPath<Long> caarIdPere = createNumber("caarIdPere", Long.class);

    public final StringPath caarLibelle = createString("caarLibelle");

    public final NumberPath<java.math.BigDecimal> caarPrixHt = createNumber("caarPrixHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caarPrixTtc = createNumber("caarPrixTtc", java.math.BigDecimal.class);

    public final StringPath caarReference = createString("caarReference");

    public final DateTimePath<java.sql.Timestamp> catDateDebut = createDateTime("catDateDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> catDateFin = createDateTime("catDateFin", java.sql.Timestamp.class);

    public final NumberPath<Long> catId = createNumber("catId", Long.class);

    public final StringPath catLibelle = createString("catLibelle");

    public final NumberPath<Long> cmOrdre = createNumber("cmOrdre", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> tvaId = createNumber("tvaId", Long.class);

    public final NumberPath<Long> tyapId = createNumber("tyapId", Long.class);

    public final NumberPath<Long> tyarId = createNumber("tyarId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public QVCatalogueArticle(String variable) {
        super(QVCatalogueArticle.class, forVariable(variable), "GFC", "V_CATALOGUE_ARTICLE");
        addMetadata();
    }

    public QVCatalogueArticle(String variable, String schema, String table) {
        super(QVCatalogueArticle.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCatalogueArticle(Path<? extends QVCatalogueArticle> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CATALOGUE_ARTICLE");
        addMetadata();
    }

    public QVCatalogueArticle(PathMetadata metadata) {
        super(QVCatalogueArticle.class, metadata, "GFC", "V_CATALOGUE_ARTICLE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(caarId, ColumnMetadata.named("CAAR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(caarIdPere, ColumnMetadata.named("CAAR_ID_PERE").withIndex(12).ofType(Types.DECIMAL).withSize(0));
        addMetadata(caarLibelle, ColumnMetadata.named("CAAR_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(caarPrixHt, ColumnMetadata.named("CAAR_PRIX_HT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(caarPrixTtc, ColumnMetadata.named("CAAR_PRIX_TTC").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(caarReference, ColumnMetadata.named("CAAR_REFERENCE").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(catDateDebut, ColumnMetadata.named("CAT_DATE_DEBUT").withIndex(15).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(catDateFin, ColumnMetadata.named("CAT_DATE_FIN").withIndex(16).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(catLibelle, ColumnMetadata.named("CAT_LIBELLE").withIndex(6).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(cmOrdre, ColumnMetadata.named("CM_ORDRE").withIndex(10).ofType(Types.DECIMAL).withSize(0));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(14).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tvaId, ColumnMetadata.named("TVA_ID").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyapId, ColumnMetadata.named("TYAP_ID").withIndex(17).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyarId, ColumnMetadata.named("TYAR_ID").withIndex(13).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(11).ofType(Types.DECIMAL).withSize(0));
    }

}


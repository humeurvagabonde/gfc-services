package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCatImportArticle is a Querydsl query type for QCatImportArticle
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCatImportArticle extends com.querydsl.sql.RelationalPathBase<QCatImportArticle> {

    private static final long serialVersionUID = 167829797;

    public static final QCatImportArticle catImportArticle = new QCatImportArticle("CAT_IMPORT_ARTICLE");

    public final NumberPath<Long> artmGarantie = createNumber("artmGarantie", Long.class);

    public final NumberPath<Long> artmLivraison = createNumber("artmLivraison", Long.class);

    public final NumberPath<Long> artmQteControle = createNumber("artmQteControle", Long.class);

    public final NumberPath<Long> artmQteDispo = createNumber("artmQteDispo", Long.class);

    public final NumberPath<Long> artmQteUnite = createNumber("artmQteUnite", Long.class);

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Long> cmOrdre = createNumber("cmOrdre", Long.class);

    public final NumberPath<Long> devId = createNumber("devId", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> impId = createNumber("impId", Long.class);

    public final NumberPath<Long> impIdPere = createNumber("impIdPere", Long.class);

    public final StringPath impLibelle = createString("impLibelle");

    public final NumberPath<java.math.BigDecimal> impPrixHt = createNumber("impPrixHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> impPrixTtc = createNumber("impPrixTtc", java.math.BigDecimal.class);

    public final StringPath impReference = createString("impReference");

    public final NumberPath<Long> tvaId = createNumber("tvaId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCatImportArticle> catImportArticlePk = createPrimaryKey(impId);

    public QCatImportArticle(String variable) {
        super(QCatImportArticle.class, forVariable(variable), "GFC", "CAT_IMPORT_ARTICLE");
        addMetadata();
    }

    public QCatImportArticle(String variable, String schema, String table) {
        super(QCatImportArticle.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCatImportArticle(Path<? extends QCatImportArticle> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CAT_IMPORT_ARTICLE");
        addMetadata();
    }

    public QCatImportArticle(PathMetadata metadata) {
        super(QCatImportArticle.class, metadata, "GFC", "CAT_IMPORT_ARTICLE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artmGarantie, ColumnMetadata.named("ARTM_GARANTIE").withIndex(11).ofType(Types.DECIMAL).withSize(0));
        addMetadata(artmLivraison, ColumnMetadata.named("ARTM_LIVRAISON").withIndex(12).ofType(Types.DECIMAL).withSize(0));
        addMetadata(artmQteControle, ColumnMetadata.named("ARTM_QTE_CONTROLE").withIndex(16).ofType(Types.DECIMAL).withSize(0));
        addMetadata(artmQteDispo, ColumnMetadata.named("ARTM_QTE_DISPO").withIndex(13).ofType(Types.DECIMAL).withSize(0));
        addMetadata(artmQteUnite, ColumnMetadata.named("ARTM_QTE_UNITE").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(cmOrdre, ColumnMetadata.named("CM_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(devId, ColumnMetadata.named("DEV_ID").withIndex(14).ofType(Types.DECIMAL).withSize(0));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(impId, ColumnMetadata.named("IMP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(impIdPere, ColumnMetadata.named("IMP_ID_PERE").withIndex(10).ofType(Types.DECIMAL).withSize(0));
        addMetadata(impLibelle, ColumnMetadata.named("IMP_LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(impPrixHt, ColumnMetadata.named("IMP_PRIX_HT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(impPrixTtc, ColumnMetadata.named("IMP_PRIX_TTC").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(impReference, ColumnMetadata.named("IMP_REFERENCE").withIndex(4).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(tvaId, ColumnMetadata.named("TVA_ID").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


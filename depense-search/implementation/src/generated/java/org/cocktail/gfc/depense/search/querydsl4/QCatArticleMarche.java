package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCatArticleMarche is a Querydsl query type for QCatArticleMarche
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCatArticleMarche extends com.querydsl.sql.RelationalPathBase<QCatArticleMarche> {

    private static final long serialVersionUID = -1755020628;

    public static final QCatArticleMarche catArticleMarche = new QCatArticleMarche("CAT_ARTICLE_MARCHE");

    public final NumberPath<Long> artId = createNumber("artId", Long.class);

    public final NumberPath<Long> artmGarantie = createNumber("artmGarantie", Long.class);

    public final NumberPath<Long> artmId = createNumber("artmId", Long.class);

    public final NumberPath<Long> artmLivraison = createNumber("artmLivraison", Long.class);

    public final NumberPath<Long> artmQteControle = createNumber("artmQteControle", Long.class);

    public final NumberPath<Long> artmQteDispo = createNumber("artmQteDispo", Long.class);

    public final NumberPath<Long> artmQteUnite = createNumber("artmQteUnite", Long.class);

    public final NumberPath<Long> devId = createNumber("devId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCatArticleMarche> catArticleMarchePk = createPrimaryKey(artmId);

    public QCatArticleMarche(String variable) {
        super(QCatArticleMarche.class, forVariable(variable), "GFC", "CAT_ARTICLE_MARCHE");
        addMetadata();
    }

    public QCatArticleMarche(String variable, String schema, String table) {
        super(QCatArticleMarche.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCatArticleMarche(Path<? extends QCatArticleMarche> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CAT_ARTICLE_MARCHE");
        addMetadata();
    }

    public QCatArticleMarche(PathMetadata metadata) {
        super(QCatArticleMarche.class, metadata, "GFC", "CAT_ARTICLE_MARCHE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artId, ColumnMetadata.named("ART_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(artmGarantie, ColumnMetadata.named("ARTM_GARANTIE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(artmId, ColumnMetadata.named("ARTM_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(artmLivraison, ColumnMetadata.named("ARTM_LIVRAISON").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(artmQteControle, ColumnMetadata.named("ARTM_QTE_CONTROLE").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(artmQteDispo, ColumnMetadata.named("ARTM_QTE_DISPO").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(artmQteUnite, ColumnMetadata.named("ARTM_QTE_UNITE").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(devId, ColumnMetadata.named("DEV_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0));
    }

}


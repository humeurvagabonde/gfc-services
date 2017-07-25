package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QArticlePrestationWeb is a Querydsl query type for QArticlePrestationWeb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QArticlePrestationWeb extends com.querydsl.sql.RelationalPathBase<QArticlePrestationWeb> {

    private static final long serialVersionUID = -1162162729;

    public static final QArticlePrestationWeb articlePrestationWeb = new QArticlePrestationWeb("ARTICLE_PRESTATION_WEB");

    public final StringPath artCle = createString("artCle");

    public final StringPath artCommantaire = createString("artCommantaire");

    public final NumberPath<Long> artId = createNumber("artId", Long.class);

    public final NumberPath<Long> artPwebId = createNumber("artPwebId", Long.class);

    public final StringPath artValeur = createString("artValeur");

    public final com.querydsl.sql.PrimaryKey<QArticlePrestationWeb> articlePrestationWebPk = createPrimaryKey(artPwebId);

    public QArticlePrestationWeb(String variable) {
        super(QArticlePrestationWeb.class, forVariable(variable), "GFC", "ARTICLE_PRESTATION_WEB");
        addMetadata();
    }

    public QArticlePrestationWeb(String variable, String schema, String table) {
        super(QArticlePrestationWeb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QArticlePrestationWeb(Path<? extends QArticlePrestationWeb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ARTICLE_PRESTATION_WEB");
        addMetadata();
    }

    public QArticlePrestationWeb(PathMetadata metadata) {
        super(QArticlePrestationWeb.class, metadata, "GFC", "ARTICLE_PRESTATION_WEB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artCle, ColumnMetadata.named("ART_CLE").withIndex(3).ofType(Types.VARCHAR).withSize(200));
        addMetadata(artCommantaire, ColumnMetadata.named("ART_COMMANTAIRE").withIndex(5).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(artId, ColumnMetadata.named("ART_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(artPwebId, ColumnMetadata.named("ART_PWEB_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(artValeur, ColumnMetadata.named("ART_VALEUR").withIndex(4).ofType(Types.VARCHAR).withSize(4000));
    }

}


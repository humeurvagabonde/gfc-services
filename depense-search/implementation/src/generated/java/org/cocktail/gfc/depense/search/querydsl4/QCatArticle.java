package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCatArticle is a Querydsl query type for QCatArticle
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCatArticle extends com.querydsl.sql.RelationalPathBase<QCatArticle> {

    private static final long serialVersionUID = 723939210;

    public static final QCatArticle catArticle = new QCatArticle("CAT_ARTICLE");

    public final NumberPath<Long> artId = createNumber("artId", Long.class);

    public final NumberPath<Long> artIdPere = createNumber("artIdPere", Long.class);

    public final StringPath artLibelle = createString("artLibelle");

    public final NumberPath<Long> cmOrdre = createNumber("cmOrdre", Long.class);

    public final NumberPath<Long> tyarId = createNumber("tyarId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCatArticle> catArticlePk = createPrimaryKey(artId);

    public QCatArticle(String variable) {
        super(QCatArticle.class, forVariable(variable), "GFC", "CAT_ARTICLE");
        addMetadata();
    }

    public QCatArticle(String variable, String schema, String table) {
        super(QCatArticle.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCatArticle(Path<? extends QCatArticle> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CAT_ARTICLE");
        addMetadata();
    }

    public QCatArticle(PathMetadata metadata) {
        super(QCatArticle.class, metadata, "GFC", "CAT_ARTICLE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artId, ColumnMetadata.named("ART_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(artIdPere, ColumnMetadata.named("ART_ID_PERE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(artLibelle, ColumnMetadata.named("ART_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(cmOrdre, ColumnMetadata.named("CM_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyarId, ColumnMetadata.named("TYAR_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


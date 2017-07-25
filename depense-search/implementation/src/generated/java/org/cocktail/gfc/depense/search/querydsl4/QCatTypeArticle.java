package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCatTypeArticle is a Querydsl query type for QCatTypeArticle
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCatTypeArticle extends com.querydsl.sql.RelationalPathBase<QCatTypeArticle> {

    private static final long serialVersionUID = 453138672;

    public static final QCatTypeArticle catTypeArticle = new QCatTypeArticle("CAT_TYPE_ARTICLE");

    public final NumberPath<Long> tyarId = createNumber("tyarId", Long.class);

    public final StringPath tyarLibelle = createString("tyarLibelle");

    public final com.querydsl.sql.PrimaryKey<QCatTypeArticle> catTypeArticlePk = createPrimaryKey(tyarId);

    public QCatTypeArticle(String variable) {
        super(QCatTypeArticle.class, forVariable(variable), "GFC", "CAT_TYPE_ARTICLE");
        addMetadata();
    }

    public QCatTypeArticle(String variable, String schema, String table) {
        super(QCatTypeArticle.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCatTypeArticle(Path<? extends QCatTypeArticle> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CAT_TYPE_ARTICLE");
        addMetadata();
    }

    public QCatTypeArticle(PathMetadata metadata) {
        super(QCatTypeArticle.class, metadata, "GFC", "CAT_TYPE_ARTICLE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tyarId, ColumnMetadata.named("TYAR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyarLibelle, ColumnMetadata.named("TYAR_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


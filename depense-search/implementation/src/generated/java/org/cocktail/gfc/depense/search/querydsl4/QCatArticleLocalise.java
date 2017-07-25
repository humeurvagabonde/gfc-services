package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCatArticleLocalise is a Querydsl query type for QCatArticleLocalise
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCatArticleLocalise extends com.querydsl.sql.RelationalPathBase<QCatArticleLocalise> {

    private static final long serialVersionUID = -1286494502;

    public static final QCatArticleLocalise catArticleLocalise = new QCatArticleLocalise("CAT_ARTICLE_LOCALISE");

    public final StringPath artDescription = createString("artDescription");

    public final NumberPath<Long> artId = createNumber("artId", Long.class);

    public final StringPath artLibelle = createString("artLibelle");

    public final StringPath artReference = createString("artReference");

    public final StringPath cLangue = createString("cLangue");

    public final com.querydsl.sql.PrimaryKey<QCatArticleLocalise> catArticleLocalisePk = createPrimaryKey(artId, cLangue);

    public QCatArticleLocalise(String variable) {
        super(QCatArticleLocalise.class, forVariable(variable), "GFC", "CAT_ARTICLE_LOCALISE");
        addMetadata();
    }

    public QCatArticleLocalise(String variable, String schema, String table) {
        super(QCatArticleLocalise.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCatArticleLocalise(Path<? extends QCatArticleLocalise> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CAT_ARTICLE_LOCALISE");
        addMetadata();
    }

    public QCatArticleLocalise(PathMetadata metadata) {
        super(QCatArticleLocalise.class, metadata, "GFC", "CAT_ARTICLE_LOCALISE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artDescription, ColumnMetadata.named("ART_DESCRIPTION").withIndex(5).ofType(Types.VARCHAR).withSize(500));
        addMetadata(artId, ColumnMetadata.named("ART_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(artLibelle, ColumnMetadata.named("ART_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(artReference, ColumnMetadata.named("ART_REFERENCE").withIndex(4).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(cLangue, ColumnMetadata.named("C_LANGUE").withIndex(2).ofType(Types.VARCHAR).withSize(2).notNull());
    }

}


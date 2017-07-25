package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCatCatalogueLocalise is a Querydsl query type for QCatCatalogueLocalise
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCatCatalogueLocalise extends com.querydsl.sql.RelationalPathBase<QCatCatalogueLocalise> {

    private static final long serialVersionUID = 894840397;

    public static final QCatCatalogueLocalise catCatalogueLocalise = new QCatCatalogueLocalise("CAT_CATALOGUE_LOCALISE");

    public final StringPath catCommentaire = createString("catCommentaire");

    public final NumberPath<Long> catId = createNumber("catId", Long.class);

    public final StringPath catLibelle = createString("catLibelle");

    public final StringPath cLangue = createString("cLangue");

    public final com.querydsl.sql.PrimaryKey<QCatCatalogueLocalise> catCatalogueLocalisePk = createPrimaryKey(catId, cLangue);

    public QCatCatalogueLocalise(String variable) {
        super(QCatCatalogueLocalise.class, forVariable(variable), "GFC", "CAT_CATALOGUE_LOCALISE");
        addMetadata();
    }

    public QCatCatalogueLocalise(String variable, String schema, String table) {
        super(QCatCatalogueLocalise.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCatCatalogueLocalise(Path<? extends QCatCatalogueLocalise> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CAT_CATALOGUE_LOCALISE");
        addMetadata();
    }

    public QCatCatalogueLocalise(PathMetadata metadata) {
        super(QCatCatalogueLocalise.class, metadata, "GFC", "CAT_CATALOGUE_LOCALISE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(catCommentaire, ColumnMetadata.named("CAT_COMMENTAIRE").withIndex(4).ofType(Types.VARCHAR).withSize(500));
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(catLibelle, ColumnMetadata.named("CAT_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(cLangue, ColumnMetadata.named("C_LANGUE").withIndex(2).ofType(Types.VARCHAR).withSize(2).notNull());
    }

}


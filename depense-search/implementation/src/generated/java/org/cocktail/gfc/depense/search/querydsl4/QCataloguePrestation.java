package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCataloguePrestation is a Querydsl query type for QCataloguePrestation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCataloguePrestation extends com.querydsl.sql.RelationalPathBase<QCataloguePrestation> {

    private static final long serialVersionUID = 1466713712;

    public static final QCataloguePrestation cataloguePrestation = new QCataloguePrestation("CATALOGUE_PRESTATION");

    public final DateTimePath<java.sql.Timestamp> catDateVote = createDateTime("catDateVote", java.sql.Timestamp.class);

    public final NumberPath<Long> catId = createNumber("catId", Long.class);

    public final NumberPath<Long> catNumero = createNumber("catNumero", Long.class);

    public final StringPath catPublieWeb = createString("catPublieWeb");

    public final NumberPath<Long> lolfIdRecette = createNumber("lolfIdRecette", Long.class);

    public final NumberPath<Long> orgIdRecette = createNumber("orgIdRecette", Long.class);

    public final StringPath pcoNumRecette = createString("pcoNumRecette");

    public final com.querydsl.sql.PrimaryKey<QCataloguePrestation> cataloguePrestationPk = createPrimaryKey(catId);

    public QCataloguePrestation(String variable) {
        super(QCataloguePrestation.class, forVariable(variable), "GFC", "CATALOGUE_PRESTATION");
        addMetadata();
    }

    public QCataloguePrestation(String variable, String schema, String table) {
        super(QCataloguePrestation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCataloguePrestation(Path<? extends QCataloguePrestation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CATALOGUE_PRESTATION");
        addMetadata();
    }

    public QCataloguePrestation(PathMetadata metadata) {
        super(QCataloguePrestation.class, metadata, "GFC", "CATALOGUE_PRESTATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(catDateVote, ColumnMetadata.named("CAT_DATE_VOTE").withIndex(3).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(catNumero, ColumnMetadata.named("CAT_NUMERO").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(catPublieWeb, ColumnMetadata.named("CAT_PUBLIE_WEB").withIndex(4).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(lolfIdRecette, ColumnMetadata.named("LOLF_ID_RECETTE").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(orgIdRecette, ColumnMetadata.named("ORG_ID_RECETTE").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(pcoNumRecette, ColumnMetadata.named("PCO_NUM_RECETTE").withIndex(7).ofType(Types.VARCHAR).withSize(20));
    }

}


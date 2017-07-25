package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCatalogueResponsable is a Querydsl query type for QCatalogueResponsable
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCatalogueResponsable extends com.querydsl.sql.RelationalPathBase<QCatalogueResponsable> {

    private static final long serialVersionUID = 1239656095;

    public static final QCatalogueResponsable catalogueResponsable = new QCatalogueResponsable("CATALOGUE_RESPONSABLE");

    public final NumberPath<Long> carId = createNumber("carId", Long.class);

    public final NumberPath<Long> catId = createNumber("catId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCatalogueResponsable> catalogueResponsablePk = createPrimaryKey(carId);

    public QCatalogueResponsable(String variable) {
        super(QCatalogueResponsable.class, forVariable(variable), "GFC", "CATALOGUE_RESPONSABLE");
        addMetadata();
    }

    public QCatalogueResponsable(String variable, String schema, String table) {
        super(QCatalogueResponsable.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCatalogueResponsable(Path<? extends QCatalogueResponsable> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CATALOGUE_RESPONSABLE");
        addMetadata();
    }

    public QCatalogueResponsable(PathMetadata metadata) {
        super(QCatalogueResponsable.class, metadata, "GFC", "CATALOGUE_RESPONSABLE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(carId, ColumnMetadata.named("CAR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


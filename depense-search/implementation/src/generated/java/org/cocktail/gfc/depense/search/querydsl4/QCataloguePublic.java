package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCataloguePublic is a Querydsl query type for QCataloguePublic
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCataloguePublic extends com.querydsl.sql.RelationalPathBase<QCataloguePublic> {

    private static final long serialVersionUID = 2067189544;

    public static final QCataloguePublic cataloguePublic = new QCataloguePublic("CATALOGUE_PUBLIC");

    public final NumberPath<Long> capId = createNumber("capId", Long.class);

    public final NumberPath<java.math.BigDecimal> capPourcentage = createNumber("capPourcentage", java.math.BigDecimal.class);

    public final NumberPath<Long> catId = createNumber("catId", Long.class);

    public final NumberPath<Long> typuId = createNumber("typuId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCataloguePublic> cataloguePublicPk = createPrimaryKey(capId);

    public QCataloguePublic(String variable) {
        super(QCataloguePublic.class, forVariable(variable), "GFC", "CATALOGUE_PUBLIC");
        addMetadata();
    }

    public QCataloguePublic(String variable, String schema, String table) {
        super(QCataloguePublic.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCataloguePublic(Path<? extends QCataloguePublic> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CATALOGUE_PUBLIC");
        addMetadata();
    }

    public QCataloguePublic(PathMetadata metadata) {
        super(QCataloguePublic.class, metadata, "GFC", "CATALOGUE_PUBLIC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(capId, ColumnMetadata.named("CAP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(capPourcentage, ColumnMetadata.named("CAP_POURCENTAGE").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(typuId, ColumnMetadata.named("TYPU_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


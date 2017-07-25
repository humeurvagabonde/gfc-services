package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAttributionCatalogue is a Querydsl query type for QAttributionCatalogue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAttributionCatalogue extends com.querydsl.sql.RelationalPathBase<QAttributionCatalogue> {

    private static final long serialVersionUID = -226341516;

    public static final QAttributionCatalogue attributionCatalogue = new QAttributionCatalogue("ATTRIBUTION_CATALOGUE");

    public final NumberPath<Long> attcId = createNumber("attcId", Long.class);

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Long> catId = createNumber("catId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAttributionCatalogue> attributionCataloguePk = createPrimaryKey(attOrdre, catId);

    public QAttributionCatalogue(String variable) {
        super(QAttributionCatalogue.class, forVariable(variable), "GFC", "ATTRIBUTION_CATALOGUE");
        addMetadata();
    }

    public QAttributionCatalogue(String variable, String schema, String table) {
        super(QAttributionCatalogue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAttributionCatalogue(Path<? extends QAttributionCatalogue> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ATTRIBUTION_CATALOGUE");
        addMetadata();
    }

    public QAttributionCatalogue(PathMetadata metadata) {
        super(QAttributionCatalogue.class, metadata, "GFC", "ATTRIBUTION_CATALOGUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attcId, ColumnMetadata.named("ATTC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


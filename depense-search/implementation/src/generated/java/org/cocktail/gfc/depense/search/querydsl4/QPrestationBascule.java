package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPrestationBascule is a Querydsl query type for QPrestationBascule
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPrestationBascule extends com.querydsl.sql.RelationalPathBase<QPrestationBascule> {

    private static final long serialVersionUID = -902383996;

    public static final QPrestationBascule prestationBascule = new QPrestationBascule("PRESTATION_BASCULE");

    public final NumberPath<Long> presbId = createNumber("presbId", Long.class);

    public final NumberPath<Long> prestIdDestination = createNumber("prestIdDestination", Long.class);

    public final NumberPath<Long> prestIdOrigine = createNumber("prestIdOrigine", Long.class);

    public final com.querydsl.sql.PrimaryKey<QPrestationBascule> prestationBasculePk = createPrimaryKey(presbId);

    public QPrestationBascule(String variable) {
        super(QPrestationBascule.class, forVariable(variable), "GFC", "PRESTATION_BASCULE");
        addMetadata();
    }

    public QPrestationBascule(String variable, String schema, String table) {
        super(QPrestationBascule.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPrestationBascule(Path<? extends QPrestationBascule> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PRESTATION_BASCULE");
        addMetadata();
    }

    public QPrestationBascule(PathMetadata metadata) {
        super(QPrestationBascule.class, metadata, "GFC", "PRESTATION_BASCULE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(presbId, ColumnMetadata.named("PRESB_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prestIdDestination, ColumnMetadata.named("PREST_ID_DESTINATION").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prestIdOrigine, ColumnMetadata.named("PREST_ID_ORIGINE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


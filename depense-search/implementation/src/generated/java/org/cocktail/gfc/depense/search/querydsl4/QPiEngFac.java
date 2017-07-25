package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPiEngFac is a Querydsl query type for QPiEngFac
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPiEngFac extends com.querydsl.sql.RelationalPathBase<QPiEngFac> {

    private static final long serialVersionUID = 1454080621;

    public static final QPiEngFac piEngFac = new QPiEngFac("PI_ENG_FAC");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final NumberPath<Long> engId = createNumber("engId", Long.class);

    public final NumberPath<Long> facId = createNumber("facId", Long.class);

    public final NumberPath<Long> pefId = createNumber("pefId", Long.class);

    public final NumberPath<Long> prestId = createNumber("prestId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QPiEngFac> piEngFacPk = createPrimaryKey(pefId);

    public QPiEngFac(String variable) {
        super(QPiEngFac.class, forVariable(variable), "GFC", "PI_ENG_FAC");
        addMetadata();
    }

    public QPiEngFac(String variable, String schema, String table) {
        super(QPiEngFac.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPiEngFac(Path<? extends QPiEngFac> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PI_ENG_FAC");
        addMetadata();
    }

    public QPiEngFac(PathMetadata metadata) {
        super(QPiEngFac.class, metadata, "GFC", "PI_ENG_FAC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(engId, ColumnMetadata.named("ENG_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(facId, ColumnMetadata.named("FAC_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pefId, ColumnMetadata.named("PEF_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prestId, ColumnMetadata.named("PREST_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


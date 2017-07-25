package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPiDepRec is a Querydsl query type for QPiDepRec
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPiDepRec extends com.querydsl.sql.RelationalPathBase<QPiDepRec> {

    private static final long serialVersionUID = 1417419556;

    public static final QPiDepRec piDepRec = new QPiDepRec("PI_DEP_REC");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final NumberPath<Long> depId = createNumber("depId", Long.class);

    public final NumberPath<Long> pdrId = createNumber("pdrId", Long.class);

    public final NumberPath<Long> pefId = createNumber("pefId", Long.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QPiDepRec> piDepRecPk = createPrimaryKey(pdrId);

    public QPiDepRec(String variable) {
        super(QPiDepRec.class, forVariable(variable), "GFC", "PI_DEP_REC");
        addMetadata();
    }

    public QPiDepRec(String variable, String schema, String table) {
        super(QPiDepRec.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPiDepRec(Path<? extends QPiDepRec> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PI_DEP_REC");
        addMetadata();
    }

    public QPiDepRec(PathMetadata metadata) {
        super(QPiDepRec.class, metadata, "GFC", "PI_DEP_REC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(depId, ColumnMetadata.named("DEP_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pdrId, ColumnMetadata.named("PDR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pefId, ColumnMetadata.named("PEF_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


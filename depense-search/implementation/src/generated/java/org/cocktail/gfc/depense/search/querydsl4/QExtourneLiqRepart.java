package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QExtourneLiqRepart is a Querydsl query type for QExtourneLiqRepart
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QExtourneLiqRepart extends com.querydsl.sql.RelationalPathBase<QExtourneLiqRepart> {

    private static final long serialVersionUID = -894306450;

    public static final QExtourneLiqRepart extourneLiqRepart = new QExtourneLiqRepart("EXTOURNE_LIQ_REPART");

    public final NumberPath<Long> eldId = createNumber("eldId", Long.class);

    public final NumberPath<Long> elId = createNumber("elId", Long.class);

    public final NumberPath<Long> elrId = createNumber("elrId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QExtourneLiqRepart> sysC0023598 = createPrimaryKey(elrId);

    public QExtourneLiqRepart(String variable) {
        super(QExtourneLiqRepart.class, forVariable(variable), "GFC", "EXTOURNE_LIQ_REPART");
        addMetadata();
    }

    public QExtourneLiqRepart(String variable, String schema, String table) {
        super(QExtourneLiqRepart.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QExtourneLiqRepart(Path<? extends QExtourneLiqRepart> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EXTOURNE_LIQ_REPART");
        addMetadata();
    }

    public QExtourneLiqRepart(PathMetadata metadata) {
        super(QExtourneLiqRepart.class, metadata, "GFC", "EXTOURNE_LIQ_REPART");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eldId, ColumnMetadata.named("ELD_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(elId, ColumnMetadata.named("EL_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(elrId, ColumnMetadata.named("ELR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


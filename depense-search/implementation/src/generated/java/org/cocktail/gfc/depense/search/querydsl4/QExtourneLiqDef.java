package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QExtourneLiqDef is a Querydsl query type for QExtourneLiqDef
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QExtourneLiqDef extends com.querydsl.sql.RelationalPathBase<QExtourneLiqDef> {

    private static final long serialVersionUID = 769679933;

    public static final QExtourneLiqDef extourneLiqDef = new QExtourneLiqDef("EXTOURNE_LIQ_DEF");

    public final NumberPath<Long> depId = createNumber("depId", Long.class);

    public final NumberPath<Long> eldId = createNumber("eldId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QExtourneLiqDef> sysC0022220 = createPrimaryKey(eldId);

    public QExtourneLiqDef(String variable) {
        super(QExtourneLiqDef.class, forVariable(variable), "GFC", "EXTOURNE_LIQ_DEF");
        addMetadata();
    }

    public QExtourneLiqDef(String variable, String schema, String table) {
        super(QExtourneLiqDef.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QExtourneLiqDef(Path<? extends QExtourneLiqDef> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EXTOURNE_LIQ_DEF");
        addMetadata();
    }

    public QExtourneLiqDef(PathMetadata metadata) {
        super(QExtourneLiqDef.class, metadata, "GFC", "EXTOURNE_LIQ_DEF");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(depId, ColumnMetadata.named("DEP_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(eldId, ColumnMetadata.named("ELD_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


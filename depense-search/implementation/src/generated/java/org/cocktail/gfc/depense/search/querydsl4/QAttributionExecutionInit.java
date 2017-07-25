package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAttributionExecutionInit is a Querydsl query type for QAttributionExecutionInit
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAttributionExecutionInit extends com.querydsl.sql.RelationalPathBase<QAttributionExecutionInit> {

    private static final long serialVersionUID = -2145543213;

    public static final QAttributionExecutionInit attributionExecutionInit = new QAttributionExecutionInit("ATTRIBUTION_EXECUTION_INIT");

    public final NumberPath<Long> aeeEngHt = createNumber("aeeEngHt", Long.class);

    public final NumberPath<Long> aeeExecution = createNumber("aeeExecution", Long.class);

    public final NumberPath<Long> aeeLiqHt = createNumber("aeeLiqHt", Long.class);

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public QAttributionExecutionInit(String variable) {
        super(QAttributionExecutionInit.class, forVariable(variable), "GFC", "ATTRIBUTION_EXECUTION_INIT");
        addMetadata();
    }

    public QAttributionExecutionInit(String variable, String schema, String table) {
        super(QAttributionExecutionInit.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAttributionExecutionInit(Path<? extends QAttributionExecutionInit> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ATTRIBUTION_EXECUTION_INIT");
        addMetadata();
    }

    public QAttributionExecutionInit(PathMetadata metadata) {
        super(QAttributionExecutionInit.class, metadata, "GFC", "ATTRIBUTION_EXECUTION_INIT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeeEngHt, ColumnMetadata.named("AEE_ENG_HT").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(aeeExecution, ColumnMetadata.named("AEE_EXECUTION").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(aeeLiqHt, ColumnMetadata.named("AEE_LIQ_HT").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
    }

}


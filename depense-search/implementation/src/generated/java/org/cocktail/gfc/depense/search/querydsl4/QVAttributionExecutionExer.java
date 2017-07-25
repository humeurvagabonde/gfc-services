package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAttributionExecutionExer is a Querydsl query type for QVAttributionExecutionExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAttributionExecutionExer extends com.querydsl.sql.RelationalPathBase<QVAttributionExecutionExer> {

    private static final long serialVersionUID = 204509093;

    public static final QVAttributionExecutionExer vAttributionExecutionExer = new QVAttributionExecutionExer("V_ATTRIBUTION_EXECUTION_EXER");

    public final NumberPath<Long> aeeEngHt = createNumber("aeeEngHt", Long.class);

    public final NumberPath<Long> aeeExecution = createNumber("aeeExecution", Long.class);

    public final NumberPath<Long> aeeLiqHt = createNumber("aeeLiqHt", Long.class);

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public QVAttributionExecutionExer(String variable) {
        super(QVAttributionExecutionExer.class, forVariable(variable), "GFC", "V_ATTRIBUTION_EXECUTION_EXER");
        addMetadata();
    }

    public QVAttributionExecutionExer(String variable, String schema, String table) {
        super(QVAttributionExecutionExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAttributionExecutionExer(Path<? extends QVAttributionExecutionExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ATTRIBUTION_EXECUTION_EXER");
        addMetadata();
    }

    public QVAttributionExecutionExer(PathMetadata metadata) {
        super(QVAttributionExecutionExer.class, metadata, "GFC", "V_ATTRIBUTION_EXECUTION_EXER");
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


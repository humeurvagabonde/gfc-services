package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAttributionExecutionExercice is a Querydsl query type for QAttributionExecutionExercice
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAttributionExecutionExercice extends com.querydsl.sql.RelationalPathBase<QAttributionExecutionExercice> {

    private static final long serialVersionUID = 674110763;

    public static final QAttributionExecutionExercice attributionExecutionExercice = new QAttributionExecutionExercice("ATTRIBUTION_EXECUTION_EXERCICE");

    public final NumberPath<Long> aeeEngHt = createNumber("aeeEngHt", Long.class);

    public final NumberPath<Long> aeeExecution = createNumber("aeeExecution", Long.class);

    public final NumberPath<Long> aeeLiqHt = createNumber("aeeLiqHt", Long.class);

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public QAttributionExecutionExercice(String variable) {
        super(QAttributionExecutionExercice.class, forVariable(variable), "GFC", "ATTRIBUTION_EXECUTION_EXERCICE");
        addMetadata();
    }

    public QAttributionExecutionExercice(String variable, String schema, String table) {
        super(QAttributionExecutionExercice.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAttributionExecutionExercice(Path<? extends QAttributionExecutionExercice> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ATTRIBUTION_EXECUTION_EXERCICE");
        addMetadata();
    }

    public QAttributionExecutionExercice(PathMetadata metadata) {
        super(QAttributionExecutionExercice.class, metadata, "GFC", "ATTRIBUTION_EXECUTION_EXERCICE");
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


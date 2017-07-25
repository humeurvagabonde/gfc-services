package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAttributionExecutionFouEx is a Querydsl query type for QVAttributionExecutionFouEx
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAttributionExecutionFouEx extends com.querydsl.sql.RelationalPathBase<QVAttributionExecutionFouEx> {

    private static final long serialVersionUID = 2045484090;

    public static final QVAttributionExecutionFouEx vAttributionExecutionFouEx = new QVAttributionExecutionFouEx("V_ATTRIBUTION_EXECUTION_FOU_EX");

    public final NumberPath<Long> aeeEngHt = createNumber("aeeEngHt", Long.class);

    public final NumberPath<Long> aeeExecution = createNumber("aeeExecution", Long.class);

    public final NumberPath<Long> aeeLiqHt = createNumber("aeeLiqHt", Long.class);

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public QVAttributionExecutionFouEx(String variable) {
        super(QVAttributionExecutionFouEx.class, forVariable(variable), "GFC", "V_ATTRIBUTION_EXECUTION_FOU_EX");
        addMetadata();
    }

    public QVAttributionExecutionFouEx(String variable, String schema, String table) {
        super(QVAttributionExecutionFouEx.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAttributionExecutionFouEx(Path<? extends QVAttributionExecutionFouEx> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ATTRIBUTION_EXECUTION_FOU_EX");
        addMetadata();
    }

    public QVAttributionExecutionFouEx(PathMetadata metadata) {
        super(QVAttributionExecutionFouEx.class, metadata, "GFC", "V_ATTRIBUTION_EXECUTION_FOU_EX");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeeEngHt, ColumnMetadata.named("AEE_ENG_HT").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(aeeExecution, ColumnMetadata.named("AEE_EXECUTION").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(aeeLiqHt, ColumnMetadata.named("AEE_LIQ_HT").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


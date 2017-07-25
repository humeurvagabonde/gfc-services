package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAttributionExecutionExer is a Querydsl query type for QAttributionExecutionExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAttributionExecutionExer extends com.querydsl.sql.RelationalPathBase<QAttributionExecutionExer> {

    private static final long serialVersionUID = -2145652893;

    public static final QAttributionExecutionExer attributionExecutionExer = new QAttributionExecutionExer("ATTRIBUTION_EXECUTION_EXER");

    public final NumberPath<java.math.BigDecimal> aeeEngHt = createNumber("aeeEngHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeeExecution = createNumber("aeeExecution", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeeLiqHt = createNumber("aeeLiqHt", java.math.BigDecimal.class);

    public final NumberPath<Long> aeeOrdre = createNumber("aeeOrdre", Long.class);

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QAttributionExecutionExer> sysC0025201 = createPrimaryKey(aeeOrdre);

    public QAttributionExecutionExer(String variable) {
        super(QAttributionExecutionExer.class, forVariable(variable), "GFC", "ATTRIBUTION_EXECUTION_EXER");
        addMetadata();
    }

    public QAttributionExecutionExer(String variable, String schema, String table) {
        super(QAttributionExecutionExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAttributionExecutionExer(Path<? extends QAttributionExecutionExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ATTRIBUTION_EXECUTION_EXER");
        addMetadata();
    }

    public QAttributionExecutionExer(PathMetadata metadata) {
        super(QAttributionExecutionExer.class, metadata, "GFC", "ATTRIBUTION_EXECUTION_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeeEngHt, ColumnMetadata.named("AEE_ENG_HT").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeeExecution, ColumnMetadata.named("AEE_EXECUTION").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeeLiqHt, ColumnMetadata.named("AEE_LIQ_HT").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeeOrdre, ColumnMetadata.named("AEE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4));
    }

}


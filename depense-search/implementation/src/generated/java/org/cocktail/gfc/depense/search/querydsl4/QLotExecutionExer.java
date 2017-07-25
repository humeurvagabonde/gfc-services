package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QLotExecutionExer is a Querydsl query type for QLotExecutionExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLotExecutionExer extends com.querydsl.sql.RelationalPathBase<QLotExecutionExer> {

    private static final long serialVersionUID = -1632244783;

    public static final QLotExecutionExer lotExecutionExer = new QLotExecutionExer("LOT_EXECUTION_EXER");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<java.math.BigDecimal> leeEngHt = createNumber("leeEngHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> leeExecution = createNumber("leeExecution", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> leeLiqHt = createNumber("leeLiqHt", java.math.BigDecimal.class);

    public final NumberPath<Long> leeOrdre = createNumber("leeOrdre", Long.class);

    public final NumberPath<Long> lotOrdre = createNumber("lotOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QLotExecutionExer> lotExecutionExerPk = createPrimaryKey(leeOrdre);

    public QLotExecutionExer(String variable) {
        super(QLotExecutionExer.class, forVariable(variable), "GFC", "LOT_EXECUTION_EXER");
        addMetadata();
    }

    public QLotExecutionExer(String variable, String schema, String table) {
        super(QLotExecutionExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLotExecutionExer(Path<? extends QLotExecutionExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "LOT_EXECUTION_EXER");
        addMetadata();
    }

    public QLotExecutionExer(PathMetadata metadata) {
        super(QLotExecutionExer.class, metadata, "GFC", "LOT_EXECUTION_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4));
        addMetadata(leeEngHt, ColumnMetadata.named("LEE_ENG_HT").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(leeExecution, ColumnMetadata.named("LEE_EXECUTION").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(leeLiqHt, ColumnMetadata.named("LEE_LIQ_HT").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(leeOrdre, ColumnMetadata.named("LEE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(lotOrdre, ColumnMetadata.named("LOT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38));
    }

}


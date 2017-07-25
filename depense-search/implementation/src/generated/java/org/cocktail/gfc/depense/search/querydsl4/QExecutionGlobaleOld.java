package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QExecutionGlobaleOld is a Querydsl query type for QExecutionGlobaleOld
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QExecutionGlobaleOld extends com.querydsl.sql.RelationalPathBase<QExecutionGlobaleOld> {

    private static final long serialVersionUID = 2105028307;

    public static final QExecutionGlobaleOld executionGlobaleOld = new QExecutionGlobaleOld("EXECUTION_GLOBALE_OLD");

    public final NumberPath<java.math.BigDecimal> aeeEngHt = createNumber("aeeEngHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeeExecution = createNumber("aeeExecution", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeeLiqHt = createNumber("aeeLiqHt", java.math.BigDecimal.class);

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QExecutionGlobaleOld> executionGlobaleOldPk = createPrimaryKey(attOrdre, exeOrdre);

    public QExecutionGlobaleOld(String variable) {
        super(QExecutionGlobaleOld.class, forVariable(variable), "GFC", "EXECUTION_GLOBALE_OLD");
        addMetadata();
    }

    public QExecutionGlobaleOld(String variable, String schema, String table) {
        super(QExecutionGlobaleOld.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QExecutionGlobaleOld(Path<? extends QExecutionGlobaleOld> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EXECUTION_GLOBALE_OLD");
        addMetadata();
    }

    public QExecutionGlobaleOld(PathMetadata metadata) {
        super(QExecutionGlobaleOld.class, metadata, "GFC", "EXECUTION_GLOBALE_OLD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeeEngHt, ColumnMetadata.named("AEE_ENG_HT").withIndex(3).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeeExecution, ColumnMetadata.named("AEE_EXECUTION").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeeLiqHt, ColumnMetadata.named("AEE_LIQ_HT").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
    }

}


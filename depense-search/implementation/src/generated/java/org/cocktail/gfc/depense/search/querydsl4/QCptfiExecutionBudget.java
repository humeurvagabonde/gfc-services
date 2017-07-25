package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptfiExecutionBudget is a Querydsl query type for QCptfiExecutionBudget
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptfiExecutionBudget extends com.querydsl.sql.RelationalPathBase<QCptfiExecutionBudget> {

    private static final long serialVersionUID = -2000087747;

    public static final QCptfiExecutionBudget cptfiExecutionBudget = new QCptfiExecutionBudget("CPTFI_EXECUTION_BUDGET");

    public final NumberPath<java.math.BigDecimal> exbudDep = createNumber("exbudDep", java.math.BigDecimal.class);

    public final StringPath exbudLibDep = createString("exbudLibDep");

    public final StringPath exbudLibRec = createString("exbudLibRec");

    public final NumberPath<Long> exbudOrdre = createNumber("exbudOrdre", Long.class);

    public final NumberPath<java.math.BigDecimal> exbudRec = createNumber("exbudRec", java.math.BigDecimal.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath groupe1 = createString("groupe1");

    public final StringPath groupe2 = createString("groupe2");

    public final com.querydsl.sql.PrimaryKey<QCptfiExecutionBudget> cptfiExecutionBudgetPk = createPrimaryKey(exbudOrdre);

    public QCptfiExecutionBudget(String variable) {
        super(QCptfiExecutionBudget.class, forVariable(variable), "GFC", "CPTFI_EXECUTION_BUDGET");
        addMetadata();
    }

    public QCptfiExecutionBudget(String variable, String schema, String table) {
        super(QCptfiExecutionBudget.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptfiExecutionBudget(Path<? extends QCptfiExecutionBudget> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTFI_EXECUTION_BUDGET");
        addMetadata();
    }

    public QCptfiExecutionBudget(PathMetadata metadata) {
        super(QCptfiExecutionBudget.class, metadata, "GFC", "CPTFI_EXECUTION_BUDGET");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exbudDep, ColumnMetadata.named("EXBUD_DEP").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(exbudLibDep, ColumnMetadata.named("EXBUD_LIB_DEP").withIndex(6).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(exbudLibRec, ColumnMetadata.named("EXBUD_LIB_REC").withIndex(8).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(exbudOrdre, ColumnMetadata.named("EXBUD_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exbudRec, ColumnMetadata.named("EXBUD_REC").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(groupe1, ColumnMetadata.named("GROUPE1").withIndex(4).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(groupe2, ColumnMetadata.named("GROUPE2").withIndex(5).ofType(Types.VARCHAR).withSize(50));
    }

}


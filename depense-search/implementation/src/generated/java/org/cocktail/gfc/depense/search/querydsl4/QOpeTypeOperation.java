package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOpeTypeOperation is a Querydsl query type for QOpeTypeOperation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpeTypeOperation extends com.querydsl.sql.RelationalPathBase<QOpeTypeOperation> {

    private static final long serialVersionUID = 1078205139;

    public static final QOpeTypeOperation opeTypeOperation = new QOpeTypeOperation("OPE_TYPE_OPERATION");

    public final StringPath codeTypeOperation = createString("codeTypeOperation");

    public final NumberPath<Long> idOpeCategOperation = createNumber("idOpeCategOperation", Long.class);

    public final NumberPath<Long> idOpeTypeOperation = createNumber("idOpeTypeOperation", Long.class);

    public final NumberPath<Integer> isInclusTabxBudgetaires = createNumber("isInclusTabxBudgetaires", Integer.class);

    public final StringPath llTypeOperation = createString("llTypeOperation");

    public final com.querydsl.sql.PrimaryKey<QOpeTypeOperation> opeTypeOperationPk = createPrimaryKey(idOpeTypeOperation);

    public QOpeTypeOperation(String variable) {
        super(QOpeTypeOperation.class, forVariable(variable), "GFC", "OPE_TYPE_OPERATION");
        addMetadata();
    }

    public QOpeTypeOperation(String variable, String schema, String table) {
        super(QOpeTypeOperation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpeTypeOperation(Path<? extends QOpeTypeOperation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "OPE_TYPE_OPERATION");
        addMetadata();
    }

    public QOpeTypeOperation(PathMetadata metadata) {
        super(QOpeTypeOperation.class, metadata, "GFC", "OPE_TYPE_OPERATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(codeTypeOperation, ColumnMetadata.named("CODE_TYPE_OPERATION").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idOpeCategOperation, ColumnMetadata.named("ID_OPE_CATEG_OPERATION").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeTypeOperation, ColumnMetadata.named("ID_OPE_TYPE_OPERATION").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(isInclusTabxBudgetaires, ColumnMetadata.named("IS_INCLUS_TABX_BUDGETAIRES").withIndex(5).ofType(Types.DECIMAL).withSize(1));
        addMetadata(llTypeOperation, ColumnMetadata.named("LL_TYPE_OPERATION").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOpeCategOperation is a Querydsl query type for QOpeCategOperation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpeCategOperation extends com.querydsl.sql.RelationalPathBase<QOpeCategOperation> {

    private static final long serialVersionUID = 940219017;

    public static final QOpeCategOperation opeCategOperation = new QOpeCategOperation("OPE_CATEG_OPERATION");

    public final StringPath codeCategOperation = createString("codeCategOperation");

    public final NumberPath<Long> idOpeCategOperation = createNumber("idOpeCategOperation", Long.class);

    public final StringPath llCategOperation = createString("llCategOperation");

    public final com.querydsl.sql.PrimaryKey<QOpeCategOperation> opeCategOperationPk = createPrimaryKey(idOpeCategOperation);

    public QOpeCategOperation(String variable) {
        super(QOpeCategOperation.class, forVariable(variable), "GFC", "OPE_CATEG_OPERATION");
        addMetadata();
    }

    public QOpeCategOperation(String variable, String schema, String table) {
        super(QOpeCategOperation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpeCategOperation(Path<? extends QOpeCategOperation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "OPE_CATEG_OPERATION");
        addMetadata();
    }

    public QOpeCategOperation(PathMetadata metadata) {
        super(QOpeCategOperation.class, metadata, "GFC", "OPE_CATEG_OPERATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(codeCategOperation, ColumnMetadata.named("CODE_CATEG_OPERATION").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idOpeCategOperation, ColumnMetadata.named("ID_OPE_CATEG_OPERATION").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(llCategOperation, ColumnMetadata.named("LL_CATEG_OPERATION").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


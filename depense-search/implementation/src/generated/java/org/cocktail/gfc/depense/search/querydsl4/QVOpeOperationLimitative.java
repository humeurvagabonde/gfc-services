package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVOpeOperationLimitative is a Querydsl query type for QVOpeOperationLimitative
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVOpeOperationLimitative extends com.querydsl.sql.RelationalPathBase<QVOpeOperationLimitative> {

    private static final long serialVersionUID = 1372793209;

    public static final QVOpeOperationLimitative vOpeOperationLimitative = new QVOpeOperationLimitative("V_OPE_OPERATION_LIMITATIVE");

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public QVOpeOperationLimitative(String variable) {
        super(QVOpeOperationLimitative.class, forVariable(variable), "GFC", "V_OPE_OPERATION_LIMITATIVE");
        addMetadata();
    }

    public QVOpeOperationLimitative(String variable, String schema, String table) {
        super(QVOpeOperationLimitative.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVOpeOperationLimitative(Path<? extends QVOpeOperationLimitative> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_OPE_OPERATION_LIMITATIVE");
        addMetadata();
    }

    public QVOpeOperationLimitative(PathMetadata metadata) {
        super(QVOpeOperationLimitative.class, metadata, "GFC", "V_OPE_OPERATION_LIMITATIVE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVOpeOperationSuivisimple is a Querydsl query type for QVOpeOperationSuivisimple
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVOpeOperationSuivisimple extends com.querydsl.sql.RelationalPathBase<QVOpeOperationSuivisimple> {

    private static final long serialVersionUID = 1004219069;

    public static final QVOpeOperationSuivisimple vOpeOperationSuivisimple = new QVOpeOperationSuivisimple("V_OPE_OPERATION_SUIVISIMPLE");

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public QVOpeOperationSuivisimple(String variable) {
        super(QVOpeOperationSuivisimple.class, forVariable(variable), "GFC", "V_OPE_OPERATION_SUIVISIMPLE");
        addMetadata();
    }

    public QVOpeOperationSuivisimple(String variable, String schema, String table) {
        super(QVOpeOperationSuivisimple.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVOpeOperationSuivisimple(Path<? extends QVOpeOperationSuivisimple> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_OPE_OPERATION_SUIVISIMPLE");
        addMetadata();
    }

    public QVOpeOperationSuivisimple(PathMetadata metadata) {
        super(QVOpeOperationSuivisimple.class, metadata, "GFC", "V_OPE_OPERATION_SUIVISIMPLE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


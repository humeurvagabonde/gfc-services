package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVOpeOperationProgrammation is a Querydsl query type for QVOpeOperationProgrammation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVOpeOperationProgrammation extends com.querydsl.sql.RelationalPathBase<QVOpeOperationProgrammation> {

    private static final long serialVersionUID = -1215822019;

    public static final QVOpeOperationProgrammation vOpeOperationProgrammation = new QVOpeOperationProgrammation("V_OPE_OPERATION_PROGRAMMATION");

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public QVOpeOperationProgrammation(String variable) {
        super(QVOpeOperationProgrammation.class, forVariable(variable), "GFC", "V_OPE_OPERATION_PROGRAMMATION");
        addMetadata();
    }

    public QVOpeOperationProgrammation(String variable, String schema, String table) {
        super(QVOpeOperationProgrammation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVOpeOperationProgrammation(Path<? extends QVOpeOperationProgrammation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_OPE_OPERATION_PROGRAMMATION");
        addMetadata();
    }

    public QVOpeOperationProgrammation(PathMetadata metadata) {
        super(QVOpeOperationProgrammation.class, metadata, "GFC", "V_OPE_OPERATION_PROGRAMMATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


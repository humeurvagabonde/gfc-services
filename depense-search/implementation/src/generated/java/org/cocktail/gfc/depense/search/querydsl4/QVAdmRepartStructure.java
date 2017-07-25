package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmRepartStructure is a Querydsl query type for QVAdmRepartStructure
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmRepartStructure extends com.querydsl.sql.RelationalPathBase<QVAdmRepartStructure> {

    private static final long serialVersionUID = 1067029615;

    public static final QVAdmRepartStructure vAdmRepartStructure = new QVAdmRepartStructure("V_ADM_REPART_STRUCTURE");

    public final StringPath cStructure = createString("cStructure");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public QVAdmRepartStructure(String variable) {
        super(QVAdmRepartStructure.class, forVariable(variable), "GFC", "V_ADM_REPART_STRUCTURE");
        addMetadata();
    }

    public QVAdmRepartStructure(String variable, String schema, String table) {
        super(QVAdmRepartStructure.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmRepartStructure(Path<? extends QVAdmRepartStructure> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_REPART_STRUCTURE");
        addMetadata();
    }

    public QVAdmRepartStructure(PathMetadata metadata) {
        super(QVAdmRepartStructure.class, metadata, "GFC", "V_ADM_REPART_STRUCTURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cStructure, ColumnMetadata.named("C_STRUCTURE").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAuditBrouillardType is a Querydsl query type for QAuditBrouillardType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAuditBrouillardType extends com.querydsl.sql.RelationalPathBase<QAuditBrouillardType> {

    private static final long serialVersionUID = 290158539;

    public static final QAuditBrouillardType auditBrouillardType = new QAuditBrouillardType("AUDIT_BROUILLARD_TYPE");

    public final StringPath cAuditBrouillardType = createString("cAuditBrouillardType");

    public final NumberPath<Long> idAuditBrouillardType = createNumber("idAuditBrouillardType", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAuditBrouillardType> auditBrouillardTypePk = createPrimaryKey(idAuditBrouillardType);

    public QAuditBrouillardType(String variable) {
        super(QAuditBrouillardType.class, forVariable(variable), "GFC", "AUDIT_BROUILLARD_TYPE");
        addMetadata();
    }

    public QAuditBrouillardType(String variable, String schema, String table) {
        super(QAuditBrouillardType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAuditBrouillardType(Path<? extends QAuditBrouillardType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "AUDIT_BROUILLARD_TYPE");
        addMetadata();
    }

    public QAuditBrouillardType(PathMetadata metadata) {
        super(QAuditBrouillardType.class, metadata, "GFC", "AUDIT_BROUILLARD_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cAuditBrouillardType, ColumnMetadata.named("C_AUDIT_BROUILLARD_TYPE").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(idAuditBrouillardType, ColumnMetadata.named("ID_AUDIT_BROUILLARD_TYPE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


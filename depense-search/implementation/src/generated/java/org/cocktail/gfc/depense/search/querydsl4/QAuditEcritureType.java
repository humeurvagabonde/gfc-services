package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAuditEcritureType is a Querydsl query type for QAuditEcritureType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAuditEcritureType extends com.querydsl.sql.RelationalPathBase<QAuditEcritureType> {

    private static final long serialVersionUID = 2793748;

    public static final QAuditEcritureType auditEcritureType = new QAuditEcritureType("AUDIT_ECRITURE_TYPE");

    public final StringPath cAuditEcritureType = createString("cAuditEcritureType");

    public final NumberPath<Long> idAuditEcritureType = createNumber("idAuditEcritureType", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAuditEcritureType> idAuditEcritureTypePk = createPrimaryKey(idAuditEcritureType);

    public QAuditEcritureType(String variable) {
        super(QAuditEcritureType.class, forVariable(variable), "GFC", "AUDIT_ECRITURE_TYPE");
        addMetadata();
    }

    public QAuditEcritureType(String variable, String schema, String table) {
        super(QAuditEcritureType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAuditEcritureType(Path<? extends QAuditEcritureType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "AUDIT_ECRITURE_TYPE");
        addMetadata();
    }

    public QAuditEcritureType(PathMetadata metadata) {
        super(QAuditEcritureType.class, metadata, "GFC", "AUDIT_ECRITURE_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cAuditEcritureType, ColumnMetadata.named("C_AUDIT_ECRITURE_TYPE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(idAuditEcritureType, ColumnMetadata.named("ID_AUDIT_ECRITURE_TYPE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


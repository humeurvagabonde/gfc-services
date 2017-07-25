package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptDcrAuditEcritureType is a Querydsl query type for QCptDcrAuditEcritureType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptDcrAuditEcritureType extends com.querydsl.sql.RelationalPathBase<QCptDcrAuditEcritureType> {

    private static final long serialVersionUID = -428078776;

    public static final QCptDcrAuditEcritureType cptDcrAuditEcritureType = new QCptDcrAuditEcritureType("CPT_DCR_AUDIT_ECRITURE_TYPE");

    public final StringPath cAuditEcrType = createString("cAuditEcrType");

    public final StringPath cAuditEcrTypeAnnul = createString("cAuditEcrTypeAnnul");

    public final StringPath cAuditEcrTypeCorrection = createString("cAuditEcrTypeCorrection");

    public final StringPath typeObjet = createString("typeObjet");

    public final com.querydsl.sql.PrimaryKey<QCptDcrAuditEcritureType> cptDcrAuditEcrTypePk = createPrimaryKey(cAuditEcrType);

    public QCptDcrAuditEcritureType(String variable) {
        super(QCptDcrAuditEcritureType.class, forVariable(variable), "GFC", "CPT_DCR_AUDIT_ECRITURE_TYPE");
        addMetadata();
    }

    public QCptDcrAuditEcritureType(String variable, String schema, String table) {
        super(QCptDcrAuditEcritureType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptDcrAuditEcritureType(Path<? extends QCptDcrAuditEcritureType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_DCR_AUDIT_ECRITURE_TYPE");
        addMetadata();
    }

    public QCptDcrAuditEcritureType(PathMetadata metadata) {
        super(QCptDcrAuditEcritureType.class, metadata, "GFC", "CPT_DCR_AUDIT_ECRITURE_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cAuditEcrType, ColumnMetadata.named("C_AUDIT_ECR_TYPE").withIndex(1).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(cAuditEcrTypeAnnul, ColumnMetadata.named("C_AUDIT_ECR_TYPE_ANNUL").withIndex(3).ofType(Types.VARCHAR).withSize(50));
        addMetadata(cAuditEcrTypeCorrection, ColumnMetadata.named("C_AUDIT_ECR_TYPE_CORRECTION").withIndex(4).ofType(Types.VARCHAR).withSize(50));
        addMetadata(typeObjet, ColumnMetadata.named("TYPE_OBJET").withIndex(2).ofType(Types.VARCHAR).withSize(3).notNull());
    }

}


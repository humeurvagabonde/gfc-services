package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAuditBrouillard is a Querydsl query type for QAuditBrouillard
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAuditBrouillard extends com.querydsl.sql.RelationalPathBase<QAuditBrouillard> {

    private static final long serialVersionUID = -525773583;

    public static final QAuditBrouillard auditBrouillard = new QAuditBrouillard("AUDIT_BROUILLARD");

    public final StringPath cAuditBrouillardType = createString("cAuditBrouillardType");

    public final StringPath dCreation = createString("dCreation");

    public final NumberPath<Long> idAuditBrouillard = createNumber("idAuditBrouillard", Long.class);

    public final NumberPath<Long> idCptBrouillardDetail = createNumber("idCptBrouillardDetail", Long.class);

    public final NumberPath<Long> idCptbudBrouillardDetail = createNumber("idCptbudBrouillardDetail", Long.class);

    public final NumberPath<Long> idCptDemandeEcriture = createNumber("idCptDemandeEcriture", Long.class);

    public final NumberPath<Long> idDepDp = createNumber("idDepDp", Long.class);

    public final NumberPath<Long> idDepSf = createNumber("idDepSf", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAuditBrouillard> auditBrouillardPk = createPrimaryKey(idAuditBrouillard);

    public QAuditBrouillard(String variable) {
        super(QAuditBrouillard.class, forVariable(variable), "GFC", "AUDIT_BROUILLARD");
        addMetadata();
    }

    public QAuditBrouillard(String variable, String schema, String table) {
        super(QAuditBrouillard.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAuditBrouillard(Path<? extends QAuditBrouillard> path) {
        super(path.getType(), path.getMetadata(), "GFC", "AUDIT_BROUILLARD");
        addMetadata();
    }

    public QAuditBrouillard(PathMetadata metadata) {
        super(QAuditBrouillard.class, metadata, "GFC", "AUDIT_BROUILLARD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cAuditBrouillardType, ColumnMetadata.named("C_AUDIT_BROUILLARD_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(2).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(idAuditBrouillard, ColumnMetadata.named("ID_AUDIT_BROUILLARD").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idCptBrouillardDetail, ColumnMetadata.named("ID_CPT_BROUILLARD_DETAIL").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idCptbudBrouillardDetail, ColumnMetadata.named("ID_CPTBUD_BROUILLARD_DETAIL").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idCptDemandeEcriture, ColumnMetadata.named("ID_CPT_DEMANDE_ECRITURE").withIndex(8).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepDp, ColumnMetadata.named("ID_DEP_DP").withIndex(6).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepSf, ColumnMetadata.named("ID_DEP_SF").withIndex(9).ofType(Types.DECIMAL).withSize(38));
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


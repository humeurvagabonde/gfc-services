package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAuditEcriture is a Querydsl query type for QAuditEcriture
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAuditEcriture extends com.querydsl.sql.RelationalPathBase<QAuditEcriture> {

    private static final long serialVersionUID = -98923846;

    public static final QAuditEcriture auditEcriture = new QAuditEcriture("AUDIT_ECRITURE");

    public final StringPath cAuditEcritureType = createString("cAuditEcritureType");

    public final StringPath dCreation = createString("dCreation");

    public final NumberPath<Long> emaOrdre = createNumber("emaOrdre", Long.class);

    public final NumberPath<Long> encaissementId = createNumber("encaissementId", Long.class);

    public final NumberPath<Long> idAuditEcriture = createNumber("idAuditEcriture", Long.class);

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> idBudVirementDepense = createNumber("idBudVirementDepense", Long.class);

    public final NumberPath<Long> idCptbudEcriture = createNumber("idCptbudEcriture", Long.class);

    public final NumberPath<Long> idCptDemandeEcriture = createNumber("idCptDemandeEcriture", Long.class);

    public final NumberPath<Long> idCptEcritureDetail = createNumber("idCptEcritureDetail", Long.class);

    public final NumberPath<Long> idDcrCorrective = createNumber("idDcrCorrective", Long.class);

    public final NumberPath<Long> idDepDp = createNumber("idDepDp", Long.class);

    public final NumberPath<Long> idDepEj = createNumber("idDepEj", Long.class);

    public final NumberPath<Long> idDepSf = createNumber("idDepSf", Long.class);

    public final NumberPath<Long> idDverDemandeVersement = createNumber("idDverDemandeVersement", Long.class);

    public final NumberPath<Long> idRapprochement = createNumber("idRapprochement", Long.class);

    public final NumberPath<Long> lotNumero = createNumber("lotNumero", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> titId = createNumber("titId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAuditEcriture> idAuditEcriturePk = createPrimaryKey(idAuditEcriture);

    public QAuditEcriture(String variable) {
        super(QAuditEcriture.class, forVariable(variable), "GFC", "AUDIT_ECRITURE");
        addMetadata();
    }

    public QAuditEcriture(String variable, String schema, String table) {
        super(QAuditEcriture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAuditEcriture(Path<? extends QAuditEcriture> path) {
        super(path.getType(), path.getMetadata(), "GFC", "AUDIT_ECRITURE");
        addMetadata();
    }

    public QAuditEcriture(PathMetadata metadata) {
        super(QAuditEcriture.class, metadata, "GFC", "AUDIT_ECRITURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cAuditEcritureType, ColumnMetadata.named("C_AUDIT_ECRITURE_TYPE").withIndex(5).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(3).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(emaOrdre, ColumnMetadata.named("EMA_ORDRE").withIndex(19).ofType(Types.DECIMAL).withSize(38));
        addMetadata(encaissementId, ColumnMetadata.named("ENCAISSEMENT_ID").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAuditEcriture, ColumnMetadata.named("ID_AUDIT_ECRITURE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(8).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idBudVirementDepense, ColumnMetadata.named("ID_BUD_VIREMENT_DEPENSE").withIndex(9).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idCptbudEcriture, ColumnMetadata.named("ID_CPTBUD_ECRITURE").withIndex(6).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idCptDemandeEcriture, ColumnMetadata.named("ID_CPT_DEMANDE_ECRITURE").withIndex(16).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idCptEcritureDetail, ColumnMetadata.named("ID_CPT_ECRITURE_DETAIL").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDcrCorrective, ColumnMetadata.named("ID_DCR_CORRECTIVE").withIndex(18).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepDp, ColumnMetadata.named("ID_DEP_DP").withIndex(12).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepEj, ColumnMetadata.named("ID_DEP_EJ").withIndex(10).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepSf, ColumnMetadata.named("ID_DEP_SF").withIndex(11).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDverDemandeVersement, ColumnMetadata.named("ID_DVER_DEMANDE_VERSEMENT").withIndex(13).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idRapprochement, ColumnMetadata.named("ID_RAPPROCHEMENT").withIndex(17).ofType(Types.DECIMAL).withSize(38));
        addMetadata(lotNumero, ColumnMetadata.named("LOT_NUMERO").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(titId, ColumnMetadata.named("TIT_ID").withIndex(14).ofType(Types.DECIMAL).withSize(0));
    }

}


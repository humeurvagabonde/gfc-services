package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptDemandeEcriture is a Querydsl query type for QCptDemandeEcriture
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptDemandeEcriture extends com.querydsl.sql.RelationalPathBase<QCptDemandeEcriture> {

    private static final long serialVersionUID = -887835770;

    public static final QCptDemandeEcriture cptDemandeEcriture = new QCptDemandeEcriture("CPT_DEMANDE_ECRITURE");

    public final StringPath cAuditEcritureType = createString("cAuditEcritureType");

    public final StringPath cCptDemandeEcritureType = createString("cCptDemandeEcritureType");

    public final StringPath cCptDemandeEcrOrigine = createString("cCptDemandeEcrOrigine");

    public final StringPath commentaire = createString("commentaire");

    public final StringPath dateValidOuRefusOrdo = createString("dateValidOuRefusOrdo");

    public final StringPath dateVisaOuRejetComptab = createString("dateVisaOuRejetComptab");

    public final StringPath dCreation = createString("dCreation");

    public final StringPath dModification = createString("dModification");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idCptDemandeEcriture = createNumber("idCptDemandeEcriture", Long.class);

    public final NumberPath<Long> idCptDemandeEcritureRef = createNumber("idCptDemandeEcritureRef", Long.class);

    public final NumberPath<Long> idDepDp = createNumber("idDepDp", Long.class);

    public final NumberPath<Long> idDepEj = createNumber("idDepEj", Long.class);

    public final NumberPath<Long> idDepSf = createNumber("idDepSf", Long.class);

    public final StringPath libelle = createString("libelle");

    public final StringPath motifRefusOrdo = createString("motifRefusOrdo");

    public final StringPath motifRejetComptab = createString("motifRejetComptab");

    public final StringPath numDemandeEcriture = createString("numDemandeEcriture");

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final NumberPath<Long> persIdValidOuRefusOrdo = createNumber("persIdValidOuRefusOrdo", Long.class);

    public final NumberPath<Long> persIdVisaOuRejetComptab = createNumber("persIdVisaOuRejetComptab", Long.class);

    public final NumberPath<Long> titId = createNumber("titId", Long.class);

    public final NumberPath<Long> tjoOrdre = createNumber("tjoOrdre", Long.class);

    public final NumberPath<Long> topOrdre = createNumber("topOrdre", Long.class);

    public final NumberPath<Long> tyapId = createNumber("tyapId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final StringPath typeCompta = createString("typeCompta");

    public final com.querydsl.sql.PrimaryKey<QCptDemandeEcriture> cptDemandeEcriturePk = createPrimaryKey(idCptDemandeEcriture);

    public QCptDemandeEcriture(String variable) {
        super(QCptDemandeEcriture.class, forVariable(variable), "GFC", "CPT_DEMANDE_ECRITURE");
        addMetadata();
    }

    public QCptDemandeEcriture(String variable, String schema, String table) {
        super(QCptDemandeEcriture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptDemandeEcriture(Path<? extends QCptDemandeEcriture> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_DEMANDE_ECRITURE");
        addMetadata();
    }

    public QCptDemandeEcriture(PathMetadata metadata) {
        super(QCptDemandeEcriture.class, metadata, "GFC", "CPT_DEMANDE_ECRITURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cAuditEcritureType, ColumnMetadata.named("C_AUDIT_ECRITURE_TYPE").withIndex(28).ofType(Types.VARCHAR).withSize(50));
        addMetadata(cCptDemandeEcritureType, ColumnMetadata.named("C_CPT_DEMANDE_ECRITURE_TYPE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(cCptDemandeEcrOrigine, ColumnMetadata.named("C_CPT_DEMANDE_ECR_ORIGINE").withIndex(24).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(26).ofType(Types.VARCHAR).withSize(500));
        addMetadata(dateValidOuRefusOrdo, ColumnMetadata.named("DATE_VALID_OU_REFUS_ORDO").withIndex(16).ofType(Types.VARCHAR).withSize(30));
        addMetadata(dateVisaOuRejetComptab, ColumnMetadata.named("DATE_VISA_OU_REJET_COMPTAB").withIndex(19).ofType(Types.VARCHAR).withSize(30));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(7).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(13).ofType(Types.VARCHAR).withSize(30));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idCptDemandeEcriture, ColumnMetadata.named("ID_CPT_DEMANDE_ECRITURE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idCptDemandeEcritureRef, ColumnMetadata.named("ID_CPT_DEMANDE_ECRITURE_REF").withIndex(22).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idDepDp, ColumnMetadata.named("ID_DEP_DP").withIndex(11).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepEj, ColumnMetadata.named("ID_DEP_EJ").withIndex(9).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepSf, ColumnMetadata.named("ID_DEP_SF").withIndex(10).ofType(Types.DECIMAL).withSize(38));
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(12).ofType(Types.VARCHAR).withSize(200));
        addMetadata(motifRefusOrdo, ColumnMetadata.named("MOTIF_REFUS_ORDO").withIndex(17).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(motifRejetComptab, ColumnMetadata.named("MOTIF_REJET_COMPTAB").withIndex(20).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(numDemandeEcriture, ColumnMetadata.named("NUM_DEMANDE_ECRITURE").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(8).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(14).ofType(Types.DECIMAL).withSize(38));
        addMetadata(persIdValidOuRefusOrdo, ColumnMetadata.named("PERS_ID_VALID_OU_REFUS_ORDO").withIndex(15).ofType(Types.DECIMAL).withSize(38));
        addMetadata(persIdVisaOuRejetComptab, ColumnMetadata.named("PERS_ID_VISA_OU_REJET_COMPTAB").withIndex(18).ofType(Types.DECIMAL).withSize(38));
        addMetadata(titId, ColumnMetadata.named("TIT_ID").withIndex(27).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tjoOrdre, ColumnMetadata.named("TJO_ORDRE").withIndex(25).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(topOrdre, ColumnMetadata.named("TOP_ORDRE").withIndex(23).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyapId, ColumnMetadata.named("TYAP_ID").withIndex(21).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(typeCompta, ColumnMetadata.named("TYPE_COMPTA").withIndex(5).ofType(Types.VARCHAR).withSize(10).notNull());
    }

}


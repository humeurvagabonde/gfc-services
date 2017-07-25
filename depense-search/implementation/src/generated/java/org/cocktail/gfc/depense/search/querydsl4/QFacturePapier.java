package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFacturePapier is a Querydsl query type for QFacturePapier
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFacturePapier extends com.querydsl.sql.RelationalPathBase<QFacturePapier> {

    private static final long serialVersionUID = -113626903;

    public static final QFacturePapier facturePapier = new QFacturePapier("FACTURE_PAPIER");

    public final NumberPath<Long> canId = createNumber("canId", Long.class);

    public final NumberPath<Long> echeId = createNumber("echeId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> facId = createNumber("facId", Long.class);

    public final StringPath fapApplyTva = createString("fapApplyTva");

    public final StringPath fapCommentaireClient = createString("fapCommentaireClient");

    public final StringPath fapCommentairePrest = createString("fapCommentairePrest");

    public final DateTimePath<java.sql.Timestamp> fapDate = createDateTime("fapDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> fapDateLimitePaiement = createDateTime("fapDateLimitePaiement", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> fapDateReglement = createDateTime("fapDateReglement", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> fapDateValidationClient = createDateTime("fapDateValidationClient", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> fapDateValidationPrest = createDateTime("fapDateValidationPrest", java.sql.Timestamp.class);

    public final NumberPath<Long> fapId = createNumber("fapId", Long.class);

    public final StringPath fapLib = createString("fapLib");

    public final NumberPath<Long> fapNumero = createNumber("fapNumero", Long.class);

    public final StringPath fapRef = createString("fapRef");

    public final StringPath fapReferenceReglement = createString("fapReferenceReglement");

    public final NumberPath<java.math.BigDecimal> fapRemiseGlobale = createNumber("fapRemiseGlobale", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fapTotalHt = createNumber("fapTotalHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fapTotalTtc = createNumber("fapTotalTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fapTotalTva = createNumber("fapTotalTva", java.math.BigDecimal.class);

    public final NumberPath<Long> fapUtlValidationClient = createNumber("fapUtlValidationClient", Long.class);

    public final NumberPath<Long> fapUtlValidationPrest = createNumber("fapUtlValidationPrest", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> fouOrdrePrest = createNumber("fouOrdrePrest", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> lolfId = createNumber("lolfId", Long.class);

    public final NumberPath<Long> morOrdre = createNumber("morOrdre", Long.class);

    public final NumberPath<Long> noIndividu = createNumber("noIndividu", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final StringPath pcoNumCtp = createString("pcoNumCtp");

    public final StringPath pcoNumTva = createString("pcoNumTva");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> prestId = createNumber("prestId", Long.class);

    public final NumberPath<Long> ribOrdre = createNumber("ribOrdre", Long.class);

    public final NumberPath<Long> tapId = createNumber("tapId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final NumberPath<Long> typuId = createNumber("typuId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QFacturePapier> facturePapierPk = createPrimaryKey(fapId);

    public QFacturePapier(String variable) {
        super(QFacturePapier.class, forVariable(variable), "GFC", "FACTURE_PAPIER");
        addMetadata();
    }

    public QFacturePapier(String variable, String schema, String table) {
        super(QFacturePapier.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFacturePapier(Path<? extends QFacturePapier> path) {
        super(path.getType(), path.getMetadata(), "GFC", "FACTURE_PAPIER");
        addMetadata();
    }

    public QFacturePapier(PathMetadata metadata) {
        super(QFacturePapier.class, metadata, "GFC", "FACTURE_PAPIER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(canId, ColumnMetadata.named("CAN_ID").withIndex(31).ofType(Types.DECIMAL).withSize(0));
        addMetadata(echeId, ColumnMetadata.named("ECHE_ID").withIndex(33).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(facId, ColumnMetadata.named("FAC_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(fapApplyTva, ColumnMetadata.named("FAP_APPLY_TVA").withIndex(22).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(fapCommentaireClient, ColumnMetadata.named("FAP_COMMENTAIRE_CLIENT").withIndex(20).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(fapCommentairePrest, ColumnMetadata.named("FAP_COMMENTAIRE_PREST").withIndex(19).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(fapDate, ColumnMetadata.named("FAP_DATE").withIndex(11).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(fapDateLimitePaiement, ColumnMetadata.named("FAP_DATE_LIMITE_PAIEMENT").withIndex(16).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(fapDateReglement, ColumnMetadata.named("FAP_DATE_REGLEMENT").withIndex(17).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(fapDateValidationClient, ColumnMetadata.named("FAP_DATE_VALIDATION_CLIENT").withIndex(14).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(fapDateValidationPrest, ColumnMetadata.named("FAP_DATE_VALIDATION_PREST").withIndex(15).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(fapId, ColumnMetadata.named("FAP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fapLib, ColumnMetadata.named("FAP_LIB").withIndex(13).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(fapNumero, ColumnMetadata.named("FAP_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fapRef, ColumnMetadata.named("FAP_REF").withIndex(12).ofType(Types.VARCHAR).withSize(100));
        addMetadata(fapReferenceReglement, ColumnMetadata.named("FAP_REFERENCE_REGLEMENT").withIndex(18).ofType(Types.VARCHAR).withSize(20));
        addMetadata(fapRemiseGlobale, ColumnMetadata.named("FAP_REMISE_GLOBALE").withIndex(21).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(fapTotalHt, ColumnMetadata.named("FAP_TOTAL_HT").withIndex(38).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fapTotalTtc, ColumnMetadata.named("FAP_TOTAL_TTC").withIndex(40).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fapTotalTva, ColumnMetadata.named("FAP_TOTAL_TVA").withIndex(39).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fapUtlValidationClient, ColumnMetadata.named("FAP_UTL_VALIDATION_CLIENT").withIndex(36).ofType(Types.DECIMAL).withSize(0));
        addMetadata(fapUtlValidationPrest, ColumnMetadata.named("FAP_UTL_VALIDATION_PREST").withIndex(37).ofType(Types.DECIMAL).withSize(0));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fouOrdrePrest, ColumnMetadata.named("FOU_ORDRE_PREST").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(25).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(42).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(41).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(32).ofType(Types.DECIMAL).withSize(0));
        addMetadata(lolfId, ColumnMetadata.named("LOLF_ID").withIndex(27).ofType(Types.DECIMAL).withSize(0));
        addMetadata(morOrdre, ColumnMetadata.named("MOR_ORDRE").withIndex(23).ofType(Types.DECIMAL).withSize(0));
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(10).ofType(Types.DECIMAL).withSize(0));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(28).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pcoNumCtp, ColumnMetadata.named("PCO_NUM_CTP").withIndex(30).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pcoNumTva, ColumnMetadata.named("PCO_NUM_TVA").withIndex(29).ofType(Types.VARCHAR).withSize(20));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prestId, ColumnMetadata.named("PREST_ID").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ribOrdre, ColumnMetadata.named("RIB_ORDRE").withIndex(24).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tapId, ColumnMetadata.named("TAP_ID").withIndex(26).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(35).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(typuId, ColumnMetadata.named("TYPU_ID").withIndex(34).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


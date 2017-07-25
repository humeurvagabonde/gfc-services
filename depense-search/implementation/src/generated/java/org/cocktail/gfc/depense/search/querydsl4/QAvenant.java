package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvenant is a Querydsl query type for QAvenant
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvenant extends com.querydsl.sql.RelationalPathBase<QAvenant> {

    private static final long serialVersionUID = -1364493697;

    public static final QAvenant avenant = new QAvenant("AVENANT");

    public final NumberPath<Long> avtCrGest = createNumber("avtCrGest", Long.class);

    public final DateTimePath<java.sql.Timestamp> avtDateCreation = createDateTime("avtDateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> avtDateDeb = createDateTime("avtDateDeb", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> avtDateDebExec = createDateTime("avtDateDebExec", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> avtDateFin = createDateTime("avtDateFin", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> avtDateFinExec = createDateTime("avtDateFinExec", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> avtDateModif = createDateTime("avtDateModif", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> avtDateSignature = createDateTime("avtDateSignature", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> avtDateSignatureDefinitive = createDateTime("avtDateSignatureDefinitive", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> avtDateSoumissionCa = createDateTime("avtDateSoumissionCa", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> avtDateValidAdm = createDateTime("avtDateValidAdm", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> avtDateValidFin = createDateTime("avtDateValidFin", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> avtDepAnterieure = createNumber("avtDepAnterieure", java.math.BigDecimal.class);

    public final NumberPath<Long> avtIndex = createNumber("avtIndex", Long.class);

    public final StringPath avtLimitatif = createString("avtLimitatif");

    public final StringPath avtLucrativite = createString("avtLucrativite");

    public final NumberPath<java.math.BigDecimal> avtMntReliquat = createNumber("avtMntReliquat", java.math.BigDecimal.class);

    public final NumberPath<Long> avtModeGest = createNumber("avtModeGest", Long.class);

    public final StringPath avtMonnaie = createString("avtMonnaie");

    public final NumberPath<Long> avtMontantGlobal = createNumber("avtMontantGlobal", Long.class);

    public final NumberPath<java.math.BigDecimal> avtMontantHt = createNumber("avtMontantHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> avtMontantTtc = createNumber("avtMontantTtc", java.math.BigDecimal.class);

    public final StringPath avtObjet = createString("avtObjet");

    public final StringPath avtObjetCourt = createString("avtObjetCourt");

    public final StringPath avtObservations = createString("avtObservations");

    public final NumberPath<Long> avtOrdre = createNumber("avtOrdre", Long.class);

    public final NumberPath<java.math.BigDecimal> avtPctAvance = createNumber("avtPctAvance", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> avtRecAnterieure = createNumber("avtRecAnterieure", java.math.BigDecimal.class);

    public final StringPath avtRecupTva = createString("avtRecupTva");

    public final StringPath avtRefExterne = createString("avtRefExterne");

    public final NumberPath<Long> avtStatReliquat = createNumber("avtStatReliquat", Long.class);

    public final StringPath avtSuppr = createString("avtSuppr");

    public final NumberPath<Long> avtTvaId = createNumber("avtTvaId", Long.class);

    public final NumberPath<Long> discOrdre = createNumber("discOrdre", Long.class);

    public final NumberPath<Long> dsOrdre = createNumber("dsOrdre", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> taOrdre = createNumber("taOrdre", Long.class);

    public final NumberPath<Long> utlOrdreCreation = createNumber("utlOrdreCreation", Long.class);

    public final NumberPath<Long> utlOrdreModif = createNumber("utlOrdreModif", Long.class);

    public final NumberPath<Long> utlOrdreValidAdm = createNumber("utlOrdreValidAdm", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAvenant> avenantPk = createPrimaryKey(avtOrdre);

    public QAvenant(String variable) {
        super(QAvenant.class, forVariable(variable), "GFC", "AVENANT");
        addMetadata();
    }

    public QAvenant(String variable, String schema, String table) {
        super(QAvenant.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvenant(Path<? extends QAvenant> path) {
        super(path.getType(), path.getMetadata(), "GFC", "AVENANT");
        addMetadata();
    }

    public QAvenant(PathMetadata metadata) {
        super(QAvenant.class, metadata, "GFC", "AVENANT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(avtCrGest, ColumnMetadata.named("AVT_CR_GEST").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(avtDateCreation, ColumnMetadata.named("AVT_DATE_CREATION").withIndex(18).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(avtDateDeb, ColumnMetadata.named("AVT_DATE_DEB").withIndex(12).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(avtDateDebExec, ColumnMetadata.named("AVT_DATE_DEB_EXEC").withIndex(14).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(avtDateFin, ColumnMetadata.named("AVT_DATE_FIN").withIndex(13).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(avtDateFinExec, ColumnMetadata.named("AVT_DATE_FIN_EXEC").withIndex(15).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(avtDateModif, ColumnMetadata.named("AVT_DATE_MODIF").withIndex(20).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(avtDateSignature, ColumnMetadata.named("AVT_DATE_SIGNATURE").withIndex(16).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(avtDateSignatureDefinitive, ColumnMetadata.named("AVT_DATE_SIGNATURE_DEFINITIVE").withIndex(36).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(avtDateSoumissionCa, ColumnMetadata.named("AVT_DATE_SOUMISSION_CA").withIndex(35).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(avtDateValidAdm, ColumnMetadata.named("AVT_DATE_VALID_ADM").withIndex(22).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(avtDateValidFin, ColumnMetadata.named("AVT_DATE_VALID_FIN").withIndex(40).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(avtDepAnterieure, ColumnMetadata.named("AVT_DEP_ANTERIEURE").withIndex(25).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(avtIndex, ColumnMetadata.named("AVT_INDEX").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(avtLimitatif, ColumnMetadata.named("AVT_LIMITATIF").withIndex(34).ofType(Types.VARCHAR).withSize(30));
        addMetadata(avtLucrativite, ColumnMetadata.named("AVT_LUCRATIVITE").withIndex(27).ofType(Types.VARCHAR).withSize(1));
        addMetadata(avtMntReliquat, ColumnMetadata.named("AVT_MNT_RELIQUAT").withIndex(30).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(avtModeGest, ColumnMetadata.named("AVT_MODE_GEST").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(avtMonnaie, ColumnMetadata.named("AVT_MONNAIE").withIndex(26).ofType(Types.VARCHAR).withSize(1));
        addMetadata(avtMontantGlobal, ColumnMetadata.named("AVT_MONTANT_GLOBAL").withIndex(37).ofType(Types.DECIMAL).withSize(0));
        addMetadata(avtMontantHt, ColumnMetadata.named("AVT_MONTANT_HT").withIndex(28).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(avtMontantTtc, ColumnMetadata.named("AVT_MONTANT_TTC").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(avtObjet, ColumnMetadata.named("AVT_OBJET").withIndex(9).ofType(Types.VARCHAR).withSize(250).notNull());
        addMetadata(avtObjetCourt, ColumnMetadata.named("AVT_OBJET_COURT").withIndex(10).ofType(Types.VARCHAR).withSize(50));
        addMetadata(avtObservations, ColumnMetadata.named("AVT_OBSERVATIONS").withIndex(11).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(avtOrdre, ColumnMetadata.named("AVT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(avtPctAvance, ColumnMetadata.named("AVT_PCT_AVANCE").withIndex(23).ofType(Types.DECIMAL).withSize(5).withDigits(2));
        addMetadata(avtRecAnterieure, ColumnMetadata.named("AVT_REC_ANTERIEURE").withIndex(24).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(avtRecupTva, ColumnMetadata.named("AVT_RECUP_TVA").withIndex(29).ofType(Types.VARCHAR).withSize(1));
        addMetadata(avtRefExterne, ColumnMetadata.named("AVT_REF_EXTERNE").withIndex(4).ofType(Types.VARCHAR).withSize(100));
        addMetadata(avtStatReliquat, ColumnMetadata.named("AVT_STAT_RELIQUAT").withIndex(31).ofType(Types.DECIMAL).withSize(38));
        addMetadata(avtSuppr, ColumnMetadata.named("AVT_SUPPR").withIndex(33).ofType(Types.VARCHAR).withSize(1));
        addMetadata(avtTvaId, ColumnMetadata.named("AVT_TVA_ID").withIndex(38).ofType(Types.DECIMAL).withSize(0));
        addMetadata(discOrdre, ColumnMetadata.named("DISC_ORDRE").withIndex(32).ofType(Types.DECIMAL).withSize(0));
        addMetadata(dsOrdre, ColumnMetadata.named("DS_ORDRE").withIndex(39).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(taOrdre, ColumnMetadata.named("TA_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(utlOrdreCreation, ColumnMetadata.named("UTL_ORDRE_CREATION").withIndex(17).ofType(Types.DECIMAL).withSize(38));
        addMetadata(utlOrdreModif, ColumnMetadata.named("UTL_ORDRE_MODIF").withIndex(19).ofType(Types.DECIMAL).withSize(38));
        addMetadata(utlOrdreValidAdm, ColumnMetadata.named("UTL_ORDRE_VALID_ADM").withIndex(21).ofType(Types.DECIMAL).withSize(38));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVSitRecetteTitreVisaCtp is a Querydsl query type for QVSitRecetteTitreVisaCtp
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVSitRecetteTitreVisaCtp extends com.querydsl.sql.RelationalPathBase<QVSitRecetteTitreVisaCtp> {

    private static final long serialVersionUID = -466673142;

    public static final QVSitRecetteTitreVisaCtp vSitRecetteTitreVisaCtp = new QVSitRecetteTitreVisaCtp("V_SIT_RECETTE_TITRE_VISA_CTP");

    public final StringPath clientCode = createString("clientCode");

    public final StringPath clientLib = createString("clientLib");

    public final StringPath codeAna = createString("codeAna");

    public final StringPath cr = createString("cr");

    public final StringPath ebCr = createString("ebCr");

    public final StringPath ebEtab = createString("ebEtab");

    public final StringPath ebSouscr = createString("ebSouscr");

    public final StringPath ebUb = createString("ebUb");

    public final NumberPath<Long> encaiss = createNumber("encaiss", Long.class);

    public final StringPath entiteBudLib = createString("entiteBudLib");

    public final StringPath etab = createString("etab");

    public final DateTimePath<java.sql.Timestamp> factureDate = createDateTime("factureDate", java.sql.Timestamp.class);

    public final StringPath factureLib = createString("factureLib");

    public final NumberPath<Long> factureNum = createNumber("factureNum", Long.class);

    public final StringPath factureRef = createString("factureRef");

    public final StringPath imput = createString("imput");

    public final StringPath imputContrepart = createString("imputContrepart");

    public final StringPath imputContrepartLib = createString("imputContrepartLib");

    public final StringPath imputLib = createString("imputLib");

    public final StringPath natureRecCode = createString("natureRecCode");

    public final StringPath natureRecLib = createString("natureRecLib");

    public final StringPath oper = createString("oper");

    public final StringPath origineRecCode = createString("origineRecCode");

    public final StringPath origineRecLib = createString("origineRecLib");

    public final StringPath rappro = createString("rappro");

    public final DateTimePath<java.sql.Timestamp> recetteDateCrea = createDateTime("recetteDateCrea", java.sql.Timestamp.class);

    public final StringPath recetteEtat = createString("recetteEtat");

    public final NumberPath<java.math.BigDecimal> recetteHt = createNumber("recetteHt", java.math.BigDecimal.class);

    public final NumberPath<Long> recetteId = createNumber("recetteId", Long.class);

    public final StringPath recetteLib = createString("recetteLib");

    public final NumberPath<Long> recetteNumero = createNumber("recetteNumero", Long.class);

    public final NumberPath<Long> recetteReduite = createNumber("recetteReduite", Long.class);

    public final NumberPath<java.math.BigDecimal> recetteTtc = createNumber("recetteTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recetteTva = createNumber("recetteTva", java.math.BigDecimal.class);

    public final StringPath recetteType = createString("recetteType");

    public final NumberPath<Integer> recExeOrdre = createNumber("recExeOrdre", Integer.class);

    public final NumberPath<Long> recIdAdmEb = createNumber("recIdAdmEb", Long.class);

    public final StringPath recouvrementMode = createString("recouvrementMode");

    public final StringPath rela = createString("rela");

    public final NumberPath<Long> resteARecou = createNumber("resteARecou", Long.class);

    public final StringPath sousCr = createString("sousCr");

    public final DateTimePath<java.sql.Timestamp> titDateCrea = createDateTime("titDateCrea", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> titDateVisa = createDateTime("titDateVisa", java.sql.Timestamp.class);

    public final StringPath titEtat = createString("titEtat");

    public final NumberPath<java.math.BigDecimal> titHt = createNumber("titHt", java.math.BigDecimal.class);

    public final NumberPath<Long> titNumero = createNumber("titNumero", Long.class);

    public final NumberPath<java.math.BigDecimal> titTtc = createNumber("titTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> titTva = createNumber("titTva", java.math.BigDecimal.class);

    public final StringPath ub = createString("ub");

    public final NumberPath<Long> visaNumEcriture = createNumber("visaNumEcriture", Long.class);

    public QVSitRecetteTitreVisaCtp(String variable) {
        super(QVSitRecetteTitreVisaCtp.class, forVariable(variable), "GFC", "V_SIT_RECETTE_TITRE_VISA_CTP");
        addMetadata();
    }

    public QVSitRecetteTitreVisaCtp(String variable, String schema, String table) {
        super(QVSitRecetteTitreVisaCtp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVSitRecetteTitreVisaCtp(Path<? extends QVSitRecetteTitreVisaCtp> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_SIT_RECETTE_TITRE_VISA_CTP");
        addMetadata();
    }

    public QVSitRecetteTitreVisaCtp(PathMetadata metadata) {
        super(QVSitRecetteTitreVisaCtp.class, metadata, "GFC", "V_SIT_RECETTE_TITRE_VISA_CTP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(clientCode, ColumnMetadata.named("CLIENT_CODE").withIndex(11).ofType(Types.VARCHAR).withSize(10));
        addMetadata(clientLib, ColumnMetadata.named("CLIENT_LIB").withIndex(12).ofType(Types.VARCHAR).withSize(200));
        addMetadata(codeAna, ColumnMetadata.named("CODE_ANA").withIndex(28).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(cr, ColumnMetadata.named("CR").withIndex(15).ofType(Types.VARCHAR).withSize(50));
        addMetadata(ebCr, ColumnMetadata.named("EB_CR").withIndex(48).ofType(Types.VARCHAR).withSize(50));
        addMetadata(ebEtab, ColumnMetadata.named("EB_ETAB").withIndex(46).ofType(Types.VARCHAR).withSize(10));
        addMetadata(ebSouscr, ColumnMetadata.named("EB_SOUSCR").withIndex(49).ofType(Types.VARCHAR).withSize(50));
        addMetadata(ebUb, ColumnMetadata.named("EB_UB").withIndex(47).ofType(Types.VARCHAR).withSize(10));
        addMetadata(encaiss, ColumnMetadata.named("ENCAISS").withIndex(43).ofType(Types.DECIMAL).withSize(0));
        addMetadata(entiteBudLib, ColumnMetadata.named("ENTITE_BUD_LIB").withIndex(17).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(etab, ColumnMetadata.named("ETAB").withIndex(13).ofType(Types.VARCHAR).withSize(10));
        addMetadata(factureDate, ColumnMetadata.named("FACTURE_DATE").withIndex(32).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(factureLib, ColumnMetadata.named("FACTURE_LIB").withIndex(30).ofType(Types.VARCHAR).withSize(500));
        addMetadata(factureNum, ColumnMetadata.named("FACTURE_NUM").withIndex(29).ofType(Types.DECIMAL).withSize(0));
        addMetadata(factureRef, ColumnMetadata.named("FACTURE_REF").withIndex(31).ofType(Types.VARCHAR).withSize(100));
        addMetadata(imput, ColumnMetadata.named("IMPUT").withIndex(22).ofType(Types.VARCHAR).withSize(20));
        addMetadata(imputContrepart, ColumnMetadata.named("IMPUT_CONTREPART").withIndex(24).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(imputContrepartLib, ColumnMetadata.named("IMPUT_CONTREPART_LIB").withIndex(25).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(imputLib, ColumnMetadata.named("IMPUT_LIB").withIndex(23).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(natureRecCode, ColumnMetadata.named("NATURE_REC_CODE").withIndex(18).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(natureRecLib, ColumnMetadata.named("NATURE_REC_LIB").withIndex(19).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(oper, ColumnMetadata.named("OPER").withIndex(27).ofType(Types.VARCHAR).withSize(57));
        addMetadata(origineRecCode, ColumnMetadata.named("ORIGINE_REC_CODE").withIndex(20).ofType(Types.VARCHAR).withSize(7).notNull());
        addMetadata(origineRecLib, ColumnMetadata.named("ORIGINE_REC_LIB").withIndex(21).ofType(Types.VARCHAR).withSize(120).notNull());
        addMetadata(rappro, ColumnMetadata.named("RAPPRO").withIndex(42).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(recetteDateCrea, ColumnMetadata.named("RECETTE_DATE_CREA").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(recetteEtat, ColumnMetadata.named("RECETTE_ETAT").withIndex(6).ofType(Types.VARCHAR).withSize(50));
        addMetadata(recetteHt, ColumnMetadata.named("RECETTE_HT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recetteId, ColumnMetadata.named("RECETTE_ID").withIndex(50).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recetteLib, ColumnMetadata.named("RECETTE_LIB").withIndex(4).ofType(Types.VARCHAR).withSize(500));
        addMetadata(recetteNumero, ColumnMetadata.named("RECETTE_NUMERO").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recetteReduite, ColumnMetadata.named("RECETTE_REDUITE").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(recetteTtc, ColumnMetadata.named("RECETTE_TTC").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recetteTva, ColumnMetadata.named("RECETTE_TVA").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recetteType, ColumnMetadata.named("RECETTE_TYPE").withIndex(3).ofType(Types.VARCHAR).withSize(9));
        addMetadata(recExeOrdre, ColumnMetadata.named("REC_EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(recIdAdmEb, ColumnMetadata.named("REC_ID_ADM_EB").withIndex(45).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(recouvrementMode, ColumnMetadata.named("RECOUVREMENT_MODE").withIndex(26).ofType(Types.VARCHAR).withSize(200));
        addMetadata(rela, ColumnMetadata.named("RELA").withIndex(44).ofType(Types.VARCHAR).withSize(46));
        addMetadata(resteARecou, ColumnMetadata.named("RESTE_A_RECOU").withIndex(41).ofType(Types.DECIMAL).withSize(0));
        addMetadata(sousCr, ColumnMetadata.named("SOUS_CR").withIndex(16).ofType(Types.VARCHAR).withSize(50));
        addMetadata(titDateCrea, ColumnMetadata.named("TIT_DATE_CREA").withIndex(34).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(titDateVisa, ColumnMetadata.named("TIT_DATE_VISA").withIndex(36).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(titEtat, ColumnMetadata.named("TIT_ETAT").withIndex(35).ofType(Types.VARCHAR).withSize(50));
        addMetadata(titHt, ColumnMetadata.named("TIT_HT").withIndex(37).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(titNumero, ColumnMetadata.named("TIT_NUMERO").withIndex(33).ofType(Types.DECIMAL).withSize(0));
        addMetadata(titTtc, ColumnMetadata.named("TIT_TTC").withIndex(39).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(titTva, ColumnMetadata.named("TIT_TVA").withIndex(38).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(ub, ColumnMetadata.named("UB").withIndex(14).ofType(Types.VARCHAR).withSize(10));
        addMetadata(visaNumEcriture, ColumnMetadata.named("VISA_NUM_ECRITURE").withIndex(40).ofType(Types.DECIMAL).withSize(0));
    }

}


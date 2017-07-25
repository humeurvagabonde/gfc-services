package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVSitCptbudEcriture is a Querydsl query type for QVSitCptbudEcriture
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVSitCptbudEcriture extends com.querydsl.sql.RelationalPathBase<QVSitCptbudEcriture> {

    private static final long serialVersionUID = 1857093317;

    public static final QVSitCptbudEcriture vSitCptbudEcriture = new QVSitCptbudEcriture("V_SIT_CPTBUD_ECRITURE");

    public final StringPath abrDest = createString("abrDest");

    public final StringPath abrDestN0 = createString("abrDestN0");

    public final StringPath abrOrig = createString("abrOrig");

    public final StringPath abrOrigN0 = createString("abrOrigN0");

    public final NumberPath<java.math.BigDecimal> aeCredit = createNumber("aeCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeDebit = createNumber("aeDebit", java.math.BigDecimal.class);

    public final StringPath codeDest = createString("codeDest");

    public final StringPath codeDestN0 = createString("codeDestN0");

    public final StringPath codeNature = createString("codeNature");

    public final StringPath codeOrig = createString("codeOrig");

    public final StringPath codeOrigN0 = createString("codeOrigN0");

    public final NumberPath<java.math.BigDecimal> cpCredit = createNumber("cpCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpDebit = createNumber("cpDebit", java.math.BigDecimal.class);

    public final StringPath ebCr = createString("ebCr");

    public final StringPath ebEtab = createString("ebEtab");

    public final StringPath ebN1TnbCode = createString("ebN1TnbCode");

    public final StringPath ebN1TnbLibelle = createString("ebN1TnbLibelle");

    public final StringPath ebSouscr = createString("ebSouscr");

    public final StringPath ebUb = createString("ebUb");

    public final StringPath ecrDate = createString("ecrDate");

    public final NumberPath<Long> ecrNumero = createNumber("ecrNumero", Long.class);

    public final StringPath ecrType = createString("ecrType");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> idAdmOrigineRecette = createNumber("idAdmOrigineRecette", Long.class);

    public final NumberPath<Long> idCptbudEvent = createNumber("idCptbudEvent", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final StringPath libDest = createString("libDest");

    public final StringPath libDestN0 = createString("libDestN0");

    public final StringPath libNatDep = createString("libNatDep");

    public final StringPath libNatRec = createString("libNatRec");

    public final StringPath libOpe = createString("libOpe");

    public final StringPath libOrig = createString("libOrig");

    public final StringPath libOrigN0 = createString("libOrigN0");

    public final NumberPath<Long> lotNumero = createNumber("lotNumero", Long.class);

    public final StringPath nomPrenom = createString("nomPrenom");

    public final StringPath numOpe = createString("numOpe");

    public final StringPath opeFlechee = createString("opeFlechee");

    public final NumberPath<java.math.BigDecimal> recCredit = createNumber("recCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recDebit = createNumber("recDebit", java.math.BigDecimal.class);

    public final StringPath section = createString("section");

    public final StringPath typeNatRec = createString("typeNatRec");

    public final StringPath typeNature = createString("typeNature");

    public final StringPath typeOpe = createString("typeOpe");

    public QVSitCptbudEcriture(String variable) {
        super(QVSitCptbudEcriture.class, forVariable(variable), "GFC", "V_SIT_CPTBUD_ECRITURE");
        addMetadata();
    }

    public QVSitCptbudEcriture(String variable, String schema, String table) {
        super(QVSitCptbudEcriture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVSitCptbudEcriture(Path<? extends QVSitCptbudEcriture> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_SIT_CPTBUD_ECRITURE");
        addMetadata();
    }

    public QVSitCptbudEcriture(PathMetadata metadata) {
        super(QVSitCptbudEcriture.class, metadata, "GFC", "V_SIT_CPTBUD_ECRITURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(abrDest, ColumnMetadata.named("ABR_DEST").withIndex(26).ofType(Types.VARCHAR).withSize(20));
        addMetadata(abrDestN0, ColumnMetadata.named("ABR_DEST_N0").withIndex(29).ofType(Types.VARCHAR).withSize(20));
        addMetadata(abrOrig, ColumnMetadata.named("ABR_ORIG").withIndex(19).ofType(Types.VARCHAR).withSize(20));
        addMetadata(abrOrigN0, ColumnMetadata.named("ABR_ORIG_N0").withIndex(22).ofType(Types.VARCHAR).withSize(20));
        addMetadata(aeCredit, ColumnMetadata.named("AE_CREDIT").withIndex(40).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeDebit, ColumnMetadata.named("AE_DEBIT").withIndex(39).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(codeDest, ColumnMetadata.named("CODE_DEST").withIndex(25).ofType(Types.VARCHAR).withSize(20));
        addMetadata(codeDestN0, ColumnMetadata.named("CODE_DEST_N0").withIndex(28).ofType(Types.VARCHAR).withSize(20));
        addMetadata(codeNature, ColumnMetadata.named("CODE_NATURE").withIndex(34).ofType(Types.VARCHAR).withSize(5));
        addMetadata(codeOrig, ColumnMetadata.named("CODE_ORIG").withIndex(18).ofType(Types.VARCHAR).withSize(7));
        addMetadata(codeOrigN0, ColumnMetadata.named("CODE_ORIG_N0").withIndex(21).ofType(Types.VARCHAR).withSize(7));
        addMetadata(cpCredit, ColumnMetadata.named("CP_CREDIT").withIndex(42).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpDebit, ColumnMetadata.named("CP_DEBIT").withIndex(41).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(ebCr, ColumnMetadata.named("EB_CR").withIndex(8).ofType(Types.VARCHAR).withSize(50));
        addMetadata(ebEtab, ColumnMetadata.named("EB_ETAB").withIndex(6).ofType(Types.VARCHAR).withSize(10));
        addMetadata(ebN1TnbCode, ColumnMetadata.named("EB_N1_TNB_CODE").withIndex(10).ofType(Types.VARCHAR).withSize(30));
        addMetadata(ebN1TnbLibelle, ColumnMetadata.named("EB_N1_TNB_LIBELLE").withIndex(11).ofType(Types.VARCHAR).withSize(50));
        addMetadata(ebSouscr, ColumnMetadata.named("EB_SOUSCR").withIndex(9).ofType(Types.VARCHAR).withSize(50));
        addMetadata(ebUb, ColumnMetadata.named("EB_UB").withIndex(7).ofType(Types.VARCHAR).withSize(10));
        addMetadata(ecrDate, ColumnMetadata.named("ECR_DATE").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(ecrNumero, ColumnMetadata.named("ECR_NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(ecrType, ColumnMetadata.named("ECR_TYPE").withIndex(45).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(24).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(36).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(37).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmOrigineRecette, ColumnMetadata.named("ID_ADM_ORIGINE_RECETTE").withIndex(17).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idCptbudEvent, ColumnMetadata.named("ID_CPTBUD_EVENT").withIndex(46).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(12).ofType(Types.DECIMAL).withSize(38));
        addMetadata(libDest, ColumnMetadata.named("LIB_DEST").withIndex(27).ofType(Types.VARCHAR).withSize(200));
        addMetadata(libDestN0, ColumnMetadata.named("LIB_DEST_N0").withIndex(30).ofType(Types.VARCHAR).withSize(200));
        addMetadata(libNatDep, ColumnMetadata.named("LIB_NAT_DEP").withIndex(32).ofType(Types.VARCHAR).withSize(5));
        addMetadata(libNatRec, ColumnMetadata.named("LIB_NAT_REC").withIndex(33).ofType(Types.VARCHAR).withSize(200));
        addMetadata(libOpe, ColumnMetadata.named("LIB_OPE").withIndex(14).ofType(Types.VARCHAR).withSize(500));
        addMetadata(libOrig, ColumnMetadata.named("LIB_ORIG").withIndex(20).ofType(Types.VARCHAR).withSize(120));
        addMetadata(libOrigN0, ColumnMetadata.named("LIB_ORIG_N0").withIndex(23).ofType(Types.VARCHAR).withSize(120));
        addMetadata(lotNumero, ColumnMetadata.named("LOT_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(nomPrenom, ColumnMetadata.named("NOM_PRENOM").withIndex(47).ofType(Types.VARCHAR).withSize(121));
        addMetadata(numOpe, ColumnMetadata.named("NUM_OPE").withIndex(13).ofType(Types.VARCHAR).withSize(57));
        addMetadata(opeFlechee, ColumnMetadata.named("OPE_FLECHEE").withIndex(15).ofType(Types.CHAR).withSize(1));
        addMetadata(recCredit, ColumnMetadata.named("REC_CREDIT").withIndex(44).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(recDebit, ColumnMetadata.named("REC_DEBIT").withIndex(43).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(section, ColumnMetadata.named("SECTION").withIndex(38).ofType(Types.VARCHAR).withSize(1));
        addMetadata(typeNatRec, ColumnMetadata.named("TYPE_NAT_REC").withIndex(35).ofType(Types.VARCHAR).withSize(10));
        addMetadata(typeNature, ColumnMetadata.named("TYPE_NATURE").withIndex(31).ofType(Types.VARCHAR).withSize(7));
        addMetadata(typeOpe, ColumnMetadata.named("TYPE_OPE").withIndex(16).ofType(Types.VARCHAR).withSize(500));
    }

}


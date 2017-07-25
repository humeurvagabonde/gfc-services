package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVSitCptbudEcritureAe is a Querydsl query type for QVSitCptbudEcritureAe
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVSitCptbudEcritureAe extends com.querydsl.sql.RelationalPathBase<QVSitCptbudEcritureAe> {

    private static final long serialVersionUID = -2039715383;

    public static final QVSitCptbudEcritureAe vSitCptbudEcritureAe = new QVSitCptbudEcritureAe("V_SIT_CPTBUD_ECRITURE_AE");

    public final StringPath abrDest = createString("abrDest");

    public final NumberPath<java.math.BigDecimal> aeCredit = createNumber("aeCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeDebit = createNumber("aeDebit", java.math.BigDecimal.class);

    public final StringPath codeDest = createString("codeDest");

    public final StringPath codeNature = createString("codeNature");

    public final StringPath ebCr = createString("ebCr");

    public final StringPath ebEtab = createString("ebEtab");

    public final StringPath ebSouscr = createString("ebSouscr");

    public final StringPath ebUb = createString("ebUb");

    public final StringPath ecrDate = createString("ecrDate");

    public final NumberPath<Long> ecrNumero = createNumber("ecrNumero", Long.class);

    public final StringPath ecrType = createString("ecrType");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idCptbudEcriture = createNumber("idCptbudEcriture", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final StringPath libDest = createString("libDest");

    public final StringPath libEvent = createString("libEvent");

    public final StringPath libNatDep = createString("libNatDep");

    public final StringPath libOpe = createString("libOpe");

    public final NumberPath<Long> lotNumero = createNumber("lotNumero", Long.class);

    public final StringPath nomPrenom = createString("nomPrenom");

    public final StringPath numOpe = createString("numOpe");

    public final StringPath opeFlechee = createString("opeFlechee");

    public final StringPath pilotageOpe = createString("pilotageOpe");

    public final StringPath typeOpe = createString("typeOpe");

    public QVSitCptbudEcritureAe(String variable) {
        super(QVSitCptbudEcritureAe.class, forVariable(variable), "GFC", "V_SIT_CPTBUD_ECRITURE_AE");
        addMetadata();
    }

    public QVSitCptbudEcritureAe(String variable, String schema, String table) {
        super(QVSitCptbudEcritureAe.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVSitCptbudEcritureAe(Path<? extends QVSitCptbudEcritureAe> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_SIT_CPTBUD_ECRITURE_AE");
        addMetadata();
    }

    public QVSitCptbudEcritureAe(PathMetadata metadata) {
        super(QVSitCptbudEcritureAe.class, metadata, "GFC", "V_SIT_CPTBUD_ECRITURE_AE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(abrDest, ColumnMetadata.named("ABR_DEST").withIndex(20).ofType(Types.VARCHAR).withSize(20));
        addMetadata(aeCredit, ColumnMetadata.named("AE_CREDIT").withIndex(25).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeDebit, ColumnMetadata.named("AE_DEBIT").withIndex(26).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(codeDest, ColumnMetadata.named("CODE_DEST").withIndex(19).ofType(Types.VARCHAR).withSize(20));
        addMetadata(codeNature, ColumnMetadata.named("CODE_NATURE").withIndex(23).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(ebCr, ColumnMetadata.named("EB_CR").withIndex(10).ofType(Types.VARCHAR).withSize(50));
        addMetadata(ebEtab, ColumnMetadata.named("EB_ETAB").withIndex(8).ofType(Types.VARCHAR).withSize(10));
        addMetadata(ebSouscr, ColumnMetadata.named("EB_SOUSCR").withIndex(11).ofType(Types.VARCHAR).withSize(50));
        addMetadata(ebUb, ColumnMetadata.named("EB_UB").withIndex(9).ofType(Types.VARCHAR).withSize(10));
        addMetadata(ecrDate, ColumnMetadata.named("ECR_DATE").withIndex(3).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(ecrNumero, ColumnMetadata.named("ECR_NUMERO").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(ecrType, ColumnMetadata.named("ECR_TYPE").withIndex(27).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(18).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(7).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(24).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idCptbudEcriture, ColumnMetadata.named("ID_CPTBUD_ECRITURE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(12).ofType(Types.DECIMAL).withSize(38));
        addMetadata(libDest, ColumnMetadata.named("LIB_DEST").withIndex(21).ofType(Types.VARCHAR).withSize(200));
        addMetadata(libEvent, ColumnMetadata.named("LIB_EVENT").withIndex(6).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(libNatDep, ColumnMetadata.named("LIB_NAT_DEP").withIndex(22).ofType(Types.VARCHAR).withSize(500));
        addMetadata(libOpe, ColumnMetadata.named("LIB_OPE").withIndex(14).ofType(Types.VARCHAR).withSize(500));
        addMetadata(lotNumero, ColumnMetadata.named("LOT_NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(nomPrenom, ColumnMetadata.named("NOM_PRENOM").withIndex(28).ofType(Types.VARCHAR).withSize(121));
        addMetadata(numOpe, ColumnMetadata.named("NUM_OPE").withIndex(13).ofType(Types.VARCHAR).withSize(57));
        addMetadata(opeFlechee, ColumnMetadata.named("OPE_FLECHEE").withIndex(15).ofType(Types.CHAR).withSize(1));
        addMetadata(pilotageOpe, ColumnMetadata.named("PILOTAGE_OPE").withIndex(16).ofType(Types.VARCHAR).withSize(20));
        addMetadata(typeOpe, ColumnMetadata.named("TYPE_OPE").withIndex(17).ofType(Types.VARCHAR).withSize(500));
    }

}


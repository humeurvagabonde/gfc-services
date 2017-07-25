package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptbudEcriture is a Querydsl query type for QCptbudEcriture
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptbudEcriture extends com.querydsl.sql.RelationalPathBase<QCptbudEcriture> {

    private static final long serialVersionUID = 2125401373;

    public static final QCptbudEcriture cptbudEcriture = new QCptbudEcriture("CPTBUD_ECRITURE");

    public final NumberPath<java.math.BigDecimal> aeCredit = createNumber("aeCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeDebit = createNumber("aeDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpCredit = createNumber("cpCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpDebit = createNumber("cpDebit", java.math.BigDecimal.class);

    public final StringPath dCreation = createString("dCreation");

    public final StringPath ecrDate = createString("ecrDate");

    public final NumberPath<Long> ecrNumero = createNumber("ecrNumero", Long.class);

    public final StringPath ecrType = createString("ecrType");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> idAdmOrigineRecette = createNumber("idAdmOrigineRecette", Long.class);

    public final NumberPath<Long> idCptbudEcriture = createNumber("idCptbudEcriture", Long.class);

    public final NumberPath<Long> idCptbudEvent = createNumber("idCptbudEvent", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> lotId = createNumber("lotId", Long.class);

    public final NumberPath<Long> lotNumero = createNumber("lotNumero", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<java.math.BigDecimal> recCredit = createNumber("recCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recDebit = createNumber("recDebit", java.math.BigDecimal.class);

    public final StringPath section = createString("section");

    public final com.querydsl.sql.PrimaryKey<QCptbudEcriture> cptbudEcriturePk = createPrimaryKey(idCptbudEcriture);

    public QCptbudEcriture(String variable) {
        super(QCptbudEcriture.class, forVariable(variable), "GFC", "CPTBUD_ECRITURE");
        addMetadata();
    }

    public QCptbudEcriture(String variable, String schema, String table) {
        super(QCptbudEcriture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptbudEcriture(Path<? extends QCptbudEcriture> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTBUD_ECRITURE");
        addMetadata();
    }

    public QCptbudEcriture(PathMetadata metadata) {
        super(QCptbudEcriture.class, metadata, "GFC", "CPTBUD_ECRITURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeCredit, ColumnMetadata.named("AE_CREDIT").withIndex(15).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeDebit, ColumnMetadata.named("AE_DEBIT").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpCredit, ColumnMetadata.named("CP_CREDIT").withIndex(17).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpDebit, ColumnMetadata.named("CP_DEBIT").withIndex(16).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(21).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(ecrDate, ColumnMetadata.named("ECR_DATE").withIndex(6).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(ecrNumero, ColumnMetadata.named("ECR_NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(ecrType, ColumnMetadata.named("ECR_TYPE").withIndex(23).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(10).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(7).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(9).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(11).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmOrigineRecette, ColumnMetadata.named("ID_ADM_ORIGINE_RECETTE").withIndex(12).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idCptbudEcriture, ColumnMetadata.named("ID_CPTBUD_ECRITURE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idCptbudEvent, ColumnMetadata.named("ID_CPTBUD_EVENT").withIndex(20).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(8).ofType(Types.DECIMAL).withSize(38));
        addMetadata(lotId, ColumnMetadata.named("LOT_ID").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(lotNumero, ColumnMetadata.named("LOT_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(22).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(recCredit, ColumnMetadata.named("REC_CREDIT").withIndex(19).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(recDebit, ColumnMetadata.named("REC_DEBIT").withIndex(18).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(section, ColumnMetadata.named("SECTION").withIndex(13).ofType(Types.VARCHAR).withSize(1));
    }

}


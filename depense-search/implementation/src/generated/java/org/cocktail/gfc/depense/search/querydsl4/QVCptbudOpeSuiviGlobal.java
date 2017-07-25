package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCptbudOpeSuiviGlobal is a Querydsl query type for QVCptbudOpeSuiviGlobal
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCptbudOpeSuiviGlobal extends com.querydsl.sql.RelationalPathBase<QVCptbudOpeSuiviGlobal> {

    private static final long serialVersionUID = 1678595151;

    public static final QVCptbudOpeSuiviGlobal vCptbudOpeSuiviGlobal = new QVCptbudOpeSuiviGlobal("V_CPTBUD_OPE_SUIVI_GLOBAL");

    public final NumberPath<java.math.BigDecimal> aeCredit = createNumber("aeCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeDebit = createNumber("aeDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeSolde = createNumber("aeSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpCredit = createNumber("cpCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpDebit = createNumber("cpDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpSolde = createNumber("cpSolde", java.math.BigDecimal.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> idAdmOrigineRecette = createNumber("idAdmOrigineRecette", Long.class);

    public final StringPath idCptbudOpeSuiviGlobal = createString("idCptbudOpeSuiviGlobal");

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final StringPath llOperation = createString("llOperation");

    public final StringPath opeNumero = createString("opeNumero");

    public final NumberPath<java.math.BigDecimal> recCredit = createNumber("recCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recDebit = createNumber("recDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recSolde = createNumber("recSolde", java.math.BigDecimal.class);

    public QVCptbudOpeSuiviGlobal(String variable) {
        super(QVCptbudOpeSuiviGlobal.class, forVariable(variable), "GFC", "V_CPTBUD_OPE_SUIVI_GLOBAL");
        addMetadata();
    }

    public QVCptbudOpeSuiviGlobal(String variable, String schema, String table) {
        super(QVCptbudOpeSuiviGlobal.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCptbudOpeSuiviGlobal(Path<? extends QVCptbudOpeSuiviGlobal> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CPTBUD_OPE_SUIVI_GLOBAL");
        addMetadata();
    }

    public QVCptbudOpeSuiviGlobal(PathMetadata metadata) {
        super(QVCptbudOpeSuiviGlobal.class, metadata, "GFC", "V_CPTBUD_OPE_SUIVI_GLOBAL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeCredit, ColumnMetadata.named("AE_CREDIT").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeDebit, ColumnMetadata.named("AE_DEBIT").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeSolde, ColumnMetadata.named("AE_SOLDE").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpCredit, ColumnMetadata.named("CP_CREDIT").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpDebit, ColumnMetadata.named("CP_DEBIT").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpSolde, ColumnMetadata.named("CP_SOLDE").withIndex(15).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(6).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(8).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmOrigineRecette, ColumnMetadata.named("ID_ADM_ORIGINE_RECETTE").withIndex(9).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idCptbudOpeSuiviGlobal, ColumnMetadata.named("ID_CPTBUD_OPE_SUIVI_GLOBAL").withIndex(1).ofType(Types.VARCHAR).withSize(242));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(llOperation, ColumnMetadata.named("LL_OPERATION").withIndex(5).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(opeNumero, ColumnMetadata.named("OPE_NUMERO").withIndex(4).ofType(Types.VARCHAR).withSize(57));
        addMetadata(recCredit, ColumnMetadata.named("REC_CREDIT").withIndex(16).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(recDebit, ColumnMetadata.named("REC_DEBIT").withIndex(17).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(recSolde, ColumnMetadata.named("REC_SOLDE").withIndex(18).ofType(Types.DECIMAL).withSize(12).withDigits(2));
    }

}


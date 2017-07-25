package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCptbudDepSoldeLim is a Querydsl query type for QVCptbudDepSoldeLim
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCptbudDepSoldeLim extends com.querydsl.sql.RelationalPathBase<QVCptbudDepSoldeLim> {

    private static final long serialVersionUID = 1891752344;

    public static final QVCptbudDepSoldeLim vCptbudDepSoldeLim = new QVCptbudDepSoldeLim("V_CPTBUD_DEP_SOLDE_LIM");

    public final NumberPath<java.math.BigDecimal> aeCredit = createNumber("aeCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeDebit = createNumber("aeDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeMutualiseSolde = createNumber("aeMutualiseSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeProgSolde = createNumber("aeProgSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeSolde = createNumber("aeSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeSoldeLimitatif = createNumber("aeSoldeLimitatif", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpCredit = createNumber("cpCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpDebit = createNumber("cpDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpMutualiseSolde = createNumber("cpMutualiseSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpProgSolde = createNumber("cpProgSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpSolde = createNumber("cpSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpSoldeLimitatif = createNumber("cpSoldeLimitatif", java.math.BigDecimal.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmEbLimitativeAe = createNumber("idAdmEbLimitativeAe", Long.class);

    public final NumberPath<Long> idAdmEbLimitativeCp = createNumber("idAdmEbLimitativeCp", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final StringPath opeCodeModePilotage = createString("opeCodeModePilotage");

    public QVCptbudDepSoldeLim(String variable) {
        super(QVCptbudDepSoldeLim.class, forVariable(variable), "GFC", "V_CPTBUD_DEP_SOLDE_LIM");
        addMetadata();
    }

    public QVCptbudDepSoldeLim(String variable, String schema, String table) {
        super(QVCptbudDepSoldeLim.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCptbudDepSoldeLim(Path<? extends QVCptbudDepSoldeLim> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CPTBUD_DEP_SOLDE_LIM");
        addMetadata();
    }

    public QVCptbudDepSoldeLim(PathMetadata metadata) {
        super(QVCptbudDepSoldeLim.class, metadata, "GFC", "V_CPTBUD_DEP_SOLDE_LIM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeCredit, ColumnMetadata.named("AE_CREDIT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeDebit, ColumnMetadata.named("AE_DEBIT").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeMutualiseSolde, ColumnMetadata.named("AE_MUTUALISE_SOLDE").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeProgSolde, ColumnMetadata.named("AE_PROG_SOLDE").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeSolde, ColumnMetadata.named("AE_SOLDE").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeSoldeLimitatif, ColumnMetadata.named("AE_SOLDE_LIMITATIF").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpCredit, ColumnMetadata.named("CP_CREDIT").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpDebit, ColumnMetadata.named("CP_DEBIT").withIndex(15).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpMutualiseSolde, ColumnMetadata.named("CP_MUTUALISE_SOLDE").withIndex(17).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpProgSolde, ColumnMetadata.named("CP_PROG_SOLDE").withIndex(18).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpSolde, ColumnMetadata.named("CP_SOLDE").withIndex(16).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpSoldeLimitatif, ColumnMetadata.named("CP_SOLDE_LIMITATIF").withIndex(19).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmEbLimitativeAe, ColumnMetadata.named("ID_ADM_EB_LIMITATIVE_AE").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmEbLimitativeCp, ColumnMetadata.named("ID_ADM_EB_LIMITATIVE_CP").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(opeCodeModePilotage, ColumnMetadata.named("OPE_CODE_MODE_PILOTAGE").withIndex(5).ofType(Types.VARCHAR).withSize(20));
    }

}


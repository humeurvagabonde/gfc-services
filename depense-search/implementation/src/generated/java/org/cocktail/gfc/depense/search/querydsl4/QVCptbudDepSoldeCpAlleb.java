package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCptbudDepSoldeCpAlleb is a Querydsl query type for QVCptbudDepSoldeCpAlleb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCptbudDepSoldeCpAlleb extends com.querydsl.sql.RelationalPathBase<QVCptbudDepSoldeCpAlleb> {

    private static final long serialVersionUID = 1345049753;

    public static final QVCptbudDepSoldeCpAlleb vCptbudDepSoldeCpAlleb = new QVCptbudDepSoldeCpAlleb("V_CPTBUD_DEP_SOLDE_CP_ALLEB");

    public final NumberPath<java.math.BigDecimal> cpCredit = createNumber("cpCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpDebit = createNumber("cpDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpMutualiseSolde = createNumber("cpMutualiseSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpProgSolde = createNumber("cpProgSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpSolde = createNumber("cpSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpSoldeLimitatif = createNumber("cpSoldeLimitatif", java.math.BigDecimal.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmEbLimitativeCp = createNumber("idAdmEbLimitativeCp", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final StringPath opeCodeModePilotage = createString("opeCodeModePilotage");

    public QVCptbudDepSoldeCpAlleb(String variable) {
        super(QVCptbudDepSoldeCpAlleb.class, forVariable(variable), "GFC", "V_CPTBUD_DEP_SOLDE_CP_ALLEB");
        addMetadata();
    }

    public QVCptbudDepSoldeCpAlleb(String variable, String schema, String table) {
        super(QVCptbudDepSoldeCpAlleb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCptbudDepSoldeCpAlleb(Path<? extends QVCptbudDepSoldeCpAlleb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CPTBUD_DEP_SOLDE_CP_ALLEB");
        addMetadata();
    }

    public QVCptbudDepSoldeCpAlleb(PathMetadata metadata) {
        super(QVCptbudDepSoldeCpAlleb.class, metadata, "GFC", "V_CPTBUD_DEP_SOLDE_CP_ALLEB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cpCredit, ColumnMetadata.named("CP_CREDIT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpDebit, ColumnMetadata.named("CP_DEBIT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpMutualiseSolde, ColumnMetadata.named("CP_MUTUALISE_SOLDE").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpProgSolde, ColumnMetadata.named("CP_PROG_SOLDE").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpSolde, ColumnMetadata.named("CP_SOLDE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpSoldeLimitatif, ColumnMetadata.named("CP_SOLDE_LIMITATIF").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmEbLimitativeCp, ColumnMetadata.named("ID_ADM_EB_LIMITATIVE_CP").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(opeCodeModePilotage, ColumnMetadata.named("OPE_CODE_MODE_PILOTAGE").withIndex(5).ofType(Types.VARCHAR).withSize(20));
    }

}


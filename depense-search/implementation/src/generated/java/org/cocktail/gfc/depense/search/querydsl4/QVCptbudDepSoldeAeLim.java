package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCptbudDepSoldeAeLim is a Querydsl query type for QVCptbudDepSoldeAeLim
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCptbudDepSoldeAeLim extends com.querydsl.sql.RelationalPathBase<QVCptbudDepSoldeAeLim> {

    private static final long serialVersionUID = 1192530132;

    public static final QVCptbudDepSoldeAeLim vCptbudDepSoldeAeLim = new QVCptbudDepSoldeAeLim("V_CPTBUD_DEP_SOLDE_AE_LIM");

    public final NumberPath<java.math.BigDecimal> aeCredit = createNumber("aeCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeDebit = createNumber("aeDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeMutualiseSolde = createNumber("aeMutualiseSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeProgSolde = createNumber("aeProgSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeSolde = createNumber("aeSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeSoldeLimitatif = createNumber("aeSoldeLimitatif", java.math.BigDecimal.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmEbLimitativeAe = createNumber("idAdmEbLimitativeAe", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final StringPath opeCodeModePilotage = createString("opeCodeModePilotage");

    public QVCptbudDepSoldeAeLim(String variable) {
        super(QVCptbudDepSoldeAeLim.class, forVariable(variable), "GFC", "V_CPTBUD_DEP_SOLDE_AE_LIM");
        addMetadata();
    }

    public QVCptbudDepSoldeAeLim(String variable, String schema, String table) {
        super(QVCptbudDepSoldeAeLim.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCptbudDepSoldeAeLim(Path<? extends QVCptbudDepSoldeAeLim> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CPTBUD_DEP_SOLDE_AE_LIM");
        addMetadata();
    }

    public QVCptbudDepSoldeAeLim(PathMetadata metadata) {
        super(QVCptbudDepSoldeAeLim.class, metadata, "GFC", "V_CPTBUD_DEP_SOLDE_AE_LIM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeCredit, ColumnMetadata.named("AE_CREDIT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeDebit, ColumnMetadata.named("AE_DEBIT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeMutualiseSolde, ColumnMetadata.named("AE_MUTUALISE_SOLDE").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeProgSolde, ColumnMetadata.named("AE_PROG_SOLDE").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeSolde, ColumnMetadata.named("AE_SOLDE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeSoldeLimitatif, ColumnMetadata.named("AE_SOLDE_LIMITATIF").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEbLimitativeAe, ColumnMetadata.named("ID_ADM_EB_LIMITATIVE_AE").withIndex(9).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(opeCodeModePilotage, ColumnMetadata.named("OPE_CODE_MODE_PILOTAGE").withIndex(5).ofType(Types.VARCHAR).withSize(20));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptbudDepSoldeAe is a Querydsl query type for QCptbudDepSoldeAe
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptbudDepSoldeAe extends com.querydsl.sql.RelationalPathBase<QCptbudDepSoldeAe> {

    private static final long serialVersionUID = 1590088154;

    public static final QCptbudDepSoldeAe cptbudDepSoldeAe = new QCptbudDepSoldeAe("CPTBUD_DEP_SOLDE_AE");

    public final NumberPath<java.math.BigDecimal> aeCredit = createNumber("aeCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeDebit = createNumber("aeDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeMutualiseSolde = createNumber("aeMutualiseSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeProgSolde = createNumber("aeProgSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeSolde = createNumber("aeSolde", java.math.BigDecimal.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmEbLimitativeAe = createNumber("idAdmEbLimitativeAe", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idCptbudDepSoldeAe = createNumber("idCptbudDepSoldeAe", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final StringPath opeCodeModePilotage = createString("opeCodeModePilotage");

    public final com.querydsl.sql.PrimaryKey<QCptbudDepSoldeAe> idCptbudDepSoldeAePk = createPrimaryKey(idCptbudDepSoldeAe);

    public QCptbudDepSoldeAe(String variable) {
        super(QCptbudDepSoldeAe.class, forVariable(variable), "GFC", "CPTBUD_DEP_SOLDE_AE");
        addMetadata();
    }

    public QCptbudDepSoldeAe(String variable, String schema, String table) {
        super(QCptbudDepSoldeAe.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptbudDepSoldeAe(Path<? extends QCptbudDepSoldeAe> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTBUD_DEP_SOLDE_AE");
        addMetadata();
    }

    public QCptbudDepSoldeAe(PathMetadata metadata) {
        super(QCptbudDepSoldeAe.class, metadata, "GFC", "CPTBUD_DEP_SOLDE_AE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeCredit, ColumnMetadata.named("AE_CREDIT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeDebit, ColumnMetadata.named("AE_DEBIT").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeMutualiseSolde, ColumnMetadata.named("AE_MUTUALISE_SOLDE").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeProgSolde, ColumnMetadata.named("AE_PROG_SOLDE").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeSolde, ColumnMetadata.named("AE_SOLDE").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEbLimitativeAe, ColumnMetadata.named("ID_ADM_EB_LIMITATIVE_AE").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idCptbudDepSoldeAe, ColumnMetadata.named("ID_CPTBUD_DEP_SOLDE_AE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(opeCodeModePilotage, ColumnMetadata.named("OPE_CODE_MODE_PILOTAGE").withIndex(5).ofType(Types.VARCHAR).withSize(20));
    }

}


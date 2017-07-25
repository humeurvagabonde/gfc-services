package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCptbudDepSoldeTheor is a Querydsl query type for QVCptbudDepSoldeTheor
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCptbudDepSoldeTheor extends com.querydsl.sql.RelationalPathBase<QVCptbudDepSoldeTheor> {

    private static final long serialVersionUID = 1210190620;

    public static final QVCptbudDepSoldeTheor vCptbudDepSoldeTheor = new QVCptbudDepSoldeTheor("V_CPTBUD_DEP_SOLDE_THEOR");

    public final NumberPath<java.math.BigDecimal> aeCredit = createNumber("aeCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeDebit = createNumber("aeDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeSolde = createNumber("aeSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpCredit = createNumber("cpCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpDebit = createNumber("cpDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpSolde = createNumber("cpSolde", java.math.BigDecimal.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public QVCptbudDepSoldeTheor(String variable) {
        super(QVCptbudDepSoldeTheor.class, forVariable(variable), "GFC", "V_CPTBUD_DEP_SOLDE_THEOR");
        addMetadata();
    }

    public QVCptbudDepSoldeTheor(String variable, String schema, String table) {
        super(QVCptbudDepSoldeTheor.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCptbudDepSoldeTheor(Path<? extends QVCptbudDepSoldeTheor> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CPTBUD_DEP_SOLDE_THEOR");
        addMetadata();
    }

    public QVCptbudDepSoldeTheor(PathMetadata metadata) {
        super(QVCptbudDepSoldeTheor.class, metadata, "GFC", "V_CPTBUD_DEP_SOLDE_THEOR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeCredit, ColumnMetadata.named("AE_CREDIT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeDebit, ColumnMetadata.named("AE_DEBIT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeSolde, ColumnMetadata.named("AE_SOLDE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpCredit, ColumnMetadata.named("CP_CREDIT").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpDebit, ColumnMetadata.named("CP_DEBIT").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpSolde, ColumnMetadata.named("CP_SOLDE").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(3).ofType(Types.DECIMAL).withSize(38));
    }

}


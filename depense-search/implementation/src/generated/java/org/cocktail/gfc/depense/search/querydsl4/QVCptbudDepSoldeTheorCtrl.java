package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCptbudDepSoldeTheorCtrl is a Querydsl query type for QVCptbudDepSoldeTheorCtrl
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCptbudDepSoldeTheorCtrl extends com.querydsl.sql.RelationalPathBase<QVCptbudDepSoldeTheorCtrl> {

    private static final long serialVersionUID = 63919015;

    public static final QVCptbudDepSoldeTheorCtrl vCptbudDepSoldeTheorCtrl = new QVCptbudDepSoldeTheorCtrl("V_CPTBUD_DEP_SOLDE_THEOR_CTRL");

    public final NumberPath<java.math.BigDecimal> aeCredit = createNumber("aeCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeDebit = createNumber("aeDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeSolde = createNumber("aeSolde", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpCredit = createNumber("cpCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpDebit = createNumber("cpDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpSolde = createNumber("cpSolde", java.math.BigDecimal.class);

    public final StringPath destinationDepenseCode = createString("destinationDepenseCode");

    public final StringPath destinationDepenseLibelle = createString("destinationDepenseLibelle");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final StringPath llOperation = createString("llOperation");

    public final StringPath natureDepenseCode = createString("natureDepenseCode");

    public final StringPath natureDepenseLibelle = createString("natureDepenseLibelle");

    public final StringPath opeNumero = createString("opeNumero");

    public final StringPath orgCr = createString("orgCr");

    public final StringPath orgEtab = createString("orgEtab");

    public final StringPath orgSouscr = createString("orgSouscr");

    public final StringPath orgUb = createString("orgUb");

    public QVCptbudDepSoldeTheorCtrl(String variable) {
        super(QVCptbudDepSoldeTheorCtrl.class, forVariable(variable), "GFC", "V_CPTBUD_DEP_SOLDE_THEOR_CTRL");
        addMetadata();
    }

    public QVCptbudDepSoldeTheorCtrl(String variable, String schema, String table) {
        super(QVCptbudDepSoldeTheorCtrl.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCptbudDepSoldeTheorCtrl(Path<? extends QVCptbudDepSoldeTheorCtrl> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CPTBUD_DEP_SOLDE_THEOR_CTRL");
        addMetadata();
    }

    public QVCptbudDepSoldeTheorCtrl(PathMetadata metadata) {
        super(QVCptbudDepSoldeTheorCtrl.class, metadata, "GFC", "V_CPTBUD_DEP_SOLDE_THEOR_CTRL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeCredit, ColumnMetadata.named("AE_CREDIT").withIndex(16).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeDebit, ColumnMetadata.named("AE_DEBIT").withIndex(17).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeSolde, ColumnMetadata.named("AE_SOLDE").withIndex(18).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpCredit, ColumnMetadata.named("CP_CREDIT").withIndex(19).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpDebit, ColumnMetadata.named("CP_DEBIT").withIndex(20).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpSolde, ColumnMetadata.named("CP_SOLDE").withIndex(21).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(destinationDepenseCode, ColumnMetadata.named("DESTINATION_DEPENSE_CODE").withIndex(14).ofType(Types.VARCHAR).withSize(20));
        addMetadata(destinationDepenseLibelle, ColumnMetadata.named("DESTINATION_DEPENSE_LIBELLE").withIndex(15).ofType(Types.VARCHAR).withSize(200));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(13).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(10).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(llOperation, ColumnMetadata.named("LL_OPERATION").withIndex(9).ofType(Types.VARCHAR).withSize(500));
        addMetadata(natureDepenseCode, ColumnMetadata.named("NATURE_DEPENSE_CODE").withIndex(11).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(natureDepenseLibelle, ColumnMetadata.named("NATURE_DEPENSE_LIBELLE").withIndex(12).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(opeNumero, ColumnMetadata.named("OPE_NUMERO").withIndex(8).ofType(Types.VARCHAR).withSize(57));
        addMetadata(orgCr, ColumnMetadata.named("ORG_CR").withIndex(5).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgEtab, ColumnMetadata.named("ORG_ETAB").withIndex(3).ofType(Types.VARCHAR).withSize(10));
        addMetadata(orgSouscr, ColumnMetadata.named("ORG_SOUSCR").withIndex(6).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgUb, ColumnMetadata.named("ORG_UB").withIndex(4).ofType(Types.VARCHAR).withSize(10));
    }

}


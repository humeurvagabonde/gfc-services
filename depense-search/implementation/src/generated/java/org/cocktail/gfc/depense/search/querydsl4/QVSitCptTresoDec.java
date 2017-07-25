package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVSitCptTresoDec is a Querydsl query type for QVSitCptTresoDec
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVSitCptTresoDec extends com.querydsl.sql.RelationalPathBase<QVSitCptTresoDec> {

    private static final long serialVersionUID = 829963988;

    public static final QVSitCptTresoDec vSitCptTresoDec = new QVSitCptTresoDec("V_SIT_CPT_TRESO_DEC");

    public final NumberPath<java.math.BigDecimal> cpDebitDec = createNumber("cpDebitDec", java.math.BigDecimal.class);

    public final StringPath dateEcrDec = createString("dateEcrDec");

    public final StringPath dateOrder = createString("dateOrder");

    public final StringPath dpNumeroDec = createString("dpNumeroDec");

    public final StringPath ebCr = createString("ebCr");

    public final StringPath ebEtab = createString("ebEtab");

    public final StringPath ebSouscr = createString("ebSouscr");

    public final StringPath ebUb = createString("ebUb");

    public final StringPath etabDec = createString("etabDec");

    public final NumberPath<java.math.BigDecimal> montantBudDec = createNumber("montantBudDec", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTtcDec = createNumber("montantTtcDec", java.math.BigDecimal.class);

    public final NumberPath<Long> montantTvaDec = createNumber("montantTvaDec", Long.class);

    public final NumberPath<java.math.BigDecimal> tauxProrataDec = createNumber("tauxProrataDec", java.math.BigDecimal.class);

    public final DateTimePath<java.sql.Timestamp> thisDateCreaSearch = createDateTime("thisDateCreaSearch", java.sql.Timestamp.class);

    public final NumberPath<Integer> thisExeOrdre = createNumber("thisExeOrdre", Integer.class);

    public final NumberPath<Long> thisIdAdmEb = createNumber("thisIdAdmEb", Long.class);

    public final NumberPath<java.math.BigDecimal> tvaDecaisseeDec = createNumber("tvaDecaisseeDec", java.math.BigDecimal.class);

    public final StringPath ubDec = createString("ubDec");

    public QVSitCptTresoDec(String variable) {
        super(QVSitCptTresoDec.class, forVariable(variable), "GFC", "V_SIT_CPT_TRESO_DEC");
        addMetadata();
    }

    public QVSitCptTresoDec(String variable, String schema, String table) {
        super(QVSitCptTresoDec.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVSitCptTresoDec(Path<? extends QVSitCptTresoDec> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_SIT_CPT_TRESO_DEC");
        addMetadata();
    }

    public QVSitCptTresoDec(PathMetadata metadata) {
        super(QVSitCptTresoDec.class, metadata, "GFC", "V_SIT_CPT_TRESO_DEC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cpDebitDec, ColumnMetadata.named("CP_DEBIT_DEC").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(dateEcrDec, ColumnMetadata.named("DATE_ECR_DEC").withIndex(3).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(dateOrder, ColumnMetadata.named("DATE_ORDER").withIndex(18).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(dpNumeroDec, ColumnMetadata.named("DP_NUMERO_DEC").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(ebCr, ColumnMetadata.named("EB_CR").withIndex(15).ofType(Types.VARCHAR).withSize(50));
        addMetadata(ebEtab, ColumnMetadata.named("EB_ETAB").withIndex(13).ofType(Types.VARCHAR).withSize(10));
        addMetadata(ebSouscr, ColumnMetadata.named("EB_SOUSCR").withIndex(16).ofType(Types.VARCHAR).withSize(50));
        addMetadata(ebUb, ColumnMetadata.named("EB_UB").withIndex(14).ofType(Types.VARCHAR).withSize(10));
        addMetadata(etabDec, ColumnMetadata.named("ETAB_DEC").withIndex(4).ofType(Types.VARCHAR).withSize(10));
        addMetadata(montantBudDec, ColumnMetadata.named("MONTANT_BUD_DEC").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTtcDec, ColumnMetadata.named("MONTANT_TTC_DEC").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTvaDec, ColumnMetadata.named("MONTANT_TVA_DEC").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tauxProrataDec, ColumnMetadata.named("TAUX_PRORATA_DEC").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(thisDateCreaSearch, ColumnMetadata.named("THIS_DATE_CREA_SEARCH").withIndex(17).ofType(Types.TIMESTAMP).withSize(8));
        addMetadata(thisExeOrdre, ColumnMetadata.named("THIS_EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(thisIdAdmEb, ColumnMetadata.named("THIS_ID_ADM_EB").withIndex(12).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(tvaDecaisseeDec, ColumnMetadata.named("TVA_DECAISSEE_DEC").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ubDec, ColumnMetadata.named("UB_DEC").withIndex(5).ofType(Types.VARCHAR).withSize(10));
    }

}


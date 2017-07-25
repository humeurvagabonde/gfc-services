package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVSitCptTresoEnc is a Querydsl query type for QVSitCptTresoEnc
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVSitCptTresoEnc extends com.querydsl.sql.RelationalPathBase<QVSitCptTresoEnc> {

    private static final long serialVersionUID = 829965228;

    public static final QVSitCptTresoEnc vSitCptTresoEnc = new QVSitCptTresoEnc("V_SIT_CPT_TRESO_ENC");

    public final StringPath dateEcrEnc = createString("dateEcrEnc");

    public final StringPath ebCr = createString("ebCr");

    public final StringPath ebEtab = createString("ebEtab");

    public final StringPath ebSouscr = createString("ebSouscr");

    public final StringPath ebUb = createString("ebUb");

    public final StringPath etabEnc = createString("etabEnc");

    public final NumberPath<java.math.BigDecimal> montantHtEnc = createNumber("montantHtEnc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTtcEnc = createNumber("montantTtcEnc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recDebitEnc = createNumber("recDebitEnc", java.math.BigDecimal.class);

    public final NumberPath<Long> recIdEnc = createNumber("recIdEnc", Long.class);

    public final NumberPath<java.math.BigDecimal> recMontEnc = createNumber("recMontEnc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recMontTvaEnc = createNumber("recMontTvaEnc", java.math.BigDecimal.class);

    public final NumberPath<Long> recNumeroEnc = createNumber("recNumeroEnc", Long.class);

    public final NumberPath<Integer> thisExeOrdre = createNumber("thisExeOrdre", Integer.class);

    public final NumberPath<Long> thisIdAdmEb = createNumber("thisIdAdmEb", Long.class);

    public final NumberPath<Long> titNumeroEnc = createNumber("titNumeroEnc", Long.class);

    public QVSitCptTresoEnc(String variable) {
        super(QVSitCptTresoEnc.class, forVariable(variable), "GFC", "V_SIT_CPT_TRESO_ENC");
        addMetadata();
    }

    public QVSitCptTresoEnc(String variable, String schema, String table) {
        super(QVSitCptTresoEnc.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVSitCptTresoEnc(Path<? extends QVSitCptTresoEnc> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_SIT_CPT_TRESO_ENC");
        addMetadata();
    }

    public QVSitCptTresoEnc(PathMetadata metadata) {
        super(QVSitCptTresoEnc.class, metadata, "GFC", "V_SIT_CPT_TRESO_ENC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateEcrEnc, ColumnMetadata.named("DATE_ECR_ENC").withIndex(3).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(ebCr, ColumnMetadata.named("EB_CR").withIndex(15).ofType(Types.VARCHAR).withSize(50));
        addMetadata(ebEtab, ColumnMetadata.named("EB_ETAB").withIndex(13).ofType(Types.VARCHAR).withSize(10));
        addMetadata(ebSouscr, ColumnMetadata.named("EB_SOUSCR").withIndex(16).ofType(Types.VARCHAR).withSize(50));
        addMetadata(ebUb, ColumnMetadata.named("EB_UB").withIndex(14).ofType(Types.VARCHAR).withSize(10));
        addMetadata(etabEnc, ColumnMetadata.named("ETAB_ENC").withIndex(4).ofType(Types.VARCHAR).withSize(10));
        addMetadata(montantHtEnc, ColumnMetadata.named("MONTANT_HT_ENC").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTtcEnc, ColumnMetadata.named("MONTANT_TTC_ENC").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recDebitEnc, ColumnMetadata.named("REC_DEBIT_ENC").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(recIdEnc, ColumnMetadata.named("REC_ID_ENC").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recMontEnc, ColumnMetadata.named("REC_MONT_ENC").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recMontTvaEnc, ColumnMetadata.named("REC_MONT_TVA_ENC").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recNumeroEnc, ColumnMetadata.named("REC_NUMERO_ENC").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(thisExeOrdre, ColumnMetadata.named("THIS_EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(thisIdAdmEb, ColumnMetadata.named("THIS_ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(titNumeroEnc, ColumnMetadata.named("TIT_NUMERO_ENC").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


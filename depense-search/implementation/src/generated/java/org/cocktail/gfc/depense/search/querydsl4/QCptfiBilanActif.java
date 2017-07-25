package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptfiBilanActif is a Querydsl query type for QCptfiBilanActif
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptfiBilanActif extends com.querydsl.sql.RelationalPathBase<QCptfiBilanActif> {

    private static final long serialVersionUID = 208759709;

    public static final QCptfiBilanActif cptfiBilanActif = new QCptfiBilanActif("CPTFI_BILAN_ACTIF");

    public final NumberPath<java.math.BigDecimal> amortProv = createNumber("amortProv", java.math.BigDecimal.class);

    public final NumberPath<Long> baOrdre = createNumber("baOrdre", Long.class);

    public final StringPath bpStrId = createString("bpStrId");

    public final NumberPath<Long> btId = createNumber("btId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath groupe1 = createString("groupe1");

    public final StringPath groupe2 = createString("groupe2");

    public final StringPath libelle = createString("libelle");

    public final NumberPath<java.math.BigDecimal> montantBrut = createNumber("montantBrut", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantNet = createNumber("montantNet", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantNetAnt = createNumber("montantNetAnt", java.math.BigDecimal.class);

    public final com.querydsl.sql.PrimaryKey<QCptfiBilanActif> cptfiBilanActifPk = createPrimaryKey(baOrdre);

    public QCptfiBilanActif(String variable) {
        super(QCptfiBilanActif.class, forVariable(variable), "GFC", "CPTFI_BILAN_ACTIF");
        addMetadata();
    }

    public QCptfiBilanActif(String variable, String schema, String table) {
        super(QCptfiBilanActif.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptfiBilanActif(Path<? extends QCptfiBilanActif> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTFI_BILAN_ACTIF");
        addMetadata();
    }

    public QCptfiBilanActif(PathMetadata metadata) {
        super(QCptfiBilanActif.class, metadata, "GFC", "CPTFI_BILAN_ACTIF");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(amortProv, ColumnMetadata.named("AMORT_PROV").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(baOrdre, ColumnMetadata.named("BA_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(bpStrId, ColumnMetadata.named("BP_STR_ID").withIndex(12).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(btId, ColumnMetadata.named("BT_ID").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(10).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(groupe1, ColumnMetadata.named("GROUPE1").withIndex(3).ofType(Types.VARCHAR).withSize(50));
        addMetadata(groupe2, ColumnMetadata.named("GROUPE2").withIndex(4).ofType(Types.VARCHAR).withSize(50));
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(100));
        addMetadata(montantBrut, ColumnMetadata.named("MONTANT_BRUT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(montantNet, ColumnMetadata.named("MONTANT_NET").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(montantNetAnt, ColumnMetadata.named("MONTANT_NET_ANT").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2));
    }

}


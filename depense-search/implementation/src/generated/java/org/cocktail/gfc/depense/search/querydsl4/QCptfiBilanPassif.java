package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptfiBilanPassif is a Querydsl query type for QCptfiBilanPassif
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptfiBilanPassif extends com.querydsl.sql.RelationalPathBase<QCptfiBilanPassif> {

    private static final long serialVersionUID = -1690813376;

    public static final QCptfiBilanPassif cptfiBilanPassif = new QCptfiBilanPassif("CPTFI_BILAN_PASSIF");

    public final NumberPath<Long> bpOrdre = createNumber("bpOrdre", Long.class);

    public final StringPath bpStrId = createString("bpStrId");

    public final NumberPath<Long> btId = createNumber("btId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath groupe1 = createString("groupe1");

    public final StringPath groupe2 = createString("groupe2");

    public final StringPath libelle = createString("libelle");

    public final NumberPath<java.math.BigDecimal> montant = createNumber("montant", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantAnt = createNumber("montantAnt", java.math.BigDecimal.class);

    public final com.querydsl.sql.PrimaryKey<QCptfiBilanPassif> cptfiBilanPassifPk = createPrimaryKey(bpOrdre);

    public QCptfiBilanPassif(String variable) {
        super(QCptfiBilanPassif.class, forVariable(variable), "GFC", "CPTFI_BILAN_PASSIF");
        addMetadata();
    }

    public QCptfiBilanPassif(String variable, String schema, String table) {
        super(QCptfiBilanPassif.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptfiBilanPassif(Path<? extends QCptfiBilanPassif> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTFI_BILAN_PASSIF");
        addMetadata();
    }

    public QCptfiBilanPassif(PathMetadata metadata) {
        super(QCptfiBilanPassif.class, metadata, "GFC", "CPTFI_BILAN_PASSIF");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bpOrdre, ColumnMetadata.named("BP_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(bpStrId, ColumnMetadata.named("BP_STR_ID").withIndex(10).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(btId, ColumnMetadata.named("BT_ID").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(8).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(groupe1, ColumnMetadata.named("GROUPE1").withIndex(3).ofType(Types.VARCHAR).withSize(50));
        addMetadata(groupe2, ColumnMetadata.named("GROUPE2").withIndex(4).ofType(Types.VARCHAR).withSize(50));
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(100));
        addMetadata(montant, ColumnMetadata.named("MONTANT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(montantAnt, ColumnMetadata.named("MONTANT_ANT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2));
    }

}


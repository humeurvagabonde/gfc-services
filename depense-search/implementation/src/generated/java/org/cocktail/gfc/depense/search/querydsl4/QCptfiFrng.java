package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptfiFrng is a Querydsl query type for QCptfiFrng
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptfiFrng extends com.querydsl.sql.RelationalPathBase<QCptfiFrng> {

    private static final long serialVersionUID = 1999498949;

    public static final QCptfiFrng cptfiFrng = new QCptfiFrng("CPTFI_FRNG");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath formule = createString("formule");

    public final StringPath frngLibelle = createString("frngLibelle");

    public final NumberPath<java.math.BigDecimal> frngMontant = createNumber("frngMontant", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> frngMontantAnt = createNumber("frngMontantAnt", java.math.BigDecimal.class);

    public final NumberPath<Long> frngOrdre = createNumber("frngOrdre", Long.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath groupe1 = createString("groupe1");

    public final com.querydsl.sql.PrimaryKey<QCptfiFrng> cptfiFrngPk = createPrimaryKey(frngOrdre);

    public QCptfiFrng(String variable) {
        super(QCptfiFrng.class, forVariable(variable), "GFC", "CPTFI_FRNG");
        addMetadata();
    }

    public QCptfiFrng(String variable, String schema, String table) {
        super(QCptfiFrng.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptfiFrng(Path<? extends QCptfiFrng> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTFI_FRNG");
        addMetadata();
    }

    public QCptfiFrng(PathMetadata metadata) {
        super(QCptfiFrng.class, metadata, "GFC", "CPTFI_FRNG");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4));
        addMetadata(formule, ColumnMetadata.named("FORMULE").withIndex(8).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(frngLibelle, ColumnMetadata.named("FRNG_LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(100));
        addMetadata(frngMontant, ColumnMetadata.named("FRNG_MONTANT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(frngMontantAnt, ColumnMetadata.named("FRNG_MONTANT_ANT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(frngOrdre, ColumnMetadata.named("FRNG_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(200));
        addMetadata(groupe1, ColumnMetadata.named("GROUPE1").withIndex(4).ofType(Types.VARCHAR).withSize(50));
    }

}


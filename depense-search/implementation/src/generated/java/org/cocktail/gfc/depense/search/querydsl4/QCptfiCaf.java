package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptfiCaf is a Querydsl query type for QCptfiCaf
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptfiCaf extends com.querydsl.sql.RelationalPathBase<QCptfiCaf> {

    private static final long serialVersionUID = -766787448;

    public static final QCptfiCaf cptfiCaf = new QCptfiCaf("CPTFI_CAF");

    public final StringPath cafLibelle = createString("cafLibelle");

    public final NumberPath<java.math.BigDecimal> cafMontant = createNumber("cafMontant", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cafMontantAnt = createNumber("cafMontantAnt", java.math.BigDecimal.class);

    public final NumberPath<Long> cafOrdre = createNumber("cafOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath formule = createString("formule");

    public final StringPath gesCode = createString("gesCode");

    public final StringPath groupe1 = createString("groupe1");

    public final StringPath methodeEbe = createString("methodeEbe");

    public final com.querydsl.sql.PrimaryKey<QCptfiCaf> cptfiCafPk = createPrimaryKey(cafOrdre);

    public QCptfiCaf(String variable) {
        super(QCptfiCaf.class, forVariable(variable), "GFC", "CPTFI_CAF");
        addMetadata();
    }

    public QCptfiCaf(String variable, String schema, String table) {
        super(QCptfiCaf.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptfiCaf(Path<? extends QCptfiCaf> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTFI_CAF");
        addMetadata();
    }

    public QCptfiCaf(PathMetadata metadata) {
        super(QCptfiCaf.class, metadata, "GFC", "CPTFI_CAF");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cafLibelle, ColumnMetadata.named("CAF_LIBELLE").withIndex(6).ofType(Types.VARCHAR).withSize(100));
        addMetadata(cafMontant, ColumnMetadata.named("CAF_MONTANT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cafMontantAnt, ColumnMetadata.named("CAF_MONTANT_ANT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cafOrdre, ColumnMetadata.named("CAF_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4));
        addMetadata(formule, ColumnMetadata.named("FORMULE").withIndex(9).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(200));
        addMetadata(groupe1, ColumnMetadata.named("GROUPE1").withIndex(5).ofType(Types.VARCHAR).withSize(50));
        addMetadata(methodeEbe, ColumnMetadata.named("METHODE_EBE").withIndex(4).ofType(Types.CHAR).withSize(1));
    }

}


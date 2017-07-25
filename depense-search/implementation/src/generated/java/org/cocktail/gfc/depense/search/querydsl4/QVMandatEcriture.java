package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVMandatEcriture is a Querydsl query type for QVMandatEcriture
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVMandatEcriture extends com.querydsl.sql.RelationalPathBase<QVMandatEcriture> {

    private static final long serialVersionUID = 187094386;

    public static final QVMandatEcriture vMandatEcriture = new QVMandatEcriture("V_MANDAT_ECRITURE");

    public final DateTimePath<java.sql.Timestamp> dateSaisie = createDateTime("dateSaisie", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateVisa = createDateTime("dateVisa", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> ecdMontant = createNumber("ecdMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> ecrOrdre = createNumber("ecrOrdre", Long.class);

    public final NumberPath<Integer> exeExercice = createNumber("exeExercice", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> manId = createNumber("manId", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public QVMandatEcriture(String variable) {
        super(QVMandatEcriture.class, forVariable(variable), "GFC", "V_MANDAT_ECRITURE");
        addMetadata();
    }

    public QVMandatEcriture(String variable, String schema, String table) {
        super(QVMandatEcriture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVMandatEcriture(Path<? extends QVMandatEcriture> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_MANDAT_ECRITURE");
        addMetadata();
    }

    public QVMandatEcriture(PathMetadata metadata) {
        super(QVMandatEcriture.class, metadata, "GFC", "V_MANDAT_ECRITURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateSaisie, ColumnMetadata.named("DATE_SAISIE").withIndex(3).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dateVisa, ColumnMetadata.named("DATE_VISA").withIndex(2).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(ecdMontant, ColumnMetadata.named("ECD_MONTANT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ecrOrdre, ColumnMetadata.named("ECR_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeExercice, ColumnMetadata.named("EXE_EXERCICE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(5).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(manId, ColumnMetadata.named("MAN_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(6).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


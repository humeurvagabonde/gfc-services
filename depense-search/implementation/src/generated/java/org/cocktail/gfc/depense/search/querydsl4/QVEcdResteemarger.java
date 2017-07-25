package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVEcdResteemarger is a Querydsl query type for QVEcdResteemarger
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVEcdResteemarger extends com.querydsl.sql.RelationalPathBase<QVEcdResteemarger> {

    private static final long serialVersionUID = 816408772;

    public static final QVEcdResteemarger vEcdResteemarger = new QVEcdResteemarger("V_ECD_RESTEEMARGER");

    public final NumberPath<java.math.BigDecimal> ecdCredit = createNumber("ecdCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> ecdDebit = createNumber("ecdDebit", java.math.BigDecimal.class);

    public final StringPath ecdLibelle = createString("ecdLibelle");

    public final NumberPath<java.math.BigDecimal> ecdMontant = createNumber("ecdMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<java.math.BigDecimal> ecdResteEmarger = createNumber("ecdResteEmarger", java.math.BigDecimal.class);

    public final StringPath ecdSens = createString("ecdSens");

    public final NumberPath<Long> ecrNumero = createNumber("ecrNumero", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath pcoNum = createString("pcoNum");

    public QVEcdResteemarger(String variable) {
        super(QVEcdResteemarger.class, forVariable(variable), "GFC", "V_ECD_RESTEEMARGER");
        addMetadata();
    }

    public QVEcdResteemarger(String variable, String schema, String table) {
        super(QVEcdResteemarger.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVEcdResteemarger(Path<? extends QVEcdResteemarger> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ECD_RESTEEMARGER");
        addMetadata();
    }

    public QVEcdResteemarger(PathMetadata metadata) {
        super(QVEcdResteemarger.class, metadata, "GFC", "V_ECD_RESTEEMARGER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdCredit, ColumnMetadata.named("ECD_CREDIT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(ecdDebit, ColumnMetadata.named("ECD_DEBIT").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(ecdLibelle, ColumnMetadata.named("ECD_LIBELLE").withIndex(6).ofType(Types.VARCHAR).withSize(500));
        addMetadata(ecdMontant, ColumnMetadata.named("ECD_MONTANT").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ecdResteEmarger, ColumnMetadata.named("ECD_RESTE_EMARGER").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ecdSens, ColumnMetadata.named("ECD_SENS").withIndex(7).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(ecrNumero, ColumnMetadata.named("ECR_NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(32));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(5).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


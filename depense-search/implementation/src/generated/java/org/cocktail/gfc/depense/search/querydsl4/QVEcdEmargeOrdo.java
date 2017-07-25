package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVEcdEmargeOrdo is a Querydsl query type for QVEcdEmargeOrdo
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVEcdEmargeOrdo extends com.querydsl.sql.RelationalPathBase<QVEcdEmargeOrdo> {

    private static final long serialVersionUID = -1529684641;

    public static final QVEcdEmargeOrdo vEcdEmargeOrdo = new QVEcdEmargeOrdo("V_ECD_EMARGE_ORDO");

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

    public final StringPath modCode = createString("modCode");

    public final NumberPath<Long> modOrdre = createNumber("modOrdre", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public QVEcdEmargeOrdo(String variable) {
        super(QVEcdEmargeOrdo.class, forVariable(variable), "GFC", "V_ECD_EMARGE_ORDO");
        addMetadata();
    }

    public QVEcdEmargeOrdo(String variable, String schema, String table) {
        super(QVEcdEmargeOrdo.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVEcdEmargeOrdo(Path<? extends QVEcdEmargeOrdo> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ECD_EMARGE_ORDO");
        addMetadata();
    }

    public QVEcdEmargeOrdo(PathMetadata metadata) {
        super(QVEcdEmargeOrdo.class, metadata, "GFC", "V_ECD_EMARGE_ORDO");
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
        addMetadata(modCode, ColumnMetadata.named("MOD_CODE").withIndex(13).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(modOrdre, ColumnMetadata.named("MOD_ORDRE").withIndex(12).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(5).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


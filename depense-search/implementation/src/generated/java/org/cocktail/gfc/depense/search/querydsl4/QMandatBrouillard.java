package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMandatBrouillard is a Querydsl query type for QMandatBrouillard
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMandatBrouillard extends com.querydsl.sql.RelationalPathBase<QMandatBrouillard> {

    private static final long serialVersionUID = 1681641319;

    public static final QMandatBrouillard mandatBrouillard = new QMandatBrouillard("MANDAT_BROUILLARD");

    public final NumberPath<Long> ecrOrdre = createNumber("ecrOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<java.math.BigDecimal> mabMontant = createNumber("mabMontant", java.math.BigDecimal.class);

    public final StringPath mabOperation = createString("mabOperation");

    public final NumberPath<Long> mabOrdre = createNumber("mabOrdre", Long.class);

    public final StringPath mabSens = createString("mabSens");

    public final NumberPath<Long> manId = createNumber("manId", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final com.querydsl.sql.PrimaryKey<QMandatBrouillard> mandatBrouillardPk = createPrimaryKey(mabOrdre);

    public QMandatBrouillard(String variable) {
        super(QMandatBrouillard.class, forVariable(variable), "GFC", "MANDAT_BROUILLARD");
        addMetadata();
    }

    public QMandatBrouillard(String variable, String schema, String table) {
        super(QMandatBrouillard.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMandatBrouillard(Path<? extends QMandatBrouillard> path) {
        super(path.getType(), path.getMetadata(), "GFC", "MANDAT_BROUILLARD");
        addMetadata();
    }

    public QMandatBrouillard(PathMetadata metadata) {
        super(QMandatBrouillard.class, metadata, "GFC", "MANDAT_BROUILLARD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecrOrdre, ColumnMetadata.named("ECR_ORDRE").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(mabMontant, ColumnMetadata.named("MAB_MONTANT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(mabOperation, ColumnMetadata.named("MAB_OPERATION").withIndex(8).ofType(Types.VARCHAR).withSize(50));
        addMetadata(mabOrdre, ColumnMetadata.named("MAB_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(mabSens, ColumnMetadata.named("MAB_SENS").withIndex(5).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(manId, ColumnMetadata.named("MAN_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(6).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


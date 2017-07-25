package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTitreBrouillard is a Querydsl query type for QTitreBrouillard
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTitreBrouillard extends com.querydsl.sql.RelationalPathBase<QTitreBrouillard> {

    private static final long serialVersionUID = 1771406184;

    public static final QTitreBrouillard titreBrouillard = new QTitreBrouillard("TITRE_BROUILLARD");

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<java.math.BigDecimal> tibMontant = createNumber("tibMontant", java.math.BigDecimal.class);

    public final StringPath tibOperation = createString("tibOperation");

    public final NumberPath<Long> tibOrdre = createNumber("tibOrdre", Long.class);

    public final StringPath tibSens = createString("tibSens");

    public final NumberPath<Long> titId = createNumber("titId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTitreBrouillard> titreBrouillardPk = createPrimaryKey(tibOrdre);

    public QTitreBrouillard(String variable) {
        super(QTitreBrouillard.class, forVariable(variable), "GFC", "TITRE_BROUILLARD");
        addMetadata();
    }

    public QTitreBrouillard(String variable, String schema, String table) {
        super(QTitreBrouillard.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTitreBrouillard(Path<? extends QTitreBrouillard> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TITRE_BROUILLARD");
        addMetadata();
    }

    public QTitreBrouillard(PathMetadata metadata) {
        super(QTitreBrouillard.class, metadata, "GFC", "TITRE_BROUILLARD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(5).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tibMontant, ColumnMetadata.named("TIB_MONTANT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(tibOperation, ColumnMetadata.named("TIB_OPERATION").withIndex(7).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(tibOrdre, ColumnMetadata.named("TIB_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tibSens, ColumnMetadata.named("TIB_SENS").withIndex(8).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(titId, ColumnMetadata.named("TIT_ID").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


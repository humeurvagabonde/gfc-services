package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBordereauBrouillard is a Querydsl query type for QBordereauBrouillard
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBordereauBrouillard extends com.querydsl.sql.RelationalPathBase<QBordereauBrouillard> {

    private static final long serialVersionUID = 1602339651;

    public static final QBordereauBrouillard bordereauBrouillard = new QBordereauBrouillard("BORDEREAU_BROUILLARD");

    public final StringPath bobEtat = createString("bobEtat");

    public final StringPath bobLibelle1 = createString("bobLibelle1");

    public final StringPath bobLibelle2 = createString("bobLibelle2");

    public final StringPath bobLibelle3 = createString("bobLibelle3");

    public final NumberPath<java.math.BigDecimal> bobMontant = createNumber("bobMontant", java.math.BigDecimal.class);

    public final StringPath bobOperation = createString("bobOperation");

    public final NumberPath<Long> bobOrdre = createNumber("bobOrdre", Long.class);

    public final StringPath bobSens = createString("bobSens");

    public final NumberPath<Long> borId = createNumber("borId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath pcoNum = createString("pcoNum");

    public final com.querydsl.sql.PrimaryKey<QBordereauBrouillard> bobPk = createPrimaryKey(bobOrdre);

    public QBordereauBrouillard(String variable) {
        super(QBordereauBrouillard.class, forVariable(variable), "GFC", "BORDEREAU_BROUILLARD");
        addMetadata();
    }

    public QBordereauBrouillard(String variable, String schema, String table) {
        super(QBordereauBrouillard.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBordereauBrouillard(Path<? extends QBordereauBrouillard> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BORDEREAU_BROUILLARD");
        addMetadata();
    }

    public QBordereauBrouillard(PathMetadata metadata) {
        super(QBordereauBrouillard.class, metadata, "GFC", "BORDEREAU_BROUILLARD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bobEtat, ColumnMetadata.named("BOB_ETAT").withIndex(7).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(bobLibelle1, ColumnMetadata.named("BOB_LIBELLE1").withIndex(10).ofType(Types.VARCHAR).withSize(200));
        addMetadata(bobLibelle2, ColumnMetadata.named("BOB_LIBELLE2").withIndex(11).ofType(Types.VARCHAR).withSize(200));
        addMetadata(bobLibelle3, ColumnMetadata.named("BOB_LIBELLE3").withIndex(12).ofType(Types.VARCHAR).withSize(200));
        addMetadata(bobMontant, ColumnMetadata.named("BOB_MONTANT").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(bobOperation, ColumnMetadata.named("BOB_OPERATION").withIndex(8).ofType(Types.VARCHAR).withSize(50));
        addMetadata(bobOrdre, ColumnMetadata.named("BOB_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(bobSens, ColumnMetadata.named("BOB_SENS").withIndex(6).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(borId, ColumnMetadata.named("BOR_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(9).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


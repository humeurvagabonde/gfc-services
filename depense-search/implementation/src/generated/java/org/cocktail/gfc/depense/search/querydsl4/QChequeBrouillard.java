package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QChequeBrouillard is a Querydsl query type for QChequeBrouillard
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QChequeBrouillard extends com.querydsl.sql.RelationalPathBase<QChequeBrouillard> {

    private static final long serialVersionUID = 366918795;

    public static final QChequeBrouillard chequeBrouillard = new QChequeBrouillard("CHEQUE_BROUILLARD");

    public final StringPath chbEtat = createString("chbEtat");

    public final StringPath chbLibelle = createString("chbLibelle");

    public final NumberPath<java.math.BigDecimal> chbMontant = createNumber("chbMontant", java.math.BigDecimal.class);

    public final StringPath chbOperation = createString("chbOperation");

    public final NumberPath<Long> chbOrdre = createNumber("chbOrdre", Long.class);

    public final StringPath chbSens = createString("chbSens");

    public final NumberPath<Long> cheOrdre = createNumber("cheOrdre", Long.class);

    public final NumberPath<Long> ecrOrdre = createNumber("ecrOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath pcoNum = createString("pcoNum");

    public final com.querydsl.sql.PrimaryKey<QChequeBrouillard> chequeBrouillardPk = createPrimaryKey(chbOrdre);

    public QChequeBrouillard(String variable) {
        super(QChequeBrouillard.class, forVariable(variable), "GFC", "CHEQUE_BROUILLARD");
        addMetadata();
    }

    public QChequeBrouillard(String variable, String schema, String table) {
        super(QChequeBrouillard.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QChequeBrouillard(Path<? extends QChequeBrouillard> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CHEQUE_BROUILLARD");
        addMetadata();
    }

    public QChequeBrouillard(PathMetadata metadata) {
        super(QChequeBrouillard.class, metadata, "GFC", "CHEQUE_BROUILLARD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(chbEtat, ColumnMetadata.named("CHB_ETAT").withIndex(8).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(chbLibelle, ColumnMetadata.named("CHB_LIBELLE").withIndex(11).ofType(Types.VARCHAR).withSize(200));
        addMetadata(chbMontant, ColumnMetadata.named("CHB_MONTANT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(chbOperation, ColumnMetadata.named("CHB_OPERATION").withIndex(9).ofType(Types.VARCHAR).withSize(50));
        addMetadata(chbOrdre, ColumnMetadata.named("CHB_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(chbSens, ColumnMetadata.named("CHB_SENS").withIndex(7).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(cheOrdre, ColumnMetadata.named("CHE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ecrOrdre, ColumnMetadata.named("ECR_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(5).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(10).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


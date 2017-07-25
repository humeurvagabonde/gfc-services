package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSousTraitant is a Querydsl query type for QSousTraitant
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSousTraitant extends com.querydsl.sql.RelationalPathBase<QSousTraitant> {

    private static final long serialVersionUID = -519200259;

    public static final QSousTraitant sousTraitant = new QSousTraitant("SOUS_TRAITANT");

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> ribOrdre = createNumber("ribOrdre", Long.class);

    public final NumberPath<java.math.BigDecimal> stMontant = createNumber("stMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> stOrdre = createNumber("stOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSousTraitant> sousTraitantPk = createPrimaryKey(stOrdre);

    public QSousTraitant(String variable) {
        super(QSousTraitant.class, forVariable(variable), "GFC", "SOUS_TRAITANT");
        addMetadata();
    }

    public QSousTraitant(String variable, String schema, String table) {
        super(QSousTraitant.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSousTraitant(Path<? extends QSousTraitant> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SOUS_TRAITANT");
        addMetadata();
    }

    public QSousTraitant(PathMetadata metadata) {
        super(QSousTraitant.class, metadata, "GFC", "SOUS_TRAITANT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ribOrdre, ColumnMetadata.named("RIB_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(stMontant, ColumnMetadata.named("ST_MONTANT").withIndex(2).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(stOrdre, ColumnMetadata.named("ST_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


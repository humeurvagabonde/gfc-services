package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVMarchesCatalogue is a Querydsl query type for QVMarchesCatalogue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVMarchesCatalogue extends com.querydsl.sql.RelationalPathBase<QVMarchesCatalogue> {

    private static final long serialVersionUID = -1915141308;

    public static final QVMarchesCatalogue vMarchesCatalogue = new QVMarchesCatalogue("V_MARCHES_CATALOGUE");

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final StringPath catDesc = createString("catDesc");

    public final NumberPath<Long> catOrdre = createNumber("catOrdre", Long.class);

    public final NumberPath<Long> catOrdrePere = createNumber("catOrdrePere", Long.class);

    public final NumberPath<java.math.BigDecimal> catPrixHt = createNumber("catPrixHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> catPrixTtc = createNumber("catPrixTtc", java.math.BigDecimal.class);

    public final StringPath catRef = createString("catRef");

    public final NumberPath<Long> cmOrdre = createNumber("cmOrdre", Long.class);

    public final NumberPath<Long> tvaId = createNumber("tvaId", Long.class);

    public final NumberPath<Long> tyarId = createNumber("tyarId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public QVMarchesCatalogue(String variable) {
        super(QVMarchesCatalogue.class, forVariable(variable), "GFC", "V_MARCHES_CATALOGUE");
        addMetadata();
    }

    public QVMarchesCatalogue(String variable, String schema, String table) {
        super(QVMarchesCatalogue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVMarchesCatalogue(Path<? extends QVMarchesCatalogue> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_MARCHES_CATALOGUE");
        addMetadata();
    }

    public QVMarchesCatalogue(PathMetadata metadata) {
        super(QVMarchesCatalogue.class, metadata, "GFC", "V_MARCHES_CATALOGUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(catDesc, ColumnMetadata.named("CAT_DESC").withIndex(4).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(catOrdre, ColumnMetadata.named("CAT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(catOrdrePere, ColumnMetadata.named("CAT_ORDRE_PERE").withIndex(10).ofType(Types.DECIMAL).withSize(0));
        addMetadata(catPrixHt, ColumnMetadata.named("CAT_PRIX_HT").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(catPrixTtc, ColumnMetadata.named("CAT_PRIX_TTC").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(catRef, ColumnMetadata.named("CAT_REF").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(cmOrdre, ColumnMetadata.named("CM_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tvaId, ColumnMetadata.named("TVA_ID").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyarId, ColumnMetadata.named("TYAR_ID").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


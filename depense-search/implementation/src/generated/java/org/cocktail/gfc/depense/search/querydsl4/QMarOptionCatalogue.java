package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMarOptionCatalogue is a Querydsl query type for QMarOptionCatalogue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMarOptionCatalogue extends com.querydsl.sql.RelationalPathBase<QMarOptionCatalogue> {

    private static final long serialVersionUID = -2122055808;

    public static final QMarOptionCatalogue marOptionCatalogue = new QMarOptionCatalogue("MAR_OPTION_CATALOGUE");

    public final NumberPath<Long> catOrdre = createNumber("catOrdre", Long.class);

    public final StringPath optDesc = createString("optDesc");

    public final NumberPath<java.math.BigDecimal> optHtControle = createNumber("optHtControle", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> optHtDispo = createNumber("optHtDispo", java.math.BigDecimal.class);

    public final NumberPath<Long> optOrdre = createNumber("optOrdre", Long.class);

    public final NumberPath<java.math.BigDecimal> optPrixHt = createNumber("optPrixHt", java.math.BigDecimal.class);

    public final NumberPath<Long> optQteControle = createNumber("optQteControle", Long.class);

    public final NumberPath<Long> optQteDispo = createNumber("optQteDispo", Long.class);

    public final StringPath optRef = createString("optRef");

    public final NumberPath<Long> tvaId = createNumber("tvaId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QMarOptionCatalogue> marOptionCataloguePk = createPrimaryKey(optOrdre);

    public QMarOptionCatalogue(String variable) {
        super(QMarOptionCatalogue.class, forVariable(variable), "GFC", "MAR_OPTION_CATALOGUE");
        addMetadata();
    }

    public QMarOptionCatalogue(String variable, String schema, String table) {
        super(QMarOptionCatalogue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMarOptionCatalogue(Path<? extends QMarOptionCatalogue> path) {
        super(path.getType(), path.getMetadata(), "GFC", "MAR_OPTION_CATALOGUE");
        addMetadata();
    }

    public QMarOptionCatalogue(PathMetadata metadata) {
        super(QMarOptionCatalogue.class, metadata, "GFC", "MAR_OPTION_CATALOGUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(catOrdre, ColumnMetadata.named("CAT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(22));
        addMetadata(optDesc, ColumnMetadata.named("OPT_DESC").withIndex(3).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(optHtControle, ColumnMetadata.named("OPT_HT_CONTROLE").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(optHtDispo, ColumnMetadata.named("OPT_HT_DISPO").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(optOrdre, ColumnMetadata.named("OPT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(22).notNull());
        addMetadata(optPrixHt, ColumnMetadata.named("OPT_PRIX_HT").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(optQteControle, ColumnMetadata.named("OPT_QTE_CONTROLE").withIndex(7).ofType(Types.DECIMAL).withSize(22));
        addMetadata(optQteDispo, ColumnMetadata.named("OPT_QTE_DISPO").withIndex(8).ofType(Types.DECIMAL).withSize(22));
        addMetadata(optRef, ColumnMetadata.named("OPT_REF").withIndex(9).ofType(Types.VARCHAR).withSize(100));
        addMetadata(tvaId, ColumnMetadata.named("TVA_ID").withIndex(10).ofType(Types.DECIMAL).withSize(0));
    }

}


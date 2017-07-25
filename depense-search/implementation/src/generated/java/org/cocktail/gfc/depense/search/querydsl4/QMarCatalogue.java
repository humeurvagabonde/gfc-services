package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMarCatalogue is a Querydsl query type for QMarCatalogue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMarCatalogue extends com.querydsl.sql.RelationalPathBase<QMarCatalogue> {

    private static final long serialVersionUID = -1793806987;

    public static final QMarCatalogue marCatalogue = new QMarCatalogue("MAR_CATALOGUE");

    public final NumberPath<Long> artQteUnitaire = createNumber("artQteUnitaire", Long.class);

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> catDate = createDateTime("catDate", java.sql.Timestamp.class);

    public final StringPath catDesc = createString("catDesc");

    public final NumberPath<Long> catGarantie = createNumber("catGarantie", Long.class);

    public final NumberPath<java.math.BigDecimal> catHtCtrl = createNumber("catHtCtrl", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> catHtDispo = createNumber("catHtDispo", java.math.BigDecimal.class);

    public final NumberPath<Long> catLivraison = createNumber("catLivraison", Long.class);

    public final StringPath catMonnaie = createString("catMonnaie");

    public final NumberPath<Long> catOrdre = createNumber("catOrdre", Long.class);

    public final NumberPath<java.math.BigDecimal> catPrixHt = createNumber("catPrixHt", java.math.BigDecimal.class);

    public final NumberPath<Long> catQteControle = createNumber("catQteControle", Long.class);

    public final NumberPath<Long> catQteDispo = createNumber("catQteDispo", Long.class);

    public final StringPath catRef = createString("catRef");

    public final StringPath catUnite = createString("catUnite");

    public final NumberPath<Long> cmOrdre = createNumber("cmOrdre", Long.class);

    public final NumberPath<Long> tvaId = createNumber("tvaId", Long.class);

    public QMarCatalogue(String variable) {
        super(QMarCatalogue.class, forVariable(variable), "GFC", "MAR_CATALOGUE");
        addMetadata();
    }

    public QMarCatalogue(String variable, String schema, String table) {
        super(QMarCatalogue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMarCatalogue(Path<? extends QMarCatalogue> path) {
        super(path.getType(), path.getMetadata(), "GFC", "MAR_CATALOGUE");
        addMetadata();
    }

    public QMarCatalogue(PathMetadata metadata) {
        super(QMarCatalogue.class, metadata, "GFC", "MAR_CATALOGUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artQteUnitaire, ColumnMetadata.named("ART_QTE_UNITAIRE").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(catDate, ColumnMetadata.named("CAT_DATE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(catDesc, ColumnMetadata.named("CAT_DESC").withIndex(4).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(catGarantie, ColumnMetadata.named("CAT_GARANTIE").withIndex(17).ofType(Types.DECIMAL).withSize(0));
        addMetadata(catHtCtrl, ColumnMetadata.named("CAT_HT_CTRL").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(catHtDispo, ColumnMetadata.named("CAT_HT_DISPO").withIndex(15).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(catLivraison, ColumnMetadata.named("CAT_LIVRAISON").withIndex(16).ofType(Types.DECIMAL).withSize(0));
        addMetadata(catMonnaie, ColumnMetadata.named("CAT_MONNAIE").withIndex(9).ofType(Types.VARCHAR).withSize(1));
        addMetadata(catOrdre, ColumnMetadata.named("CAT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(catPrixHt, ColumnMetadata.named("CAT_PRIX_HT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(catQteControle, ColumnMetadata.named("CAT_QTE_CONTROLE").withIndex(12).ofType(Types.DECIMAL).withSize(0));
        addMetadata(catQteDispo, ColumnMetadata.named("CAT_QTE_DISPO").withIndex(14).ofType(Types.DECIMAL).withSize(0));
        addMetadata(catRef, ColumnMetadata.named("CAT_REF").withIndex(3).ofType(Types.VARCHAR).withSize(100));
        addMetadata(catUnite, ColumnMetadata.named("CAT_UNITE").withIndex(5).ofType(Types.VARCHAR).withSize(20));
        addMetadata(cmOrdre, ColumnMetadata.named("CM_ORDRE").withIndex(11).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tvaId, ColumnMetadata.named("TVA_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0));
    }

}


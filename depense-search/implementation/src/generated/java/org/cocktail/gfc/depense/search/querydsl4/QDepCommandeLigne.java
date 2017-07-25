package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepCommandeLigne is a Querydsl query type for QDepCommandeLigne
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepCommandeLigne extends com.querydsl.sql.RelationalPathBase<QDepCommandeLigne> {

    private static final long serialVersionUID = 2011069282;

    public static final QDepCommandeLigne depCommandeLigne = new QDepCommandeLigne("DEP_COMMANDE_LIGNE");

    public final NumberPath<Long> artcId = createNumber("artcId", Long.class);

    public final NumberPath<Long> artId = createNumber("artId", Long.class);

    public final NumberPath<Long> artIdPere = createNumber("artIdPere", Long.class);

    public final StringPath artLibelle = createString("artLibelle");

    public final NumberPath<java.math.BigDecimal> artPrixHt = createNumber("artPrixHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> artPrixTotalHt = createNumber("artPrixTotalHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> artPrixTotalTtc = createNumber("artPrixTotalTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> artPrixTtc = createNumber("artPrixTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> artQuantite = createNumber("artQuantite", java.math.BigDecimal.class);

    public final StringPath artReference = createString("artReference");

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Long> ceOrdre = createNumber("ceOrdre", Long.class);

    public final NumberPath<Long> commId = createNumber("commId", Long.class);

    public final NumberPath<Long> tvaId = createNumber("tvaId", Long.class);

    public final NumberPath<Long> typaId = createNumber("typaId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QDepCommandeLigne> depArticlePk = createPrimaryKey(artId);

    public QDepCommandeLigne(String variable) {
        super(QDepCommandeLigne.class, forVariable(variable), "GFC", "DEP_COMMANDE_LIGNE");
        addMetadata();
    }

    public QDepCommandeLigne(String variable, String schema, String table) {
        super(QDepCommandeLigne.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepCommandeLigne(Path<? extends QDepCommandeLigne> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_COMMANDE_LIGNE");
        addMetadata();
    }

    public QDepCommandeLigne(PathMetadata metadata) {
        super(QDepCommandeLigne.class, metadata, "GFC", "DEP_COMMANDE_LIGNE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artcId, ColumnMetadata.named("ARTC_ID").withIndex(10).ofType(Types.DECIMAL).withSize(0));
        addMetadata(artId, ColumnMetadata.named("ART_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(artIdPere, ColumnMetadata.named("ART_ID_PERE").withIndex(14).ofType(Types.DECIMAL).withSize(0));
        addMetadata(artLibelle, ColumnMetadata.named("ART_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(artPrixHt, ColumnMetadata.named("ART_PRIX_HT").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(artPrixTotalHt, ColumnMetadata.named("ART_PRIX_TOTAL_HT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(artPrixTotalTtc, ColumnMetadata.named("ART_PRIX_TOTAL_TTC").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(artPrixTtc, ColumnMetadata.named("ART_PRIX_TTC").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(artQuantite, ColumnMetadata.named("ART_QUANTITE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(artReference, ColumnMetadata.named("ART_REFERENCE").withIndex(9).ofType(Types.VARCHAR).withSize(50));
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(11).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ceOrdre, ColumnMetadata.named("CE_ORDRE").withIndex(12).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(commId, ColumnMetadata.named("COMM_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tvaId, ColumnMetadata.named("TVA_ID").withIndex(13).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(typaId, ColumnMetadata.named("TYPA_ID").withIndex(15).ofType(Types.DECIMAL).withSize(0));
    }

}


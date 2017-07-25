package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepEjExterneLigne is a Querydsl query type for QDepEjExterneLigne
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepEjExterneLigne extends com.querydsl.sql.RelationalPathBase<QDepEjExterneLigne> {

    private static final long serialVersionUID = 1874104486;

    public static final QDepEjExterneLigne depEjExterneLigne = new QDepEjExterneLigne("DEP_EJ_EXTERNE_LIGNE");

    public final NumberPath<Long> ceOrdre = createNumber("ceOrdre", Long.class);

    public final NumberPath<Long> idDepEjExterne = createNumber("idDepEjExterne", Long.class);

    public final NumberPath<Long> idDepEjExterneLigne = createNumber("idDepEjExterneLigne", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<java.math.BigDecimal> prixHt = createNumber("prixHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prixTotalHt = createNumber("prixTotalHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prixTotalTtc = createNumber("prixTotalTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prixTtc = createNumber("prixTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> quantite = createNumber("quantite", java.math.BigDecimal.class);

    public final StringPath reference = createString("reference");

    public final NumberPath<Long> tvaId = createNumber("tvaId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QDepEjExterneLigne> idDepEjExterneLignePk = createPrimaryKey(idDepEjExterneLigne);

    public QDepEjExterneLigne(String variable) {
        super(QDepEjExterneLigne.class, forVariable(variable), "GFC", "DEP_EJ_EXTERNE_LIGNE");
        addMetadata();
    }

    public QDepEjExterneLigne(String variable, String schema, String table) {
        super(QDepEjExterneLigne.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepEjExterneLigne(Path<? extends QDepEjExterneLigne> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_EJ_EXTERNE_LIGNE");
        addMetadata();
    }

    public QDepEjExterneLigne(PathMetadata metadata) {
        super(QDepEjExterneLigne.class, metadata, "GFC", "DEP_EJ_EXTERNE_LIGNE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ceOrdre, ColumnMetadata.named("CE_ORDRE").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idDepEjExterne, ColumnMetadata.named("ID_DEP_EJ_EXTERNE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepEjExterneLigne, ColumnMetadata.named("ID_DEP_EJ_EXTERNE_LIGNE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(prixHt, ColumnMetadata.named("PRIX_HT").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(prixTotalHt, ColumnMetadata.named("PRIX_TOTAL_HT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(prixTotalTtc, ColumnMetadata.named("PRIX_TOTAL_TTC").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(prixTtc, ColumnMetadata.named("PRIX_TTC").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(quantite, ColumnMetadata.named("QUANTITE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(reference, ColumnMetadata.named("REFERENCE").withIndex(9).ofType(Types.VARCHAR).withSize(50));
        addMetadata(tvaId, ColumnMetadata.named("TVA_ID").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepDpLigne is a Querydsl query type for QDepDpLigne
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepDpLigne extends com.querydsl.sql.RelationalPathBase<QDepDpLigne> {

    private static final long serialVersionUID = 1779584208;

    public static final QDepDpLigne depDpLigne = new QDepDpLigne("DEP_DP_LIGNE");

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Long> ceOrdre = createNumber("ceOrdre", Long.class);

    public final NumberPath<java.math.BigDecimal> dontAjustementTva = createNumber("dontAjustementTva", java.math.BigDecimal.class);

    public final NumberPath<Long> idDepDp = createNumber("idDepDp", Long.class);

    public final NumberPath<Long> idDepDpLigne = createNumber("idDepDpLigne", Long.class);

    public final NumberPath<Long> idDepSfLigne = createNumber("idDepSfLigne", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<java.math.BigDecimal> montantHt = createNumber("montantHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTtc = createNumber("montantTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTva = createNumber("montantTva", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> quantite = createNumber("quantite", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> tauxTva = createNumber("tauxTva", java.math.BigDecimal.class);

    public final NumberPath<Long> tvaId = createNumber("tvaId", Long.class);

    public final NumberPath<Long> typaId = createNumber("typaId", Long.class);

    public final StringPath typeDpLigne = createString("typeDpLigne");

    public final com.querydsl.sql.PrimaryKey<QDepDpLigne> depDpLignePk = createPrimaryKey(idDepDpLigne);

    public QDepDpLigne(String variable) {
        super(QDepDpLigne.class, forVariable(variable), "GFC", "DEP_DP_LIGNE");
        addMetadata();
    }

    public QDepDpLigne(String variable, String schema, String table) {
        super(QDepDpLigne.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepDpLigne(Path<? extends QDepDpLigne> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_DP_LIGNE");
        addMetadata();
    }

    public QDepDpLigne(PathMetadata metadata) {
        super(QDepDpLigne.class, metadata, "GFC", "DEP_DP_LIGNE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(12).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ceOrdre, ColumnMetadata.named("CE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(dontAjustementTva, ColumnMetadata.named("DONT_AJUSTEMENT_TVA").withIndex(15).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(idDepDp, ColumnMetadata.named("ID_DEP_DP").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepDpLigne, ColumnMetadata.named("ID_DEP_DP_LIGNE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepSfLigne, ColumnMetadata.named("ID_DEP_SF_LIGNE").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(10).ofType(Types.VARCHAR).withSize(200));
        addMetadata(montantHt, ColumnMetadata.named("MONTANT_HT").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTtc, ColumnMetadata.named("MONTANT_TTC").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTva, ColumnMetadata.named("MONTANT_TVA").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(quantite, ColumnMetadata.named("QUANTITE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(tauxTva, ColumnMetadata.named("TAUX_TVA").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(tvaId, ColumnMetadata.named("TVA_ID").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(typaId, ColumnMetadata.named("TYPA_ID").withIndex(11).ofType(Types.DECIMAL).withSize(0));
        addMetadata(typeDpLigne, ColumnMetadata.named("TYPE_DP_LIGNE").withIndex(9).ofType(Types.VARCHAR).withSize(30).notNull());
    }

}


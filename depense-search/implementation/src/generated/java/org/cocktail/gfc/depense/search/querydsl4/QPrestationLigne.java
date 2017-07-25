package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPrestationLigne is a Querydsl query type for QPrestationLigne
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPrestationLigne extends com.querydsl.sql.RelationalPathBase<QPrestationLigne> {

    private static final long serialVersionUID = -773598714;

    public static final QPrestationLigne prestationLigne = new QPrestationLigne("PRESTATION_LIGNE");

    public final NumberPath<Long> caarId = createNumber("caarId", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> prestId = createNumber("prestId", Long.class);

    public final NumberPath<java.math.BigDecimal> prligArtHt = createNumber("prligArtHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prligArtTtc = createNumber("prligArtTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prligArtTtcInitial = createNumber("prligArtTtcInitial", java.math.BigDecimal.class);

    public final DateTimePath<java.sql.Timestamp> prligDate = createDateTime("prligDate", java.sql.Timestamp.class);

    public final StringPath prligDescription = createString("prligDescription");

    public final NumberPath<Long> prligId = createNumber("prligId", Long.class);

    public final NumberPath<Long> prligIdPere = createNumber("prligIdPere", Long.class);

    public final NumberPath<java.math.BigDecimal> prligQuantite = createNumber("prligQuantite", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prligQuantiteReste = createNumber("prligQuantiteReste", java.math.BigDecimal.class);

    public final StringPath prligReference = createString("prligReference");

    public final NumberPath<java.math.BigDecimal> prligTotalHt = createNumber("prligTotalHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prligTotalResteHt = createNumber("prligTotalResteHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prligTotalResteTtc = createNumber("prligTotalResteTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prligTotalTtc = createNumber("prligTotalTtc", java.math.BigDecimal.class);

    public final NumberPath<Long> tvaId = createNumber("tvaId", Long.class);

    public final NumberPath<Long> tvaIdInitial = createNumber("tvaIdInitial", Long.class);

    public final NumberPath<Long> tyarId = createNumber("tyarId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QPrestationLigne> prestationLignePk = createPrimaryKey(prligId);

    public QPrestationLigne(String variable) {
        super(QPrestationLigne.class, forVariable(variable), "GFC", "PRESTATION_LIGNE");
        addMetadata();
    }

    public QPrestationLigne(String variable, String schema, String table) {
        super(QPrestationLigne.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPrestationLigne(Path<? extends QPrestationLigne> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PRESTATION_LIGNE");
        addMetadata();
    }

    public QPrestationLigne(PathMetadata metadata) {
        super(QPrestationLigne.class, metadata, "GFC", "PRESTATION_LIGNE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(caarId, ColumnMetadata.named("CAAR_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(20).ofType(Types.VARCHAR).withSize(20));
        addMetadata(prestId, ColumnMetadata.named("PREST_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prligArtHt, ColumnMetadata.named("PRLIG_ART_HT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(prligArtTtc, ColumnMetadata.named("PRLIG_ART_TTC").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(prligArtTtcInitial, ColumnMetadata.named("PRLIG_ART_TTC_INITIAL").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(prligDate, ColumnMetadata.named("PRLIG_DATE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(prligDescription, ColumnMetadata.named("PRLIG_DESCRIPTION").withIndex(7).ofType(Types.VARCHAR).withSize(1000).notNull());
        addMetadata(prligId, ColumnMetadata.named("PRLIG_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prligIdPere, ColumnMetadata.named("PRLIG_ID_PERE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(prligQuantite, ColumnMetadata.named("PRLIG_QUANTITE").withIndex(15).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(prligQuantiteReste, ColumnMetadata.named("PRLIG_QUANTITE_RESTE").withIndex(16).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(prligReference, ColumnMetadata.named("PRLIG_REFERENCE").withIndex(6).ofType(Types.VARCHAR).withSize(100));
        addMetadata(prligTotalHt, ColumnMetadata.named("PRLIG_TOTAL_HT").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(prligTotalResteHt, ColumnMetadata.named("PRLIG_TOTAL_RESTE_HT").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(prligTotalResteTtc, ColumnMetadata.named("PRLIG_TOTAL_RESTE_TTC").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(prligTotalTtc, ColumnMetadata.named("PRLIG_TOTAL_TTC").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(tvaId, ColumnMetadata.named("TVA_ID").withIndex(17).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tvaIdInitial, ColumnMetadata.named("TVA_ID_INITIAL").withIndex(18).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyarId, ColumnMetadata.named("TYAR_ID").withIndex(19).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


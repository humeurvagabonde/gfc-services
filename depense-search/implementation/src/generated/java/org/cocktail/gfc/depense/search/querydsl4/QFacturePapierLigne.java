package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFacturePapierLigne is a Querydsl query type for QFacturePapierLigne
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFacturePapierLigne extends com.querydsl.sql.RelationalPathBase<QFacturePapierLigne> {

    private static final long serialVersionUID = 899497560;

    public static final QFacturePapierLigne facturePapierLigne = new QFacturePapierLigne("FACTURE_PAPIER_LIGNE");

    public final NumberPath<Long> fapId = createNumber("fapId", Long.class);

    public final NumberPath<java.math.BigDecimal> fligArtHt = createNumber("fligArtHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fligArtTtc = createNumber("fligArtTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fligArtTtcInitial = createNumber("fligArtTtcInitial", java.math.BigDecimal.class);

    public final DateTimePath<java.sql.Timestamp> fligDate = createDateTime("fligDate", java.sql.Timestamp.class);

    public final StringPath fligDescription = createString("fligDescription");

    public final NumberPath<Long> fligId = createNumber("fligId", Long.class);

    public final NumberPath<Long> fligIdPere = createNumber("fligIdPere", Long.class);

    public final NumberPath<java.math.BigDecimal> fligQuantite = createNumber("fligQuantite", java.math.BigDecimal.class);

    public final StringPath fligReference = createString("fligReference");

    public final NumberPath<java.math.BigDecimal> fligTotalHt = createNumber("fligTotalHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fligTotalTtc = createNumber("fligTotalTtc", java.math.BigDecimal.class);

    public final NumberPath<Long> prligId = createNumber("prligId", Long.class);

    public final NumberPath<Long> tvaId = createNumber("tvaId", Long.class);

    public final NumberPath<Long> tvaIdInitial = createNumber("tvaIdInitial", Long.class);

    public final NumberPath<Long> tyarId = createNumber("tyarId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QFacturePapierLigne> facturePapierLignePk = createPrimaryKey(fligId);

    public QFacturePapierLigne(String variable) {
        super(QFacturePapierLigne.class, forVariable(variable), "GFC", "FACTURE_PAPIER_LIGNE");
        addMetadata();
    }

    public QFacturePapierLigne(String variable, String schema, String table) {
        super(QFacturePapierLigne.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFacturePapierLigne(Path<? extends QFacturePapierLigne> path) {
        super(path.getType(), path.getMetadata(), "GFC", "FACTURE_PAPIER_LIGNE");
        addMetadata();
    }

    public QFacturePapierLigne(PathMetadata metadata) {
        super(QFacturePapierLigne.class, metadata, "GFC", "FACTURE_PAPIER_LIGNE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fapId, ColumnMetadata.named("FAP_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fligArtHt, ColumnMetadata.named("FLIG_ART_HT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(fligArtTtc, ColumnMetadata.named("FLIG_ART_TTC").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(fligArtTtcInitial, ColumnMetadata.named("FLIG_ART_TTC_INITIAL").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(fligDate, ColumnMetadata.named("FLIG_DATE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(fligDescription, ColumnMetadata.named("FLIG_DESCRIPTION").withIndex(7).ofType(Types.VARCHAR).withSize(1000).notNull());
        addMetadata(fligId, ColumnMetadata.named("FLIG_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fligIdPere, ColumnMetadata.named("FLIG_ID_PERE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(fligQuantite, ColumnMetadata.named("FLIG_QUANTITE").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fligReference, ColumnMetadata.named("FLIG_REFERENCE").withIndex(6).ofType(Types.VARCHAR).withSize(100));
        addMetadata(fligTotalHt, ColumnMetadata.named("FLIG_TOTAL_HT").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(fligTotalTtc, ColumnMetadata.named("FLIG_TOTAL_TTC").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(3).notNull());
        addMetadata(prligId, ColumnMetadata.named("PRLIG_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tvaId, ColumnMetadata.named("TVA_ID").withIndex(14).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tvaIdInitial, ColumnMetadata.named("TVA_ID_INITIAL").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyarId, ColumnMetadata.named("TYAR_ID").withIndex(16).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


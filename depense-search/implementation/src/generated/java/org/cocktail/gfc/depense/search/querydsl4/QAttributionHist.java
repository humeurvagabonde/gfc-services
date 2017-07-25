package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAttributionHist is a Querydsl query type for QAttributionHist
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAttributionHist extends com.querydsl.sql.RelationalPathBase<QAttributionHist> {

    private static final long serialVersionUID = -1555651785;

    public static final QAttributionHist attributionHist = new QAttributionHist("ATTRIBUTION_HIST");

    public final StringPath ahAcceptee = createString("ahAcceptee");

    public final DateTimePath<java.sql.Timestamp> ahDate = createDateTime("ahDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> ahDebut = createDateTime("ahDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> ahFin = createDateTime("ahFin", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> ahHt = createNumber("ahHt", java.math.BigDecimal.class);

    public final StringPath ahLibelle = createString("ahLibelle");

    public final NumberPath<Long> ahOrdre = createNumber("ahOrdre", Long.class);

    public final StringPath ahSuppr = createString("ahSuppr");

    public final StringPath ahTypeControle = createString("ahTypeControle");

    public final StringPath ahValide = createString("ahValide");

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> lotOrdre = createNumber("lotOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAttributionHist> attributionHistPk = createPrimaryKey(ahOrdre);

    public QAttributionHist(String variable) {
        super(QAttributionHist.class, forVariable(variable), "GFC", "ATTRIBUTION_HIST");
        addMetadata();
    }

    public QAttributionHist(String variable, String schema, String table) {
        super(QAttributionHist.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAttributionHist(Path<? extends QAttributionHist> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ATTRIBUTION_HIST");
        addMetadata();
    }

    public QAttributionHist(PathMetadata metadata) {
        super(QAttributionHist.class, metadata, "GFC", "ATTRIBUTION_HIST");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ahAcceptee, ColumnMetadata.named("AH_ACCEPTEE").withIndex(11).ofType(Types.VARCHAR).withSize(1));
        addMetadata(ahDate, ColumnMetadata.named("AH_DATE").withIndex(2).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(ahDebut, ColumnMetadata.named("AH_DEBUT").withIndex(8).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(ahFin, ColumnMetadata.named("AH_FIN").withIndex(9).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(ahHt, ColumnMetadata.named("AH_HT").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(ahLibelle, ColumnMetadata.named("AH_LIBELLE").withIndex(14).ofType(Types.VARCHAR).withSize(100));
        addMetadata(ahOrdre, ColumnMetadata.named("AH_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ahSuppr, ColumnMetadata.named("AH_SUPPR").withIndex(4).ofType(Types.VARCHAR).withSize(1));
        addMetadata(ahTypeControle, ColumnMetadata.named("AH_TYPE_CONTROLE").withIndex(10).ofType(Types.VARCHAR).withSize(1));
        addMetadata(ahValide, ColumnMetadata.named("AH_VALIDE").withIndex(5).ofType(Types.VARCHAR).withSize(1));
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(lotOrdre, ColumnMetadata.named("LOT_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(12).ofType(Types.DECIMAL).withSize(0));
    }

}


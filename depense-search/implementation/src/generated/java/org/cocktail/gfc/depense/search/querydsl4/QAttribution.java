package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAttribution is a Querydsl query type for QAttribution
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAttribution extends com.querydsl.sql.RelationalPathBase<QAttribution> {

    private static final long serialVersionUID = 424448629;

    public static final QAttribution attribution = new QAttribution("ATTRIBUTION");

    public final StringPath attAcceptee = createString("attAcceptee");

    public final DateTimePath<java.sql.Timestamp> attDate = createDateTime("attDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> attDebut = createDateTime("attDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> attFin = createDateTime("attFin", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> attHt = createNumber("attHt", java.math.BigDecimal.class);

    public final NumberPath<Long> attIndex = createNumber("attIndex", Long.class);

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final StringPath attSuppr = createString("attSuppr");

    public final StringPath attTypeControle = createString("attTypeControle");

    public final StringPath attValide = createString("attValide");

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> lotOrdre = createNumber("lotOrdre", Long.class);

    public final NumberPath<Long> ribOrdre = createNumber("ribOrdre", Long.class);

    public final NumberPath<Long> titOrdre = createNumber("titOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAttribution> attributionPk = createPrimaryKey(attOrdre);

    public QAttribution(String variable) {
        super(QAttribution.class, forVariable(variable), "GFC", "ATTRIBUTION");
        addMetadata();
    }

    public QAttribution(String variable, String schema, String table) {
        super(QAttribution.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAttribution(Path<? extends QAttribution> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ATTRIBUTION");
        addMetadata();
    }

    public QAttribution(PathMetadata metadata) {
        super(QAttribution.class, metadata, "GFC", "ATTRIBUTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attAcceptee, ColumnMetadata.named("ATT_ACCEPTEE").withIndex(10).ofType(Types.VARCHAR).withSize(1));
        addMetadata(attDate, ColumnMetadata.named("ATT_DATE").withIndex(2).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(attDebut, ColumnMetadata.named("ATT_DEBUT").withIndex(7).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(attFin, ColumnMetadata.named("ATT_FIN").withIndex(8).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(attHt, ColumnMetadata.named("ATT_HT").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(attIndex, ColumnMetadata.named("ATT_INDEX").withIndex(14).ofType(Types.DECIMAL).withSize(38));
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(attSuppr, ColumnMetadata.named("ATT_SUPPR").withIndex(3).ofType(Types.VARCHAR).withSize(1));
        addMetadata(attTypeControle, ColumnMetadata.named("ATT_TYPE_CONTROLE").withIndex(9).ofType(Types.VARCHAR).withSize(1));
        addMetadata(attValide, ColumnMetadata.named("ATT_VALIDE").withIndex(4).ofType(Types.VARCHAR).withSize(1));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(lotOrdre, ColumnMetadata.named("LOT_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(ribOrdre, ColumnMetadata.named("RIB_ORDRE").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(titOrdre, ColumnMetadata.named("TIT_ORDRE").withIndex(13).ofType(Types.DECIMAL).withSize(0));
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(11).ofType(Types.DECIMAL).withSize(0));
    }

}


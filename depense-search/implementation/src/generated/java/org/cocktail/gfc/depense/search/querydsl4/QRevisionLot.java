package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRevisionLot is a Querydsl query type for QRevisionLot
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRevisionLot extends com.querydsl.sql.RelationalPathBase<QRevisionLot> {

    private static final long serialVersionUID = 1248174956;

    public static final QRevisionLot revisionLot = new QRevisionLot("REVISION_LOT");

    public final NumberPath<Long> lotOrdre = createNumber("lotOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> rlDate = createDateTime("rlDate", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> rlDiff = createNumber("rlDiff", java.math.BigDecimal.class);

    public final StringPath rlLibelle = createString("rlLibelle");

    public final NumberPath<Long> rlMntCorr = createNumber("rlMntCorr", Long.class);

    public final NumberPath<Long> rlOrdre = createNumber("rlOrdre", Long.class);

    public final StringPath rlSuppr = createString("rlSuppr");

    public final StringPath rlType = createString("rlType");

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRevisionLot> revisionLotPk = createPrimaryKey(rlOrdre);

    public QRevisionLot(String variable) {
        super(QRevisionLot.class, forVariable(variable), "GFC", "REVISION_LOT");
        addMetadata();
    }

    public QRevisionLot(String variable, String schema, String table) {
        super(QRevisionLot.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRevisionLot(Path<? extends QRevisionLot> path) {
        super(path.getType(), path.getMetadata(), "GFC", "REVISION_LOT");
        addMetadata();
    }

    public QRevisionLot(PathMetadata metadata) {
        super(QRevisionLot.class, metadata, "GFC", "REVISION_LOT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(lotOrdre, ColumnMetadata.named("LOT_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(rlDate, ColumnMetadata.named("RL_DATE").withIndex(7).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(rlDiff, ColumnMetadata.named("RL_DIFF").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(rlLibelle, ColumnMetadata.named("RL_LIBELLE").withIndex(8).ofType(Types.VARCHAR).withSize(512));
        addMetadata(rlMntCorr, ColumnMetadata.named("RL_MNT_CORR").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(rlOrdre, ColumnMetadata.named("RL_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(rlSuppr, ColumnMetadata.named("RL_SUPPR").withIndex(6).ofType(Types.VARCHAR).withSize(1));
        addMetadata(rlType, ColumnMetadata.named("RL_TYPE").withIndex(2).ofType(Types.VARCHAR).withSize(1));
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QZRecetteCtrlPlancoCtp is a Querydsl query type for QZRecetteCtrlPlancoCtp
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QZRecetteCtrlPlancoCtp extends com.querydsl.sql.RelationalPathBase<QZRecetteCtrlPlancoCtp> {

    private static final long serialVersionUID = 1694152287;

    public static final QZRecetteCtrlPlancoCtp zRecetteCtrlPlancoCtp = new QZRecetteCtrlPlancoCtp("Z_RECETTE_CTRL_PLANCO_CTP");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath pcoNum = createString("pcoNum");

    public final DateTimePath<java.sql.Timestamp> rpcoctpDateSaisie = createDateTime("rpcoctpDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<Long> rpcoctpId = createNumber("rpcoctpId", Long.class);

    public final NumberPath<java.math.BigDecimal> rpcoctpTtcSaisie = createNumber("rpcoctpTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> rpcoId = createNumber("rpcoId", Long.class);

    public final NumberPath<Long> zrpcoctpId = createNumber("zrpcoctpId", Long.class);

    public final NumberPath<Long> zrpcoId = createNumber("zrpcoId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QZRecetteCtrlPlancoCtp> zRecetteCtrlPlancoCtpPk = createPrimaryKey(zrpcoctpId);

    public QZRecetteCtrlPlancoCtp(String variable) {
        super(QZRecetteCtrlPlancoCtp.class, forVariable(variable), "GFC", "Z_RECETTE_CTRL_PLANCO_CTP");
        addMetadata();
    }

    public QZRecetteCtrlPlancoCtp(String variable, String schema, String table) {
        super(QZRecetteCtrlPlancoCtp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QZRecetteCtrlPlancoCtp(Path<? extends QZRecetteCtrlPlancoCtp> path) {
        super(path.getType(), path.getMetadata(), "GFC", "Z_RECETTE_CTRL_PLANCO_CTP");
        addMetadata();
    }

    public QZRecetteCtrlPlancoCtp(PathMetadata metadata) {
        super(QZRecetteCtrlPlancoCtp.class, metadata, "GFC", "Z_RECETTE_CTRL_PLANCO_CTP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(8).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(5).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(rpcoctpDateSaisie, ColumnMetadata.named("RPCOCTP_DATE_SAISIE").withIndex(7).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(rpcoctpId, ColumnMetadata.named("RPCOCTP_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rpcoctpTtcSaisie, ColumnMetadata.named("RPCOCTP_TTC_SAISIE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rpcoId, ColumnMetadata.named("RPCO_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zrpcoctpId, ColumnMetadata.named("ZRPCOCTP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zrpcoId, ColumnMetadata.named("ZRPCO_ID").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


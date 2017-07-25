package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecetteCtrlPlancoCtp is a Querydsl query type for QRecetteCtrlPlancoCtp
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecetteCtrlPlancoCtp extends com.querydsl.sql.RelationalPathBase<QRecetteCtrlPlancoCtp> {

    private static final long serialVersionUID = -1338781927;

    public static final QRecetteCtrlPlancoCtp recetteCtrlPlancoCtp = new QRecetteCtrlPlancoCtp("RECETTE_CTRL_PLANCO_CTP");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath pcoNum = createString("pcoNum");

    public final DateTimePath<java.sql.Timestamp> rpcoctpDateSaisie = createDateTime("rpcoctpDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<Long> rpcoctpId = createNumber("rpcoctpId", Long.class);

    public final NumberPath<java.math.BigDecimal> rpcoctpTtcSaisie = createNumber("rpcoctpTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> rpcoId = createNumber("rpcoId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRecetteCtrlPlancoCtp> recetteCtrlPlancoCtpPk = createPrimaryKey(rpcoctpId);

    public QRecetteCtrlPlancoCtp(String variable) {
        super(QRecetteCtrlPlancoCtp.class, forVariable(variable), "GFC", "RECETTE_CTRL_PLANCO_CTP");
        addMetadata();
    }

    public QRecetteCtrlPlancoCtp(String variable, String schema, String table) {
        super(QRecetteCtrlPlancoCtp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecetteCtrlPlancoCtp(Path<? extends QRecetteCtrlPlancoCtp> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RECETTE_CTRL_PLANCO_CTP");
        addMetadata();
    }

    public QRecetteCtrlPlancoCtp(PathMetadata metadata) {
        super(QRecetteCtrlPlancoCtp.class, metadata, "GFC", "RECETTE_CTRL_PLANCO_CTP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(7).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(rpcoctpDateSaisie, ColumnMetadata.named("RPCOCTP_DATE_SAISIE").withIndex(6).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(rpcoctpId, ColumnMetadata.named("RPCOCTP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rpcoctpTtcSaisie, ColumnMetadata.named("RPCOCTP_TTC_SAISIE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rpcoId, ColumnMetadata.named("RPCO_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


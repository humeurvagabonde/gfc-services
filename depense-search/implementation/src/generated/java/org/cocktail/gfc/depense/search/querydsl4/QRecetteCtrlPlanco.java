package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecetteCtrlPlanco is a Querydsl query type for QRecetteCtrlPlanco
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecetteCtrlPlanco extends com.querydsl.sql.RelationalPathBase<QRecetteCtrlPlanco> {

    private static final long serialVersionUID = -1805197018;

    public static final QRecetteCtrlPlanco recetteCtrlPlanco = new QRecetteCtrlPlanco("RECETTE_CTRL_PLANCO");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final DateTimePath<java.sql.Timestamp> rpcoDateSaisie = createDateTime("rpcoDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> rpcoHtSaisie = createNumber("rpcoHtSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> rpcoId = createNumber("rpcoId", Long.class);

    public final NumberPath<java.math.BigDecimal> rpcoTtcSaisie = createNumber("rpcoTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> rpcoTvaSaisie = createNumber("rpcoTvaSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> tboOrdre = createNumber("tboOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRecetteCtrlPlanco> recetteCtrlPlancoPk = createPrimaryKey(rpcoId);

    public QRecetteCtrlPlanco(String variable) {
        super(QRecetteCtrlPlanco.class, forVariable(variable), "GFC", "RECETTE_CTRL_PLANCO");
        addMetadata();
    }

    public QRecetteCtrlPlanco(String variable, String schema, String table) {
        super(QRecetteCtrlPlanco.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecetteCtrlPlanco(Path<? extends QRecetteCtrlPlanco> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RECETTE_CTRL_PLANCO");
        addMetadata();
    }

    public QRecetteCtrlPlanco(PathMetadata metadata) {
        super(QRecetteCtrlPlanco.class, metadata, "GFC", "RECETTE_CTRL_PLANCO");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(4).ofType(Types.VARCHAR).withSize(20));
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rpcoDateSaisie, ColumnMetadata.named("RPCO_DATE_SAISIE").withIndex(8).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(rpcoHtSaisie, ColumnMetadata.named("RPCO_HT_SAISIE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rpcoId, ColumnMetadata.named("RPCO_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rpcoTtcSaisie, ColumnMetadata.named("RPCO_TTC_SAISIE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rpcoTvaSaisie, ColumnMetadata.named("RPCO_TVA_SAISIE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(tboOrdre, ColumnMetadata.named("TBO_ORDRE").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QZFactureCtrlPlanco is a Querydsl query type for QZFactureCtrlPlanco
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QZFactureCtrlPlanco extends com.querydsl.sql.RelationalPathBase<QZFactureCtrlPlanco> {

    private static final long serialVersionUID = 1782406188;

    public static final QZFactureCtrlPlanco zFactureCtrlPlanco = new QZFactureCtrlPlanco("Z_FACTURE_CTRL_PLANCO");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> facId = createNumber("facId", Long.class);

    public final DateTimePath<java.sql.Timestamp> fpcoDateSaisie = createDateTime("fpcoDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> fpcoHtReste = createNumber("fpcoHtReste", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fpcoHtSaisie = createNumber("fpcoHtSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> fpcoId = createNumber("fpcoId", Long.class);

    public final NumberPath<java.math.BigDecimal> fpcoTtcSaisie = createNumber("fpcoTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fpcoTvaReste = createNumber("fpcoTvaReste", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fpcoTvaSaisie = createNumber("fpcoTvaSaisie", java.math.BigDecimal.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> zfacId = createNumber("zfacId", Long.class);

    public final NumberPath<Long> zfpcoId = createNumber("zfpcoId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QZFactureCtrlPlanco> zFactureCtrlPlancoPk = createPrimaryKey(zfpcoId);

    public QZFactureCtrlPlanco(String variable) {
        super(QZFactureCtrlPlanco.class, forVariable(variable), "GFC", "Z_FACTURE_CTRL_PLANCO");
        addMetadata();
    }

    public QZFactureCtrlPlanco(String variable, String schema, String table) {
        super(QZFactureCtrlPlanco.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QZFactureCtrlPlanco(Path<? extends QZFactureCtrlPlanco> path) {
        super(path.getType(), path.getMetadata(), "GFC", "Z_FACTURE_CTRL_PLANCO");
        addMetadata();
    }

    public QZFactureCtrlPlanco(PathMetadata metadata) {
        super(QZFactureCtrlPlanco.class, metadata, "GFC", "Z_FACTURE_CTRL_PLANCO");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(facId, ColumnMetadata.named("FAC_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fpcoDateSaisie, ColumnMetadata.named("FPCO_DATE_SAISIE").withIndex(11).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(fpcoHtReste, ColumnMetadata.named("FPCO_HT_RESTE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fpcoHtSaisie, ColumnMetadata.named("FPCO_HT_SAISIE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fpcoId, ColumnMetadata.named("FPCO_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fpcoTtcSaisie, ColumnMetadata.named("FPCO_TTC_SAISIE").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fpcoTvaReste, ColumnMetadata.named("FPCO_TVA_RESTE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fpcoTvaSaisie, ColumnMetadata.named("FPCO_TVA_SAISIE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(5).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(zfacId, ColumnMetadata.named("ZFAC_ID").withIndex(12).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zfpcoId, ColumnMetadata.named("ZFPCO_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


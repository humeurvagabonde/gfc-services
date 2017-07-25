package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFactureCtrlPlanco is a Querydsl query type for QFactureCtrlPlanco
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFactureCtrlPlanco extends com.querydsl.sql.RelationalPathBase<QFactureCtrlPlanco> {

    private static final long serialVersionUID = 1632079282;

    public static final QFactureCtrlPlanco factureCtrlPlanco = new QFactureCtrlPlanco("FACTURE_CTRL_PLANCO");

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

    public final com.querydsl.sql.PrimaryKey<QFactureCtrlPlanco> factureCtrlPlancoPk = createPrimaryKey(fpcoId);

    public QFactureCtrlPlanco(String variable) {
        super(QFactureCtrlPlanco.class, forVariable(variable), "GFC", "FACTURE_CTRL_PLANCO");
        addMetadata();
    }

    public QFactureCtrlPlanco(String variable, String schema, String table) {
        super(QFactureCtrlPlanco.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFactureCtrlPlanco(Path<? extends QFactureCtrlPlanco> path) {
        super(path.getType(), path.getMetadata(), "GFC", "FACTURE_CTRL_PLANCO");
        addMetadata();
    }

    public QFactureCtrlPlanco(PathMetadata metadata) {
        super(QFactureCtrlPlanco.class, metadata, "GFC", "FACTURE_CTRL_PLANCO");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(facId, ColumnMetadata.named("FAC_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fpcoDateSaisie, ColumnMetadata.named("FPCO_DATE_SAISIE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(fpcoHtReste, ColumnMetadata.named("FPCO_HT_RESTE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fpcoHtSaisie, ColumnMetadata.named("FPCO_HT_SAISIE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fpcoId, ColumnMetadata.named("FPCO_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fpcoTtcSaisie, ColumnMetadata.named("FPCO_TTC_SAISIE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fpcoTvaReste, ColumnMetadata.named("FPCO_TVA_RESTE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fpcoTvaSaisie, ColumnMetadata.named("FPCO_TVA_SAISIE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


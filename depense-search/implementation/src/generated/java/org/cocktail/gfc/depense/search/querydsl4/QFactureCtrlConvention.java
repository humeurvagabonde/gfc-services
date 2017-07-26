package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFactureCtrlConvention is a Querydsl query type for QFactureCtrlConvention
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFactureCtrlConvention extends com.querydsl.sql.RelationalPathBase<QFactureCtrlConvention> {

    private static final long serialVersionUID = 2026570062;

    public static final QFactureCtrlConvention factureCtrlConvention = new QFactureCtrlConvention("FACTURE_CTRL_CONVENTION");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> facId = createNumber("facId", Long.class);

    public final DateTimePath<java.sql.Timestamp> fconDateSaisie = createDateTime("fconDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> fconHtSaisie = createNumber("fconHtSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> fconId = createNumber("fconId", Long.class);

    public final NumberPath<java.math.BigDecimal> fconMontantBudgetaire = createNumber("fconMontantBudgetaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fconMontantBudgetaireReste = createNumber("fconMontantBudgetaireReste", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fconTtcSaisie = createNumber("fconTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fconTvaSaisie = createNumber("fconTvaSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final com.querydsl.sql.PrimaryKey<QFactureCtrlConvention> factureCtrlConventionPk = createPrimaryKey(fconId);

    public QFactureCtrlConvention(String variable) {
        super(QFactureCtrlConvention.class, forVariable(variable), "GFC", "FACTURE_CTRL_CONVENTION");
        addMetadata();
    }

    public QFactureCtrlConvention(String variable, String schema, String table) {
        super(QFactureCtrlConvention.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFactureCtrlConvention(Path<? extends QFactureCtrlConvention> path) {
        super(path.getType(), path.getMetadata(), "GFC", "FACTURE_CTRL_CONVENTION");
        addMetadata();
    }

    public QFactureCtrlConvention(PathMetadata metadata) {
        super(QFactureCtrlConvention.class, metadata, "GFC", "FACTURE_CTRL_CONVENTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(facId, ColumnMetadata.named("FAC_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fconDateSaisie, ColumnMetadata.named("FCON_DATE_SAISIE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(fconHtSaisie, ColumnMetadata.named("FCON_HT_SAISIE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fconId, ColumnMetadata.named("FCON_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fconMontantBudgetaire, ColumnMetadata.named("FCON_MONTANT_BUDGETAIRE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fconMontantBudgetaireReste, ColumnMetadata.named("FCON_MONTANT_BUDGETAIRE_RESTE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fconTtcSaisie, ColumnMetadata.named("FCON_TTC_SAISIE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fconTvaSaisie, ColumnMetadata.named("FCON_TVA_SAISIE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}

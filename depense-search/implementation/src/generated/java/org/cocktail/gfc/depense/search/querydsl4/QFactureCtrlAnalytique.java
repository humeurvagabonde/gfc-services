package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFactureCtrlAnalytique is a Querydsl query type for QFactureCtrlAnalytique
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFactureCtrlAnalytique extends com.querydsl.sql.RelationalPathBase<QFactureCtrlAnalytique> {

    private static final long serialVersionUID = -956911544;

    public static final QFactureCtrlAnalytique factureCtrlAnalytique = new QFactureCtrlAnalytique("FACTURE_CTRL_ANALYTIQUE");

    public final NumberPath<Long> canId = createNumber("canId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> facId = createNumber("facId", Long.class);

    public final DateTimePath<java.sql.Timestamp> fanaDateSaisie = createDateTime("fanaDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> fanaHtSaisie = createNumber("fanaHtSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> fanaId = createNumber("fanaId", Long.class);

    public final NumberPath<java.math.BigDecimal> fanaMontantBudgetaire = createNumber("fanaMontantBudgetaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fanaMontantBudgetaireReste = createNumber("fanaMontantBudgetaireReste", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fanaTtcSaisie = createNumber("fanaTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> fanaTvaSaisie = createNumber("fanaTvaSaisie", java.math.BigDecimal.class);

    public final com.querydsl.sql.PrimaryKey<QFactureCtrlAnalytique> factureCtrlAnalytiquePk = createPrimaryKey(fanaId);

    public QFactureCtrlAnalytique(String variable) {
        super(QFactureCtrlAnalytique.class, forVariable(variable), "GFC", "FACTURE_CTRL_ANALYTIQUE");
        addMetadata();
    }

    public QFactureCtrlAnalytique(String variable, String schema, String table) {
        super(QFactureCtrlAnalytique.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFactureCtrlAnalytique(Path<? extends QFactureCtrlAnalytique> path) {
        super(path.getType(), path.getMetadata(), "GFC", "FACTURE_CTRL_ANALYTIQUE");
        addMetadata();
    }

    public QFactureCtrlAnalytique(PathMetadata metadata) {
        super(QFactureCtrlAnalytique.class, metadata, "GFC", "FACTURE_CTRL_ANALYTIQUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(canId, ColumnMetadata.named("CAN_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(facId, ColumnMetadata.named("FAC_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fanaDateSaisie, ColumnMetadata.named("FANA_DATE_SAISIE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(fanaHtSaisie, ColumnMetadata.named("FANA_HT_SAISIE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fanaId, ColumnMetadata.named("FANA_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fanaMontantBudgetaire, ColumnMetadata.named("FANA_MONTANT_BUDGETAIRE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fanaMontantBudgetaireReste, ColumnMetadata.named("FANA_MONTANT_BUDGETAIRE_RESTE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fanaTtcSaisie, ColumnMetadata.named("FANA_TTC_SAISIE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fanaTvaSaisie, ColumnMetadata.named("FANA_TVA_SAISIE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
    }

}


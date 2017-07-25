package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFacture is a Querydsl query type for QFacture
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFacture extends com.querydsl.sql.RelationalPathBase<QFacture> {

    private static final long serialVersionUID = -1824803726;

    public static final QFacture facture = new QFacture("FACTURE");

    public final NumberPath<Long> echeId = createNumber("echeId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final DateTimePath<java.sql.Timestamp> facDateSaisie = createDateTime("facDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> facHtSaisie = createNumber("facHtSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> facId = createNumber("facId", Long.class);

    public final StringPath facLib = createString("facLib");

    public final NumberPath<java.math.BigDecimal> facMontantBudgetaire = createNumber("facMontantBudgetaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> facMontantBudgetaireReste = createNumber("facMontantBudgetaireReste", java.math.BigDecimal.class);

    public final NumberPath<Long> facNumero = createNumber("facNumero", Long.class);

    public final NumberPath<java.math.BigDecimal> facTtcSaisie = createNumber("facTtcSaisie", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> facTvaSaisie = createNumber("facTvaSaisie", java.math.BigDecimal.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> morOrdre = createNumber("morOrdre", Long.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> tapId = createNumber("tapId", Long.class);

    public final NumberPath<Long> tyapId = createNumber("tyapId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QFacture> facturePk = createPrimaryKey(facId);

    public QFacture(String variable) {
        super(QFacture.class, forVariable(variable), "GFC", "FACTURE");
        addMetadata();
    }

    public QFacture(String variable, String schema, String table) {
        super(QFacture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFacture(Path<? extends QFacture> path) {
        super(path.getType(), path.getMetadata(), "GFC", "FACTURE");
        addMetadata();
    }

    public QFacture(PathMetadata metadata) {
        super(QFacture.class, metadata, "GFC", "FACTURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(echeId, ColumnMetadata.named("ECHE_ID").withIndex(16).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(facDateSaisie, ColumnMetadata.named("FAC_DATE_SAISIE").withIndex(6).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(facHtSaisie, ColumnMetadata.named("FAC_HT_SAISIE").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(facId, ColumnMetadata.named("FAC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(facLib, ColumnMetadata.named("FAC_LIB").withIndex(7).ofType(Types.VARCHAR).withSize(500));
        addMetadata(facMontantBudgetaire, ColumnMetadata.named("FAC_MONTANT_BUDGETAIRE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(facMontantBudgetaireReste, ColumnMetadata.named("FAC_MONTANT_BUDGETAIRE_RESTE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(facNumero, ColumnMetadata.named("FAC_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(facTtcSaisie, ColumnMetadata.named("FAC_TTC_SAISIE").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(facTvaSaisie, ColumnMetadata.named("FAC_TVA_SAISIE").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(14).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(21).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(20).ofType(Types.DECIMAL).withSize(0));
        addMetadata(morOrdre, ColumnMetadata.named("MOR_ORDRE").withIndex(13).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tapId, ColumnMetadata.named("TAP_ID").withIndex(15).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyapId, ColumnMetadata.named("TYAP_ID").withIndex(17).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(18).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(19).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


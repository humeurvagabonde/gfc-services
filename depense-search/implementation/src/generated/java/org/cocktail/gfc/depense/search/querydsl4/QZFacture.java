package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QZFacture is a Querydsl query type for QZFacture
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QZFacture extends com.querydsl.sql.RelationalPathBase<QZFacture> {

    private static final long serialVersionUID = 1496347500;

    public static final QZFacture zFacture = new QZFacture("Z_FACTURE");

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

    public final DateTimePath<java.sql.Timestamp> zfacDate = createDateTime("zfacDate", java.sql.Timestamp.class);

    public final NumberPath<Long> zfacId = createNumber("zfacId", Long.class);

    public final NumberPath<Long> zfacUtlOrdre = createNumber("zfacUtlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QZFacture> zFacturePk = createPrimaryKey(zfacId);

    public QZFacture(String variable) {
        super(QZFacture.class, forVariable(variable), "GFC", "Z_FACTURE");
        addMetadata();
    }

    public QZFacture(String variable, String schema, String table) {
        super(QZFacture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QZFacture(Path<? extends QZFacture> path) {
        super(path.getType(), path.getMetadata(), "GFC", "Z_FACTURE");
        addMetadata();
    }

    public QZFacture(PathMetadata metadata) {
        super(QZFacture.class, metadata, "GFC", "Z_FACTURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(echeId, ColumnMetadata.named("ECHE_ID").withIndex(19).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(facDateSaisie, ColumnMetadata.named("FAC_DATE_SAISIE").withIndex(9).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(facHtSaisie, ColumnMetadata.named("FAC_HT_SAISIE").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(facId, ColumnMetadata.named("FAC_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(facLib, ColumnMetadata.named("FAC_LIB").withIndex(10).ofType(Types.VARCHAR).withSize(500));
        addMetadata(facMontantBudgetaire, ColumnMetadata.named("FAC_MONTANT_BUDGETAIRE").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(facMontantBudgetaireReste, ColumnMetadata.named("FAC_MONTANT_BUDGETAIRE_RESTE").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(facNumero, ColumnMetadata.named("FAC_NUMERO").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(facTtcSaisie, ColumnMetadata.named("FAC_TTC_SAISIE").withIndex(15).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(facTvaSaisie, ColumnMetadata.named("FAC_TVA_SAISIE").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(17).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(24).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(23).ofType(Types.DECIMAL).withSize(0));
        addMetadata(morOrdre, ColumnMetadata.named("MOR_ORDRE").withIndex(16).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tapId, ColumnMetadata.named("TAP_ID").withIndex(18).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyapId, ColumnMetadata.named("TYAP_ID").withIndex(20).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(21).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(22).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zfacDate, ColumnMetadata.named("ZFAC_DATE").withIndex(2).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(zfacId, ColumnMetadata.named("ZFAC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zfacUtlOrdre, ColumnMetadata.named("ZFAC_UTL_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


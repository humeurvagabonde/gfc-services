package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptDepense is a Querydsl query type for QCptDepense
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptDepense extends com.querydsl.sql.RelationalPathBase<QCptDepense> {

    private static final long serialVersionUID = 1668455661;

    public static final QCptDepense cptDepense = new QCptDepense("CPT_DEPENSE");

    public final StringPath depAdresse = createString("depAdresse");

    public final DateTimePath<java.sql.Timestamp> depDateCompta = createDateTime("depDateCompta", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> depDateFournis = createDateTime("depDateFournis", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> depDateReception = createDateTime("depDateReception", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> depDateService = createDateTime("depDateService", java.sql.Timestamp.class);

    public final StringPath depEtat = createString("depEtat");

    public final StringPath depFournisseur = createString("depFournisseur");

    public final NumberPath<java.math.BigDecimal> depHt = createNumber("depHt", java.math.BigDecimal.class);

    public final NumberPath<Long> depId = createNumber("depId", Long.class);

    public final StringPath depLigneBudgetaire = createString("depLigneBudgetaire");

    public final StringPath depLot = createString("depLot");

    public final StringPath depMarches = createString("depMarches");

    public final NumberPath<java.math.BigDecimal> depMontantDisquette = createNumber("depMontantDisquette", java.math.BigDecimal.class);

    public final StringPath depNomenclature = createString("depNomenclature");

    public final StringPath depNumero = createString("depNumero");

    public final NumberPath<Long> depOrdre = createNumber("depOrdre", Long.class);

    public final StringPath depRejet = createString("depRejet");

    public final NumberPath<Long> depRib = createNumber("depRib", Long.class);

    public final StringPath depSuppression = createString("depSuppression");

    public final NumberPath<java.math.BigDecimal> depTtc = createNumber("depTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> depTva = createNumber("depTva", java.math.BigDecimal.class);

    public final NumberPath<Long> ecdOrdreEma = createNumber("ecdOrdreEma", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> manId = createNumber("manId", Long.class);

    public final NumberPath<Long> manOrdre = createNumber("manOrdre", Long.class);

    public final NumberPath<Long> modOrdre = createNumber("modOrdre", Long.class);

    public final NumberPath<Long> orgOrdre = createNumber("orgOrdre", Long.class);

    public final StringPath pcoOrdre = createString("pcoOrdre");

    public final NumberPath<Long> tcdOrdre = createNumber("tcdOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCptDepense> depensePk = createPrimaryKey(depId);

    public QCptDepense(String variable) {
        super(QCptDepense.class, forVariable(variable), "GFC", "CPT_DEPENSE");
        addMetadata();
    }

    public QCptDepense(String variable, String schema, String table) {
        super(QCptDepense.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptDepense(Path<? extends QCptDepense> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_DEPENSE");
        addMetadata();
    }

    public QCptDepense(PathMetadata metadata) {
        super(QCptDepense.class, metadata, "GFC", "CPT_DEPENSE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(depAdresse, ColumnMetadata.named("DEP_ADRESSE").withIndex(4).ofType(Types.VARCHAR).withSize(200));
        addMetadata(depDateCompta, ColumnMetadata.named("DEP_DATE_COMPTA").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(depDateFournis, ColumnMetadata.named("DEP_DATE_FOURNIS").withIndex(32).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(depDateReception, ColumnMetadata.named("DEP_DATE_RECEPTION").withIndex(6).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(depDateService, ColumnMetadata.named("DEP_DATE_SERVICE").withIndex(7).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(depEtat, ColumnMetadata.named("DEP_ETAT").withIndex(8).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(depFournisseur, ColumnMetadata.named("DEP_FOURNISSEUR").withIndex(9).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(depHt, ColumnMetadata.named("DEP_HT").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(depId, ColumnMetadata.named("DEP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(depLigneBudgetaire, ColumnMetadata.named("DEP_LIGNE_BUDGETAIRE").withIndex(11).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(depLot, ColumnMetadata.named("DEP_LOT").withIndex(12).ofType(Types.VARCHAR).withSize(200));
        addMetadata(depMarches, ColumnMetadata.named("DEP_MARCHES").withIndex(13).ofType(Types.VARCHAR).withSize(200));
        addMetadata(depMontantDisquette, ColumnMetadata.named("DEP_MONTANT_DISQUETTE").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(depNomenclature, ColumnMetadata.named("DEP_NOMENCLATURE").withIndex(15).ofType(Types.VARCHAR).withSize(200));
        addMetadata(depNumero, ColumnMetadata.named("DEP_NUMERO").withIndex(16).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(depOrdre, ColumnMetadata.named("DEP_ORDRE").withIndex(17).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(depRejet, ColumnMetadata.named("DEP_REJET").withIndex(18).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(depRib, ColumnMetadata.named("DEP_RIB").withIndex(19).ofType(Types.DECIMAL).withSize(38));
        addMetadata(depSuppression, ColumnMetadata.named("DEP_SUPPRESSION").withIndex(20).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(depTtc, ColumnMetadata.named("DEP_TTC").withIndex(21).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(depTva, ColumnMetadata.named("DEP_TVA").withIndex(22).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ecdOrdreEma, ColumnMetadata.named("ECD_ORDRE_EMA").withIndex(31).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(23).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(24).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(manId, ColumnMetadata.named("MAN_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(manOrdre, ColumnMetadata.named("MAN_ORDRE").withIndex(25).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(modOrdre, ColumnMetadata.named("MOD_ORDRE").withIndex(26).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(orgOrdre, ColumnMetadata.named("ORG_ORDRE").withIndex(29).ofType(Types.DECIMAL).withSize(38));
        addMetadata(pcoOrdre, ColumnMetadata.named("PCO_ORDRE").withIndex(27).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(tcdOrdre, ColumnMetadata.named("TCD_ORDRE").withIndex(30).ofType(Types.DECIMAL).withSize(0));
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(28).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


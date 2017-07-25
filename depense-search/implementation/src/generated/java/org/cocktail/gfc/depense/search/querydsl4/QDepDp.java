package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepDp is a Querydsl query type for QDepDp
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepDp extends com.querydsl.sql.RelationalPathBase<QDepDp> {

    private static final long serialVersionUID = -1576798351;

    public static final QDepDp depDp = new QDepDp("DEP_DP");

    public final StringPath dateCreation = createString("dateCreation");

    public final StringPath dateDesactivation = createString("dateDesactivation");

    public final StringPath dateEcheanceModifiee = createString("dateEcheanceModifiee");

    public final StringPath dateEcheanceTheorique = createString("dateEcheanceTheorique");

    public final StringPath dateEnAttente = createString("dateEnAttente");

    public final StringPath dateModification = createString("dateModification");

    public final StringPath datePaiement = createString("datePaiement");

    public final StringPath dateValidOuRefusOrdo = createString("dateValidOuRefusOrdo");

    public final StringPath dateVisaOuRejetComptab = createString("dateVisaOuRejetComptab");

    public final NumberPath<Integer> enAttente = createNumber("enAttente", Integer.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouAPayer = createNumber("fouAPayer", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> idDepDp = createNumber("idDepDp", Long.class);

    public final NumberPath<Long> idDepFacture = createNumber("idDepFacture", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<Long> lockVersion = createNumber("lockVersion", Long.class);

    public final NumberPath<Long> modOrdre = createNumber("modOrdre", Long.class);

    public final NumberPath<java.math.BigDecimal> montantAPayerTtc = createNumber("montantAPayerTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantAPayerTtcApresRg = createNumber("montantAPayerTtcApresRg", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantFactureHt = createNumber("montantFactureHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantFactureTtc = createNumber("montantFactureTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantFactureTva = createNumber("montantFactureTva", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantRapprocherHt = createNumber("montantRapprocherHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantRapprocherTtc = createNumber("montantRapprocherTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantRetenueGarantie = createNumber("montantRetenueGarantie", java.math.BigDecimal.class);

    public final StringPath motifRefusOrdo = createString("motifRefusOrdo");

    public final StringPath motifRejetComptab = createString("motifRejetComptab");

    public final StringPath numDp = createString("numDp");

    public final StringPath objEnAttente = createString("objEnAttente");

    public final NumberPath<Long> paiOrdre = createNumber("paiOrdre", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdDesactivation = createNumber("persIdDesactivation", Long.class);

    public final NumberPath<Long> persIdEnAttente = createNumber("persIdEnAttente", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final NumberPath<Long> persIdValidOuRefusOrdo = createNumber("persIdValidOuRefusOrdo", Long.class);

    public final NumberPath<Long> persIdVisaOuRejetComptab = createNumber("persIdVisaOuRejetComptab", Long.class);

    public final NumberPath<Long> ribOrdreComptab = createNumber("ribOrdreComptab", Long.class);

    public final NumberPath<Long> ribOrdreOrdo = createNumber("ribOrdreOrdo", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QDepDp> depDpPk = createPrimaryKey(idDepDp);

    public QDepDp(String variable) {
        super(QDepDp.class, forVariable(variable), "GFC", "DEP_DP");
        addMetadata();
    }

    public QDepDp(String variable, String schema, String table) {
        super(QDepDp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepDp(Path<? extends QDepDp> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_DP");
        addMetadata();
    }

    public QDepDp(PathMetadata metadata) {
        super(QDepDp.class, metadata, "GFC", "DEP_DP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(12).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(dateDesactivation, ColumnMetadata.named("DATE_DESACTIVATION").withIndex(39).ofType(Types.VARCHAR).withSize(30));
        addMetadata(dateEcheanceModifiee, ColumnMetadata.named("DATE_ECHEANCE_MODIFIEE").withIndex(36).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(dateEcheanceTheorique, ColumnMetadata.named("DATE_ECHEANCE_THEORIQUE").withIndex(21).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(dateEnAttente, ColumnMetadata.named("DATE_EN_ATTENTE").withIndex(33).ofType(Types.VARCHAR).withSize(30));
        addMetadata(dateModification, ColumnMetadata.named("DATE_MODIFICATION").withIndex(14).ofType(Types.VARCHAR).withSize(30));
        addMetadata(datePaiement, ColumnMetadata.named("DATE_PAIEMENT").withIndex(30).ofType(Types.VARCHAR).withSize(30));
        addMetadata(dateValidOuRefusOrdo, ColumnMetadata.named("DATE_VALID_OU_REFUS_ORDO").withIndex(23).ofType(Types.VARCHAR).withSize(30));
        addMetadata(dateVisaOuRejetComptab, ColumnMetadata.named("DATE_VISA_OU_REJET_COMPTAB").withIndex(26).ofType(Types.VARCHAR).withSize(30));
        addMetadata(enAttente, ColumnMetadata.named("EN_ATTENTE").withIndex(32).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(15).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouAPayer, ColumnMetadata.named("FOU_A_PAYER").withIndex(9).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepDp, ColumnMetadata.named("ID_DEP_DP").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepFacture, ColumnMetadata.named("ID_DEP_FACTURE").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(7).ofType(Types.VARCHAR).withSize(200));
        addMetadata(lockVersion, ColumnMetadata.named("LOCK_VERSION").withIndex(38).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(modOrdre, ColumnMetadata.named("MOD_ORDRE").withIndex(17).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(montantAPayerTtc, ColumnMetadata.named("MONTANT_A_PAYER_TTC").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantAPayerTtcApresRg, ColumnMetadata.named("MONTANT_A_PAYER_TTC_APRES_RG").withIndex(20).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantFactureHt, ColumnMetadata.named("MONTANT_FACTURE_HT").withIndex(18).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantFactureTtc, ColumnMetadata.named("MONTANT_FACTURE_TTC").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantFactureTva, ColumnMetadata.named("MONTANT_FACTURE_TVA").withIndex(19).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantRapprocherHt, ColumnMetadata.named("MONTANT_RAPPROCHER_HT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantRapprocherTtc, ColumnMetadata.named("MONTANT_RAPPROCHER_TTC").withIndex(37).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantRetenueGarantie, ColumnMetadata.named("MONTANT_RETENUE_GARANTIE").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(motifRefusOrdo, ColumnMetadata.named("MOTIF_REFUS_ORDO").withIndex(24).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(motifRejetComptab, ColumnMetadata.named("MOTIF_REJET_COMPTAB").withIndex(27).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(numDp, ColumnMetadata.named("NUM_DP").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(objEnAttente, ColumnMetadata.named("OBJ_EN_ATTENTE").withIndex(34).ofType(Types.VARCHAR).withSize(500));
        addMetadata(paiOrdre, ColumnMetadata.named("PAI_ORDRE").withIndex(31).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdDesactivation, ColumnMetadata.named("PERS_ID_DESACTIVATION").withIndex(40).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persIdEnAttente, ColumnMetadata.named("PERS_ID_EN_ATTENTE").withIndex(35).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(13).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persIdValidOuRefusOrdo, ColumnMetadata.named("PERS_ID_VALID_OU_REFUS_ORDO").withIndex(22).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persIdVisaOuRejetComptab, ColumnMetadata.named("PERS_ID_VISA_OU_REJET_COMPTAB").withIndex(25).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ribOrdreComptab, ColumnMetadata.named("RIB_ORDRE_COMPTAB").withIndex(29).ofType(Types.DECIMAL).withSize(38));
        addMetadata(ribOrdreOrdo, ColumnMetadata.named("RIB_ORDRE_ORDO").withIndex(28).ofType(Types.DECIMAL).withSize(38));
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(16).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


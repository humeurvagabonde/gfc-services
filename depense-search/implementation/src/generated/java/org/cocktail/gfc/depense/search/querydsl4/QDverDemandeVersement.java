package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDverDemandeVersement is a Querydsl query type for QDverDemandeVersement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDverDemandeVersement extends com.querydsl.sql.RelationalPathBase<QDverDemandeVersement> {

    private static final long serialVersionUID = -264934558;

    public static final QDverDemandeVersement dverDemandeVersement = new QDverDemandeVersement("DVER_DEMANDE_VERSEMENT");

    public final NumberPath<Long> comOrdre = createNumber("comOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> dateDver = createDateTime("dateDver", java.sql.Timestamp.class);

    public final StringPath datePaiement = createString("datePaiement");

    public final DateTimePath<java.sql.Timestamp> dateSaisie = createDateTime("dateSaisie", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dvDateValidComptab = createDateTime("dvDateValidComptab", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dvDateVisaComptab = createDateTime("dvDateVisaComptab", java.sql.Timestamp.class);

    public final NumberPath<Long> ecrOrdre = createNumber("ecrOrdre", Long.class);

    public final StringPath etat = createString("etat");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idDverDemandeVersement = createNumber("idDverDemandeVersement", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<Long> modOrdre = createNumber("modOrdre", Long.class);

    public final NumberPath<java.math.BigDecimal> montantHt = createNumber("montantHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantPaiement = createNumber("montantPaiement", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTtc = createNumber("montantTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTva = createNumber("montantTva", java.math.BigDecimal.class);

    public final NumberPath<Long> numDver = createNumber("numDver", Long.class);

    public final NumberPath<Long> paiOrdre = createNumber("paiOrdre", Long.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> persIdValidComptab = createNumber("persIdValidComptab", Long.class);

    public final NumberPath<Long> persIdVisaComptab = createNumber("persIdVisaComptab", Long.class);

    public final StringPath referencePaiement = createString("referencePaiement");

    public final NumberPath<Long> ribOrdre = createNumber("ribOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QDverDemandeVersement> demandeVersementPk = createPrimaryKey(idDverDemandeVersement);

    public QDverDemandeVersement(String variable) {
        super(QDverDemandeVersement.class, forVariable(variable), "GFC", "DVER_DEMANDE_VERSEMENT");
        addMetadata();
    }

    public QDverDemandeVersement(String variable, String schema, String table) {
        super(QDverDemandeVersement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDverDemandeVersement(Path<? extends QDverDemandeVersement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DVER_DEMANDE_VERSEMENT");
        addMetadata();
    }

    public QDverDemandeVersement(PathMetadata metadata) {
        super(QDverDemandeVersement.class, metadata, "GFC", "DVER_DEMANDE_VERSEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(comOrdre, ColumnMetadata.named("COM_ORDRE").withIndex(14).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(dateDver, ColumnMetadata.named("DATE_DVER").withIndex(18).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(datePaiement, ColumnMetadata.named("DATE_PAIEMENT").withIndex(25).ofType(Types.VARCHAR).withSize(30));
        addMetadata(dateSaisie, ColumnMetadata.named("DATE_SAISIE").withIndex(19).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dvDateValidComptab, ColumnMetadata.named("DV_DATE_VALID_COMPTAB").withIndex(21).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dvDateVisaComptab, ColumnMetadata.named("DV_DATE_VISA_COMPTAB").withIndex(23).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(ecrOrdre, ColumnMetadata.named("ECR_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(etat, ColumnMetadata.named("ETAT").withIndex(16).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(15).ofType(Types.DECIMAL).withSize(30));
        addMetadata(idDverDemandeVersement, ColumnMetadata.named("ID_DVER_DEMANDE_VERSEMENT").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(10).ofType(Types.VARCHAR).withSize(2000).notNull());
        addMetadata(modOrdre, ColumnMetadata.named("MOD_ORDRE").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(montantHt, ColumnMetadata.named("MONTANT_HT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantPaiement, ColumnMetadata.named("MONTANT_PAIEMENT").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTtc, ColumnMetadata.named("MONTANT_TTC").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTva, ColumnMetadata.named("MONTANT_TVA").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(numDver, ColumnMetadata.named("NUM_DVER").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(paiOrdre, ColumnMetadata.named("PAI_ORDRE").withIndex(13).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(17).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdValidComptab, ColumnMetadata.named("PERS_ID_VALID_COMPTAB").withIndex(22).ofType(Types.DECIMAL).withSize(38));
        addMetadata(persIdVisaComptab, ColumnMetadata.named("PERS_ID_VISA_COMPTAB").withIndex(24).ofType(Types.DECIMAL).withSize(38));
        addMetadata(referencePaiement, ColumnMetadata.named("REFERENCE_PAIEMENT").withIndex(20).ofType(Types.VARCHAR).withSize(50));
        addMetadata(ribOrdre, ColumnMetadata.named("RIB_ORDRE").withIndex(12).ofType(Types.DECIMAL).withSize(0));
    }

}


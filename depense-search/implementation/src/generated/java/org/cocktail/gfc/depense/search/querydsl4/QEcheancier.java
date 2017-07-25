package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEcheancier is a Querydsl query type for QEcheancier
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEcheancier extends com.querydsl.sql.RelationalPathBase<QEcheancier> {

    private static final long serialVersionUID = -1329932699;

    public static final QEcheancier echeancier = new QEcheancier("ECHEANCIER");

    public final NumberPath<Long> borId = createNumber("borId", Long.class);

    public final StringPath echeAutorisSignee = createString("echeAutorisSignee");

    public final DateTimePath<java.sql.Timestamp> echeDate1ereEcheance = createDateTime("echeDate1ereEcheance", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> echeDateCreation = createDateTime("echeDateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> echeDateModif = createDateTime("echeDateModif", java.sql.Timestamp.class);

    public final NumberPath<Long> echeEcheancierOrdre = createNumber("echeEcheancierOrdre", Long.class);

    public final StringPath echeEtatPrelevement = createString("echeEtatPrelevement");

    public final StringPath echeLibelle = createString("echeLibelle");

    public final NumberPath<java.math.BigDecimal> echeMontant = createNumber("echeMontant", java.math.BigDecimal.class);

    public final StringPath echeMontantEnLettres = createString("echeMontantEnLettres");

    public final NumberPath<Long> echeNombreEcheances = createNumber("echeNombreEcheances", Long.class);

    public final NumberPath<Long> echeNumeroIndex = createNumber("echeNumeroIndex", Long.class);

    public final StringPath echePriseEnCharge = createString("echePriseEnCharge");

    public final StringPath echeRefFactureExterne = createString("echeRefFactureExterne");

    public final StringPath echeSupprime = createString("echeSupprime");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdreClient = createNumber("fouOrdreClient", Long.class);

    public final NumberPath<Long> ftOrdre = createNumber("ftOrdre", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> orgOrdre = createNumber("orgOrdre", Long.class);

    public final NumberPath<Long> oriOrdre = createNumber("oriOrdre", Long.class);

    public final StringPath persDescription = createString("persDescription");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> prestOrdre = createNumber("prestOrdre", Long.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> titId = createNumber("titId", Long.class);

    public final NumberPath<Long> titOrdre = createNumber("titOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QEcheancier> echeancierPk = createPrimaryKey(echeEcheancierOrdre);

    public QEcheancier(String variable) {
        super(QEcheancier.class, forVariable(variable), "GFC", "ECHEANCIER");
        addMetadata();
    }

    public QEcheancier(String variable, String schema, String table) {
        super(QEcheancier.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEcheancier(Path<? extends QEcheancier> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ECHEANCIER");
        addMetadata();
    }

    public QEcheancier(PathMetadata metadata) {
        super(QEcheancier.class, metadata, "GFC", "ECHEANCIER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(borId, ColumnMetadata.named("BOR_ID").withIndex(27).ofType(Types.DECIMAL).withSize(38));
        addMetadata(echeAutorisSignee, ColumnMetadata.named("ECHE_AUTORIS_SIGNEE").withIndex(1).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(echeDate1ereEcheance, ColumnMetadata.named("ECHE_DATE_1ERE_ECHEANCE").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(echeDateCreation, ColumnMetadata.named("ECHE_DATE_CREATION").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(echeDateModif, ColumnMetadata.named("ECHE_DATE_MODIF").withIndex(6).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(echeEcheancierOrdre, ColumnMetadata.named("ECHE_ECHEANCIER_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(echeEtatPrelevement, ColumnMetadata.named("ECHE_ETAT_PRELEVEMENT").withIndex(8).ofType(Types.VARCHAR).withSize(1));
        addMetadata(echeLibelle, ColumnMetadata.named("ECHE_LIBELLE").withIndex(10).ofType(Types.VARCHAR).withSize(1000).notNull());
        addMetadata(echeMontant, ColumnMetadata.named("ECHE_MONTANT").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(echeMontantEnLettres, ColumnMetadata.named("ECHE_MONTANT_EN_LETTRES").withIndex(12).ofType(Types.VARCHAR).withSize(500));
        addMetadata(echeNombreEcheances, ColumnMetadata.named("ECHE_NOMBRE_ECHEANCES").withIndex(13).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(echeNumeroIndex, ColumnMetadata.named("ECHE_NUMERO_INDEX").withIndex(14).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(echePriseEnCharge, ColumnMetadata.named("ECHE_PRISE_EN_CHARGE").withIndex(17).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(echeRefFactureExterne, ColumnMetadata.named("ECHE_REF_FACTURE_EXTERNE").withIndex(18).ofType(Types.VARCHAR).withSize(200));
        addMetadata(echeSupprime, ColumnMetadata.named("ECHE_SUPPRIME").withIndex(19).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(28).ofType(Types.DECIMAL).withSize(4));
        addMetadata(fouOrdreClient, ColumnMetadata.named("FOU_ORDRE_CLIENT").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ftOrdre, ColumnMetadata.named("FT_ORDRE").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(25).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(orgOrdre, ColumnMetadata.named("ORG_ORDRE").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(oriOrdre, ColumnMetadata.named("ORI_ORDRE").withIndex(23).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persDescription, ColumnMetadata.named("PERS_DESCRIPTION").withIndex(26).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(24).ofType(Types.DECIMAL).withSize(0));
        addMetadata(prestOrdre, ColumnMetadata.named("PREST_ORDRE").withIndex(16).ofType(Types.DECIMAL).withSize(0));
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(21).ofType(Types.DECIMAL).withSize(0));
        addMetadata(titId, ColumnMetadata.named("TIT_ID").withIndex(20).ofType(Types.DECIMAL).withSize(0));
        addMetadata(titOrdre, ColumnMetadata.named("TIT_ORDRE").withIndex(22).ofType(Types.DECIMAL).withSize(0));
    }

}


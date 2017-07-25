package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVDverSuivi is a Querydsl query type for QVDverSuivi
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVDverSuivi extends com.querydsl.sql.RelationalPathBase<QVDverSuivi> {

    private static final long serialVersionUID = -1087343313;

    public static final QVDverSuivi vDverSuivi = new QVDverSuivi("V_DVER_SUIVI");

    public final DateTimePath<java.sql.Timestamp> dateSaisie = createDateTime("dateSaisie", java.sql.Timestamp.class);

    public final StringPath etat = createString("etat");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idDverDemandeVersement = createNumber("idDverDemandeVersement", Long.class);

    public final StringPath modCode = createString("modCode");

    public final StringPath modDom = createString("modDom");

    public final StringPath modLibelle = createString("modLibelle");

    public final NumberPath<java.math.BigDecimal> montantHt = createNumber("montantHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTtc = createNumber("montantTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTva = createNumber("montantTva", java.math.BigDecimal.class);

    public final NumberPath<Long> numDver = createNumber("numDver", Long.class);

    public final StringPath oriOrdre = createString("oriOrdre");

    public final NumberPath<Long> paiNumero = createNumber("paiNumero", Long.class);

    public final NumberPath<Long> paiOrdre = createNumber("paiOrdre", Long.class);

    public final NumberPath<Long> ribOrdre = createNumber("ribOrdre", Long.class);

    public final StringPath tviLibelle = createString("tviLibelle");

    public final DateTimePath<java.sql.Timestamp> virDateCreation = createDateTime("virDateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> virDateValeur = createDateTime("virDateValeur", java.sql.Timestamp.class);

    public QVDverSuivi(String variable) {
        super(QVDverSuivi.class, forVariable(variable), "GFC", "V_DVER_SUIVI");
        addMetadata();
    }

    public QVDverSuivi(String variable, String schema, String table) {
        super(QVDverSuivi.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVDverSuivi(Path<? extends QVDverSuivi> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_DVER_SUIVI");
        addMetadata();
    }

    public QVDverSuivi(PathMetadata metadata) {
        super(QVDverSuivi.class, metadata, "GFC", "V_DVER_SUIVI");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateSaisie, ColumnMetadata.named("DATE_SAISIE").withIndex(6).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(etat, ColumnMetadata.named("ETAT").withIndex(5).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(18).ofType(Types.DECIMAL).withSize(30));
        addMetadata(idDverDemandeVersement, ColumnMetadata.named("ID_DVER_DEMANDE_VERSEMENT").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(modCode, ColumnMetadata.named("MOD_CODE").withIndex(14).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(modDom, ColumnMetadata.named("MOD_DOM").withIndex(13).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(modLibelle, ColumnMetadata.named("MOD_LIBELLE").withIndex(15).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(montantHt, ColumnMetadata.named("MONTANT_HT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTtc, ColumnMetadata.named("MONTANT_TTC").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTva, ColumnMetadata.named("MONTANT_TVA").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(numDver, ColumnMetadata.named("NUM_DVER").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(oriOrdre, ColumnMetadata.named("ORI_ORDRE").withIndex(16).ofType(Types.VARCHAR).withSize(0));
        addMetadata(paiNumero, ColumnMetadata.named("PAI_NUMERO").withIndex(10).ofType(Types.DECIMAL).withSize(0));
        addMetadata(paiOrdre, ColumnMetadata.named("PAI_ORDRE").withIndex(17).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ribOrdre, ColumnMetadata.named("RIB_ORDRE").withIndex(19).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tviLibelle, ColumnMetadata.named("TVI_LIBELLE").withIndex(11).ofType(Types.VARCHAR).withSize(20));
        addMetadata(virDateCreation, ColumnMetadata.named("VIR_DATE_CREATION").withIndex(20).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(virDateValeur, ColumnMetadata.named("VIR_DATE_VALEUR").withIndex(12).ofType(Types.TIMESTAMP).withSize(7));
    }

}


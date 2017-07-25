package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVMandatSuivi is a Querydsl query type for QVMandatSuivi
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVMandatSuivi extends com.querydsl.sql.RelationalPathBase<QVMandatSuivi> {

    private static final long serialVersionUID = 1353667505;

    public static final QVMandatSuivi vMandatSuivi = new QVMandatSuivi("V_MANDAT_SUIVI");

    public final DateTimePath<java.sql.Timestamp> borDateCreation = createDateTime("borDateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> borDateVisa = createDateTime("borDateVisa", java.sql.Timestamp.class);

    public final NumberPath<Long> borId = createNumber("borId", Long.class);

    public final NumberPath<Long> borNum = createNumber("borNum", Long.class);

    public final NumberPath<Long> brjOrdre = createNumber("brjOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath gesCode = createString("gesCode");

    public final DateTimePath<java.sql.Timestamp> manAttenteDate = createDateTime("manAttenteDate", java.sql.Timestamp.class);

    public final StringPath manAttenteObjet = createString("manAttenteObjet");

    public final NumberPath<Long> manAttentePaiement = createNumber("manAttentePaiement", Long.class);

    public final StringPath manEtat = createString("manEtat");

    public final NumberPath<java.math.BigDecimal> manHt = createNumber("manHt", java.math.BigDecimal.class);

    public final NumberPath<Long> manId = createNumber("manId", Long.class);

    public final StringPath manMotifRejet = createString("manMotifRejet");

    public final NumberPath<Long> manNumero = createNumber("manNumero", Long.class);

    public final NumberPath<Long> manNumeroRejet = createNumber("manNumeroRejet", Long.class);

    public final NumberPath<java.math.BigDecimal> manTtc = createNumber("manTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> manTva = createNumber("manTva", java.math.BigDecimal.class);

    public final StringPath modCode = createString("modCode");

    public final StringPath modDom = createString("modDom");

    public final StringPath modLibelle = createString("modLibelle");

    public final NumberPath<Long> orgOrdre = createNumber("orgOrdre", Long.class);

    public final NumberPath<Long> oriOrdre = createNumber("oriOrdre", Long.class);

    public final NumberPath<Long> paiNumero = createNumber("paiNumero", Long.class);

    public final NumberPath<Long> paiOrdre = createNumber("paiOrdre", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> prestId = createNumber("prestId", Long.class);

    public final NumberPath<Long> ribOrdreComptable = createNumber("ribOrdreComptable", Long.class);

    public final NumberPath<Long> ribOrdreOrdonnateur = createNumber("ribOrdreOrdonnateur", Long.class);

    public final StringPath tviLibelle = createString("tviLibelle");

    public final DateTimePath<java.sql.Timestamp> virDateCreation = createDateTime("virDateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> virDateValeur = createDateTime("virDateValeur", java.sql.Timestamp.class);

    public QVMandatSuivi(String variable) {
        super(QVMandatSuivi.class, forVariable(variable), "GFC", "V_MANDAT_SUIVI");
        addMetadata();
    }

    public QVMandatSuivi(String variable, String schema, String table) {
        super(QVMandatSuivi.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVMandatSuivi(Path<? extends QVMandatSuivi> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_MANDAT_SUIVI");
        addMetadata();
    }

    public QVMandatSuivi(PathMetadata metadata) {
        super(QVMandatSuivi.class, metadata, "GFC", "V_MANDAT_SUIVI");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(borDateCreation, ColumnMetadata.named("BOR_DATE_CREATION").withIndex(33).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(borDateVisa, ColumnMetadata.named("BOR_DATE_VISA").withIndex(9).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(borId, ColumnMetadata.named("BOR_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(borNum, ColumnMetadata.named("BOR_NUM").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(brjOrdre, ColumnMetadata.named("BRJ_ORDRE").withIndex(10).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(5).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(manAttenteDate, ColumnMetadata.named("MAN_ATTENTE_DATE").withIndex(30).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(manAttenteObjet, ColumnMetadata.named("MAN_ATTENTE_OBJET").withIndex(31).ofType(Types.VARCHAR).withSize(500));
        addMetadata(manAttentePaiement, ColumnMetadata.named("MAN_ATTENTE_PAIEMENT").withIndex(29).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(manEtat, ColumnMetadata.named("MAN_ETAT").withIndex(8).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(manHt, ColumnMetadata.named("MAN_HT").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(manId, ColumnMetadata.named("MAN_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(manMotifRejet, ColumnMetadata.named("MAN_MOTIF_REJET").withIndex(12).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(manNumero, ColumnMetadata.named("MAN_NUMERO").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(manNumeroRejet, ColumnMetadata.named("MAN_NUMERO_REJET").withIndex(11).ofType(Types.DECIMAL).withSize(0));
        addMetadata(manTtc, ColumnMetadata.named("MAN_TTC").withIndex(15).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(manTva, ColumnMetadata.named("MAN_TVA").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(modCode, ColumnMetadata.named("MOD_CODE").withIndex(20).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(modDom, ColumnMetadata.named("MOD_DOM").withIndex(19).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(modLibelle, ColumnMetadata.named("MOD_LIBELLE").withIndex(21).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(orgOrdre, ColumnMetadata.named("ORG_ORDRE").withIndex(26).ofType(Types.DECIMAL).withSize(38));
        addMetadata(oriOrdre, ColumnMetadata.named("ORI_ORDRE").withIndex(22).ofType(Types.DECIMAL).withSize(0));
        addMetadata(paiNumero, ColumnMetadata.named("PAI_NUMERO").withIndex(16).ofType(Types.DECIMAL).withSize(0));
        addMetadata(paiOrdre, ColumnMetadata.named("PAI_ORDRE").withIndex(25).ofType(Types.DECIMAL).withSize(0));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(23).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(prestId, ColumnMetadata.named("PREST_ID").withIndex(24).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ribOrdreComptable, ColumnMetadata.named("RIB_ORDRE_COMPTABLE").withIndex(28).ofType(Types.DECIMAL).withSize(38));
        addMetadata(ribOrdreOrdonnateur, ColumnMetadata.named("RIB_ORDRE_ORDONNATEUR").withIndex(27).ofType(Types.DECIMAL).withSize(38));
        addMetadata(tviLibelle, ColumnMetadata.named("TVI_LIBELLE").withIndex(17).ofType(Types.VARCHAR).withSize(20));
        addMetadata(virDateCreation, ColumnMetadata.named("VIR_DATE_CREATION").withIndex(32).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(virDateValeur, ColumnMetadata.named("VIR_DATE_VALEUR").withIndex(18).ofType(Types.TIMESTAMP).withSize(7));
    }

}


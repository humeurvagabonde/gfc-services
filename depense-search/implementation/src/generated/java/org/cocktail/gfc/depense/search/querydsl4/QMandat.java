package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMandat is a Querydsl query type for QMandat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMandat extends com.querydsl.sql.RelationalPathBase<QMandat> {

    private static final long serialVersionUID = -1382169529;

    public static final QMandat mandat = new QMandat("MANDAT");

    public final NumberPath<Long> borId = createNumber("borId", Long.class);

    public final NumberPath<Long> brjOrdre = createNumber("brjOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath gesCode = createString("gesCode");

    public final DateTimePath<java.sql.Timestamp> manAttenteDate = createDateTime("manAttenteDate", java.sql.Timestamp.class);

    public final StringPath manAttenteObjet = createString("manAttenteObjet");

    public final NumberPath<Long> manAttentePaiement = createNumber("manAttentePaiement", Long.class);

    public final DateTimePath<java.sql.Timestamp> manDateRemise = createDateTime("manDateRemise", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> manDateVisaPrinc = createDateTime("manDateVisaPrinc", java.sql.Timestamp.class);

    public final StringPath manEtat = createString("manEtat");

    public final StringPath manEtatRemise = createString("manEtatRemise");

    public final NumberPath<java.math.BigDecimal> manHt = createNumber("manHt", java.math.BigDecimal.class);

    public final NumberPath<Long> manId = createNumber("manId", Long.class);

    public final StringPath manMotifRejet = createString("manMotifRejet");

    public final NumberPath<Long> manNbPiece = createNumber("manNbPiece", Long.class);

    public final NumberPath<Long> manNumero = createNumber("manNumero", Long.class);

    public final NumberPath<Long> manNumeroRejet = createNumber("manNumeroRejet", Long.class);

    public final NumberPath<Long> manOrdre = createNumber("manOrdre", Long.class);

    public final NumberPath<Long> manOrgineKey = createNumber("manOrgineKey", Long.class);

    public final StringPath manOrigineLib = createString("manOrigineLib");

    public final NumberPath<java.math.BigDecimal> manTtc = createNumber("manTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> manTva = createNumber("manTva", java.math.BigDecimal.class);

    public final NumberPath<Long> modOrdre = createNumber("modOrdre", Long.class);

    public final NumberPath<Long> orgOrdre = createNumber("orgOrdre", Long.class);

    public final NumberPath<Long> oriOrdre = createNumber("oriOrdre", Long.class);

    public final NumberPath<Long> paiOrdre = createNumber("paiOrdre", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> prestId = createNumber("prestId", Long.class);

    public final NumberPath<Long> ribOrdreComptable = createNumber("ribOrdreComptable", Long.class);

    public final NumberPath<Long> ribOrdreOrdonnateur = createNumber("ribOrdreOrdonnateur", Long.class);

    public final NumberPath<Long> torOrdre = createNumber("torOrdre", Long.class);

    public final NumberPath<Long> utlOrdreAttente = createNumber("utlOrdreAttente", Long.class);

    public final com.querydsl.sql.PrimaryKey<QMandat> mandatPk = createPrimaryKey(manId);

    public QMandat(String variable) {
        super(QMandat.class, forVariable(variable), "GFC", "MANDAT");
        addMetadata();
    }

    public QMandat(String variable, String schema, String table) {
        super(QMandat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMandat(Path<? extends QMandat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "MANDAT");
        addMetadata();
    }

    public QMandat(PathMetadata metadata) {
        super(QMandat.class, metadata, "GFC", "MANDAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(borId, ColumnMetadata.named("BOR_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(brjOrdre, ColumnMetadata.named("BRJ_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(6).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(manAttenteDate, ColumnMetadata.named("MAN_ATTENTE_DATE").withIndex(31).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(manAttenteObjet, ColumnMetadata.named("MAN_ATTENTE_OBJET").withIndex(32).ofType(Types.VARCHAR).withSize(500));
        addMetadata(manAttentePaiement, ColumnMetadata.named("MAN_ATTENTE_PAIEMENT").withIndex(30).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(manDateRemise, ColumnMetadata.named("MAN_DATE_REMISE").withIndex(7).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(manDateVisaPrinc, ColumnMetadata.named("MAN_DATE_VISA_PRINC").withIndex(8).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(manEtat, ColumnMetadata.named("MAN_ETAT").withIndex(9).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(manEtatRemise, ColumnMetadata.named("MAN_ETAT_REMISE").withIndex(10).ofType(Types.VARCHAR).withSize(10));
        addMetadata(manHt, ColumnMetadata.named("MAN_HT").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(manId, ColumnMetadata.named("MAN_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(manMotifRejet, ColumnMetadata.named("MAN_MOTIF_REJET").withIndex(12).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(manNbPiece, ColumnMetadata.named("MAN_NB_PIECE").withIndex(13).ofType(Types.DECIMAL).withSize(38));
        addMetadata(manNumero, ColumnMetadata.named("MAN_NUMERO").withIndex(14).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(manNumeroRejet, ColumnMetadata.named("MAN_NUMERO_REJET").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(manOrdre, ColumnMetadata.named("MAN_ORDRE").withIndex(16).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(manOrgineKey, ColumnMetadata.named("MAN_ORGINE_KEY").withIndex(17).ofType(Types.DECIMAL).withSize(0));
        addMetadata(manOrigineLib, ColumnMetadata.named("MAN_ORIGINE_LIB").withIndex(18).ofType(Types.VARCHAR).withSize(200));
        addMetadata(manTtc, ColumnMetadata.named("MAN_TTC").withIndex(19).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(manTva, ColumnMetadata.named("MAN_TVA").withIndex(20).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(modOrdre, ColumnMetadata.named("MOD_ORDRE").withIndex(21).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(orgOrdre, ColumnMetadata.named("ORG_ORDRE").withIndex(27).ofType(Types.DECIMAL).withSize(38));
        addMetadata(oriOrdre, ColumnMetadata.named("ORI_ORDRE").withIndex(22).ofType(Types.DECIMAL).withSize(0));
        addMetadata(paiOrdre, ColumnMetadata.named("PAI_ORDRE").withIndex(26).ofType(Types.DECIMAL).withSize(0));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(23).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(prestId, ColumnMetadata.named("PREST_ID").withIndex(24).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ribOrdreComptable, ColumnMetadata.named("RIB_ORDRE_COMPTABLE").withIndex(29).ofType(Types.DECIMAL).withSize(38));
        addMetadata(ribOrdreOrdonnateur, ColumnMetadata.named("RIB_ORDRE_ORDONNATEUR").withIndex(28).ofType(Types.DECIMAL).withSize(38));
        addMetadata(torOrdre, ColumnMetadata.named("TOR_ORDRE").withIndex(25).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdreAttente, ColumnMetadata.named("UTL_ORDRE_ATTENTE").withIndex(33).ofType(Types.DECIMAL).withSize(0));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPrestation is a Querydsl query type for QPrestation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPrestation extends com.querydsl.sql.RelationalPathBase<QPrestation> {

    private static final long serialVersionUID = -1399486341;

    public static final QPrestation prestation = new QPrestation("PRESTATION");

    public final NumberPath<Long> canId = createNumber("canId", Long.class);

    public final NumberPath<Long> catId = createNumber("catId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> fouOrdrePrest = createNumber("fouOrdrePrest", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> lolfId = createNumber("lolfId", Long.class);

    public final NumberPath<Long> morOrdre = createNumber("morOrdre", Long.class);

    public final NumberPath<Long> noIndividu = createNumber("noIndividu", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final StringPath prestApplyTva = createString("prestApplyTva");

    public final StringPath prestCommentaireClient = createString("prestCommentaireClient");

    public final StringPath prestCommentairePrest = createString("prestCommentairePrest");

    public final DateTimePath<java.sql.Timestamp> prestDate = createDateTime("prestDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> prestDateCloture = createDateTime("prestDateCloture", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> prestDateFacturation = createDateTime("prestDateFacturation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> prestDateValideClient = createDateTime("prestDateValideClient", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> prestDateValidePrest = createDateTime("prestDateValidePrest", java.sql.Timestamp.class);

    public final NumberPath<Long> prestId = createNumber("prestId", Long.class);

    public final StringPath prestLibelle = createString("prestLibelle");

    public final NumberPath<Long> prestNumero = createNumber("prestNumero", Long.class);

    public final NumberPath<java.math.BigDecimal> prestRemiseGlobale = createNumber("prestRemiseGlobale", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prestTotalHt = createNumber("prestTotalHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prestTotalTtc = createNumber("prestTotalTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prestTotalTva = createNumber("prestTotalTva", java.math.BigDecimal.class);

    public final NumberPath<Long> tapId = createNumber("tapId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final NumberPath<Long> typuId = createNumber("typuId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QPrestation> prestationPk = createPrimaryKey(prestId);

    public QPrestation(String variable) {
        super(QPrestation.class, forVariable(variable), "GFC", "PRESTATION");
        addMetadata();
    }

    public QPrestation(String variable, String schema, String table) {
        super(QPrestation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPrestation(Path<? extends QPrestation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PRESTATION");
        addMetadata();
    }

    public QPrestation(PathMetadata metadata) {
        super(QPrestation.class, metadata, "GFC", "PRESTATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(canId, ColumnMetadata.named("CAN_ID").withIndex(24).ofType(Types.DECIMAL).withSize(0));
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(fouOrdrePrest, ColumnMetadata.named("FOU_ORDRE_PREST").withIndex(31).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(20).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(33).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(32).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(25).ofType(Types.DECIMAL).withSize(0));
        addMetadata(lolfId, ColumnMetadata.named("LOLF_ID").withIndex(22).ofType(Types.DECIMAL).withSize(0));
        addMetadata(morOrdre, ColumnMetadata.named("MOR_ORDRE").withIndex(19).ofType(Types.DECIMAL).withSize(0));
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(23).ofType(Types.VARCHAR).withSize(20));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prestApplyTva, ColumnMetadata.named("PREST_APPLY_TVA").withIndex(18).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(prestCommentaireClient, ColumnMetadata.named("PREST_COMMENTAIRE_CLIENT").withIndex(11).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(prestCommentairePrest, ColumnMetadata.named("PREST_COMMENTAIRE_PREST").withIndex(12).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(prestDate, ColumnMetadata.named("PREST_DATE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(prestDateCloture, ColumnMetadata.named("PREST_DATE_CLOTURE").withIndex(15).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(prestDateFacturation, ColumnMetadata.named("PREST_DATE_FACTURATION").withIndex(16).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(prestDateValideClient, ColumnMetadata.named("PREST_DATE_VALIDE_CLIENT").withIndex(13).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(prestDateValidePrest, ColumnMetadata.named("PREST_DATE_VALIDE_PREST").withIndex(14).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(prestId, ColumnMetadata.named("PREST_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prestLibelle, ColumnMetadata.named("PREST_LIBELLE").withIndex(9).ofType(Types.VARCHAR).withSize(300).notNull());
        addMetadata(prestNumero, ColumnMetadata.named("PREST_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prestRemiseGlobale, ColumnMetadata.named("PREST_REMISE_GLOBALE").withIndex(17).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(prestTotalHt, ColumnMetadata.named("PREST_TOTAL_HT").withIndex(28).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(prestTotalTtc, ColumnMetadata.named("PREST_TOTAL_TTC").withIndex(30).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(prestTotalTva, ColumnMetadata.named("PREST_TOTAL_TVA").withIndex(29).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(tapId, ColumnMetadata.named("TAP_ID").withIndex(21).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(27).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(typuId, ColumnMetadata.named("TYPU_ID").withIndex(26).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(0));
    }

}


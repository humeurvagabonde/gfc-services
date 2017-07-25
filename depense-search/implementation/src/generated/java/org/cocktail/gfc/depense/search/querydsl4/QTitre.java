package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTitre is a Querydsl query type for QTitre
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTitre extends com.querydsl.sql.RelationalPathBase<QTitre> {

    private static final long serialVersionUID = -1561897592;

    public static final QTitre titre = new QTitre("TITRE");

    public final NumberPath<Long> borId = createNumber("borId", Long.class);

    public final NumberPath<Long> borOrdre = createNumber("borOrdre", Long.class);

    public final NumberPath<Long> brjOrdre = createNumber("brjOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Integer> isAvance = createNumber("isAvance", Integer.class);

    public final NumberPath<Long> modOrdre = createNumber("modOrdre", Long.class);

    public final NumberPath<Long> morOrdre = createNumber("morOrdre", Long.class);

    public final NumberPath<Long> orgOrdre = createNumber("orgOrdre", Long.class);

    public final NumberPath<Long> oriOrdre = createNumber("oriOrdre", Long.class);

    public final NumberPath<Long> paiOrdre = createNumber("paiOrdre", Long.class);

    public final NumberPath<Long> prestId = createNumber("prestId", Long.class);

    public final NumberPath<Long> ribOrdreComptable = createNumber("ribOrdreComptable", Long.class);

    public final NumberPath<Long> ribOrdreOrdonnateur = createNumber("ribOrdreOrdonnateur", Long.class);

    public final DateTimePath<java.sql.Timestamp> titDateRemise = createDateTime("titDateRemise", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> titDateVisaPrinc = createDateTime("titDateVisaPrinc", java.sql.Timestamp.class);

    public final StringPath titEtat = createString("titEtat");

    public final StringPath titEtatRemise = createString("titEtatRemise");

    public final NumberPath<java.math.BigDecimal> titHt = createNumber("titHt", java.math.BigDecimal.class);

    public final NumberPath<Long> titId = createNumber("titId", Long.class);

    public final StringPath titLibelle = createString("titLibelle");

    public final StringPath titMotifRejet = createString("titMotifRejet");

    public final NumberPath<Long> titNbPiece = createNumber("titNbPiece", Long.class);

    public final NumberPath<Long> titNumero = createNumber("titNumero", Long.class);

    public final NumberPath<Long> titNumeroRejet = createNumber("titNumeroRejet", Long.class);

    public final NumberPath<Long> titOrdre = createNumber("titOrdre", Long.class);

    public final NumberPath<Long> titOrgineKey = createNumber("titOrgineKey", Long.class);

    public final StringPath titOrigineLib = createString("titOrigineLib");

    public final NumberPath<java.math.BigDecimal> titTtc = createNumber("titTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> titTva = createNumber("titTva", java.math.BigDecimal.class);

    public final NumberPath<Long> torOrdre = createNumber("torOrdre", Long.class);

    public final NumberPath<Long> tyetCycleVie = createNumber("tyetCycleVie", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTitre> titrePk = createPrimaryKey(titId);

    public QTitre(String variable) {
        super(QTitre.class, forVariable(variable), "GFC", "TITRE");
        addMetadata();
    }

    public QTitre(String variable, String schema, String table) {
        super(QTitre.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTitre(Path<? extends QTitre> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TITRE");
        addMetadata();
    }

    public QTitre(PathMetadata metadata) {
        super(QTitre.class, metadata, "GFC", "TITRE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(borId, ColumnMetadata.named("BOR_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(borOrdre, ColumnMetadata.named("BOR_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(brjOrdre, ColumnMetadata.named("BRJ_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(27).ofType(Types.DECIMAL).withSize(38));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(6).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(isAvance, ColumnMetadata.named("IS_AVANCE").withIndex(34).ofType(Types.DECIMAL).withSize(1));
        addMetadata(modOrdre, ColumnMetadata.named("MOD_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(morOrdre, ColumnMetadata.named("MOR_ORDRE").withIndex(28).ofType(Types.DECIMAL).withSize(0));
        addMetadata(orgOrdre, ColumnMetadata.named("ORG_ORDRE").withIndex(26).ofType(Types.DECIMAL).withSize(38));
        addMetadata(oriOrdre, ColumnMetadata.named("ORI_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(paiOrdre, ColumnMetadata.named("PAI_ORDRE").withIndex(29).ofType(Types.DECIMAL).withSize(0));
        addMetadata(prestId, ColumnMetadata.named("PREST_ID").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ribOrdreComptable, ColumnMetadata.named("RIB_ORDRE_COMPTABLE").withIndex(31).ofType(Types.DECIMAL).withSize(38));
        addMetadata(ribOrdreOrdonnateur, ColumnMetadata.named("RIB_ORDRE_ORDONNATEUR").withIndex(30).ofType(Types.DECIMAL).withSize(38));
        addMetadata(titDateRemise, ColumnMetadata.named("TIT_DATE_REMISE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(titDateVisaPrinc, ColumnMetadata.named("TIT_DATE_VISA_PRINC").withIndex(11).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(titEtat, ColumnMetadata.named("TIT_ETAT").withIndex(12).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(titEtatRemise, ColumnMetadata.named("TIT_ETAT_REMISE").withIndex(13).ofType(Types.VARCHAR).withSize(10));
        addMetadata(titHt, ColumnMetadata.named("TIT_HT").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(titId, ColumnMetadata.named("TIT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(titLibelle, ColumnMetadata.named("TIT_LIBELLE").withIndex(32).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(titMotifRejet, ColumnMetadata.named("TIT_MOTIF_REJET").withIndex(15).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(titNbPiece, ColumnMetadata.named("TIT_NB_PIECE").withIndex(16).ofType(Types.DECIMAL).withSize(38));
        addMetadata(titNumero, ColumnMetadata.named("TIT_NUMERO").withIndex(17).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(titNumeroRejet, ColumnMetadata.named("TIT_NUMERO_REJET").withIndex(18).ofType(Types.DECIMAL).withSize(0));
        addMetadata(titOrdre, ColumnMetadata.named("TIT_ORDRE").withIndex(19).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(titOrgineKey, ColumnMetadata.named("TIT_ORGINE_KEY").withIndex(20).ofType(Types.DECIMAL).withSize(0));
        addMetadata(titOrigineLib, ColumnMetadata.named("TIT_ORIGINE_LIB").withIndex(21).ofType(Types.VARCHAR).withSize(200));
        addMetadata(titTtc, ColumnMetadata.named("TIT_TTC").withIndex(22).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(titTva, ColumnMetadata.named("TIT_TVA").withIndex(23).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(torOrdre, ColumnMetadata.named("TOR_ORDRE").withIndex(24).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetCycleVie, ColumnMetadata.named("TYET_CYCLE_VIE").withIndex(33).ofType(Types.DECIMAL).withSize(0));
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(25).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


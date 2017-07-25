package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVSitDepEjRepart is a Querydsl query type for QVSitDepEjRepart
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVSitDepEjRepart extends com.querydsl.sql.RelationalPathBase<QVSitDepEjRepart> {

    private static final long serialVersionUID = 395273256;

    public static final QVSitDepEjRepart vSitDepEjRepart = new QVSitDepEjRepart("V_SIT_DEP_EJ_REPART");

    public final StringPath codeAchat = createString("codeAchat");

    public final StringPath codeAnalytique = createString("codeAnalytique");

    public final StringPath codeDestination = createString("codeDestination");

    public final StringPath cr = createString("cr");

    public final StringPath dateCreation = createString("dateCreation");

    public final StringPath dateValidation = createString("dateValidation");

    public final StringPath eb = createString("eb");

    public final StringPath etab = createString("etab");

    public final StringPath etat = createString("etat");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath fouCode = createString("fouCode");

    public final StringPath fouCodeLib = createString("fouCodeLib");

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idDepEj = createNumber("idDepEj", Long.class);

    public final StringPath libelleArticle = createString("libelleArticle");

    public final StringPath libelleDestination = createString("libelleDestination");

    public final StringPath libelleEj = createString("libelleEj");

    public final StringPath libelleLot = createString("libelleLot");

    public final StringPath libelleMarche = createString("libelleMarche");

    public final StringPath libelleOperation = createString("libelleOperation");

    public final NumberPath<Long> montantBudEj = createNumber("montantBudEj", Long.class);

    public final NumberPath<java.math.BigDecimal> montantBudRepartition = createNumber("montantBudRepartition", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantHtArticle = createNumber("montantHtArticle", java.math.BigDecimal.class);

    public final NumberPath<Long> montantHtEj = createNumber("montantHtEj", Long.class);

    public final NumberPath<java.math.BigDecimal> montantHtRepartition = createNumber("montantHtRepartition", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTtcArticle = createNumber("montantTtcArticle", java.math.BigDecimal.class);

    public final NumberPath<Long> montantTtcEj = createNumber("montantTtcEj", Long.class);

    public final NumberPath<java.math.BigDecimal> montantTtcRepartition = createNumber("montantTtcRepartition", java.math.BigDecimal.class);

    public final NumberPath<Long> montantTvaArticle = createNumber("montantTvaArticle", Long.class);

    public final NumberPath<Long> montantTvaEj = createNumber("montantTvaEj", Long.class);

    public final StringPath natureDepense = createString("natureDepense");

    public final NumberPath<Long> nbComplements = createNumber("nbComplements", Long.class);

    public final NumberPath<Long> nbDp = createNumber("nbDp", Long.class);

    public final NumberPath<Long> nbFactures = createNumber("nbFactures", Long.class);

    public final NumberPath<Long> nbSfCertifies = createNumber("nbSfCertifies", Long.class);

    public final NumberPath<Long> nbSfConstates = createNumber("nbSfConstates", Long.class);

    public final StringPath nomCreateur = createString("nomCreateur");

    public final StringPath nomValidateur = createString("nomValidateur");

    public final NumberPath<Long> numAttribution = createNumber("numAttribution", Long.class);

    public final StringPath numEj = createString("numEj");

    public final StringPath numLot = createString("numLot");

    public final StringPath numMarche = createString("numMarche");

    public final StringPath numOperation = createString("numOperation");

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> persIdCreateur = createNumber("persIdCreateur", Long.class);

    public final NumberPath<java.math.BigDecimal> prixHtArt = createNumber("prixHtArt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prorataTva = createNumber("prorataTva", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> quantiteArticle = createNumber("quantiteArticle", java.math.BigDecimal.class);

    public final StringPath reference = createString("reference");

    public final NumberPath<Long> resteTtcEj = createNumber("resteTtcEj", Long.class);

    public final StringPath souscr = createString("souscr");

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final StringPath type = createString("type");

    public final StringPath typeAchat = createString("typeAchat");

    public final StringPath ub = createString("ub");

    public QVSitDepEjRepart(String variable) {
        super(QVSitDepEjRepart.class, forVariable(variable), "GFC", "V_SIT_DEP_EJ_REPART");
        addMetadata();
    }

    public QVSitDepEjRepart(String variable, String schema, String table) {
        super(QVSitDepEjRepart.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVSitDepEjRepart(Path<? extends QVSitDepEjRepart> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_SIT_DEP_EJ_REPART");
        addMetadata();
    }

    public QVSitDepEjRepart(PathMetadata metadata) {
        super(QVSitDepEjRepart.class, metadata, "GFC", "V_SIT_DEP_EJ_REPART");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(codeAchat, ColumnMetadata.named("CODE_ACHAT").withIndex(34).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(codeAnalytique, ColumnMetadata.named("CODE_ANALYTIQUE").withIndex(33).ofType(Types.VARCHAR).withSize(50));
        addMetadata(codeDestination, ColumnMetadata.named("CODE_DESTINATION").withIndex(50).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(cr, ColumnMetadata.named("CR").withIndex(45).ofType(Types.VARCHAR).withSize(50));
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(7).ofType(Types.VARCHAR).withSize(10));
        addMetadata(dateValidation, ColumnMetadata.named("DATE_VALIDATION").withIndex(10).ofType(Types.VARCHAR).withSize(10));
        addMetadata(eb, ColumnMetadata.named("EB").withIndex(42).ofType(Types.VARCHAR).withSize(123));
        addMetadata(etab, ColumnMetadata.named("ETAB").withIndex(43).ofType(Types.VARCHAR).withSize(10));
        addMetadata(etat, ColumnMetadata.named("ETAT").withIndex(13).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouCode, ColumnMetadata.named("FOU_CODE").withIndex(20).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(fouCodeLib, ColumnMetadata.named("FOU_CODE_LIB").withIndex(21).ofType(Types.VARCHAR).withSize(254));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(19).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(41).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepEj, ColumnMetadata.named("ID_DEP_EJ").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelleArticle, ColumnMetadata.named("LIBELLE_ARTICLE").withIndex(35).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(libelleDestination, ColumnMetadata.named("LIBELLE_DESTINATION").withIndex(51).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(libelleEj, ColumnMetadata.named("LIBELLE_EJ").withIndex(4).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(libelleLot, ColumnMetadata.named("LIBELLE_LOT").withIndex(25).ofType(Types.VARCHAR).withSize(512));
        addMetadata(libelleMarche, ColumnMetadata.named("LIBELLE_MARCHE").withIndex(23).ofType(Types.VARCHAR).withSize(512));
        addMetadata(libelleOperation, ColumnMetadata.named("LIBELLE_OPERATION").withIndex(48).ofType(Types.VARCHAR).withSize(500));
        addMetadata(montantBudEj, ColumnMetadata.named("MONTANT_BUD_EJ").withIndex(31).ofType(Types.DECIMAL).withSize(0));
        addMetadata(montantBudRepartition, ColumnMetadata.named("MONTANT_BUD_REPARTITION").withIndex(56).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantHtArticle, ColumnMetadata.named("MONTANT_HT_ARTICLE").withIndex(38).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantHtEj, ColumnMetadata.named("MONTANT_HT_EJ").withIndex(28).ofType(Types.DECIMAL).withSize(0));
        addMetadata(montantHtRepartition, ColumnMetadata.named("MONTANT_HT_REPARTITION").withIndex(53).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTtcArticle, ColumnMetadata.named("MONTANT_TTC_ARTICLE").withIndex(39).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTtcEj, ColumnMetadata.named("MONTANT_TTC_EJ").withIndex(30).ofType(Types.DECIMAL).withSize(0));
        addMetadata(montantTtcRepartition, ColumnMetadata.named("MONTANT_TTC_REPARTITION").withIndex(54).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTvaArticle, ColumnMetadata.named("MONTANT_TVA_ARTICLE").withIndex(40).ofType(Types.DECIMAL).withSize(0));
        addMetadata(montantTvaEj, ColumnMetadata.named("MONTANT_TVA_EJ").withIndex(29).ofType(Types.DECIMAL).withSize(0));
        addMetadata(natureDepense, ColumnMetadata.named("NATURE_DEPENSE").withIndex(49).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(nbComplements, ColumnMetadata.named("NB_COMPLEMENTS").withIndex(14).ofType(Types.DECIMAL).withSize(0));
        addMetadata(nbDp, ColumnMetadata.named("NB_DP").withIndex(18).ofType(Types.DECIMAL).withSize(0));
        addMetadata(nbFactures, ColumnMetadata.named("NB_FACTURES").withIndex(17).ofType(Types.DECIMAL).withSize(0));
        addMetadata(nbSfCertifies, ColumnMetadata.named("NB_SF_CERTIFIES").withIndex(16).ofType(Types.DECIMAL).withSize(0));
        addMetadata(nbSfConstates, ColumnMetadata.named("NB_SF_CONSTATES").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(nomCreateur, ColumnMetadata.named("NOM_CREATEUR").withIndex(9).ofType(Types.VARCHAR).withSize(241));
        addMetadata(nomValidateur, ColumnMetadata.named("NOM_VALIDATEUR").withIndex(11).ofType(Types.VARCHAR).withSize(241));
        addMetadata(numAttribution, ColumnMetadata.named("NUM_ATTRIBUTION").withIndex(27).ofType(Types.DECIMAL).withSize(38));
        addMetadata(numEj, ColumnMetadata.named("NUM_EJ").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(numLot, ColumnMetadata.named("NUM_LOT").withIndex(26).ofType(Types.VARCHAR).withSize(5));
        addMetadata(numMarche, ColumnMetadata.named("NUM_MARCHE").withIndex(24).ofType(Types.VARCHAR).withSize(51));
        addMetadata(numOperation, ColumnMetadata.named("NUM_OPERATION").withIndex(47).ofType(Types.VARCHAR).withSize(57));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(52).ofType(Types.VARCHAR).withSize(20));
        addMetadata(persIdCreateur, ColumnMetadata.named("PERS_ID_CREATEUR").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prixHtArt, ColumnMetadata.named("PRIX_HT_ART").withIndex(36).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(prorataTva, ColumnMetadata.named("PRORATA_TVA").withIndex(55).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(quantiteArticle, ColumnMetadata.named("QUANTITE_ARTICLE").withIndex(37).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(reference, ColumnMetadata.named("REFERENCE").withIndex(5).ofType(Types.VARCHAR).withSize(50));
        addMetadata(resteTtcEj, ColumnMetadata.named("RESTE_TTC_EJ").withIndex(32).ofType(Types.DECIMAL).withSize(0));
        addMetadata(souscr, ColumnMetadata.named("SOUSCR").withIndex(46).ofType(Types.VARCHAR).withSize(50));
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(12).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(type, ColumnMetadata.named("TYPE").withIndex(6).ofType(Types.VARCHAR).withSize(19));
        addMetadata(typeAchat, ColumnMetadata.named("TYPE_ACHAT").withIndex(22).ofType(Types.VARCHAR).withSize(50));
        addMetadata(ub, ColumnMetadata.named("UB").withIndex(44).ofType(Types.VARCHAR).withSize(10));
    }

}


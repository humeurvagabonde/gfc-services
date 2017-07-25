package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVSitDepEj is a Querydsl query type for QVSitDepEj
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVSitDepEj extends com.querydsl.sql.RelationalPathBase<QVSitDepEj> {

    private static final long serialVersionUID = -2084304670;

    public static final QVSitDepEj vSitDepEj = new QVSitDepEj("V_SIT_DEP_EJ");

    public final StringPath code = createString("code");

    public final StringPath codeAnalytique = createString("codeAnalytique");

    public final StringPath codeMarche = createString("codeMarche");

    public final NumberPath<Long> conIndex = createNumber("conIndex", Long.class);

    public final StringPath dateCreation = createString("dateCreation");

    public final StringPath dateValidation = createString("dateValidation");

    public final StringPath etat = createString("etat");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath fouCodeLib = createString("fouCodeLib");

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> idDepEj = createNumber("idDepEj", Long.class);

    public final StringPath libelle = createString("libelle");

    public final StringPath libelleArticle = createString("libelleArticle");

    public final StringPath libelleEj = createString("libelleEj");

    public final StringPath libelleLot = createString("libelleLot");

    public final StringPath libelleMarche = createString("libelleMarche");

    public final StringPath llOperation = createString("llOperation");

    public final NumberPath<Long> montantBud = createNumber("montantBud", Long.class);

    public final NumberPath<java.math.BigDecimal> montantBudgetaire = createNumber("montantBudgetaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantHt = createNumber("montantHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTtc = createNumber("montantTtc", java.math.BigDecimal.class);

    public final StringPath natureDepense = createString("natureDepense");

    public final NumberPath<Long> nbComplements = createNumber("nbComplements", Long.class);

    public final NumberPath<Long> nbDp = createNumber("nbDp", Long.class);

    public final NumberPath<Long> nbFactures = createNumber("nbFactures", Long.class);

    public final NumberPath<Long> nbSfCertifies = createNumber("nbSfCertifies", Long.class);

    public final NumberPath<Long> nbSfConstates = createNumber("nbSfConstates", Long.class);

    public final StringPath nomCreateur = createString("nomCreateur");

    public final StringPath nomValidateur = createString("nomValidateur");

    public final StringPath numEj = createString("numEj");

    public final NumberPath<Long> numeroAttribution = createNumber("numeroAttribution", Long.class);

    public final StringPath numeroCompte = createString("numeroCompte");

    public final StringPath numeroLot = createString("numeroLot");

    public final StringPath numeroMarche = createString("numeroMarche");

    public final StringPath orgCr = createString("orgCr");

    public final StringPath orgEtab = createString("orgEtab");

    public final StringPath orgSouscr = createString("orgSouscr");

    public final StringPath orgUb = createString("orgUb");

    public final NumberPath<Long> persIdCreateur = createNumber("persIdCreateur", Long.class);

    public final NumberPath<java.math.BigDecimal> prixHtLigneCommande = createNumber("prixHtLigneCommande", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prixTtcLigneCommande = createNumber("prixTtcLigneCommande", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> prixUnitaire = createNumber("prixUnitaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> quantiteArticle = createNumber("quantiteArticle", java.math.BigDecimal.class);

    public final StringPath reference = createString("reference");

    public final NumberPath<java.math.BigDecimal> tauxTva = createNumber("tauxTva", java.math.BigDecimal.class);

    public final NumberPath<Long> totalHt = createNumber("totalHt", Long.class);

    public final NumberPath<Long> totalResteAPayerTtc = createNumber("totalResteAPayerTtc", Long.class);

    public final NumberPath<Long> totalTtc = createNumber("totalTtc", Long.class);

    public final NumberPath<Long> totalTva = createNumber("totalTva", Long.class);

    public final NumberPath<Long> tvaLigneCommande = createNumber("tvaLigneCommande", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final StringPath type = createString("type");

    public final StringPath typeAchat = createString("typeAchat");

    public QVSitDepEj(String variable) {
        super(QVSitDepEj.class, forVariable(variable), "GFC", "V_SIT_DEP_EJ");
        addMetadata();
    }

    public QVSitDepEj(String variable, String schema, String table) {
        super(QVSitDepEj.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVSitDepEj(Path<? extends QVSitDepEj> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_SIT_DEP_EJ");
        addMetadata();
    }

    public QVSitDepEj(PathMetadata metadata) {
        super(QVSitDepEj.class, metadata, "GFC", "V_SIT_DEP_EJ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(47).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(codeAnalytique, ColumnMetadata.named("CODE_ANALYTIQUE").withIndex(32).ofType(Types.VARCHAR).withSize(50));
        addMetadata(codeMarche, ColumnMetadata.named("CODE_MARCHE").withIndex(33).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(conIndex, ColumnMetadata.named("CON_INDEX").withIndex(44).ofType(Types.DECIMAL).withSize(0));
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(7).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(dateValidation, ColumnMetadata.named("DATE_VALIDATION").withIndex(10).ofType(Types.VARCHAR).withSize(30));
        addMetadata(etat, ColumnMetadata.named("ETAT").withIndex(13).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouCodeLib, ColumnMetadata.named("FOU_CODE_LIB").withIndex(20).ofType(Types.VARCHAR).withSize(254));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(19).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepEj, ColumnMetadata.named("ID_DEP_EJ").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(48).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(libelleArticle, ColumnMetadata.named("LIBELLE_ARTICLE").withIndex(34).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(libelleEj, ColumnMetadata.named("LIBELLE_EJ").withIndex(4).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(libelleLot, ColumnMetadata.named("LIBELLE_LOT").withIndex(24).ofType(Types.VARCHAR).withSize(512));
        addMetadata(libelleMarche, ColumnMetadata.named("LIBELLE_MARCHE").withIndex(22).ofType(Types.VARCHAR).withSize(512));
        addMetadata(llOperation, ColumnMetadata.named("LL_OPERATION").withIndex(45).ofType(Types.VARCHAR).withSize(500));
        addMetadata(montantBud, ColumnMetadata.named("MONTANT_BUD").withIndex(30).ofType(Types.DECIMAL).withSize(0));
        addMetadata(montantBudgetaire, ColumnMetadata.named("MONTANT_BUDGETAIRE").withIndex(53).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantHt, ColumnMetadata.named("MONTANT_HT").withIndex(50).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTtc, ColumnMetadata.named("MONTANT_TTC").withIndex(51).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(natureDepense, ColumnMetadata.named("NATURE_DEPENSE").withIndex(46).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(nbComplements, ColumnMetadata.named("NB_COMPLEMENTS").withIndex(14).ofType(Types.DECIMAL).withSize(0));
        addMetadata(nbDp, ColumnMetadata.named("NB_DP").withIndex(18).ofType(Types.DECIMAL).withSize(0));
        addMetadata(nbFactures, ColumnMetadata.named("NB_FACTURES").withIndex(17).ofType(Types.DECIMAL).withSize(0));
        addMetadata(nbSfCertifies, ColumnMetadata.named("NB_SF_CERTIFIES").withIndex(16).ofType(Types.DECIMAL).withSize(0));
        addMetadata(nbSfConstates, ColumnMetadata.named("NB_SF_CONSTATES").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(nomCreateur, ColumnMetadata.named("NOM_CREATEUR").withIndex(9).ofType(Types.VARCHAR).withSize(241));
        addMetadata(nomValidateur, ColumnMetadata.named("NOM_VALIDATEUR").withIndex(11).ofType(Types.VARCHAR).withSize(241));
        addMetadata(numEj, ColumnMetadata.named("NUM_EJ").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(numeroAttribution, ColumnMetadata.named("NUMERO_ATTRIBUTION").withIndex(26).ofType(Types.DECIMAL).withSize(38));
        addMetadata(numeroCompte, ColumnMetadata.named("NUMERO_COMPTE").withIndex(49).ofType(Types.VARCHAR).withSize(20));
        addMetadata(numeroLot, ColumnMetadata.named("NUMERO_LOT").withIndex(25).ofType(Types.VARCHAR).withSize(5));
        addMetadata(numeroMarche, ColumnMetadata.named("NUMERO_MARCHE").withIndex(23).ofType(Types.VARCHAR).withSize(8));
        addMetadata(orgCr, ColumnMetadata.named("ORG_CR").withIndex(42).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgEtab, ColumnMetadata.named("ORG_ETAB").withIndex(40).ofType(Types.VARCHAR).withSize(10));
        addMetadata(orgSouscr, ColumnMetadata.named("ORG_SOUSCR").withIndex(43).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgUb, ColumnMetadata.named("ORG_UB").withIndex(41).ofType(Types.VARCHAR).withSize(10));
        addMetadata(persIdCreateur, ColumnMetadata.named("PERS_ID_CREATEUR").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prixHtLigneCommande, ColumnMetadata.named("PRIX_HT_LIGNE_COMMANDE").withIndex(37).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(prixTtcLigneCommande, ColumnMetadata.named("PRIX_TTC_LIGNE_COMMANDE").withIndex(38).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(prixUnitaire, ColumnMetadata.named("PRIX_UNITAIRE").withIndex(35).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(quantiteArticle, ColumnMetadata.named("QUANTITE_ARTICLE").withIndex(36).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(reference, ColumnMetadata.named("REFERENCE").withIndex(5).ofType(Types.VARCHAR).withSize(50));
        addMetadata(tauxTva, ColumnMetadata.named("TAUX_TVA").withIndex(52).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(totalHt, ColumnMetadata.named("TOTAL_HT").withIndex(27).ofType(Types.DECIMAL).withSize(0));
        addMetadata(totalResteAPayerTtc, ColumnMetadata.named("TOTAL_RESTE_A_PAYER_TTC").withIndex(31).ofType(Types.DECIMAL).withSize(0));
        addMetadata(totalTtc, ColumnMetadata.named("TOTAL_TTC").withIndex(29).ofType(Types.DECIMAL).withSize(0));
        addMetadata(totalTva, ColumnMetadata.named("TOTAL_TVA").withIndex(28).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tvaLigneCommande, ColumnMetadata.named("TVA_LIGNE_COMMANDE").withIndex(39).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(12).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(type, ColumnMetadata.named("TYPE").withIndex(6).ofType(Types.VARCHAR).withSize(19));
        addMetadata(typeAchat, ColumnMetadata.named("TYPE_ACHAT").withIndex(21).ofType(Types.VARCHAR).withSize(50));
    }

}


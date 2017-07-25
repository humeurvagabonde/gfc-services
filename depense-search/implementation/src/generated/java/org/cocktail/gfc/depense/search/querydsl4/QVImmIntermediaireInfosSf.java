package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVImmIntermediaireInfosSf is a Querydsl query type for QVImmIntermediaireInfosSf
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVImmIntermediaireInfosSf extends com.querydsl.sql.RelationalPathBase<QVImmIntermediaireInfosSf> {

    private static final long serialVersionUID = -1495345375;

    public static final QVImmIntermediaireInfosSf vImmIntermediaireInfosSf = new QVImmIntermediaireInfosSf("V_IMM_INTERMEDIAIRE_INFOS_SF");

    public final StringPath artLibelle = createString("artLibelle");

    public final NumberPath<java.math.BigDecimal> artMontantHtLigneEj = createNumber("artMontantHtLigneEj", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> artPrixUnitaire = createNumber("artPrixUnitaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> artQteEj = createNumber("artQteEj", java.math.BigDecimal.class);

    public final StringPath dpDatesFactures = createString("dpDatesFactures");

    public final StringPath dpEtats = createString("dpEtats");

    public final StringPath dpFactures = createString("dpFactures");

    public final StringPath dpNumeros = createString("dpNumeros");

    public final StringPath dpReferenceInterneFacture = createString("dpReferenceInterneFacture");

    public final StringPath ejDate = createString("ejDate");

    public final NumberPath<Long> ejFouOrdre = createNumber("ejFouOrdre", Long.class);

    public final StringPath ejLibelle = createString("ejLibelle");

    public final StringPath ejNum = createString("ejNum");

    public final NumberPath<Long> ejTyetId = createNumber("ejTyetId", Long.class);

    public final NumberPath<Long> sfAuteurCertification = createNumber("sfAuteurCertification", Long.class);

    public final NumberPath<Long> sfAuteurConstatation = createNumber("sfAuteurConstatation", Long.class);

    public final StringPath sfDate = createString("sfDate");

    public final StringPath sfEbs = createString("sfEbs");

    public final NumberPath<Long> sfMontantBudgetaire = createNumber("sfMontantBudgetaire", Long.class);

    public final NumberPath<java.math.BigDecimal> sfMontantHt = createNumber("sfMontantHt", java.math.BigDecimal.class);

    public final StringPath sfNumero = createString("sfNumero");

    public final StringPath sfPcoNum = createString("sfPcoNum");

    public final NumberPath<java.math.BigDecimal> sfQuantite = createNumber("sfQuantite", java.math.BigDecimal.class);

    public final StringPath sfRefBl = createString("sfRefBl");

    public final NumberPath<java.math.BigDecimal> sfTauxProrataTva = createNumber("sfTauxProrataTva", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> sfTauxTva = createNumber("sfTauxTva", java.math.BigDecimal.class);

    public QVImmIntermediaireInfosSf(String variable) {
        super(QVImmIntermediaireInfosSf.class, forVariable(variable), "GFC", "V_IMM_INTERMEDIAIRE_INFOS_SF");
        addMetadata();
    }

    public QVImmIntermediaireInfosSf(String variable, String schema, String table) {
        super(QVImmIntermediaireInfosSf.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVImmIntermediaireInfosSf(Path<? extends QVImmIntermediaireInfosSf> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_IMM_INTERMEDIAIRE_INFOS_SF");
        addMetadata();
    }

    public QVImmIntermediaireInfosSf(PathMetadata metadata) {
        super(QVImmIntermediaireInfosSf.class, metadata, "GFC", "V_IMM_INTERMEDIAIRE_INFOS_SF");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artLibelle, ColumnMetadata.named("ART_LIBELLE").withIndex(6).ofType(Types.VARCHAR).withSize(500));
        addMetadata(artMontantHtLigneEj, ColumnMetadata.named("ART_MONTANT_HT_LIGNE_EJ").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(artPrixUnitaire, ColumnMetadata.named("ART_PRIX_UNITAIRE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(artQteEj, ColumnMetadata.named("ART_QTE_EJ").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(dpDatesFactures, ColumnMetadata.named("DP_DATES_FACTURES").withIndex(25).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(dpEtats, ColumnMetadata.named("DP_ETATS").withIndex(26).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(dpFactures, ColumnMetadata.named("DP_FACTURES").withIndex(23).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(dpNumeros, ColumnMetadata.named("DP_NUMEROS").withIndex(22).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(dpReferenceInterneFacture, ColumnMetadata.named("DP_REFERENCE_INTERNE_FACTURE").withIndex(24).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(ejDate, ColumnMetadata.named("EJ_DATE").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(ejFouOrdre, ColumnMetadata.named("EJ_FOU_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ejLibelle, ColumnMetadata.named("EJ_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(500));
        addMetadata(ejNum, ColumnMetadata.named("EJ_NUM").withIndex(1).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(ejTyetId, ColumnMetadata.named("EJ_TYET_ID").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(sfAuteurCertification, ColumnMetadata.named("SF_AUTEUR_CERTIFICATION").withIndex(12).ofType(Types.DECIMAL).withSize(38));
        addMetadata(sfAuteurConstatation, ColumnMetadata.named("SF_AUTEUR_CONSTATATION").withIndex(11).ofType(Types.DECIMAL).withSize(38));
        addMetadata(sfDate, ColumnMetadata.named("SF_DATE").withIndex(14).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(sfEbs, ColumnMetadata.named("SF_EBS").withIndex(20).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(sfMontantBudgetaire, ColumnMetadata.named("SF_MONTANT_BUDGETAIRE").withIndex(21).ofType(Types.DECIMAL).withSize(0));
        addMetadata(sfMontantHt, ColumnMetadata.named("SF_MONTANT_HT").withIndex(16).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(sfNumero, ColumnMetadata.named("SF_NUMERO").withIndex(10).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(sfPcoNum, ColumnMetadata.named("SF_PCO_NUM").withIndex(19).ofType(Types.VARCHAR).withSize(20));
        addMetadata(sfQuantite, ColumnMetadata.named("SF_QUANTITE").withIndex(15).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(sfRefBl, ColumnMetadata.named("SF_REF_BL").withIndex(13).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(sfTauxProrataTva, ColumnMetadata.named("SF_TAUX_PRORATA_TVA").withIndex(18).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(sfTauxTva, ColumnMetadata.named("SF_TAUX_TVA").withIndex(17).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
    }

}


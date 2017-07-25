package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOpeOperation is a Querydsl query type for QOpeOperation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpeOperation extends com.querydsl.sql.RelationalPathBase<QOpeOperation> {

    private static final long serialVersionUID = 41335789;

    public static final QOpeOperation opeOperation = new QOpeOperation("OPE_OPERATION");

    public final StringPath ancienneReference = createString("ancienneReference");

    public final StringPath avisDefavorable = createString("avisDefavorable");

    public final StringPath avisFavorable = createString("avisFavorable");

    public final StringPath cNaf = createString("cNaf");

    public final StringPath conCr = createString("conCr");

    public final DateTimePath<java.sql.Timestamp> conDateApurement = createDateTime("conDateApurement", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> conDateCloture = createDateTime("conDateCloture", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> conDateCreation = createDateTime("conDateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> conDateFinPaiement = createDateTime("conDateFinPaiement", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> conDateModif = createDateTime("conDateModif", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> conDateValidAdm = createDateTime("conDateValidAdm", java.sql.Timestamp.class);

    public final NumberPath<Long> conDuree = createNumber("conDuree", Long.class);

    public final NumberPath<Long> conDureeMois = createNumber("conDureeMois", Long.class);

    public final StringPath conEtablissement = createString("conEtablissement");

    public final StringPath conGroupeBud = createString("conGroupeBud");

    public final StringPath conGroupePartenaire = createString("conGroupePartenaire");

    public final NumberPath<Long> conIndex = createNumber("conIndex", Long.class);

    public final NumberPath<Long> conNature = createNumber("conNature", Long.class);

    public final StringPath conReferenceExterne = createString("conReferenceExterne");

    public final StringPath conSuppr = createString("conSuppr");

    public final StringPath contexte = createString("contexte");

    public final NumberPath<Integer> contrainteEligibiliteDep = createNumber("contrainteEligibiliteDep", Integer.class);

    public final DateTimePath<java.sql.Timestamp> dateMigration = createDateTime("dateMigration", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final StringPath description = createString("description");

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final NumberPath<Integer> estConventionRa = createNumber("estConventionRa", Integer.class);

    public final NumberPath<Integer> estFlechee = createNumber("estFlechee", Integer.class);

    public final NumberPath<Integer> estInclusePpiEtab = createNumber("estInclusePpiEtab", Integer.class);

    public final NumberPath<Integer> estIncluseTbxBudgetaires = createNumber("estIncluseTbxBudgetaires", Integer.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idOpeCategOperation = createNumber("idOpeCategOperation", Long.class);

    public final NumberPath<Long> idOpeFluxDepRec = createNumber("idOpeFluxDepRec", Long.class);

    public final NumberPath<Long> idOpeModePilotage = createNumber("idOpeModePilotage", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> idOpeTypeOperation = createNumber("idOpeTypeOperation", Long.class);

    public final StringPath llOperation = createString("llOperation");

    public final StringPath motifsAvis = createString("motifsAvis");

    public final NumberPath<Integer> opePreOperation = createNumber("opePreOperation", Integer.class);

    public final NumberPath<Long> orgIdComposante = createNumber("orgIdComposante", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final StringPath remarques = createString("remarques");

    public final NumberPath<Long> tccId = createNumber("tccId", Long.class);

    public final NumberPath<Long> trOrdre = createNumber("trOrdre", Long.class);

    public final NumberPath<Long> utlOrdreCreation = createNumber("utlOrdreCreation", Long.class);

    public final NumberPath<Long> utlOrdreModif = createNumber("utlOrdreModif", Long.class);

    public final NumberPath<Long> utlOrdreValidAdm = createNumber("utlOrdreValidAdm", Long.class);

    public final com.querydsl.sql.PrimaryKey<QOpeOperation> opeOperationPk = createPrimaryKey(idOpeOperation);

    public QOpeOperation(String variable) {
        super(QOpeOperation.class, forVariable(variable), "GFC", "OPE_OPERATION");
        addMetadata();
    }

    public QOpeOperation(String variable, String schema, String table) {
        super(QOpeOperation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpeOperation(Path<? extends QOpeOperation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "OPE_OPERATION");
        addMetadata();
    }

    public QOpeOperation(PathMetadata metadata) {
        super(QOpeOperation.class, metadata, "GFC", "OPE_OPERATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ancienneReference, ColumnMetadata.named("ANCIENNE_REFERENCE").withIndex(34).ofType(Types.VARCHAR).withSize(50));
        addMetadata(avisDefavorable, ColumnMetadata.named("AVIS_DEFAVORABLE").withIndex(24).ofType(Types.VARCHAR).withSize(1));
        addMetadata(avisFavorable, ColumnMetadata.named("AVIS_FAVORABLE").withIndex(23).ofType(Types.VARCHAR).withSize(1));
        addMetadata(cNaf, ColumnMetadata.named("C_NAF").withIndex(28).ofType(Types.VARCHAR).withSize(5));
        addMetadata(conCr, ColumnMetadata.named("CON_CR").withIndex(5).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(conDateApurement, ColumnMetadata.named("CON_DATE_APUREMENT").withIndex(17).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(conDateCloture, ColumnMetadata.named("CON_DATE_CLOTURE").withIndex(16).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(conDateCreation, ColumnMetadata.named("CON_DATE_CREATION").withIndex(11).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(conDateFinPaiement, ColumnMetadata.named("CON_DATE_FIN_PAIEMENT").withIndex(32).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(conDateModif, ColumnMetadata.named("CON_DATE_MODIF").withIndex(13).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(conDateValidAdm, ColumnMetadata.named("CON_DATE_VALID_ADM").withIndex(15).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(conDuree, ColumnMetadata.named("CON_DUREE").withIndex(30).ofType(Types.DECIMAL).withSize(0));
        addMetadata(conDureeMois, ColumnMetadata.named("CON_DUREE_MOIS").withIndex(21).ofType(Types.DECIMAL).withSize(0));
        addMetadata(conEtablissement, ColumnMetadata.named("CON_ETABLISSEMENT").withIndex(4).ofType(Types.VARCHAR).withSize(10));
        addMetadata(conGroupeBud, ColumnMetadata.named("CON_GROUPE_BUD").withIndex(18).ofType(Types.VARCHAR).withSize(1));
        addMetadata(conGroupePartenaire, ColumnMetadata.named("CON_GROUPE_PARTENAIRE").withIndex(29).ofType(Types.VARCHAR).withSize(10));
        addMetadata(conIndex, ColumnMetadata.named("CON_INDEX").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(conNature, ColumnMetadata.named("CON_NATURE").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(conReferenceExterne, ColumnMetadata.named("CON_REFERENCE_EXTERNE").withIndex(7).ofType(Types.VARCHAR).withSize(100));
        addMetadata(conSuppr, ColumnMetadata.named("CON_SUPPR").withIndex(19).ofType(Types.VARCHAR).withSize(1));
        addMetadata(contexte, ColumnMetadata.named("CONTEXTE").withIndex(25).ofType(Types.VARCHAR).withSize(512));
        addMetadata(contrainteEligibiliteDep, ColumnMetadata.named("CONTRAINTE_ELIGIBILITE_DEP").withIndex(46).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(dateMigration, ColumnMetadata.named("DATE_MIGRATION").withIndex(31).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(43).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(8).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(45).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(estConventionRa, ColumnMetadata.named("EST_CONVENTION_RA").withIndex(47).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(estFlechee, ColumnMetadata.named("EST_FLECHEE").withIndex(35).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(estInclusePpiEtab, ColumnMetadata.named("EST_INCLUSE_PPI_ETAB").withIndex(36).ofType(Types.DECIMAL).withSize(1));
        addMetadata(estIncluseTbxBudgetaires, ColumnMetadata.named("EST_INCLUSE_TBX_BUDGETAIRES").withIndex(37).ofType(Types.DECIMAL).withSize(1));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idOpeCategOperation, ColumnMetadata.named("ID_OPE_CATEG_OPERATION").withIndex(39).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeFluxDepRec, ColumnMetadata.named("ID_OPE_FLUX_DEP_REC").withIndex(40).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeModePilotage, ColumnMetadata.named("ID_OPE_MODE_PILOTAGE").withIndex(41).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idOpeTypeOperation, ColumnMetadata.named("ID_OPE_TYPE_OPERATION").withIndex(38).ofType(Types.DECIMAL).withSize(38));
        addMetadata(llOperation, ColumnMetadata.named("LL_OPERATION").withIndex(33).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(motifsAvis, ColumnMetadata.named("MOTIFS_AVIS").withIndex(27).ofType(Types.VARCHAR).withSize(512));
        addMetadata(opePreOperation, ColumnMetadata.named("OPE_PRE_OPERATION").withIndex(48).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(orgIdComposante, ColumnMetadata.named("ORG_ID_COMPOSANTE").withIndex(20).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(42).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(44).ofType(Types.DECIMAL).withSize(38));
        addMetadata(remarques, ColumnMetadata.named("REMARQUES").withIndex(26).ofType(Types.VARCHAR).withSize(512));
        addMetadata(tccId, ColumnMetadata.named("TCC_ID").withIndex(22).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(trOrdre, ColumnMetadata.named("TR_ORDRE").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(utlOrdreCreation, ColumnMetadata.named("UTL_ORDRE_CREATION").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdreModif, ColumnMetadata.named("UTL_ORDRE_MODIF").withIndex(12).ofType(Types.DECIMAL).withSize(0));
        addMetadata(utlOrdreValidAdm, ColumnMetadata.named("UTL_ORDRE_VALID_ADM").withIndex(14).ofType(Types.DECIMAL).withSize(0));
    }

}


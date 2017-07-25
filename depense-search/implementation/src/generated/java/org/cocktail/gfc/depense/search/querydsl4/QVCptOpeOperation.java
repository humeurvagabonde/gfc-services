package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCptOpeOperation is a Querydsl query type for QVCptOpeOperation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCptOpeOperation extends com.querydsl.sql.RelationalPathBase<QVCptOpeOperation> {

    private static final long serialVersionUID = -512567586;

    public static final QVCptOpeOperation vCptOpeOperation = new QVCptOpeOperation("V_CPT_OPE_OPERATION");

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

    public final DateTimePath<java.sql.Timestamp> dateMigration = createDateTime("dateMigration", java.sql.Timestamp.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final StringPath llPartenaire = createString("llPartenaire");

    public final StringPath motifsAvis = createString("motifsAvis");

    public final StringPath opeLibelle = createString("opeLibelle");

    public final StringPath opeNumero = createString("opeNumero");

    public final NumberPath<Long> orgIdComposante = createNumber("orgIdComposante", Long.class);

    public final NumberPath<Long> persIdPartenaire = createNumber("persIdPartenaire", Long.class);

    public final NumberPath<Long> persIdService = createNumber("persIdService", Long.class);

    public final StringPath remarques = createString("remarques");

    public final NumberPath<Long> tccId = createNumber("tccId", Long.class);

    public final NumberPath<Long> trOrdre = createNumber("trOrdre", Long.class);

    public final NumberPath<Long> utlOrdreCreation = createNumber("utlOrdreCreation", Long.class);

    public final NumberPath<Long> utlOrdreModif = createNumber("utlOrdreModif", Long.class);

    public final NumberPath<Long> utlOrdreValidAdm = createNumber("utlOrdreValidAdm", Long.class);

    public QVCptOpeOperation(String variable) {
        super(QVCptOpeOperation.class, forVariable(variable), "GFC", "V_CPT_OPE_OPERATION");
        addMetadata();
    }

    public QVCptOpeOperation(String variable, String schema, String table) {
        super(QVCptOpeOperation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCptOpeOperation(Path<? extends QVCptOpeOperation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CPT_OPE_OPERATION");
        addMetadata();
    }

    public QVCptOpeOperation(PathMetadata metadata) {
        super(QVCptOpeOperation.class, metadata, "GFC", "V_CPT_OPE_OPERATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(avisDefavorable, ColumnMetadata.named("AVIS_DEFAVORABLE").withIndex(27).ofType(Types.VARCHAR).withSize(1));
        addMetadata(avisFavorable, ColumnMetadata.named("AVIS_FAVORABLE").withIndex(26).ofType(Types.VARCHAR).withSize(1));
        addMetadata(cNaf, ColumnMetadata.named("C_NAF").withIndex(31).ofType(Types.VARCHAR).withSize(5));
        addMetadata(conCr, ColumnMetadata.named("CON_CR").withIndex(10).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(conDateApurement, ColumnMetadata.named("CON_DATE_APUREMENT").withIndex(21).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(conDateCloture, ColumnMetadata.named("CON_DATE_CLOTURE").withIndex(20).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(conDateCreation, ColumnMetadata.named("CON_DATE_CREATION").withIndex(15).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(conDateFinPaiement, ColumnMetadata.named("CON_DATE_FIN_PAIEMENT").withIndex(36).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(conDateModif, ColumnMetadata.named("CON_DATE_MODIF").withIndex(17).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(conDateValidAdm, ColumnMetadata.named("CON_DATE_VALID_ADM").withIndex(19).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(conDuree, ColumnMetadata.named("CON_DUREE").withIndex(33).ofType(Types.DECIMAL).withSize(0));
        addMetadata(conDureeMois, ColumnMetadata.named("CON_DUREE_MOIS").withIndex(35).ofType(Types.DECIMAL).withSize(0));
        addMetadata(conEtablissement, ColumnMetadata.named("CON_ETABLISSEMENT").withIndex(9).ofType(Types.VARCHAR).withSize(10));
        addMetadata(conGroupeBud, ColumnMetadata.named("CON_GROUPE_BUD").withIndex(22).ofType(Types.VARCHAR).withSize(1));
        addMetadata(conGroupePartenaire, ColumnMetadata.named("CON_GROUPE_PARTENAIRE").withIndex(32).ofType(Types.VARCHAR).withSize(10));
        addMetadata(conIndex, ColumnMetadata.named("CON_INDEX").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(conNature, ColumnMetadata.named("CON_NATURE").withIndex(11).ofType(Types.DECIMAL).withSize(0));
        addMetadata(conReferenceExterne, ColumnMetadata.named("CON_REFERENCE_EXTERNE").withIndex(12).ofType(Types.VARCHAR).withSize(100));
        addMetadata(conSuppr, ColumnMetadata.named("CON_SUPPR").withIndex(23).ofType(Types.VARCHAR).withSize(1));
        addMetadata(contexte, ColumnMetadata.named("CONTEXTE").withIndex(28).ofType(Types.VARCHAR).withSize(512));
        addMetadata(dateMigration, ColumnMetadata.named("DATE_MIGRATION").withIndex(34).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(llPartenaire, ColumnMetadata.named("LL_PARTENAIRE").withIndex(2).ofType(Types.VARCHAR).withSize(200));
        addMetadata(motifsAvis, ColumnMetadata.named("MOTIFS_AVIS").withIndex(30).ofType(Types.VARCHAR).withSize(512));
        addMetadata(opeLibelle, ColumnMetadata.named("OPE_LIBELLE").withIndex(8).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(opeNumero, ColumnMetadata.named("OPE_NUMERO").withIndex(7).ofType(Types.VARCHAR).withSize(57));
        addMetadata(orgIdComposante, ColumnMetadata.named("ORG_ID_COMPOSANTE").withIndex(24).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persIdPartenaire, ColumnMetadata.named("PERS_ID_PARTENAIRE").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persIdService, ColumnMetadata.named("PERS_ID_SERVICE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(remarques, ColumnMetadata.named("REMARQUES").withIndex(29).ofType(Types.VARCHAR).withSize(512));
        addMetadata(tccId, ColumnMetadata.named("TCC_ID").withIndex(25).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(trOrdre, ColumnMetadata.named("TR_ORDRE").withIndex(13).ofType(Types.DECIMAL).withSize(0));
        addMetadata(utlOrdreCreation, ColumnMetadata.named("UTL_ORDRE_CREATION").withIndex(14).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdreModif, ColumnMetadata.named("UTL_ORDRE_MODIF").withIndex(16).ofType(Types.DECIMAL).withSize(0));
        addMetadata(utlOrdreValidAdm, ColumnMetadata.named("UTL_ORDRE_VALID_ADM").withIndex(18).ofType(Types.DECIMAL).withSize(0));
    }

}


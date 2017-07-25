package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSepaSddParam is a Querydsl query type for QSepaSddParam
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSepaSddParam extends com.querydsl.sql.RelationalPathBase<QSepaSddParam> {

    private static final long serialVersionUID = -1793257017;

    public static final QSepaSddParam sepaSddParam = new QSepaSddParam("SEPA_SDD_PARAM");

    public final StringPath creancierIcs = createString("creancierIcs");

    public final NumberPath<Long> creancierPersId = createNumber("creancierPersId", Long.class);

    public final StringPath devise = createString("devise");

    public final StringPath dftIban = createString("dftIban");

    public final StringPath dftTitulaire = createString("dftTitulaire");

    public final StringPath emetteurNom = createString("emetteurNom");

    public final StringPath etat = createString("etat");

    public final NumberPath<Long> idSepaSddParam = createNumber("idSepaSddParam", Long.class);

    public final StringPath teneurCompteBic = createString("teneurCompteBic");

    public final StringPath teneurCompteCodique = createString("teneurCompteCodique");

    public final StringPath teneurCompteIban = createString("teneurCompteIban");

    public final StringPath teneurCompteNom = createString("teneurCompteNom");

    public final StringPath transfertId = createString("transfertId");

    public final NumberPath<Long> trecOrdre = createNumber("trecOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSepaSddParam> sepaSddParamPk = createPrimaryKey(idSepaSddParam);

    public QSepaSddParam(String variable) {
        super(QSepaSddParam.class, forVariable(variable), "GFC", "SEPA_SDD_PARAM");
        addMetadata();
    }

    public QSepaSddParam(String variable, String schema, String table) {
        super(QSepaSddParam.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSepaSddParam(Path<? extends QSepaSddParam> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SEPA_SDD_PARAM");
        addMetadata();
    }

    public QSepaSddParam(PathMetadata metadata) {
        super(QSepaSddParam.class, metadata, "GFC", "SEPA_SDD_PARAM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(creancierIcs, ColumnMetadata.named("CREANCIER_ICS").withIndex(12).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(creancierPersId, ColumnMetadata.named("CREANCIER_PERS_ID").withIndex(13).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(devise, ColumnMetadata.named("DEVISE").withIndex(11).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(dftIban, ColumnMetadata.named("DFT_IBAN").withIndex(7).ofType(Types.VARCHAR).withSize(34).notNull());
        addMetadata(dftTitulaire, ColumnMetadata.named("DFT_TITULAIRE").withIndex(8).ofType(Types.VARCHAR).withSize(70).notNull());
        addMetadata(emetteurNom, ColumnMetadata.named("EMETTEUR_NOM").withIndex(9).ofType(Types.VARCHAR).withSize(70).notNull());
        addMetadata(etat, ColumnMetadata.named("ETAT").withIndex(14).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idSepaSddParam, ColumnMetadata.named("ID_SEPA_SDD_PARAM").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(teneurCompteBic, ColumnMetadata.named("TENEUR_COMPTE_BIC").withIndex(4).ofType(Types.VARCHAR).withSize(11).notNull());
        addMetadata(teneurCompteCodique, ColumnMetadata.named("TENEUR_COMPTE_CODIQUE").withIndex(6).ofType(Types.VARCHAR).withSize(7).notNull());
        addMetadata(teneurCompteIban, ColumnMetadata.named("TENEUR_COMPTE_IBAN").withIndex(5).ofType(Types.VARCHAR).withSize(34).notNull());
        addMetadata(teneurCompteNom, ColumnMetadata.named("TENEUR_COMPTE_NOM").withIndex(3).ofType(Types.VARCHAR).withSize(70).notNull());
        addMetadata(transfertId, ColumnMetadata.named("TRANSFERT_ID").withIndex(10).ofType(Types.VARCHAR).withSize(8).notNull());
        addMetadata(trecOrdre, ColumnMetadata.named("TREC_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSepaSddMandatHisto is a Querydsl query type for QSepaSddMandatHisto
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSepaSddMandatHisto extends com.querydsl.sql.RelationalPathBase<QSepaSddMandatHisto> {

    private static final long serialVersionUID = 1802996042;

    public static final QSepaSddMandatHisto sepaSddMandatHisto = new QSepaSddMandatHisto("SEPA_SDD_MANDAT_HISTO");

    public final StringPath creancierIcs = createString("creancierIcs");

    public final NumberPath<Long> creancierId = createNumber("creancierId", Long.class);

    public final StringPath creancierNom = createString("creancierNom");

    public final StringPath cTypePrelevement = createString("cTypePrelevement");

    public final StringPath dCreation = createString("dCreation");

    public final StringPath debiteurBic = createString("debiteurBic");

    public final StringPath debiteurIban = createString("debiteurIban");

    public final NumberPath<Long> debiteurId = createNumber("debiteurId", Long.class);

    public final StringPath debiteurNom = createString("debiteurNom");

    public final NumberPath<Long> idSepaSddMandat = createNumber("idSepaSddMandat", Long.class);

    public final NumberPath<Long> idSepaSddMandatHisto = createNumber("idSepaSddMandatHisto", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final StringPath rum = createString("rum");

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSepaSddMandatHisto> sepaSddMandatHistoPk = createPrimaryKey(idSepaSddMandatHisto);

    public QSepaSddMandatHisto(String variable) {
        super(QSepaSddMandatHisto.class, forVariable(variable), "GFC", "SEPA_SDD_MANDAT_HISTO");
        addMetadata();
    }

    public QSepaSddMandatHisto(String variable, String schema, String table) {
        super(QSepaSddMandatHisto.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSepaSddMandatHisto(Path<? extends QSepaSddMandatHisto> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SEPA_SDD_MANDAT_HISTO");
        addMetadata();
    }

    public QSepaSddMandatHisto(PathMetadata metadata) {
        super(QSepaSddMandatHisto.class, metadata, "GFC", "SEPA_SDD_MANDAT_HISTO");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(creancierIcs, ColumnMetadata.named("CREANCIER_ICS").withIndex(10).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(creancierId, ColumnMetadata.named("CREANCIER_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(creancierNom, ColumnMetadata.named("CREANCIER_NOM").withIndex(9).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(cTypePrelevement, ColumnMetadata.named("C_TYPE_PRELEVEMENT").withIndex(7).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(4).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(debiteurBic, ColumnMetadata.named("DEBITEUR_BIC").withIndex(13).ofType(Types.VARCHAR).withSize(11).notNull());
        addMetadata(debiteurIban, ColumnMetadata.named("DEBITEUR_IBAN").withIndex(14).ofType(Types.VARCHAR).withSize(35).notNull());
        addMetadata(debiteurId, ColumnMetadata.named("DEBITEUR_ID").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(debiteurNom, ColumnMetadata.named("DEBITEUR_NOM").withIndex(12).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(idSepaSddMandat, ColumnMetadata.named("ID_SEPA_SDD_MANDAT").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddMandatHisto, ColumnMetadata.named("ID_SEPA_SDD_MANDAT_HISTO").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rum, ColumnMetadata.named("RUM").withIndex(6).ofType(Types.VARCHAR).withSize(35).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(15).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


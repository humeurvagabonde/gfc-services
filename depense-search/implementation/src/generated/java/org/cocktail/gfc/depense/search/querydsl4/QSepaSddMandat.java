package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSepaSddMandat is a Querydsl query type for QSepaSddMandat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSepaSddMandat extends com.querydsl.sql.RelationalPathBase<QSepaSddMandat> {

    private static final long serialVersionUID = 157603331;

    public static final QSepaSddMandat sepaSddMandat = new QSepaSddMandat("SEPA_SDD_MANDAT");

    public final StringPath commentaire = createString("commentaire");

    public final NumberPath<Long> creancierPersId = createNumber("creancierPersId", Long.class);

    public final StringPath cTypePrelevement = createString("cTypePrelevement");

    public final StringPath dCreation = createString("dCreation");

    public final NumberPath<Long> debiteurAdrOrdre = createNumber("debiteurAdrOrdre", Long.class);

    public final NumberPath<Long> debiteurPersId = createNumber("debiteurPersId", Long.class);

    public final NumberPath<Long> debiteurRibOrdre = createNumber("debiteurRibOrdre", Long.class);

    public final StringPath dMandatCreation = createString("dMandatCreation");

    public final StringPath dMandatSignature = createString("dMandatSignature");

    public final StringPath dModification = createString("dModification");

    public final NumberPath<Long> idSepaSddMandat = createNumber("idSepaSddMandat", Long.class);

    public final NumberPath<Long> idSepaSddParam = createNumber("idSepaSddParam", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<Integer> numero = createNumber("numero", Integer.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final StringPath refAppliCreation = createString("refAppliCreation");

    public final StringPath rum = createString("rum");

    public final NumberPath<Long> tiersCreancierPersId = createNumber("tiersCreancierPersId", Long.class);

    public final NumberPath<Long> tiersDebiteurPersId = createNumber("tiersDebiteurPersId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSepaSddMandat> sepaSddMandatPk = createPrimaryKey(idSepaSddMandat);

    public QSepaSddMandat(String variable) {
        super(QSepaSddMandat.class, forVariable(variable), "GFC", "SEPA_SDD_MANDAT");
        addMetadata();
    }

    public QSepaSddMandat(String variable, String schema, String table) {
        super(QSepaSddMandat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSepaSddMandat(Path<? extends QSepaSddMandat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SEPA_SDD_MANDAT");
        addMetadata();
    }

    public QSepaSddMandat(PathMetadata metadata) {
        super(QSepaSddMandat.class, metadata, "GFC", "SEPA_SDD_MANDAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(21).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(creancierPersId, ColumnMetadata.named("CREANCIER_PERS_ID").withIndex(13).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(cTypePrelevement, ColumnMetadata.named("C_TYPE_PRELEVEMENT").withIndex(9).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(4).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(debiteurAdrOrdre, ColumnMetadata.named("DEBITEUR_ADR_ORDRE").withIndex(17).ofType(Types.DECIMAL).withSize(0));
        addMetadata(debiteurPersId, ColumnMetadata.named("DEBITEUR_PERS_ID").withIndex(14).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(debiteurRibOrdre, ColumnMetadata.named("DEBITEUR_RIB_ORDRE").withIndex(15).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(dMandatCreation, ColumnMetadata.named("D_MANDAT_CREATION").withIndex(6).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(dMandatSignature, ColumnMetadata.named("D_MANDAT_SIGNATURE").withIndex(16).ofType(Types.VARCHAR).withSize(100));
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(5).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(idSepaSddMandat, ColumnMetadata.named("ID_SEPA_SDD_MANDAT").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddParam, ColumnMetadata.named("ID_SEPA_SDD_PARAM").withIndex(12).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(20).ofType(Types.VARCHAR).withSize(500));
        addMetadata(numero, ColumnMetadata.named("NUMERO").withIndex(7).ofType(Types.DECIMAL).withSize(9).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(refAppliCreation, ColumnMetadata.named("REF_APPLI_CREATION").withIndex(11).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(rum, ColumnMetadata.named("RUM").withIndex(8).ofType(Types.VARCHAR).withSize(35).notNull());
        addMetadata(tiersCreancierPersId, ColumnMetadata.named("TIERS_CREANCIER_PERS_ID").withIndex(19).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tiersDebiteurPersId, ColumnMetadata.named("TIERS_DEBITEUR_PERS_ID").withIndex(18).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


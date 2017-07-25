package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBoutique is a Querydsl query type for QBoutique
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBoutique extends com.querydsl.sql.RelationalPathBase<QBoutique> {

    private static final long serialVersionUID = 939469102;

    public static final QBoutique boutique = new QBoutique("BOUTIQUE");

    public final StringPath boutiqueArticleExclusif = createString("boutiqueArticleExclusif");

    public final StringPath boutiqueArticleUnique = createString("boutiqueArticleUnique");

    public final StringPath boutiqueCode = createString("boutiqueCode");

    public final StringPath boutiqueDescriptionEn = createString("boutiqueDescriptionEn");

    public final StringPath boutiqueDescriptionFr = createString("boutiqueDescriptionFr");

    public final StringPath boutiqueEmailContact = createString("boutiqueEmailContact");

    public final StringPath boutiqueEnteteAdresse = createString("boutiqueEnteteAdresse");

    public final NumberPath<Long> boutiqueId = createNumber("boutiqueId", Long.class);

    public final StringPath boutiqueLibelleEn = createString("boutiqueLibelleEn");

    public final StringPath boutiqueLibelleFr = createString("boutiqueLibelleFr");

    public final StringPath boutiqueOptionUnique = createString("boutiqueOptionUnique");

    public final StringPath boutiquePaiementWeb = createString("boutiquePaiementWeb");

    public final StringPath boutiqueUrlLogout = createString("boutiqueUrlLogout");

    public final StringPath boutiqueValClient = createString("boutiqueValClient");

    public final StringPath boutiqueValCloture = createString("boutiqueValCloture");

    public final StringPath boutiqueValPrestataire = createString("boutiqueValPrestataire");

    public final StringPath btCode = createString("btCode");

    public final NumberPath<Long> delaisPaiementJours = createNumber("delaisPaiementJours", Long.class);

    public final StringPath limitationPrestPayees = createString("limitationPrestPayees");

    public final NumberPath<Long> noIndividuResp = createNumber("noIndividuResp", Long.class);

    public final NumberPath<Long> nombrePrestations = createNumber("nombrePrestations", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final NumberPath<Long> utlOrdreRespFonc = createNumber("utlOrdreRespFonc", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBoutique> prestationBoutiquePk = createPrimaryKey(boutiqueId);

    public QBoutique(String variable) {
        super(QBoutique.class, forVariable(variable), "GFC", "BOUTIQUE");
        addMetadata();
    }

    public QBoutique(String variable, String schema, String table) {
        super(QBoutique.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBoutique(Path<? extends QBoutique> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BOUTIQUE");
        addMetadata();
    }

    public QBoutique(PathMetadata metadata) {
        super(QBoutique.class, metadata, "GFC", "BOUTIQUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boutiqueArticleExclusif, ColumnMetadata.named("BOUTIQUE_ARTICLE_EXCLUSIF").withIndex(16).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(boutiqueArticleUnique, ColumnMetadata.named("BOUTIQUE_ARTICLE_UNIQUE").withIndex(11).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(boutiqueCode, ColumnMetadata.named("BOUTIQUE_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(boutiqueDescriptionEn, ColumnMetadata.named("BOUTIQUE_DESCRIPTION_EN").withIndex(14).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(boutiqueDescriptionFr, ColumnMetadata.named("BOUTIQUE_DESCRIPTION_FR").withIndex(13).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(boutiqueEmailContact, ColumnMetadata.named("BOUTIQUE_EMAIL_CONTACT").withIndex(8).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(boutiqueEnteteAdresse, ColumnMetadata.named("BOUTIQUE_ENTETE_ADRESSE").withIndex(23).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(boutiqueId, ColumnMetadata.named("BOUTIQUE_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(boutiqueLibelleEn, ColumnMetadata.named("BOUTIQUE_LIBELLE_EN").withIndex(3).ofType(Types.VARCHAR).withSize(100));
        addMetadata(boutiqueLibelleFr, ColumnMetadata.named("BOUTIQUE_LIBELLE_FR").withIndex(2).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(boutiqueOptionUnique, ColumnMetadata.named("BOUTIQUE_OPTION_UNIQUE").withIndex(12).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(boutiquePaiementWeb, ColumnMetadata.named("BOUTIQUE_PAIEMENT_WEB").withIndex(19).ofType(Types.VARCHAR).withSize(1));
        addMetadata(boutiqueUrlLogout, ColumnMetadata.named("BOUTIQUE_URL_LOGOUT").withIndex(17).ofType(Types.VARCHAR).withSize(100));
        addMetadata(boutiqueValClient, ColumnMetadata.named("BOUTIQUE_VAL_CLIENT").withIndex(5).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(boutiqueValCloture, ColumnMetadata.named("BOUTIQUE_VAL_CLOTURE").withIndex(7).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(boutiqueValPrestataire, ColumnMetadata.named("BOUTIQUE_VAL_PRESTATAIRE").withIndex(6).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(btCode, ColumnMetadata.named("BT_CODE").withIndex(9).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(delaisPaiementJours, ColumnMetadata.named("DELAIS_PAIEMENT_JOURS").withIndex(20).ofType(Types.DECIMAL).withSize(0));
        addMetadata(limitationPrestPayees, ColumnMetadata.named("LIMITATION_PREST_PAYEES").withIndex(22).ofType(Types.VARCHAR).withSize(1));
        addMetadata(noIndividuResp, ColumnMetadata.named("NO_INDIVIDU_RESP").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(nombrePrestations, ColumnMetadata.named("NOMBRE_PRESTATIONS").withIndex(21).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(18).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdreRespFonc, ColumnMetadata.named("UTL_ORDRE_RESP_FONC").withIndex(15).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


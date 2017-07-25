package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCommandeImpression is a Querydsl query type for QCommandeImpression
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCommandeImpression extends com.querydsl.sql.RelationalPathBase<QCommandeImpression> {

    private static final long serialVersionUID = 1253713261;

    public static final QCommandeImpression commandeImpression = new QCommandeImpression("COMMANDE_IMPRESSION");

    public final StringPath cimpDate = createString("cimpDate");

    public final StringPath cimpDateLivraison = createString("cimpDateLivraison");

    public final NumberPath<Long> cimpFournisseurAdrordre = createNumber("cimpFournisseurAdrordre", Long.class);

    public final NumberPath<Long> cimpId = createNumber("cimpId", Long.class);

    public final StringPath cimpInfosImpression = createString("cimpInfosImpression");

    public final NumberPath<Long> cimpLivraisonAdrordre = createNumber("cimpLivraisonAdrordre", Long.class);

    public final StringPath cimpLivraisonCstructure = createString("cimpLivraisonCstructure");

    public final StringPath cimpLivraisonFax = createString("cimpLivraisonFax");

    public final StringPath cimpLivraisonTelephone = createString("cimpLivraisonTelephone");

    public final NumberPath<Long> cimpServiceAdrordre = createNumber("cimpServiceAdrordre", Long.class);

    public final StringPath cimpServiceCstructure = createString("cimpServiceCstructure");

    public final StringPath cimpServiceFax = createString("cimpServiceFax");

    public final StringPath cimpServiceTelephone = createString("cimpServiceTelephone");

    public final NumberPath<Long> commId = createNumber("commId", Long.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCommandeImpression> commandeImpressionPk = createPrimaryKey(cimpId);

    public QCommandeImpression(String variable) {
        super(QCommandeImpression.class, forVariable(variable), "GFC", "COMMANDE_IMPRESSION");
        addMetadata();
    }

    public QCommandeImpression(String variable, String schema, String table) {
        super(QCommandeImpression.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCommandeImpression(Path<? extends QCommandeImpression> path) {
        super(path.getType(), path.getMetadata(), "GFC", "COMMANDE_IMPRESSION");
        addMetadata();
    }

    public QCommandeImpression(PathMetadata metadata) {
        super(QCommandeImpression.class, metadata, "GFC", "COMMANDE_IMPRESSION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cimpDate, ColumnMetadata.named("CIMP_DATE").withIndex(3).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(cimpDateLivraison, ColumnMetadata.named("CIMP_DATE_LIVRAISON").withIndex(14).ofType(Types.VARCHAR).withSize(30));
        addMetadata(cimpFournisseurAdrordre, ColumnMetadata.named("CIMP_FOURNISSEUR_ADRORDRE").withIndex(13).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(cimpId, ColumnMetadata.named("CIMP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(cimpInfosImpression, ColumnMetadata.named("CIMP_INFOS_IMPRESSION").withIndex(4).ofType(Types.VARCHAR).withSize(500));
        addMetadata(cimpLivraisonAdrordre, ColumnMetadata.named("CIMP_LIVRAISON_ADRORDRE").withIndex(10).ofType(Types.DECIMAL).withSize(0));
        addMetadata(cimpLivraisonCstructure, ColumnMetadata.named("CIMP_LIVRAISON_CSTRUCTURE").withIndex(9).ofType(Types.VARCHAR).withSize(10));
        addMetadata(cimpLivraisonFax, ColumnMetadata.named("CIMP_LIVRAISON_FAX").withIndex(12).ofType(Types.VARCHAR).withSize(14));
        addMetadata(cimpLivraisonTelephone, ColumnMetadata.named("CIMP_LIVRAISON_TELEPHONE").withIndex(11).ofType(Types.VARCHAR).withSize(14));
        addMetadata(cimpServiceAdrordre, ColumnMetadata.named("CIMP_SERVICE_ADRORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(cimpServiceCstructure, ColumnMetadata.named("CIMP_SERVICE_CSTRUCTURE").withIndex(5).ofType(Types.VARCHAR).withSize(10));
        addMetadata(cimpServiceFax, ColumnMetadata.named("CIMP_SERVICE_FAX").withIndex(8).ofType(Types.VARCHAR).withSize(14));
        addMetadata(cimpServiceTelephone, ColumnMetadata.named("CIMP_SERVICE_TELEPHONE").withIndex(7).ofType(Types.VARCHAR).withSize(14));
        addMetadata(commId, ColumnMetadata.named("COMM_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(15).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


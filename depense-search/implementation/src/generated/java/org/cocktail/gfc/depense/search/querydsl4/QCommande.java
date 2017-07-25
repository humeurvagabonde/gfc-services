package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCommande is a Querydsl query type for QCommande
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCommande extends com.querydsl.sql.RelationalPathBase<QCommande> {

    private static final long serialVersionUID = -1848427452;

    public static final QCommande commande = new QCommande("COMMANDE");

    public final StringPath commCommentaire = createString("commCommentaire");

    public final NumberPath<Long> commId = createNumber("commId", Long.class);

    public final StringPath commLibelle = createString("commLibelle");

    public final StringPath commReference = createString("commReference");

    public final NumberPath<Long> devId = createNumber("devId", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final NumberPath<Long> tyetIdImprimable = createNumber("tyetIdImprimable", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCommande> commandePk = createPrimaryKey(commId);

    public QCommande(String variable) {
        super(QCommande.class, forVariable(variable), "GFC", "COMMANDE");
        addMetadata();
    }

    public QCommande(String variable, String schema, String table) {
        super(QCommande.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCommande(Path<? extends QCommande> path) {
        super(path.getType(), path.getMetadata(), "GFC", "COMMANDE");
        addMetadata();
    }

    public QCommande(PathMetadata metadata) {
        super(QCommande.class, metadata, "GFC", "COMMANDE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commCommentaire, ColumnMetadata.named("COMM_COMMENTAIRE").withIndex(8).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(commId, ColumnMetadata.named("COMM_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(commLibelle, ColumnMetadata.named("COMM_LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(commReference, ColumnMetadata.named("COMM_REFERENCE").withIndex(4).ofType(Types.VARCHAR).withSize(50));
        addMetadata(devId, ColumnMetadata.named("DEV_ID").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetIdImprimable, ColumnMetadata.named("TYET_ID_IMPRIMABLE").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


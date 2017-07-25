package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBoutiqueClient is a Querydsl query type for QBoutiqueClient
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBoutiqueClient extends com.querydsl.sql.RelationalPathBase<QBoutiqueClient> {

    private static final long serialVersionUID = -703402343;

    public static final QBoutiqueClient boutiqueClient = new QBoutiqueClient("BOUTIQUE_CLIENT");

    public final NumberPath<Long> boutiqueId = createNumber("boutiqueId", Long.class);

    public final DateTimePath<java.sql.Timestamp> dateDebut = createDateTime("dateDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateFin = createDateTime("dateFin", java.sql.Timestamp.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBoutiqueClient> boutiqueClientPk = createPrimaryKey(boutiqueId, persId);

    public QBoutiqueClient(String variable) {
        super(QBoutiqueClient.class, forVariable(variable), "GFC", "BOUTIQUE_CLIENT");
        addMetadata();
    }

    public QBoutiqueClient(String variable, String schema, String table) {
        super(QBoutiqueClient.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBoutiqueClient(Path<? extends QBoutiqueClient> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BOUTIQUE_CLIENT");
        addMetadata();
    }

    public QBoutiqueClient(PathMetadata metadata) {
        super(QBoutiqueClient.class, metadata, "GFC", "BOUTIQUE_CLIENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boutiqueId, ColumnMetadata.named("BOUTIQUE_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(dateDebut, ColumnMetadata.named("DATE_DEBUT").withIndex(3).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dateFin, ColumnMetadata.named("DATE_FIN").withIndex(4).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBoutiqueCatalogue is a Querydsl query type for QBoutiqueCatalogue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBoutiqueCatalogue extends com.querydsl.sql.RelationalPathBase<QBoutiqueCatalogue> {

    private static final long serialVersionUID = -848611621;

    public static final QBoutiqueCatalogue boutiqueCatalogue = new QBoutiqueCatalogue("BOUTIQUE_CATALOGUE");

    public final NumberPath<Long> boutiqueId = createNumber("boutiqueId", Long.class);

    public final NumberPath<Long> catId = createNumber("catId", Long.class);

    public final StringPath commentaire = createString("commentaire");

    public final DateTimePath<java.sql.Timestamp> dateDebut = createDateTime("dateDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateFin = createDateTime("dateFin", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QBoutiqueCatalogue> boutiqueCataloguePk = createPrimaryKey(boutiqueId, catId);

    public QBoutiqueCatalogue(String variable) {
        super(QBoutiqueCatalogue.class, forVariable(variable), "GFC", "BOUTIQUE_CATALOGUE");
        addMetadata();
    }

    public QBoutiqueCatalogue(String variable, String schema, String table) {
        super(QBoutiqueCatalogue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBoutiqueCatalogue(Path<? extends QBoutiqueCatalogue> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BOUTIQUE_CATALOGUE");
        addMetadata();
    }

    public QBoutiqueCatalogue(PathMetadata metadata) {
        super(QBoutiqueCatalogue.class, metadata, "GFC", "BOUTIQUE_CATALOGUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boutiqueId, ColumnMetadata.named("BOUTIQUE_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(5).ofType(Types.VARCHAR).withSize(500));
        addMetadata(dateDebut, ColumnMetadata.named("DATE_DEBUT").withIndex(3).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dateFin, ColumnMetadata.named("DATE_FIN").withIndex(4).ofType(Types.TIMESTAMP).withSize(7));
    }

}


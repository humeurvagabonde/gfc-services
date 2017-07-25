package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCataloguePrestationWeb is a Querydsl query type for QCataloguePrestationWeb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCataloguePrestationWeb extends com.querydsl.sql.RelationalPathBase<QCataloguePrestationWeb> {

    private static final long serialVersionUID = -2128988476;

    public static final QCataloguePrestationWeb cataloguePrestationWeb = new QCataloguePrestationWeb("CATALOGUE_PRESTATION_WEB");

    public final StringPath catCle = createString("catCle");

    public final StringPath catCommantaire = createString("catCommantaire");

    public final NumberPath<Long> catId = createNumber("catId", Long.class);

    public final NumberPath<Long> catPwebId = createNumber("catPwebId", Long.class);

    public final StringPath catValeur = createString("catValeur");

    public final com.querydsl.sql.PrimaryKey<QCataloguePrestationWeb> cataloguePrestationWebPk = createPrimaryKey(catPwebId);

    public QCataloguePrestationWeb(String variable) {
        super(QCataloguePrestationWeb.class, forVariable(variable), "GFC", "CATALOGUE_PRESTATION_WEB");
        addMetadata();
    }

    public QCataloguePrestationWeb(String variable, String schema, String table) {
        super(QCataloguePrestationWeb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCataloguePrestationWeb(Path<? extends QCataloguePrestationWeb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CATALOGUE_PRESTATION_WEB");
        addMetadata();
    }

    public QCataloguePrestationWeb(PathMetadata metadata) {
        super(QCataloguePrestationWeb.class, metadata, "GFC", "CATALOGUE_PRESTATION_WEB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(catCle, ColumnMetadata.named("CAT_CLE").withIndex(3).ofType(Types.VARCHAR).withSize(200));
        addMetadata(catCommantaire, ColumnMetadata.named("CAT_COMMANTAIRE").withIndex(5).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(catPwebId, ColumnMetadata.named("CAT_PWEB_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(catValeur, ColumnMetadata.named("CAT_VALEUR").withIndex(4).ofType(Types.VARCHAR).withSize(4000));
    }

}


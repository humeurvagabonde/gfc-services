package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBoutiqueInscription is a Querydsl query type for QBoutiqueInscription
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBoutiqueInscription extends com.querydsl.sql.RelationalPathBase<QBoutiqueInscription> {

    private static final long serialVersionUID = 1941213642;

    public static final QBoutiqueInscription boutiqueInscription = new QBoutiqueInscription("BOUTIQUE_INSCRIPTION");

    public final NumberPath<Long> biId = createNumber("biId", Long.class);

    public final NumberPath<Long> boutiqueId = createNumber("boutiqueId", Long.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> prestId = createNumber("prestId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBoutiqueInscription> boutiqueInscriptionPk = createPrimaryKey(biId);

    public QBoutiqueInscription(String variable) {
        super(QBoutiqueInscription.class, forVariable(variable), "GFC", "BOUTIQUE_INSCRIPTION");
        addMetadata();
    }

    public QBoutiqueInscription(String variable, String schema, String table) {
        super(QBoutiqueInscription.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBoutiqueInscription(Path<? extends QBoutiqueInscription> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BOUTIQUE_INSCRIPTION");
        addMetadata();
    }

    public QBoutiqueInscription(PathMetadata metadata) {
        super(QBoutiqueInscription.class, metadata, "GFC", "BOUTIQUE_INSCRIPTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(biId, ColumnMetadata.named("BI_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(boutiqueId, ColumnMetadata.named("BOUTIQUE_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prestId, ColumnMetadata.named("PREST_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


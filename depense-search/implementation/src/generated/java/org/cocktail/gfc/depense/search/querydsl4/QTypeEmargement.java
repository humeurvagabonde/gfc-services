package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeEmargement is a Querydsl query type for QTypeEmargement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeEmargement extends com.querydsl.sql.RelationalPathBase<QTypeEmargement> {

    private static final long serialVersionUID = 1286350969;

    public static final QTypeEmargement typeEmargement = new QTypeEmargement("TYPE_EMARGEMENT");

    public final StringPath temLibelle = createString("temLibelle");

    public final NumberPath<Long> temOrdre = createNumber("temOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTypeEmargement> typeEmargementPk = createPrimaryKey(temOrdre);

    public QTypeEmargement(String variable) {
        super(QTypeEmargement.class, forVariable(variable), "GFC", "TYPE_EMARGEMENT");
        addMetadata();
    }

    public QTypeEmargement(String variable, String schema, String table) {
        super(QTypeEmargement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeEmargement(Path<? extends QTypeEmargement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_EMARGEMENT");
        addMetadata();
    }

    public QTypeEmargement(PathMetadata metadata) {
        super(QTypeEmargement.class, metadata, "GFC", "TYPE_EMARGEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(temLibelle, ColumnMetadata.named("TEM_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(temOrdre, ColumnMetadata.named("TEM_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeOrigineBordereau is a Querydsl query type for QTypeOrigineBordereau
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeOrigineBordereau extends com.querydsl.sql.RelationalPathBase<QTypeOrigineBordereau> {

    private static final long serialVersionUID = -2008170862;

    public static final QTypeOrigineBordereau typeOrigineBordereau = new QTypeOrigineBordereau("TYPE_ORIGINE_BORDEREAU");

    public final StringPath torLibelle = createString("torLibelle");

    public final NumberPath<Long> torOrdre = createNumber("torOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTypeOrigineBordereau> typeOrigineBordereauPk = createPrimaryKey(torOrdre);

    public QTypeOrigineBordereau(String variable) {
        super(QTypeOrigineBordereau.class, forVariable(variable), "GFC", "TYPE_ORIGINE_BORDEREAU");
        addMetadata();
    }

    public QTypeOrigineBordereau(String variable, String schema, String table) {
        super(QTypeOrigineBordereau.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeOrigineBordereau(Path<? extends QTypeOrigineBordereau> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_ORIGINE_BORDEREAU");
        addMetadata();
    }

    public QTypeOrigineBordereau(PathMetadata metadata) {
        super(QTypeOrigineBordereau.class, metadata, "GFC", "TYPE_ORIGINE_BORDEREAU");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(torLibelle, ColumnMetadata.named("TOR_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(torOrdre, ColumnMetadata.named("TOR_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


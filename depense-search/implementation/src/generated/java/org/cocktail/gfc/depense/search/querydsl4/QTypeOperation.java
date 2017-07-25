package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeOperation is a Querydsl query type for QTypeOperation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeOperation extends com.querydsl.sql.RelationalPathBase<QTypeOperation> {

    private static final long serialVersionUID = 1685537731;

    public static final QTypeOperation typeOperation = new QTypeOperation("TYPE_OPERATION");

    public final NumberPath<Long> tjoOrdre = createNumber("tjoOrdre", Long.class);

    public final StringPath topCategorie = createString("topCategorie");

    public final StringPath topLibelle = createString("topLibelle");

    public final NumberPath<Long> topOrdre = createNumber("topOrdre", Long.class);

    public final StringPath topType = createString("topType");

    public final com.querydsl.sql.PrimaryKey<QTypeOperation> typeOperationPk = createPrimaryKey(topOrdre);

    public QTypeOperation(String variable) {
        super(QTypeOperation.class, forVariable(variable), "GFC", "TYPE_OPERATION");
        addMetadata();
    }

    public QTypeOperation(String variable, String schema, String table) {
        super(QTypeOperation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeOperation(Path<? extends QTypeOperation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_OPERATION");
        addMetadata();
    }

    public QTypeOperation(PathMetadata metadata) {
        super(QTypeOperation.class, metadata, "GFC", "TYPE_OPERATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tjoOrdre, ColumnMetadata.named("TJO_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(topCategorie, ColumnMetadata.named("TOP_CATEGORIE").withIndex(4).ofType(Types.VARCHAR).withSize(50));
        addMetadata(topLibelle, ColumnMetadata.named("TOP_LIBELLE").withIndex(1).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(topOrdre, ColumnMetadata.named("TOP_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(topType, ColumnMetadata.named("TOP_TYPE").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


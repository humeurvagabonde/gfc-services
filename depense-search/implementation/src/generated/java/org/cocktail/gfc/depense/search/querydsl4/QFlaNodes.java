package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFlaNodes is a Querydsl query type for QFlaNodes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFlaNodes extends com.querydsl.sql.RelationalPathBase<QFlaNodes> {

    private static final long serialVersionUID = 345721056;

    public static final QFlaNodes flaNodes = new QFlaNodes("FLA_NODES");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> idObj = createNumber("idObj", Long.class);

    public final StringPath typeObj = createString("typeObj");

    public final com.querydsl.sql.PrimaryKey<QFlaNodes> idPk = createPrimaryKey(id);

    public QFlaNodes(String variable) {
        super(QFlaNodes.class, forVariable(variable), "GFC", "FLA_NODES");
        addMetadata();
    }

    public QFlaNodes(String variable, String schema, String table) {
        super(QFlaNodes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFlaNodes(Path<? extends QFlaNodes> path) {
        super(path.getType(), path.getMetadata(), "GFC", "FLA_NODES");
        addMetadata();
    }

    public QFlaNodes(PathMetadata metadata) {
        super(QFlaNodes.class, metadata, "GFC", "FLA_NODES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idObj, ColumnMetadata.named("ID_OBJ").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(typeObj, ColumnMetadata.named("TYPE_OBJ").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


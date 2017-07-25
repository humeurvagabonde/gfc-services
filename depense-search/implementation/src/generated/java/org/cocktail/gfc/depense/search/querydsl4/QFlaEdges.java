package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFlaEdges is a Querydsl query type for QFlaEdges
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFlaEdges extends com.querydsl.sql.RelationalPathBase<QFlaEdges> {

    private static final long serialVersionUID = 337084549;

    public static final QFlaEdges flaEdges = new QFlaEdges("FLA_EDGES");

    public final NumberPath<Long> fromN = createNumber("fromN", Long.class);

    public final StringPath lnk = createString("lnk");

    public final NumberPath<Long> toN = createNumber("toN", Long.class);

    public final com.querydsl.sql.PrimaryKey<QFlaEdges> flaEdgesIdPk = createPrimaryKey(fromN, lnk, toN);

    public QFlaEdges(String variable) {
        super(QFlaEdges.class, forVariable(variable), "GFC", "FLA_EDGES");
        addMetadata();
    }

    public QFlaEdges(String variable, String schema, String table) {
        super(QFlaEdges.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFlaEdges(Path<? extends QFlaEdges> path) {
        super(path.getType(), path.getMetadata(), "GFC", "FLA_EDGES");
        addMetadata();
    }

    public QFlaEdges(PathMetadata metadata) {
        super(QFlaEdges.class, metadata, "GFC", "FLA_EDGES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fromN, ColumnMetadata.named("FROM_N").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(lnk, ColumnMetadata.named("LNK").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(toN, ColumnMetadata.named("TO_N").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


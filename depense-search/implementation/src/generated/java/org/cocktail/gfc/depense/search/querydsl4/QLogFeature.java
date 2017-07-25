package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QLogFeature is a Querydsl query type for QLogFeature
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLogFeature extends com.querydsl.sql.RelationalPathBase<QLogFeature> {

    private static final long serialVersionUID = -2007768484;

    public static final QLogFeature logFeature = new QLogFeature("LOG_FEATURE");

    public final NumberPath<Integer> actif = createNumber("actif", Integer.class);

    public final StringPath cFeature = createString("cFeature");

    public final StringPath description = createString("description");

    public final com.querydsl.sql.PrimaryKey<QLogFeature> logFeaturePk = createPrimaryKey(cFeature);

    public QLogFeature(String variable) {
        super(QLogFeature.class, forVariable(variable), "GFC", "LOG_FEATURE");
        addMetadata();
    }

    public QLogFeature(String variable, String schema, String table) {
        super(QLogFeature.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLogFeature(Path<? extends QLogFeature> path) {
        super(path.getType(), path.getMetadata(), "GFC", "LOG_FEATURE");
        addMetadata();
    }

    public QLogFeature(PathMetadata metadata) {
        super(QLogFeature.class, metadata, "GFC", "LOG_FEATURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actif, ColumnMetadata.named("ACTIF").withIndex(3).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(cFeature, ColumnMetadata.named("C_FEATURE").withIndex(1).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(2).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


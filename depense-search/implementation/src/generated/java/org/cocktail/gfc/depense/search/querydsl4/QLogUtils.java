package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QLogUtils is a Querydsl query type for QLogUtils
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLogUtils extends com.querydsl.sql.RelationalPathBase<QLogUtils> {

    private static final long serialVersionUID = 758585751;

    public static final QLogUtils logUtils = new QLogUtils("LOG_UTILS");

    public final StringPath cFeature = createString("cFeature");

    public final DateTimePath<java.sql.Timestamp> logDate = createDateTime("logDate", java.sql.Timestamp.class);

    public final StringPath logDesc = createString("logDesc");

    public final NumberPath<Long> logId = createNumber("logId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QLogUtils> logUtilsPk = createPrimaryKey(logId);

    public QLogUtils(String variable) {
        super(QLogUtils.class, forVariable(variable), "GFC", "LOG_UTILS");
        addMetadata();
    }

    public QLogUtils(String variable, String schema, String table) {
        super(QLogUtils.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLogUtils(Path<? extends QLogUtils> path) {
        super(path.getType(), path.getMetadata(), "GFC", "LOG_UTILS");
        addMetadata();
    }

    public QLogUtils(PathMetadata metadata) {
        super(QLogUtils.class, metadata, "GFC", "LOG_UTILS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cFeature, ColumnMetadata.named("C_FEATURE").withIndex(4).ofType(Types.VARCHAR).withSize(100));
        addMetadata(logDate, ColumnMetadata.named("LOG_DATE").withIndex(2).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(logDesc, ColumnMetadata.named("LOG_DESC").withIndex(3).ofType(Types.CLOB).withSize(4000));
        addMetadata(logId, ColumnMetadata.named("LOG_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


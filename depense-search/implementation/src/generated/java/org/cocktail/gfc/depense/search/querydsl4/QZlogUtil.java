package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QZlogUtil is a Querydsl query type for QZlogUtil
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QZlogUtil extends com.querydsl.sql.RelationalPathBase<QZlogUtil> {

    private static final long serialVersionUID = 1265326454;

    public static final QZlogUtil zlogUtil = new QZlogUtil("ZLOG_UTIL");

    public final StringPath zlogDesc = createString("zlogDesc");

    public final NumberPath<Long> zlogId = createNumber("zlogId", Long.class);

    public final DateTimePath<java.sql.Timestamp> zlogWhen = createDateTime("zlogWhen", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QZlogUtil> zlogUtilPk = createPrimaryKey(zlogId);

    public QZlogUtil(String variable) {
        super(QZlogUtil.class, forVariable(variable), "GFC", "ZLOG_UTIL");
        addMetadata();
    }

    public QZlogUtil(String variable, String schema, String table) {
        super(QZlogUtil.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QZlogUtil(Path<? extends QZlogUtil> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ZLOG_UTIL");
        addMetadata();
    }

    public QZlogUtil(PathMetadata metadata) {
        super(QZlogUtil.class, metadata, "GFC", "ZLOG_UTIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(zlogDesc, ColumnMetadata.named("ZLOG_DESC").withIndex(3).ofType(Types.VARCHAR).withSize(500));
        addMetadata(zlogId, ColumnMetadata.named("ZLOG_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zlogWhen, ColumnMetadata.named("ZLOG_WHEN").withIndex(2).ofType(Types.TIMESTAMP).withSize(7));
    }

}


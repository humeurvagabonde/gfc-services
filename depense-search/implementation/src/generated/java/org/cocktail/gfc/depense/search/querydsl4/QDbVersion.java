package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDbVersion is a Querydsl query type for QDbVersion
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDbVersion extends com.querydsl.sql.RelationalPathBase<QDbVersion> {

    private static final long serialVersionUID = 688211440;

    public static final QDbVersion dbVersion = new QDbVersion("DB_VERSION");

    public final StringPath dbvComment = createString("dbvComment");

    public final DateTimePath<java.sql.Timestamp> dbvDate = createDateTime("dbvDate", java.sql.Timestamp.class);

    public final NumberPath<Long> dbvId = createNumber("dbvId", Long.class);

    public final DateTimePath<java.sql.Timestamp> dbvInstall = createDateTime("dbvInstall", java.sql.Timestamp.class);

    public final StringPath dbvLibelle = createString("dbvLibelle");

    public QDbVersion(String variable) {
        super(QDbVersion.class, forVariable(variable), "GFC", "DB_VERSION");
        addMetadata();
    }

    public QDbVersion(String variable, String schema, String table) {
        super(QDbVersion.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDbVersion(Path<? extends QDbVersion> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DB_VERSION");
        addMetadata();
    }

    public QDbVersion(PathMetadata metadata) {
        super(QDbVersion.class, metadata, "GFC", "DB_VERSION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dbvComment, ColumnMetadata.named("DBV_COMMENT").withIndex(5).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(dbvDate, ColumnMetadata.named("DBV_DATE").withIndex(3).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dbvId, ColumnMetadata.named("DBV_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(dbvInstall, ColumnMetadata.named("DBV_INSTALL").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dbvLibelle, ColumnMetadata.named("DBV_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(30).notNull());
    }

}


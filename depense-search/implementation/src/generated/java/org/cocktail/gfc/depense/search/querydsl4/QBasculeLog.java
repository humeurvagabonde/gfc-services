package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBasculeLog is a Querydsl query type for QBasculeLog
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBasculeLog extends com.querydsl.sql.RelationalPathBase<QBasculeLog> {

    private static final long serialVersionUID = -633645425;

    public static final QBasculeLog basculeLog = new QBasculeLog("BASCULE_LOG");

    public final StringPath dateBascule = createString("dateBascule");

    public final StringPath destId = createString("destId");

    public final StringPath destTable = createString("destTable");

    public final NumberPath<Long> idBasculeLog = createNumber("idBasculeLog", Long.class);

    public final StringPath message = createString("message");

    public final StringPath srcDescr = createString("srcDescr");

    public final StringPath srcId = createString("srcId");

    public final StringPath srcTable = createString("srcTable");

    public final StringPath srcUser = createString("srcUser");

    public final StringPath statut = createString("statut");

    public final com.querydsl.sql.PrimaryKey<QBasculeLog> idBasculeHistPk = createPrimaryKey(idBasculeLog);

    public QBasculeLog(String variable) {
        super(QBasculeLog.class, forVariable(variable), "GFC", "BASCULE_LOG");
        addMetadata();
    }

    public QBasculeLog(String variable, String schema, String table) {
        super(QBasculeLog.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBasculeLog(Path<? extends QBasculeLog> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BASCULE_LOG");
        addMetadata();
    }

    public QBasculeLog(PathMetadata metadata) {
        super(QBasculeLog.class, metadata, "GFC", "BASCULE_LOG");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateBascule, ColumnMetadata.named("DATE_BASCULE").withIndex(2).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(destId, ColumnMetadata.named("DEST_ID").withIndex(9).ofType(Types.VARCHAR).withSize(10));
        addMetadata(destTable, ColumnMetadata.named("DEST_TABLE").withIndex(6).ofType(Types.VARCHAR).withSize(40).notNull());
        addMetadata(idBasculeLog, ColumnMetadata.named("ID_BASCULE_LOG").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(message, ColumnMetadata.named("MESSAGE").withIndex(10).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(srcDescr, ColumnMetadata.named("SRC_DESCR").withIndex(8).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(srcId, ColumnMetadata.named("SRC_ID").withIndex(7).ofType(Types.VARCHAR).withSize(10));
        addMetadata(srcTable, ColumnMetadata.named("SRC_TABLE").withIndex(5).ofType(Types.VARCHAR).withSize(40).notNull());
        addMetadata(srcUser, ColumnMetadata.named("SRC_USER").withIndex(4).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(statut, ColumnMetadata.named("STATUT").withIndex(3).ofType(Types.VARCHAR).withSize(15).notNull());
    }

}


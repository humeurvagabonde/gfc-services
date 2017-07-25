package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRepriseLogDetail is a Querydsl query type for QRepriseLogDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRepriseLogDetail extends com.querydsl.sql.RelationalPathBase<QRepriseLogDetail> {

    private static final long serialVersionUID = -354835911;

    public static final QRepriseLogDetail repriseLogDetail = new QRepriseLogDetail("REPRISE_LOG_DETAIL");

    public final NumberPath<Long> idLog = createNumber("idLog", Long.class);

    public final NumberPath<Long> idLogDetail = createNumber("idLogDetail", Long.class);

    public final StringPath message = createString("message");

    public final StringPath statut = createString("statut");

    public final com.querydsl.sql.PrimaryKey<QRepriseLogDetail> idLogDetailPk = createPrimaryKey(idLog, idLogDetail);

    public QRepriseLogDetail(String variable) {
        super(QRepriseLogDetail.class, forVariable(variable), "GFC", "REPRISE_LOG_DETAIL");
        addMetadata();
    }

    public QRepriseLogDetail(String variable, String schema, String table) {
        super(QRepriseLogDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRepriseLogDetail(Path<? extends QRepriseLogDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "REPRISE_LOG_DETAIL");
        addMetadata();
    }

    public QRepriseLogDetail(PathMetadata metadata) {
        super(QRepriseLogDetail.class, metadata, "GFC", "REPRISE_LOG_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idLog, ColumnMetadata.named("ID_LOG").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idLogDetail, ColumnMetadata.named("ID_LOG_DETAIL").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(message, ColumnMetadata.named("MESSAGE").withIndex(4).ofType(Types.VARCHAR).withSize(1000).notNull());
        addMetadata(statut, ColumnMetadata.named("STATUT").withIndex(3).ofType(Types.VARCHAR).withSize(100).notNull());
    }

}


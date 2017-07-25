package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmTypeApplicationPrc is a Querydsl query type for QAdmTypeApplicationPrc
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmTypeApplicationPrc extends com.querydsl.sql.RelationalPathBase<QAdmTypeApplicationPrc> {

    private static final long serialVersionUID = -3390005;

    public static final QAdmTypeApplicationPrc admTypeApplicationPrc = new QAdmTypeApplicationPrc("ADM_TYPE_APPLICATION_PRC");

    public final NumberPath<Long> tyapId = createNumber("tyapId", Long.class);

    public final NumberPath<Long> tyappId = createNumber("tyappId", Long.class);

    public final StringPath tyappProc = createString("tyappProc");

    public final NumberPath<Long> tyappSort = createNumber("tyappSort", Long.class);

    public final StringPath tyappType = createString("tyappType");

    public final com.querydsl.sql.PrimaryKey<QAdmTypeApplicationPrc> sysC0022355 = createPrimaryKey(tyappId);

    public QAdmTypeApplicationPrc(String variable) {
        super(QAdmTypeApplicationPrc.class, forVariable(variable), "GFC", "ADM_TYPE_APPLICATION_PRC");
        addMetadata();
    }

    public QAdmTypeApplicationPrc(String variable, String schema, String table) {
        super(QAdmTypeApplicationPrc.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmTypeApplicationPrc(Path<? extends QAdmTypeApplicationPrc> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_TYPE_APPLICATION_PRC");
        addMetadata();
    }

    public QAdmTypeApplicationPrc(PathMetadata metadata) {
        super(QAdmTypeApplicationPrc.class, metadata, "GFC", "ADM_TYPE_APPLICATION_PRC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tyapId, ColumnMetadata.named("TYAP_ID").withIndex(2).ofType(Types.DECIMAL).withSize(12).notNull());
        addMetadata(tyappId, ColumnMetadata.named("TYAPP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(12).notNull());
        addMetadata(tyappProc, ColumnMetadata.named("TYAPP_PROC").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(tyappSort, ColumnMetadata.named("TYAPP_SORT").withIndex(4).ofType(Types.DECIMAL).withSize(12).notNull());
        addMetadata(tyappType, ColumnMetadata.named("TYAPP_TYPE").withIndex(5).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}


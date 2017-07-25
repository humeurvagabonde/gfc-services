package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmTypeApplication is a Querydsl query type for QAdmTypeApplication
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmTypeApplication extends com.querydsl.sql.RelationalPathBase<QAdmTypeApplication> {

    private static final long serialVersionUID = 422562038;

    public static final QAdmTypeApplication admTypeApplication = new QAdmTypeApplication("ADM_TYPE_APPLICATION");

    public final NumberPath<Long> domId = createNumber("domId", Long.class);

    public final NumberPath<Long> tyapId = createNumber("tyapId", Long.class);

    public final StringPath tyapLibelle = createString("tyapLibelle");

    public final StringPath tyapStrid = createString("tyapStrid");

    public final com.querydsl.sql.PrimaryKey<QAdmTypeApplication> sysC0024382 = createPrimaryKey(tyapId);

    public QAdmTypeApplication(String variable) {
        super(QAdmTypeApplication.class, forVariable(variable), "GFC", "ADM_TYPE_APPLICATION");
        addMetadata();
    }

    public QAdmTypeApplication(String variable, String schema, String table) {
        super(QAdmTypeApplication.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmTypeApplication(Path<? extends QAdmTypeApplication> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_TYPE_APPLICATION");
        addMetadata();
    }

    public QAdmTypeApplication(PathMetadata metadata) {
        super(QAdmTypeApplication.class, metadata, "GFC", "ADM_TYPE_APPLICATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(domId, ColumnMetadata.named("DOM_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyapId, ColumnMetadata.named("TYAP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(12).notNull());
        addMetadata(tyapLibelle, ColumnMetadata.named("TYAP_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(tyapStrid, ColumnMetadata.named("TYAP_STRID").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


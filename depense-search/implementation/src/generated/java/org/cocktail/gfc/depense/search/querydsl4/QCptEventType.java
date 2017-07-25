package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptEventType is a Querydsl query type for QCptEventType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptEventType extends com.querydsl.sql.RelationalPathBase<QCptEventType> {

    private static final long serialVersionUID = -1791664169;

    public static final QCptEventType cptEventType = new QCptEventType("CPT_EVENT_TYPE");

    public final StringPath code = createString("code");

    public final NumberPath<Long> idCptEventType = createNumber("idCptEventType", Long.class);

    public final StringPath libelle = createString("libelle");

    public final com.querydsl.sql.PrimaryKey<QCptEventType> idCptEventTypePk = createPrimaryKey(idCptEventType);

    public QCptEventType(String variable) {
        super(QCptEventType.class, forVariable(variable), "GFC", "CPT_EVENT_TYPE");
        addMetadata();
    }

    public QCptEventType(String variable, String schema, String table) {
        super(QCptEventType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptEventType(Path<? extends QCptEventType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_EVENT_TYPE");
        addMetadata();
    }

    public QCptEventType(PathMetadata metadata) {
        super(QCptEventType.class, metadata, "GFC", "CPT_EVENT_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(idCptEventType, ColumnMetadata.named("ID_CPT_EVENT_TYPE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(100).notNull());
    }

}


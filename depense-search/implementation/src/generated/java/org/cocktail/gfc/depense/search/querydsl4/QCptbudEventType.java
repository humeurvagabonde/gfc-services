package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptbudEventType is a Querydsl query type for QCptbudEventType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptbudEventType extends com.querydsl.sql.RelationalPathBase<QCptbudEventType> {

    private static final long serialVersionUID = 1706114976;

    public static final QCptbudEventType cptbudEventType = new QCptbudEventType("CPTBUD_EVENT_TYPE");

    public final StringPath code = createString("code");

    public final NumberPath<Long> idCptbudEventType = createNumber("idCptbudEventType", Long.class);

    public final StringPath libelle = createString("libelle");

    public final com.querydsl.sql.PrimaryKey<QCptbudEventType> cptbudEventTypePk = createPrimaryKey(idCptbudEventType);

    public QCptbudEventType(String variable) {
        super(QCptbudEventType.class, forVariable(variable), "GFC", "CPTBUD_EVENT_TYPE");
        addMetadata();
    }

    public QCptbudEventType(String variable, String schema, String table) {
        super(QCptbudEventType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptbudEventType(Path<? extends QCptbudEventType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTBUD_EVENT_TYPE");
        addMetadata();
    }

    public QCptbudEventType(PathMetadata metadata) {
        super(QCptbudEventType.class, metadata, "GFC", "CPTBUD_EVENT_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(idCptbudEventType, ColumnMetadata.named("ID_CPTBUD_EVENT_TYPE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(100).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptEvent is a Querydsl query type for QCptEvent
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptEvent extends com.querydsl.sql.RelationalPathBase<QCptEvent> {

    private static final long serialVersionUID = -796843267;

    public static final QCptEvent cptEvent = new QCptEvent("CPT_EVENT");

    public final StringPath dCreation = createString("dCreation");

    public final NumberPath<Long> idCptEvent = createNumber("idCptEvent", Long.class);

    public final NumberPath<Long> idCptEventType = createNumber("idCptEventType", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final StringPath srcAppName = createString("srcAppName");

    public final com.querydsl.sql.PrimaryKey<QCptEvent> idCptEventPk = createPrimaryKey(idCptEvent);

    public QCptEvent(String variable) {
        super(QCptEvent.class, forVariable(variable), "GFC", "CPT_EVENT");
        addMetadata();
    }

    public QCptEvent(String variable, String schema, String table) {
        super(QCptEvent.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptEvent(Path<? extends QCptEvent> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_EVENT");
        addMetadata();
    }

    public QCptEvent(PathMetadata metadata) {
        super(QCptEvent.class, metadata, "GFC", "CPT_EVENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(5).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(idCptEvent, ColumnMetadata.named("ID_CPT_EVENT").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idCptEventType, ColumnMetadata.named("ID_CPT_EVENT_TYPE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(srcAppName, ColumnMetadata.named("SRC_APP_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


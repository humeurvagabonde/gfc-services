package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptbudEvent is a Querydsl query type for QCptbudEvent
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptbudEvent extends com.querydsl.sql.RelationalPathBase<QCptbudEvent> {

    private static final long serialVersionUID = 1869500230;

    public static final QCptbudEvent cptbudEvent = new QCptbudEvent("CPTBUD_EVENT");

    public final StringPath dCreation = createString("dCreation");

    public final NumberPath<Integer> etat = createNumber("etat", Integer.class);

    public final NumberPath<Long> idCptbudEvent = createNumber("idCptbudEvent", Long.class);

    public final NumberPath<Long> idCptbudEventAnnulation = createNumber("idCptbudEventAnnulation", Long.class);

    public final NumberPath<Long> idCptbudEventType = createNumber("idCptbudEventType", Long.class);

    public final StringPath libelle = createString("libelle");

    public final StringPath message = createString("message");

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final StringPath srcAppName = createString("srcAppName");

    public final StringPath srcHash = createString("srcHash");

    public final com.querydsl.sql.PrimaryKey<QCptbudEvent> cptbudEventPk = createPrimaryKey(idCptbudEvent);

    public QCptbudEvent(String variable) {
        super(QCptbudEvent.class, forVariable(variable), "GFC", "CPTBUD_EVENT");
        addMetadata();
    }

    public QCptbudEvent(String variable, String schema, String table) {
        super(QCptbudEvent.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptbudEvent(Path<? extends QCptbudEvent> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTBUD_EVENT");
        addMetadata();
    }

    public QCptbudEvent(PathMetadata metadata) {
        super(QCptbudEvent.class, metadata, "GFC", "CPTBUD_EVENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(7).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(etat, ColumnMetadata.named("ETAT").withIndex(6).ofType(Types.DECIMAL).withSize(2).notNull());
        addMetadata(idCptbudEvent, ColumnMetadata.named("ID_CPTBUD_EVENT").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idCptbudEventAnnulation, ColumnMetadata.named("ID_CPTBUD_EVENT_ANNULATION").withIndex(10).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idCptbudEventType, ColumnMetadata.named("ID_CPTBUD_EVENT_TYPE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(message, ColumnMetadata.named("MESSAGE").withIndex(9).ofType(Types.CLOB).withSize(4000).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(8).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(srcAppName, ColumnMetadata.named("SRC_APP_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(srcHash, ColumnMetadata.named("SRC_HASH").withIndex(4).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


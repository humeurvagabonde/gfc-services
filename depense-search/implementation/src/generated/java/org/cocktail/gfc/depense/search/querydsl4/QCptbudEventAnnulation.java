package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptbudEventAnnulation is a Querydsl query type for QCptbudEventAnnulation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptbudEventAnnulation extends com.querydsl.sql.RelationalPathBase<QCptbudEventAnnulation> {

    private static final long serialVersionUID = 293655971;

    public static final QCptbudEventAnnulation cptbudEventAnnulation = new QCptbudEventAnnulation("CPTBUD_EVENT_ANNULATION");

    public final StringPath dCreation = createString("dCreation");

    public final NumberPath<Long> idCptbudEventAnnulation = createNumber("idCptbudEventAnnulation", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCptbudEventAnnulation> idCptbudEventAnnulationPk = createPrimaryKey(idCptbudEventAnnulation);

    public QCptbudEventAnnulation(String variable) {
        super(QCptbudEventAnnulation.class, forVariable(variable), "GFC", "CPTBUD_EVENT_ANNULATION");
        addMetadata();
    }

    public QCptbudEventAnnulation(String variable, String schema, String table) {
        super(QCptbudEventAnnulation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptbudEventAnnulation(Path<? extends QCptbudEventAnnulation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTBUD_EVENT_ANNULATION");
        addMetadata();
    }

    public QCptbudEventAnnulation(PathMetadata metadata) {
        super(QCptbudEventAnnulation.class, metadata, "GFC", "CPTBUD_EVENT_ANNULATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(2).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(idCptbudEventAnnulation, ColumnMetadata.named("ID_CPTBUD_EVENT_ANNULATION").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


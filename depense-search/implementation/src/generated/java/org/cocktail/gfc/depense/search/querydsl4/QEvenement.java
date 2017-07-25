package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEvenement is a Querydsl query type for QEvenement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEvenement extends com.querydsl.sql.RelationalPathBase<QEvenement> {

    private static final long serialVersionUID = 50352607;

    public static final QEvenement evenement = new QEvenement("EVENEMENT");

    public final StringPath evtAlerteEffectuee = createString("evtAlerteEffectuee");

    public final DateTimePath<java.sql.Timestamp> evtDate = createDateTime("evtDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> evtDateCreation = createDateTime("evtDateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> evtDateInit = createDateTime("evtDateInit", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> evtDateModification = createDateTime("evtDateModification", java.sql.Timestamp.class);

    public final NumberPath<Long> evtDelaiAlerte = createNumber("evtDelaiAlerte", Long.class);

    public final StringPath evtMotif = createString("evtMotif");

    public final StringPath evtObservation = createString("evtObservation");

    public final NumberPath<Long> evtOrdre = createNumber("evtOrdre", Long.class);

    public final StringPath evtStatut = createString("evtStatut");

    public final NumberPath<Long> evtType = createNumber("evtType", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QEvenement> evenementPk = createPrimaryKey(evtOrdre);

    public QEvenement(String variable) {
        super(QEvenement.class, forVariable(variable), "GFC", "EVENEMENT");
        addMetadata();
    }

    public QEvenement(String variable, String schema, String table) {
        super(QEvenement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEvenement(Path<? extends QEvenement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EVENEMENT");
        addMetadata();
    }

    public QEvenement(PathMetadata metadata) {
        super(QEvenement.class, metadata, "GFC", "EVENEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(evtAlerteEffectuee, ColumnMetadata.named("EVT_ALERTE_EFFECTUEE").withIndex(4).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(evtDate, ColumnMetadata.named("EVT_DATE").withIndex(2).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(evtDateCreation, ColumnMetadata.named("EVT_DATE_CREATION").withIndex(10).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(evtDateInit, ColumnMetadata.named("EVT_DATE_INIT").withIndex(3).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(evtDateModification, ColumnMetadata.named("EVT_DATE_MODIFICATION").withIndex(11).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(evtDelaiAlerte, ColumnMetadata.named("EVT_DELAI_ALERTE").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(evtMotif, ColumnMetadata.named("EVT_MOTIF").withIndex(6).ofType(Types.VARCHAR).withSize(250).notNull());
        addMetadata(evtObservation, ColumnMetadata.named("EVT_OBSERVATION").withIndex(7).ofType(Types.VARCHAR).withSize(250));
        addMetadata(evtOrdre, ColumnMetadata.named("EVT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(evtStatut, ColumnMetadata.named("EVT_STATUT").withIndex(8).ofType(Types.VARCHAR).withSize(1));
        addMetadata(evtType, ColumnMetadata.named("EVT_TYPE").withIndex(12).ofType(Types.DECIMAL).withSize(0));
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(9).ofType(Types.DECIMAL).withSize(0));
    }

}


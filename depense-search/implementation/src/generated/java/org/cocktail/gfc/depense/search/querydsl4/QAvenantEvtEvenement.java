package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvenantEvtEvenement is a Querydsl query type for QAvenantEvtEvenement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvenantEvtEvenement extends com.querydsl.sql.RelationalPathBase<QAvenantEvtEvenement> {

    private static final long serialVersionUID = -1470015515;

    public static final QAvenantEvtEvenement avenantEvtEvenement = new QAvenantEvtEvenement("AVENANT_EVT_EVENEMENT");

    public final NumberPath<Long> avtOrdre = createNumber("avtOrdre", Long.class);

    public final NumberPath<Long> evtId = createNumber("evtId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAvenantEvtEvenement> avenantEvtEvenementPk = createPrimaryKey(avtOrdre, evtId);

    public QAvenantEvtEvenement(String variable) {
        super(QAvenantEvtEvenement.class, forVariable(variable), "GFC", "AVENANT_EVT_EVENEMENT");
        addMetadata();
    }

    public QAvenantEvtEvenement(String variable, String schema, String table) {
        super(QAvenantEvtEvenement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvenantEvtEvenement(Path<? extends QAvenantEvtEvenement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "AVENANT_EVT_EVENEMENT");
        addMetadata();
    }

    public QAvenantEvtEvenement(PathMetadata metadata) {
        super(QAvenantEvtEvenement.class, metadata, "GFC", "AVENANT_EVT_EVENEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(avtOrdre, ColumnMetadata.named("AVT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(evtId, ColumnMetadata.named("EVT_ID").withIndex(2).ofType(Types.DECIMAL).withSize(22).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRepartIndividuEvt is a Querydsl query type for QRepartIndividuEvt
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRepartIndividuEvt extends com.querydsl.sql.RelationalPathBase<QRepartIndividuEvt> {

    private static final long serialVersionUID = -814858747;

    public static final QRepartIndividuEvt repartIndividuEvt = new QRepartIndividuEvt("REPART_INDIVIDU_EVT");

    public final NumberPath<Long> evtOrdre = createNumber("evtOrdre", Long.class);

    public final NumberPath<Long> noIndividu = createNumber("noIndividu", Long.class);

    public final NumberPath<Long> rieOrdre = createNumber("rieOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRepartIndividuEvt> repartIndividuEvtPk = createPrimaryKey(rieOrdre);

    public QRepartIndividuEvt(String variable) {
        super(QRepartIndividuEvt.class, forVariable(variable), "GFC", "REPART_INDIVIDU_EVT");
        addMetadata();
    }

    public QRepartIndividuEvt(String variable, String schema, String table) {
        super(QRepartIndividuEvt.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRepartIndividuEvt(Path<? extends QRepartIndividuEvt> path) {
        super(path.getType(), path.getMetadata(), "GFC", "REPART_INDIVIDU_EVT");
        addMetadata();
    }

    public QRepartIndividuEvt(PathMetadata metadata) {
        super(QRepartIndividuEvt.class, metadata, "GFC", "REPART_INDIVIDU_EVT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(evtOrdre, ColumnMetadata.named("EVT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rieOrdre, ColumnMetadata.named("RIE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


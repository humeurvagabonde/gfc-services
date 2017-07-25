package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBdfCalendrier is a Querydsl query type for QBdfCalendrier
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBdfCalendrier extends com.querydsl.sql.RelationalPathBase<QBdfCalendrier> {

    private static final long serialVersionUID = -2120265493;

    public static final QBdfCalendrier bdfCalendrier = new QBdfCalendrier("BDF_CALENDRIER");

    public final StringPath bdfcalDateBdf = createString("bdfcalDateBdf");

    public final StringPath bdfcalDateIso = createString("bdfcalDateIso");

    public final com.querydsl.sql.PrimaryKey<QBdfCalendrier> bdfCalendrierPk = createPrimaryKey(bdfcalDateIso);

    public QBdfCalendrier(String variable) {
        super(QBdfCalendrier.class, forVariable(variable), "GFC", "BDF_CALENDRIER");
        addMetadata();
    }

    public QBdfCalendrier(String variable, String schema, String table) {
        super(QBdfCalendrier.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBdfCalendrier(Path<? extends QBdfCalendrier> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BDF_CALENDRIER");
        addMetadata();
    }

    public QBdfCalendrier(PathMetadata metadata) {
        super(QBdfCalendrier.class, metadata, "GFC", "BDF_CALENDRIER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bdfcalDateBdf, ColumnMetadata.named("BDFCAL_DATE_BDF").withIndex(2).ofType(Types.VARCHAR).withSize(6).notNull());
        addMetadata(bdfcalDateIso, ColumnMetadata.named("BDFCAL_DATE_ISO").withIndex(1).ofType(Types.VARCHAR).withSize(8).notNull());
    }

}


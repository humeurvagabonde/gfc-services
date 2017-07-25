package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVTempo is a Querydsl query type for QVTempo
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVTempo extends com.querydsl.sql.RelationalPathBase<QVTempo> {

    private static final long serialVersionUID = -1136771953;

    public static final QVTempo vTempo = new QVTempo("V_TEMPO");

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmEbUb = createNumber("idAdmEbUb", Long.class);

    public QVTempo(String variable) {
        super(QVTempo.class, forVariable(variable), "GFC", "V_TEMPO");
        addMetadata();
    }

    public QVTempo(String variable, String schema, String table) {
        super(QVTempo.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVTempo(Path<? extends QVTempo> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_TEMPO");
        addMetadata();
    }

    public QVTempo(PathMetadata metadata) {
        super(QVTempo.class, metadata, "GFC", "V_TEMPO");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEbUb, ColumnMetadata.named("ID_ADM_EB_UB").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


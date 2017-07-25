package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGestion is a Querydsl query type for QGestion
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGestion extends com.querydsl.sql.RelationalPathBase<QGestion> {

    private static final long serialVersionUID = -808018721;

    public static final QGestion gestion = new QGestion("GESTION");

    public final NumberPath<Long> comOrdre = createNumber("comOrdre", Long.class);

    public final StringPath gesCode = createString("gesCode");

    public final com.querydsl.sql.PrimaryKey<QGestion> gestionPk = createPrimaryKey(gesCode);

    public QGestion(String variable) {
        super(QGestion.class, forVariable(variable), "GFC", "GESTION");
        addMetadata();
    }

    public QGestion(String variable, String schema, String table) {
        super(QGestion.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGestion(Path<? extends QGestion> path) {
        super(path.getType(), path.getMetadata(), "GFC", "GESTION");
        addMetadata();
    }

    public QGestion(PathMetadata metadata) {
        super(QGestion.class, metadata, "GFC", "GESTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(comOrdre, ColumnMetadata.named("COM_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(1).ofType(Types.VARCHAR).withSize(10).notNull());
    }

}


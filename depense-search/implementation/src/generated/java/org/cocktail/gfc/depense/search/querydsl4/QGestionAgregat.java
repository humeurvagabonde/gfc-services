package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGestionAgregat is a Querydsl query type for QGestionAgregat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGestionAgregat extends com.querydsl.sql.RelationalPathBase<QGestionAgregat> {

    private static final long serialVersionUID = -1399448190;

    public static final QGestionAgregat gestionAgregat = new QGestionAgregat("GESTION_AGREGAT");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gaDescription = createString("gaDescription");

    public final NumberPath<Long> gaId = createNumber("gaId", Long.class);

    public final StringPath gaLibelle = createString("gaLibelle");

    public final com.querydsl.sql.PrimaryKey<QGestionAgregat> gestionAgregatPk = createPrimaryKey(gaId);

    public QGestionAgregat(String variable) {
        super(QGestionAgregat.class, forVariable(variable), "GFC", "GESTION_AGREGAT");
        addMetadata();
    }

    public QGestionAgregat(String variable, String schema, String table) {
        super(QGestionAgregat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGestionAgregat(Path<? extends QGestionAgregat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "GESTION_AGREGAT");
        addMetadata();
    }

    public QGestionAgregat(PathMetadata metadata) {
        super(QGestionAgregat.class, metadata, "GFC", "GESTION_AGREGAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gaDescription, ColumnMetadata.named("GA_DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(gaId, ColumnMetadata.named("GA_ID").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(gaLibelle, ColumnMetadata.named("GA_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVGrhumAxesStrategiques is a Querydsl query type for QVGrhumAxesStrategiques
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVGrhumAxesStrategiques extends com.querydsl.sql.RelationalPathBase<QVGrhumAxesStrategiques> {

    private static final long serialVersionUID = -376980669;

    public static final QVGrhumAxesStrategiques vGrhumAxesStrategiques = new QVGrhumAxesStrategiques("V_GRHUM_AXES_STRATEGIQUES");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public QVGrhumAxesStrategiques(String variable) {
        super(QVGrhumAxesStrategiques.class, forVariable(variable), "GFC", "V_GRHUM_AXES_STRATEGIQUES");
        addMetadata();
    }

    public QVGrhumAxesStrategiques(String variable, String schema, String table) {
        super(QVGrhumAxesStrategiques.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVGrhumAxesStrategiques(Path<? extends QVGrhumAxesStrategiques> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_GRHUM_AXES_STRATEGIQUES");
        addMetadata();
    }

    public QVGrhumAxesStrategiques(PathMetadata metadata) {
        super(QVGrhumAxesStrategiques.class, metadata, "GFC", "V_GRHUM_AXES_STRATEGIQUES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(6).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(4).ofType(Types.DECIMAL).withSize(0));
    }

}


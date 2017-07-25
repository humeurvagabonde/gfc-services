package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRepriseTitresImportMapping is a Querydsl query type for QRepriseTitresImportMapping
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRepriseTitresImportMapping extends com.querydsl.sql.RelationalPathBase<QRepriseTitresImportMapping> {

    private static final long serialVersionUID = 269635532;

    public static final QRepriseTitresImportMapping repriseTitresImportMapping = new QRepriseTitresImportMapping("REPRISE_TITRES_IMPORT_MAPPING");

    public final DateTimePath<java.sql.Timestamp> dateMiseAJour = createDateTime("dateMiseAJour", java.sql.Timestamp.class);

    public final StringPath erreurs = createString("erreurs");

    public final StringPath etat = createString("etat");

    public final NumberPath<Long> idEcdCible = createNumber("idEcdCible", Long.class);

    public final NumberPath<Long> idEcdSource = createNumber("idEcdSource", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRepriseTitresImportMapping> reprTitresImportMappingPk = createPrimaryKey(idEcdSource);

    public QRepriseTitresImportMapping(String variable) {
        super(QRepriseTitresImportMapping.class, forVariable(variable), "GFC", "REPRISE_TITRES_IMPORT_MAPPING");
        addMetadata();
    }

    public QRepriseTitresImportMapping(String variable, String schema, String table) {
        super(QRepriseTitresImportMapping.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRepriseTitresImportMapping(Path<? extends QRepriseTitresImportMapping> path) {
        super(path.getType(), path.getMetadata(), "GFC", "REPRISE_TITRES_IMPORT_MAPPING");
        addMetadata();
    }

    public QRepriseTitresImportMapping(PathMetadata metadata) {
        super(QRepriseTitresImportMapping.class, metadata, "GFC", "REPRISE_TITRES_IMPORT_MAPPING");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateMiseAJour, ColumnMetadata.named("DATE_MISE_A_JOUR").withIndex(5).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(erreurs, ColumnMetadata.named("ERREURS").withIndex(4).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(etat, ColumnMetadata.named("ETAT").withIndex(3).ofType(Types.VARCHAR).withSize(50));
        addMetadata(idEcdCible, ColumnMetadata.named("ID_ECD_CIBLE").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idEcdSource, ColumnMetadata.named("ID_ECD_SOURCE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(version, ColumnMetadata.named("VERSION").withIndex(6).ofType(Types.DECIMAL).withSize(0));
    }

}


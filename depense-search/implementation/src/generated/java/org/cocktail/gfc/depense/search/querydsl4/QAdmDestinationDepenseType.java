package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmDestinationDepenseType is a Querydsl query type for QAdmDestinationDepenseType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmDestinationDepenseType extends com.querydsl.sql.RelationalPathBase<QAdmDestinationDepenseType> {

    private static final long serialVersionUID = 370670454;

    public static final QAdmDestinationDepenseType admDestinationDepenseType = new QAdmDestinationDepenseType("ADM_DESTINATION_DEPENSE_TYPE");

    public final StringPath libelle = createString("libelle");

    public final StringPath type = createString("type");

    public final com.querydsl.sql.PrimaryKey<QAdmDestinationDepenseType> admDestinationDepenseTypPk = createPrimaryKey(type);

    public QAdmDestinationDepenseType(String variable) {
        super(QAdmDestinationDepenseType.class, forVariable(variable), "GFC", "ADM_DESTINATION_DEPENSE_TYPE");
        addMetadata();
    }

    public QAdmDestinationDepenseType(String variable, String schema, String table) {
        super(QAdmDestinationDepenseType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmDestinationDepenseType(Path<? extends QAdmDestinationDepenseType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_DESTINATION_DEPENSE_TYPE");
        addMetadata();
    }

    public QAdmDestinationDepenseType(PathMetadata metadata) {
        super(QAdmDestinationDepenseType.class, metadata, "GFC", "ADM_DESTINATION_DEPENSE_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(60).notNull());
        addMetadata(type, ColumnMetadata.named("TYPE").withIndex(1).ofType(Types.VARCHAR).withSize(5).notNull());
    }

}


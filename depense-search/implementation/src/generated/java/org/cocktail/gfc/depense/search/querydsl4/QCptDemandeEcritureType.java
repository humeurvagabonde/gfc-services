package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptDemandeEcritureType is a Querydsl query type for QCptDemandeEcritureType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptDemandeEcritureType extends com.querydsl.sql.RelationalPathBase<QCptDemandeEcritureType> {

    private static final long serialVersionUID = 51086304;

    public static final QCptDemandeEcritureType cptDemandeEcritureType = new QCptDemandeEcritureType("CPT_DEMANDE_ECRITURE_TYPE");

    public final StringPath cCptDemandeEcritureType = createString("cCptDemandeEcritureType");

    public final NumberPath<Long> idCptDemandeEcritureType = createNumber("idCptDemandeEcritureType", Long.class);

    public final StringPath libelleDemandeEcritureType = createString("libelleDemandeEcritureType");

    public final com.querydsl.sql.PrimaryKey<QCptDemandeEcritureType> cptDemandeEcrTypePk = createPrimaryKey(idCptDemandeEcritureType);

    public QCptDemandeEcritureType(String variable) {
        super(QCptDemandeEcritureType.class, forVariable(variable), "GFC", "CPT_DEMANDE_ECRITURE_TYPE");
        addMetadata();
    }

    public QCptDemandeEcritureType(String variable, String schema, String table) {
        super(QCptDemandeEcritureType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptDemandeEcritureType(Path<? extends QCptDemandeEcritureType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_DEMANDE_ECRITURE_TYPE");
        addMetadata();
    }

    public QCptDemandeEcritureType(PathMetadata metadata) {
        super(QCptDemandeEcritureType.class, metadata, "GFC", "CPT_DEMANDE_ECRITURE_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cCptDemandeEcritureType, ColumnMetadata.named("C_CPT_DEMANDE_ECRITURE_TYPE").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idCptDemandeEcritureType, ColumnMetadata.named("ID_CPT_DEMANDE_ECRITURE_TYPE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelleDemandeEcritureType, ColumnMetadata.named("LIBELLE_DEMANDE_ECRITURE_TYPE").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


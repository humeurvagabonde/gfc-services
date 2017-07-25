package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptDemandeEcritureTypeTop is a Querydsl query type for QCptDemandeEcritureTypeTop
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptDemandeEcritureTypeTop extends com.querydsl.sql.RelationalPathBase<QCptDemandeEcritureTypeTop> {

    private static final long serialVersionUID = 1493743957;

    public static final QCptDemandeEcritureTypeTop cptDemandeEcritureTypeTop = new QCptDemandeEcritureTypeTop("CPT_DEMANDE_ECRITURE_TYPE_TOP");

    public final StringPath cCptDemandeEcritureType = createString("cCptDemandeEcritureType");

    public final NumberPath<Long> topOrdre = createNumber("topOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCptDemandeEcritureTypeTop> cptDemEcrTypeTopPk = createPrimaryKey(cCptDemandeEcritureType, topOrdre);

    public QCptDemandeEcritureTypeTop(String variable) {
        super(QCptDemandeEcritureTypeTop.class, forVariable(variable), "GFC", "CPT_DEMANDE_ECRITURE_TYPE_TOP");
        addMetadata();
    }

    public QCptDemandeEcritureTypeTop(String variable, String schema, String table) {
        super(QCptDemandeEcritureTypeTop.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptDemandeEcritureTypeTop(Path<? extends QCptDemandeEcritureTypeTop> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_DEMANDE_ECRITURE_TYPE_TOP");
        addMetadata();
    }

    public QCptDemandeEcritureTypeTop(PathMetadata metadata) {
        super(QCptDemandeEcritureTypeTop.class, metadata, "GFC", "CPT_DEMANDE_ECRITURE_TYPE_TOP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cCptDemandeEcritureType, ColumnMetadata.named("C_CPT_DEMANDE_ECRITURE_TYPE").withIndex(1).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(topOrdre, ColumnMetadata.named("TOP_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


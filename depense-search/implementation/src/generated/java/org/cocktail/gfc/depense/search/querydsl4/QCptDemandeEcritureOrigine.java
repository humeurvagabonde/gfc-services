package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptDemandeEcritureOrigine is a Querydsl query type for QCptDemandeEcritureOrigine
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptDemandeEcritureOrigine extends com.querydsl.sql.RelationalPathBase<QCptDemandeEcritureOrigine> {

    private static final long serialVersionUID = 1144403865;

    public static final QCptDemandeEcritureOrigine cptDemandeEcritureOrigine = new QCptDemandeEcritureOrigine("CPT_DEMANDE_ECRITURE_ORIGINE");

    public final StringPath cCptDemandeEcrOrigine = createString("cCptDemandeEcrOrigine");

    public final NumberPath<Long> idCptDemandeEcrOrigine = createNumber("idCptDemandeEcrOrigine", Long.class);

    public final StringPath libelleDemandeEcrOrigine = createString("libelleDemandeEcrOrigine");

    public final com.querydsl.sql.PrimaryKey<QCptDemandeEcritureOrigine> cptDemandeEcrOriPk = createPrimaryKey(idCptDemandeEcrOrigine);

    public QCptDemandeEcritureOrigine(String variable) {
        super(QCptDemandeEcritureOrigine.class, forVariable(variable), "GFC", "CPT_DEMANDE_ECRITURE_ORIGINE");
        addMetadata();
    }

    public QCptDemandeEcritureOrigine(String variable, String schema, String table) {
        super(QCptDemandeEcritureOrigine.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptDemandeEcritureOrigine(Path<? extends QCptDemandeEcritureOrigine> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_DEMANDE_ECRITURE_ORIGINE");
        addMetadata();
    }

    public QCptDemandeEcritureOrigine(PathMetadata metadata) {
        super(QCptDemandeEcritureOrigine.class, metadata, "GFC", "CPT_DEMANDE_ECRITURE_ORIGINE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cCptDemandeEcrOrigine, ColumnMetadata.named("C_CPT_DEMANDE_ECR_ORIGINE").withIndex(1).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idCptDemandeEcrOrigine, ColumnMetadata.named("ID_CPT_DEMANDE_ECR_ORIGINE").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelleDemandeEcrOrigine, ColumnMetadata.named("LIBELLE_DEMANDE_ECR_ORIGINE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


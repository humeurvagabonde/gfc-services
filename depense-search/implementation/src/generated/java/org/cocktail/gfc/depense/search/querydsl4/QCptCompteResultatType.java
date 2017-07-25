package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptCompteResultatType is a Querydsl query type for QCptCompteResultatType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptCompteResultatType extends com.querydsl.sql.RelationalPathBase<QCptCompteResultatType> {

    private static final long serialVersionUID = -1089638713;

    public static final QCptCompteResultatType cptCompteResultatType = new QCptCompteResultatType("CPT_COMPTE_RESULTAT_TYPE");

    public final NumberPath<Long> idCptCompteResultatType = createNumber("idCptCompteResultatType", Long.class);

    public final StringPath libelle = createString("libelle");

    public final StringPath strId = createString("strId");

    public final com.querydsl.sql.PrimaryKey<QCptCompteResultatType> cptCompteResultatTypePk = createPrimaryKey(idCptCompteResultatType);

    public QCptCompteResultatType(String variable) {
        super(QCptCompteResultatType.class, forVariable(variable), "GFC", "CPT_COMPTE_RESULTAT_TYPE");
        addMetadata();
    }

    public QCptCompteResultatType(String variable, String schema, String table) {
        super(QCptCompteResultatType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptCompteResultatType(Path<? extends QCptCompteResultatType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_COMPTE_RESULTAT_TYPE");
        addMetadata();
    }

    public QCptCompteResultatType(PathMetadata metadata) {
        super(QCptCompteResultatType.class, metadata, "GFC", "CPT_COMPTE_RESULTAT_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idCptCompteResultatType, ColumnMetadata.named("ID_CPT_COMPTE_RESULTAT_TYPE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(strId, ColumnMetadata.named("STR_ID").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}


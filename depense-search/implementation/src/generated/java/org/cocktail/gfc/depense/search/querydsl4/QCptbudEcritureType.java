package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptbudEcritureType is a Querydsl query type for QCptbudEcritureType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptbudEcritureType extends com.querydsl.sql.RelationalPathBase<QCptbudEcritureType> {

    private static final long serialVersionUID = 1210137079;

    public static final QCptbudEcritureType cptbudEcritureType = new QCptbudEcritureType("CPTBUD_ECRITURE_TYPE");

    public final StringPath code = createString("code");

    public final NumberPath<Long> idCptbudEcritureType = createNumber("idCptbudEcritureType", Long.class);

    public final StringPath libelle = createString("libelle");

    public final com.querydsl.sql.PrimaryKey<QCptbudEcritureType> idCptbudEcritureTypePk = createPrimaryKey(idCptbudEcritureType);

    public QCptbudEcritureType(String variable) {
        super(QCptbudEcritureType.class, forVariable(variable), "GFC", "CPTBUD_ECRITURE_TYPE");
        addMetadata();
    }

    public QCptbudEcritureType(String variable, String schema, String table) {
        super(QCptbudEcritureType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptbudEcritureType(Path<? extends QCptbudEcritureType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTBUD_ECRITURE_TYPE");
        addMetadata();
    }

    public QCptbudEcritureType(PathMetadata metadata) {
        super(QCptbudEcritureType.class, metadata, "GFC", "CPTBUD_ECRITURE_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idCptbudEcritureType, ColumnMetadata.named("ID_CPTBUD_ECRITURE_TYPE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(150).notNull());
    }

}


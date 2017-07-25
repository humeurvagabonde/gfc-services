package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepEjLigneType is a Querydsl query type for QDepEjLigneType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepEjLigneType extends com.querydsl.sql.RelationalPathBase<QDepEjLigneType> {

    private static final long serialVersionUID = 651392049;

    public static final QDepEjLigneType depEjLigneType = new QDepEjLigneType("DEP_EJ_LIGNE_TYPE");

    public final StringPath cDepEjLigneType = createString("cDepEjLigneType");

    public final StringPath libelle = createString("libelle");

    public final com.querydsl.sql.PrimaryKey<QDepEjLigneType> cDepEjLigneTypePk = createPrimaryKey(cDepEjLigneType);

    public QDepEjLigneType(String variable) {
        super(QDepEjLigneType.class, forVariable(variable), "GFC", "DEP_EJ_LIGNE_TYPE");
        addMetadata();
    }

    public QDepEjLigneType(String variable, String schema, String table) {
        super(QDepEjLigneType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepEjLigneType(Path<? extends QDepEjLigneType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_EJ_LIGNE_TYPE");
        addMetadata();
    }

    public QDepEjLigneType(PathMetadata metadata) {
        super(QDepEjLigneType.class, metadata, "GFC", "DEP_EJ_LIGNE_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cDepEjLigneType, ColumnMetadata.named("C_DEP_EJ_LIGNE_TYPE").withIndex(1).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


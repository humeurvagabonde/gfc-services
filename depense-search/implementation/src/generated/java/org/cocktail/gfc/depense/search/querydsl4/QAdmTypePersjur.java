package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmTypePersjur is a Querydsl query type for QAdmTypePersjur
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmTypePersjur extends com.querydsl.sql.RelationalPathBase<QAdmTypePersjur> {

    private static final long serialVersionUID = -265599881;

    public static final QAdmTypePersjur admTypePersjur = new QAdmTypePersjur("ADM_TYPE_PERSJUR");

    public final NumberPath<Long> tpjId = createNumber("tpjId", Long.class);

    public final StringPath tpjLibelle = createString("tpjLibelle");

    public final NumberPath<Long> tpjNbNivMax = createNumber("tpjNbNivMax", Long.class);

    public final NumberPath<Long> tpjPere = createNumber("tpjPere", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmTypePersjur> typePersjurPk = createPrimaryKey(tpjId);

    public QAdmTypePersjur(String variable) {
        super(QAdmTypePersjur.class, forVariable(variable), "GFC", "ADM_TYPE_PERSJUR");
        addMetadata();
    }

    public QAdmTypePersjur(String variable, String schema, String table) {
        super(QAdmTypePersjur.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmTypePersjur(Path<? extends QAdmTypePersjur> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_TYPE_PERSJUR");
        addMetadata();
    }

    public QAdmTypePersjur(PathMetadata metadata) {
        super(QAdmTypePersjur.class, metadata, "GFC", "ADM_TYPE_PERSJUR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tpjId, ColumnMetadata.named("TPJ_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tpjLibelle, ColumnMetadata.named("TPJ_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(tpjNbNivMax, ColumnMetadata.named("TPJ_NB_NIV_MAX").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tpjPere, ColumnMetadata.named("TPJ_PERE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


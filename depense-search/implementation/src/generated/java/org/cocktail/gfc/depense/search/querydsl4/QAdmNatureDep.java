package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmNatureDep is a Querydsl query type for QAdmNatureDep
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmNatureDep extends com.querydsl.sql.RelationalPathBase<QAdmNatureDep> {

    private static final long serialVersionUID = -1285489368;

    public static final QAdmNatureDep admNatureDep = new QAdmNatureDep("ADM_NATURE_DEP");

    public final StringPath code = createString("code");

    public final NumberPath<Integer> fongible = createNumber("fongible", Integer.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final StringPath libelle = createString("libelle");

    public final com.querydsl.sql.PrimaryKey<QAdmNatureDep> admNatureDepPk = createPrimaryKey(idAdmNatureDep);

    public QAdmNatureDep(String variable) {
        super(QAdmNatureDep.class, forVariable(variable), "GFC", "ADM_NATURE_DEP");
        addMetadata();
    }

    public QAdmNatureDep(String variable, String schema, String table) {
        super(QAdmNatureDep.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmNatureDep(Path<? extends QAdmNatureDep> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_NATURE_DEP");
        addMetadata();
    }

    public QAdmNatureDep(PathMetadata metadata) {
        super(QAdmNatureDep.class, metadata, "GFC", "ADM_NATURE_DEP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(2).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(fongible, ColumnMetadata.named("FONGIBLE").withIndex(4).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


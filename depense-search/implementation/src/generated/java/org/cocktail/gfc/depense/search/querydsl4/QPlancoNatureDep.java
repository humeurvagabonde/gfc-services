package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPlancoNatureDep is a Querydsl query type for QPlancoNatureDep
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPlancoNatureDep extends com.querydsl.sql.RelationalPathBase<QPlancoNatureDep> {

    private static final long serialVersionUID = -195727607;

    public static final QPlancoNatureDep plancoNatureDep = new QPlancoNatureDep("PLANCO_NATURE_DEP");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idPlancoNatureDep = createNumber("idPlancoNatureDep", Long.class);

    public final StringPath pcdEtat = createString("pcdEtat");

    public final StringPath pcoNum = createString("pcoNum");

    public final com.querydsl.sql.PrimaryKey<QPlancoNatureDep> plancoNatureDepPk = createPrimaryKey(idPlancoNatureDep);

    public QPlancoNatureDep(String variable) {
        super(QPlancoNatureDep.class, forVariable(variable), "GFC", "PLANCO_NATURE_DEP");
        addMetadata();
    }

    public QPlancoNatureDep(String variable, String schema, String table) {
        super(QPlancoNatureDep.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPlancoNatureDep(Path<? extends QPlancoNatureDep> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PLANCO_NATURE_DEP");
        addMetadata();
    }

    public QPlancoNatureDep(PathMetadata metadata) {
        super(QPlancoNatureDep.class, metadata, "GFC", "PLANCO_NATURE_DEP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idPlancoNatureDep, ColumnMetadata.named("ID_PLANCO_NATURE_DEP").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(pcdEtat, ColumnMetadata.named("PCD_ETAT").withIndex(5).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


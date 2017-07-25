package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmNatureDepExercice is a Querydsl query type for QAdmNatureDepExercice
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmNatureDepExercice extends com.querydsl.sql.RelationalPathBase<QAdmNatureDepExercice> {

    private static final long serialVersionUID = -1640974032;

    public static final QAdmNatureDepExercice admNatureDepExercice = new QAdmNatureDepExercice("ADM_NATURE_DEP_EXERCICE");

    public final StringPath active = createString("active");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idAdmNatureDepExercice = createNumber("idAdmNatureDepExercice", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmNatureDepExercice> admNatureDepExercicePk = createPrimaryKey(idAdmNatureDepExercice);

    public QAdmNatureDepExercice(String variable) {
        super(QAdmNatureDepExercice.class, forVariable(variable), "GFC", "ADM_NATURE_DEP_EXERCICE");
        addMetadata();
    }

    public QAdmNatureDepExercice(String variable, String schema, String table) {
        super(QAdmNatureDepExercice.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmNatureDepExercice(Path<? extends QAdmNatureDepExercice> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_NATURE_DEP_EXERCICE");
        addMetadata();
    }

    public QAdmNatureDepExercice(PathMetadata metadata) {
        super(QAdmNatureDepExercice.class, metadata, "GFC", "ADM_NATURE_DEP_EXERCICE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("ACTIVE").withIndex(4).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDepExercice, ColumnMetadata.named("ID_ADM_NATURE_DEP_EXERCICE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


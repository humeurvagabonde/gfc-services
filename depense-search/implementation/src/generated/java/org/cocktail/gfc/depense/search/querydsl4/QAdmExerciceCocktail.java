package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmExerciceCocktail is a Querydsl query type for QAdmExerciceCocktail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmExerciceCocktail extends com.querydsl.sql.RelationalPathBase<QAdmExerciceCocktail> {

    private static final long serialVersionUID = 1938598124;

    public static final QAdmExerciceCocktail admExerciceCocktail = new QAdmExerciceCocktail("ADM_EXERCICE_COCKTAIL");

    public final NumberPath<Integer> exeExercice = createNumber("exeExercice", Integer.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QAdmExerciceCocktail> exerciceCocktailPk = createPrimaryKey(exeOrdre);

    public QAdmExerciceCocktail(String variable) {
        super(QAdmExerciceCocktail.class, forVariable(variable), "GFC", "ADM_EXERCICE_COCKTAIL");
        addMetadata();
    }

    public QAdmExerciceCocktail(String variable, String schema, String table) {
        super(QAdmExerciceCocktail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmExerciceCocktail(Path<? extends QAdmExerciceCocktail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_EXERCICE_COCKTAIL");
        addMetadata();
    }

    public QAdmExerciceCocktail(PathMetadata metadata) {
        super(QAdmExerciceCocktail.class, metadata, "GFC", "ADM_EXERCICE_COCKTAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeExercice, ColumnMetadata.named("EXE_EXERCICE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
    }

}


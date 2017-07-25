package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmOrigineRecetteExer is a Querydsl query type for QAdmOrigineRecetteExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmOrigineRecetteExer extends com.querydsl.sql.RelationalPathBase<QAdmOrigineRecetteExer> {

    private static final long serialVersionUID = 1464992241;

    public static final QAdmOrigineRecetteExer admOrigineRecetteExer = new QAdmOrigineRecetteExer("ADM_ORIGINE_RECETTE_EXER");

    public final NumberPath<Integer> editionBudget = createNumber("editionBudget", Integer.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmOrigineRecette = createNumber("idAdmOrigineRecette", Long.class);

    public final NumberPath<Long> idAdmOrigineRecetteExer = createNumber("idAdmOrigineRecetteExer", Long.class);

    public final NumberPath<Integer> saisieBudgetaire = createNumber("saisieBudgetaire", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QAdmOrigineRecetteExer> admOrigRecExePk = createPrimaryKey(idAdmOrigineRecetteExer);

    public QAdmOrigineRecetteExer(String variable) {
        super(QAdmOrigineRecetteExer.class, forVariable(variable), "GFC", "ADM_ORIGINE_RECETTE_EXER");
        addMetadata();
    }

    public QAdmOrigineRecetteExer(String variable, String schema, String table) {
        super(QAdmOrigineRecetteExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmOrigineRecetteExer(Path<? extends QAdmOrigineRecetteExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_ORIGINE_RECETTE_EXER");
        addMetadata();
    }

    public QAdmOrigineRecetteExer(PathMetadata metadata) {
        super(QAdmOrigineRecetteExer.class, metadata, "GFC", "ADM_ORIGINE_RECETTE_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(editionBudget, ColumnMetadata.named("EDITION_BUDGET").withIndex(4).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmOrigineRecette, ColumnMetadata.named("ID_ADM_ORIGINE_RECETTE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmOrigineRecetteExer, ColumnMetadata.named("ID_ADM_ORIGINE_RECETTE_EXER").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(saisieBudgetaire, ColumnMetadata.named("SAISIE_BUDGETAIRE").withIndex(5).ofType(Types.DECIMAL).withSize(1).notNull());
    }

}


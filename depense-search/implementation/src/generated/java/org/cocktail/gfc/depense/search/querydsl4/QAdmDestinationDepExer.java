package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmDestinationDepExer is a Querydsl query type for QAdmDestinationDepExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmDestinationDepExer extends com.querydsl.sql.RelationalPathBase<QAdmDestinationDepExer> {

    private static final long serialVersionUID = 989462049;

    public static final QAdmDestinationDepExer admDestinationDepExer = new QAdmDestinationDepExer("ADM_DESTINATION_DEP_EXER");

    public final NumberPath<Integer> editionBudget = createNumber("editionBudget", Integer.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmDestinationDepExer = createNumber("idAdmDestinationDepExer", Long.class);

    public final NumberPath<Integer> saisieBudgetaire = createNumber("saisieBudgetaire", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QAdmDestinationDepExer> admDestDepExePk = createPrimaryKey(idAdmDestinationDepExer);

    public QAdmDestinationDepExer(String variable) {
        super(QAdmDestinationDepExer.class, forVariable(variable), "GFC", "ADM_DESTINATION_DEP_EXER");
        addMetadata();
    }

    public QAdmDestinationDepExer(String variable, String schema, String table) {
        super(QAdmDestinationDepExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmDestinationDepExer(Path<? extends QAdmDestinationDepExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_DESTINATION_DEP_EXER");
        addMetadata();
    }

    public QAdmDestinationDepExer(PathMetadata metadata) {
        super(QAdmDestinationDepExer.class, metadata, "GFC", "ADM_DESTINATION_DEP_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(editionBudget, ColumnMetadata.named("EDITION_BUDGET").withIndex(5).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idAdmDestinationDepExer, ColumnMetadata.named("ID_ADM_DESTINATION_DEP_EXER").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(saisieBudgetaire, ColumnMetadata.named("SAISIE_BUDGETAIRE").withIndex(4).ofType(Types.DECIMAL).withSize(1).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepRepartBudgetCptBro is a Querydsl query type for QDepRepartBudgetCptBro
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepRepartBudgetCptBro extends com.querydsl.sql.RelationalPathBase<QDepRepartBudgetCptBro> {

    private static final long serialVersionUID = -228634808;

    public static final QDepRepartBudgetCptBro depRepartBudgetCptBro = new QDepRepartBudgetCptBro("DEP_REPART_BUDGET_CPT_BRO");

    public final NumberPath<Long> idCptBrouillardDetail = createNumber("idCptBrouillardDetail", Long.class);

    public final NumberPath<Long> idDepRepartBudget = createNumber("idDepRepartBudget", Long.class);

    public QDepRepartBudgetCptBro(String variable) {
        super(QDepRepartBudgetCptBro.class, forVariable(variable), "GFC", "DEP_REPART_BUDGET_CPT_BRO");
        addMetadata();
    }

    public QDepRepartBudgetCptBro(String variable, String schema, String table) {
        super(QDepRepartBudgetCptBro.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepRepartBudgetCptBro(Path<? extends QDepRepartBudgetCptBro> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_REPART_BUDGET_CPT_BRO");
        addMetadata();
    }

    public QDepRepartBudgetCptBro(PathMetadata metadata) {
        super(QDepRepartBudgetCptBro.class, metadata, "GFC", "DEP_REPART_BUDGET_CPT_BRO");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idCptBrouillardDetail, ColumnMetadata.named("ID_CPT_BROUILLARD_DETAIL").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepRepartBudget, ColumnMetadata.named("ID_DEP_REPART_BUDGET").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


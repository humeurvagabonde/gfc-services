package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepRepartBudgetCptEcd is a Querydsl query type for QDepRepartBudgetCptEcd
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepRepartBudgetCptEcd extends com.querydsl.sql.RelationalPathBase<QDepRepartBudgetCptEcd> {

    private static final long serialVersionUID = -228632401;

    public static final QDepRepartBudgetCptEcd depRepartBudgetCptEcd = new QDepRepartBudgetCptEcd("DEP_REPART_BUDGET_CPT_ECD");

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<Long> idDepRepartBudget = createNumber("idDepRepartBudget", Long.class);

    public QDepRepartBudgetCptEcd(String variable) {
        super(QDepRepartBudgetCptEcd.class, forVariable(variable), "GFC", "DEP_REPART_BUDGET_CPT_ECD");
        addMetadata();
    }

    public QDepRepartBudgetCptEcd(String variable, String schema, String table) {
        super(QDepRepartBudgetCptEcd.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepRepartBudgetCptEcd(Path<? extends QDepRepartBudgetCptEcd> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_REPART_BUDGET_CPT_ECD");
        addMetadata();
    }

    public QDepRepartBudgetCptEcd(PathMetadata metadata) {
        super(QDepRepartBudgetCptEcd.class, metadata, "GFC", "DEP_REPART_BUDGET_CPT_ECD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepRepartBudget, ColumnMetadata.named("ID_DEP_REPART_BUDGET").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


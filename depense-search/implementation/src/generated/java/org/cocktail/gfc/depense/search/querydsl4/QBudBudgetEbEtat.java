package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudBudgetEbEtat is a Querydsl query type for QBudBudgetEbEtat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudBudgetEbEtat extends com.querydsl.sql.RelationalPathBase<QBudBudgetEbEtat> {

    private static final long serialVersionUID = 879406859;

    public static final QBudBudgetEbEtat budBudgetEbEtat = new QBudBudgetEbEtat("BUD_BUDGET_EB_ETAT");

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> idBudBudgetEbEtat = createNumber("idBudBudgetEbEtat", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBudBudgetEbEtat> budBudgetEbEtatPk = createPrimaryKey(idBudBudgetEbEtat);

    public QBudBudgetEbEtat(String variable) {
        super(QBudBudgetEbEtat.class, forVariable(variable), "GFC", "BUD_BUDGET_EB_ETAT");
        addMetadata();
    }

    public QBudBudgetEbEtat(String variable, String schema, String table) {
        super(QBudBudgetEbEtat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudBudgetEbEtat(Path<? extends QBudBudgetEbEtat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_BUDGET_EB_ETAT");
        addMetadata();
    }

    public QBudBudgetEbEtat(PathMetadata metadata) {
        super(QBudBudgetEbEtat.class, metadata, "GFC", "BUD_BUDGET_EB_ETAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudBudgetEbEtat, ColumnMetadata.named("ID_BUD_BUDGET_EB_ETAT").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


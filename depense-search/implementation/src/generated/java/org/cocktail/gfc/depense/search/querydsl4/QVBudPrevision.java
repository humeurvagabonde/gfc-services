package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVBudPrevision is a Querydsl query type for QVBudPrevision
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVBudPrevision extends com.querydsl.sql.RelationalPathBase<QVBudPrevision> {

    private static final long serialVersionUID = -104118042;

    public static final QVBudPrevision vBudPrevision = new QVBudPrevision("V_BUD_PREVISION");

    public final NumberPath<Long> idBudget = createNumber("idBudget", Long.class);

    public final NumberPath<Long> idEb = createNumber("idEb", Long.class);

    public final NumberPath<Long> idPrevision = createNumber("idPrevision", Long.class);

    public final NumberPath<java.math.BigDecimal> montantAe = createNumber("montantAe", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantBudgetaire = createNumber("montantBudgetaire", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantCp = createNumber("montantCp", java.math.BigDecimal.class);

    public QVBudPrevision(String variable) {
        super(QVBudPrevision.class, forVariable(variable), "GFC", "V_BUD_PREVISION");
        addMetadata();
    }

    public QVBudPrevision(String variable, String schema, String table) {
        super(QVBudPrevision.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVBudPrevision(Path<? extends QVBudPrevision> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_BUD_PREVISION");
        addMetadata();
    }

    public QVBudPrevision(PathMetadata metadata) {
        super(QVBudPrevision.class, metadata, "GFC", "V_BUD_PREVISION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idBudget, ColumnMetadata.named("ID_BUDGET").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idEb, ColumnMetadata.named("ID_EB").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idPrevision, ColumnMetadata.named("ID_PREVISION").withIndex(1).ofType(Types.DECIMAL).withSize(38));
        addMetadata(montantAe, ColumnMetadata.named("MONTANT_AE").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(montantBudgetaire, ColumnMetadata.named("MONTANT_BUDGETAIRE").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(montantCp, ColumnMetadata.named("MONTANT_CP").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2));
    }

}


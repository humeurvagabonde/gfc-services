package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVBudOpeTrancheBudDep is a Querydsl query type for QVBudOpeTrancheBudDep
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVBudOpeTrancheBudDep extends com.querydsl.sql.RelationalPathBase<QVBudOpeTrancheBudDep> {

    private static final long serialVersionUID = 1749296276;

    public static final QVBudOpeTrancheBudDep vBudOpeTrancheBudDep = new QVBudOpeTrancheBudDep("V_BUD_OPE_TRANCHE_BUD_DEP");

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idBudget = createNumber("idBudget", Long.class);

    public final NumberPath<Long> idEb = createNumber("idEb", Long.class);

    public final NumberPath<Long> idPrevision = createNumber("idPrevision", Long.class);

    public final NumberPath<java.math.BigDecimal> montantAe = createNumber("montantAe", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantCp = createNumber("montantCp", java.math.BigDecimal.class);

    public QVBudOpeTrancheBudDep(String variable) {
        super(QVBudOpeTrancheBudDep.class, forVariable(variable), "GFC", "V_BUD_OPE_TRANCHE_BUD_DEP");
        addMetadata();
    }

    public QVBudOpeTrancheBudDep(String variable, String schema, String table) {
        super(QVBudOpeTrancheBudDep.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVBudOpeTrancheBudDep(Path<? extends QVBudOpeTrancheBudDep> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_BUD_OPE_TRANCHE_BUD_DEP");
        addMetadata();
    }

    public QVBudOpeTrancheBudDep(PathMetadata metadata) {
        super(QVBudOpeTrancheBudDep.class, metadata, "GFC", "V_BUD_OPE_TRANCHE_BUD_DEP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idBudget, ColumnMetadata.named("ID_BUDGET").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idEb, ColumnMetadata.named("ID_EB").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idPrevision, ColumnMetadata.named("ID_PREVISION").withIndex(1).ofType(Types.DECIMAL).withSize(38));
        addMetadata(montantAe, ColumnMetadata.named("MONTANT_AE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(montantCp, ColumnMetadata.named("MONTANT_CP").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
    }

}


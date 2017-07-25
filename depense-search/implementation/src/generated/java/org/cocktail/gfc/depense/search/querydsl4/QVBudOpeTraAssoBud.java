package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVBudOpeTraAssoBud is a Querydsl query type for QVBudOpeTraAssoBud
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVBudOpeTraAssoBud extends com.querydsl.sql.RelationalPathBase<QVBudOpeTraAssoBud> {

    private static final long serialVersionUID = 1540349759;

    public static final QVBudOpeTraAssoBud vBudOpeTraAssoBud = new QVBudOpeTraAssoBud("V_BUD_OPE_TRA_ASSO_BUD");

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> idOpeTrancheBud = createNumber("idOpeTrancheBud", Long.class);

    public QVBudOpeTraAssoBud(String variable) {
        super(QVBudOpeTraAssoBud.class, forVariable(variable), "GFC", "V_BUD_OPE_TRA_ASSO_BUD");
        addMetadata();
    }

    public QVBudOpeTraAssoBud(String variable, String schema, String table) {
        super(QVBudOpeTraAssoBud.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVBudOpeTraAssoBud(Path<? extends QVBudOpeTraAssoBud> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_BUD_OPE_TRA_ASSO_BUD");
        addMetadata();
    }

    public QVBudOpeTraAssoBud(PathMetadata metadata) {
        super(QVBudOpeTraAssoBud.class, metadata, "GFC", "V_BUD_OPE_TRA_ASSO_BUD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeTrancheBud, ColumnMetadata.named("ID_OPE_TRANCHE_BUD").withIndex(1).ofType(Types.DECIMAL).withSize(38));
    }

}


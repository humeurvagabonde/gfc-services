package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVBudOpeTraIntegBudOuv is a Querydsl query type for QVBudOpeTraIntegBudOuv
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVBudOpeTraIntegBudOuv extends com.querydsl.sql.RelationalPathBase<QVBudOpeTraIntegBudOuv> {

    private static final long serialVersionUID = -590554356;

    public static final QVBudOpeTraIntegBudOuv vBudOpeTraIntegBudOuv = new QVBudOpeTraIntegBudOuv("V_BUD_OPE_TRA_INTEG_BUD_OUV");

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> idOpeTrancheBud = createNumber("idOpeTrancheBud", Long.class);

    public QVBudOpeTraIntegBudOuv(String variable) {
        super(QVBudOpeTraIntegBudOuv.class, forVariable(variable), "GFC", "V_BUD_OPE_TRA_INTEG_BUD_OUV");
        addMetadata();
    }

    public QVBudOpeTraIntegBudOuv(String variable, String schema, String table) {
        super(QVBudOpeTraIntegBudOuv.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVBudOpeTraIntegBudOuv(Path<? extends QVBudOpeTraIntegBudOuv> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_BUD_OPE_TRA_INTEG_BUD_OUV");
        addMetadata();
    }

    public QVBudOpeTraIntegBudOuv(PathMetadata metadata) {
        super(QVBudOpeTraIntegBudOuv.class, metadata, "GFC", "V_BUD_OPE_TRA_INTEG_BUD_OUV");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeTrancheBud, ColumnMetadata.named("ID_OPE_TRANCHE_BUD").withIndex(1).ofType(Types.DECIMAL).withSize(38));
    }

}


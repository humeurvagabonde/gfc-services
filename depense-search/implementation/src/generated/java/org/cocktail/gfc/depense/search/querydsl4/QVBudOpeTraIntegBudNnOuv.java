package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVBudOpeTraIntegBudNnOuv is a Querydsl query type for QVBudOpeTraIntegBudNnOuv
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVBudOpeTraIntegBudNnOuv extends com.querydsl.sql.RelationalPathBase<QVBudOpeTraIntegBudNnOuv> {

    private static final long serialVersionUID = -588218836;

    public static final QVBudOpeTraIntegBudNnOuv vBudOpeTraIntegBudNnOuv = new QVBudOpeTraIntegBudNnOuv("V_BUD_OPE_TRA_INTEG_BUD_NN_OUV");

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> idOpeTrancheBud = createNumber("idOpeTrancheBud", Long.class);

    public QVBudOpeTraIntegBudNnOuv(String variable) {
        super(QVBudOpeTraIntegBudNnOuv.class, forVariable(variable), "GFC", "V_BUD_OPE_TRA_INTEG_BUD_NN_OUV");
        addMetadata();
    }

    public QVBudOpeTraIntegBudNnOuv(String variable, String schema, String table) {
        super(QVBudOpeTraIntegBudNnOuv.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVBudOpeTraIntegBudNnOuv(Path<? extends QVBudOpeTraIntegBudNnOuv> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_BUD_OPE_TRA_INTEG_BUD_NN_OUV");
        addMetadata();
    }

    public QVBudOpeTraIntegBudNnOuv(PathMetadata metadata) {
        super(QVBudOpeTraIntegBudNnOuv.class, metadata, "GFC", "V_BUD_OPE_TRA_INTEG_BUD_NN_OUV");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeTrancheBud, ColumnMetadata.named("ID_OPE_TRANCHE_BUD").withIndex(1).ofType(Types.DECIMAL).withSize(38));
    }

}


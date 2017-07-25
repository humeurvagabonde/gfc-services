package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPrestationBudgetClient is a Querydsl query type for QPrestationBudgetClient
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPrestationBudgetClient extends com.querydsl.sql.RelationalPathBase<QPrestationBudgetClient> {

    private static final long serialVersionUID = 850019211;

    public static final QPrestationBudgetClient prestationBudgetClient = new QPrestationBudgetClient("PRESTATION_BUDGET_CLIENT");

    public final NumberPath<Long> canId = createNumber("canId", Long.class);

    public final NumberPath<Long> engId = createNumber("engId", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> lolfId = createNumber("lolfId", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> prestId = createNumber("prestId", Long.class);

    public final NumberPath<Long> tapId = createNumber("tapId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QPrestationBudgetClient> prestationBudgetClientPk = createPrimaryKey(prestId);

    public QPrestationBudgetClient(String variable) {
        super(QPrestationBudgetClient.class, forVariable(variable), "GFC", "PRESTATION_BUDGET_CLIENT");
        addMetadata();
    }

    public QPrestationBudgetClient(String variable, String schema, String table) {
        super(QPrestationBudgetClient.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPrestationBudgetClient(Path<? extends QPrestationBudgetClient> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PRESTATION_BUDGET_CLIENT");
        addMetadata();
    }

    public QPrestationBudgetClient(PathMetadata metadata) {
        super(QPrestationBudgetClient.class, metadata, "GFC", "PRESTATION_BUDGET_CLIENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(canId, ColumnMetadata.named("CAN_ID").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(engId, ColumnMetadata.named("ENG_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(lolfId, ColumnMetadata.named("LOLF_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(5).ofType(Types.VARCHAR).withSize(20));
        addMetadata(prestId, ColumnMetadata.named("PREST_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tapId, ColumnMetadata.named("TAP_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0));
    }

}


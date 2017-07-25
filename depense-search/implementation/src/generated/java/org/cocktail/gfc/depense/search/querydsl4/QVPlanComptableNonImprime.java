package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVPlanComptableNonImprime is a Querydsl query type for QVPlanComptableNonImprime
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVPlanComptableNonImprime extends com.querydsl.sql.RelationalPathBase<QVPlanComptableNonImprime> {

    private static final long serialVersionUID = 184695384;

    public static final QVPlanComptableNonImprime vPlanComptableNonImprime = new QVPlanComptableNonImprime("V_PLAN_COMPTABLE_NON_IMPRIME");

    public final StringPath pcoNum = createString("pcoNum");

    public QVPlanComptableNonImprime(String variable) {
        super(QVPlanComptableNonImprime.class, forVariable(variable), "GFC", "V_PLAN_COMPTABLE_NON_IMPRIME");
        addMetadata();
    }

    public QVPlanComptableNonImprime(String variable, String schema, String table) {
        super(QVPlanComptableNonImprime.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVPlanComptableNonImprime(Path<? extends QVPlanComptableNonImprime> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_PLAN_COMPTABLE_NON_IMPRIME");
        addMetadata();
    }

    public QVPlanComptableNonImprime(PathMetadata metadata) {
        super(QVPlanComptableNonImprime.class, metadata, "GFC", "V_PLAN_COMPTABLE_NON_IMPRIME");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(1).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


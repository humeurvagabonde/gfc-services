package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVPlanComptableNoVerifOrv is a Querydsl query type for QVPlanComptableNoVerifOrv
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVPlanComptableNoVerifOrv extends com.querydsl.sql.RelationalPathBase<QVPlanComptableNoVerifOrv> {

    private static final long serialVersionUID = 523518398;

    public static final QVPlanComptableNoVerifOrv vPlanComptableNoVerifOrv = new QVPlanComptableNoVerifOrv("V_PLAN_COMPTABLE_NO_VERIF_ORV");

    public final StringPath pcoNum = createString("pcoNum");

    public QVPlanComptableNoVerifOrv(String variable) {
        super(QVPlanComptableNoVerifOrv.class, forVariable(variable), "GFC", "V_PLAN_COMPTABLE_NO_VERIF_ORV");
        addMetadata();
    }

    public QVPlanComptableNoVerifOrv(String variable, String schema, String table) {
        super(QVPlanComptableNoVerifOrv.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVPlanComptableNoVerifOrv(Path<? extends QVPlanComptableNoVerifOrv> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_PLAN_COMPTABLE_NO_VERIF_ORV");
        addMetadata();
    }

    public QVPlanComptableNoVerifOrv(PathMetadata metadata) {
        super(QVPlanComptableNoVerifOrv.class, metadata, "GFC", "V_PLAN_COMPTABLE_NO_VERIF_ORV");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(1).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


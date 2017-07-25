package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmOriNatRecPcptExer is a Querydsl query type for QAdmOriNatRecPcptExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmOriNatRecPcptExer extends com.querydsl.sql.RelationalPathBase<QAdmOriNatRecPcptExer> {

    private static final long serialVersionUID = 279876876;

    public static final QAdmOriNatRecPcptExer admOriNatRecPcptExer = new QAdmOriNatRecPcptExer("ADM_ORI_NAT_REC_PCPT_EXER");

    public final NumberPath<Long> idAdmNatureRecExer = createNumber("idAdmNatureRecExer", Long.class);

    public final NumberPath<Long> idAdmOrigineRecetteExer = createNumber("idAdmOrigineRecetteExer", Long.class);

    public final NumberPath<Long> idOriNatRecPlanCptExer = createNumber("idOriNatRecPlanCptExer", Long.class);

    public final NumberPath<Long> pcoeId = createNumber("pcoeId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmOriNatRecPcptExer> oriNatRecPlanCptExerPk = createPrimaryKey(idOriNatRecPlanCptExer);

    public QAdmOriNatRecPcptExer(String variable) {
        super(QAdmOriNatRecPcptExer.class, forVariable(variable), "GFC", "ADM_ORI_NAT_REC_PCPT_EXER");
        addMetadata();
    }

    public QAdmOriNatRecPcptExer(String variable, String schema, String table) {
        super(QAdmOriNatRecPcptExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmOriNatRecPcptExer(Path<? extends QAdmOriNatRecPcptExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_ORI_NAT_REC_PCPT_EXER");
        addMetadata();
    }

    public QAdmOriNatRecPcptExer(PathMetadata metadata) {
        super(QAdmOriNatRecPcptExer.class, metadata, "GFC", "ADM_ORI_NAT_REC_PCPT_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmNatureRecExer, ColumnMetadata.named("ID_ADM_NATURE_REC_EXER").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmOrigineRecetteExer, ColumnMetadata.named("ID_ADM_ORIGINE_RECETTE_EXER").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOriNatRecPlanCptExer, ColumnMetadata.named("ID_ORI_NAT_REC_PLAN_CPT_EXER").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(pcoeId, ColumnMetadata.named("PCOE_ID").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


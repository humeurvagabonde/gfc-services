package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVPlanComptableTva is a Querydsl query type for QVPlanComptableTva
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVPlanComptableTva extends com.querydsl.sql.RelationalPathBase<QVPlanComptableTva> {

    private static final long serialVersionUID = 600061781;

    public static final QVPlanComptableTva vPlanComptableTva = new QVPlanComptableTva("V_PLAN_COMPTABLE_TVA");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final StringPath pcoValidite = createString("pcoValidite");

    public QVPlanComptableTva(String variable) {
        super(QVPlanComptableTva.class, forVariable(variable), "GFC", "V_PLAN_COMPTABLE_TVA");
        addMetadata();
    }

    public QVPlanComptableTva(String variable, String schema, String table) {
        super(QVPlanComptableTva.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVPlanComptableTva(Path<? extends QVPlanComptableTva> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_PLAN_COMPTABLE_TVA");
        addMetadata();
    }

    public QVPlanComptableTva(PathMetadata metadata) {
        super(QVPlanComptableTva.class, metadata, "GFC", "V_PLAN_COMPTABLE_TVA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(1).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(pcoValidite, ColumnMetadata.named("PCO_VALIDITE").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


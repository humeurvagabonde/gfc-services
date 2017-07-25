package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVPlanComptableCtp is a Querydsl query type for QVPlanComptableCtp
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVPlanComptableCtp extends com.querydsl.sql.RelationalPathBase<QVPlanComptableCtp> {

    private static final long serialVersionUID = 600045397;

    public static final QVPlanComptableCtp vPlanComptableCtp = new QVPlanComptableCtp("V_PLAN_COMPTABLE_CTP");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final StringPath pcoValidite = createString("pcoValidite");

    public QVPlanComptableCtp(String variable) {
        super(QVPlanComptableCtp.class, forVariable(variable), "GFC", "V_PLAN_COMPTABLE_CTP");
        addMetadata();
    }

    public QVPlanComptableCtp(String variable, String schema, String table) {
        super(QVPlanComptableCtp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVPlanComptableCtp(Path<? extends QVPlanComptableCtp> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_PLAN_COMPTABLE_CTP");
        addMetadata();
    }

    public QVPlanComptableCtp(PathMetadata metadata) {
        super(QVPlanComptableCtp.class, metadata, "GFC", "V_PLAN_COMPTABLE_CTP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(1).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(pcoValidite, ColumnMetadata.named("PCO_VALIDITE").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


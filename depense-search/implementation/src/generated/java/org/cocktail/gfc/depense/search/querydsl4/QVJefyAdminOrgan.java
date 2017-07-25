package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVJefyAdminOrgan is a Querydsl query type for QVJefyAdminOrgan
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVJefyAdminOrgan extends com.querydsl.sql.RelationalPathBase<QVJefyAdminOrgan> {

    private static final long serialVersionUID = -1146388740;

    public static final QVJefyAdminOrgan vJefyAdminOrgan = new QVJefyAdminOrgan("V_JEFY_ADMIN_ORGAN");

    public final StringPath orgComp = createString("orgComp");

    public final StringPath orgLbud = createString("orgLbud");

    public final StringPath orgLib = createString("orgLib");

    public final NumberPath<Integer> orgNiv = createNumber("orgNiv", Integer.class);

    public final NumberPath<Long> orgOrdre = createNumber("orgOrdre", Long.class);

    public final NumberPath<Long> orgRat = createNumber("orgRat", Long.class);

    public final StringPath orgUc = createString("orgUc");

    public final StringPath orgUnit = createString("orgUnit");

    public QVJefyAdminOrgan(String variable) {
        super(QVJefyAdminOrgan.class, forVariable(variable), "GFC", "V_JEFY_ADMIN_ORGAN");
        addMetadata();
    }

    public QVJefyAdminOrgan(String variable, String schema, String table) {
        super(QVJefyAdminOrgan.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVJefyAdminOrgan(Path<? extends QVJefyAdminOrgan> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_JEFY_ADMIN_ORGAN");
        addMetadata();
    }

    public QVJefyAdminOrgan(PathMetadata metadata) {
        super(QVJefyAdminOrgan.class, metadata, "GFC", "V_JEFY_ADMIN_ORGAN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(orgComp, ColumnMetadata.named("ORG_COMP").withIndex(3).ofType(Types.VARCHAR).withSize(10));
        addMetadata(orgLbud, ColumnMetadata.named("ORG_LBUD").withIndex(4).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgLib, ColumnMetadata.named("ORG_LIB").withIndex(7).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(orgNiv, ColumnMetadata.named("ORG_NIV").withIndex(8).ofType(Types.DECIMAL).withSize(5).notNull());
        addMetadata(orgOrdre, ColumnMetadata.named("ORG_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(orgRat, ColumnMetadata.named("ORG_RAT").withIndex(6).ofType(Types.DECIMAL).withSize(38));
        addMetadata(orgUc, ColumnMetadata.named("ORG_UC").withIndex(5).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgUnit, ColumnMetadata.named("ORG_UNIT").withIndex(2).ofType(Types.VARCHAR).withSize(10));
    }

}


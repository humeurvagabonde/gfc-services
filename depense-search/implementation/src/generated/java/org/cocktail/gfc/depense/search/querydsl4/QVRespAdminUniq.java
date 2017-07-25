package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVRespAdminUniq is a Querydsl query type for QVRespAdminUniq
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVRespAdminUniq extends com.querydsl.sql.RelationalPathBase<QVRespAdminUniq> {

    private static final long serialVersionUID = 1239838964;

    public static final QVRespAdminUniq vRespAdminUniq = new QVRespAdminUniq("V_RESP_ADMIN_UNIQ");

    public final NumberPath<Long> apcOrdre = createNumber("apcOrdre", Long.class);

    public final NumberPath<Long> avtOrdre = createNumber("avtOrdre", Long.class);

    public QVRespAdminUniq(String variable) {
        super(QVRespAdminUniq.class, forVariable(variable), "GFC", "V_RESP_ADMIN_UNIQ");
        addMetadata();
    }

    public QVRespAdminUniq(String variable, String schema, String table) {
        super(QVRespAdminUniq.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVRespAdminUniq(Path<? extends QVRespAdminUniq> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_RESP_ADMIN_UNIQ");
        addMetadata();
    }

    public QVRespAdminUniq(PathMetadata metadata) {
        super(QVRespAdminUniq.class, metadata, "GFC", "V_RESP_ADMIN_UNIQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(apcOrdre, ColumnMetadata.named("APC_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(avtOrdre, ColumnMetadata.named("AVT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


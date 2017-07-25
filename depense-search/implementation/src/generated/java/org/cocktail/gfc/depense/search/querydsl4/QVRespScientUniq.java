package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVRespScientUniq is a Querydsl query type for QVRespScientUniq
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVRespScientUniq extends com.querydsl.sql.RelationalPathBase<QVRespScientUniq> {

    private static final long serialVersionUID = 442048463;

    public static final QVRespScientUniq vRespScientUniq = new QVRespScientUniq("V_RESP_SCIENT_UNIQ");

    public final NumberPath<Long> apcOrdre = createNumber("apcOrdre", Long.class);

    public final NumberPath<Long> avtOrdre = createNumber("avtOrdre", Long.class);

    public QVRespScientUniq(String variable) {
        super(QVRespScientUniq.class, forVariable(variable), "GFC", "V_RESP_SCIENT_UNIQ");
        addMetadata();
    }

    public QVRespScientUniq(String variable, String schema, String table) {
        super(QVRespScientUniq.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVRespScientUniq(Path<? extends QVRespScientUniq> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_RESP_SCIENT_UNIQ");
        addMetadata();
    }

    public QVRespScientUniq(PathMetadata metadata) {
        super(QVRespScientUniq.class, metadata, "GFC", "V_RESP_SCIENT_UNIQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(apcOrdre, ColumnMetadata.named("APC_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(avtOrdre, ColumnMetadata.named("AVT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


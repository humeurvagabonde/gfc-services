package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVRespScient is a Querydsl query type for QVRespScient
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVRespScient extends com.querydsl.sql.RelationalPathBase<QVRespScient> {

    private static final long serialVersionUID = -304277202;

    public static final QVRespScient vRespScient = new QVRespScient("V_RESP_SCIENT");

    public final NumberPath<Long> apcOrdre = createNumber("apcOrdre", Long.class);

    public final NumberPath<Long> avtOrdre = createNumber("avtOrdre", Long.class);

    public final StringPath cStructure = createString("cStructure");

    public final StringPath nomUsuel = createString("nomUsuel");

    public final NumberPath<Long> tcOrdre = createNumber("tcOrdre", Long.class);

    public QVRespScient(String variable) {
        super(QVRespScient.class, forVariable(variable), "GFC", "V_RESP_SCIENT");
        addMetadata();
    }

    public QVRespScient(String variable, String schema, String table) {
        super(QVRespScient.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVRespScient(Path<? extends QVRespScient> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_RESP_SCIENT");
        addMetadata();
    }

    public QVRespScient(PathMetadata metadata) {
        super(QVRespScient.class, metadata, "GFC", "V_RESP_SCIENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(apcOrdre, ColumnMetadata.named("APC_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(avtOrdre, ColumnMetadata.named("AVT_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(cStructure, ColumnMetadata.named("C_STRUCTURE").withIndex(2).ofType(Types.VARCHAR).withSize(10));
        addMetadata(nomUsuel, ColumnMetadata.named("NOM_USUEL").withIndex(4).ofType(Types.VARCHAR).withSize(121));
        addMetadata(tcOrdre, ColumnMetadata.named("TC_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(38));
    }

}


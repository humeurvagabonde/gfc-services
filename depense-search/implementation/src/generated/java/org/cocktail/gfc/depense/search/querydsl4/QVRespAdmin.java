package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVRespAdmin is a Querydsl query type for QVRespAdmin
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVRespAdmin extends com.querydsl.sql.RelationalPathBase<QVRespAdmin> {

    private static final long serialVersionUID = -719141677;

    public static final QVRespAdmin vRespAdmin = new QVRespAdmin("V_RESP_ADMIN");

    public final NumberPath<Long> apcOrdre = createNumber("apcOrdre", Long.class);

    public final NumberPath<Long> avtOrdre = createNumber("avtOrdre", Long.class);

    public final StringPath cStructure = createString("cStructure");

    public final StringPath nomUsuel = createString("nomUsuel");

    public final NumberPath<Long> tcOrdre = createNumber("tcOrdre", Long.class);

    public QVRespAdmin(String variable) {
        super(QVRespAdmin.class, forVariable(variable), "GFC", "V_RESP_ADMIN");
        addMetadata();
    }

    public QVRespAdmin(String variable, String schema, String table) {
        super(QVRespAdmin.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVRespAdmin(Path<? extends QVRespAdmin> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_RESP_ADMIN");
        addMetadata();
    }

    public QVRespAdmin(PathMetadata metadata) {
        super(QVRespAdmin.class, metadata, "GFC", "V_RESP_ADMIN");
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


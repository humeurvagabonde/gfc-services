package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QExtourneMandat is a Querydsl query type for QExtourneMandat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QExtourneMandat extends com.querydsl.sql.RelationalPathBase<QExtourneMandat> {

    private static final long serialVersionUID = 790862185;

    public static final QExtourneMandat extourneMandat = new QExtourneMandat("EXTOURNE_MANDAT");

    public final NumberPath<Long> emId = createNumber("emId", Long.class);

    public final NumberPath<Long> manIdN = createNumber("manIdN", Long.class);

    public final NumberPath<Long> manIdN1 = createNumber("manIdN1", Long.class);

    public final com.querydsl.sql.PrimaryKey<QExtourneMandat> sysC0021928 = createPrimaryKey(emId);

    public QExtourneMandat(String variable) {
        super(QExtourneMandat.class, forVariable(variable), "GFC", "EXTOURNE_MANDAT");
        addMetadata();
    }

    public QExtourneMandat(String variable, String schema, String table) {
        super(QExtourneMandat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QExtourneMandat(Path<? extends QExtourneMandat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EXTOURNE_MANDAT");
        addMetadata();
    }

    public QExtourneMandat(PathMetadata metadata) {
        super(QExtourneMandat.class, metadata, "GFC", "EXTOURNE_MANDAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(emId, ColumnMetadata.named("EM_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(manIdN, ColumnMetadata.named("MAN_ID_N").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(manIdN1, ColumnMetadata.named("MAN_ID_N1").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


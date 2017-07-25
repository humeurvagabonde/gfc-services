package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QExtourneLiq is a Querydsl query type for QExtourneLiq
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QExtourneLiq extends com.querydsl.sql.RelationalPathBase<QExtourneLiq> {

    private static final long serialVersionUID = -1676670808;

    public static final QExtourneLiq extourneLiq = new QExtourneLiq("EXTOURNE_LIQ");

    public final NumberPath<Long> depIdN = createNumber("depIdN", Long.class);

    public final NumberPath<Long> depIdN1 = createNumber("depIdN1", Long.class);

    public final NumberPath<Long> elId = createNumber("elId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QExtourneLiq> sysC0021687 = createPrimaryKey(elId);

    public QExtourneLiq(String variable) {
        super(QExtourneLiq.class, forVariable(variable), "GFC", "EXTOURNE_LIQ");
        addMetadata();
    }

    public QExtourneLiq(String variable, String schema, String table) {
        super(QExtourneLiq.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QExtourneLiq(Path<? extends QExtourneLiq> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EXTOURNE_LIQ");
        addMetadata();
    }

    public QExtourneLiq(PathMetadata metadata) {
        super(QExtourneLiq.class, metadata, "GFC", "EXTOURNE_LIQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(depIdN, ColumnMetadata.named("DEP_ID_N").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(depIdN1, ColumnMetadata.named("DEP_ID_N1").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(elId, ColumnMetadata.named("EL_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


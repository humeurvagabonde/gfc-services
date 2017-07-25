package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXlabConvention is a Querydsl query type for QXlabConvention
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXlabConvention extends com.querydsl.sql.RelationalPathBase<QXlabConvention> {

    private static final long serialVersionUID = -595869264;

    public static final QXlabConvention xlabConvention = new QXlabConvention("XLAB_CONVENTION");

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final StringPath xconCode = createString("xconCode");

    public final NumberPath<Long> xconId = createNumber("xconId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QXlabConvention> xlabConventionPk = createPrimaryKey(xconId);

    public QXlabConvention(String variable) {
        super(QXlabConvention.class, forVariable(variable), "GFC", "XLAB_CONVENTION");
        addMetadata();
    }

    public QXlabConvention(String variable, String schema, String table) {
        super(QXlabConvention.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXlabConvention(Path<? extends QXlabConvention> path) {
        super(path.getType(), path.getMetadata(), "GFC", "XLAB_CONVENTION");
        addMetadata();
    }

    public QXlabConvention(PathMetadata metadata) {
        super(QXlabConvention.class, metadata, "GFC", "XLAB_CONVENTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(xconCode, ColumnMetadata.named("XCON_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(4).notNull());
        addMetadata(xconId, ColumnMetadata.named("XCON_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


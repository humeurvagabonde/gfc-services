package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXlabDestination is a Querydsl query type for QXlabDestination
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXlabDestination extends com.querydsl.sql.RelationalPathBase<QXlabDestination> {

    private static final long serialVersionUID = -1524062801;

    public static final QXlabDestination xlabDestination = new QXlabDestination("XLAB_DESTINATION");

    public final NumberPath<Long> tyacId = createNumber("tyacId", Long.class);

    public final StringPath xdesCode = createString("xdesCode");

    public final NumberPath<Long> xdesExer = createNumber("xdesExer", Long.class);

    public final NumberPath<Long> xdesId = createNumber("xdesId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QXlabDestination> xlabDestinationPk = createPrimaryKey(xdesId);

    public QXlabDestination(String variable) {
        super(QXlabDestination.class, forVariable(variable), "GFC", "XLAB_DESTINATION");
        addMetadata();
    }

    public QXlabDestination(String variable, String schema, String table) {
        super(QXlabDestination.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXlabDestination(Path<? extends QXlabDestination> path) {
        super(path.getType(), path.getMetadata(), "GFC", "XLAB_DESTINATION");
        addMetadata();
    }

    public QXlabDestination(PathMetadata metadata) {
        super(QXlabDestination.class, metadata, "GFC", "XLAB_DESTINATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tyacId, ColumnMetadata.named("TYAC_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(xdesCode, ColumnMetadata.named("XDES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(xdesExer, ColumnMetadata.named("XDES_EXER").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(xdesId, ColumnMetadata.named("XDES_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


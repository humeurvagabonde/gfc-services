package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmEbNatureBudget is a Querydsl query type for QAdmEbNatureBudget
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmEbNatureBudget extends com.querydsl.sql.RelationalPathBase<QAdmEbNatureBudget> {

    private static final long serialVersionUID = 769794249;

    public static final QAdmEbNatureBudget admEbNatureBudget = new QAdmEbNatureBudget("ADM_EB_NATURE_BUDGET");

    public final NumberPath<Long> onbId = createNumber("onbId", Long.class);

    public final NumberPath<Long> onbSequence = createNumber("onbSequence", Long.class);

    public final NumberPath<Long> tnbId = createNumber("tnbId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmEbNatureBudget> sysC0023916 = createPrimaryKey(onbId);

    public QAdmEbNatureBudget(String variable) {
        super(QAdmEbNatureBudget.class, forVariable(variable), "GFC", "ADM_EB_NATURE_BUDGET");
        addMetadata();
    }

    public QAdmEbNatureBudget(String variable, String schema, String table) {
        super(QAdmEbNatureBudget.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmEbNatureBudget(Path<? extends QAdmEbNatureBudget> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_EB_NATURE_BUDGET");
        addMetadata();
    }

    public QAdmEbNatureBudget(PathMetadata metadata) {
        super(QAdmEbNatureBudget.class, metadata, "GFC", "ADM_EB_NATURE_BUDGET");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(onbId, ColumnMetadata.named("ONB_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(onbSequence, ColumnMetadata.named("ONB_SEQUENCE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tnbId, ColumnMetadata.named("TNB_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCorrespTypeContactAsso is a Querydsl query type for QCorrespTypeContactAsso
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCorrespTypeContactAsso extends com.querydsl.sql.RelationalPathBase<QCorrespTypeContactAsso> {

    private static final long serialVersionUID = 86715848;

    public static final QCorrespTypeContactAsso correspTypeContactAsso = new QCorrespTypeContactAsso("CORRESP_TYPE_CONTACT_ASSO");

    public final NumberPath<Long> assId = createNumber("assId", Long.class);

    public final NumberPath<Long> tcOrdre = createNumber("tcOrdre", Long.class);

    public QCorrespTypeContactAsso(String variable) {
        super(QCorrespTypeContactAsso.class, forVariable(variable), "GFC", "CORRESP_TYPE_CONTACT_ASSO");
        addMetadata();
    }

    public QCorrespTypeContactAsso(String variable, String schema, String table) {
        super(QCorrespTypeContactAsso.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCorrespTypeContactAsso(Path<? extends QCorrespTypeContactAsso> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CORRESP_TYPE_CONTACT_ASSO");
        addMetadata();
    }

    public QCorrespTypeContactAsso(PathMetadata metadata) {
        super(QCorrespTypeContactAsso.class, metadata, "GFC", "CORRESP_TYPE_CONTACT_ASSO");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assId, ColumnMetadata.named("ASS_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tcOrdre, ColumnMetadata.named("TC_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


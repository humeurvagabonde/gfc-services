package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAttributionExercice is a Querydsl query type for QVAttributionExercice
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAttributionExercice extends com.querydsl.sql.RelationalPathBase<QVAttributionExercice> {

    private static final long serialVersionUID = 1518432251;

    public static final QVAttributionExercice vAttributionExercice = new QVAttributionExercice("V_ATTRIBUTION_EXERCICE");

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public QVAttributionExercice(String variable) {
        super(QVAttributionExercice.class, forVariable(variable), "GFC", "V_ATTRIBUTION_EXERCICE");
        addMetadata();
    }

    public QVAttributionExercice(String variable, String schema, String table) {
        super(QVAttributionExercice.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAttributionExercice(Path<? extends QVAttributionExercice> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ATTRIBUTION_EXERCICE");
        addMetadata();
    }

    public QVAttributionExercice(PathMetadata metadata) {
        super(QVAttributionExercice.class, metadata, "GFC", "V_ATTRIBUTION_EXERCICE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
    }

}


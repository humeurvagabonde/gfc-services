package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSitSituExercice is a Querydsl query type for QSitSituExercice
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSitSituExercice extends com.querydsl.sql.RelationalPathBase<QSitSituExercice> {

    private static final long serialVersionUID = 1965934419;

    public static final QSitSituExercice sitSituExercice = new QSitSituExercice("SIT_SITU_EXERCICE");

    public final NumberPath<Long> exeOrdre = createNumber("exeOrdre", Long.class);

    public final NumberPath<Long> sexeId = createNumber("sexeId", Long.class);

    public final NumberPath<Long> situId = createNumber("situId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSitSituExercice> sitSituExercicePk = createPrimaryKey(sexeId);

    public QSitSituExercice(String variable) {
        super(QSitSituExercice.class, forVariable(variable), "GFC", "SIT_SITU_EXERCICE");
        addMetadata();
    }

    public QSitSituExercice(String variable, String schema, String table) {
        super(QSitSituExercice.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSitSituExercice(Path<? extends QSitSituExercice> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SIT_SITU_EXERCICE");
        addMetadata();
    }

    public QSitSituExercice(PathMetadata metadata) {
        super(QSitSituExercice.class, metadata, "GFC", "SIT_SITU_EXERCICE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(sexeId, ColumnMetadata.named("SEXE_ID").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(situId, ColumnMetadata.named("SITU_ID").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmNatureRecExercice is a Querydsl query type for QAdmNatureRecExercice
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmNatureRecExercice extends com.querydsl.sql.RelationalPathBase<QAdmNatureRecExercice> {

    private static final long serialVersionUID = 993582257;

    public static final QAdmNatureRecExercice admNatureRecExercice = new QAdmNatureRecExercice("ADM_NATURE_REC_EXERCICE");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> idAdmNatureRecExer = createNumber("idAdmNatureRecExer", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmNatureRecExercice> admNatureRecExercicePk = createPrimaryKey(idAdmNatureRecExer);

    public QAdmNatureRecExercice(String variable) {
        super(QAdmNatureRecExercice.class, forVariable(variable), "GFC", "ADM_NATURE_REC_EXERCICE");
        addMetadata();
    }

    public QAdmNatureRecExercice(String variable, String schema, String table) {
        super(QAdmNatureRecExercice.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmNatureRecExercice(Path<? extends QAdmNatureRecExercice> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_NATURE_REC_EXERCICE");
        addMetadata();
    }

    public QAdmNatureRecExercice(PathMetadata metadata) {
        super(QAdmNatureRecExercice.class, metadata, "GFC", "ADM_NATURE_REC_EXERCICE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureRecExer, ColumnMetadata.named("ID_ADM_NATURE_REC_EXER").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


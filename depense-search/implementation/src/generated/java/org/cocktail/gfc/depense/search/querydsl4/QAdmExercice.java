package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmExercice is a Querydsl query type for QAdmExercice
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmExercice extends com.querydsl.sql.RelationalPathBase<QAdmExercice> {

    private static final long serialVersionUID = -1565813592;

    public static final QAdmExercice admExercice = new QAdmExercice("ADM_EXERCICE");

    public final DateTimePath<java.sql.Timestamp> exeCloture = createDateTime("exeCloture", java.sql.Timestamp.class);

    public final NumberPath<Integer> exeExercice = createNumber("exeExercice", Integer.class);

    public final DateTimePath<java.sql.Timestamp> exeInventaire = createDateTime("exeInventaire", java.sql.Timestamp.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final DateTimePath<java.sql.Timestamp> exeOuverture = createDateTime("exeOuverture", java.sql.Timestamp.class);

    public final StringPath exeStat = createString("exeStat");

    public final StringPath exeStatEng = createString("exeStatEng");

    public final StringPath exeStatFac = createString("exeStatFac");

    public final StringPath exeStatLiq = createString("exeStatLiq");

    public final StringPath exeStatRec = createString("exeStatRec");

    public final StringPath exeType = createString("exeType");

    public final com.querydsl.sql.PrimaryKey<QAdmExercice> admExercicePk = createPrimaryKey(exeOrdre);

    public QAdmExercice(String variable) {
        super(QAdmExercice.class, forVariable(variable), "GFC", "ADM_EXERCICE");
        addMetadata();
    }

    public QAdmExercice(String variable, String schema, String table) {
        super(QAdmExercice.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmExercice(Path<? extends QAdmExercice> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_EXERCICE");
        addMetadata();
    }

    public QAdmExercice(PathMetadata metadata) {
        super(QAdmExercice.class, metadata, "GFC", "ADM_EXERCICE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeCloture, ColumnMetadata.named("EXE_CLOTURE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(exeExercice, ColumnMetadata.named("EXE_EXERCICE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(exeInventaire, ColumnMetadata.named("EXE_INVENTAIRE").withIndex(11).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(exeOuverture, ColumnMetadata.named("EXE_OUVERTURE").withIndex(9).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(exeStat, ColumnMetadata.named("EXE_STAT").withIndex(4).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeStatEng, ColumnMetadata.named("EXE_STAT_ENG").withIndex(5).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeStatFac, ColumnMetadata.named("EXE_STAT_FAC").withIndex(6).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeStatLiq, ColumnMetadata.named("EXE_STAT_LIQ").withIndex(7).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeStatRec, ColumnMetadata.named("EXE_STAT_REC").withIndex(8).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeType, ColumnMetadata.named("EXE_TYPE").withIndex(3).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


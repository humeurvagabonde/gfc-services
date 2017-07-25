package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVapiAdmExercice is a Querydsl query type for QVapiAdmExercice
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVapiAdmExercice extends com.querydsl.sql.RelationalPathBase<QVapiAdmExercice> {

    private static final long serialVersionUID = 949181732;

    public static final QVapiAdmExercice vapiAdmExercice = new QVapiAdmExercice("VAPI_ADM_EXERCICE");

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

    public QVapiAdmExercice(String variable) {
        super(QVapiAdmExercice.class, forVariable(variable), "GFC", "VAPI_ADM_EXERCICE");
        addMetadata();
    }

    public QVapiAdmExercice(String variable, String schema, String table) {
        super(QVapiAdmExercice.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVapiAdmExercice(Path<? extends QVapiAdmExercice> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VAPI_ADM_EXERCICE");
        addMetadata();
    }

    public QVapiAdmExercice(PathMetadata metadata) {
        super(QVapiAdmExercice.class, metadata, "GFC", "VAPI_ADM_EXERCICE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeCloture, ColumnMetadata.named("EXE_CLOTURE").withIndex(1).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(exeExercice, ColumnMetadata.named("EXE_EXERCICE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(exeInventaire, ColumnMetadata.named("EXE_INVENTAIRE").withIndex(3).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(exeOuverture, ColumnMetadata.named("EXE_OUVERTURE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(exeStat, ColumnMetadata.named("EXE_STAT").withIndex(6).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeStatEng, ColumnMetadata.named("EXE_STAT_ENG").withIndex(8).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeStatFac, ColumnMetadata.named("EXE_STAT_FAC").withIndex(9).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeStatLiq, ColumnMetadata.named("EXE_STAT_LIQ").withIndex(10).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeStatRec, ColumnMetadata.named("EXE_STAT_REC").withIndex(11).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeType, ColumnMetadata.named("EXE_TYPE").withIndex(7).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


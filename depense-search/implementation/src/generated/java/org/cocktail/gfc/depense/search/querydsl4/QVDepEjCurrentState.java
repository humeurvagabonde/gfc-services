package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVDepEjCurrentState is a Querydsl query type for QVDepEjCurrentState
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVDepEjCurrentState extends com.querydsl.sql.RelationalPathBase<QVDepEjCurrentState> {

    private static final long serialVersionUID = 180956480;

    public static final QVDepEjCurrentState vDepEjCurrentState = new QVDepEjCurrentState("V_DEP_EJ_CURRENT_STATE");

    public final NumberPath<Long> currentExeOrdre = createNumber("currentExeOrdre", Long.class);

    public final NumberPath<Long> currentIdDepEjCplt = createNumber("currentIdDepEjCplt", Long.class);

    public final StringPath currentNum = createString("currentNum");

    public final NumberPath<Long> currentTyetId = createNumber("currentTyetId", Long.class);

    public final StringPath dModification = createString("dModification");

    public final StringPath dRejet = createString("dRejet");

    public final NumberPath<Long> idDepEj = createNumber("idDepEj", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final NumberPath<Long> persIdRejet = createNumber("persIdRejet", Long.class);

    public final StringPath reprise = createString("reprise");

    public QVDepEjCurrentState(String variable) {
        super(QVDepEjCurrentState.class, forVariable(variable), "GFC", "V_DEP_EJ_CURRENT_STATE");
        addMetadata();
    }

    public QVDepEjCurrentState(String variable, String schema, String table) {
        super(QVDepEjCurrentState.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVDepEjCurrentState(Path<? extends QVDepEjCurrentState> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_DEP_EJ_CURRENT_STATE");
        addMetadata();
    }

    public QVDepEjCurrentState(PathMetadata metadata) {
        super(QVDepEjCurrentState.class, metadata, "GFC", "V_DEP_EJ_CURRENT_STATE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(currentExeOrdre, ColumnMetadata.named("CURRENT_EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(currentIdDepEjCplt, ColumnMetadata.named("CURRENT_ID_DEP_EJ_CPLT").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(currentNum, ColumnMetadata.named("CURRENT_NUM").withIndex(4).ofType(Types.VARCHAR).withSize(54));
        addMetadata(currentTyetId, ColumnMetadata.named("CURRENT_TYET_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(8).ofType(Types.VARCHAR).withSize(30));
        addMetadata(dRejet, ColumnMetadata.named("D_REJET").withIndex(10).ofType(Types.VARCHAR).withSize(30));
        addMetadata(idDepEj, ColumnMetadata.named("ID_DEP_EJ").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persIdRejet, ColumnMetadata.named("PERS_ID_REJET").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(reprise, ColumnMetadata.named("REPRISE").withIndex(6).ofType(Types.VARCHAR).withSize(1));
    }

}


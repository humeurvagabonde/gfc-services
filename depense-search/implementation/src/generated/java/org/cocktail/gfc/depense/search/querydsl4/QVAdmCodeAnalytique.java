package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmCodeAnalytique is a Querydsl query type for QVAdmCodeAnalytique
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmCodeAnalytique extends com.querydsl.sql.RelationalPathBase<QVAdmCodeAnalytique> {

    private static final long serialVersionUID = -1409737994;

    public static final QVAdmCodeAnalytique vAdmCodeAnalytique = new QVAdmCodeAnalytique("V_ADM_CODE_ANALYTIQUE");

    public final StringPath canCode = createString("canCode");

    public final DateTimePath<java.sql.Timestamp> canFermeture = createDateTime("canFermeture", java.sql.Timestamp.class);

    public final NumberPath<Long> canId = createNumber("canId", Long.class);

    public final NumberPath<Long> canIdPere = createNumber("canIdPere", Long.class);

    public final StringPath canLibelle = createString("canLibelle");

    public final NumberPath<Long> canNiveau = createNumber("canNiveau", Long.class);

    public final DateTimePath<java.sql.Timestamp> canOuverture = createDateTime("canOuverture", java.sql.Timestamp.class);

    public final NumberPath<Long> canPublic = createNumber("canPublic", Long.class);

    public final NumberPath<Long> canUtilisable = createNumber("canUtilisable", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public QVAdmCodeAnalytique(String variable) {
        super(QVAdmCodeAnalytique.class, forVariable(variable), "GFC", "V_ADM_CODE_ANALYTIQUE");
        addMetadata();
    }

    public QVAdmCodeAnalytique(String variable, String schema, String table) {
        super(QVAdmCodeAnalytique.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmCodeAnalytique(Path<? extends QVAdmCodeAnalytique> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_CODE_ANALYTIQUE");
        addMetadata();
    }

    public QVAdmCodeAnalytique(PathMetadata metadata) {
        super(QVAdmCodeAnalytique.class, metadata, "GFC", "V_ADM_CODE_ANALYTIQUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(canCode, ColumnMetadata.named("CAN_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(canFermeture, ColumnMetadata.named("CAN_FERMETURE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(canId, ColumnMetadata.named("CAN_ID").withIndex(2).ofType(Types.DECIMAL).withSize(12).notNull());
        addMetadata(canIdPere, ColumnMetadata.named("CAN_ID_PERE").withIndex(8).ofType(Types.DECIMAL).withSize(12));
        addMetadata(canLibelle, ColumnMetadata.named("CAN_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(canNiveau, ColumnMetadata.named("CAN_NIVEAU").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(canOuverture, ColumnMetadata.named("CAN_OUVERTURE").withIndex(9).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(canPublic, ColumnMetadata.named("CAN_PUBLIC").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(canUtilisable, ColumnMetadata.named("CAN_UTILISABLE").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(12).ofType(Types.DECIMAL).withSize(0));
    }

}


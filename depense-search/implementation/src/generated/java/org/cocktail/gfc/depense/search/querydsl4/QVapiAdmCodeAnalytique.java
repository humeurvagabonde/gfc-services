package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVapiAdmCodeAnalytique is a Querydsl query type for QVapiAdmCodeAnalytique
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVapiAdmCodeAnalytique extends com.querydsl.sql.RelationalPathBase<QVapiAdmCodeAnalytique> {

    private static final long serialVersionUID = 2143375476;

    public static final QVapiAdmCodeAnalytique vapiAdmCodeAnalytique = new QVapiAdmCodeAnalytique("VAPI_ADM_CODE_ANALYTIQUE");

    public final StringPath canCode = createString("canCode");

    public final DateTimePath<java.sql.Timestamp> canFermeture = createDateTime("canFermeture", java.sql.Timestamp.class);

    public final NumberPath<Long> canId = createNumber("canId", Long.class);

    public final NumberPath<Long> canIdPere = createNumber("canIdPere", Long.class);

    public final StringPath canLibelle = createString("canLibelle");

    public final NumberPath<java.math.BigDecimal> canMontant = createNumber("canMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> canMontantDepassement = createNumber("canMontantDepassement", Long.class);

    public final NumberPath<Long> canNiveau = createNumber("canNiveau", Long.class);

    public final DateTimePath<java.sql.Timestamp> canOuverture = createDateTime("canOuverture", java.sql.Timestamp.class);

    public final NumberPath<Long> canPublic = createNumber("canPublic", Long.class);

    public final NumberPath<Long> canUtilisable = createNumber("canUtilisable", Long.class);

    public final StringPath grpRespCStructure = createString("grpRespCStructure");

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final StringPath tyetLibelle = createString("tyetLibelle");

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public QVapiAdmCodeAnalytique(String variable) {
        super(QVapiAdmCodeAnalytique.class, forVariable(variable), "GFC", "VAPI_ADM_CODE_ANALYTIQUE");
        addMetadata();
    }

    public QVapiAdmCodeAnalytique(String variable, String schema, String table) {
        super(QVapiAdmCodeAnalytique.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVapiAdmCodeAnalytique(Path<? extends QVapiAdmCodeAnalytique> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VAPI_ADM_CODE_ANALYTIQUE");
        addMetadata();
    }

    public QVapiAdmCodeAnalytique(PathMetadata metadata) {
        super(QVapiAdmCodeAnalytique.class, metadata, "GFC", "VAPI_ADM_CODE_ANALYTIQUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(canCode, ColumnMetadata.named("CAN_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(canFermeture, ColumnMetadata.named("CAN_FERMETURE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(canId, ColumnMetadata.named("CAN_ID").withIndex(1).ofType(Types.DECIMAL).withSize(12).notNull());
        addMetadata(canIdPere, ColumnMetadata.named("CAN_ID_PERE").withIndex(8).ofType(Types.DECIMAL).withSize(12));
        addMetadata(canLibelle, ColumnMetadata.named("CAN_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(canMontant, ColumnMetadata.named("CAN_MONTANT").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(canMontantDepassement, ColumnMetadata.named("CAN_MONTANT_DEPASSEMENT").withIndex(14).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(canNiveau, ColumnMetadata.named("CAN_NIVEAU").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(canOuverture, ColumnMetadata.named("CAN_OUVERTURE").withIndex(9).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(canPublic, ColumnMetadata.named("CAN_PUBLIC").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(canUtilisable, ColumnMetadata.named("CAN_UTILISABLE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(grpRespCStructure, ColumnMetadata.named("GRP_RESP_C_STRUCTURE").withIndex(15).ofType(Types.VARCHAR).withSize(10));
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetLibelle, ColumnMetadata.named("TYET_LIBELLE").withIndex(7).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(12).ofType(Types.DECIMAL).withSize(0));
    }

}


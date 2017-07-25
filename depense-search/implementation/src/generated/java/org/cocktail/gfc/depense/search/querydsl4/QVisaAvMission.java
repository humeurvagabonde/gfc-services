package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVisaAvMission is a Querydsl query type for QVisaAvMission
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVisaAvMission extends com.querydsl.sql.RelationalPathBase<QVisaAvMission> {

    private static final long serialVersionUID = 58740940;

    public static final QVisaAvMission visaAvMission = new QVisaAvMission("VISA_AV_MISSION");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idDverDemandeVersement = createNumber("idDverDemandeVersement", Long.class);

    public final NumberPath<Long> misOrdre = createNumber("misOrdre", Long.class);

    public final NumberPath<Long> modOrdreAvance = createNumber("modOrdreAvance", Long.class);

    public final NumberPath<Long> modOrdreRegul = createNumber("modOrdreRegul", Long.class);

    public final NumberPath<Long> ribOrdre = createNumber("ribOrdre", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final NumberPath<Long> utlOrdreDemandeur = createNumber("utlOrdreDemandeur", Long.class);

    public final NumberPath<Long> utlOrdreValideur = createNumber("utlOrdreValideur", Long.class);

    public final DateTimePath<java.sql.Timestamp> vamDateDem = createDateTime("vamDateDem", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> vamDateVisa = createDateTime("vamDateVisa", java.sql.Timestamp.class);

    public final NumberPath<Long> vamId = createNumber("vamId", Long.class);

    public final NumberPath<java.math.BigDecimal> vamMontant = createNumber("vamMontant", java.math.BigDecimal.class);

    public final StringPath vamMotifRejet = createString("vamMotifRejet");

    public final com.querydsl.sql.PrimaryKey<QVisaAvMission> visaAvMissionPk = createPrimaryKey(vamId);

    public QVisaAvMission(String variable) {
        super(QVisaAvMission.class, forVariable(variable), "GFC", "VISA_AV_MISSION");
        addMetadata();
    }

    public QVisaAvMission(String variable, String schema, String table) {
        super(QVisaAvMission.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVisaAvMission(Path<? extends QVisaAvMission> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VISA_AV_MISSION");
        addMetadata();
    }

    public QVisaAvMission(PathMetadata metadata) {
        super(QVisaAvMission.class, metadata, "GFC", "VISA_AV_MISSION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(16).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idDverDemandeVersement, ColumnMetadata.named("ID_DVER_DEMANDE_VERSEMENT").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(misOrdre, ColumnMetadata.named("MIS_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(modOrdreAvance, ColumnMetadata.named("MOD_ORDRE_AVANCE").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(modOrdreRegul, ColumnMetadata.named("MOD_ORDRE_REGUL").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ribOrdre, ColumnMetadata.named("RIB_ORDRE").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(12).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdreDemandeur, ColumnMetadata.named("UTL_ORDRE_DEMANDEUR").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdreValideur, ColumnMetadata.named("UTL_ORDRE_VALIDEUR").withIndex(14).ofType(Types.DECIMAL).withSize(0));
        addMetadata(vamDateDem, ColumnMetadata.named("VAM_DATE_DEM").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(vamDateVisa, ColumnMetadata.named("VAM_DATE_VISA").withIndex(13).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(vamId, ColumnMetadata.named("VAM_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(vamMontant, ColumnMetadata.named("VAM_MONTANT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(vamMotifRejet, ColumnMetadata.named("VAM_MOTIF_REJET").withIndex(17).ofType(Types.VARCHAR).withSize(500));
    }

}


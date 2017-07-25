package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QModePaiement is a Querydsl query type for QModePaiement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QModePaiement extends com.querydsl.sql.RelationalPathBase<QModePaiement> {

    private static final long serialVersionUID = 1222758712;

    public static final QModePaiement modePaiement = new QModePaiement("MODE_PAIEMENT");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath modCode = createString("modCode");

    public final StringPath modContrepartieGestion = createString("modContrepartieGestion");

    public final StringPath modDom = createString("modDom");

    public final StringPath modEmaAuto = createString("modEmaAuto");

    public final StringPath modLibelle = createString("modLibelle");

    public final NumberPath<Long> modOrdre = createNumber("modOrdre", Long.class);

    public final StringPath modPaiementHt = createString("modPaiementHt");

    public final StringPath modValidite = createString("modValidite");

    public final StringPath modVisaType = createString("modVisaType");

    public final StringPath pcoNumPaiement = createString("pcoNumPaiement");

    public final StringPath pcoNumTva = createString("pcoNumTva");

    public final StringPath pcoNumTvaCtp = createString("pcoNumTvaCtp");

    public final StringPath pcoNumVisa = createString("pcoNumVisa");

    public final com.querydsl.sql.PrimaryKey<QModePaiement> modePaiementPk = createPrimaryKey(modOrdre);

    public QModePaiement(String variable) {
        super(QModePaiement.class, forVariable(variable), "GFC", "MODE_PAIEMENT");
        addMetadata();
    }

    public QModePaiement(String variable, String schema, String table) {
        super(QModePaiement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QModePaiement(Path<? extends QModePaiement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "MODE_PAIEMENT");
        addMetadata();
    }

    public QModePaiement(PathMetadata metadata) {
        super(QModePaiement.class, metadata, "GFC", "MODE_PAIEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(modCode, ColumnMetadata.named("MOD_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(modContrepartieGestion, ColumnMetadata.named("MOD_CONTREPARTIE_GESTION").withIndex(11).ofType(Types.VARCHAR).withSize(20));
        addMetadata(modDom, ColumnMetadata.named("MOD_DOM").withIndex(5).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(modEmaAuto, ColumnMetadata.named("MOD_EMA_AUTO").withIndex(10).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(modLibelle, ColumnMetadata.named("MOD_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(modOrdre, ColumnMetadata.named("MOD_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(modPaiementHt, ColumnMetadata.named("MOD_PAIEMENT_HT").withIndex(14).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(modValidite, ColumnMetadata.named("MOD_VALIDITE").withIndex(6).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(modVisaType, ColumnMetadata.named("MOD_VISA_TYPE").withIndex(9).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pcoNumPaiement, ColumnMetadata.named("PCO_NUM_PAIEMENT").withIndex(7).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pcoNumTva, ColumnMetadata.named("PCO_NUM_TVA").withIndex(12).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pcoNumTvaCtp, ColumnMetadata.named("PCO_NUM_TVA_CTP").withIndex(13).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pcoNumVisa, ColumnMetadata.named("PCO_NUM_VISA").withIndex(8).ofType(Types.VARCHAR).withSize(20));
    }

}


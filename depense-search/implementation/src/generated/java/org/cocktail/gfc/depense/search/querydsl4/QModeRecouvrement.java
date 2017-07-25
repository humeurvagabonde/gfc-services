package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QModeRecouvrement is a Querydsl query type for QModeRecouvrement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QModeRecouvrement extends com.querydsl.sql.RelationalPathBase<QModeRecouvrement> {

    private static final long serialVersionUID = -1323915298;

    public static final QModeRecouvrement modeRecouvrement = new QModeRecouvrement("MODE_RECOUVREMENT");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath modCode = createString("modCode");

    public final StringPath modDom = createString("modDom");

    public final StringPath modEmaAuto = createString("modEmaAuto");

    public final StringPath modLibelle = createString("modLibelle");

    public final NumberPath<Long> modOrdre = createNumber("modOrdre", Long.class);

    public final StringPath modValidite = createString("modValidite");

    public final StringPath pcoNumPaiement = createString("pcoNumPaiement");

    public final StringPath pcoNumVisa = createString("pcoNumVisa");

    public final com.querydsl.sql.PrimaryKey<QModeRecouvrement> modeRecouvrementPk = createPrimaryKey(modOrdre);

    public QModeRecouvrement(String variable) {
        super(QModeRecouvrement.class, forVariable(variable), "GFC", "MODE_RECOUVREMENT");
        addMetadata();
    }

    public QModeRecouvrement(String variable, String schema, String table) {
        super(QModeRecouvrement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QModeRecouvrement(Path<? extends QModeRecouvrement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "MODE_RECOUVREMENT");
        addMetadata();
    }

    public QModeRecouvrement(PathMetadata metadata) {
        super(QModeRecouvrement.class, metadata, "GFC", "MODE_RECOUVREMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(modCode, ColumnMetadata.named("MOD_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(modDom, ColumnMetadata.named("MOD_DOM").withIndex(5).ofType(Types.VARCHAR).withSize(25));
        addMetadata(modEmaAuto, ColumnMetadata.named("MOD_EMA_AUTO").withIndex(9).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(modLibelle, ColumnMetadata.named("MOD_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(modOrdre, ColumnMetadata.named("MOD_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(modValidite, ColumnMetadata.named("MOD_VALIDITE").withIndex(8).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(pcoNumPaiement, ColumnMetadata.named("PCO_NUM_PAIEMENT").withIndex(6).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pcoNumVisa, ColumnMetadata.named("PCO_NUM_VISA").withIndex(7).ofType(Types.VARCHAR).withSize(20));
    }

}


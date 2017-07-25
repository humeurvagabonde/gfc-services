package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVSuiviRecetteRessAff is a Querydsl query type for QVSuiviRecetteRessAff
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVSuiviRecetteRessAff extends com.querydsl.sql.RelationalPathBase<QVSuiviRecetteRessAff> {

    private static final long serialVersionUID = 682933836;

    public static final QVSuiviRecetteRessAff vSuiviRecetteRessAff = new QVSuiviRecetteRessAff("V_SUIVI_RECETTE_RESS_AFF");

    public final NumberPath<Long> credit = createNumber("credit", Long.class);

    public final NumberPath<Long> debit = createNumber("debit", Long.class);

    public final NumberPath<Integer> exeExercice = createNumber("exeExercice", Integer.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public QVSuiviRecetteRessAff(String variable) {
        super(QVSuiviRecetteRessAff.class, forVariable(variable), "GFC", "V_SUIVI_RECETTE_RESS_AFF");
        addMetadata();
    }

    public QVSuiviRecetteRessAff(String variable, String schema, String table) {
        super(QVSuiviRecetteRessAff.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVSuiviRecetteRessAff(Path<? extends QVSuiviRecetteRessAff> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_SUIVI_RECETTE_RESS_AFF");
        addMetadata();
    }

    public QVSuiviRecetteRessAff(PathMetadata metadata) {
        super(QVSuiviRecetteRessAff.class, metadata, "GFC", "V_SUIVI_RECETTE_RESS_AFF");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(credit, ColumnMetadata.named("CREDIT").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(debit, ColumnMetadata.named("DEBIT").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeExercice, ColumnMetadata.named("EXE_EXERCICE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


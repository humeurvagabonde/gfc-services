package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVSitOpeTrancheMontantDep is a Querydsl query type for QVSitOpeTrancheMontantDep
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVSitOpeTrancheMontantDep extends com.querydsl.sql.RelationalPathBase<QVSitOpeTrancheMontantDep> {

    private static final long serialVersionUID = 186111283;

    public static final QVSitOpeTrancheMontantDep vSitOpeTrancheMontantDep = new QVSitOpeTrancheMontantDep("V_SIT_OPE_TRANCHE_MONTANT_DEP");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idBudEnveloppe = createNumber("idBudEnveloppe", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> idOpeTrancheBud = createNumber("idOpeTrancheBud", Long.class);

    public final NumberPath<Long> montantTrancheAe = createNumber("montantTrancheAe", Long.class);

    public final NumberPath<Long> montantTrancheCp = createNumber("montantTrancheCp", Long.class);

    public QVSitOpeTrancheMontantDep(String variable) {
        super(QVSitOpeTrancheMontantDep.class, forVariable(variable), "GFC", "V_SIT_OPE_TRANCHE_MONTANT_DEP");
        addMetadata();
    }

    public QVSitOpeTrancheMontantDep(String variable, String schema, String table) {
        super(QVSitOpeTrancheMontantDep.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVSitOpeTrancheMontantDep(Path<? extends QVSitOpeTrancheMontantDep> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_SIT_OPE_TRANCHE_MONTANT_DEP");
        addMetadata();
    }

    public QVSitOpeTrancheMontantDep(PathMetadata metadata) {
        super(QVSitOpeTrancheMontantDep.class, metadata, "GFC", "V_SIT_OPE_TRANCHE_MONTANT_DEP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(6).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idBudEnveloppe, ColumnMetadata.named("ID_BUD_ENVELOPPE").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idOpeTrancheBud, ColumnMetadata.named("ID_OPE_TRANCHE_BUD").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(montantTrancheAe, ColumnMetadata.named("MONTANT_TRANCHE_AE").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(montantTrancheCp, ColumnMetadata.named("MONTANT_TRANCHE_CP").withIndex(8).ofType(Types.DECIMAL).withSize(0));
    }

}


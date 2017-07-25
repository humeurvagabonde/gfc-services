package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudPrevOpeTraDepCp is a Querydsl query type for QBudPrevOpeTraDepCp
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudPrevOpeTraDepCp extends com.querydsl.sql.RelationalPathBase<QBudPrevOpeTraDepCp> {

    private static final long serialVersionUID = -652677597;

    public static final QBudPrevOpeTraDepCp budPrevOpeTraDepCp = new QBudPrevOpeTraDepCp("BUD_PREV_OPE_TRA_DEP_CP");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> idBudEnveloppe = createNumber("idBudEnveloppe", Long.class);

    public final NumberPath<Long> idBudPrevOpeTraDepCp = createNumber("idBudPrevOpeTraDepCp", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> idOpeTrancheBudDepCp = createNumber("idOpeTrancheBudDepCp", Long.class);

    public final NumberPath<java.math.BigDecimal> montantChargesEmplois = createNumber("montantChargesEmplois", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantCp = createNumber("montantCp", java.math.BigDecimal.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBudPrevOpeTraDepCp> budPrevOpeTraDepCpPk = createPrimaryKey(idBudPrevOpeTraDepCp);

    public QBudPrevOpeTraDepCp(String variable) {
        super(QBudPrevOpeTraDepCp.class, forVariable(variable), "GFC", "BUD_PREV_OPE_TRA_DEP_CP");
        addMetadata();
    }

    public QBudPrevOpeTraDepCp(String variable, String schema, String table) {
        super(QBudPrevOpeTraDepCp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudPrevOpeTraDepCp(Path<? extends QBudPrevOpeTraDepCp> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_PREV_OPE_TRA_DEP_CP");
        addMetadata();
    }

    public QBudPrevOpeTraDepCp(PathMetadata metadata) {
        super(QBudPrevOpeTraDepCp.class, metadata, "GFC", "BUD_PREV_OPE_TRA_DEP_CP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(11).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(13).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(7).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudEnveloppe, ColumnMetadata.named("ID_BUD_ENVELOPPE").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudPrevOpeTraDepCp, ColumnMetadata.named("ID_BUD_PREV_OPE_TRA_DEP_CP").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(9).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeTrancheBudDepCp, ColumnMetadata.named("ID_OPE_TRANCHE_BUD_DEP_CP").withIndex(8).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(montantChargesEmplois, ColumnMetadata.named("MONTANT_CHARGES_EMPLOIS").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(montantCp, ColumnMetadata.named("MONTANT_CP").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(10).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(12).ofType(Types.DECIMAL).withSize(38));
    }

}


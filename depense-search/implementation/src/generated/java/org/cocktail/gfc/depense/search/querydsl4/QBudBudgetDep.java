package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudBudgetDep is a Querydsl query type for QBudBudgetDep
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudBudgetDep extends com.querydsl.sql.RelationalPathBase<QBudBudgetDep> {

    private static final long serialVersionUID = -887625757;

    public static final QBudBudgetDep budBudgetDep = new QBudBudgetDep("BUD_BUDGET_DEP");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> idBudBudgetDep = createNumber("idBudBudgetDep", Long.class);

    public final NumberPath<Long> idBudEnveloppe = createNumber("idBudEnveloppe", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<java.math.BigDecimal> montantAe = createNumber("montantAe", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantChargesEmplois = createNumber("montantChargesEmplois", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantCp = createNumber("montantCp", java.math.BigDecimal.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBudBudgetDep> budBudgetDepPk = createPrimaryKey(idBudBudgetDep);

    public QBudBudgetDep(String variable) {
        super(QBudBudgetDep.class, forVariable(variable), "GFC", "BUD_BUDGET_DEP");
        addMetadata();
    }

    public QBudBudgetDep(String variable, String schema, String table) {
        super(QBudBudgetDep.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudBudgetDep(Path<? extends QBudBudgetDep> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_BUDGET_DEP");
        addMetadata();
    }

    public QBudBudgetDep(PathMetadata metadata) {
        super(QBudBudgetDep.class, metadata, "GFC", "BUD_BUDGET_DEP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(11).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(13).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(8).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(7).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudBudgetDep, ColumnMetadata.named("ID_BUD_BUDGET_DEP").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudEnveloppe, ColumnMetadata.named("ID_BUD_ENVELOPPE").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(9).ofType(Types.DECIMAL).withSize(38));
        addMetadata(montantAe, ColumnMetadata.named("MONTANT_AE").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantChargesEmplois, ColumnMetadata.named("MONTANT_CHARGES_EMPLOIS").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(montantCp, ColumnMetadata.named("MONTANT_CP").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(10).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(12).ofType(Types.DECIMAL).withSize(38));
    }

}


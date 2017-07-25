package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOpeTrancheBudDepCp is a Querydsl query type for QOpeTrancheBudDepCp
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpeTrancheBudDepCp extends com.querydsl.sql.RelationalPathBase<QOpeTrancheBudDepCp> {

    private static final long serialVersionUID = -400238682;

    public static final QOpeTrancheBudDepCp opeTrancheBudDepCp = new QOpeTrancheBudDepCp("OPE_TRANCHE_BUD_DEP_CP");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final NumberPath<Integer> donneesImport = createNumber("donneesImport", Integer.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idBudEnveloppe = createNumber("idBudEnveloppe", Long.class);

    public final NumberPath<Long> idOpeTrancheBud = createNumber("idOpeTrancheBud", Long.class);

    public final NumberPath<Long> idOpeTrancheBudDepCp = createNumber("idOpeTrancheBudDepCp", Long.class);

    public final NumberPath<java.math.BigDecimal> montantChargesEmplois = createNumber("montantChargesEmplois", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantCp = createNumber("montantCp", java.math.BigDecimal.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final com.querydsl.sql.PrimaryKey<QOpeTrancheBudDepCp> opeTrancheBudDepCpPk = createPrimaryKey(idOpeTrancheBudDepCp);

    public QOpeTrancheBudDepCp(String variable) {
        super(QOpeTrancheBudDepCp.class, forVariable(variable), "GFC", "OPE_TRANCHE_BUD_DEP_CP");
        addMetadata();
    }

    public QOpeTrancheBudDepCp(String variable, String schema, String table) {
        super(QOpeTrancheBudDepCp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpeTrancheBudDepCp(Path<? extends QOpeTrancheBudDepCp> path) {
        super(path.getType(), path.getMetadata(), "GFC", "OPE_TRANCHE_BUD_DEP_CP");
        addMetadata();
    }

    public QOpeTrancheBudDepCp(PathMetadata metadata) {
        super(QOpeTrancheBudDepCp.class, metadata, "GFC", "OPE_TRANCHE_BUD_DEP_CP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(9).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(11).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(donneesImport, ColumnMetadata.named("DONNEES_IMPORT").withIndex(12).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(7).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudEnveloppe, ColumnMetadata.named("ID_BUD_ENVELOPPE").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeTrancheBud, ColumnMetadata.named("ID_OPE_TRANCHE_BUD").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeTrancheBudDepCp, ColumnMetadata.named("ID_OPE_TRANCHE_BUD_DEP_CP").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(montantChargesEmplois, ColumnMetadata.named("MONTANT_CHARGES_EMPLOIS").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(montantCp, ColumnMetadata.named("MONTANT_CP").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(8).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(10).ofType(Types.DECIMAL).withSize(38));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudPrevOpeTraDepAe is a Querydsl query type for QBudPrevOpeTraDepAe
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudPrevOpeTraDepAe extends com.querydsl.sql.RelationalPathBase<QBudPrevOpeTraDepAe> {

    private static final long serialVersionUID = -652677670;

    public static final QBudPrevOpeTraDepAe budPrevOpeTraDepAe = new QBudPrevOpeTraDepAe("BUD_PREV_OPE_TRA_DEP_AE");

    public final StringPath commentaire = createString("commentaire");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> idBudEnveloppe = createNumber("idBudEnveloppe", Long.class);

    public final NumberPath<Long> idBudPrevOpeTraDepAe = createNumber("idBudPrevOpeTraDepAe", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> idOpeTrancheBudDepAe = createNumber("idOpeTrancheBudDepAe", Long.class);

    public final NumberPath<java.math.BigDecimal> montantAe = createNumber("montantAe", java.math.BigDecimal.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBudPrevOpeTraDepAe> budPrevOpeTraDepAePk = createPrimaryKey(idBudPrevOpeTraDepAe);

    public QBudPrevOpeTraDepAe(String variable) {
        super(QBudPrevOpeTraDepAe.class, forVariable(variable), "GFC", "BUD_PREV_OPE_TRA_DEP_AE");
        addMetadata();
    }

    public QBudPrevOpeTraDepAe(String variable, String schema, String table) {
        super(QBudPrevOpeTraDepAe.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudPrevOpeTraDepAe(Path<? extends QBudPrevOpeTraDepAe> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_PREV_OPE_TRA_DEP_AE");
        addMetadata();
    }

    public QBudPrevOpeTraDepAe(PathMetadata metadata) {
        super(QBudPrevOpeTraDepAe.class, metadata, "GFC", "BUD_PREV_OPE_TRA_DEP_AE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(10).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(12).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(14).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(7).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudEnveloppe, ColumnMetadata.named("ID_BUD_ENVELOPPE").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudPrevOpeTraDepAe, ColumnMetadata.named("ID_BUD_PREV_OPE_TRA_DEP_AE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(9).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeTrancheBudDepAe, ColumnMetadata.named("ID_OPE_TRANCHE_BUD_DEP_AE").withIndex(8).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(montantAe, ColumnMetadata.named("MONTANT_AE").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(11).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(13).ofType(Types.DECIMAL).withSize(38));
    }

}


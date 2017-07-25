package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVihmBudGestionConsultDep is a Querydsl query type for QVihmBudGestionConsultDep
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVihmBudGestionConsultDep extends com.querydsl.sql.RelationalPathBase<QVihmBudGestionConsultDep> {

    private static final long serialVersionUID = -2080348227;

    public static final QVihmBudGestionConsultDep vihmBudGestionConsultDep = new QVihmBudGestionConsultDep("VIHM_BUD_GESTION_CONSULT_DEP");

    public final NumberPath<java.math.BigDecimal> apresVoteAe = createNumber("apresVoteAe", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> apresVoteCp = createNumber("apresVoteCp", java.math.BigDecimal.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> idBudEnveloppe = createNumber("idBudEnveloppe", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<java.math.BigDecimal> montantChargesEmplois = createNumber("montantChargesEmplois", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> saisieAe = createNumber("saisieAe", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> saisieCp = createNumber("saisieCp", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> voteAe = createNumber("voteAe", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> voteCp = createNumber("voteCp", java.math.BigDecimal.class);

    public QVihmBudGestionConsultDep(String variable) {
        super(QVihmBudGestionConsultDep.class, forVariable(variable), "GFC", "VIHM_BUD_GESTION_CONSULT_DEP");
        addMetadata();
    }

    public QVihmBudGestionConsultDep(String variable, String schema, String table) {
        super(QVihmBudGestionConsultDep.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVihmBudGestionConsultDep(Path<? extends QVihmBudGestionConsultDep> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VIHM_BUD_GESTION_CONSULT_DEP");
        addMetadata();
    }

    public QVihmBudGestionConsultDep(PathMetadata metadata) {
        super(QVihmBudGestionConsultDep.class, metadata, "GFC", "VIHM_BUD_GESTION_CONSULT_DEP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(apresVoteAe, ColumnMetadata.named("APRES_VOTE_AE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(apresVoteCp, ColumnMetadata.named("APRES_VOTE_CP").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idBudEnveloppe, ColumnMetadata.named("ID_BUD_ENVELOPPE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(montantChargesEmplois, ColumnMetadata.named("MONTANT_CHARGES_EMPLOIS").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(saisieAe, ColumnMetadata.named("SAISIE_AE").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(saisieCp, ColumnMetadata.named("SAISIE_CP").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(voteAe, ColumnMetadata.named("VOTE_AE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(voteCp, ColumnMetadata.named("VOTE_CP").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2));
    }

}


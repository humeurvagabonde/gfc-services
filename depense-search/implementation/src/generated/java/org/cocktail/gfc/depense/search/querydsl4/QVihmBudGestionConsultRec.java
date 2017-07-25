package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVihmBudGestionConsultRec is a Querydsl query type for QVihmBudGestionConsultRec
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVihmBudGestionConsultRec extends com.querydsl.sql.RelationalPathBase<QVihmBudGestionConsultRec> {

    private static final long serialVersionUID = -2080334786;

    public static final QVihmBudGestionConsultRec vihmBudGestionConsultRec = new QVihmBudGestionConsultRec("VIHM_BUD_GESTION_CONSULT_REC");

    public final NumberPath<java.math.BigDecimal> apresVoteRec = createNumber("apresVoteRec", java.math.BigDecimal.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> idAdmOrigineRecette = createNumber("idAdmOrigineRecette", Long.class);

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<java.math.BigDecimal> montantTitre = createNumber("montantTitre", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> saisieRec = createNumber("saisieRec", java.math.BigDecimal.class);

    public final StringPath section = createString("section");

    public final NumberPath<java.math.BigDecimal> voteRec = createNumber("voteRec", java.math.BigDecimal.class);

    public QVihmBudGestionConsultRec(String variable) {
        super(QVihmBudGestionConsultRec.class, forVariable(variable), "GFC", "VIHM_BUD_GESTION_CONSULT_REC");
        addMetadata();
    }

    public QVihmBudGestionConsultRec(String variable, String schema, String table) {
        super(QVihmBudGestionConsultRec.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVihmBudGestionConsultRec(Path<? extends QVihmBudGestionConsultRec> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VIHM_BUD_GESTION_CONSULT_REC");
        addMetadata();
    }

    public QVihmBudGestionConsultRec(PathMetadata metadata) {
        super(QVihmBudGestionConsultRec.class, metadata, "GFC", "VIHM_BUD_GESTION_CONSULT_REC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(apresVoteRec, ColumnMetadata.named("APRES_VOTE_REC").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmOrigineRecette, ColumnMetadata.named("ID_ADM_ORIGINE_RECETTE").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(montantTitre, ColumnMetadata.named("MONTANT_TITRE").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(saisieRec, ColumnMetadata.named("SAISIE_REC").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(section, ColumnMetadata.named("SECTION").withIndex(3).ofType(Types.VARCHAR).withSize(1));
        addMetadata(voteRec, ColumnMetadata.named("VOTE_REC").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2));
    }

}


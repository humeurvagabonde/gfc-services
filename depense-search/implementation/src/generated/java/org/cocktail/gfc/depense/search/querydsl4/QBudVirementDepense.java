package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudVirementDepense is a Querydsl query type for QBudVirementDepense
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudVirementDepense extends com.querydsl.sql.RelationalPathBase<QBudVirementDepense> {

    private static final long serialVersionUID = 1264585919;

    public static final QBudVirementDepense budVirementDepense = new QBudVirementDepense("BUD_VIREMENT_DEPENSE");

    public final StringPath commentaire = createString("commentaire");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDestinationDepArrivee = createNumber("idAdmDestinationDepArrivee", Long.class);

    public final NumberPath<Long> idAdmDestinationDepDepart = createNumber("idAdmDestinationDepDepart", Long.class);

    public final NumberPath<Long> idAdmEbArrivee = createNumber("idAdmEbArrivee", Long.class);

    public final NumberPath<Long> idAdmEbDepart = createNumber("idAdmEbDepart", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> idBudTypeVirement = createNumber("idBudTypeVirement", Long.class);

    public final NumberPath<Long> idBudVirementDepense = createNumber("idBudVirementDepense", Long.class);

    public final NumberPath<Long> idOpeOperationArrivee = createNumber("idOpeOperationArrivee", Long.class);

    public final NumberPath<Long> idOpeOperationDepart = createNumber("idOpeOperationDepart", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<java.math.BigDecimal> montantAe = createNumber("montantAe", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantCp = createNumber("montantCp", java.math.BigDecimal.class);

    public final StringPath numero = createString("numero");

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> virIndex = createNumber("virIndex", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBudVirementDepense> budVirementDepensePk = createPrimaryKey(idBudVirementDepense);

    public QBudVirementDepense(String variable) {
        super(QBudVirementDepense.class, forVariable(variable), "GFC", "BUD_VIREMENT_DEPENSE");
        addMetadata();
    }

    public QBudVirementDepense(String variable, String schema, String table) {
        super(QBudVirementDepense.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudVirementDepense(Path<? extends QBudVirementDepense> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_VIREMENT_DEPENSE");
        addMetadata();
    }

    public QBudVirementDepense(PathMetadata metadata) {
        super(QBudVirementDepense.class, metadata, "GFC", "BUD_VIREMENT_DEPENSE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(15).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(16).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDestinationDepArrivee, ColumnMetadata.named("ID_ADM_DESTINATION_DEP_ARRIVEE").withIndex(9).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmDestinationDepDepart, ColumnMetadata.named("ID_ADM_DESTINATION_DEP_DEPART").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEbArrivee, ColumnMetadata.named("ID_ADM_EB_ARRIVEE").withIndex(8).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEbDepart, ColumnMetadata.named("ID_ADM_EB_DEPART").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(17).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudTypeVirement, ColumnMetadata.named("ID_BUD_TYPE_VIREMENT").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudVirementDepense, ColumnMetadata.named("ID_BUD_VIREMENT_DEPENSE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperationArrivee, ColumnMetadata.named("ID_OPE_OPERATION_ARRIVEE").withIndex(10).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeOperationDepart, ColumnMetadata.named("ID_OPE_OPERATION_DEPART").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(12).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(montantAe, ColumnMetadata.named("MONTANT_AE").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantCp, ColumnMetadata.named("MONTANT_CP").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(numero, ColumnMetadata.named("NUMERO").withIndex(18).ofType(Types.VARCHAR).withSize(20));
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(11).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(virIndex, ColumnMetadata.named("VIR_INDEX").withIndex(19).ofType(Types.DECIMAL).withSize(0));
    }

}


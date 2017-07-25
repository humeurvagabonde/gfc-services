package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudVirementRecette is a Querydsl query type for QBudVirementRecette
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudVirementRecette extends com.querydsl.sql.RelationalPathBase<QBudVirementRecette> {

    private static final long serialVersionUID = 792735589;

    public static final QBudVirementRecette budVirementRecette = new QBudVirementRecette("BUD_VIREMENT_RECETTE");

    public final StringPath commentaire = createString("commentaire");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEbArrivee = createNumber("idAdmEbArrivee", Long.class);

    public final NumberPath<Long> idAdmEbDepart = createNumber("idAdmEbDepart", Long.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> idAdmOrigineRecArrivee = createNumber("idAdmOrigineRecArrivee", Long.class);

    public final NumberPath<Long> idAdmOrigineRecDepart = createNumber("idAdmOrigineRecDepart", Long.class);

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> idBudTypeVirement = createNumber("idBudTypeVirement", Long.class);

    public final NumberPath<Long> idBudVirementRecette = createNumber("idBudVirementRecette", Long.class);

    public final NumberPath<Long> idOpeOperationArrivee = createNumber("idOpeOperationArrivee", Long.class);

    public final NumberPath<Long> idOpeOperationDepart = createNumber("idOpeOperationDepart", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<java.math.BigDecimal> montantRec = createNumber("montantRec", java.math.BigDecimal.class);

    public final StringPath numero = createString("numero");

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final StringPath section = createString("section");

    public final NumberPath<Long> virIndex = createNumber("virIndex", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBudVirementRecette> budVirementRecettePk = createPrimaryKey(idBudVirementRecette);

    public QBudVirementRecette(String variable) {
        super(QBudVirementRecette.class, forVariable(variable), "GFC", "BUD_VIREMENT_RECETTE");
        addMetadata();
    }

    public QBudVirementRecette(String variable, String schema, String table) {
        super(QBudVirementRecette.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudVirementRecette(Path<? extends QBudVirementRecette> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_VIREMENT_RECETTE");
        addMetadata();
    }

    public QBudVirementRecette(PathMetadata metadata) {
        super(QBudVirementRecette.class, metadata, "GFC", "BUD_VIREMENT_RECETTE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(16).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(17).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmEbArrivee, ColumnMetadata.named("ID_ADM_EB_ARRIVEE").withIndex(10).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEbDepart, ColumnMetadata.named("ID_ADM_EB_DEPART").withIndex(7).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmOrigineRecArrivee, ColumnMetadata.named("ID_ADM_ORIGINE_REC_ARRIVEE").withIndex(11).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmOrigineRecDepart, ColumnMetadata.named("ID_ADM_ORIGINE_REC_DEPART").withIndex(8).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudTypeVirement, ColumnMetadata.named("ID_BUD_TYPE_VIREMENT").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudVirementRecette, ColumnMetadata.named("ID_BUD_VIREMENT_RECETTE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperationArrivee, ColumnMetadata.named("ID_OPE_OPERATION_ARRIVEE").withIndex(12).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeOperationDepart, ColumnMetadata.named("ID_OPE_OPERATION_DEPART").withIndex(9).ofType(Types.DECIMAL).withSize(38));
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(14).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(montantRec, ColumnMetadata.named("MONTANT_REC").withIndex(15).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(numero, ColumnMetadata.named("NUMERO").withIndex(18).ofType(Types.VARCHAR).withSize(20));
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(13).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(section, ColumnMetadata.named("SECTION").withIndex(6).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(virIndex, ColumnMetadata.named("VIR_INDEX").withIndex(19).ofType(Types.DECIMAL).withSize(0));
    }

}


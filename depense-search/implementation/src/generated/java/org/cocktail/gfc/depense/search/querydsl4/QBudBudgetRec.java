package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudBudgetRec is a Querydsl query type for QBudBudgetRec
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudBudgetRec extends com.querydsl.sql.RelationalPathBase<QBudBudgetRec> {

    private static final long serialVersionUID = -887612316;

    public static final QBudBudgetRec budBudgetRec = new QBudBudgetRec("BUD_BUDGET_REC");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> idAdmOrigineRecette = createNumber("idAdmOrigineRecette", Long.class);

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> idBudBudgetRec = createNumber("idBudBudgetRec", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<java.math.BigDecimal> montantRec = createNumber("montantRec", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTitre = createNumber("montantTitre", java.math.BigDecimal.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final StringPath section = createString("section");

    public final com.querydsl.sql.PrimaryKey<QBudBudgetRec> budBudgetRecPk = createPrimaryKey(idBudBudgetRec);

    public QBudBudgetRec(String variable) {
        super(QBudBudgetRec.class, forVariable(variable), "GFC", "BUD_BUDGET_REC");
        addMetadata();
    }

    public QBudBudgetRec(String variable, String schema, String table) {
        super(QBudBudgetRec.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudBudgetRec(Path<? extends QBudBudgetRec> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_BUDGET_REC");
        addMetadata();
    }

    public QBudBudgetRec(PathMetadata metadata) {
        super(QBudBudgetRec.class, metadata, "GFC", "BUD_BUDGET_REC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(11).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(13).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(7).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmOrigineRecette, ColumnMetadata.named("ID_ADM_ORIGINE_RECETTE").withIndex(8).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudBudgetRec, ColumnMetadata.named("ID_BUD_BUDGET_REC").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(9).ofType(Types.DECIMAL).withSize(38));
        addMetadata(montantRec, ColumnMetadata.named("MONTANT_REC").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTitre, ColumnMetadata.named("MONTANT_TITRE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(10).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(12).ofType(Types.DECIMAL).withSize(38));
        addMetadata(section, ColumnMetadata.named("SECTION").withIndex(6).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOpeFraisGestion is a Querydsl query type for QOpeFraisGestion
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpeFraisGestion extends com.querydsl.sql.RelationalPathBase<QOpeFraisGestion> {

    private static final long serialVersionUID = -1896213084;

    public static final QOpeFraisGestion opeFraisGestion = new QOpeFraisGestion("OPE_FRAIS_GESTION");

    public final NumberPath<java.math.BigDecimal> chargesNonBudgetaires = createNumber("chargesNonBudgetaires", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> coutsIndirectsNonImputes = createNumber("coutsIndirectsNonImputes", java.math.BigDecimal.class);

    public final NumberPath<Long> idOpeFraisGestion = createNumber("idOpeFraisGestion", Long.class);

    public final NumberPath<Long> idOpeRepartPartenaire = createNumber("idOpeRepartPartenaire", Long.class);

    public final NumberPath<java.math.BigDecimal> montant = createNumber("montant", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantPourcentageTranche = createNumber("montantPourcentageTranche", java.math.BigDecimal.class);

    public final com.querydsl.sql.PrimaryKey<QOpeFraisGestion> idOpeFraisGestionPk = createPrimaryKey(idOpeFraisGestion);

    public QOpeFraisGestion(String variable) {
        super(QOpeFraisGestion.class, forVariable(variable), "GFC", "OPE_FRAIS_GESTION");
        addMetadata();
    }

    public QOpeFraisGestion(String variable, String schema, String table) {
        super(QOpeFraisGestion.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpeFraisGestion(Path<? extends QOpeFraisGestion> path) {
        super(path.getType(), path.getMetadata(), "GFC", "OPE_FRAIS_GESTION");
        addMetadata();
    }

    public QOpeFraisGestion(PathMetadata metadata) {
        super(QOpeFraisGestion.class, metadata, "GFC", "OPE_FRAIS_GESTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(chargesNonBudgetaires, ColumnMetadata.named("CHARGES_NON_BUDGETAIRES").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(coutsIndirectsNonImputes, ColumnMetadata.named("COUTS_INDIRECTS_NON_IMPUTES").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(idOpeFraisGestion, ColumnMetadata.named("ID_OPE_FRAIS_GESTION").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeRepartPartenaire, ColumnMetadata.named("ID_OPE_REPART_PARTENAIRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(montant, ColumnMetadata.named("MONTANT").withIndex(3).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantPourcentageTranche, ColumnMetadata.named("MONTANT_POURCENTAGE_TRANCHE").withIndex(4).ofType(Types.DECIMAL).withSize(5).withDigits(2));
    }

}


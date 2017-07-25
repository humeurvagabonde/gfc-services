package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QImmFinancement is a Querydsl query type for QImmFinancement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QImmFinancement extends com.querydsl.sql.RelationalPathBase<QImmFinancement> {

    private static final long serialVersionUID = 1600496377;

    public static final QImmFinancement immFinancement = new QImmFinancement("IMM_FINANCEMENT");

    public final NumberPath<Integer> exeOrdreCompteOrigine = createNumber("exeOrdreCompteOrigine", Integer.class);

    public final NumberPath<Long> idImmFinancement = createNumber("idImmFinancement", Long.class);

    public final NumberPath<Long> idInventaireComptable = createNumber("idInventaireComptable", Long.class);

    public final NumberPath<Long> idTitreFinancement = createNumber("idTitreFinancement", Long.class);

    public final StringPath libelleOrigineFinancement = createString("libelleOrigineFinancement");

    public final NumberPath<java.math.BigDecimal> montantBudgetaireFinancement = createNumber("montantBudgetaireFinancement", java.math.BigDecimal.class);

    public final StringPath pcoNumCompteOrigine = createString("pcoNumCompteOrigine");

    public final StringPath titreFinancementHorsSi = createString("titreFinancementHorsSi");

    public final com.querydsl.sql.PrimaryKey<QImmFinancement> immFinancementPk = createPrimaryKey(idImmFinancement);

    public QImmFinancement(String variable) {
        super(QImmFinancement.class, forVariable(variable), "GFC", "IMM_FINANCEMENT");
        addMetadata();
    }

    public QImmFinancement(String variable, String schema, String table) {
        super(QImmFinancement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QImmFinancement(Path<? extends QImmFinancement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "IMM_FINANCEMENT");
        addMetadata();
    }

    public QImmFinancement(PathMetadata metadata) {
        super(QImmFinancement.class, metadata, "GFC", "IMM_FINANCEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdreCompteOrigine, ColumnMetadata.named("EXE_ORDRE_COMPTE_ORIGINE").withIndex(3).ofType(Types.DECIMAL).withSize(4));
        addMetadata(idImmFinancement, ColumnMetadata.named("ID_IMM_FINANCEMENT").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idInventaireComptable, ColumnMetadata.named("ID_INVENTAIRE_COMPTABLE").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idTitreFinancement, ColumnMetadata.named("ID_TITRE_FINANCEMENT").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(libelleOrigineFinancement, ColumnMetadata.named("LIBELLE_ORIGINE_FINANCEMENT").withIndex(5).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(montantBudgetaireFinancement, ColumnMetadata.named("MONTANT_BUDGETAIRE_FINANCEMENT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(pcoNumCompteOrigine, ColumnMetadata.named("PCO_NUM_COMPTE_ORIGINE").withIndex(4).ofType(Types.VARCHAR).withSize(20));
        addMetadata(titreFinancementHorsSi, ColumnMetadata.named("TITRE_FINANCEMENT_HORS_SI").withIndex(7).ofType(Types.VARCHAR).withSize(100));
    }

}


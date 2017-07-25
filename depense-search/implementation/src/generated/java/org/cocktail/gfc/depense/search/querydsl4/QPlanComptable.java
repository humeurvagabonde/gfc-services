package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPlanComptable is a Querydsl query type for QPlanComptable
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPlanComptable extends com.querydsl.sql.RelationalPathBase<QPlanComptable> {

    private static final long serialVersionUID = 1833504108;

    public static final QPlanComptable planComptable = new QPlanComptable("PLAN_COMPTABLE");

    public final StringPath pcoBudgetaire = createString("pcoBudgetaire");

    public final StringPath pcoCompteBe = createString("pcoCompteBe");

    public final StringPath pcoEmargement = createString("pcoEmargement");

    public final StringPath pcoJBe = createString("pcoJBe");

    public final StringPath pcoJExercice = createString("pcoJExercice");

    public final StringPath pcoJFinExercice = createString("pcoJFinExercice");

    public final StringPath pcoLibelle = createString("pcoLibelle");

    public final StringPath pcoNature = createString("pcoNature");

    public final NumberPath<Long> pcoNiveau = createNumber("pcoNiveau", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final StringPath pcoSensEmargement = createString("pcoSensEmargement");

    public final StringPath pcoSensSolde = createString("pcoSensSolde");

    public final StringPath pcoSpecificite = createString("pcoSpecificite");

    public final StringPath pcoSuiviOpeCompteTiers = createString("pcoSuiviOpeCompteTiers");

    public final StringPath pcoValidite = createString("pcoValidite");

    public QPlanComptable(String variable) {
        super(QPlanComptable.class, forVariable(variable), "GFC", "PLAN_COMPTABLE");
        addMetadata();
    }

    public QPlanComptable(String variable, String schema, String table) {
        super(QPlanComptable.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPlanComptable(Path<? extends QPlanComptable> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PLAN_COMPTABLE");
        addMetadata();
    }

    public QPlanComptable(PathMetadata metadata) {
        super(QPlanComptable.class, metadata, "GFC", "PLAN_COMPTABLE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pcoBudgetaire, ColumnMetadata.named("PCO_BUDGETAIRE").withIndex(3).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(pcoCompteBe, ColumnMetadata.named("PCO_COMPTE_BE").withIndex(12).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pcoEmargement, ColumnMetadata.named("PCO_EMARGEMENT").withIndex(4).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(pcoJBe, ColumnMetadata.named("PCO_J_BE").withIndex(11).ofType(Types.VARCHAR).withSize(1));
        addMetadata(pcoJExercice, ColumnMetadata.named("PCO_J_EXERCICE").withIndex(9).ofType(Types.VARCHAR).withSize(1));
        addMetadata(pcoJFinExercice, ColumnMetadata.named("PCO_J_FIN_EXERCICE").withIndex(10).ofType(Types.VARCHAR).withSize(1));
        addMetadata(pcoLibelle, ColumnMetadata.named("PCO_LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(pcoNature, ColumnMetadata.named("PCO_NATURE").withIndex(6).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(pcoNiveau, ColumnMetadata.named("PCO_NIVEAU").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(1).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(pcoSensEmargement, ColumnMetadata.named("PCO_SENS_EMARGEMENT").withIndex(7).ofType(Types.VARCHAR).withSize(1));
        addMetadata(pcoSensSolde, ColumnMetadata.named("PCO_SENS_SOLDE").withIndex(13).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(pcoSpecificite, ColumnMetadata.named("PCO_SPECIFICITE").withIndex(15).ofType(Types.VARCHAR).withSize(200));
        addMetadata(pcoSuiviOpeCompteTiers, ColumnMetadata.named("PCO_SUIVI_OPE_COMPTE_TIERS").withIndex(14).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(pcoValidite, ColumnMetadata.named("PCO_VALIDITE").withIndex(8).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


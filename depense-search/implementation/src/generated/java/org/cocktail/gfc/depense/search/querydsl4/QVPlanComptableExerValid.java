package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVPlanComptableExerValid is a Querydsl query type for QVPlanComptableExerValid
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVPlanComptableExerValid extends com.querydsl.sql.RelationalPathBase<QVPlanComptableExerValid> {

    private static final long serialVersionUID = 45842418;

    public static final QVPlanComptableExerValid vPlanComptableExerValid = new QVPlanComptableExerValid("V_PLAN_COMPTABLE_EXER_VALID");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath pcoBudgetaire = createString("pcoBudgetaire");

    public final StringPath pcoEmargement = createString("pcoEmargement");

    public final StringPath pcoJBe = createString("pcoJBe");

    public final StringPath pcoJExercice = createString("pcoJExercice");

    public final StringPath pcoJFinExercice = createString("pcoJFinExercice");

    public final StringPath pcoLibelle = createString("pcoLibelle");

    public final StringPath pcoNature = createString("pcoNature");

    public final NumberPath<Long> pcoNiveau = createNumber("pcoNiveau", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final StringPath pcoSensEmargement = createString("pcoSensEmargement");

    public final StringPath pcoValidite = createString("pcoValidite");

    public QVPlanComptableExerValid(String variable) {
        super(QVPlanComptableExerValid.class, forVariable(variable), "GFC", "V_PLAN_COMPTABLE_EXER_VALID");
        addMetadata();
    }

    public QVPlanComptableExerValid(String variable, String schema, String table) {
        super(QVPlanComptableExerValid.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVPlanComptableExerValid(Path<? extends QVPlanComptableExerValid> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_PLAN_COMPTABLE_EXER_VALID");
        addMetadata();
    }

    public QVPlanComptableExerValid(PathMetadata metadata) {
        super(QVPlanComptableExerValid.class, metadata, "GFC", "V_PLAN_COMPTABLE_EXER_VALID");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(12).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(pcoBudgetaire, ColumnMetadata.named("PCO_BUDGETAIRE").withIndex(1).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(pcoEmargement, ColumnMetadata.named("PCO_EMARGEMENT").withIndex(2).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(pcoJBe, ColumnMetadata.named("PCO_J_BE").withIndex(11).ofType(Types.VARCHAR).withSize(1));
        addMetadata(pcoJExercice, ColumnMetadata.named("PCO_J_EXERCICE").withIndex(9).ofType(Types.VARCHAR).withSize(1));
        addMetadata(pcoJFinExercice, ColumnMetadata.named("PCO_J_FIN_EXERCICE").withIndex(10).ofType(Types.VARCHAR).withSize(1));
        addMetadata(pcoLibelle, ColumnMetadata.named("PCO_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(pcoNature, ColumnMetadata.named("PCO_NATURE").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(pcoNiveau, ColumnMetadata.named("PCO_NIVEAU").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(6).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(pcoSensEmargement, ColumnMetadata.named("PCO_SENS_EMARGEMENT").withIndex(7).ofType(Types.VARCHAR).withSize(1));
        addMetadata(pcoValidite, ColumnMetadata.named("PCO_VALIDITE").withIndex(8).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QZPlanComptableExer is a Querydsl query type for QZPlanComptableExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QZPlanComptableExer extends com.querydsl.sql.RelationalPathBase<QZPlanComptableExer> {

    private static final long serialVersionUID = 1728279206;

    public static final QZPlanComptableExer zPlanComptableExer = new QZPlanComptableExer("Z_PLAN_COMPTABLE_EXER");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath pcoBudgetaire = createString("pcoBudgetaire");

    public final StringPath pcoCompteBe = createString("pcoCompteBe");

    public final NumberPath<Long> pcoeId = createNumber("pcoeId", Long.class);

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

    public final StringPath pcoValidite = createString("pcoValidite");

    public final NumberPath<Long> zPcoeId = createNumber("zPcoeId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QZPlanComptableExer> zPlanComptableExerPk = createPrimaryKey(zPcoeId);

    public QZPlanComptableExer(String variable) {
        super(QZPlanComptableExer.class, forVariable(variable), "GFC", "Z_PLAN_COMPTABLE_EXER");
        addMetadata();
    }

    public QZPlanComptableExer(String variable, String schema, String table) {
        super(QZPlanComptableExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QZPlanComptableExer(Path<? extends QZPlanComptableExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "Z_PLAN_COMPTABLE_EXER");
        addMetadata();
    }

    public QZPlanComptableExer(PathMetadata metadata) {
        super(QZPlanComptableExer.class, metadata, "GFC", "Z_PLAN_COMPTABLE_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(pcoBudgetaire, ColumnMetadata.named("PCO_BUDGETAIRE").withIndex(6).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(pcoCompteBe, ColumnMetadata.named("PCO_COMPTE_BE").withIndex(15).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pcoeId, ColumnMetadata.named("PCOE_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pcoEmargement, ColumnMetadata.named("PCO_EMARGEMENT").withIndex(7).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(pcoJBe, ColumnMetadata.named("PCO_J_BE").withIndex(14).ofType(Types.VARCHAR).withSize(1));
        addMetadata(pcoJExercice, ColumnMetadata.named("PCO_J_EXERCICE").withIndex(12).ofType(Types.VARCHAR).withSize(1));
        addMetadata(pcoJFinExercice, ColumnMetadata.named("PCO_J_FIN_EXERCICE").withIndex(13).ofType(Types.VARCHAR).withSize(1));
        addMetadata(pcoLibelle, ColumnMetadata.named("PCO_LIBELLE").withIndex(8).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(pcoNature, ColumnMetadata.named("PCO_NATURE").withIndex(9).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(pcoNiveau, ColumnMetadata.named("PCO_NIVEAU").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(pcoSensEmargement, ColumnMetadata.named("PCO_SENS_EMARGEMENT").withIndex(10).ofType(Types.VARCHAR).withSize(1));
        addMetadata(pcoSensSolde, ColumnMetadata.named("PCO_SENS_SOLDE").withIndex(16).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(pcoValidite, ColumnMetadata.named("PCO_VALIDITE").withIndex(11).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(zPcoeId, ColumnMetadata.named("Z_PCOE_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


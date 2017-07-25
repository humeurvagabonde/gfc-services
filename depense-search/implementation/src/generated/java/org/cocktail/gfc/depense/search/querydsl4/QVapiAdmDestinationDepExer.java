package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVapiAdmDestinationDepExer is a Querydsl query type for QVapiAdmDestinationDepExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVapiAdmDestinationDepExer extends com.querydsl.sql.RelationalPathBase<QVapiAdmDestinationDepExer> {

    private static final long serialVersionUID = -1500619875;

    public static final QVapiAdmDestinationDepExer vapiAdmDestinationDepExer = new QVapiAdmDestinationDepExer("VAPI_ADM_DESTINATION_DEP_EXER");

    public final StringPath abreviation = createString("abreviation");

    public final StringPath code = createString("code");

    public final NumberPath<Integer> editionBudget = createNumber("editionBudget", Integer.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final DateTimePath<java.sql.Timestamp> fermeture = createDateTime("fermeture", java.sql.Timestamp.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<Long> niveau = createNumber("niveau", Long.class);

    public final NumberPath<Integer> ordreAffichage = createNumber("ordreAffichage", Integer.class);

    public final DateTimePath<java.sql.Timestamp> ouverture = createDateTime("ouverture", java.sql.Timestamp.class);

    public final NumberPath<Long> pere = createNumber("pere", Long.class);

    public final NumberPath<Integer> saisieBudgetaire = createNumber("saisieBudgetaire", Integer.class);

    public final StringPath type = createString("type");

    public QVapiAdmDestinationDepExer(String variable) {
        super(QVapiAdmDestinationDepExer.class, forVariable(variable), "GFC", "VAPI_ADM_DESTINATION_DEP_EXER");
        addMetadata();
    }

    public QVapiAdmDestinationDepExer(String variable, String schema, String table) {
        super(QVapiAdmDestinationDepExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVapiAdmDestinationDepExer(Path<? extends QVapiAdmDestinationDepExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VAPI_ADM_DESTINATION_DEP_EXER");
        addMetadata();
    }

    public QVapiAdmDestinationDepExer(PathMetadata metadata) {
        super(QVapiAdmDestinationDepExer.class, metadata, "GFC", "VAPI_ADM_DESTINATION_DEP_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(abreviation, ColumnMetadata.named("ABREVIATION").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(editionBudget, ColumnMetadata.named("EDITION_BUDGET").withIndex(13).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fermeture, ColumnMetadata.named("FERMETURE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(niveau, ColumnMetadata.named("NIVEAU").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ordreAffichage, ColumnMetadata.named("ORDRE_AFFICHAGE").withIndex(11).ofType(Types.DECIMAL).withSize(3));
        addMetadata(ouverture, ColumnMetadata.named("OUVERTURE").withIndex(9).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(pere, ColumnMetadata.named("PERE").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(saisieBudgetaire, ColumnMetadata.named("SAISIE_BUDGETAIRE").withIndex(12).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(type, ColumnMetadata.named("TYPE").withIndex(7).ofType(Types.VARCHAR).withSize(5).notNull());
    }

}


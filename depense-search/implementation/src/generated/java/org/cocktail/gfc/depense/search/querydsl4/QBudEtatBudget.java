package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudEtatBudget is a Querydsl query type for QBudEtatBudget
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudEtatBudget extends com.querydsl.sql.RelationalPathBase<QBudEtatBudget> {

    private static final long serialVersionUID = 485327054;

    public static final QBudEtatBudget budEtatBudget = new QBudEtatBudget("BUD_ETAT_BUDGET");

    public final StringPath code = createString("code");

    public final NumberPath<Long> idBudEtatBudget = createNumber("idBudEtatBudget", Long.class);

    public final StringPath libelle = createString("libelle");

    public final com.querydsl.sql.PrimaryKey<QBudEtatBudget> budEtatBudgetPk = createPrimaryKey(idBudEtatBudget);

    public QBudEtatBudget(String variable) {
        super(QBudEtatBudget.class, forVariable(variable), "GFC", "BUD_ETAT_BUDGET");
        addMetadata();
    }

    public QBudEtatBudget(String variable, String schema, String table) {
        super(QBudEtatBudget.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudEtatBudget(Path<? extends QBudEtatBudget> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_ETAT_BUDGET");
        addMetadata();
    }

    public QBudEtatBudget(PathMetadata metadata) {
        super(QBudEtatBudget.class, metadata, "GFC", "BUD_ETAT_BUDGET");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(2).ofType(Types.VARCHAR).withSize(15).notNull());
        addMetadata(idBudEtatBudget, ColumnMetadata.named("ID_BUD_ETAT_BUDGET").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


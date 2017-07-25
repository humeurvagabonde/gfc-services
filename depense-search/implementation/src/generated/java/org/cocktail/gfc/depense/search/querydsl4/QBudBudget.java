package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudBudget is a Querydsl query type for QBudBudget
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudBudget extends com.querydsl.sql.RelationalPathBase<QBudBudget> {

    private static final long serialVersionUID = 1597229196;

    public static final QBudBudget budBudget = new QBudBudget("BUD_BUDGET");

    public final StringPath codeEtatBudget = createString("codeEtatBudget");

    public final StringPath dApprobation = createString("dApprobation");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final StringPath dEnvoi = createString("dEnvoi");

    public final StringPath dExecutionPrev = createString("dExecutionPrev");

    public final StringPath dExecutionReelle = createString("dExecutionReelle");

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final StringPath dNonApprobation = createString("dNonApprobation");

    public final StringPath dVote = createString("dVote");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> idBudVersionBudget = createNumber("idBudVersionBudget", Long.class);

    public final StringPath llBudget = createString("llBudget");

    public final NumberPath<Long> numeroBudget = createNumber("numeroBudget", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBudBudget> budBudgetPk = createPrimaryKey(idBudBudget);

    public QBudBudget(String variable) {
        super(QBudBudget.class, forVariable(variable), "GFC", "BUD_BUDGET");
        addMetadata();
    }

    public QBudBudget(String variable, String schema, String table) {
        super(QBudBudget.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudBudget(Path<? extends QBudBudget> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_BUDGET");
        addMetadata();
    }

    public QBudBudget(PathMetadata metadata) {
        super(QBudBudget.class, metadata, "GFC", "BUD_BUDGET");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(codeEtatBudget, ColumnMetadata.named("CODE_ETAT_BUDGET").withIndex(10).ofType(Types.VARCHAR).withSize(15).notNull());
        addMetadata(dApprobation, ColumnMetadata.named("D_APPROBATION").withIndex(14).ofType(Types.VARCHAR).withSize(100));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(7).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dEnvoi, ColumnMetadata.named("D_ENVOI").withIndex(12).ofType(Types.VARCHAR).withSize(100));
        addMetadata(dExecutionPrev, ColumnMetadata.named("D_EXECUTION_PREV").withIndex(15).ofType(Types.VARCHAR).withSize(100));
        addMetadata(dExecutionReelle, ColumnMetadata.named("D_EXECUTION_REELLE").withIndex(16).ofType(Types.VARCHAR).withSize(100));
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(9).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dNonApprobation, ColumnMetadata.named("D_NON_APPROBATION").withIndex(13).ofType(Types.VARCHAR).withSize(100));
        addMetadata(dVote, ColumnMetadata.named("D_VOTE").withIndex(11).ofType(Types.VARCHAR).withSize(100));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudVersionBudget, ColumnMetadata.named("ID_BUD_VERSION_BUDGET").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(llBudget, ColumnMetadata.named("LL_BUDGET").withIndex(4).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(numeroBudget, ColumnMetadata.named("NUMERO_BUDGET").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(8).ofType(Types.DECIMAL).withSize(38));
    }

}


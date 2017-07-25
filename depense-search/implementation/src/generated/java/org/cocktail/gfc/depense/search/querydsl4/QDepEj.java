package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepEj is a Querydsl query type for QDepEj
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepEj extends com.querydsl.sql.RelationalPathBase<QDepEj> {

    private static final long serialVersionUID = -1576798326;

    public static final QDepEj depEj = new QDepEj("DEP_EJ");

    public final NumberPath<Long> canId = createNumber("canId", Long.class);

    public final StringPath dateEj = createString("dateEj");

    public final StringPath dCreation = createString("dCreation");

    public final StringPath dModification = createString("dModification");

    public final StringPath dRejet = createString("dRejet");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAttribution = createNumber("idAttribution", Long.class);

    public final NumberPath<Long> idCommande = createNumber("idCommande", Long.class);

    public final NumberPath<Long> idDepEj = createNumber("idDepEj", Long.class);

    public final NumberPath<Long> idDepEjExterne = createNumber("idDepEjExterne", Long.class);

    public final NumberPath<Long> idDepEjTypeOrigine = createNumber("idDepEjTypeOrigine", Long.class);

    public final NumberPath<Integer> ihmRepartSimple = createNumber("ihmRepartSimple", Integer.class);

    public final StringPath motifRejet = createString("motifRejet");

    public final StringPath numEj = createString("numEj");

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final NumberPath<Long> persIdRejet = createNumber("persIdRejet", Long.class);

    public final StringPath reprise = createString("reprise");

    public final NumberPath<Long> tyapId = createNumber("tyapId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QDepEj> depEjPk = createPrimaryKey(idDepEj);

    public QDepEj(String variable) {
        super(QDepEj.class, forVariable(variable), "GFC", "DEP_EJ");
        addMetadata();
    }

    public QDepEj(String variable, String schema, String table) {
        super(QDepEj.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepEj(Path<? extends QDepEj> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_EJ");
        addMetadata();
    }

    public QDepEj(PathMetadata metadata) {
        super(QDepEj.class, metadata, "GFC", "DEP_EJ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(canId, ColumnMetadata.named("CAN_ID").withIndex(20).ofType(Types.DECIMAL).withSize(12));
        addMetadata(dateEj, ColumnMetadata.named("DATE_EJ").withIndex(19).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(8).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(10).ofType(Types.VARCHAR).withSize(30));
        addMetadata(dRejet, ColumnMetadata.named("D_REJET").withIndex(13).ofType(Types.VARCHAR).withSize(30));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAttribution, ColumnMetadata.named("ID_ATTRIBUTION").withIndex(6).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idCommande, ColumnMetadata.named("ID_COMMANDE").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepEj, ColumnMetadata.named("ID_DEP_EJ").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepEjExterne, ColumnMetadata.named("ID_DEP_EJ_EXTERNE").withIndex(17).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepEjTypeOrigine, ColumnMetadata.named("ID_DEP_EJ_TYPE_ORIGINE").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(ihmRepartSimple, ColumnMetadata.named("IHM_REPART_SIMPLE").withIndex(12).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(motifRejet, ColumnMetadata.named("MOTIF_REJET").withIndex(15).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(numEj, ColumnMetadata.named("NUM_EJ").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(9).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(11).ofType(Types.DECIMAL).withSize(38));
        addMetadata(persIdRejet, ColumnMetadata.named("PERS_ID_REJET").withIndex(14).ofType(Types.DECIMAL).withSize(38));
        addMetadata(reprise, ColumnMetadata.named("REPRISE").withIndex(18).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(tyapId, ColumnMetadata.named("TYAP_ID").withIndex(16).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


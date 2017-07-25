package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepEjCplt is a Querydsl query type for QDepEjCplt
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepEjCplt extends com.querydsl.sql.RelationalPathBase<QDepEjCplt> {

    private static final long serialVersionUID = -1997977249;

    public static final QDepEjCplt depEjCplt = new QDepEjCplt("DEP_EJ_CPLT");

    public final StringPath dateRejet = createString("dateRejet");

    public final StringPath dCreation = createString("dCreation");

    public final StringPath dModification = createString("dModification");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idDepEj = createNumber("idDepEj", Long.class);

    public final NumberPath<Long> idDepEjCplt = createNumber("idDepEjCplt", Long.class);

    public final StringPath motifRejet = createString("motifRejet");

    public final StringPath numEjCplt = createString("numEjCplt");

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final NumberPath<Long> persIdRejet = createNumber("persIdRejet", Long.class);

    public final NumberPath<Long> tyapId = createNumber("tyapId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QDepEjCplt> idDepEjCpltPk = createPrimaryKey(idDepEjCplt);

    public QDepEjCplt(String variable) {
        super(QDepEjCplt.class, forVariable(variable), "GFC", "DEP_EJ_CPLT");
        addMetadata();
    }

    public QDepEjCplt(String variable, String schema, String table) {
        super(QDepEjCplt.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepEjCplt(Path<? extends QDepEjCplt> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_EJ_CPLT");
        addMetadata();
    }

    public QDepEjCplt(PathMetadata metadata) {
        super(QDepEjCplt.class, metadata, "GFC", "DEP_EJ_CPLT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateRejet, ColumnMetadata.named("DATE_REJET").withIndex(6).ofType(Types.VARCHAR).withSize(30));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(10).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(12).ofType(Types.VARCHAR).withSize(30));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idDepEj, ColumnMetadata.named("ID_DEP_EJ").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepEjCplt, ColumnMetadata.named("ID_DEP_EJ_CPLT").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(motifRejet, ColumnMetadata.named("MOTIF_REJET").withIndex(5).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(numEjCplt, ColumnMetadata.named("NUM_EJ_CPLT").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(11).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(13).ofType(Types.DECIMAL).withSize(38));
        addMetadata(persIdRejet, ColumnMetadata.named("PERS_ID_REJET").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(tyapId, ColumnMetadata.named("TYAP_ID").withIndex(9).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(8).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


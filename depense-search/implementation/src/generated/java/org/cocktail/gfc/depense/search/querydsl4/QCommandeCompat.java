package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCommandeCompat is a Querydsl query type for QCommandeCompat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCommandeCompat extends com.querydsl.sql.RelationalPathBase<QCommandeCompat> {

    private static final long serialVersionUID = 591534310;

    public static final QCommandeCompat commandeCompat = new QCommandeCompat("COMMANDE_COMPAT");

    public final StringPath commCommentaire = createString("commCommentaire");

    public final SimplePath<Object> commDateCreation = createSimple("commDateCreation", Object.class);

    public final SimplePath<Object> commDateEj = createSimple("commDateEj", Object.class);

    public final NumberPath<Long> commId = createNumber("commId", Long.class);

    public final StringPath commLibelle = createString("commLibelle");

    public final StringPath commNumero = createString("commNumero");

    public final StringPath commReference = createString("commReference");

    public final NumberPath<Long> devId = createNumber("devId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final StringPath reprise = createString("reprise");

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final NumberPath<Long> tyetIdImprimable = createNumber("tyetIdImprimable", Long.class);

    public QCommandeCompat(String variable) {
        super(QCommandeCompat.class, forVariable(variable), "GFC", "COMMANDE_COMPAT");
        addMetadata();
    }

    public QCommandeCompat(String variable, String schema, String table) {
        super(QCommandeCompat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCommandeCompat(Path<? extends QCommandeCompat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "COMMANDE_COMPAT");
        addMetadata();
    }

    public QCommandeCompat(PathMetadata metadata) {
        super(QCommandeCompat.class, metadata, "GFC", "COMMANDE_COMPAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commCommentaire, ColumnMetadata.named("COMM_COMMENTAIRE").withIndex(9).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(commDateCreation, ColumnMetadata.named("COMM_DATE_CREATION").withIndex(14).ofType(Types.OTHER).withSize(20).withDigits(9));
        addMetadata(commDateEj, ColumnMetadata.named("COMM_DATE_EJ").withIndex(13).ofType(Types.OTHER).withSize(20).withDigits(9));
        addMetadata(commId, ColumnMetadata.named("COMM_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(commLibelle, ColumnMetadata.named("COMM_LIBELLE").withIndex(8).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(commNumero, ColumnMetadata.named("COMM_NUMERO").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(commReference, ColumnMetadata.named("COMM_REFERENCE").withIndex(7).ofType(Types.VARCHAR).withSize(50));
        addMetadata(devId, ColumnMetadata.named("DEV_ID").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(12).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(reprise, ColumnMetadata.named("REPRISE").withIndex(4).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetIdImprimable, ColumnMetadata.named("TYET_ID_IMPRIMABLE").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


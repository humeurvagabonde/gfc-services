package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecetteRelance is a Querydsl query type for QRecetteRelance
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecetteRelance extends com.querydsl.sql.RelationalPathBase<QRecetteRelance> {

    private static final long serialVersionUID = 1773823394;

    public static final QRecetteRelance recetteRelance = new QRecetteRelance("RECETTE_RELANCE");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final StringPath rerContact = createString("rerContact");

    public final DateTimePath<java.sql.Timestamp> rerDateCreation = createDateTime("rerDateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> rerDateImpression = createDateTime("rerDateImpression", java.sql.Timestamp.class);

    public final NumberPath<Long> rerDelaiPaiement = createNumber("rerDelaiPaiement", Long.class);

    public final StringPath rerEtat = createString("rerEtat");

    public final StringPath rerLibelle = createString("rerLibelle");

    public final NumberPath<java.math.BigDecimal> rerMont = createNumber("rerMont", java.math.BigDecimal.class);

    public final NumberPath<Long> rerNumero = createNumber("rerNumero", Long.class);

    public final NumberPath<Long> rerOrdre = createNumber("rerOrdre", Long.class);

    public final StringPath rerPs = createString("rerPs");

    public final NumberPath<Long> trlOrdre = createNumber("trlOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRecetteRelance> recetteRelancePk = createPrimaryKey(rerOrdre);

    public QRecetteRelance(String variable) {
        super(QRecetteRelance.class, forVariable(variable), "GFC", "RECETTE_RELANCE");
        addMetadata();
    }

    public QRecetteRelance(String variable, String schema, String table) {
        super(QRecetteRelance.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecetteRelance(Path<? extends QRecetteRelance> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RECETTE_RELANCE");
        addMetadata();
    }

    public QRecetteRelance(PathMetadata metadata) {
        super(QRecetteRelance.class, metadata, "GFC", "RECETTE_RELANCE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(rerContact, ColumnMetadata.named("RER_CONTACT").withIndex(9).ofType(Types.VARCHAR).withSize(300));
        addMetadata(rerDateCreation, ColumnMetadata.named("RER_DATE_CREATION").withIndex(11).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(rerDateImpression, ColumnMetadata.named("RER_DATE_IMPRESSION").withIndex(12).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(rerDelaiPaiement, ColumnMetadata.named("RER_DELAI_PAIEMENT").withIndex(14).ofType(Types.DECIMAL).withSize(11));
        addMetadata(rerEtat, ColumnMetadata.named("RER_ETAT").withIndex(10).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(rerLibelle, ColumnMetadata.named("RER_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(200));
        addMetadata(rerMont, ColumnMetadata.named("RER_MONT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(rerNumero, ColumnMetadata.named("RER_NUMERO").withIndex(13).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(rerOrdre, ColumnMetadata.named("RER_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(rerPs, ColumnMetadata.named("RER_PS").withIndex(4).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(trlOrdre, ColumnMetadata.named("TRL_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


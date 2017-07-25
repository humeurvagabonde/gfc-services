package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QHistoEtatRecette is a Querydsl query type for QHistoEtatRecette
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QHistoEtatRecette extends com.querydsl.sql.RelationalPathBase<QHistoEtatRecette> {

    private static final long serialVersionUID = -723468181;

    public static final QHistoEtatRecette histoEtatRecette = new QHistoEtatRecette("HISTO_ETAT_RECETTE");

    public final DateTimePath<java.sql.Timestamp> dateEtat = createDateTime("dateEtat", java.sql.Timestamp.class);

    public final NumberPath<Long> histId = createNumber("histId", Long.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> titId = createNumber("titId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QHistoEtatRecette> idHistoEtatRecettePk = createPrimaryKey(histId);

    public QHistoEtatRecette(String variable) {
        super(QHistoEtatRecette.class, forVariable(variable), "GFC", "HISTO_ETAT_RECETTE");
        addMetadata();
    }

    public QHistoEtatRecette(String variable, String schema, String table) {
        super(QHistoEtatRecette.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QHistoEtatRecette(Path<? extends QHistoEtatRecette> path) {
        super(path.getType(), path.getMetadata(), "GFC", "HISTO_ETAT_RECETTE");
        addMetadata();
    }

    public QHistoEtatRecette(PathMetadata metadata) {
        super(QHistoEtatRecette.class, metadata, "GFC", "HISTO_ETAT_RECETTE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateEtat, ColumnMetadata.named("DATE_ETAT").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(histId, ColumnMetadata.named("HIST_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(titId, ColumnMetadata.named("TIT_ID").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


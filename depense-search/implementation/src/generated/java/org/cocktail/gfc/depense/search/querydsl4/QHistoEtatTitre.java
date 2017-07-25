package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QHistoEtatTitre is a Querydsl query type for QHistoEtatTitre
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QHistoEtatTitre extends com.querydsl.sql.RelationalPathBase<QHistoEtatTitre> {

    private static final long serialVersionUID = -812176819;

    public static final QHistoEtatTitre histoEtatTitre = new QHistoEtatTitre("HISTO_ETAT_TITRE");

    public final DateTimePath<java.sql.Timestamp> dateEtat = createDateTime("dateEtat", java.sql.Timestamp.class);

    public final NumberPath<Long> histId = createNumber("histId", Long.class);

    public final NumberPath<Long> titId = createNumber("titId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QHistoEtatTitre> idHistoEtatTitrePk = createPrimaryKey(histId);

    public QHistoEtatTitre(String variable) {
        super(QHistoEtatTitre.class, forVariable(variable), "GFC", "HISTO_ETAT_TITRE");
        addMetadata();
    }

    public QHistoEtatTitre(String variable, String schema, String table) {
        super(QHistoEtatTitre.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QHistoEtatTitre(Path<? extends QHistoEtatTitre> path) {
        super(path.getType(), path.getMetadata(), "GFC", "HISTO_ETAT_TITRE");
        addMetadata();
    }

    public QHistoEtatTitre(PathMetadata metadata) {
        super(QHistoEtatTitre.class, metadata, "GFC", "HISTO_ETAT_TITRE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateEtat, ColumnMetadata.named("DATE_ETAT").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(histId, ColumnMetadata.named("HIST_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(titId, ColumnMetadata.named("TIT_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


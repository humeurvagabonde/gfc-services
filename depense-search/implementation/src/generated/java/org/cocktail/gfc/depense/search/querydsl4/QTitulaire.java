package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTitulaire is a Querydsl query type for QTitulaire
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTitulaire extends com.querydsl.sql.RelationalPathBase<QTitulaire> {

    private static final long serialVersionUID = -1839189945;

    public static final QTitulaire titulaire = new QTitulaire("TITULAIRE");

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> lotOrdre = createNumber("lotOrdre", Long.class);

    public final NumberPath<Long> titOrdre = createNumber("titOrdre", Long.class);

    public final NumberPath<Long> titPere = createNumber("titPere", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTitulaire> titulairePk = createPrimaryKey(titOrdre);

    public QTitulaire(String variable) {
        super(QTitulaire.class, forVariable(variable), "GFC", "TITULAIRE");
        addMetadata();
    }

    public QTitulaire(String variable, String schema, String table) {
        super(QTitulaire.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTitulaire(Path<? extends QTitulaire> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TITULAIRE");
        addMetadata();
    }

    public QTitulaire(PathMetadata metadata) {
        super(QTitulaire.class, metadata, "GFC", "TITULAIRE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(lotOrdre, ColumnMetadata.named("LOT_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(titOrdre, ColumnMetadata.named("TIT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(titPere, ColumnMetadata.named("TIT_PERE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


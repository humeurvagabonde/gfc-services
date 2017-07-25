package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCatCatalogue is a Querydsl query type for QCatCatalogue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCatCatalogue extends com.querydsl.sql.RelationalPathBase<QCatCatalogue> {

    private static final long serialVersionUID = 817306109;

    public static final QCatCatalogue catCatalogue = new QCatCatalogue("CAT_CATALOGUE");

    public final StringPath catCommentaire = createString("catCommentaire");

    public final DateTimePath<java.sql.Timestamp> catDateDebut = createDateTime("catDateDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> catDateFin = createDateTime("catDateFin", java.sql.Timestamp.class);

    public final NumberPath<Long> catId = createNumber("catId", Long.class);

    public final StringPath catLibelle = createString("catLibelle");

    public final NumberPath<Long> cmOrdre = createNumber("cmOrdre", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> tyapId = createNumber("tyapId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCatCatalogue> catCataloguePk = createPrimaryKey(catId);

    public QCatCatalogue(String variable) {
        super(QCatCatalogue.class, forVariable(variable), "GFC", "CAT_CATALOGUE");
        addMetadata();
    }

    public QCatCatalogue(String variable, String schema, String table) {
        super(QCatCatalogue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCatCatalogue(Path<? extends QCatCatalogue> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CAT_CATALOGUE");
        addMetadata();
    }

    public QCatCatalogue(PathMetadata metadata) {
        super(QCatCatalogue.class, metadata, "GFC", "CAT_CATALOGUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(catCommentaire, ColumnMetadata.named("CAT_COMMENTAIRE").withIndex(8).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(catDateDebut, ColumnMetadata.named("CAT_DATE_DEBUT").withIndex(6).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(catDateFin, ColumnMetadata.named("CAT_DATE_FIN").withIndex(7).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(catLibelle, ColumnMetadata.named("CAT_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(cmOrdre, ColumnMetadata.named("CM_ORDRE").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyapId, ColumnMetadata.named("TYAP_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


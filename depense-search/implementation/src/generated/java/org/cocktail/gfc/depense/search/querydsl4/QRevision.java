package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRevision is a Querydsl query type for QRevision
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRevision extends com.querydsl.sql.RelationalPathBase<QRevision> {

    private static final long serialVersionUID = -1506678363;

    public static final QRevision revision = new QRevision("REVISION");

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> revDate = createDateTime("revDate", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> revDiff = createNumber("revDiff", java.math.BigDecimal.class);

    public final StringPath revLibelle = createString("revLibelle");

    public final NumberPath<Long> revOrdre = createNumber("revOrdre", Long.class);

    public final StringPath revSuppr = createString("revSuppr");

    public final StringPath revType = createString("revType");

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRevision> revisionPk = createPrimaryKey(revOrdre);

    public QRevision(String variable) {
        super(QRevision.class, forVariable(variable), "GFC", "REVISION");
        addMetadata();
    }

    public QRevision(String variable, String schema, String table) {
        super(QRevision.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRevision(Path<? extends QRevision> path) {
        super(path.getType(), path.getMetadata(), "GFC", "REVISION");
        addMetadata();
    }

    public QRevision(PathMetadata metadata) {
        super(QRevision.class, metadata, "GFC", "REVISION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(revDate, ColumnMetadata.named("REV_DATE").withIndex(7).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(revDiff, ColumnMetadata.named("REV_DIFF").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(revLibelle, ColumnMetadata.named("REV_LIBELLE").withIndex(8).ofType(Types.VARCHAR).withSize(512));
        addMetadata(revOrdre, ColumnMetadata.named("REV_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(revSuppr, ColumnMetadata.named("REV_SUPPR").withIndex(6).ofType(Types.VARCHAR).withSize(1));
        addMetadata(revType, ColumnMetadata.named("REV_TYPE").withIndex(2).ofType(Types.VARCHAR).withSize(1));
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
    }

}


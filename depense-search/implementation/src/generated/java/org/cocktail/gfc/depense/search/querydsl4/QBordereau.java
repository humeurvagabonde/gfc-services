package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBordereau is a Querydsl query type for QBordereau
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBordereau extends com.querydsl.sql.RelationalPathBase<QBordereau> {

    private static final long serialVersionUID = 229481251;

    public static final QBordereau bordereau = new QBordereau("BORDEREAU");

    public final DateTimePath<java.sql.Timestamp> borDateCreation = createDateTime("borDateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> borDateVisa = createDateTime("borDateVisa", java.sql.Timestamp.class);

    public final StringPath borEtat = createString("borEtat");

    public final NumberPath<Long> borId = createNumber("borId", Long.class);

    public final NumberPath<Long> borNum = createNumber("borNum", Long.class);

    public final NumberPath<Long> borOrdre = createNumber("borOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> tboOrdre = createNumber("tboOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final NumberPath<Long> utlOrdreVisa = createNumber("utlOrdreVisa", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBordereau> bordereauPk = createPrimaryKey(borId);

    public QBordereau(String variable) {
        super(QBordereau.class, forVariable(variable), "GFC", "BORDEREAU");
        addMetadata();
    }

    public QBordereau(String variable, String schema, String table) {
        super(QBordereau.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBordereau(Path<? extends QBordereau> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BORDEREAU");
        addMetadata();
    }

    public QBordereau(PathMetadata metadata) {
        super(QBordereau.class, metadata, "GFC", "BORDEREAU");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(borDateCreation, ColumnMetadata.named("BOR_DATE_CREATION").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(borDateVisa, ColumnMetadata.named("BOR_DATE_VISA").withIndex(2).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(borEtat, ColumnMetadata.named("BOR_ETAT").withIndex(3).ofType(Types.VARCHAR).withSize(20));
        addMetadata(borId, ColumnMetadata.named("BOR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(borNum, ColumnMetadata.named("BOR_NUM").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(borOrdre, ColumnMetadata.named("BOR_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(11).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(6).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(tboOrdre, ColumnMetadata.named("TBO_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdreVisa, ColumnMetadata.named("UTL_ORDRE_VISA").withIndex(9).ofType(Types.DECIMAL).withSize(0));
    }

}


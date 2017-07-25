package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOrigine is a Querydsl query type for QOrigine
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOrigine extends com.querydsl.sql.RelationalPathBase<QOrigine> {

    private static final long serialVersionUID = -1935367435;

    public static final QOrigine origine = new QOrigine("ORIGINE");

    public final StringPath oriEntite = createString("oriEntite");

    public final NumberPath<Long> oriKeyEntite = createNumber("oriKeyEntite", Long.class);

    public final StringPath oriKeyName = createString("oriKeyName");

    public final StringPath oriLibelle = createString("oriLibelle");

    public final NumberPath<Long> oriOrdre = createNumber("oriOrdre", Long.class);

    public final NumberPath<Long> topOrdre = createNumber("topOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QOrigine> originePk = createPrimaryKey(oriOrdre);

    public QOrigine(String variable) {
        super(QOrigine.class, forVariable(variable), "GFC", "ORIGINE");
        addMetadata();
    }

    public QOrigine(String variable, String schema, String table) {
        super(QOrigine.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOrigine(Path<? extends QOrigine> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ORIGINE");
        addMetadata();
    }

    public QOrigine(PathMetadata metadata) {
        super(QOrigine.class, metadata, "GFC", "ORIGINE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(oriEntite, ColumnMetadata.named("ORI_ENTITE").withIndex(2).ofType(Types.VARCHAR).withSize(50));
        addMetadata(oriKeyEntite, ColumnMetadata.named("ORI_KEY_ENTITE").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(oriKeyName, ColumnMetadata.named("ORI_KEY_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(50));
        addMetadata(oriLibelle, ColumnMetadata.named("ORI_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(oriOrdre, ColumnMetadata.named("ORI_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(topOrdre, ColumnMetadata.named("TOP_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(0));
    }

}


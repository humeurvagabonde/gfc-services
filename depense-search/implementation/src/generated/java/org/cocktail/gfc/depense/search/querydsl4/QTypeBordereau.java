package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeBordereau is a Querydsl query type for QTypeBordereau
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeBordereau extends com.querydsl.sql.RelationalPathBase<QTypeBordereau> {

    private static final long serialVersionUID = 220267017;

    public static final QTypeBordereau typeBordereau = new QTypeBordereau("TYPE_BORDEREAU");

    public final StringPath tboLibelle = createString("tboLibelle");

    public final NumberPath<Long> tboOrdre = createNumber("tboOrdre", Long.class);

    public final StringPath tboSousType = createString("tboSousType");

    public final StringPath tboType = createString("tboType");

    public final StringPath tboTypeCreation = createString("tboTypeCreation");

    public final NumberPath<Long> tnuOrdre = createNumber("tnuOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTypeBordereau> typeBordereauPk = createPrimaryKey(tboOrdre);

    public QTypeBordereau(String variable) {
        super(QTypeBordereau.class, forVariable(variable), "GFC", "TYPE_BORDEREAU");
        addMetadata();
    }

    public QTypeBordereau(String variable, String schema, String table) {
        super(QTypeBordereau.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeBordereau(Path<? extends QTypeBordereau> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_BORDEREAU");
        addMetadata();
    }

    public QTypeBordereau(PathMetadata metadata) {
        super(QTypeBordereau.class, metadata, "GFC", "TYPE_BORDEREAU");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tboLibelle, ColumnMetadata.named("TBO_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(60).notNull());
        addMetadata(tboOrdre, ColumnMetadata.named("TBO_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tboSousType, ColumnMetadata.named("TBO_SOUS_TYPE").withIndex(3).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(tboType, ColumnMetadata.named("TBO_TYPE").withIndex(2).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(tboTypeCreation, ColumnMetadata.named("TBO_TYPE_CREATION").withIndex(5).ofType(Types.VARCHAR).withSize(20));
        addMetadata(tnuOrdre, ColumnMetadata.named("TNU_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(0));
    }

}


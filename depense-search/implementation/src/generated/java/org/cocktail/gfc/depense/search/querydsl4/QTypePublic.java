package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypePublic is a Querydsl query type for QTypePublic
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypePublic extends com.querydsl.sql.RelationalPathBase<QTypePublic> {

    private static final long serialVersionUID = -514637427;

    public static final QTypePublic typePublic = new QTypePublic("TYPE_PUBLIC");

    public final NumberPath<Long> tyapId = createNumber("tyapId", Long.class);

    public final StringPath typuAccesInterne = createString("typuAccesInterne");

    public final NumberPath<Long> typuId = createNumber("typuId", Long.class);

    public final StringPath typuLibelle = createString("typuLibelle");

    public final com.querydsl.sql.PrimaryKey<QTypePublic> typePublicPk = createPrimaryKey(typuId);

    public QTypePublic(String variable) {
        super(QTypePublic.class, forVariable(variable), "GFC", "TYPE_PUBLIC");
        addMetadata();
    }

    public QTypePublic(String variable, String schema, String table) {
        super(QTypePublic.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypePublic(Path<? extends QTypePublic> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_PUBLIC");
        addMetadata();
    }

    public QTypePublic(PathMetadata metadata) {
        super(QTypePublic.class, metadata, "GFC", "TYPE_PUBLIC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tyapId, ColumnMetadata.named("TYAP_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(typuAccesInterne, ColumnMetadata.named("TYPU_ACCES_INTERNE").withIndex(3).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(typuId, ColumnMetadata.named("TYPU_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(typuLibelle, ColumnMetadata.named("TYPU_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


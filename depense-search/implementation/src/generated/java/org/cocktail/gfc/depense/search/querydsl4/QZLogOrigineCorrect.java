package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QZLogOrigineCorrect is a Querydsl query type for QZLogOrigineCorrect
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QZLogOrigineCorrect extends com.querydsl.sql.RelationalPathBase<QZLogOrigineCorrect> {

    private static final long serialVersionUID = -1093433921;

    public static final QZLogOrigineCorrect zLogOrigineCorrect = new QZLogOrigineCorrect("Z_LOG_ORIGINE_CORRECT");

    public final StringPath entiteCorrige = createString("entiteCorrige");

    public final NumberPath<Long> entiteKey = createNumber("entiteKey", Long.class);

    public final StringPath entiteKeyName = createString("entiteKeyName");

    public final StringPath oriEntite = createString("oriEntite");

    public final NumberPath<Long> oriEntiteKey = createNumber("oriEntiteKey", Long.class);

    public final StringPath oriKeyName = createString("oriKeyName");

    public final StringPath oriLibelle = createString("oriLibelle");

    public final NumberPath<Long> oriOrdreNew = createNumber("oriOrdreNew", Long.class);

    public final NumberPath<Long> oriOrdreOld = createNumber("oriOrdreOld", Long.class);

    public final NumberPath<Long> zlocId = createNumber("zlocId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QZLogOrigineCorrect> zLogOrigineCorrectPk = createPrimaryKey(zlocId);

    public QZLogOrigineCorrect(String variable) {
        super(QZLogOrigineCorrect.class, forVariable(variable), "GFC", "Z_LOG_ORIGINE_CORRECT");
        addMetadata();
    }

    public QZLogOrigineCorrect(String variable, String schema, String table) {
        super(QZLogOrigineCorrect.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QZLogOrigineCorrect(Path<? extends QZLogOrigineCorrect> path) {
        super(path.getType(), path.getMetadata(), "GFC", "Z_LOG_ORIGINE_CORRECT");
        addMetadata();
    }

    public QZLogOrigineCorrect(PathMetadata metadata) {
        super(QZLogOrigineCorrect.class, metadata, "GFC", "Z_LOG_ORIGINE_CORRECT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(entiteCorrige, ColumnMetadata.named("ENTITE_CORRIGE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(entiteKey, ColumnMetadata.named("ENTITE_KEY").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(entiteKeyName, ColumnMetadata.named("ENTITE_KEY_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(49).notNull());
        addMetadata(oriEntite, ColumnMetadata.named("ORI_ENTITE").withIndex(7).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(oriEntiteKey, ColumnMetadata.named("ORI_ENTITE_KEY").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(oriKeyName, ColumnMetadata.named("ORI_KEY_NAME").withIndex(8).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(oriLibelle, ColumnMetadata.named("ORI_LIBELLE").withIndex(10).ofType(Types.VARCHAR).withSize(2000).notNull());
        addMetadata(oriOrdreNew, ColumnMetadata.named("ORI_ORDRE_NEW").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(oriOrdreOld, ColumnMetadata.named("ORI_ORDRE_OLD").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(zlocId, ColumnMetadata.named("ZLOC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


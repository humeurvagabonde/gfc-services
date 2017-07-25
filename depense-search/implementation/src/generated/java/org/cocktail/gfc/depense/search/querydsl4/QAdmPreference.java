package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmPreference is a Querydsl query type for QAdmPreference
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmPreference extends com.querydsl.sql.RelationalPathBase<QAdmPreference> {

    private static final long serialVersionUID = 885334427;

    public static final QAdmPreference admPreference = new QAdmPreference("ADM_PREFERENCE");

    public final StringPath prefDefaultValue = createString("prefDefaultValue");

    public final StringPath prefDescription = createString("prefDescription");

    public final NumberPath<Long> prefId = createNumber("prefId", Long.class);

    public final StringPath prefKey = createString("prefKey");

    public final NumberPath<Long> prefPersonnalisable = createNumber("prefPersonnalisable", Long.class);

    public final NumberPath<Long> tyapId = createNumber("tyapId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmPreference> sysC0024301 = createPrimaryKey(prefId);

    public QAdmPreference(String variable) {
        super(QAdmPreference.class, forVariable(variable), "GFC", "ADM_PREFERENCE");
        addMetadata();
    }

    public QAdmPreference(String variable, String schema, String table) {
        super(QAdmPreference.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmPreference(Path<? extends QAdmPreference> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_PREFERENCE");
        addMetadata();
    }

    public QAdmPreference(PathMetadata metadata) {
        super(QAdmPreference.class, metadata, "GFC", "ADM_PREFERENCE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(prefDefaultValue, ColumnMetadata.named("PREF_DEFAULT_VALUE").withIndex(3).ofType(Types.VARCHAR).withSize(500));
        addMetadata(prefDescription, ColumnMetadata.named("PREF_DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(500));
        addMetadata(prefId, ColumnMetadata.named("PREF_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prefKey, ColumnMetadata.named("PREF_KEY").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(prefPersonnalisable, ColumnMetadata.named("PREF_PERSONNALISABLE").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyapId, ColumnMetadata.named("TYAP_ID").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


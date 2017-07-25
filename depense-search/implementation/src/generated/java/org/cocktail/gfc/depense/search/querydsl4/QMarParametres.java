package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMarParametres is a Querydsl query type for QMarParametres
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMarParametres extends com.querydsl.sql.RelationalPathBase<QMarParametres> {

    private static final long serialVersionUID = -1498992232;

    public static final QMarParametres marParametres = new QMarParametres("MAR_PARAMETRES");

    public final StringPath paramCKoiCa = createString("paramCKoiCa");

    public final StringPath paramKey = createString("paramKey");

    public final StringPath paramValue = createString("paramValue");

    public final com.querydsl.sql.PrimaryKey<QMarParametres> marParametresPk = createPrimaryKey(paramKey);

    public QMarParametres(String variable) {
        super(QMarParametres.class, forVariable(variable), "GFC", "MAR_PARAMETRES");
        addMetadata();
    }

    public QMarParametres(String variable, String schema, String table) {
        super(QMarParametres.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMarParametres(Path<? extends QMarParametres> path) {
        super(path.getType(), path.getMetadata(), "GFC", "MAR_PARAMETRES");
        addMetadata();
    }

    public QMarParametres(PathMetadata metadata) {
        super(QMarParametres.class, metadata, "GFC", "MAR_PARAMETRES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(paramCKoiCa, ColumnMetadata.named("PARAM_C_KOI_CA").withIndex(3).ofType(Types.VARCHAR).withSize(200));
        addMetadata(paramKey, ColumnMetadata.named("PARAM_KEY").withIndex(1).ofType(Types.VARCHAR).withSize(80).notNull());
        addMetadata(paramValue, ColumnMetadata.named("PARAM_VALUE").withIndex(2).ofType(Types.VARCHAR).withSize(180));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmParametres is a Querydsl query type for QVAdmParametres
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmParametres extends com.querydsl.sql.RelationalPathBase<QVAdmParametres> {

    private static final long serialVersionUID = 661474018;

    public static final QVAdmParametres vAdmParametres = new QVAdmParametres("V_ADM_PARAMETRES");

    public final StringPath paramCommentaires = createString("paramCommentaires");

    public final StringPath paramKey = createString("paramKey");

    public final NumberPath<Long> paramOrdre = createNumber("paramOrdre", Long.class);

    public final NumberPath<Long> paramTypeId = createNumber("paramTypeId", Long.class);

    public final StringPath paramValue = createString("paramValue");

    public QVAdmParametres(String variable) {
        super(QVAdmParametres.class, forVariable(variable), "GFC", "V_ADM_PARAMETRES");
        addMetadata();
    }

    public QVAdmParametres(String variable, String schema, String table) {
        super(QVAdmParametres.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmParametres(Path<? extends QVAdmParametres> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_PARAMETRES");
        addMetadata();
    }

    public QVAdmParametres(PathMetadata metadata) {
        super(QVAdmParametres.class, metadata, "GFC", "V_ADM_PARAMETRES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(paramCommentaires, ColumnMetadata.named("PARAM_COMMENTAIRES").withIndex(4).ofType(Types.VARCHAR).withSize(500));
        addMetadata(paramKey, ColumnMetadata.named("PARAM_KEY").withIndex(2).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(paramOrdre, ColumnMetadata.named("PARAM_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(paramTypeId, ColumnMetadata.named("PARAM_TYPE_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(paramValue, ColumnMetadata.named("PARAM_VALUE").withIndex(3).ofType(Types.VARCHAR).withSize(2000));
    }

}


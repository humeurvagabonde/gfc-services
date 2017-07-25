package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVEmailIndividu is a Querydsl query type for QVEmailIndividu
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVEmailIndividu extends com.querydsl.sql.RelationalPathBase<QVEmailIndividu> {

    private static final long serialVersionUID = 1671102238;

    public static final QVEmailIndividu vEmailIndividu = new QVEmailIndividu("V_EMAIL_INDIVIDU");

    public final StringPath cemDomaine = createString("cemDomaine");

    public final StringPath cemEmail = createString("cemEmail");

    public final NumberPath<Long> cemKey = createNumber("cemKey", Long.class);

    public final NumberPath<Integer> noIndividu = createNumber("noIndividu", Integer.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> priorite = createNumber("priorite", Long.class);

    public QVEmailIndividu(String variable) {
        super(QVEmailIndividu.class, forVariable(variable), "GFC", "V_EMAIL_INDIVIDU");
        addMetadata();
    }

    public QVEmailIndividu(String variable, String schema, String table) {
        super(QVEmailIndividu.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVEmailIndividu(Path<? extends QVEmailIndividu> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_EMAIL_INDIVIDU");
        addMetadata();
    }

    public QVEmailIndividu(PathMetadata metadata) {
        super(QVEmailIndividu.class, metadata, "GFC", "V_EMAIL_INDIVIDU");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cemDomaine, ColumnMetadata.named("CEM_DOMAINE").withIndex(5).ofType(Types.VARCHAR).withSize(40));
        addMetadata(cemEmail, ColumnMetadata.named("CEM_EMAIL").withIndex(4).ofType(Types.VARCHAR).withSize(60));
        addMetadata(cemKey, ColumnMetadata.named("CEM_KEY").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(2).ofType(Types.DECIMAL).withSize(8).notNull());
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(priorite, ColumnMetadata.named("PRIORITE").withIndex(6).ofType(Types.DECIMAL).withSize(0));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudVersionBudget is a Querydsl query type for QBudVersionBudget
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudVersionBudget extends com.querydsl.sql.RelationalPathBase<QBudVersionBudget> {

    private static final long serialVersionUID = -1500647658;

    public static final QBudVersionBudget budVersionBudget = new QBudVersionBudget("BUD_VERSION_BUDGET");

    public final StringPath code = createString("code");

    public final NumberPath<Long> idBudVersionBudget = createNumber("idBudVersionBudget", Long.class);

    public final StringPath libelle = createString("libelle");

    public final com.querydsl.sql.PrimaryKey<QBudVersionBudget> budVersionBudgetPk = createPrimaryKey(idBudVersionBudget);

    public QBudVersionBudget(String variable) {
        super(QBudVersionBudget.class, forVariable(variable), "GFC", "BUD_VERSION_BUDGET");
        addMetadata();
    }

    public QBudVersionBudget(String variable, String schema, String table) {
        super(QBudVersionBudget.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudVersionBudget(Path<? extends QBudVersionBudget> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_VERSION_BUDGET");
        addMetadata();
    }

    public QBudVersionBudget(PathMetadata metadata) {
        super(QBudVersionBudget.class, metadata, "GFC", "BUD_VERSION_BUDGET");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(idBudVersionBudget, ColumnMetadata.named("ID_BUD_VERSION_BUDGET").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


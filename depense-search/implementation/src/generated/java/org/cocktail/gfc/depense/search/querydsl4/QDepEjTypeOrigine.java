package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepEjTypeOrigine is a Querydsl query type for QDepEjTypeOrigine
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepEjTypeOrigine extends com.querydsl.sql.RelationalPathBase<QDepEjTypeOrigine> {

    private static final long serialVersionUID = -511443077;

    public static final QDepEjTypeOrigine depEjTypeOrigine = new QDepEjTypeOrigine("DEP_EJ_TYPE_ORIGINE");

    public final StringPath code = createString("code");

    public final NumberPath<Long> idDepEjTypeOrigine = createNumber("idDepEjTypeOrigine", Long.class);

    public final com.querydsl.sql.PrimaryKey<QDepEjTypeOrigine> depEjTypeOriginePk = createPrimaryKey(idDepEjTypeOrigine);

    public QDepEjTypeOrigine(String variable) {
        super(QDepEjTypeOrigine.class, forVariable(variable), "GFC", "DEP_EJ_TYPE_ORIGINE");
        addMetadata();
    }

    public QDepEjTypeOrigine(String variable, String schema, String table) {
        super(QDepEjTypeOrigine.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepEjTypeOrigine(Path<? extends QDepEjTypeOrigine> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_EJ_TYPE_ORIGINE");
        addMetadata();
    }

    public QDepEjTypeOrigine(PathMetadata metadata) {
        super(QDepEjTypeOrigine.class, metadata, "GFC", "DEP_EJ_TYPE_ORIGINE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idDepEjTypeOrigine, ColumnMetadata.named("ID_DEP_EJ_TYPE_ORIGINE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


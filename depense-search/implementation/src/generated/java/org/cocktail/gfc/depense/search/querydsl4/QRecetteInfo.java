package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecetteInfo is a Querydsl query type for QRecetteInfo
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecetteInfo extends com.querydsl.sql.RelationalPathBase<QRecetteInfo> {

    private static final long serialVersionUID = -254083404;

    public static final QRecetteInfo recetteInfo = new QRecetteInfo("RECETTE_INFO");

    public final StringPath recEtatRelance = createString("recEtatRelance");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final StringPath recSuivi = createString("recSuivi");

    public final com.querydsl.sql.PrimaryKey<QRecetteInfo> recetteInfoPk = createPrimaryKey(recId);

    public QRecetteInfo(String variable) {
        super(QRecetteInfo.class, forVariable(variable), "GFC", "RECETTE_INFO");
        addMetadata();
    }

    public QRecetteInfo(String variable, String schema, String table) {
        super(QRecetteInfo.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecetteInfo(Path<? extends QRecetteInfo> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RECETTE_INFO");
        addMetadata();
    }

    public QRecetteInfo(PathMetadata metadata) {
        super(QRecetteInfo.class, metadata, "GFC", "RECETTE_INFO");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(recEtatRelance, ColumnMetadata.named("REC_ETAT_RELANCE").withIndex(3).ofType(Types.VARCHAR).withSize(30));
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recSuivi, ColumnMetadata.named("REC_SUIVI").withIndex(2).ofType(Types.VARCHAR).withSize(1000));
    }

}


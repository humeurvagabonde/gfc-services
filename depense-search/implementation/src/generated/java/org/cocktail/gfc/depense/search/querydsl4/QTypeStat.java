package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeStat is a Querydsl query type for QTypeStat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeStat extends com.querydsl.sql.RelationalPathBase<QTypeStat> {

    private static final long serialVersionUID = -1922232712;

    public static final QTypeStat typeStat = new QTypeStat("TYPE_STAT");

    public final NumberPath<Long> axOrdre = createNumber("axOrdre", Long.class);

    public final StringPath tsCommentaire = createString("tsCommentaire");

    public final StringPath tsLibelle = createString("tsLibelle");

    public final StringPath tsLibelleCourt = createString("tsLibelleCourt");

    public final NumberPath<Long> tsOrdre = createNumber("tsOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTypeStat> typeStatPk = createPrimaryKey(tsOrdre);

    public QTypeStat(String variable) {
        super(QTypeStat.class, forVariable(variable), "GFC", "TYPE_STAT");
        addMetadata();
    }

    public QTypeStat(String variable, String schema, String table) {
        super(QTypeStat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeStat(Path<? extends QTypeStat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_STAT");
        addMetadata();
    }

    public QTypeStat(PathMetadata metadata) {
        super(QTypeStat.class, metadata, "GFC", "TYPE_STAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(axOrdre, ColumnMetadata.named("AX_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(22).notNull());
        addMetadata(tsCommentaire, ColumnMetadata.named("TS_COMMENTAIRE").withIndex(2).ofType(Types.VARCHAR).withSize(250));
        addMetadata(tsLibelle, ColumnMetadata.named("TS_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(80));
        addMetadata(tsLibelleCourt, ColumnMetadata.named("TS_LIBELLE_COURT").withIndex(4).ofType(Types.VARCHAR).withSize(10));
        addMetadata(tsOrdre, ColumnMetadata.named("TS_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(22).notNull());
    }

}


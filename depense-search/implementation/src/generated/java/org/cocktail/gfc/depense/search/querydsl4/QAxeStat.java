package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAxeStat is a Querydsl query type for QAxeStat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAxeStat extends com.querydsl.sql.RelationalPathBase<QAxeStat> {

    private static final long serialVersionUID = -1308021896;

    public static final QAxeStat axeStat = new QAxeStat("AXE_STAT");

    public final StringPath axCommentaire = createString("axCommentaire");

    public final StringPath axLibelle = createString("axLibelle");

    public final StringPath axLibelleCourt = createString("axLibelleCourt");

    public final NumberPath<Long> axOrdre = createNumber("axOrdre", Long.class);

    public final NumberPath<Integer> taxOrdre = createNumber("taxOrdre", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QAxeStat> axeStatPk = createPrimaryKey(axOrdre);

    public QAxeStat(String variable) {
        super(QAxeStat.class, forVariable(variable), "GFC", "AXE_STAT");
        addMetadata();
    }

    public QAxeStat(String variable, String schema, String table) {
        super(QAxeStat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAxeStat(Path<? extends QAxeStat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "AXE_STAT");
        addMetadata();
    }

    public QAxeStat(PathMetadata metadata) {
        super(QAxeStat.class, metadata, "GFC", "AXE_STAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(axCommentaire, ColumnMetadata.named("AX_COMMENTAIRE").withIndex(1).ofType(Types.VARCHAR).withSize(250));
        addMetadata(axLibelle, ColumnMetadata.named("AX_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(80).notNull());
        addMetadata(axLibelleCourt, ColumnMetadata.named("AX_LIBELLE_COURT").withIndex(3).ofType(Types.VARCHAR).withSize(10));
        addMetadata(axOrdre, ColumnMetadata.named("AX_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(22).notNull());
        addMetadata(taxOrdre, ColumnMetadata.named("TAX_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(4));
    }

}


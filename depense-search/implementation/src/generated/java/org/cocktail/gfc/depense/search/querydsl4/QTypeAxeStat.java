package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeAxeStat is a Querydsl query type for QTypeAxeStat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeAxeStat extends com.querydsl.sql.RelationalPathBase<QTypeAxeStat> {

    private static final long serialVersionUID = 886379486;

    public static final QTypeAxeStat typeAxeStat = new QTypeAxeStat("TYPE_AXE_STAT");

    public final StringPath taxCommentaire = createString("taxCommentaire");

    public final StringPath taxLibelle = createString("taxLibelle");

    public final NumberPath<Integer> taxOrdre = createNumber("taxOrdre", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QTypeAxeStat> typeAxeStatPk = createPrimaryKey(taxOrdre);

    public QTypeAxeStat(String variable) {
        super(QTypeAxeStat.class, forVariable(variable), "GFC", "TYPE_AXE_STAT");
        addMetadata();
    }

    public QTypeAxeStat(String variable, String schema, String table) {
        super(QTypeAxeStat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeAxeStat(Path<? extends QTypeAxeStat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_AXE_STAT");
        addMetadata();
    }

    public QTypeAxeStat(PathMetadata metadata) {
        super(QTypeAxeStat.class, metadata, "GFC", "TYPE_AXE_STAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(taxCommentaire, ColumnMetadata.named("TAX_COMMENTAIRE").withIndex(3).ofType(Types.VARCHAR).withSize(128));
        addMetadata(taxLibelle, ColumnMetadata.named("TAX_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(30));
        addMetadata(taxOrdre, ColumnMetadata.named("TAX_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
    }

}


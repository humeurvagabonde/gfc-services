package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXlabMarche is a Querydsl query type for QXlabMarche
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXlabMarche extends com.querydsl.sql.RelationalPathBase<QXlabMarche> {

    private static final long serialVersionUID = 1877595201;

    public static final QXlabMarche xlabMarche = new QXlabMarche("XLAB_MARCHE");

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Long> xfouOrdre = createNumber("xfouOrdre", Long.class);

    public final StringPath xmarCode = createString("xmarCode");

    public final NumberPath<Long> xmarId = createNumber("xmarId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QXlabMarche> xlabMarchePk = createPrimaryKey(xmarId);

    public QXlabMarche(String variable) {
        super(QXlabMarche.class, forVariable(variable), "GFC", "XLAB_MARCHE");
        addMetadata();
    }

    public QXlabMarche(String variable, String schema, String table) {
        super(QXlabMarche.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXlabMarche(Path<? extends QXlabMarche> path) {
        super(path.getType(), path.getMetadata(), "GFC", "XLAB_MARCHE");
        addMetadata();
    }

    public QXlabMarche(PathMetadata metadata) {
        super(QXlabMarche.class, metadata, "GFC", "XLAB_MARCHE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(xfouOrdre, ColumnMetadata.named("XFOU_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(xmarCode, ColumnMetadata.named("XMAR_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(7).notNull());
        addMetadata(xmarId, ColumnMetadata.named("XMAR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


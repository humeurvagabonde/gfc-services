package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBordereauRejet is a Querydsl query type for QBordereauRejet
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBordereauRejet extends com.querydsl.sql.RelationalPathBase<QBordereauRejet> {

    private static final long serialVersionUID = 906489379;

    public static final QBordereauRejet bordereauRejet = new QBordereauRejet("BORDEREAU_REJET");

    public final StringPath brjEtat = createString("brjEtat");

    public final NumberPath<Long> brjNum = createNumber("brjNum", Long.class);

    public final NumberPath<Long> brjOrdre = createNumber("brjOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> tboOrdre = createNumber("tboOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBordereauRejet> bordereauRejetPk = createPrimaryKey(brjOrdre);

    public QBordereauRejet(String variable) {
        super(QBordereauRejet.class, forVariable(variable), "GFC", "BORDEREAU_REJET");
        addMetadata();
    }

    public QBordereauRejet(String variable, String schema, String table) {
        super(QBordereauRejet.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBordereauRejet(Path<? extends QBordereauRejet> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BORDEREAU_REJET");
        addMetadata();
    }

    public QBordereauRejet(PathMetadata metadata) {
        super(QBordereauRejet.class, metadata, "GFC", "BORDEREAU_REJET");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(brjEtat, ColumnMetadata.named("BRJ_ETAT").withIndex(2).ofType(Types.VARCHAR).withSize(20));
        addMetadata(brjNum, ColumnMetadata.named("BRJ_NUM").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(brjOrdre, ColumnMetadata.named("BRJ_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(4));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(tboOrdre, ColumnMetadata.named("TBO_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecParametres is a Querydsl query type for QRecParametres
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecParametres extends com.querydsl.sql.RelationalPathBase<QRecParametres> {

    private static final long serialVersionUID = -1265209782;

    public static final QRecParametres recParametres = new QRecParametres("REC_PARAMETRES");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath parDescription = createString("parDescription");

    public final StringPath parKey = createString("parKey");

    public final NumberPath<Long> parOrdre = createNumber("parOrdre", Long.class);

    public final StringPath parValue = createString("parValue");

    public final com.querydsl.sql.PrimaryKey<QRecParametres> recParametresPk = createPrimaryKey(parOrdre);

    public QRecParametres(String variable) {
        super(QRecParametres.class, forVariable(variable), "GFC", "REC_PARAMETRES");
        addMetadata();
    }

    public QRecParametres(String variable, String schema, String table) {
        super(QRecParametres.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecParametres(Path<? extends QRecParametres> path) {
        super(path.getType(), path.getMetadata(), "GFC", "REC_PARAMETRES");
        addMetadata();
    }

    public QRecParametres(PathMetadata metadata) {
        super(QRecParametres.class, metadata, "GFC", "REC_PARAMETRES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(4));
        addMetadata(parDescription, ColumnMetadata.named("PAR_DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(300));
        addMetadata(parKey, ColumnMetadata.named("PAR_KEY").withIndex(2).ofType(Types.VARCHAR).withSize(80));
        addMetadata(parOrdre, ColumnMetadata.named("PAR_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(parValue, ColumnMetadata.named("PAR_VALUE").withIndex(3).ofType(Types.VARCHAR).withSize(500));
    }

}


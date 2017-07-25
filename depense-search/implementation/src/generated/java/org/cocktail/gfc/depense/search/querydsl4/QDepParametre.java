package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepParametre is a Querydsl query type for QDepParametre
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepParametre extends com.querydsl.sql.RelationalPathBase<QDepParametre> {

    private static final long serialVersionUID = -661868886;

    public static final QDepParametre depParametre = new QDepParametre("DEP_PARAMETRE");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath parDescription = createString("parDescription");

    public final StringPath parKey = createString("parKey");

    public final StringPath parValue = createString("parValue");

    public QDepParametre(String variable) {
        super(QDepParametre.class, forVariable(variable), "GFC", "DEP_PARAMETRE");
        addMetadata();
    }

    public QDepParametre(String variable, String schema, String table) {
        super(QDepParametre.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepParametre(Path<? extends QDepParametre> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_PARAMETRE");
        addMetadata();
    }

    public QDepParametre(PathMetadata metadata) {
        super(QDepParametre.class, metadata, "GFC", "DEP_PARAMETRE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(parDescription, ColumnMetadata.named("PAR_DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(200));
        addMetadata(parKey, ColumnMetadata.named("PAR_KEY").withIndex(2).ofType(Types.VARCHAR).withSize(2000).notNull());
        addMetadata(parValue, ColumnMetadata.named("PAR_VALUE").withIndex(3).ofType(Types.VARCHAR).withSize(2000));
    }

}


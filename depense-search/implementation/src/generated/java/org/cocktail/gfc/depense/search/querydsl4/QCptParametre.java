package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptParametre is a Querydsl query type for QCptParametre
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptParametre extends com.querydsl.sql.RelationalPathBase<QCptParametre> {

    private static final long serialVersionUID = 131365906;

    public static final QCptParametre cptParametre = new QCptParametre("CPT_PARAMETRE");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath parDescription = createString("parDescription");

    public final StringPath parKey = createString("parKey");

    public final NumberPath<Long> parOrdre = createNumber("parOrdre", Long.class);

    public final StringPath parValue = createString("parValue");

    public final com.querydsl.sql.PrimaryKey<QCptParametre> cptParametrePk = createPrimaryKey(parOrdre);

    public QCptParametre(String variable) {
        super(QCptParametre.class, forVariable(variable), "GFC", "CPT_PARAMETRE");
        addMetadata();
    }

    public QCptParametre(String variable, String schema, String table) {
        super(QCptParametre.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptParametre(Path<? extends QCptParametre> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_PARAMETRE");
        addMetadata();
    }

    public QCptParametre(PathMetadata metadata) {
        super(QCptParametre.class, metadata, "GFC", "CPT_PARAMETRE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(4));
        addMetadata(parDescription, ColumnMetadata.named("PAR_DESCRIPTION").withIndex(1).ofType(Types.VARCHAR).withSize(300));
        addMetadata(parKey, ColumnMetadata.named("PAR_KEY").withIndex(2).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(parOrdre, ColumnMetadata.named("PAR_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(parValue, ColumnMetadata.named("PAR_VALUE").withIndex(4).ofType(Types.VARCHAR).withSize(500));
    }

}


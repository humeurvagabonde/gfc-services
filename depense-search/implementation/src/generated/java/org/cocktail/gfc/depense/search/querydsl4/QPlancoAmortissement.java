package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPlancoAmortissement is a Querydsl query type for QPlancoAmortissement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPlancoAmortissement extends com.querydsl.sql.RelationalPathBase<QPlancoAmortissement> {

    private static final long serialVersionUID = -290735296;

    public static final QPlancoAmortissement plancoAmortissement = new QPlancoAmortissement("PLANCO_AMORTISSEMENT");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> pcaDuree = createNumber("pcaDuree", Long.class);

    public final NumberPath<Long> pcaId = createNumber("pcaId", Long.class);

    public final NumberPath<Long> pcoaId = createNumber("pcoaId", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final com.querydsl.sql.PrimaryKey<QPlancoAmortissement> plancoAmortissementPk = createPrimaryKey(pcaId);

    public QPlancoAmortissement(String variable) {
        super(QPlancoAmortissement.class, forVariable(variable), "GFC", "PLANCO_AMORTISSEMENT");
        addMetadata();
    }

    public QPlancoAmortissement(String variable, String schema, String table) {
        super(QPlancoAmortissement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPlancoAmortissement(Path<? extends QPlancoAmortissement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PLANCO_AMORTISSEMENT");
        addMetadata();
    }

    public QPlancoAmortissement(PathMetadata metadata) {
        super(QPlancoAmortissement.class, metadata, "GFC", "PLANCO_AMORTISSEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(pcaDuree, ColumnMetadata.named("PCA_DUREE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pcaId, ColumnMetadata.named("PCA_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pcoaId, ColumnMetadata.named("PCOA_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


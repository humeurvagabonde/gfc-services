package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCodeMarchePlanco is a Querydsl query type for QCodeMarchePlanco
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCodeMarchePlanco extends com.querydsl.sql.RelationalPathBase<QCodeMarchePlanco> {

    private static final long serialVersionUID = -1055868722;

    public static final QCodeMarchePlanco codeMarchePlanco = new QCodeMarchePlanco("CODE_MARCHE_PLANCO");

    public final NumberPath<Long> ceOrdre = createNumber("ceOrdre", Long.class);

    public final NumberPath<Long> cmpcoOrdre = createNumber("cmpcoOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final com.querydsl.sql.PrimaryKey<QCodeMarchePlanco> codeMarchePlancoPk = createPrimaryKey(cmpcoOrdre);

    public QCodeMarchePlanco(String variable) {
        super(QCodeMarchePlanco.class, forVariable(variable), "GFC", "CODE_MARCHE_PLANCO");
        addMetadata();
    }

    public QCodeMarchePlanco(String variable, String schema, String table) {
        super(QCodeMarchePlanco.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCodeMarchePlanco(Path<? extends QCodeMarchePlanco> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CODE_MARCHE_PLANCO");
        addMetadata();
    }

    public QCodeMarchePlanco(PathMetadata metadata) {
        super(QCodeMarchePlanco.class, metadata, "GFC", "CODE_MARCHE_PLANCO");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ceOrdre, ColumnMetadata.named("CE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(cmpcoOrdre, ColumnMetadata.named("CMPCO_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


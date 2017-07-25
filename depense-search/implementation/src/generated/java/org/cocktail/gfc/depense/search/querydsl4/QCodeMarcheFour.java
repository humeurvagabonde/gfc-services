package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCodeMarcheFour is a Querydsl query type for QCodeMarcheFour
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCodeMarcheFour extends com.querydsl.sql.RelationalPathBase<QCodeMarcheFour> {

    private static final long serialVersionUID = 481287903;

    public static final QCodeMarcheFour codeMarcheFour = new QCodeMarcheFour("CODE_MARCHE_FOUR");

    public final NumberPath<Long> ceOrdre = createNumber("ceOrdre", Long.class);

    public final NumberPath<Long> cmfOrdre = createNumber("cmfOrdre", Long.class);

    public final StringPath cmfOrigine = createString("cmfOrigine");

    public final StringPath cmfSuppr = createString("cmfSuppr");

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCodeMarcheFour> codeMarcheFourPk = createPrimaryKey(cmfOrdre);

    public QCodeMarcheFour(String variable) {
        super(QCodeMarcheFour.class, forVariable(variable), "GFC", "CODE_MARCHE_FOUR");
        addMetadata();
    }

    public QCodeMarcheFour(String variable, String schema, String table) {
        super(QCodeMarcheFour.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCodeMarcheFour(Path<? extends QCodeMarcheFour> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CODE_MARCHE_FOUR");
        addMetadata();
    }

    public QCodeMarcheFour(PathMetadata metadata) {
        super(QCodeMarcheFour.class, metadata, "GFC", "CODE_MARCHE_FOUR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ceOrdre, ColumnMetadata.named("CE_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(cmfOrdre, ColumnMetadata.named("CMF_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(cmfOrigine, ColumnMetadata.named("CMF_ORIGINE").withIndex(2).ofType(Types.VARCHAR).withSize(25));
        addMetadata(cmfSuppr, ColumnMetadata.named("CMF_SUPPR").withIndex(3).ofType(Types.VARCHAR).withSize(1));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


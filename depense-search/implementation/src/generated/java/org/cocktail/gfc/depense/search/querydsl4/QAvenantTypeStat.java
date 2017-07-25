package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvenantTypeStat is a Querydsl query type for QAvenantTypeStat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvenantTypeStat extends com.querydsl.sql.RelationalPathBase<QAvenantTypeStat> {

    private static final long serialVersionUID = -636564403;

    public static final QAvenantTypeStat avenantTypeStat = new QAvenantTypeStat("AVENANT_TYPE_STAT");

    public final NumberPath<Long> atOrdre = createNumber("atOrdre", Long.class);

    public final NumberPath<Long> avtOrdre = createNumber("avtOrdre", Long.class);

    public final NumberPath<Long> tsOrdre = createNumber("tsOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAvenantTypeStat> avenantTypeStatPk = createPrimaryKey(atOrdre);

    public QAvenantTypeStat(String variable) {
        super(QAvenantTypeStat.class, forVariable(variable), "GFC", "AVENANT_TYPE_STAT");
        addMetadata();
    }

    public QAvenantTypeStat(String variable, String schema, String table) {
        super(QAvenantTypeStat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvenantTypeStat(Path<? extends QAvenantTypeStat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "AVENANT_TYPE_STAT");
        addMetadata();
    }

    public QAvenantTypeStat(PathMetadata metadata) {
        super(QAvenantTypeStat.class, metadata, "GFC", "AVENANT_TYPE_STAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(atOrdre, ColumnMetadata.named("AT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(avtOrdre, ColumnMetadata.named("AVT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(tsOrdre, ColumnMetadata.named("TS_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


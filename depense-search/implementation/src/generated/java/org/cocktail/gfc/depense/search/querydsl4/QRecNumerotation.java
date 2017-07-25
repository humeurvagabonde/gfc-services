package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecNumerotation is a Querydsl query type for QRecNumerotation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecNumerotation extends com.querydsl.sql.RelationalPathBase<QRecNumerotation> {

    private static final long serialVersionUID = 508334531;

    public static final QRecNumerotation recNumerotation = new QRecNumerotation("REC_NUMEROTATION");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> numId = createNumber("numId", Long.class);

    public final NumberPath<Long> numNumero = createNumber("numNumero", Long.class);

    public final NumberPath<Long> tnuId = createNumber("tnuId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRecNumerotation> numerotationPk = createPrimaryKey(numId);

    public QRecNumerotation(String variable) {
        super(QRecNumerotation.class, forVariable(variable), "GFC", "REC_NUMEROTATION");
        addMetadata();
    }

    public QRecNumerotation(String variable, String schema, String table) {
        super(QRecNumerotation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecNumerotation(Path<? extends QRecNumerotation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "REC_NUMEROTATION");
        addMetadata();
    }

    public QRecNumerotation(PathMetadata metadata) {
        super(QRecNumerotation.class, metadata, "GFC", "REC_NUMEROTATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(10));
        addMetadata(numId, ColumnMetadata.named("NUM_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(numNumero, ColumnMetadata.named("NUM_NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tnuId, ColumnMetadata.named("TNU_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


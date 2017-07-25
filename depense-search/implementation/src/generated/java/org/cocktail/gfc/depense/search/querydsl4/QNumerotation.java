package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QNumerotation is a Querydsl query type for QNumerotation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QNumerotation extends com.querydsl.sql.RelationalPathBase<QNumerotation> {

    private static final long serialVersionUID = 664011495;

    public static final QNumerotation numerotation = new QNumerotation("NUMEROTATION");

    public final NumberPath<Long> comOrdre = createNumber("comOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> numNumero = createNumber("numNumero", Long.class);

    public final NumberPath<Long> numOrdre = createNumber("numOrdre", Long.class);

    public final NumberPath<Long> tnuOrdre = createNumber("tnuOrdre", Long.class);

    public QNumerotation(String variable) {
        super(QNumerotation.class, forVariable(variable), "GFC", "NUMEROTATION");
        addMetadata();
    }

    public QNumerotation(String variable, String schema, String table) {
        super(QNumerotation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNumerotation(Path<? extends QNumerotation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "NUMEROTATION");
        addMetadata();
    }

    public QNumerotation(PathMetadata metadata) {
        super(QNumerotation.class, metadata, "GFC", "NUMEROTATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(comOrdre, ColumnMetadata.named("COM_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(10));
        addMetadata(numNumero, ColumnMetadata.named("NUM_NUMERO").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(numOrdre, ColumnMetadata.named("NUM_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tnuOrdre, ColumnMetadata.named("TNU_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


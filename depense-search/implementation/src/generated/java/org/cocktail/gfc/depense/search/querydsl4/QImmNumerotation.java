package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QImmNumerotation is a Querydsl query type for QImmNumerotation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QImmNumerotation extends com.querydsl.sql.RelationalPathBase<QImmNumerotation> {

    private static final long serialVersionUID = 1436705660;

    public static final QImmNumerotation immNumerotation = new QImmNumerotation("IMM_NUMEROTATION");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> numNumero = createNumber("numNumero", Long.class);

    public final NumberPath<Long> numOrdre = createNumber("numOrdre", Long.class);

    public final NumberPath<Long> tnuOrdre = createNumber("tnuOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QImmNumerotation> immNumerotationPk = createPrimaryKey(numOrdre);

    public QImmNumerotation(String variable) {
        super(QImmNumerotation.class, forVariable(variable), "GFC", "IMM_NUMEROTATION");
        addMetadata();
    }

    public QImmNumerotation(String variable, String schema, String table) {
        super(QImmNumerotation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QImmNumerotation(Path<? extends QImmNumerotation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "IMM_NUMEROTATION");
        addMetadata();
    }

    public QImmNumerotation(PathMetadata metadata) {
        super(QImmNumerotation.class, metadata, "GFC", "IMM_NUMEROTATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(numNumero, ColumnMetadata.named("NUM_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(numOrdre, ColumnMetadata.named("NUM_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tnuOrdre, ColumnMetadata.named("TNU_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


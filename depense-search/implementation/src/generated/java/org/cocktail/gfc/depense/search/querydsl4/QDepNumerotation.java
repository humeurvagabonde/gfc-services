package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepNumerotation is a Querydsl query type for QDepNumerotation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepNumerotation extends com.querydsl.sql.RelationalPathBase<QDepNumerotation> {

    private static final long serialVersionUID = 1358173890;

    public static final QDepNumerotation depNumerotation = new QDepNumerotation("DEP_NUMEROTATION");

    public final StringPath cr = createString("cr");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> numId = createNumber("numId", Long.class);

    public final NumberPath<Long> numNumero = createNumber("numNumero", Long.class);

    public final NumberPath<Long> tnuId = createNumber("tnuId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QDepNumerotation> sysC0022442 = createPrimaryKey(numId);

    public QDepNumerotation(String variable) {
        super(QDepNumerotation.class, forVariable(variable), "GFC", "DEP_NUMEROTATION");
        addMetadata();
    }

    public QDepNumerotation(String variable, String schema, String table) {
        super(QDepNumerotation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepNumerotation(Path<? extends QDepNumerotation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_NUMEROTATION");
        addMetadata();
    }

    public QDepNumerotation(PathMetadata metadata) {
        super(QDepNumerotation.class, metadata, "GFC", "DEP_NUMEROTATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cr, ColumnMetadata.named("CR").withIndex(5).ofType(Types.VARCHAR).withSize(50));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(10));
        addMetadata(numId, ColumnMetadata.named("NUM_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(numNumero, ColumnMetadata.named("NUM_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tnuId, ColumnMetadata.named("TNU_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


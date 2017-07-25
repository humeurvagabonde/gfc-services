package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRetenue is a Querydsl query type for QRetenue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRetenue extends com.querydsl.sql.RelationalPathBase<QRetenue> {

    private static final long serialVersionUID = 365068816;

    public static final QRetenue retenue = new QRetenue("RETENUE");

    public final NumberPath<Long> comOrdre = createNumber("comOrdre", Long.class);

    public final NumberPath<Long> depId = createNumber("depId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final DateTimePath<java.sql.Timestamp> retDate = createDateTime("retDate", java.sql.Timestamp.class);

    public final NumberPath<Long> retId = createNumber("retId", Long.class);

    public final StringPath retLibelle = createString("retLibelle");

    public final NumberPath<java.math.BigDecimal> retMontant = createNumber("retMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> retNumero = createNumber("retNumero", Long.class);

    public final NumberPath<Long> treOrdre = createNumber("treOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRetenue> retenuePk = createPrimaryKey(retId);

    public QRetenue(String variable) {
        super(QRetenue.class, forVariable(variable), "GFC", "RETENUE");
        addMetadata();
    }

    public QRetenue(String variable, String schema, String table) {
        super(QRetenue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRetenue(Path<? extends QRetenue> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RETENUE");
        addMetadata();
    }

    public QRetenue(PathMetadata metadata) {
        super(QRetenue.class, metadata, "GFC", "RETENUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(comOrdre, ColumnMetadata.named("COM_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(depId, ColumnMetadata.named("DEP_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4));
        addMetadata(retDate, ColumnMetadata.named("RET_DATE").withIndex(6).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(retId, ColumnMetadata.named("RET_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(retLibelle, ColumnMetadata.named("RET_LIBELLE").withIndex(8).ofType(Types.VARCHAR).withSize(2000).notNull());
        addMetadata(retMontant, ColumnMetadata.named("RET_MONTANT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(retNumero, ColumnMetadata.named("RET_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(treOrdre, ColumnMetadata.named("TRE_ORDRE").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


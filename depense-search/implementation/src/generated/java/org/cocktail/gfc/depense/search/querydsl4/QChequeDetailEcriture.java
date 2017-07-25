package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QChequeDetailEcriture is a Querydsl query type for QChequeDetailEcriture
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QChequeDetailEcriture extends com.querydsl.sql.RelationalPathBase<QChequeDetailEcriture> {

    private static final long serialVersionUID = 443652101;

    public static final QChequeDetailEcriture chequeDetailEcriture = new QChequeDetailEcriture("CHEQUE_DETAIL_ECRITURE");

    public final DateTimePath<java.sql.Timestamp> cdeDate = createDateTime("cdeDate", java.sql.Timestamp.class);

    public final NumberPath<Long> cdeOrdre = createNumber("cdeOrdre", Long.class);

    public final NumberPath<Long> cheOrdre = createNumber("cheOrdre", Long.class);

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QChequeDetailEcriture> chequeDetailEcriturePk = createPrimaryKey(cdeOrdre);

    public QChequeDetailEcriture(String variable) {
        super(QChequeDetailEcriture.class, forVariable(variable), "GFC", "CHEQUE_DETAIL_ECRITURE");
        addMetadata();
    }

    public QChequeDetailEcriture(String variable, String schema, String table) {
        super(QChequeDetailEcriture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QChequeDetailEcriture(Path<? extends QChequeDetailEcriture> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CHEQUE_DETAIL_ECRITURE");
        addMetadata();
    }

    public QChequeDetailEcriture(PathMetadata metadata) {
        super(QChequeDetailEcriture.class, metadata, "GFC", "CHEQUE_DETAIL_ECRITURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cdeDate, ColumnMetadata.named("CDE_DATE").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(cdeOrdre, ColumnMetadata.named("CDE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(cheOrdre, ColumnMetadata.named("CHE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(4));
    }

}


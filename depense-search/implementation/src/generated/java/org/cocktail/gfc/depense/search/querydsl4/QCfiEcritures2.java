package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCfiEcritures2 is a Querydsl query type for QCfiEcritures2
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCfiEcritures2 extends com.querydsl.sql.RelationalPathBase<QCfiEcritures2> {

    private static final long serialVersionUID = -1654912348;

    public static final QCfiEcritures2 cfiEcritures2 = new QCfiEcritures2("CFI_ECRITURES_2");

    public final NumberPath<Long> credit = createNumber("credit", Long.class);

    public final NumberPath<Long> debit = createNumber("debit", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath pcoLibelle = createString("pcoLibelle");

    public final StringPath pcoNum = createString("pcoNum");

    public QCfiEcritures2(String variable) {
        super(QCfiEcritures2.class, forVariable(variable), "GFC", "CFI_ECRITURES_2");
        addMetadata();
    }

    public QCfiEcritures2(String variable, String schema, String table) {
        super(QCfiEcritures2.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCfiEcritures2(Path<? extends QCfiEcritures2> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CFI_ECRITURES_2");
        addMetadata();
    }

    public QCfiEcritures2(PathMetadata metadata) {
        super(QCfiEcritures2.class, metadata, "GFC", "CFI_ECRITURES_2");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(credit, ColumnMetadata.named("CREDIT").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(debit, ColumnMetadata.named("DEBIT").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(10));
        addMetadata(pcoLibelle, ColumnMetadata.named("PCO_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(3).ofType(Types.VARCHAR).withSize(20));
    }

}


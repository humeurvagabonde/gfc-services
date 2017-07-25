package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCfiEcritures is a Querydsl query type for QCfiEcritures
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCfiEcritures extends com.querydsl.sql.RelationalPathBase<QCfiEcritures> {

    private static final long serialVersionUID = 916447054;

    public static final QCfiEcritures cfiEcritures = new QCfiEcritures("CFI_ECRITURES");

    public final NumberPath<Long> credit = createNumber("credit", Long.class);

    public final NumberPath<Long> debit = createNumber("debit", Long.class);

    public final StringPath ecrSacd = createString("ecrSacd");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath pcoLibelle = createString("pcoLibelle");

    public final StringPath pcoNum = createString("pcoNum");

    public QCfiEcritures(String variable) {
        super(QCfiEcritures.class, forVariable(variable), "GFC", "CFI_ECRITURES");
        addMetadata();
    }

    public QCfiEcritures(String variable, String schema, String table) {
        super(QCfiEcritures.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCfiEcritures(Path<? extends QCfiEcritures> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CFI_ECRITURES");
        addMetadata();
    }

    public QCfiEcritures(PathMetadata metadata) {
        super(QCfiEcritures.class, metadata, "GFC", "CFI_ECRITURES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(credit, ColumnMetadata.named("CREDIT").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(debit, ColumnMetadata.named("DEBIT").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ecrSacd, ColumnMetadata.named("ECR_SACD").withIndex(5).ofType(Types.VARCHAR).withSize(1));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(10));
        addMetadata(pcoLibelle, ColumnMetadata.named("PCO_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(3).ofType(Types.VARCHAR).withSize(20));
    }

}


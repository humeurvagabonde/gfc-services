package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCfiSolde67 is a Querydsl query type for QCfiSolde67
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCfiSolde67 extends com.querydsl.sql.RelationalPathBase<QCfiSolde67> {

    private static final long serialVersionUID = 1282296982;

    public static final QCfiSolde67 cfiSolde67 = new QCfiSolde67("CFI_SOLDE_6_7");

    public final NumberPath<Long> credit = createNumber("credit", Long.class);

    public final NumberPath<Long> debit = createNumber("debit", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> soldeCrediteur = createNumber("soldeCrediteur", Long.class);

    public QCfiSolde67(String variable) {
        super(QCfiSolde67.class, forVariable(variable), "GFC", "CFI_SOLDE_6_7");
        addMetadata();
    }

    public QCfiSolde67(String variable, String schema, String table) {
        super(QCfiSolde67.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCfiSolde67(Path<? extends QCfiSolde67> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CFI_SOLDE_6_7");
        addMetadata();
    }

    public QCfiSolde67(PathMetadata metadata) {
        super(QCfiSolde67.class, metadata, "GFC", "CFI_SOLDE_6_7");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(credit, ColumnMetadata.named("CREDIT").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(debit, ColumnMetadata.named("DEBIT").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(10));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(1).ofType(Types.VARCHAR).withSize(20));
        addMetadata(soldeCrediteur, ColumnMetadata.named("SOLDE_CREDITEUR").withIndex(6).ofType(Types.DECIMAL).withSize(0));
    }

}


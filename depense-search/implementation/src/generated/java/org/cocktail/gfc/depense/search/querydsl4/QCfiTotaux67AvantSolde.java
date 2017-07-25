package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCfiTotaux67AvantSolde is a Querydsl query type for QCfiTotaux67AvantSolde
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCfiTotaux67AvantSolde extends com.querydsl.sql.RelationalPathBase<QCfiTotaux67AvantSolde> {

    private static final long serialVersionUID = 382528775;

    public static final QCfiTotaux67AvantSolde cfiTotaux67AvantSolde = new QCfiTotaux67AvantSolde("CFI_TOTAUX_6_7_AVANT_SOLDE");

    public final NumberPath<Long> credit = createNumber("credit", Long.class);

    public final NumberPath<Long> debit = createNumber("debit", Long.class);

    public final StringPath ecrSacd = createString("ecrSacd");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath pcoNum = createString("pcoNum");

    public QCfiTotaux67AvantSolde(String variable) {
        super(QCfiTotaux67AvantSolde.class, forVariable(variable), "GFC", "CFI_TOTAUX_6_7_AVANT_SOLDE");
        addMetadata();
    }

    public QCfiTotaux67AvantSolde(String variable, String schema, String table) {
        super(QCfiTotaux67AvantSolde.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCfiTotaux67AvantSolde(Path<? extends QCfiTotaux67AvantSolde> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CFI_TOTAUX_6_7_AVANT_SOLDE");
        addMetadata();
    }

    public QCfiTotaux67AvantSolde(PathMetadata metadata) {
        super(QCfiTotaux67AvantSolde.class, metadata, "GFC", "CFI_TOTAUX_6_7_AVANT_SOLDE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(credit, ColumnMetadata.named("CREDIT").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(debit, ColumnMetadata.named("DEBIT").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ecrSacd, ColumnMetadata.named("ECR_SACD").withIndex(6).ofType(Types.VARCHAR).withSize(1));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(10));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(1).ofType(Types.VARCHAR).withSize(20));
    }

}


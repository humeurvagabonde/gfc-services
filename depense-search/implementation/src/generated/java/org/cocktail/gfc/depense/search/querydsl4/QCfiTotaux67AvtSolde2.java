package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCfiTotaux67AvtSolde2 is a Querydsl query type for QCfiTotaux67AvtSolde2
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCfiTotaux67AvtSolde2 extends com.querydsl.sql.RelationalPathBase<QCfiTotaux67AvtSolde2> {

    private static final long serialVersionUID = -1774567016;

    public static final QCfiTotaux67AvtSolde2 cfiTotaux67AvtSolde2 = new QCfiTotaux67AvtSolde2("CFI_TOTAUX_6_7_AVT_SOLDE_2");

    public final NumberPath<Long> credit = createNumber("credit", Long.class);

    public final NumberPath<Long> debit = createNumber("debit", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath pcoNum = createString("pcoNum");

    public QCfiTotaux67AvtSolde2(String variable) {
        super(QCfiTotaux67AvtSolde2.class, forVariable(variable), "GFC", "CFI_TOTAUX_6_7_AVT_SOLDE_2");
        addMetadata();
    }

    public QCfiTotaux67AvtSolde2(String variable, String schema, String table) {
        super(QCfiTotaux67AvtSolde2.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCfiTotaux67AvtSolde2(Path<? extends QCfiTotaux67AvtSolde2> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CFI_TOTAUX_6_7_AVT_SOLDE_2");
        addMetadata();
    }

    public QCfiTotaux67AvtSolde2(PathMetadata metadata) {
        super(QCfiTotaux67AvtSolde2.class, metadata, "GFC", "CFI_TOTAUX_6_7_AVT_SOLDE_2");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(credit, ColumnMetadata.named("CREDIT").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(debit, ColumnMetadata.named("DEBIT").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(10));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(1).ofType(Types.VARCHAR).withSize(20));
    }

}


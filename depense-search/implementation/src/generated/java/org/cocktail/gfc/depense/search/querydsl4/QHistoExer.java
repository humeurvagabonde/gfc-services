package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QHistoExer is a Querydsl query type for QHistoExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QHistoExer extends com.querydsl.sql.RelationalPathBase<QHistoExer> {

    private static final long serialVersionUID = 1756212035;

    public static final QHistoExer histoExer = new QHistoExer("HISTO_EXER");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath hstExer = createString("hstExer");

    public final NumberPath<java.math.BigDecimal> hstHt = createNumber("hstHt", java.math.BigDecimal.class);

    public final NumberPath<Long> hstOrdre = createNumber("hstOrdre", Long.class);

    public final StringPath hstValide = createString("hstValide");

    public final NumberPath<Long> lotOrdre = createNumber("lotOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QHistoExer> histoExerPk = createPrimaryKey(hstOrdre);

    public QHistoExer(String variable) {
        super(QHistoExer.class, forVariable(variable), "GFC", "HISTO_EXER");
        addMetadata();
    }

    public QHistoExer(String variable, String schema, String table) {
        super(QHistoExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QHistoExer(Path<? extends QHistoExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "HISTO_EXER");
        addMetadata();
    }

    public QHistoExer(PathMetadata metadata) {
        super(QHistoExer.class, metadata, "GFC", "HISTO_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(hstExer, ColumnMetadata.named("HST_EXER").withIndex(3).ofType(Types.VARCHAR).withSize(4));
        addMetadata(hstHt, ColumnMetadata.named("HST_HT").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(hstOrdre, ColumnMetadata.named("HST_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(22).notNull());
        addMetadata(hstValide, ColumnMetadata.named("HST_VALIDE").withIndex(5).ofType(Types.VARCHAR).withSize(1));
        addMetadata(lotOrdre, ColumnMetadata.named("LOT_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(22).notNull());
    }

}


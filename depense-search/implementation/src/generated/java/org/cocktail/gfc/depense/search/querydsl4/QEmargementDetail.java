package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEmargementDetail is a Querydsl query type for QEmargementDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEmargementDetail extends com.querydsl.sql.RelationalPathBase<QEmargementDetail> {

    private static final long serialVersionUID = 976421840;

    public static final QEmargementDetail emargementDetail = new QEmargementDetail("EMARGEMENT_DETAIL");

    public final NumberPath<Long> ecdOrdreDestination = createNumber("ecdOrdreDestination", Long.class);

    public final NumberPath<Long> ecdOrdreSource = createNumber("ecdOrdreSource", Long.class);

    public final NumberPath<Long> emaOrdre = createNumber("emaOrdre", Long.class);

    public final NumberPath<java.math.BigDecimal> emdMontant = createNumber("emdMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> emdOrdre = createNumber("emdOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QEmargementDetail> emargementDetailPk = createPrimaryKey(emdOrdre);

    public QEmargementDetail(String variable) {
        super(QEmargementDetail.class, forVariable(variable), "GFC", "EMARGEMENT_DETAIL");
        addMetadata();
    }

    public QEmargementDetail(String variable, String schema, String table) {
        super(QEmargementDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEmargementDetail(Path<? extends QEmargementDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EMARGEMENT_DETAIL");
        addMetadata();
    }

    public QEmargementDetail(PathMetadata metadata) {
        super(QEmargementDetail.class, metadata, "GFC", "EMARGEMENT_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdOrdreDestination, ColumnMetadata.named("ECD_ORDRE_DESTINATION").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ecdOrdreSource, ColumnMetadata.named("ECD_ORDRE_SOURCE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(emaOrdre, ColumnMetadata.named("EMA_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(emdMontant, ColumnMetadata.named("EMD_MONTANT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(emdOrdre, ColumnMetadata.named("EMD_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
    }

}


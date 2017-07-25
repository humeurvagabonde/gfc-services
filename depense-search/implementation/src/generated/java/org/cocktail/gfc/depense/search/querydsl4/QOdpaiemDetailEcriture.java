package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOdpaiemDetailEcriture is a Querydsl query type for QOdpaiemDetailEcriture
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOdpaiemDetailEcriture extends com.querydsl.sql.RelationalPathBase<QOdpaiemDetailEcriture> {

    private static final long serialVersionUID = -1409507685;

    public static final QOdpaiemDetailEcriture odpaiemDetailEcriture = new QOdpaiemDetailEcriture("ODPAIEM_DETAIL_ECRITURE");

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<Long> odpOrdre = createNumber("odpOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> opeDate = createDateTime("opeDate", java.sql.Timestamp.class);

    public final NumberPath<Long> opeOrdre = createNumber("opeOrdre", Long.class);

    public final StringPath opeOrigine = createString("opeOrigine");

    public final com.querydsl.sql.PrimaryKey<QOdpaiemDetailEcriture> odpaiemDetailEcriturePk = createPrimaryKey(opeOrdre);

    public QOdpaiemDetailEcriture(String variable) {
        super(QOdpaiemDetailEcriture.class, forVariable(variable), "GFC", "ODPAIEM_DETAIL_ECRITURE");
        addMetadata();
    }

    public QOdpaiemDetailEcriture(String variable, String schema, String table) {
        super(QOdpaiemDetailEcriture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOdpaiemDetailEcriture(Path<? extends QOdpaiemDetailEcriture> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ODPAIEM_DETAIL_ECRITURE");
        addMetadata();
    }

    public QOdpaiemDetailEcriture(PathMetadata metadata) {
        super(QOdpaiemDetailEcriture.class, metadata, "GFC", "ODPAIEM_DETAIL_ECRITURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(odpOrdre, ColumnMetadata.named("ODP_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(opeDate, ColumnMetadata.named("OPE_DATE").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(opeOrdre, ColumnMetadata.named("OPE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(opeOrigine, ColumnMetadata.named("OPE_ORIGINE").withIndex(5).ofType(Types.VARCHAR).withSize(10).notNull());
    }

}


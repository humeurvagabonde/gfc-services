package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEcheancierDetailEcr is a Querydsl query type for QEcheancierDetailEcr
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEcheancierDetailEcr extends com.querydsl.sql.RelationalPathBase<QEcheancierDetailEcr> {

    private static final long serialVersionUID = 1206285470;

    public static final QEcheancierDetailEcr echeancierDetailEcr = new QEcheancierDetailEcr("ECHEANCIER_DETAIL_ECR");

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<Long> echeEcheancierOrdre = createNumber("echeEcheancierOrdre", Long.class);

    public final NumberPath<Long> edeId = createNumber("edeId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QEcheancierDetailEcr> echeancierDetailEcrPk = createPrimaryKey(edeId);

    public QEcheancierDetailEcr(String variable) {
        super(QEcheancierDetailEcr.class, forVariable(variable), "GFC", "ECHEANCIER_DETAIL_ECR");
        addMetadata();
    }

    public QEcheancierDetailEcr(String variable, String schema, String table) {
        super(QEcheancierDetailEcr.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEcheancierDetailEcr(Path<? extends QEcheancierDetailEcr> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ECHEANCIER_DETAIL_ECR");
        addMetadata();
    }

    public QEcheancierDetailEcr(PathMetadata metadata) {
        super(QEcheancierDetailEcr.class, metadata, "GFC", "ECHEANCIER_DETAIL_ECR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(echeEcheancierOrdre, ColumnMetadata.named("ECHE_ECHEANCIER_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(edeId, ColumnMetadata.named("EDE_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


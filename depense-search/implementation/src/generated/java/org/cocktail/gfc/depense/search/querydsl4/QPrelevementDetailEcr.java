package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPrelevementDetailEcr is a Querydsl query type for QPrelevementDetailEcr
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPrelevementDetailEcr extends com.querydsl.sql.RelationalPathBase<QPrelevementDetailEcr> {

    private static final long serialVersionUID = -1774776476;

    public static final QPrelevementDetailEcr prelevementDetailEcr = new QPrelevementDetailEcr("PRELEVEMENT_DETAIL_ECR");

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<Long> pdeId = createNumber("pdeId", Long.class);

    public final NumberPath<Long> prelPrelevOrdre = createNumber("prelPrelevOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QPrelevementDetailEcr> prelevementDetailEcrPk = createPrimaryKey(pdeId);

    public QPrelevementDetailEcr(String variable) {
        super(QPrelevementDetailEcr.class, forVariable(variable), "GFC", "PRELEVEMENT_DETAIL_ECR");
        addMetadata();
    }

    public QPrelevementDetailEcr(String variable, String schema, String table) {
        super(QPrelevementDetailEcr.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPrelevementDetailEcr(Path<? extends QPrelevementDetailEcr> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PRELEVEMENT_DETAIL_ECR");
        addMetadata();
    }

    public QPrelevementDetailEcr(PathMetadata metadata) {
        super(QPrelevementDetailEcr.class, metadata, "GFC", "PRELEVEMENT_DETAIL_ECR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pdeId, ColumnMetadata.named("PDE_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prelPrelevOrdre, ColumnMetadata.named("PREL_PRELEV_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


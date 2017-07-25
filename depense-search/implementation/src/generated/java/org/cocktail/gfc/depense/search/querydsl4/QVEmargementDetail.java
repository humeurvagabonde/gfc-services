package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVEmargementDetail is a Querydsl query type for QVEmargementDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVEmargementDetail extends com.querydsl.sql.RelationalPathBase<QVEmargementDetail> {

    private static final long serialVersionUID = -1245379054;

    public static final QVEmargementDetail vEmargementDetail = new QVEmargementDetail("V_EMARGEMENT_DETAIL");

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<Long> ecdOrdreEm = createNumber("ecdOrdreEm", Long.class);

    public final NumberPath<Long> emdOrdre = createNumber("emdOrdre", Long.class);

    public QVEmargementDetail(String variable) {
        super(QVEmargementDetail.class, forVariable(variable), "GFC", "V_EMARGEMENT_DETAIL");
        addMetadata();
    }

    public QVEmargementDetail(String variable, String schema, String table) {
        super(QVEmargementDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVEmargementDetail(Path<? extends QVEmargementDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_EMARGEMENT_DETAIL");
        addMetadata();
    }

    public QVEmargementDetail(PathMetadata metadata) {
        super(QVEmargementDetail.class, metadata, "GFC", "V_EMARGEMENT_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ecdOrdreEm, ColumnMetadata.named("ECD_ORDRE_EM").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(emdOrdre, ColumnMetadata.named("EMD_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
    }

}


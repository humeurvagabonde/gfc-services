package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptBrouillardDetailEcd is a Querydsl query type for QCptBrouillardDetailEcd
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptBrouillardDetailEcd extends com.querydsl.sql.RelationalPathBase<QCptBrouillardDetailEcd> {

    private static final long serialVersionUID = -702067528;

    public static final QCptBrouillardDetailEcd cptBrouillardDetailEcd = new QCptBrouillardDetailEcd("CPT_BROUILLARD_DETAIL_ECD");

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<Long> idCptBrouillardDetail = createNumber("idCptBrouillardDetail", Long.class);

    public final NumberPath<Long> idCptBrouillardDetailEcd = createNumber("idCptBrouillardDetailEcd", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCptBrouillardDetailEcd> cptBroDetailEcdPk = createPrimaryKey(idCptBrouillardDetailEcd);

    public QCptBrouillardDetailEcd(String variable) {
        super(QCptBrouillardDetailEcd.class, forVariable(variable), "GFC", "CPT_BROUILLARD_DETAIL_ECD");
        addMetadata();
    }

    public QCptBrouillardDetailEcd(String variable, String schema, String table) {
        super(QCptBrouillardDetailEcd.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptBrouillardDetailEcd(Path<? extends QCptBrouillardDetailEcd> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_BROUILLARD_DETAIL_ECD");
        addMetadata();
    }

    public QCptBrouillardDetailEcd(PathMetadata metadata) {
        super(QCptBrouillardDetailEcd.class, metadata, "GFC", "CPT_BROUILLARD_DETAIL_ECD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idCptBrouillardDetail, ColumnMetadata.named("ID_CPT_BROUILLARD_DETAIL").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idCptBrouillardDetailEcd, ColumnMetadata.named("ID_CPT_BROUILLARD_DETAIL_ECD").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


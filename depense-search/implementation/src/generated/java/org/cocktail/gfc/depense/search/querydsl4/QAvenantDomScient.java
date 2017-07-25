package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvenantDomScient is a Querydsl query type for QAvenantDomScient
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvenantDomScient extends com.querydsl.sql.RelationalPathBase<QAvenantDomScient> {

    private static final long serialVersionUID = 1479190101;

    public static final QAvenantDomScient avenantDomScient = new QAvenantDomScient("AVENANT_DOM_SCIENT");

    public final NumberPath<Long> adsId = createNumber("adsId", Long.class);

    public final NumberPath<Long> avtOrdre = createNumber("avtOrdre", Long.class);

    public final NumberPath<Long> dsOrdre = createNumber("dsOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAvenantDomScient> domaineScientifiquePk = createPrimaryKey(adsId);

    public QAvenantDomScient(String variable) {
        super(QAvenantDomScient.class, forVariable(variable), "GFC", "AVENANT_DOM_SCIENT");
        addMetadata();
    }

    public QAvenantDomScient(String variable, String schema, String table) {
        super(QAvenantDomScient.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvenantDomScient(Path<? extends QAvenantDomScient> path) {
        super(path.getType(), path.getMetadata(), "GFC", "AVENANT_DOM_SCIENT");
        addMetadata();
    }

    public QAvenantDomScient(PathMetadata metadata) {
        super(QAvenantDomScient.class, metadata, "GFC", "AVENANT_DOM_SCIENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adsId, ColumnMetadata.named("ADS_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(avtOrdre, ColumnMetadata.named("AVT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(dsOrdre, ColumnMetadata.named("DS_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


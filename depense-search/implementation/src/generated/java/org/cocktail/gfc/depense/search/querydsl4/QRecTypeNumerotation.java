package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecTypeNumerotation is a Querydsl query type for QRecTypeNumerotation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecTypeNumerotation extends com.querydsl.sql.RelationalPathBase<QRecTypeNumerotation> {

    private static final long serialVersionUID = -169530595;

    public static final QRecTypeNumerotation recTypeNumerotation = new QRecTypeNumerotation("REC_TYPE_NUMEROTATION");

    public final StringPath tnuEntite = createString("tnuEntite");

    public final NumberPath<Long> tnuId = createNumber("tnuId", Long.class);

    public final StringPath tnuLibelle = createString("tnuLibelle");

    public final com.querydsl.sql.PrimaryKey<QRecTypeNumerotation> recTypeNumerotationPk = createPrimaryKey(tnuId);

    public QRecTypeNumerotation(String variable) {
        super(QRecTypeNumerotation.class, forVariable(variable), "GFC", "REC_TYPE_NUMEROTATION");
        addMetadata();
    }

    public QRecTypeNumerotation(String variable, String schema, String table) {
        super(QRecTypeNumerotation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecTypeNumerotation(Path<? extends QRecTypeNumerotation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "REC_TYPE_NUMEROTATION");
        addMetadata();
    }

    public QRecTypeNumerotation(PathMetadata metadata) {
        super(QRecTypeNumerotation.class, metadata, "GFC", "REC_TYPE_NUMEROTATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tnuEntite, ColumnMetadata.named("TNU_ENTITE").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(tnuId, ColumnMetadata.named("TNU_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tnuLibelle, ColumnMetadata.named("TNU_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}


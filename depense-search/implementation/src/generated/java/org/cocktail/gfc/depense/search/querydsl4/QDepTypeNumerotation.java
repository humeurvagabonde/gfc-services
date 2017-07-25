package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepTypeNumerotation is a Querydsl query type for QDepTypeNumerotation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepTypeNumerotation extends com.querydsl.sql.RelationalPathBase<QDepTypeNumerotation> {

    private static final long serialVersionUID = -818669412;

    public static final QDepTypeNumerotation depTypeNumerotation = new QDepTypeNumerotation("DEP_TYPE_NUMEROTATION");

    public final StringPath tnuEntite = createString("tnuEntite");

    public final NumberPath<Long> tnuId = createNumber("tnuId", Long.class);

    public final StringPath tnuLibelle = createString("tnuLibelle");

    public final StringPath tnuPrefixe = createString("tnuPrefixe");

    public final com.querydsl.sql.PrimaryKey<QDepTypeNumerotation> sysC0025994 = createPrimaryKey(tnuId);

    public QDepTypeNumerotation(String variable) {
        super(QDepTypeNumerotation.class, forVariable(variable), "GFC", "DEP_TYPE_NUMEROTATION");
        addMetadata();
    }

    public QDepTypeNumerotation(String variable, String schema, String table) {
        super(QDepTypeNumerotation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepTypeNumerotation(Path<? extends QDepTypeNumerotation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_TYPE_NUMEROTATION");
        addMetadata();
    }

    public QDepTypeNumerotation(PathMetadata metadata) {
        super(QDepTypeNumerotation.class, metadata, "GFC", "DEP_TYPE_NUMEROTATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tnuEntite, ColumnMetadata.named("TNU_ENTITE").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(tnuId, ColumnMetadata.named("TNU_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tnuLibelle, ColumnMetadata.named("TNU_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(tnuPrefixe, ColumnMetadata.named("TNU_PREFIXE").withIndex(4).ofType(Types.VARCHAR).withSize(3));
    }

}


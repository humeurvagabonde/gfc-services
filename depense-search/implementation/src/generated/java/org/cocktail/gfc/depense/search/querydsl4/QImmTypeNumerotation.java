package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QImmTypeNumerotation is a Querydsl query type for QImmTypeNumerotation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QImmTypeNumerotation extends com.querydsl.sql.RelationalPathBase<QImmTypeNumerotation> {

    private static final long serialVersionUID = 102332502;

    public static final QImmTypeNumerotation immTypeNumerotation = new QImmTypeNumerotation("IMM_TYPE_NUMEROTATION");

    public final StringPath tnuEntite = createString("tnuEntite");

    public final StringPath tnuLibelle = createString("tnuLibelle");

    public final NumberPath<Long> tnuOrdre = createNumber("tnuOrdre", Long.class);

    public final StringPath tnuPrefixe = createString("tnuPrefixe");

    public final com.querydsl.sql.PrimaryKey<QImmTypeNumerotation> immTypeNumerotationPk = createPrimaryKey(tnuOrdre);

    public QImmTypeNumerotation(String variable) {
        super(QImmTypeNumerotation.class, forVariable(variable), "GFC", "IMM_TYPE_NUMEROTATION");
        addMetadata();
    }

    public QImmTypeNumerotation(String variable, String schema, String table) {
        super(QImmTypeNumerotation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QImmTypeNumerotation(Path<? extends QImmTypeNumerotation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "IMM_TYPE_NUMEROTATION");
        addMetadata();
    }

    public QImmTypeNumerotation(PathMetadata metadata) {
        super(QImmTypeNumerotation.class, metadata, "GFC", "IMM_TYPE_NUMEROTATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tnuEntite, ColumnMetadata.named("TNU_ENTITE").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(tnuLibelle, ColumnMetadata.named("TNU_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(tnuOrdre, ColumnMetadata.named("TNU_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tnuPrefixe, ColumnMetadata.named("TNU_PREFIXE").withIndex(4).ofType(Types.VARCHAR).withSize(3));
    }

}


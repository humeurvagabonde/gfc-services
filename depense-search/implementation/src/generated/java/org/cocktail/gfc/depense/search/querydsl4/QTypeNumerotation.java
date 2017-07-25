package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeNumerotation is a Querydsl query type for QTypeNumerotation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeNumerotation extends com.querydsl.sql.RelationalPathBase<QTypeNumerotation> {

    private static final long serialVersionUID = 1040673345;

    public static final QTypeNumerotation typeNumerotation = new QTypeNumerotation("TYPE_NUMEROTATION");

    public final StringPath tnuEntite = createString("tnuEntite");

    public final StringPath tnuLibelle = createString("tnuLibelle");

    public final NumberPath<Long> tnuOrdre = createNumber("tnuOrdre", Long.class);

    public final StringPath tnuPrefixe = createString("tnuPrefixe");

    public final com.querydsl.sql.PrimaryKey<QTypeNumerotation> typeNumerotationPk = createPrimaryKey(tnuOrdre);

    public QTypeNumerotation(String variable) {
        super(QTypeNumerotation.class, forVariable(variable), "GFC", "TYPE_NUMEROTATION");
        addMetadata();
    }

    public QTypeNumerotation(String variable, String schema, String table) {
        super(QTypeNumerotation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeNumerotation(Path<? extends QTypeNumerotation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_NUMEROTATION");
        addMetadata();
    }

    public QTypeNumerotation(PathMetadata metadata) {
        super(QTypeNumerotation.class, metadata, "GFC", "TYPE_NUMEROTATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tnuEntite, ColumnMetadata.named("TNU_ENTITE").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(tnuLibelle, ColumnMetadata.named("TNU_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(tnuOrdre, ColumnMetadata.named("TNU_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tnuPrefixe, ColumnMetadata.named("TNU_PREFIXE").withIndex(4).ofType(Types.VARCHAR).withSize(3));
    }

}


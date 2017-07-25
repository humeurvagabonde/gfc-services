package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QNatureConvention is a Querydsl query type for QNatureConvention
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QNatureConvention extends com.querydsl.sql.RelationalPathBase<QNatureConvention> {

    private static final long serialVersionUID = 786896706;

    public static final QNatureConvention natureConvention = new QNatureConvention("NATURE_CONVENTION");

    public final StringPath natConvLibelle = createString("natConvLibelle");

    public final NumberPath<Long> natConvOrdre = createNumber("natConvOrdre", Long.class);

    public final StringPath natConvRecherche = createString("natConvRecherche");

    public final com.querydsl.sql.PrimaryKey<QNatureConvention> natureConventionPk = createPrimaryKey(natConvOrdre);

    public QNatureConvention(String variable) {
        super(QNatureConvention.class, forVariable(variable), "GFC", "NATURE_CONVENTION");
        addMetadata();
    }

    public QNatureConvention(String variable, String schema, String table) {
        super(QNatureConvention.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNatureConvention(Path<? extends QNatureConvention> path) {
        super(path.getType(), path.getMetadata(), "GFC", "NATURE_CONVENTION");
        addMetadata();
    }

    public QNatureConvention(PathMetadata metadata) {
        super(QNatureConvention.class, metadata, "GFC", "NATURE_CONVENTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(natConvLibelle, ColumnMetadata.named("NAT_CONV_LIBELLE").withIndex(1).ofType(Types.VARCHAR).withSize(70).notNull());
        addMetadata(natConvOrdre, ColumnMetadata.named("NAT_CONV_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(natConvRecherche, ColumnMetadata.named("NAT_CONV_RECHERCHE").withIndex(3).ofType(Types.VARCHAR).withSize(1));
    }

}


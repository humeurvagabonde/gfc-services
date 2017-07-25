package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypePartenaire is a Querydsl query type for QTypePartenaire
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypePartenaire extends com.querydsl.sql.RelationalPathBase<QTypePartenaire> {

    private static final long serialVersionUID = 628031323;

    public static final QTypePartenaire typePartenaire = new QTypePartenaire("TYPE_PARTENAIRE");

    public final StringPath typePartIdInterne = createString("typePartIdInterne");

    public final StringPath typePartLibelle = createString("typePartLibelle");

    public final NumberPath<Long> typePartOrdre = createNumber("typePartOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTypePartenaire> typePartenairePk = createPrimaryKey(typePartOrdre);

    public QTypePartenaire(String variable) {
        super(QTypePartenaire.class, forVariable(variable), "GFC", "TYPE_PARTENAIRE");
        addMetadata();
    }

    public QTypePartenaire(String variable, String schema, String table) {
        super(QTypePartenaire.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypePartenaire(Path<? extends QTypePartenaire> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_PARTENAIRE");
        addMetadata();
    }

    public QTypePartenaire(PathMetadata metadata) {
        super(QTypePartenaire.class, metadata, "GFC", "TYPE_PARTENAIRE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(typePartIdInterne, ColumnMetadata.named("TYPE_PART_ID_INTERNE").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(typePartLibelle, ColumnMetadata.named("TYPE_PART_LIBELLE").withIndex(1).ofType(Types.VARCHAR).withSize(70).notNull());
        addMetadata(typePartOrdre, ColumnMetadata.named("TYPE_PART_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


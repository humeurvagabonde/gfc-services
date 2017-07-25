package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeContact is a Querydsl query type for QTypeContact
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeContact extends com.querydsl.sql.RelationalPathBase<QTypeContact> {

    private static final long serialVersionUID = -1881966212;

    public static final QTypeContact typeContact = new QTypeContact("TYPE_CONTACT");

    public final NumberPath<Long> tcClasse = createNumber("tcClasse", Long.class);

    public final StringPath tcCommentaire = createString("tcCommentaire");

    public final StringPath tcLibelle = createString("tcLibelle");

    public final StringPath tcLibelleCourt = createString("tcLibelleCourt");

    public final NumberPath<Long> tcOrdre = createNumber("tcOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTypeContact> typeContactPk = createPrimaryKey(tcOrdre);

    public QTypeContact(String variable) {
        super(QTypeContact.class, forVariable(variable), "GFC", "TYPE_CONTACT");
        addMetadata();
    }

    public QTypeContact(String variable, String schema, String table) {
        super(QTypeContact.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeContact(Path<? extends QTypeContact> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_CONTACT");
        addMetadata();
    }

    public QTypeContact(PathMetadata metadata) {
        super(QTypeContact.class, metadata, "GFC", "TYPE_CONTACT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tcClasse, ColumnMetadata.named("TC_CLASSE").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tcCommentaire, ColumnMetadata.named("TC_COMMENTAIRE").withIndex(5).ofType(Types.VARCHAR).withSize(250));
        addMetadata(tcLibelle, ColumnMetadata.named("TC_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(tcLibelleCourt, ColumnMetadata.named("TC_LIBELLE_COURT").withIndex(3).ofType(Types.VARCHAR).withSize(5));
        addMetadata(tcOrdre, ColumnMetadata.named("TC_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


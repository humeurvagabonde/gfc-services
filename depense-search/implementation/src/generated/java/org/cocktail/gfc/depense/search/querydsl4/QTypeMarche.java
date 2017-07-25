package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeMarche is a Querydsl query type for QTypeMarche
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeMarche extends com.querydsl.sql.RelationalPathBase<QTypeMarche> {

    private static final long serialVersionUID = -618527322;

    public static final QTypeMarche typeMarche = new QTypeMarche("TYPE_MARCHE");

    public final StringPath pasLibelle = createString("pasLibelle");

    public final StringPath pasType = createString("pasType");

    public final com.querydsl.sql.PrimaryKey<QTypeMarche> typeMarchePk = createPrimaryKey(pasType);

    public QTypeMarche(String variable) {
        super(QTypeMarche.class, forVariable(variable), "GFC", "TYPE_MARCHE");
        addMetadata();
    }

    public QTypeMarche(String variable, String schema, String table) {
        super(QTypeMarche.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeMarche(Path<? extends QTypeMarche> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_MARCHE");
        addMetadata();
    }

    public QTypeMarche(PathMetadata metadata) {
        super(QTypeMarche.class, metadata, "GFC", "TYPE_MARCHE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pasLibelle, ColumnMetadata.named("PAS_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(pasType, ColumnMetadata.named("PAS_TYPE").withIndex(1).ofType(Types.VARCHAR).withSize(25).notNull());
    }

}


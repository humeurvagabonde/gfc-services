package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPassationMarche is a Querydsl query type for QPassationMarche
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPassationMarche extends com.querydsl.sql.RelationalPathBase<QPassationMarche> {

    private static final long serialVersionUID = -1776680932;

    public static final QPassationMarche passationMarche = new QPassationMarche("PASSATION_MARCHE");

    public final StringPath pasAbbrev = createString("pasAbbrev");

    public final StringPath pasLibelle = createString("pasLibelle");

    public final StringPath pasType = createString("pasType");

    public final com.querydsl.sql.PrimaryKey<QPassationMarche> passationMarchePk = createPrimaryKey(pasAbbrev);

    public QPassationMarche(String variable) {
        super(QPassationMarche.class, forVariable(variable), "GFC", "PASSATION_MARCHE");
        addMetadata();
    }

    public QPassationMarche(String variable, String schema, String table) {
        super(QPassationMarche.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPassationMarche(Path<? extends QPassationMarche> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PASSATION_MARCHE");
        addMetadata();
    }

    public QPassationMarche(PathMetadata metadata) {
        super(QPassationMarche.class, metadata, "GFC", "PASSATION_MARCHE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pasAbbrev, ColumnMetadata.named("PAS_ABBREV").withIndex(1).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(pasLibelle, ColumnMetadata.named("PAS_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(pasType, ColumnMetadata.named("PAS_TYPE").withIndex(3).ofType(Types.VARCHAR).withSize(25).notNull());
    }

}


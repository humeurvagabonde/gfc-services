package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QModeGestion is a Querydsl query type for QModeGestion
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QModeGestion extends com.querydsl.sql.RelationalPathBase<QModeGestion> {

    private static final long serialVersionUID = -1035074884;

    public static final QModeGestion modeGestion = new QModeGestion("MODE_GESTION");

    public final StringPath mgCommentaire = createString("mgCommentaire");

    public final StringPath mgLibelle = createString("mgLibelle");

    public final StringPath mgLibelleCourt = createString("mgLibelleCourt");

    public final NumberPath<Long> mgOrdre = createNumber("mgOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QModeGestion> modeGestionPk = createPrimaryKey(mgOrdre);

    public QModeGestion(String variable) {
        super(QModeGestion.class, forVariable(variable), "GFC", "MODE_GESTION");
        addMetadata();
    }

    public QModeGestion(String variable, String schema, String table) {
        super(QModeGestion.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QModeGestion(Path<? extends QModeGestion> path) {
        super(path.getType(), path.getMetadata(), "GFC", "MODE_GESTION");
        addMetadata();
    }

    public QModeGestion(PathMetadata metadata) {
        super(QModeGestion.class, metadata, "GFC", "MODE_GESTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(mgCommentaire, ColumnMetadata.named("MG_COMMENTAIRE").withIndex(3).ofType(Types.VARCHAR).withSize(256));
        addMetadata(mgLibelle, ColumnMetadata.named("MG_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(80).notNull());
        addMetadata(mgLibelleCourt, ColumnMetadata.named("MG_LIBELLE_COURT").withIndex(4).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(mgOrdre, ColumnMetadata.named("MG_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


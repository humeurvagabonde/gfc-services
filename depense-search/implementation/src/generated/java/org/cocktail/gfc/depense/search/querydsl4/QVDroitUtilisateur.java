package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVDroitUtilisateur is a Querydsl query type for QVDroitUtilisateur
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVDroitUtilisateur extends com.querydsl.sql.RelationalPathBase<QVDroitUtilisateur> {

    private static final long serialVersionUID = -601577629;

    public static final QVDroitUtilisateur vDroitUtilisateur = new QVDroitUtilisateur("V_DROIT_UTILISATEUR");

    public final StringPath fonId = createString("fonId");

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public QVDroitUtilisateur(String variable) {
        super(QVDroitUtilisateur.class, forVariable(variable), "GFC", "V_DROIT_UTILISATEUR");
        addMetadata();
    }

    public QVDroitUtilisateur(String variable, String schema, String table) {
        super(QVDroitUtilisateur.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVDroitUtilisateur(Path<? extends QVDroitUtilisateur> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_DROIT_UTILISATEUR");
        addMetadata();
    }

    public QVDroitUtilisateur(PathMetadata metadata) {
        super(QVDroitUtilisateur.class, metadata, "GFC", "V_DROIT_UTILISATEUR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fonId, ColumnMetadata.named("FON_ID").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


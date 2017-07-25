package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmUtilisateurPreference is a Querydsl query type for QAdmUtilisateurPreference
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmUtilisateurPreference extends com.querydsl.sql.RelationalPathBase<QAdmUtilisateurPreference> {

    private static final long serialVersionUID = -887773186;

    public static final QAdmUtilisateurPreference admUtilisateurPreference = new QAdmUtilisateurPreference("ADM_UTILISATEUR_PREFERENCE");

    public final NumberPath<Long> prefId = createNumber("prefId", Long.class);

    public final NumberPath<Long> upId = createNumber("upId", Long.class);

    public final StringPath upValue = createString("upValue");

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmUtilisateurPreference> sysC0026362 = createPrimaryKey(upId);

    public QAdmUtilisateurPreference(String variable) {
        super(QAdmUtilisateurPreference.class, forVariable(variable), "GFC", "ADM_UTILISATEUR_PREFERENCE");
        addMetadata();
    }

    public QAdmUtilisateurPreference(String variable, String schema, String table) {
        super(QAdmUtilisateurPreference.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmUtilisateurPreference(Path<? extends QAdmUtilisateurPreference> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_UTILISATEUR_PREFERENCE");
        addMetadata();
    }

    public QAdmUtilisateurPreference(PathMetadata metadata) {
        super(QAdmUtilisateurPreference.class, metadata, "GFC", "ADM_UTILISATEUR_PREFERENCE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(prefId, ColumnMetadata.named("PREF_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(upId, ColumnMetadata.named("UP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(upValue, ColumnMetadata.named("UP_VALUE").withIndex(4).ofType(Types.VARCHAR).withSize(500));
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


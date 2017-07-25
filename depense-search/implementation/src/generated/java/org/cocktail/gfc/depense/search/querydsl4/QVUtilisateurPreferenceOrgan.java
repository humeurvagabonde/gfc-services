package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVUtilisateurPreferenceOrgan is a Querydsl query type for QVUtilisateurPreferenceOrgan
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVUtilisateurPreferenceOrgan extends com.querydsl.sql.RelationalPathBase<QVUtilisateurPreferenceOrgan> {

    private static final long serialVersionUID = 310578943;

    public static final QVUtilisateurPreferenceOrgan vUtilisateurPreferenceOrgan = new QVUtilisateurPreferenceOrgan("V_UTILISATEUR_PREFERENCE_ORGAN");

    public final NumberPath<Long> prefId = createNumber("prefId", Long.class);

    public final NumberPath<Long> upId = createNumber("upId", Long.class);

    public final StringPath upValue = createString("upValue");

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public QVUtilisateurPreferenceOrgan(String variable) {
        super(QVUtilisateurPreferenceOrgan.class, forVariable(variable), "GFC", "V_UTILISATEUR_PREFERENCE_ORGAN");
        addMetadata();
    }

    public QVUtilisateurPreferenceOrgan(String variable, String schema, String table) {
        super(QVUtilisateurPreferenceOrgan.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVUtilisateurPreferenceOrgan(Path<? extends QVUtilisateurPreferenceOrgan> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_UTILISATEUR_PREFERENCE_ORGAN");
        addMetadata();
    }

    public QVUtilisateurPreferenceOrgan(PathMetadata metadata) {
        super(QVUtilisateurPreferenceOrgan.class, metadata, "GFC", "V_UTILISATEUR_PREFERENCE_ORGAN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(prefId, ColumnMetadata.named("PREF_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(upId, ColumnMetadata.named("UP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(upValue, ColumnMetadata.named("UP_VALUE").withIndex(4).ofType(Types.VARCHAR).withSize(500));
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


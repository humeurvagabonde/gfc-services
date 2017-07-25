package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmUtilisateurFonctGest is a Querydsl query type for QAdmUtilisateurFonctGest
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmUtilisateurFonctGest extends com.querydsl.sql.RelationalPathBase<QAdmUtilisateurFonctGest> {

    private static final long serialVersionUID = -1851521710;

    public static final QAdmUtilisateurFonctGest admUtilisateurFonctGest = new QAdmUtilisateurFonctGest("ADM_UTILISATEUR_FONCT_GEST");

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> ufgId = createNumber("ufgId", Long.class);

    public final NumberPath<Long> ufOrdre = createNumber("ufOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmUtilisateurFonctGest> sysC0023104 = createPrimaryKey(ufgId);

    public QAdmUtilisateurFonctGest(String variable) {
        super(QAdmUtilisateurFonctGest.class, forVariable(variable), "GFC", "ADM_UTILISATEUR_FONCT_GEST");
        addMetadata();
    }

    public QAdmUtilisateurFonctGest(String variable, String schema, String table) {
        super(QAdmUtilisateurFonctGest.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmUtilisateurFonctGest(Path<? extends QAdmUtilisateurFonctGest> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_UTILISATEUR_FONCT_GEST");
        addMetadata();
    }

    public QAdmUtilisateurFonctGest(PathMetadata metadata) {
        super(QAdmUtilisateurFonctGest.class, metadata, "GFC", "ADM_UTILISATEUR_FONCT_GEST");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(ufgId, ColumnMetadata.named("UFG_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ufOrdre, ColumnMetadata.named("UF_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


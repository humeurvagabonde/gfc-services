package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOpeVUtilisateurFonct is a Querydsl query type for QOpeVUtilisateurFonct
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpeVUtilisateurFonct extends com.querydsl.sql.RelationalPathBase<QOpeVUtilisateurFonct> {

    private static final long serialVersionUID = -211571889;

    public static final QOpeVUtilisateurFonct opeVUtilisateurFonct = new QOpeVUtilisateurFonct("OPE_V_UTILISATEUR_FONCT");

    public final StringPath fonCategorie = createString("fonCategorie");

    public final StringPath fonIdInterne = createString("fonIdInterne");

    public final StringPath fonLibelle = createString("fonLibelle");

    public final NumberPath<Long> fonOrdre = createNumber("fonOrdre", Long.class);

    public final NumberPath<Long> noIndividu = createNumber("noIndividu", Long.class);

    public final StringPath nom = createString("nom");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> ufOrdre = createNumber("ufOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public QOpeVUtilisateurFonct(String variable) {
        super(QOpeVUtilisateurFonct.class, forVariable(variable), "GFC", "OPE_V_UTILISATEUR_FONCT");
        addMetadata();
    }

    public QOpeVUtilisateurFonct(String variable, String schema, String table) {
        super(QOpeVUtilisateurFonct.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpeVUtilisateurFonct(Path<? extends QOpeVUtilisateurFonct> path) {
        super(path.getType(), path.getMetadata(), "GFC", "OPE_V_UTILISATEUR_FONCT");
        addMetadata();
    }

    public QOpeVUtilisateurFonct(PathMetadata metadata) {
        super(QOpeVUtilisateurFonct.class, metadata, "GFC", "OPE_V_UTILISATEUR_FONCT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fonCategorie, ColumnMetadata.named("FON_CATEGORIE").withIndex(7).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(fonIdInterne, ColumnMetadata.named("FON_ID_INTERNE").withIndex(8).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(fonLibelle, ColumnMetadata.named("FON_LIBELLE").withIndex(9).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(fonOrdre, ColumnMetadata.named("FON_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(nom, ColumnMetadata.named("NOM").withIndex(2).ofType(Types.VARCHAR).withSize(121));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ufOrdre, ColumnMetadata.named("UF_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


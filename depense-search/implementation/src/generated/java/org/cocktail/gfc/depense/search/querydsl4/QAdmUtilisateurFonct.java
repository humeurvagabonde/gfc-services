package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmUtilisateurFonct is a Querydsl query type for QAdmUtilisateurFonct
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmUtilisateurFonct extends com.querydsl.sql.RelationalPathBase<QAdmUtilisateurFonct> {

    private static final long serialVersionUID = -50010381;

    public static final QAdmUtilisateurFonct admUtilisateurFonct = new QAdmUtilisateurFonct("ADM_UTILISATEUR_FONCT");

    public final NumberPath<Long> fonOrdre = createNumber("fonOrdre", Long.class);

    public final NumberPath<Long> ufOrdre = createNumber("ufOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmUtilisateurFonct> sysC0021541 = createPrimaryKey(ufOrdre);

    public QAdmUtilisateurFonct(String variable) {
        super(QAdmUtilisateurFonct.class, forVariable(variable), "GFC", "ADM_UTILISATEUR_FONCT");
        addMetadata();
    }

    public QAdmUtilisateurFonct(String variable, String schema, String table) {
        super(QAdmUtilisateurFonct.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmUtilisateurFonct(Path<? extends QAdmUtilisateurFonct> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_UTILISATEUR_FONCT");
        addMetadata();
    }

    public QAdmUtilisateurFonct(PathMetadata metadata) {
        super(QAdmUtilisateurFonct.class, metadata, "GFC", "ADM_UTILISATEUR_FONCT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fonOrdre, ColumnMetadata.named("FON_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ufOrdre, ColumnMetadata.named("UF_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


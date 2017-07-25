package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmUtilisateurEb is a Querydsl query type for QAdmUtilisateurEb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmUtilisateurEb extends com.querydsl.sql.RelationalPathBase<QAdmUtilisateurEb> {

    private static final long serialVersionUID = -1654928704;

    public static final QAdmUtilisateurEb admUtilisateurEb = new QAdmUtilisateurEb("ADM_UTILISATEUR_EB");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmUtilisateurEb = createNumber("idAdmUtilisateurEb", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmUtilisateurEb> admUtilisateurEbPk = createPrimaryKey(idAdmUtilisateurEb);

    public QAdmUtilisateurEb(String variable) {
        super(QAdmUtilisateurEb.class, forVariable(variable), "GFC", "ADM_UTILISATEUR_EB");
        addMetadata();
    }

    public QAdmUtilisateurEb(String variable, String schema, String table) {
        super(QAdmUtilisateurEb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmUtilisateurEb(Path<? extends QAdmUtilisateurEb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_UTILISATEUR_EB");
        addMetadata();
    }

    public QAdmUtilisateurEb(PathMetadata metadata) {
        super(QAdmUtilisateurEb.class, metadata, "GFC", "ADM_UTILISATEUR_EB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmUtilisateurEb, ColumnMetadata.named("ID_ADM_UTILISATEUR_EB").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


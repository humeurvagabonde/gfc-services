package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmUtilisateurFonctExer is a Querydsl query type for QAdmUtilisateurFonctExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmUtilisateurFonctExer extends com.querydsl.sql.RelationalPathBase<QAdmUtilisateurFonctExer> {

    private static final long serialVersionUID = -1851563469;

    public static final QAdmUtilisateurFonctExer admUtilisateurFonctExer = new QAdmUtilisateurFonctExer("ADM_UTILISATEUR_FONCT_EXER");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> ufeId = createNumber("ufeId", Long.class);

    public final NumberPath<Long> ufOrdre = createNumber("ufOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmUtilisateurFonctExer> sysC0025159 = createPrimaryKey(ufeId);

    public QAdmUtilisateurFonctExer(String variable) {
        super(QAdmUtilisateurFonctExer.class, forVariable(variable), "GFC", "ADM_UTILISATEUR_FONCT_EXER");
        addMetadata();
    }

    public QAdmUtilisateurFonctExer(String variable, String schema, String table) {
        super(QAdmUtilisateurFonctExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmUtilisateurFonctExer(Path<? extends QAdmUtilisateurFonctExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_UTILISATEUR_FONCT_EXER");
        addMetadata();
    }

    public QAdmUtilisateurFonctExer(PathMetadata metadata) {
        super(QAdmUtilisateurFonctExer.class, metadata, "GFC", "ADM_UTILISATEUR_FONCT_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(ufeId, ColumnMetadata.named("UFE_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ufOrdre, ColumnMetadata.named("UF_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


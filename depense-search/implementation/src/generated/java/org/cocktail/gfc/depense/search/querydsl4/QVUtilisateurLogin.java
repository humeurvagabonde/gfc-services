package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVUtilisateurLogin is a Querydsl query type for QVUtilisateurLogin
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVUtilisateurLogin extends com.querydsl.sql.RelationalPathBase<QVUtilisateurLogin> {

    private static final long serialVersionUID = 122507186;

    public static final QVUtilisateurLogin vUtilisateurLogin = new QVUtilisateurLogin("V_UTILISATEUR_LOGIN");

    public final StringPath agtLogin = createString("agtLogin");

    public final StringPath agtNom = createString("agtNom");

    public final NumberPath<Long> agtOrdre = createNumber("agtOrdre", Long.class);

    public final StringPath agtPrenom = createString("agtPrenom");

    public QVUtilisateurLogin(String variable) {
        super(QVUtilisateurLogin.class, forVariable(variable), "GFC", "V_UTILISATEUR_LOGIN");
        addMetadata();
    }

    public QVUtilisateurLogin(String variable, String schema, String table) {
        super(QVUtilisateurLogin.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVUtilisateurLogin(Path<? extends QVUtilisateurLogin> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_UTILISATEUR_LOGIN");
        addMetadata();
    }

    public QVUtilisateurLogin(PathMetadata metadata) {
        super(QVUtilisateurLogin.class, metadata, "GFC", "V_UTILISATEUR_LOGIN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(agtLogin, ColumnMetadata.named("AGT_LOGIN").withIndex(4).ofType(Types.VARCHAR).withSize(50));
        addMetadata(agtNom, ColumnMetadata.named("AGT_NOM").withIndex(2).ofType(Types.VARCHAR).withSize(200));
        addMetadata(agtOrdre, ColumnMetadata.named("AGT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(agtPrenom, ColumnMetadata.named("AGT_PRENOM").withIndex(3).ofType(Types.VARCHAR).withSize(40));
    }

}


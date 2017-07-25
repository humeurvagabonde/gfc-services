package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmUtilisateurInfo is a Querydsl query type for QVAdmUtilisateurInfo
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmUtilisateurInfo extends com.querydsl.sql.RelationalPathBase<QVAdmUtilisateurInfo> {

    private static final long serialVersionUID = -1800364077;

    public static final QVAdmUtilisateurInfo vAdmUtilisateurInfo = new QVAdmUtilisateurInfo("V_ADM_UTILISATEUR_INFO");

    public final StringPath cptLogin = createString("cptLogin");

    public final StringPath email = createString("email");

    public final NumberPath<Long> noIndividu = createNumber("noIndividu", Long.class);

    public final StringPath nomPatronymique = createString("nomPatronymique");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final StringPath persLc = createString("persLc");

    public final StringPath persLibelle = createString("persLibelle");

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final DateTimePath<java.sql.Timestamp> utlFermeture = createDateTime("utlFermeture", java.sql.Timestamp.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> utlOuverture = createDateTime("utlOuverture", java.sql.Timestamp.class);

    public QVAdmUtilisateurInfo(String variable) {
        super(QVAdmUtilisateurInfo.class, forVariable(variable), "GFC", "V_ADM_UTILISATEUR_INFO");
        addMetadata();
    }

    public QVAdmUtilisateurInfo(String variable, String schema, String table) {
        super(QVAdmUtilisateurInfo.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmUtilisateurInfo(Path<? extends QVAdmUtilisateurInfo> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_UTILISATEUR_INFO");
        addMetadata();
    }

    public QVAdmUtilisateurInfo(PathMetadata metadata) {
        super(QVAdmUtilisateurInfo.class, metadata, "GFC", "V_ADM_UTILISATEUR_INFO");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cptLogin, ColumnMetadata.named("CPT_LOGIN").withIndex(9).ofType(Types.VARCHAR).withSize(50));
        addMetadata(email, ColumnMetadata.named("EMAIL").withIndex(10).ofType(Types.VARCHAR).withSize(101));
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(nomPatronymique, ColumnMetadata.named("NOM_PATRONYMIQUE").withIndex(11).ofType(Types.VARCHAR).withSize(80));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persLc, ColumnMetadata.named("PERS_LC").withIndex(7).ofType(Types.VARCHAR).withSize(40));
        addMetadata(persLibelle, ColumnMetadata.named("PERS_LIBELLE").withIndex(6).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlFermeture, ColumnMetadata.named("UTL_FERMETURE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOuverture, ColumnMetadata.named("UTL_OUVERTURE").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
    }

}


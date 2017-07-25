package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmUtilisateur is a Querydsl query type for QAdmUtilisateur
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmUtilisateur extends com.querydsl.sql.RelationalPathBase<QAdmUtilisateur> {

    private static final long serialVersionUID = -900045117;

    public static final QAdmUtilisateur admUtilisateur = new QAdmUtilisateur("ADM_UTILISATEUR");

    public final NumberPath<Long> noIndividu = createNumber("noIndividu", Long.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final DateTimePath<java.sql.Timestamp> utlFermeture = createDateTime("utlFermeture", java.sql.Timestamp.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> utlOuverture = createDateTime("utlOuverture", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QAdmUtilisateur> sysC0026073 = createPrimaryKey(utlOrdre);

    public QAdmUtilisateur(String variable) {
        super(QAdmUtilisateur.class, forVariable(variable), "GFC", "ADM_UTILISATEUR");
        addMetadata();
    }

    public QAdmUtilisateur(String variable, String schema, String table) {
        super(QAdmUtilisateur.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmUtilisateur(Path<? extends QAdmUtilisateur> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_UTILISATEUR");
        addMetadata();
    }

    public QAdmUtilisateur(PathMetadata metadata) {
        super(QAdmUtilisateur.class, metadata, "GFC", "ADM_UTILISATEUR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlFermeture, ColumnMetadata.named("UTL_FERMETURE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOuverture, ColumnMetadata.named("UTL_OUVERTURE").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
    }

}


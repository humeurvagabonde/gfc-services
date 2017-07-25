package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmUtilisateur is a Querydsl query type for QVAdmUtilisateur
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmUtilisateur extends com.querydsl.sql.RelationalPathBase<QVAdmUtilisateur> {

    private static final long serialVersionUID = 1403785605;

    public static final QVAdmUtilisateur vAdmUtilisateur = new QVAdmUtilisateur("V_ADM_UTILISATEUR");

    public final NumberPath<Long> noIndividu = createNumber("noIndividu", Long.class);

    public final StringPath nomUsuel = createString("nomUsuel");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final StringPath prenom = createString("prenom");

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final DateTimePath<java.sql.Timestamp> utlFermeture = createDateTime("utlFermeture", java.sql.Timestamp.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> utlOuverture = createDateTime("utlOuverture", java.sql.Timestamp.class);

    public QVAdmUtilisateur(String variable) {
        super(QVAdmUtilisateur.class, forVariable(variable), "GFC", "V_ADM_UTILISATEUR");
        addMetadata();
    }

    public QVAdmUtilisateur(String variable, String schema, String table) {
        super(QVAdmUtilisateur.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmUtilisateur(Path<? extends QVAdmUtilisateur> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_UTILISATEUR");
        addMetadata();
    }

    public QVAdmUtilisateur(PathMetadata metadata) {
        super(QVAdmUtilisateur.class, metadata, "GFC", "V_ADM_UTILISATEUR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(nomUsuel, ColumnMetadata.named("NOM_USUEL").withIndex(6).ofType(Types.VARCHAR).withSize(80).notNull());
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prenom, ColumnMetadata.named("PRENOM").withIndex(7).ofType(Types.VARCHAR).withSize(40));
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlFermeture, ColumnMetadata.named("UTL_FERMETURE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOuverture, ColumnMetadata.named("UTL_OUVERTURE").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
    }

}


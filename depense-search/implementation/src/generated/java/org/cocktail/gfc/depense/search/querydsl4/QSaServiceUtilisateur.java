package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSaServiceUtilisateur is a Querydsl query type for QSaServiceUtilisateur
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSaServiceUtilisateur extends com.querydsl.sql.RelationalPathBase<QSaServiceUtilisateur> {

    private static final long serialVersionUID = -607967418;

    public static final QSaServiceUtilisateur saServiceUtilisateur = new QSaServiceUtilisateur("SA_SERVICE_UTILISATEUR");

    public final NumberPath<Long> svacId = createNumber("svacId", Long.class);

    public final DateTimePath<java.sql.Timestamp> svutDate = createDateTime("svutDate", java.sql.Timestamp.class);

    public final NumberPath<Long> svutId = createNumber("svutId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSaServiceUtilisateur> saServiceUtilisateurPk = createPrimaryKey(svutId);

    public QSaServiceUtilisateur(String variable) {
        super(QSaServiceUtilisateur.class, forVariable(variable), "GFC", "SA_SERVICE_UTILISATEUR");
        addMetadata();
    }

    public QSaServiceUtilisateur(String variable, String schema, String table) {
        super(QSaServiceUtilisateur.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSaServiceUtilisateur(Path<? extends QSaServiceUtilisateur> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SA_SERVICE_UTILISATEUR");
        addMetadata();
    }

    public QSaServiceUtilisateur(PathMetadata metadata) {
        super(QSaServiceUtilisateur.class, metadata, "GFC", "SA_SERVICE_UTILISATEUR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(svacId, ColumnMetadata.named("SVAC_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(svutDate, ColumnMetadata.named("SVUT_DATE").withIndex(3).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(svutId, ColumnMetadata.named("SVUT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


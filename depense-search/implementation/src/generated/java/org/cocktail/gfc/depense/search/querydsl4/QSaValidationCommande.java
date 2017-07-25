package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSaValidationCommande is a Querydsl query type for QSaValidationCommande
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSaValidationCommande extends com.querydsl.sql.RelationalPathBase<QSaValidationCommande> {

    private static final long serialVersionUID = -1932717109;

    public static final QSaValidationCommande saValidationCommande = new QSaValidationCommande("SA_VALIDATION_COMMANDE");

    public final NumberPath<Long> attrOrdre = createNumber("attrOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> svacId = createNumber("svacId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final NumberPath<Long> utlOrdreValideur = createNumber("utlOrdreValideur", Long.class);

    public final NumberPath<Long> vlcoComid = createNumber("vlcoComid", Long.class);

    public final DateTimePath<java.sql.Timestamp> vlcoDate = createDateTime("vlcoDate", java.sql.Timestamp.class);

    public final StringPath vlcoDemande = createString("vlcoDemande");

    public final StringPath vlcoEtat = createString("vlcoEtat");

    public final NumberPath<Long> vlcoId = createNumber("vlcoId", Long.class);

    public final StringPath vlcoMaildemandeur = createString("vlcoMaildemandeur");

    public final StringPath vlcoValide = createString("vlcoValide");

    public final StringPath vlcoVisa = createString("vlcoVisa");

    public final com.querydsl.sql.PrimaryKey<QSaValidationCommande> saValidationCommandePk = createPrimaryKey(vlcoId);

    public QSaValidationCommande(String variable) {
        super(QSaValidationCommande.class, forVariable(variable), "GFC", "SA_VALIDATION_COMMANDE");
        addMetadata();
    }

    public QSaValidationCommande(String variable, String schema, String table) {
        super(QSaValidationCommande.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSaValidationCommande(Path<? extends QSaValidationCommande> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SA_VALIDATION_COMMANDE");
        addMetadata();
    }

    public QSaValidationCommande(PathMetadata metadata) {
        super(QSaValidationCommande.class, metadata, "GFC", "SA_VALIDATION_COMMANDE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attrOrdre, ColumnMetadata.named("ATTR_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(svacId, ColumnMetadata.named("SVAC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdreValideur, ColumnMetadata.named("UTL_ORDRE_VALIDEUR").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(vlcoComid, ColumnMetadata.named("VLCO_COMID").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(vlcoDate, ColumnMetadata.named("VLCO_DATE").withIndex(7).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(vlcoDemande, ColumnMetadata.named("VLCO_DEMANDE").withIndex(8).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(vlcoEtat, ColumnMetadata.named("VLCO_ETAT").withIndex(9).ofType(Types.VARCHAR).withSize(25));
        addMetadata(vlcoId, ColumnMetadata.named("VLCO_ID").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(vlcoMaildemandeur, ColumnMetadata.named("VLCO_MAILDEMANDEUR").withIndex(13).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(vlcoValide, ColumnMetadata.named("VLCO_VALIDE").withIndex(11).ofType(Types.VARCHAR).withSize(25));
        addMetadata(vlcoVisa, ColumnMetadata.named("VLCO_VISA").withIndex(12).ofType(Types.VARCHAR).withSize(2000));
    }

}


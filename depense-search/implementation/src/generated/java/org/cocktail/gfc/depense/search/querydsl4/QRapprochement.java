package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRapprochement is a Querydsl query type for QRapprochement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRapprochement extends com.querydsl.sql.RelationalPathBase<QRapprochement> {

    private static final long serialVersionUID = -1329347064;

    public static final QRapprochement rapprochement = new QRapprochement("RAPPROCHEMENT");

    public final DateTimePath<java.sql.Timestamp> dateCreation = createDateTime("dateCreation", java.sql.Timestamp.class);

    public final NumberPath<Long> ecdOrdreEncaissCorrige = createNumber("ecdOrdreEncaissCorrige", Long.class);

    public final StringPath etat = createString("etat");

    public final NumberPath<Long> idEmargement = createNumber("idEmargement", Long.class);

    public final NumberPath<Long> idEncaissement = createNumber("idEncaissement", Long.class);

    public final NumberPath<Long> idRapprochement = createNumber("idRapprochement", Long.class);

    public final NumberPath<Long> idTitre = createNumber("idTitre", Long.class);

    public final NumberPath<java.math.BigDecimal> montantHtCalcule = createNumber("montantHtCalcule", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTtcSaisi = createNumber("montantTtcSaisi", java.math.BigDecimal.class);

    public final NumberPath<Long> numero = createNumber("numero", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRapprochement> rapprochementPk = createPrimaryKey(idRapprochement);

    public QRapprochement(String variable) {
        super(QRapprochement.class, forVariable(variable), "GFC", "RAPPROCHEMENT");
        addMetadata();
    }

    public QRapprochement(String variable, String schema, String table) {
        super(QRapprochement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRapprochement(Path<? extends QRapprochement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RAPPROCHEMENT");
        addMetadata();
    }

    public QRapprochement(PathMetadata metadata) {
        super(QRapprochement.class, metadata, "GFC", "RAPPROCHEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(8).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(ecdOrdreEncaissCorrige, ColumnMetadata.named("ECD_ORDRE_ENCAISS_CORRIGE").withIndex(11).ofType(Types.DECIMAL).withSize(38));
        addMetadata(etat, ColumnMetadata.named("ETAT").withIndex(10).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idEmargement, ColumnMetadata.named("ID_EMARGEMENT").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idEncaissement, ColumnMetadata.named("ID_ENCAISSEMENT").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idRapprochement, ColumnMetadata.named("ID_RAPPROCHEMENT").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idTitre, ColumnMetadata.named("ID_TITRE").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(montantHtCalcule, ColumnMetadata.named("MONTANT_HT_CALCULE").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTtcSaisi, ColumnMetadata.named("MONTANT_TTC_SAISI").withIndex(3).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(numero, ColumnMetadata.named("NUMERO").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


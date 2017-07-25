package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptEncaissement is a Querydsl query type for QCptEncaissement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptEncaissement extends com.querydsl.sql.RelationalPathBase<QCptEncaissement> {

    private static final long serialVersionUID = 1567307358;

    public static final QCptEncaissement cptEncaissement = new QCptEncaissement("CPT_ENCAISSEMENT");

    public final StringPath commentaire = createString("commentaire");

    public final DateTimePath<java.sql.Timestamp> dateCreation = createDateTime("dateCreation", java.sql.Timestamp.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idBordereau = createNumber("idBordereau", Long.class);

    public final NumberPath<Long> idEcheance = createNumber("idEcheance", Long.class);

    public final NumberPath<Long> idEncaissement = createNumber("idEncaissement", Long.class);

    public final StringPath infoNumFap = createString("infoNumFap");

    public final StringPath infoNumTitre = createString("infoNumTitre");

    public final StringPath libelle = createString("libelle");

    public final StringPath modeEncaissement = createString("modeEncaissement");

    public final NumberPath<java.math.BigDecimal> montantTtc = createNumber("montantTtc", java.math.BigDecimal.class);

    public final NumberPath<Long> numero = createNumber("numero", Long.class);

    public final NumberPath<Long> persIdTiers = createNumber("persIdTiers", Long.class);

    public final NumberPath<Long> source = createNumber("source", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCptEncaissement> encaissementPk = createPrimaryKey(idEncaissement);

    public QCptEncaissement(String variable) {
        super(QCptEncaissement.class, forVariable(variable), "GFC", "CPT_ENCAISSEMENT");
        addMetadata();
    }

    public QCptEncaissement(String variable, String schema, String table) {
        super(QCptEncaissement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptEncaissement(Path<? extends QCptEncaissement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_ENCAISSEMENT");
        addMetadata();
    }

    public QCptEncaissement(PathMetadata metadata) {
        super(QCptEncaissement.class, metadata, "GFC", "CPT_ENCAISSEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(11).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(13).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idBordereau, ColumnMetadata.named("ID_BORDEREAU").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idEcheance, ColumnMetadata.named("ID_ECHEANCE").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idEncaissement, ColumnMetadata.named("ID_ENCAISSEMENT").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(infoNumFap, ColumnMetadata.named("INFO_NUM_FAP").withIndex(8).ofType(Types.VARCHAR).withSize(100));
        addMetadata(infoNumTitre, ColumnMetadata.named("INFO_NUM_TITRE").withIndex(7).ofType(Types.VARCHAR).withSize(100));
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(10).ofType(Types.VARCHAR).withSize(2000).notNull());
        addMetadata(modeEncaissement, ColumnMetadata.named("MODE_ENCAISSEMENT").withIndex(15).ofType(Types.VARCHAR).withSize(10));
        addMetadata(montantTtc, ColumnMetadata.named("MONTANT_TTC").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(numero, ColumnMetadata.named("NUMERO").withIndex(14).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdTiers, ColumnMetadata.named("PERS_ID_TIERS").withIndex(12).ofType(Types.DECIMAL).withSize(38));
        addMetadata(source, ColumnMetadata.named("SOURCE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


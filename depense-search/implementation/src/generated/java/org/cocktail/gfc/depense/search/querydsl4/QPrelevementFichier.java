package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPrelevementFichier is a Querydsl query type for QPrelevementFichier
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPrelevementFichier extends com.querydsl.sql.RelationalPathBase<QPrelevementFichier> {

    private static final long serialVersionUID = 1447605135;

    public static final QPrelevementFichier prelevementFichier = new QPrelevementFichier("PRELEVEMENT_FICHIER");

    public final StringPath ficpCodeOp = createString("ficpCodeOp");

    public final StringPath ficpCompte = createString("ficpCompte");

    public final StringPath ficpContenu = createString("ficpContenu");

    public final DateTimePath<java.sql.Timestamp> ficpDateCreation = createDateTime("ficpDateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> ficpDateModif = createDateTime("ficpDateModif", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> ficpDateReglement = createDateTime("ficpDateReglement", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> ficpDateRemise = createDateTime("ficpDateRemise", java.sql.Timestamp.class);

    public final StringPath ficpLibelle = createString("ficpLibelle");

    public final NumberPath<java.math.BigDecimal> ficpMontant = createNumber("ficpMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> ficpNbPrel = createNumber("ficpNbPrel", Long.class);

    public final NumberPath<Long> ficpNumero = createNumber("ficpNumero", Long.class);

    public final NumberPath<Long> ficpOrdre = createNumber("ficpOrdre", Long.class);

    public final NumberPath<Long> recoOrdre = createNumber("recoOrdre", Long.class);

    public final NumberPath<Long> trecOrdre = createNumber("trecOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QPrelevementFichier> prelevementFichierPk = createPrimaryKey(ficpOrdre);

    public QPrelevementFichier(String variable) {
        super(QPrelevementFichier.class, forVariable(variable), "GFC", "PRELEVEMENT_FICHIER");
        addMetadata();
    }

    public QPrelevementFichier(String variable, String schema, String table) {
        super(QPrelevementFichier.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPrelevementFichier(Path<? extends QPrelevementFichier> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PRELEVEMENT_FICHIER");
        addMetadata();
    }

    public QPrelevementFichier(PathMetadata metadata) {
        super(QPrelevementFichier.class, metadata, "GFC", "PRELEVEMENT_FICHIER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ficpCodeOp, ColumnMetadata.named("FICP_CODE_OP").withIndex(10).ofType(Types.VARCHAR).withSize(4).notNull());
        addMetadata(ficpCompte, ColumnMetadata.named("FICP_COMPTE").withIndex(15).ofType(Types.VARCHAR).withSize(35));
        addMetadata(ficpContenu, ColumnMetadata.named("FICP_CONTENU").withIndex(14).ofType(Types.CLOB).withSize(4000));
        addMetadata(ficpDateCreation, ColumnMetadata.named("FICP_DATE_CREATION").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(ficpDateModif, ColumnMetadata.named("FICP_DATE_MODIF").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(ficpDateReglement, ColumnMetadata.named("FICP_DATE_REGLEMENT").withIndex(7).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(ficpDateRemise, ColumnMetadata.named("FICP_DATE_REMISE").withIndex(6).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(ficpLibelle, ColumnMetadata.named("FICP_LIBELLE").withIndex(11).ofType(Types.VARCHAR).withSize(1000).notNull());
        addMetadata(ficpMontant, ColumnMetadata.named("FICP_MONTANT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ficpNbPrel, ColumnMetadata.named("FICP_NB_PREL").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ficpNumero, ColumnMetadata.named("FICP_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ficpOrdre, ColumnMetadata.named("FICP_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recoOrdre, ColumnMetadata.named("RECO_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(trecOrdre, ColumnMetadata.named("TREC_ORDRE").withIndex(13).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(12).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


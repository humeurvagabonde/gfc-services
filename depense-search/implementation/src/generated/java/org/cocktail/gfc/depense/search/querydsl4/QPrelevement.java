package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPrelevement is a Querydsl query type for QPrelevement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPrelevement extends com.querydsl.sql.RelationalPathBase<QPrelevement> {

    private static final long serialVersionUID = 410641631;

    public static final QPrelevement prelevement = new QPrelevement("PRELEVEMENT");

    public final NumberPath<Long> echeEcheancierOrdre = createNumber("echeEcheancierOrdre", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath prelCommentaire = createString("prelCommentaire");

    public final DateTimePath<java.sql.Timestamp> prelDateModif = createDateTime("prelDateModif", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> prelDatePrelevement = createDateTime("prelDatePrelevement", java.sql.Timestamp.class);

    public final StringPath prelEtatMaracuja = createString("prelEtatMaracuja");

    public final NumberPath<Long> prelNumeroIndex = createNumber("prelNumeroIndex", Long.class);

    public final DateTimePath<java.sql.Timestamp> prelPrelevDateSaisie = createDateTime("prelPrelevDateSaisie", java.sql.Timestamp.class);

    public final StringPath prelPrelevEtat = createString("prelPrelevEtat");

    public final NumberPath<java.math.BigDecimal> prelPrelevMontant = createNumber("prelPrelevMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> prelPrelevOrdre = createNumber("prelPrelevOrdre", Long.class);

    public final NumberPath<Long> recoOrdre = createNumber("recoOrdre", Long.class);

    public final NumberPath<Long> ribOrdre = createNumber("ribOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QPrelevement> prelevementPk = createPrimaryKey(prelPrelevOrdre);

    public QPrelevement(String variable) {
        super(QPrelevement.class, forVariable(variable), "GFC", "PRELEVEMENT");
        addMetadata();
    }

    public QPrelevement(String variable, String schema, String table) {
        super(QPrelevement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPrelevement(Path<? extends QPrelevement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PRELEVEMENT");
        addMetadata();
    }

    public QPrelevement(PathMetadata metadata) {
        super(QPrelevement.class, metadata, "GFC", "PRELEVEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(echeEcheancierOrdre, ColumnMetadata.named("ECHE_ECHEANCIER_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(prelCommentaire, ColumnMetadata.named("PREL_COMMENTAIRE").withIndex(5).ofType(Types.VARCHAR).withSize(500));
        addMetadata(prelDateModif, ColumnMetadata.named("PREL_DATE_MODIF").withIndex(6).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(prelDatePrelevement, ColumnMetadata.named("PREL_DATE_PRELEVEMENT").withIndex(7).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(prelEtatMaracuja, ColumnMetadata.named("PREL_ETAT_MARACUJA").withIndex(13).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(prelNumeroIndex, ColumnMetadata.named("PREL_NUMERO_INDEX").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prelPrelevDateSaisie, ColumnMetadata.named("PREL_PRELEV_DATE_SAISIE").withIndex(8).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(prelPrelevEtat, ColumnMetadata.named("PREL_PRELEV_ETAT").withIndex(9).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(prelPrelevMontant, ColumnMetadata.named("PREL_PRELEV_MONTANT").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(prelPrelevOrdre, ColumnMetadata.named("PREL_PRELEV_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recoOrdre, ColumnMetadata.named("RECO_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ribOrdre, ColumnMetadata.named("RIB_ORDRE").withIndex(12).ofType(Types.DECIMAL).withSize(0));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QIm is a Querydsl query type for QIm
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QIm extends com.querydsl.sql.RelationalPathBase<QIm> {

    private static final long serialVersionUID = 1355865710;

    public static final QIm im = new QIm("IM");

    public final DateTimePath<java.sql.Timestamp> dateCreation = createDateTime("dateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModification = createDateTime("dateModification", java.sql.Timestamp.class);

    public final NumberPath<Long> depId = createNumber("depId", Long.class);

    public final StringPath imCommentaires = createString("imCommentaires");

    public final DateTimePath<java.sql.Timestamp> imDateDepartDgp = createDateTime("imDateDepartDgp", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> imDateFinDgpReelle = createDateTime("imDateFinDgpReelle", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> imDateFinDgpTheorique = createDateTime("imDateFinDgpTheorique", java.sql.Timestamp.class);

    public final NumberPath<Long> imDgp = createNumber("imDgp", Long.class);

    public final NumberPath<Long> imDureeSusp = createNumber("imDureeSusp", Long.class);

    public final NumberPath<Long> imId = createNumber("imId", Long.class);

    public final StringPath imLibelleTaux = createString("imLibelleTaux");

    public final NumberPath<java.math.BigDecimal> imMontant = createNumber("imMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> imNbJoursDepassement = createNumber("imNbJoursDepassement", Long.class);

    public final StringPath imNumero = createString("imNumero");

    public final NumberPath<java.math.BigDecimal> imPenalite = createNumber("imPenalite", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> imTauxApplicable = createNumber("imTauxApplicable", java.math.BigDecimal.class);

    public final NumberPath<Long> imTauxReference = createNumber("imTauxReference", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QIm> imPk = createPrimaryKey(imId);

    public QIm(String variable) {
        super(QIm.class, forVariable(variable), "GFC", "IM");
        addMetadata();
    }

    public QIm(String variable, String schema, String table) {
        super(QIm.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIm(Path<? extends QIm> path) {
        super(path.getType(), path.getMetadata(), "GFC", "IM");
        addMetadata();
    }

    public QIm(PathMetadata metadata) {
        super(QIm.class, metadata, "GFC", "IM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(15).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dateModification, ColumnMetadata.named("DATE_MODIFICATION").withIndex(16).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(depId, ColumnMetadata.named("DEP_ID").withIndex(17).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(imCommentaires, ColumnMetadata.named("IM_COMMENTAIRES").withIndex(13).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(imDateDepartDgp, ColumnMetadata.named("IM_DATE_DEPART_DGP").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(imDateFinDgpReelle, ColumnMetadata.named("IM_DATE_FIN_DGP_REELLE").withIndex(6).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(imDateFinDgpTheorique, ColumnMetadata.named("IM_DATE_FIN_DGP_THEORIQUE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(imDgp, ColumnMetadata.named("IM_DGP").withIndex(2).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(imDureeSusp, ColumnMetadata.named("IM_DUREE_SUSP").withIndex(7).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(imId, ColumnMetadata.named("IM_ID").withIndex(1).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(imLibelleTaux, ColumnMetadata.named("IM_LIBELLE_TAUX").withIndex(9).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(imMontant, ColumnMetadata.named("IM_MONTANT").withIndex(12).ofType(Types.DECIMAL).withSize(19).withDigits(2));
        addMetadata(imNbJoursDepassement, ColumnMetadata.named("IM_NB_JOURS_DEPASSEMENT").withIndex(8).ofType(Types.DECIMAL).withSize(10));
        addMetadata(imNumero, ColumnMetadata.named("IM_NUMERO").withIndex(3).ofType(Types.VARCHAR).withSize(20));
        addMetadata(imPenalite, ColumnMetadata.named("IM_PENALITE").withIndex(19).ofType(Types.DECIMAL).withSize(10).withDigits(2).notNull());
        addMetadata(imTauxApplicable, ColumnMetadata.named("IM_TAUX_APPLICABLE").withIndex(11).ofType(Types.DECIMAL).withSize(19).withDigits(2).notNull());
        addMetadata(imTauxReference, ColumnMetadata.named("IM_TAUX_REFERENCE").withIndex(10).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(18).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(14).ofType(Types.DECIMAL).withSize(10).notNull());
    }

}


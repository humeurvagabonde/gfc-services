package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXlabCommandeLigne is a Querydsl query type for QXlabCommandeLigne
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXlabCommandeLigne extends com.querydsl.sql.RelationalPathBase<QXlabCommandeLigne> {

    private static final long serialVersionUID = 302003400;

    public static final QXlabCommandeLigne xlabCommandeLigne = new QXlabCommandeLigne("XLAB_COMMANDE_LIGNE");

    public final NumberPath<Long> artId = createNumber("artId", Long.class);

    public final NumberPath<Long> ceOrdre = createNumber("ceOrdre", Long.class);

    public final NumberPath<Long> xcdeId = createNumber("xcdeId", Long.class);

    public final NumberPath<Long> xligId = createNumber("xligId", Long.class);

    public final StringPath xligLibelle = createString("xligLibelle");

    public final NumberPath<java.math.BigDecimal> xligMontHt = createNumber("xligMontHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> xligMontTva = createNumber("xligMontTva", java.math.BigDecimal.class);

    public final NumberPath<Long> xligNumero = createNumber("xligNumero", Long.class);

    public final NumberPath<java.math.BigDecimal> xligPrixUnit = createNumber("xligPrixUnit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> xligQte = createNumber("xligQte", java.math.BigDecimal.class);

    public final StringPath xligRef = createString("xligRef");

    public final NumberPath<java.math.BigDecimal> xligTauxRemise = createNumber("xligTauxRemise", java.math.BigDecimal.class);

    public final com.querydsl.sql.PrimaryKey<QXlabCommandeLigne> xlabCommandeLignePk = createPrimaryKey(xligId);

    public QXlabCommandeLigne(String variable) {
        super(QXlabCommandeLigne.class, forVariable(variable), "GFC", "XLAB_COMMANDE_LIGNE");
        addMetadata();
    }

    public QXlabCommandeLigne(String variable, String schema, String table) {
        super(QXlabCommandeLigne.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXlabCommandeLigne(Path<? extends QXlabCommandeLigne> path) {
        super(path.getType(), path.getMetadata(), "GFC", "XLAB_COMMANDE_LIGNE");
        addMetadata();
    }

    public QXlabCommandeLigne(PathMetadata metadata) {
        super(QXlabCommandeLigne.class, metadata, "GFC", "XLAB_COMMANDE_LIGNE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artId, ColumnMetadata.named("ART_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ceOrdre, ColumnMetadata.named("CE_ORDRE").withIndex(12).ofType(Types.DECIMAL).withSize(0));
        addMetadata(xcdeId, ColumnMetadata.named("XCDE_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(xligId, ColumnMetadata.named("XLIG_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(xligLibelle, ColumnMetadata.named("XLIG_LIBELLE").withIndex(6).ofType(Types.VARCHAR).withSize(150).notNull());
        addMetadata(xligMontHt, ColumnMetadata.named("XLIG_MONT_HT").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(xligMontTva, ColumnMetadata.named("XLIG_MONT_TVA").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(xligNumero, ColumnMetadata.named("XLIG_NUMERO").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(xligPrixUnit, ColumnMetadata.named("XLIG_PRIX_UNIT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(xligQte, ColumnMetadata.named("XLIG_QTE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(xligRef, ColumnMetadata.named("XLIG_REF").withIndex(5).ofType(Types.VARCHAR).withSize(15));
        addMetadata(xligTauxRemise, ColumnMetadata.named("XLIG_TAUX_REMISE").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2));
    }

}


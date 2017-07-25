package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepSfLigne is a Querydsl query type for QDepSfLigne
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepSfLigne extends com.querydsl.sql.RelationalPathBase<QDepSfLigne> {

    private static final long serialVersionUID = 1920946025;

    public static final QDepSfLigne depSfLigne = new QDepSfLigne("DEP_SF_LIGNE");

    public final NumberPath<java.math.BigDecimal> dontAjustementTva = createNumber("dontAjustementTva", java.math.BigDecimal.class);

    public final NumberPath<Long> idAdmTva = createNumber("idAdmTva", Long.class);

    public final NumberPath<Long> idDepEj = createNumber("idDepEj", Long.class);

    public final NumberPath<Long> idDepEjLigne = createNumber("idDepEjLigne", Long.class);

    public final NumberPath<Long> idDepSf = createNumber("idDepSf", Long.class);

    public final NumberPath<Long> idDepSfLigne = createNumber("idDepSfLigne", Long.class);

    public final NumberPath<java.math.BigDecimal> montantHt = createNumber("montantHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTtc = createNumber("montantTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTva = createNumber("montantTva", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> quantite = createNumber("quantite", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> tauxTva = createNumber("tauxTva", java.math.BigDecimal.class);

    public final com.querydsl.sql.PrimaryKey<QDepSfLigne> idDepSfLignePk = createPrimaryKey(idDepSfLigne);

    public QDepSfLigne(String variable) {
        super(QDepSfLigne.class, forVariable(variable), "GFC", "DEP_SF_LIGNE");
        addMetadata();
    }

    public QDepSfLigne(String variable, String schema, String table) {
        super(QDepSfLigne.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepSfLigne(Path<? extends QDepSfLigne> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_SF_LIGNE");
        addMetadata();
    }

    public QDepSfLigne(PathMetadata metadata) {
        super(QDepSfLigne.class, metadata, "GFC", "DEP_SF_LIGNE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dontAjustementTva, ColumnMetadata.named("DONT_AJUSTEMENT_TVA").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(idAdmTva, ColumnMetadata.named("ID_ADM_TVA").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepEj, ColumnMetadata.named("ID_DEP_EJ").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepEjLigne, ColumnMetadata.named("ID_DEP_EJ_LIGNE").withIndex(8).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepSf, ColumnMetadata.named("ID_DEP_SF").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepSfLigne, ColumnMetadata.named("ID_DEP_SF_LIGNE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(montantHt, ColumnMetadata.named("MONTANT_HT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTtc, ColumnMetadata.named("MONTANT_TTC").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTva, ColumnMetadata.named("MONTANT_TVA").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(quantite, ColumnMetadata.named("QUANTITE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(tauxTva, ColumnMetadata.named("TAUX_TVA").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
    }

}


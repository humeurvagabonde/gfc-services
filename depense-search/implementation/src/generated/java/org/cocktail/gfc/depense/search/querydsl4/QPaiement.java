package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPaiement is a Querydsl query type for QPaiement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPaiement extends com.querydsl.sql.RelationalPathBase<QPaiement> {

    private static final long serialVersionUID = -328434827;

    public static final QPaiement paiement = new QPaiement("PAIEMENT");

    public final NumberPath<Long> comOrdre = createNumber("comOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final DateTimePath<java.sql.Timestamp> paiDateCreation = createDateTime("paiDateCreation", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> paiMontant = createNumber("paiMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> paiNbVirements = createNumber("paiNbVirements", Long.class);

    public final NumberPath<Long> paiNumero = createNumber("paiNumero", Long.class);

    public final NumberPath<Long> paiOrdre = createNumber("paiOrdre", Long.class);

    public final NumberPath<Long> tviOrdre = createNumber("tviOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QPaiement> paiementPk = createPrimaryKey(paiOrdre);

    public QPaiement(String variable) {
        super(QPaiement.class, forVariable(variable), "GFC", "PAIEMENT");
        addMetadata();
    }

    public QPaiement(String variable, String schema, String table) {
        super(QPaiement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPaiement(Path<? extends QPaiement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PAIEMENT");
        addMetadata();
    }

    public QPaiement(PathMetadata metadata) {
        super(QPaiement.class, metadata, "GFC", "PAIEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(comOrdre, ColumnMetadata.named("COM_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(paiDateCreation, ColumnMetadata.named("PAI_DATE_CREATION").withIndex(7).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(paiMontant, ColumnMetadata.named("PAI_MONTANT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(paiNbVirements, ColumnMetadata.named("PAI_NB_VIREMENTS").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(paiNumero, ColumnMetadata.named("PAI_NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(paiOrdre, ColumnMetadata.named("PAI_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tviOrdre, ColumnMetadata.named("TVI_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


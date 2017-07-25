package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepFactureDetailsTva is a Querydsl query type for QDepFactureDetailsTva
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepFactureDetailsTva extends com.querydsl.sql.RelationalPathBase<QDepFactureDetailsTva> {

    private static final long serialVersionUID = -293183596;

    public static final QDepFactureDetailsTva depFactureDetailsTva = new QDepFactureDetailsTva("DEP_FACTURE_DETAILS_TVA");

    public final NumberPath<Long> idDepFacture = createNumber("idDepFacture", Long.class);

    public final NumberPath<Long> idDepFactureDetailsTva = createNumber("idDepFactureDetailsTva", Long.class);

    public final NumberPath<java.math.BigDecimal> montantHt = createNumber("montantHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTtc = createNumber("montantTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTva = createNumber("montantTva", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> tauxTva = createNumber("tauxTva", java.math.BigDecimal.class);

    public final com.querydsl.sql.PrimaryKey<QDepFactureDetailsTva> idDepFactureDetailsTvaPk = createPrimaryKey(idDepFactureDetailsTva);

    public QDepFactureDetailsTva(String variable) {
        super(QDepFactureDetailsTva.class, forVariable(variable), "GFC", "DEP_FACTURE_DETAILS_TVA");
        addMetadata();
    }

    public QDepFactureDetailsTva(String variable, String schema, String table) {
        super(QDepFactureDetailsTva.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepFactureDetailsTva(Path<? extends QDepFactureDetailsTva> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_FACTURE_DETAILS_TVA");
        addMetadata();
    }

    public QDepFactureDetailsTva(PathMetadata metadata) {
        super(QDepFactureDetailsTva.class, metadata, "GFC", "DEP_FACTURE_DETAILS_TVA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idDepFacture, ColumnMetadata.named("ID_DEP_FACTURE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepFactureDetailsTva, ColumnMetadata.named("ID_DEP_FACTURE_DETAILS_TVA").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(montantHt, ColumnMetadata.named("MONTANT_HT").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTtc, ColumnMetadata.named("MONTANT_TTC").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTva, ColumnMetadata.named("MONTANT_TVA").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(tauxTva, ColumnMetadata.named("TAUX_TVA").withIndex(3).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
    }

}


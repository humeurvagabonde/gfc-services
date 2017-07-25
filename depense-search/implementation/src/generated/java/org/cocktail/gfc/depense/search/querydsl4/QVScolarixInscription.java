package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVScolarixInscription is a Querydsl query type for QVScolarixInscription
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVScolarixInscription extends com.querydsl.sql.RelationalPathBase<QVScolarixInscription> {

    private static final long serialVersionUID = 1877377343;

    public static final QVScolarixInscription vScolarixInscription = new QVScolarixInscription("V_SCOLARIX_INSCRIPTION");

    public final NumberPath<Long> etudNumero = createNumber("etudNumero", Long.class);

    public final NumberPath<Long> exeOrdre = createNumber("exeOrdre", Long.class);

    public final NumberPath<Long> histNumero = createNumber("histNumero", Long.class);

    public final NumberPath<Long> identifiant = createNumber("identifiant", Long.class);

    public final DateTimePath<java.sql.Timestamp> paieDate = createDateTime("paieDate", java.sql.Timestamp.class);

    public final NumberPath<Long> paieNumero = createNumber("paieNumero", Long.class);

    public final NumberPath<java.math.BigDecimal> paieSomme = createNumber("paieSomme", java.math.BigDecimal.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public QVScolarixInscription(String variable) {
        super(QVScolarixInscription.class, forVariable(variable), "GFC", "V_SCOLARIX_INSCRIPTION");
        addMetadata();
    }

    public QVScolarixInscription(String variable, String schema, String table) {
        super(QVScolarixInscription.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVScolarixInscription(Path<? extends QVScolarixInscription> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_SCOLARIX_INSCRIPTION");
        addMetadata();
    }

    public QVScolarixInscription(PathMetadata metadata) {
        super(QVScolarixInscription.class, metadata, "GFC", "V_SCOLARIX_INSCRIPTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(etudNumero, ColumnMetadata.named("ETUD_NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(histNumero, ColumnMetadata.named("HIST_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(identifiant, ColumnMetadata.named("IDENTIFIANT").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(paieDate, ColumnMetadata.named("PAIE_DATE").withIndex(7).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(paieNumero, ColumnMetadata.named("PAIE_NUMERO").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(paieSomme, ColumnMetadata.named("PAIE_SOMME").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


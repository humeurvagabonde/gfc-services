package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepFacture is a Querydsl query type for QDepFacture
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepFacture extends com.querydsl.sql.RelationalPathBase<QDepFacture> {

    private static final long serialVersionUID = -1148230729;

    public static final QDepFacture depFacture = new QDepFacture("DEP_FACTURE");

    public final StringPath commentaire = createString("commentaire");

    public final StringPath dateEmission = createString("dateEmission");

    public final StringPath dateReception = createString("dateReception");

    public final StringPath dCreation = createString("dCreation");

    public final StringPath dModification = createString("dModification");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> idDepEj = createNumber("idDepEj", Long.class);

    public final NumberPath<Long> idDepFacture = createNumber("idDepFacture", Long.class);

    public final StringPath numFacture = createString("numFacture");

    public final StringPath numFactureFournisseur = createString("numFactureFournisseur");

    public final StringPath origineFacture = createString("origineFacture");

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final NumberPath<java.math.BigDecimal> totalHt = createNumber("totalHt", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> totalTtc = createNumber("totalTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> totalTva = createNumber("totalTva", java.math.BigDecimal.class);

    public final StringPath typeFacture = createString("typeFacture");

    public final com.querydsl.sql.PrimaryKey<QDepFacture> idDepFacturePk = createPrimaryKey(idDepFacture);

    public QDepFacture(String variable) {
        super(QDepFacture.class, forVariable(variable), "GFC", "DEP_FACTURE");
        addMetadata();
    }

    public QDepFacture(String variable, String schema, String table) {
        super(QDepFacture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepFacture(Path<? extends QDepFacture> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_FACTURE");
        addMetadata();
    }

    public QDepFacture(PathMetadata metadata) {
        super(QDepFacture.class, metadata, "GFC", "DEP_FACTURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(5).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(dateEmission, ColumnMetadata.named("DATE_EMISSION").withIndex(6).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(dateReception, ColumnMetadata.named("DATE_RECEPTION").withIndex(7).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(13).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(15).ofType(Types.VARCHAR).withSize(30));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepEj, ColumnMetadata.named("ID_DEP_EJ").withIndex(12).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepFacture, ColumnMetadata.named("ID_DEP_FACTURE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(numFacture, ColumnMetadata.named("NUM_FACTURE").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(numFactureFournisseur, ColumnMetadata.named("NUM_FACTURE_FOURNISSEUR").withIndex(4).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(origineFacture, ColumnMetadata.named("ORIGINE_FACTURE").withIndex(18).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(14).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(16).ofType(Types.DECIMAL).withSize(38));
        addMetadata(totalHt, ColumnMetadata.named("TOTAL_HT").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(totalTtc, ColumnMetadata.named("TOTAL_TTC").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(totalTva, ColumnMetadata.named("TOTAL_TVA").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(typeFacture, ColumnMetadata.named("TYPE_FACTURE").withIndex(17).ofType(Types.VARCHAR).withSize(30).notNull());
    }

}


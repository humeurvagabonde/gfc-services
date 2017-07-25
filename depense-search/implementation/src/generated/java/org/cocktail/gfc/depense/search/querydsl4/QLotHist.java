package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QLotHist is a Querydsl query type for QLotHist
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLotHist extends com.querydsl.sql.RelationalPathBase<QLotHist> {

    private static final long serialVersionUID = -379563255;

    public static final QLotHist lotHist = new QLotHist("LOT_HIST");

    public final StringPath lhABonDeCommande = createString("lhABonDeCommande");

    public final StringPath lhCatalogue = createString("lhCatalogue");

    public final DateTimePath<java.sql.Timestamp> lhDate = createDateTime("lhDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lhDebut = createDateTime("lhDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lhFin = createDateTime("lhFin", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> lhHt = createNumber("lhHt", java.math.BigDecimal.class);

    public final StringPath lhIndex = createString("lhIndex");

    public final StringPath lhLibelle = createString("lhLibelle");

    public final StringPath lhMonnaie = createString("lhMonnaie");

    public final NumberPath<Long> lhOrdre = createNumber("lhOrdre", Long.class);

    public final StringPath lhSuppr = createString("lhSuppr");

    public final StringPath lhValide = createString("lhValide");

    public final NumberPath<Long> lotOrdre = createNumber("lotOrdre", Long.class);

    public final NumberPath<Long> marOrdre = createNumber("marOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QLotHist> lotHistPk = createPrimaryKey(lhOrdre);

    public QLotHist(String variable) {
        super(QLotHist.class, forVariable(variable), "GFC", "LOT_HIST");
        addMetadata();
    }

    public QLotHist(String variable, String schema, String table) {
        super(QLotHist.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLotHist(Path<? extends QLotHist> path) {
        super(path.getType(), path.getMetadata(), "GFC", "LOT_HIST");
        addMetadata();
    }

    public QLotHist(PathMetadata metadata) {
        super(QLotHist.class, metadata, "GFC", "LOT_HIST");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(lhABonDeCommande, ColumnMetadata.named("LH_A_BON_DE_COMMANDE").withIndex(15).ofType(Types.VARCHAR).withSize(1));
        addMetadata(lhCatalogue, ColumnMetadata.named("LH_CATALOGUE").withIndex(3).ofType(Types.VARCHAR).withSize(1));
        addMetadata(lhDate, ColumnMetadata.named("LH_DATE").withIndex(4).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(lhDebut, ColumnMetadata.named("LH_DEBUT").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(lhFin, ColumnMetadata.named("LH_FIN").withIndex(6).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(lhHt, ColumnMetadata.named("LH_HT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(lhIndex, ColumnMetadata.named("LH_INDEX").withIndex(8).ofType(Types.VARCHAR).withSize(5));
        addMetadata(lhLibelle, ColumnMetadata.named("LH_LIBELLE").withIndex(9).ofType(Types.VARCHAR).withSize(512));
        addMetadata(lhMonnaie, ColumnMetadata.named("LH_MONNAIE").withIndex(10).ofType(Types.VARCHAR).withSize(1));
        addMetadata(lhOrdre, ColumnMetadata.named("LH_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(lhSuppr, ColumnMetadata.named("LH_SUPPR").withIndex(11).ofType(Types.VARCHAR).withSize(1));
        addMetadata(lhValide, ColumnMetadata.named("LH_VALIDE").withIndex(12).ofType(Types.VARCHAR).withSize(1));
        addMetadata(lotOrdre, ColumnMetadata.named("LOT_ORDRE").withIndex(13).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(marOrdre, ColumnMetadata.named("MAR_ORDRE").withIndex(14).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


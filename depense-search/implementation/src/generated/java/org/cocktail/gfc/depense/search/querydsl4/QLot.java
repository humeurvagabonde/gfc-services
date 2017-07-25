package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QLot is a Querydsl query type for QLot
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLot extends com.querydsl.sql.RelationalPathBase<QLot> {

    private static final long serialVersionUID = -917832889;

    public static final QLot lot = new QLot("LOT");

    public final StringPath lotABonDeCommande = createString("lotABonDeCommande");

    public final StringPath lotCatalogue = createString("lotCatalogue");

    public final StringPath lotCotitulaires = createString("lotCotitulaires");

    public final DateTimePath<java.sql.Timestamp> lotDebut = createDateTime("lotDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lotFin = createDateTime("lotFin", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> lotHt = createNumber("lotHt", java.math.BigDecimal.class);

    public final StringPath lotIndex = createString("lotIndex");

    public final StringPath lotLibelle = createString("lotLibelle");

    public final StringPath lotMonnaie = createString("lotMonnaie");

    public final NumberPath<Long> lotOrdre = createNumber("lotOrdre", Long.class);

    public final StringPath lotSoustraitants = createString("lotSoustraitants");

    public final StringPath lotSuppr = createString("lotSuppr");

    public final StringPath lotValide = createString("lotValide");

    public final NumberPath<Long> marOrdre = createNumber("marOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QLot> lotPk = createPrimaryKey(lotOrdre);

    public QLot(String variable) {
        super(QLot.class, forVariable(variable), "GFC", "LOT");
        addMetadata();
    }

    public QLot(String variable, String schema, String table) {
        super(QLot.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLot(Path<? extends QLot> path) {
        super(path.getType(), path.getMetadata(), "GFC", "LOT");
        addMetadata();
    }

    public QLot(PathMetadata metadata) {
        super(QLot.class, metadata, "GFC", "LOT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(lotABonDeCommande, ColumnMetadata.named("LOT_A_BON_DE_COMMANDE").withIndex(14).ofType(Types.VARCHAR).withSize(1));
        addMetadata(lotCatalogue, ColumnMetadata.named("LOT_CATALOGUE").withIndex(2).ofType(Types.VARCHAR).withSize(1));
        addMetadata(lotCotitulaires, ColumnMetadata.named("LOT_COTITULAIRES").withIndex(13).ofType(Types.VARCHAR).withSize(512));
        addMetadata(lotDebut, ColumnMetadata.named("LOT_DEBUT").withIndex(3).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(lotFin, ColumnMetadata.named("LOT_FIN").withIndex(4).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(lotHt, ColumnMetadata.named("LOT_HT").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(lotIndex, ColumnMetadata.named("LOT_INDEX").withIndex(6).ofType(Types.VARCHAR).withSize(5));
        addMetadata(lotLibelle, ColumnMetadata.named("LOT_LIBELLE").withIndex(7).ofType(Types.VARCHAR).withSize(512));
        addMetadata(lotMonnaie, ColumnMetadata.named("LOT_MONNAIE").withIndex(8).ofType(Types.VARCHAR).withSize(1));
        addMetadata(lotOrdre, ColumnMetadata.named("LOT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(lotSoustraitants, ColumnMetadata.named("LOT_SOUSTRAITANTS").withIndex(12).ofType(Types.VARCHAR).withSize(512));
        addMetadata(lotSuppr, ColumnMetadata.named("LOT_SUPPR").withIndex(9).ofType(Types.VARCHAR).withSize(1));
        addMetadata(lotValide, ColumnMetadata.named("LOT_VALIDE").withIndex(10).ofType(Types.VARCHAR).withSize(1));
        addMetadata(marOrdre, ColumnMetadata.named("MAR_ORDRE").withIndex(11).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


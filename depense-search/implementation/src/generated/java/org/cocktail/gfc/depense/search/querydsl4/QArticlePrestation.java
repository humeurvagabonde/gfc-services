package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QArticlePrestation is a Querydsl query type for QArticlePrestation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QArticlePrestation extends com.querydsl.sql.RelationalPathBase<QArticlePrestation> {

    private static final long serialVersionUID = -1069924291;

    public static final QArticlePrestation articlePrestation = new QArticlePrestation("ARTICLE_PRESTATION");

    public final NumberPath<Long> artId = createNumber("artId", Long.class);

    public final DateTimePath<java.sql.Timestamp> artpCfcDateDebut = createDateTime("artpCfcDateDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> artpCfcDateFin = createDateTime("artpCfcDateFin", java.sql.Timestamp.class);

    public final NumberPath<Long> artpCfcDuree = createNumber("artpCfcDuree", Long.class);

    public final StringPath artpCfcNoDeclaration = createString("artpCfcNoDeclaration");

    public final StringPath artpCfcResponsable = createString("artpCfcResponsable");

    public final StringPath artpInvisibleWeb = createString("artpInvisibleWeb");

    public final NumberPath<Long> artpQteDispo = createNumber("artpQteDispo", Long.class);

    public final NumberPath<java.math.BigDecimal> artpQteMax = createNumber("artpQteMax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> artpQteMaxParCmd = createNumber("artpQteMaxParCmd", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> artpQteMin = createNumber("artpQteMin", java.math.BigDecimal.class);

    public final StringPath pcoNumDepense = createString("pcoNumDepense");

    public final StringPath pcoNumRecette = createString("pcoNumRecette");

    public final NumberPath<Long> typuId = createNumber("typuId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QArticlePrestation> articlePrestationPk = createPrimaryKey(artId);

    public QArticlePrestation(String variable) {
        super(QArticlePrestation.class, forVariable(variable), "GFC", "ARTICLE_PRESTATION");
        addMetadata();
    }

    public QArticlePrestation(String variable, String schema, String table) {
        super(QArticlePrestation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QArticlePrestation(Path<? extends QArticlePrestation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ARTICLE_PRESTATION");
        addMetadata();
    }

    public QArticlePrestation(PathMetadata metadata) {
        super(QArticlePrestation.class, metadata, "GFC", "ARTICLE_PRESTATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artId, ColumnMetadata.named("ART_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(artpCfcDateDebut, ColumnMetadata.named("ARTP_CFC_DATE_DEBUT").withIndex(6).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(artpCfcDateFin, ColumnMetadata.named("ARTP_CFC_DATE_FIN").withIndex(7).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(artpCfcDuree, ColumnMetadata.named("ARTP_CFC_DUREE").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(artpCfcNoDeclaration, ColumnMetadata.named("ARTP_CFC_NO_DECLARATION").withIndex(9).ofType(Types.VARCHAR).withSize(20));
        addMetadata(artpCfcResponsable, ColumnMetadata.named("ARTP_CFC_RESPONSABLE").withIndex(10).ofType(Types.VARCHAR).withSize(100));
        addMetadata(artpInvisibleWeb, ColumnMetadata.named("ARTP_INVISIBLE_WEB").withIndex(2).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(artpQteDispo, ColumnMetadata.named("ARTP_QTE_DISPO").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(artpQteMax, ColumnMetadata.named("ARTP_QTE_MAX").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(artpQteMaxParCmd, ColumnMetadata.named("ARTP_QTE_MAX_PAR_CMD").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(artpQteMin, ColumnMetadata.named("ARTP_QTE_MIN").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(pcoNumDepense, ColumnMetadata.named("PCO_NUM_DEPENSE").withIndex(11).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pcoNumRecette, ColumnMetadata.named("PCO_NUM_RECETTE").withIndex(12).ofType(Types.VARCHAR).withSize(20));
        addMetadata(typuId, ColumnMetadata.named("TYPU_ID").withIndex(13).ofType(Types.DECIMAL).withSize(0));
    }

}


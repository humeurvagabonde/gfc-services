package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptBrouillardDetail is a Querydsl query type for QCptBrouillardDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptBrouillardDetail extends com.querydsl.sql.RelationalPathBase<QCptBrouillardDetail> {

    private static final long serialVersionUID = 575214574;

    public static final QCptBrouillardDetail cptBrouillardDetail = new QCptBrouillardDetail("CPT_BROUILLARD_DETAIL");

    public final StringPath commentaire = createString("commentaire");

    public final NumberPath<java.math.BigDecimal> credit = createNumber("credit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> debit = createNumber("debit", java.math.BigDecimal.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> idCptBrouillardDetail = createNumber("idCptBrouillardDetail", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> indexBrouillardDetail = createNumber("indexBrouillardDetail", Long.class);

    public final StringPath libelle = createString("libelle");

    public final StringPath pcoNum = createString("pcoNum");

    public final StringPath sens = createString("sens");

    public final StringPath supprime = createString("supprime");

    public final NumberPath<java.math.BigDecimal> tauxTva = createNumber("tauxTva", java.math.BigDecimal.class);

    public final StringPath type = createString("type");

    public final com.querydsl.sql.PrimaryKey<QCptBrouillardDetail> cptBrouillardDetailPk = createPrimaryKey(idCptBrouillardDetail);

    public QCptBrouillardDetail(String variable) {
        super(QCptBrouillardDetail.class, forVariable(variable), "GFC", "CPT_BROUILLARD_DETAIL");
        addMetadata();
    }

    public QCptBrouillardDetail(String variable, String schema, String table) {
        super(QCptBrouillardDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptBrouillardDetail(Path<? extends QCptBrouillardDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_BROUILLARD_DETAIL");
        addMetadata();
    }

    public QCptBrouillardDetail(PathMetadata metadata) {
        super(QCptBrouillardDetail.class, metadata, "GFC", "CPT_BROUILLARD_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(11).ofType(Types.VARCHAR).withSize(200));
        addMetadata(credit, ColumnMetadata.named("CREDIT").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(debit, ColumnMetadata.named("DEBIT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idCptBrouillardDetail, ColumnMetadata.named("ID_CPT_BROUILLARD_DETAIL").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(indexBrouillardDetail, ColumnMetadata.named("INDEX_BROUILLARD_DETAIL").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(10).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(5).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(sens, ColumnMetadata.named("SENS").withIndex(7).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(supprime, ColumnMetadata.named("SUPPRIME").withIndex(12).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(tauxTva, ColumnMetadata.named("TAUX_TVA").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(type, ColumnMetadata.named("TYPE").withIndex(13).ofType(Types.VARCHAR).withSize(30));
    }

}


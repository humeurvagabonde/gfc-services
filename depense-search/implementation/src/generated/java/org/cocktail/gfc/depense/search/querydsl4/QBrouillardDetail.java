package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBrouillardDetail is a Querydsl query type for QBrouillardDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBrouillardDetail extends com.querydsl.sql.RelationalPathBase<QBrouillardDetail> {

    private static final long serialVersionUID = -1445292037;

    public static final QBrouillardDetail brouillardDetail = new QBrouillardDetail("BROUILLARD_DETAIL");

    public final StringPath brodCommentaire = createString("brodCommentaire");

    public final NumberPath<java.math.BigDecimal> brodCredit = createNumber("brodCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> brodDebit = createNumber("brodDebit", java.math.BigDecimal.class);

    public final NumberPath<Long> brodId = createNumber("brodId", Long.class);

    public final NumberPath<Long> brodIndex = createNumber("brodIndex", Long.class);

    public final StringPath brodLibelle = createString("brodLibelle");

    public final StringPath brodPcoLibelle = createString("brodPcoLibelle");

    public final StringPath brodPcoNum = createString("brodPcoNum");

    public final StringPath brodPostit = createString("brodPostit");

    public final StringPath brodSens = createString("brodSens");

    public final NumberPath<Long> broId = createNumber("broId", Long.class);

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final StringPath gesCode = createString("gesCode");

    public final com.querydsl.sql.PrimaryKey<QBrouillardDetail> brouillardDetailPk = createPrimaryKey(brodId);

    public QBrouillardDetail(String variable) {
        super(QBrouillardDetail.class, forVariable(variable), "GFC", "BROUILLARD_DETAIL");
        addMetadata();
    }

    public QBrouillardDetail(String variable, String schema, String table) {
        super(QBrouillardDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBrouillardDetail(Path<? extends QBrouillardDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BROUILLARD_DETAIL");
        addMetadata();
    }

    public QBrouillardDetail(PathMetadata metadata) {
        super(QBrouillardDetail.class, metadata, "GFC", "BROUILLARD_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(brodCommentaire, ColumnMetadata.named("BROD_COMMENTAIRE").withIndex(12).ofType(Types.VARCHAR).withSize(200));
        addMetadata(brodCredit, ColumnMetadata.named("BROD_CREDIT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(brodDebit, ColumnMetadata.named("BROD_DEBIT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(brodId, ColumnMetadata.named("BROD_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(brodIndex, ColumnMetadata.named("BROD_INDEX").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(brodLibelle, ColumnMetadata.named("BROD_LIBELLE").withIndex(10).ofType(Types.VARCHAR).withSize(200));
        addMetadata(brodPcoLibelle, ColumnMetadata.named("BROD_PCO_LIBELLE").withIndex(6).ofType(Types.VARCHAR).withSize(200));
        addMetadata(brodPcoNum, ColumnMetadata.named("BROD_PCO_NUM").withIndex(5).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(brodPostit, ColumnMetadata.named("BROD_POSTIT").withIndex(11).ofType(Types.VARCHAR).withSize(200));
        addMetadata(brodSens, ColumnMetadata.named("BROD_SENS").withIndex(9).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(broId, ColumnMetadata.named("BRO_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(13).ofType(Types.DECIMAL).withSize(0));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
    }

}


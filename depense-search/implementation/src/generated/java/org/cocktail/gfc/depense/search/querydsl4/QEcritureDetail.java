package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEcritureDetail is a Querydsl query type for QEcritureDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEcritureDetail extends com.querydsl.sql.RelationalPathBase<QEcritureDetail> {

    private static final long serialVersionUID = 1787598148;

    public static final QEcritureDetail ecritureDetail = new QEcritureDetail("ECRITURE_DETAIL");

    public final StringPath ecdCommentaire = createString("ecdCommentaire");

    public final NumberPath<java.math.BigDecimal> ecdCredit = createNumber("ecdCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> ecdDebit = createNumber("ecdDebit", java.math.BigDecimal.class);

    public final NumberPath<Long> ecdIndex = createNumber("ecdIndex", Long.class);

    public final StringPath ecdLibelle = createString("ecdLibelle");

    public final NumberPath<java.math.BigDecimal> ecdMontant = createNumber("ecdMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final StringPath ecdPostit = createString("ecdPostit");

    public final NumberPath<java.math.BigDecimal> ecdResteEmarger = createNumber("ecdResteEmarger", java.math.BigDecimal.class);

    public final StringPath ecdSens = createString("ecdSens");

    public final NumberPath<Long> ecrOrdre = createNumber("ecrOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<java.math.BigDecimal> tauxTva = createNumber("tauxTva", java.math.BigDecimal.class);

    public final StringPath type = createString("type");

    public final com.querydsl.sql.PrimaryKey<QEcritureDetail> ecritureDetailPk = createPrimaryKey(ecdOrdre);

    public QEcritureDetail(String variable) {
        super(QEcritureDetail.class, forVariable(variable), "GFC", "ECRITURE_DETAIL");
        addMetadata();
    }

    public QEcritureDetail(String variable, String schema, String table) {
        super(QEcritureDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEcritureDetail(Path<? extends QEcritureDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ECRITURE_DETAIL");
        addMetadata();
    }

    public QEcritureDetail(PathMetadata metadata) {
        super(QEcritureDetail.class, metadata, "GFC", "ECRITURE_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdCommentaire, ColumnMetadata.named("ECD_COMMENTAIRE").withIndex(13).ofType(Types.VARCHAR).withSize(200));
        addMetadata(ecdCredit, ColumnMetadata.named("ECD_CREDIT").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(ecdDebit, ColumnMetadata.named("ECD_DEBIT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(ecdIndex, ColumnMetadata.named("ECD_INDEX").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ecdLibelle, ColumnMetadata.named("ECD_LIBELLE").withIndex(12).ofType(Types.VARCHAR).withSize(500));
        addMetadata(ecdMontant, ColumnMetadata.named("ECD_MONTANT").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ecdPostit, ColumnMetadata.named("ECD_POSTIT").withIndex(14).ofType(Types.VARCHAR).withSize(200));
        addMetadata(ecdResteEmarger, ColumnMetadata.named("ECD_RESTE_EMARGER").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ecdSens, ColumnMetadata.named("ECD_SENS").withIndex(6).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(ecrOrdre, ColumnMetadata.named("ECR_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(5).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(7).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(tauxTva, ColumnMetadata.named("TAUX_TVA").withIndex(17).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(type, ColumnMetadata.named("TYPE").withIndex(16).ofType(Types.VARCHAR).withSize(30));
    }

}


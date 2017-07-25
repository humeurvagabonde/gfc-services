package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptRecette is a Querydsl query type for QCptRecette
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptRecette extends com.querydsl.sql.RelationalPathBase<QCptRecette> {

    private static final long serialVersionUID = 1196605331;

    public static final QCptRecette cptRecette = new QCptRecette("CPT_RECETTE");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath modCode = createString("modCode");

    public final NumberPath<Long> modOrdre = createNumber("modOrdre", Long.class);

    public final NumberPath<Long> morOrdre = createNumber("morOrdre", Long.class);

    public final NumberPath<Long> orgOrdre = createNumber("orgOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> recDate = createDateTime("recDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> recDateLimitePaiement = createDateTime("recDateLimitePaiement", java.sql.Timestamp.class);

    public final StringPath recDebiteur = createString("recDebiteur");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final StringPath recImputtva = createString("recImputtva");

    public final StringPath recInterne = createString("recInterne");

    public final StringPath recLibelle = createString("recLibelle");

    public final StringPath recLigneBudgetaire = createString("recLigneBudgetaire");

    public final StringPath recMonnaie = createString("recMonnaie");

    public final NumberPath<java.math.BigDecimal> recMont = createNumber("recMont", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recMontantDisquette = createNumber("recMontantDisquette", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recMonttva = createNumber("recMonttva", java.math.BigDecimal.class);

    public final NumberPath<Long> recNum = createNumber("recNum", Long.class);

    public final NumberPath<Long> recPiece = createNumber("recPiece", Long.class);

    public final StringPath recRef = createString("recRef");

    public final StringPath recStat = createString("recStat");

    public final StringPath recSuppression = createString("recSuppression");

    public final StringPath recType = createString("recType");

    public final StringPath recVirement = createString("recVirement");

    public final NumberPath<Long> ribOrdre = createNumber("ribOrdre", Long.class);

    public final NumberPath<Long> titId = createNumber("titId", Long.class);

    public final NumberPath<java.math.BigDecimal> titMonttc = createNumber("titMonttc", java.math.BigDecimal.class);

    public final NumberPath<Long> titOrdre = createNumber("titOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCptRecette> cptRecettePk = createPrimaryKey(recId);

    public QCptRecette(String variable) {
        super(QCptRecette.class, forVariable(variable), "GFC", "CPT_RECETTE");
        addMetadata();
    }

    public QCptRecette(String variable, String schema, String table) {
        super(QCptRecette.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptRecette(Path<? extends QCptRecette> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_RECETTE");
        addMetadata();
    }

    public QCptRecette(PathMetadata metadata) {
        super(QCptRecette.class, metadata, "GFC", "CPT_RECETTE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(27).ofType(Types.DECIMAL).withSize(38));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(modCode, ColumnMetadata.named("MOD_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(3));
        addMetadata(modOrdre, ColumnMetadata.named("MOD_ORDRE").withIndex(28).ofType(Types.DECIMAL).withSize(38));
        addMetadata(morOrdre, ColumnMetadata.named("MOR_ORDRE").withIndex(29).ofType(Types.DECIMAL).withSize(0));
        addMetadata(orgOrdre, ColumnMetadata.named("ORG_ORDRE").withIndex(26).ofType(Types.DECIMAL).withSize(38));
        addMetadata(recDate, ColumnMetadata.named("REC_DATE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(recDateLimitePaiement, ColumnMetadata.named("REC_DATE_LIMITE_PAIEMENT").withIndex(31).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(recDebiteur, ColumnMetadata.named("REC_DEBITEUR").withIndex(6).ofType(Types.VARCHAR).withSize(120));
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recImputtva, ColumnMetadata.named("REC_IMPUTTVA").withIndex(7).ofType(Types.VARCHAR).withSize(6));
        addMetadata(recInterne, ColumnMetadata.named("REC_INTERNE").withIndex(8).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(recLibelle, ColumnMetadata.named("REC_LIBELLE").withIndex(9).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(recLigneBudgetaire, ColumnMetadata.named("REC_LIGNE_BUDGETAIRE").withIndex(10).ofType(Types.VARCHAR).withSize(200));
        addMetadata(recMonnaie, ColumnMetadata.named("REC_MONNAIE").withIndex(11).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(recMont, ColumnMetadata.named("REC_MONT").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recMontantDisquette, ColumnMetadata.named("REC_MONTANT_DISQUETTE").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recMonttva, ColumnMetadata.named("REC_MONTTVA").withIndex(15).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recNum, ColumnMetadata.named("REC_NUM").withIndex(16).ofType(Types.DECIMAL).withSize(38));
        addMetadata(recPiece, ColumnMetadata.named("REC_PIECE").withIndex(17).ofType(Types.DECIMAL).withSize(38));
        addMetadata(recRef, ColumnMetadata.named("REC_REF").withIndex(18).ofType(Types.VARCHAR).withSize(15));
        addMetadata(recStat, ColumnMetadata.named("REC_STAT").withIndex(19).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(recSuppression, ColumnMetadata.named("REC_SUPPRESSION").withIndex(20).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(recType, ColumnMetadata.named("REC_TYPE").withIndex(21).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(recVirement, ColumnMetadata.named("REC_VIREMENT").withIndex(22).ofType(Types.CHAR).withSize(1));
        addMetadata(ribOrdre, ColumnMetadata.named("RIB_ORDRE").withIndex(30).ofType(Types.DECIMAL).withSize(38));
        addMetadata(titId, ColumnMetadata.named("TIT_ID").withIndex(23).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(titMonttc, ColumnMetadata.named("TIT_MONTTC").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(titOrdre, ColumnMetadata.named("TIT_ORDRE").withIndex(24).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(25).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptbudBrouillardDetail is a Querydsl query type for QCptbudBrouillardDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptbudBrouillardDetail extends com.querydsl.sql.RelationalPathBase<QCptbudBrouillardDetail> {

    private static final long serialVersionUID = -1756327931;

    public static final QCptbudBrouillardDetail cptbudBrouillardDetail = new QCptbudBrouillardDetail("CPTBUD_BROUILLARD_DETAIL");

    public final NumberPath<java.math.BigDecimal> aeCredit = createNumber("aeCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> aeDebit = createNumber("aeDebit", java.math.BigDecimal.class);

    public final StringPath commentaire = createString("commentaire");

    public final NumberPath<java.math.BigDecimal> cpCredit = createNumber("cpCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cpDebit = createNumber("cpDebit", java.math.BigDecimal.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> idAdmOrigineRecette = createNumber("idAdmOrigineRecette", Long.class);

    public final NumberPath<Long> idCptbudBrouillardDetail = createNumber("idCptbudBrouillardDetail", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> indexBrouillardDetail = createNumber("indexBrouillardDetail", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<java.math.BigDecimal> recCredit = createNumber("recCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recDebit = createNumber("recDebit", java.math.BigDecimal.class);

    public final StringPath section = createString("section");

    public final com.querydsl.sql.PrimaryKey<QCptbudBrouillardDetail> cptbudBrouillardDetailPk = createPrimaryKey(idCptbudBrouillardDetail);

    public QCptbudBrouillardDetail(String variable) {
        super(QCptbudBrouillardDetail.class, forVariable(variable), "GFC", "CPTBUD_BROUILLARD_DETAIL");
        addMetadata();
    }

    public QCptbudBrouillardDetail(String variable, String schema, String table) {
        super(QCptbudBrouillardDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptbudBrouillardDetail(Path<? extends QCptbudBrouillardDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTBUD_BROUILLARD_DETAIL");
        addMetadata();
    }

    public QCptbudBrouillardDetail(PathMetadata metadata) {
        super(QCptbudBrouillardDetail.class, metadata, "GFC", "CPTBUD_BROUILLARD_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeCredit, ColumnMetadata.named("AE_CREDIT").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(aeDebit, ColumnMetadata.named("AE_DEBIT").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(18).ofType(Types.VARCHAR).withSize(200));
        addMetadata(cpCredit, ColumnMetadata.named("CP_CREDIT").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(cpDebit, ColumnMetadata.named("CP_DEBIT").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(8).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(6).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmOrigineRecette, ColumnMetadata.named("ID_ADM_ORIGINE_RECETTE").withIndex(9).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idCptbudBrouillardDetail, ColumnMetadata.named("ID_CPTBUD_BROUILLARD_DETAIL").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(indexBrouillardDetail, ColumnMetadata.named("INDEX_BROUILLARD_DETAIL").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(17).ofType(Types.VARCHAR).withSize(500));
        addMetadata(recCredit, ColumnMetadata.named("REC_CREDIT").withIndex(16).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(recDebit, ColumnMetadata.named("REC_DEBIT").withIndex(15).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(section, ColumnMetadata.named("SECTION").withIndex(10).ofType(Types.VARCHAR).withSize(1));
    }

}


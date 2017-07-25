package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCptbudRecSoldeTheor is a Querydsl query type for QVCptbudRecSoldeTheor
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCptbudRecSoldeTheor extends com.querydsl.sql.RelationalPathBase<QVCptbudRecSoldeTheor> {

    private static final long serialVersionUID = -1011920291;

    public static final QVCptbudRecSoldeTheor vCptbudRecSoldeTheor = new QVCptbudRecSoldeTheor("V_CPTBUD_REC_SOLDE_THEOR");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> idAdmOrigineRecette = createNumber("idAdmOrigineRecette", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<java.math.BigDecimal> recCredit = createNumber("recCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recDebit = createNumber("recDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recSolde = createNumber("recSolde", java.math.BigDecimal.class);

    public final StringPath section = createString("section");

    public QVCptbudRecSoldeTheor(String variable) {
        super(QVCptbudRecSoldeTheor.class, forVariable(variable), "GFC", "V_CPTBUD_REC_SOLDE_THEOR");
        addMetadata();
    }

    public QVCptbudRecSoldeTheor(String variable, String schema, String table) {
        super(QVCptbudRecSoldeTheor.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCptbudRecSoldeTheor(Path<? extends QVCptbudRecSoldeTheor> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CPTBUD_REC_SOLDE_THEOR");
        addMetadata();
    }

    public QVCptbudRecSoldeTheor(PathMetadata metadata) {
        super(QVCptbudRecSoldeTheor.class, metadata, "GFC", "V_CPTBUD_REC_SOLDE_THEOR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmOrigineRecette, ColumnMetadata.named("ID_ADM_ORIGINE_RECETTE").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(recCredit, ColumnMetadata.named("REC_CREDIT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(recDebit, ColumnMetadata.named("REC_DEBIT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(recSolde, ColumnMetadata.named("REC_SOLDE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(section, ColumnMetadata.named("SECTION").withIndex(6).ofType(Types.VARCHAR).withSize(1));
    }

}


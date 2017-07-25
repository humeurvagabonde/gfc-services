package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCptbudRecSoldeTheorCtrl is a Querydsl query type for QVCptbudRecSoldeTheorCtrl
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCptbudRecSoldeTheorCtrl extends com.querydsl.sql.RelationalPathBase<QVCptbudRecSoldeTheorCtrl> {

    private static final long serialVersionUID = -587918744;

    public static final QVCptbudRecSoldeTheorCtrl vCptbudRecSoldeTheorCtrl = new QVCptbudRecSoldeTheorCtrl("V_CPTBUD_REC_SOLDE_THEOR_CTRL");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> idAdmOrigineRecette = createNumber("idAdmOrigineRecette", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final StringPath llOperation = createString("llOperation");

    public final StringPath natureRecetteCode = createString("natureRecetteCode");

    public final StringPath natureRecetteLibelle = createString("natureRecetteLibelle");

    public final StringPath opeNumero = createString("opeNumero");

    public final StringPath orgCr = createString("orgCr");

    public final StringPath orgEtab = createString("orgEtab");

    public final StringPath orgSouscr = createString("orgSouscr");

    public final StringPath orgUb = createString("orgUb");

    public final StringPath origineRecetteCode = createString("origineRecetteCode");

    public final StringPath origineRecetteLibelle = createString("origineRecetteLibelle");

    public final NumberPath<java.math.BigDecimal> recCredit = createNumber("recCredit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recDebit = createNumber("recDebit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> recSolde = createNumber("recSolde", java.math.BigDecimal.class);

    public final StringPath section = createString("section");

    public QVCptbudRecSoldeTheorCtrl(String variable) {
        super(QVCptbudRecSoldeTheorCtrl.class, forVariable(variable), "GFC", "V_CPTBUD_REC_SOLDE_THEOR_CTRL");
        addMetadata();
    }

    public QVCptbudRecSoldeTheorCtrl(String variable, String schema, String table) {
        super(QVCptbudRecSoldeTheorCtrl.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCptbudRecSoldeTheorCtrl(Path<? extends QVCptbudRecSoldeTheorCtrl> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CPTBUD_REC_SOLDE_THEOR_CTRL");
        addMetadata();
    }

    public QVCptbudRecSoldeTheorCtrl(PathMetadata metadata) {
        super(QVCptbudRecSoldeTheorCtrl.class, metadata, "GFC", "V_CPTBUD_REC_SOLDE_THEOR_CTRL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(10).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmOrigineRecette, ColumnMetadata.named("ID_ADM_ORIGINE_RECETTE").withIndex(13).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(llOperation, ColumnMetadata.named("LL_OPERATION").withIndex(9).ofType(Types.VARCHAR).withSize(500));
        addMetadata(natureRecetteCode, ColumnMetadata.named("NATURE_RECETTE_CODE").withIndex(11).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(natureRecetteLibelle, ColumnMetadata.named("NATURE_RECETTE_LIBELLE").withIndex(12).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(opeNumero, ColumnMetadata.named("OPE_NUMERO").withIndex(8).ofType(Types.VARCHAR).withSize(57));
        addMetadata(orgCr, ColumnMetadata.named("ORG_CR").withIndex(5).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgEtab, ColumnMetadata.named("ORG_ETAB").withIndex(3).ofType(Types.VARCHAR).withSize(10));
        addMetadata(orgSouscr, ColumnMetadata.named("ORG_SOUSCR").withIndex(6).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgUb, ColumnMetadata.named("ORG_UB").withIndex(4).ofType(Types.VARCHAR).withSize(10));
        addMetadata(origineRecetteCode, ColumnMetadata.named("ORIGINE_RECETTE_CODE").withIndex(14).ofType(Types.VARCHAR).withSize(7));
        addMetadata(origineRecetteLibelle, ColumnMetadata.named("ORIGINE_RECETTE_LIBELLE").withIndex(15).ofType(Types.VARCHAR).withSize(120));
        addMetadata(recCredit, ColumnMetadata.named("REC_CREDIT").withIndex(17).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(recDebit, ColumnMetadata.named("REC_DEBIT").withIndex(18).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(recSolde, ColumnMetadata.named("REC_SOLDE").withIndex(19).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(section, ColumnMetadata.named("SECTION").withIndex(16).ofType(Types.VARCHAR).withSize(1));
    }

}


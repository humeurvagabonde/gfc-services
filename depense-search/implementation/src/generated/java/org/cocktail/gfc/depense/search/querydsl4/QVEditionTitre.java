package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVEditionTitre is a Querydsl query type for QVEditionTitre
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVEditionTitre extends com.querydsl.sql.RelationalPathBase<QVEditionTitre> {

    private static final long serialVersionUID = 671077376;

    public static final QVEditionTitre vEditionTitre = new QVEditionTitre("V_EDITION_TITRE");

    public final StringPath adrAdresse1 = createString("adrAdresse1");

    public final StringPath adrAdresse2 = createString("adrAdresse2");

    public final StringPath adrBp = createString("adrBp");

    public final NumberPath<Long> adrOrdre = createNumber("adrOrdre", Long.class);

    public final NumberPath<Long> borId = createNumber("borId", Long.class);

    public final NumberPath<Long> borNum = createNumber("borNum", Long.class);

    public final StringPath codePostal = createString("codePostal");

    public final StringPath cPays = createString("cPays");

    public final StringPath cpEtranger = createString("cpEtranger");

    public final StringPath debiteur = createString("debiteur");

    public final StringPath debiteurSiret = createString("debiteurSiret");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> facId = createNumber("facId", Long.class);

    public final NumberPath<Long> facNumero = createNumber("facNumero", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath ligneBudg = createString("ligneBudg");

    public final StringPath montantLettre = createString("montantLettre");

    public final StringPath orgLib = createString("orgLib");

    public final StringPath pcoChapitre = createString("pcoChapitre");

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> recNumero = createNumber("recNumero", Long.class);

    public final NumberPath<Long> rpcoId = createNumber("rpcoId", Long.class);

    public final NumberPath<Long> tboOrdre = createNumber("tboOrdre", Long.class);

    public final StringPath titAdresse = createString("titAdresse");

    public final DateTimePath<java.sql.Timestamp> titDate = createDateTime("titDate", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> titHt = createNumber("titHt", java.math.BigDecimal.class);

    public final NumberPath<Long> titId = createNumber("titId", Long.class);

    public final StringPath titLibelle = createString("titLibelle");

    public final NumberPath<Long> titNbPiece = createNumber("titNbPiece", Long.class);

    public final NumberPath<Long> titNumero = createNumber("titNumero", Long.class);

    public final NumberPath<java.math.BigDecimal> titTtc = createNumber("titTtc", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> titTva = createNumber("titTva", java.math.BigDecimal.class);

    public final StringPath ville = createString("ville");

    public QVEditionTitre(String variable) {
        super(QVEditionTitre.class, forVariable(variable), "GFC", "V_EDITION_TITRE");
        addMetadata();
    }

    public QVEditionTitre(String variable, String schema, String table) {
        super(QVEditionTitre.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVEditionTitre(Path<? extends QVEditionTitre> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_EDITION_TITRE");
        addMetadata();
    }

    public QVEditionTitre(PathMetadata metadata) {
        super(QVEditionTitre.class, metadata, "GFC", "V_EDITION_TITRE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adrAdresse1, ColumnMetadata.named("ADR_ADRESSE1").withIndex(27).ofType(Types.VARCHAR).withSize(100));
        addMetadata(adrAdresse2, ColumnMetadata.named("ADR_ADRESSE2").withIndex(28).ofType(Types.VARCHAR).withSize(300));
        addMetadata(adrBp, ColumnMetadata.named("ADR_BP").withIndex(33).ofType(Types.VARCHAR).withSize(7));
        addMetadata(adrOrdre, ColumnMetadata.named("ADR_ORDRE").withIndex(26).ofType(Types.DECIMAL).withSize(0));
        addMetadata(borId, ColumnMetadata.named("BOR_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(borNum, ColumnMetadata.named("BOR_NUM").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(codePostal, ColumnMetadata.named("CODE_POSTAL").withIndex(29).ofType(Types.VARCHAR).withSize(10));
        addMetadata(cPays, ColumnMetadata.named("C_PAYS").withIndex(32).ofType(Types.VARCHAR).withSize(3));
        addMetadata(cpEtranger, ColumnMetadata.named("CP_ETRANGER").withIndex(31).ofType(Types.VARCHAR).withSize(10));
        addMetadata(debiteur, ColumnMetadata.named("DEBITEUR").withIndex(19).ofType(Types.VARCHAR).withSize(247));
        addMetadata(debiteurSiret, ColumnMetadata.named("DEBITEUR_SIRET").withIndex(34).ofType(Types.VARCHAR).withSize(14));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(facId, ColumnMetadata.named("FAC_ID").withIndex(25).ofType(Types.DECIMAL).withSize(0));
        addMetadata(facNumero, ColumnMetadata.named("FAC_NUMERO").withIndex(24).ofType(Types.DECIMAL).withSize(0));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(20).ofType(Types.DECIMAL).withSize(38));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(14).ofType(Types.VARCHAR).withSize(10));
        addMetadata(ligneBudg, ColumnMetadata.named("LIGNE_BUDG").withIndex(15).ofType(Types.VARCHAR).withSize(112));
        addMetadata(montantLettre, ColumnMetadata.named("MONTANT_LETTRE").withIndex(22).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(orgLib, ColumnMetadata.named("ORG_LIB").withIndex(16).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(pcoChapitre, ColumnMetadata.named("PCO_CHAPITRE").withIndex(18).ofType(Types.VARCHAR).withSize(3));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(2).ofType(Types.VARCHAR).withSize(20));
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(35).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recNumero, ColumnMetadata.named("REC_NUMERO").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rpcoId, ColumnMetadata.named("RPCO_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tboOrdre, ColumnMetadata.named("TBO_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(titAdresse, ColumnMetadata.named("TIT_ADRESSE").withIndex(23).ofType(Types.VARCHAR).withSize(522));
        addMetadata(titDate, ColumnMetadata.named("TIT_DATE").withIndex(17).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(titHt, ColumnMetadata.named("TIT_HT").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(titId, ColumnMetadata.named("TIT_ID").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(titLibelle, ColumnMetadata.named("TIT_LIBELLE").withIndex(21).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(titNbPiece, ColumnMetadata.named("TIT_NB_PIECE").withIndex(8).ofType(Types.DECIMAL).withSize(38));
        addMetadata(titNumero, ColumnMetadata.named("TIT_NUMERO").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(titTtc, ColumnMetadata.named("TIT_TTC").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(titTva, ColumnMetadata.named("TIT_TVA").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(ville, ColumnMetadata.named("VILLE").withIndex(30).ofType(Types.VARCHAR).withSize(60));
    }

}


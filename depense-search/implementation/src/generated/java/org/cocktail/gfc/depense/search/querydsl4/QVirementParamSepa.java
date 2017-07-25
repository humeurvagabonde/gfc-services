package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVirementParamSepa is a Querydsl query type for QVirementParamSepa
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVirementParamSepa extends com.querydsl.sql.RelationalPathBase<QVirementParamSepa> {

    private static final long serialVersionUID = 1093133634;

    public static final QVirementParamSepa virementParamSepa = new QVirementParamSepa("VIREMENT_PARAM_SEPA");

    public final NumberPath<Long> tviOrdre = createNumber("tviOrdre", Long.class);

    public final StringPath vpsDftDevise = createString("vpsDftDevise");

    public final StringPath vpsDftIban = createString("vpsDftIban");

    public final StringPath vpsDftTitulaire = createString("vpsDftTitulaire");

    public final StringPath vpsDftTransfertId = createString("vpsDftTransfertId");

    public final StringPath vpsEmetteurNom = createString("vpsEmetteurNom");

    public final StringPath vpsEtat = createString("vpsEtat");

    public final NumberPath<Long> vpsOrdre = createNumber("vpsOrdre", Long.class);

    public final StringPath vpsTgBic = createString("vpsTgBic");

    public final StringPath vpsTgCodique = createString("vpsTgCodique");

    public final StringPath vpsTgIban = createString("vpsTgIban");

    public final StringPath vpsTgNom = createString("vpsTgNom");

    public final com.querydsl.sql.PrimaryKey<QVirementParamSepa> virementParamSepaPk = createPrimaryKey(vpsOrdre);

    public QVirementParamSepa(String variable) {
        super(QVirementParamSepa.class, forVariable(variable), "GFC", "VIREMENT_PARAM_SEPA");
        addMetadata();
    }

    public QVirementParamSepa(String variable, String schema, String table) {
        super(QVirementParamSepa.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVirementParamSepa(Path<? extends QVirementParamSepa> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VIREMENT_PARAM_SEPA");
        addMetadata();
    }

    public QVirementParamSepa(PathMetadata metadata) {
        super(QVirementParamSepa.class, metadata, "GFC", "VIREMENT_PARAM_SEPA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tviOrdre, ColumnMetadata.named("TVI_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(vpsDftDevise, ColumnMetadata.named("VPS_DFT_DEVISE").withIndex(11).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(vpsDftIban, ColumnMetadata.named("VPS_DFT_IBAN").withIndex(7).ofType(Types.VARCHAR).withSize(34).notNull());
        addMetadata(vpsDftTitulaire, ColumnMetadata.named("VPS_DFT_TITULAIRE").withIndex(8).ofType(Types.VARCHAR).withSize(70).notNull());
        addMetadata(vpsDftTransfertId, ColumnMetadata.named("VPS_DFT_TRANSFERT_ID").withIndex(10).ofType(Types.VARCHAR).withSize(8).notNull());
        addMetadata(vpsEmetteurNom, ColumnMetadata.named("VPS_EMETTEUR_NOM").withIndex(9).ofType(Types.VARCHAR).withSize(70).notNull());
        addMetadata(vpsEtat, ColumnMetadata.named("VPS_ETAT").withIndex(12).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(vpsOrdre, ColumnMetadata.named("VPS_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(vpsTgBic, ColumnMetadata.named("VPS_TG_BIC").withIndex(4).ofType(Types.VARCHAR).withSize(11).notNull());
        addMetadata(vpsTgCodique, ColumnMetadata.named("VPS_TG_CODIQUE").withIndex(6).ofType(Types.VARCHAR).withSize(7).notNull());
        addMetadata(vpsTgIban, ColumnMetadata.named("VPS_TG_IBAN").withIndex(5).ofType(Types.VARCHAR).withSize(34).notNull());
        addMetadata(vpsTgNom, ColumnMetadata.named("VPS_TG_NOM").withIndex(3).ofType(Types.VARCHAR).withSize(70).notNull());
    }

}


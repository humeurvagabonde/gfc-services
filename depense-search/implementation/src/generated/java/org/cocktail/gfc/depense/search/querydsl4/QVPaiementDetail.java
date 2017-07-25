package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVPaiementDetail is a Querydsl query type for QVPaiementDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVPaiementDetail extends com.querydsl.sql.RelationalPathBase<QVPaiementDetail> {

    private static final long serialVersionUID = -1170342168;

    public static final QVPaiementDetail vPaiementDetail = new QVPaiementDetail("V_PAIEMENT_DETAIL");

    public final StringPath adrCivilite = createString("adrCivilite");

    public final StringPath adrNom = createString("adrNom");

    public final StringPath adrPrenom = createString("adrPrenom");

    public final DateTimePath<java.sql.Timestamp> dateEmissionDate = createDateTime("dateEmissionDate", java.sql.Timestamp.class);

    public final StringPath dateEmissionString = createString("dateEmissionString");

    public final NumberPath<java.math.BigDecimal> montantPaye = createNumber("montantPaye", java.math.BigDecimal.class);

    public final StringPath numFactureFournisseur = createString("numFactureFournisseur");

    public final StringPath objetType = createString("objetType");

    public final DateTimePath<java.sql.Timestamp> paiDateCreation = createDateTime("paiDateCreation", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> paiMontant = createNumber("paiMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> paiNbVirements = createNumber("paiNbVirements", Long.class);

    public final NumberPath<Long> paiNumero = createNumber("paiNumero", Long.class);

    public final NumberPath<Long> paiOrdre = createNumber("paiOrdre", Long.class);

    public final StringPath ribBic = createString("ribBic");

    public final StringPath ribCle = createString("ribCle");

    public final StringPath ribCodbanc = createString("ribCodbanc");

    public final StringPath ribDomicil = createString("ribDomicil");

    public final StringPath ribGuich = createString("ribGuich");

    public final StringPath ribIban = createString("ribIban");

    public final StringPath ribNum = createString("ribNum");

    public final StringPath ribTitco = createString("ribTitco");

    public final StringPath tviLibelle = createString("tviLibelle");

    public QVPaiementDetail(String variable) {
        super(QVPaiementDetail.class, forVariable(variable), "GFC", "V_PAIEMENT_DETAIL");
        addMetadata();
    }

    public QVPaiementDetail(String variable, String schema, String table) {
        super(QVPaiementDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVPaiementDetail(Path<? extends QVPaiementDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_PAIEMENT_DETAIL");
        addMetadata();
    }

    public QVPaiementDetail(PathMetadata metadata) {
        super(QVPaiementDetail.class, metadata, "GFC", "V_PAIEMENT_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adrCivilite, ColumnMetadata.named("ADR_CIVILITE").withIndex(10).ofType(Types.VARCHAR).withSize(5));
        addMetadata(adrNom, ColumnMetadata.named("ADR_NOM").withIndex(8).ofType(Types.VARCHAR).withSize(200));
        addMetadata(adrPrenom, ColumnMetadata.named("ADR_PRENOM").withIndex(9).ofType(Types.VARCHAR).withSize(40));
        addMetadata(dateEmissionDate, ColumnMetadata.named("DATE_EMISSION_DATE").withIndex(19).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dateEmissionString, ColumnMetadata.named("DATE_EMISSION_STRING").withIndex(20).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(montantPaye, ColumnMetadata.named("MONTANT_PAYE").withIndex(22).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(numFactureFournisseur, ColumnMetadata.named("NUM_FACTURE_FOURNISSEUR").withIndex(21).ofType(Types.VARCHAR).withSize(50));
        addMetadata(objetType, ColumnMetadata.named("OBJET_TYPE").withIndex(1).ofType(Types.CHAR).withSize(2));
        addMetadata(paiDateCreation, ColumnMetadata.named("PAI_DATE_CREATION").withIndex(4).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(paiMontant, ColumnMetadata.named("PAI_MONTANT").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(paiNbVirements, ColumnMetadata.named("PAI_NB_VIREMENTS").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(paiNumero, ColumnMetadata.named("PAI_NUMERO").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(paiOrdre, ColumnMetadata.named("PAI_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ribBic, ColumnMetadata.named("RIB_BIC").withIndex(11).ofType(Types.VARCHAR).withSize(11));
        addMetadata(ribCle, ColumnMetadata.named("RIB_CLE").withIndex(12).ofType(Types.VARCHAR).withSize(2));
        addMetadata(ribCodbanc, ColumnMetadata.named("RIB_CODBANC").withIndex(13).ofType(Types.VARCHAR).withSize(5));
        addMetadata(ribDomicil, ColumnMetadata.named("RIB_DOMICIL").withIndex(16).ofType(Types.VARCHAR).withSize(200));
        addMetadata(ribGuich, ColumnMetadata.named("RIB_GUICH").withIndex(14).ofType(Types.VARCHAR).withSize(5));
        addMetadata(ribIban, ColumnMetadata.named("RIB_IBAN").withIndex(15).ofType(Types.VARCHAR).withSize(34));
        addMetadata(ribNum, ColumnMetadata.named("RIB_NUM").withIndex(17).ofType(Types.VARCHAR).withSize(11));
        addMetadata(ribTitco, ColumnMetadata.named("RIB_TITCO").withIndex(18).ofType(Types.VARCHAR).withSize(200));
        addMetadata(tviLibelle, ColumnMetadata.named("TVI_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(20));
    }

}


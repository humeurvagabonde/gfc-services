package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSepaSddEcheance is a Querydsl query type for QSepaSddEcheance
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSepaSddEcheance extends com.querydsl.sql.RelationalPathBase<QSepaSddEcheance> {

    private static final long serialVersionUID = 1679518320;

    public static final QSepaSddEcheance sepaSddEcheance = new QSepaSddEcheance("SEPA_SDD_ECHEANCE");

    public final StringPath commentaire = createString("commentaire");

    public final StringPath creancierIcs = createString("creancierIcs");

    public final StringPath creancierId = createString("creancierId");

    public final StringPath creancierNom = createString("creancierNom");

    public final StringPath dCreation = createString("dCreation");

    public final StringPath debiteurBic = createString("debiteurBic");

    public final StringPath debiteurIban = createString("debiteurIban");

    public final StringPath debiteurId = createString("debiteurId");

    public final StringPath debiteurNom = createString("debiteurNom");

    public final StringPath dModification = createString("dModification");

    public final StringPath dPreleve = createString("dPreleve");

    public final StringPath dPrevue = createString("dPrevue");

    public final StringPath etat = createString("etat");

    public final NumberPath<Long> idSepaSddEcheance = createNumber("idSepaSddEcheance", Long.class);

    public final NumberPath<Long> idSepaSddEcheancier = createNumber("idSepaSddEcheancier", Long.class);

    public final NumberPath<java.math.BigDecimal> montant = createNumber("montant", java.math.BigDecimal.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final NumberPath<Long> recoOrdre = createNumber("recoOrdre", Long.class);

    public final StringPath rum = createString("rum");

    public final StringPath sddTypeOp = createString("sddTypeOp");

    public final com.querydsl.sql.PrimaryKey<QSepaSddEcheance> sepaSddEcheancePk = createPrimaryKey(idSepaSddEcheance);

    public QSepaSddEcheance(String variable) {
        super(QSepaSddEcheance.class, forVariable(variable), "GFC", "SEPA_SDD_ECHEANCE");
        addMetadata();
    }

    public QSepaSddEcheance(String variable, String schema, String table) {
        super(QSepaSddEcheance.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSepaSddEcheance(Path<? extends QSepaSddEcheance> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SEPA_SDD_ECHEANCE");
        addMetadata();
    }

    public QSepaSddEcheance(PathMetadata metadata) {
        super(QSepaSddEcheance.class, metadata, "GFC", "SEPA_SDD_ECHEANCE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(21).ofType(Types.VARCHAR).withSize(500));
        addMetadata(creancierIcs, ColumnMetadata.named("CREANCIER_ICS").withIndex(15).ofType(Types.VARCHAR).withSize(30));
        addMetadata(creancierId, ColumnMetadata.named("CREANCIER_ID").withIndex(13).ofType(Types.VARCHAR).withSize(35));
        addMetadata(creancierNom, ColumnMetadata.named("CREANCIER_NOM").withIndex(14).ofType(Types.VARCHAR).withSize(200));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(5).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(debiteurBic, ColumnMetadata.named("DEBITEUR_BIC").withIndex(18).ofType(Types.VARCHAR).withSize(11));
        addMetadata(debiteurIban, ColumnMetadata.named("DEBITEUR_IBAN").withIndex(19).ofType(Types.VARCHAR).withSize(35));
        addMetadata(debiteurId, ColumnMetadata.named("DEBITEUR_ID").withIndex(16).ofType(Types.VARCHAR).withSize(35));
        addMetadata(debiteurNom, ColumnMetadata.named("DEBITEUR_NOM").withIndex(17).ofType(Types.VARCHAR).withSize(200));
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(6).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(dPreleve, ColumnMetadata.named("D_PRELEVE").withIndex(8).ofType(Types.VARCHAR).withSize(100));
        addMetadata(dPrevue, ColumnMetadata.named("D_PREVUE").withIndex(7).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(etat, ColumnMetadata.named("ETAT").withIndex(9).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(idSepaSddEcheance, ColumnMetadata.named("ID_SEPA_SDD_ECHEANCE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddEcheancier, ColumnMetadata.named("ID_SEPA_SDD_ECHEANCIER").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(montant, ColumnMetadata.named("MONTANT").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recoOrdre, ColumnMetadata.named("RECO_ORDRE").withIndex(11).ofType(Types.DECIMAL).withSize(0));
        addMetadata(rum, ColumnMetadata.named("RUM").withIndex(12).ofType(Types.VARCHAR).withSize(35));
        addMetadata(sddTypeOp, ColumnMetadata.named("SDD_TYPE_OP").withIndex(20).ofType(Types.VARCHAR).withSize(4));
    }

}


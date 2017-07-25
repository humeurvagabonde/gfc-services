package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCheque is a Querydsl query type for QCheque
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCheque extends com.querydsl.sql.RelationalPathBase<QCheque> {

    private static final long serialVersionUID = -1662251413;

    public static final QCheque cheque = new QCheque("CHEQUE");

    public final StringPath banqAgence = createString("banqAgence");

    public final StringPath banqCode = createString("banqCode");

    public final StringPath banqLibelle = createString("banqLibelle");

    public final NumberPath<Long> borId = createNumber("borId", Long.class);

    public final DateTimePath<java.sql.Timestamp> cheDateCheque = createDateTime("cheDateCheque", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> cheDateSaisie = createDateTime("cheDateSaisie", java.sql.Timestamp.class);

    public final StringPath cheEtat = createString("cheEtat");

    public final NumberPath<java.math.BigDecimal> cheMontant = createNumber("cheMontant", java.math.BigDecimal.class);

    public final StringPath cheNomTireur = createString("cheNomTireur");

    public final StringPath cheNumeroCheque = createString("cheNumeroCheque");

    public final StringPath cheNumeroCompte = createString("cheNumeroCompte");

    public final NumberPath<Long> cheOrdre = createNumber("cheOrdre", Long.class);

    public final StringPath chePrenomTireur = createString("chePrenomTireur");

    public final StringPath rcptCode = createString("rcptCode");

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCheque> chequePk = createPrimaryKey(cheOrdre);

    public QCheque(String variable) {
        super(QCheque.class, forVariable(variable), "GFC", "CHEQUE");
        addMetadata();
    }

    public QCheque(String variable, String schema, String table) {
        super(QCheque.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCheque(Path<? extends QCheque> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CHEQUE");
        addMetadata();
    }

    public QCheque(PathMetadata metadata) {
        super(QCheque.class, metadata, "GFC", "CHEQUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(banqAgence, ColumnMetadata.named("BANQ_AGENCE").withIndex(8).ofType(Types.VARCHAR).withSize(50));
        addMetadata(banqCode, ColumnMetadata.named("BANQ_CODE").withIndex(6).ofType(Types.VARCHAR).withSize(9));
        addMetadata(banqLibelle, ColumnMetadata.named("BANQ_LIBELLE").withIndex(7).ofType(Types.VARCHAR).withSize(50));
        addMetadata(borId, ColumnMetadata.named("BOR_ID").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(cheDateCheque, ColumnMetadata.named("CHE_DATE_CHEQUE").withIndex(12).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(cheDateSaisie, ColumnMetadata.named("CHE_DATE_SAISIE").withIndex(13).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(cheEtat, ColumnMetadata.named("CHE_ETAT").withIndex(14).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(cheMontant, ColumnMetadata.named("CHE_MONTANT").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(cheNomTireur, ColumnMetadata.named("CHE_NOM_TIREUR").withIndex(3).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(cheNumeroCheque, ColumnMetadata.named("CHE_NUMERO_CHEQUE").withIndex(9).ofType(Types.VARCHAR).withSize(7).notNull());
        addMetadata(cheNumeroCompte, ColumnMetadata.named("CHE_NUMERO_COMPTE").withIndex(10).ofType(Types.VARCHAR).withSize(12));
        addMetadata(cheOrdre, ColumnMetadata.named("CHE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(chePrenomTireur, ColumnMetadata.named("CHE_PRENOM_TIREUR").withIndex(4).ofType(Types.VARCHAR).withSize(30));
        addMetadata(rcptCode, ColumnMetadata.named("RCPT_CODE").withIndex(5).ofType(Types.VARCHAR).withSize(3));
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(15).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


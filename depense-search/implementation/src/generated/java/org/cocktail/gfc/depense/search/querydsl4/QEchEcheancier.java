package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEchEcheancier is a Querydsl query type for QEchEcheancier
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEchEcheancier extends com.querydsl.sql.RelationalPathBase<QEchEcheancier> {

    private static final long serialVersionUID = -886158661;

    public static final QEchEcheancier echEcheancier = new QEchEcheancier("ECH_ECHEANCIER");

    public final StringPath echEtat = createString("echEtat");

    public final NumberPath<Long> echId = createNumber("echId", Long.class);

    public final StringPath echLibelle = createString("echLibelle");

    public final NumberPath<java.math.BigDecimal> echMontant = createNumber("echMontant", java.math.BigDecimal.class);

    public final StringPath echMontantLettres = createString("echMontantLettres");

    public final NumberPath<Long> echNbEcheances = createNumber("echNbEcheances", Long.class);

    public final NumberPath<Long> echtId = createNumber("echtId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QEchEcheancier> echEcheancierPk = createPrimaryKey(echId);

    public QEchEcheancier(String variable) {
        super(QEchEcheancier.class, forVariable(variable), "GFC", "ECH_ECHEANCIER");
        addMetadata();
    }

    public QEchEcheancier(String variable, String schema, String table) {
        super(QEchEcheancier.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEchEcheancier(Path<? extends QEchEcheancier> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ECH_ECHEANCIER");
        addMetadata();
    }

    public QEchEcheancier(PathMetadata metadata) {
        super(QEchEcheancier.class, metadata, "GFC", "ECH_ECHEANCIER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(echEtat, ColumnMetadata.named("ECH_ETAT").withIndex(7).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(echId, ColumnMetadata.named("ECH_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(echLibelle, ColumnMetadata.named("ECH_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(1000).notNull());
        addMetadata(echMontant, ColumnMetadata.named("ECH_MONTANT").withIndex(3).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(echMontantLettres, ColumnMetadata.named("ECH_MONTANT_LETTRES").withIndex(4).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(echNbEcheances, ColumnMetadata.named("ECH_NB_ECHEANCES").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(echtId, ColumnMetadata.named("ECHT_ID").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


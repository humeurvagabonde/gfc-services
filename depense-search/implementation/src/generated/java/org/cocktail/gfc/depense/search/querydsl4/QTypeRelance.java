package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeRelance is a Querydsl query type for QTypeRelance
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeRelance extends com.querydsl.sql.RelationalPathBase<QTypeRelance> {

    private static final long serialVersionUID = -1743004988;

    public static final QTypeRelance typeRelance = new QTypeRelance("TYPE_RELANCE");

    public final StringPath trlContactSuivi = createString("trlContactSuivi");

    public final NumberPath<Long> trlDelaiPaiement = createNumber("trlDelaiPaiement", Long.class);

    public final StringPath trlEtat = createString("trlEtat");

    public final StringPath trlLibelle1 = createString("trlLibelle1");

    public final StringPath trlLibelle2 = createString("trlLibelle2");

    public final StringPath trlLibelle3 = createString("trlLibelle3");

    public final NumberPath<Long> trlNiveau = createNumber("trlNiveau", Long.class);

    public final StringPath trlNom = createString("trlNom");

    public final NumberPath<Long> trlOrdre = createNumber("trlOrdre", Long.class);

    public final StringPath trlReportId = createString("trlReportId");

    public final StringPath trlSign = createString("trlSign");

    public final com.querydsl.sql.PrimaryKey<QTypeRelance> typeRelancePk = createPrimaryKey(trlOrdre);

    public QTypeRelance(String variable) {
        super(QTypeRelance.class, forVariable(variable), "GFC", "TYPE_RELANCE");
        addMetadata();
    }

    public QTypeRelance(String variable, String schema, String table) {
        super(QTypeRelance.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeRelance(Path<? extends QTypeRelance> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_RELANCE");
        addMetadata();
    }

    public QTypeRelance(PathMetadata metadata) {
        super(QTypeRelance.class, metadata, "GFC", "TYPE_RELANCE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(trlContactSuivi, ColumnMetadata.named("TRL_CONTACT_SUIVI").withIndex(11).ofType(Types.VARCHAR).withSize(200));
        addMetadata(trlDelaiPaiement, ColumnMetadata.named("TRL_DELAI_PAIEMENT").withIndex(8).ofType(Types.DECIMAL).withSize(12).notNull());
        addMetadata(trlEtat, ColumnMetadata.named("TRL_ETAT").withIndex(5).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(trlLibelle1, ColumnMetadata.named("TRL_LIBELLE1").withIndex(2).ofType(Types.VARCHAR).withSize(1000).notNull());
        addMetadata(trlLibelle2, ColumnMetadata.named("TRL_LIBELLE2").withIndex(3).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(trlLibelle3, ColumnMetadata.named("TRL_LIBELLE3").withIndex(7).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(trlNiveau, ColumnMetadata.named("TRL_NIVEAU").withIndex(4).ofType(Types.DECIMAL).withSize(12).notNull());
        addMetadata(trlNom, ColumnMetadata.named("TRL_NOM").withIndex(9).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(trlOrdre, ColumnMetadata.named("TRL_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(12).notNull());
        addMetadata(trlReportId, ColumnMetadata.named("TRL_REPORT_ID").withIndex(10).ofType(Types.VARCHAR).withSize(50));
        addMetadata(trlSign, ColumnMetadata.named("TRL_SIGN").withIndex(6).ofType(Types.VARCHAR).withSize(100));
    }

}


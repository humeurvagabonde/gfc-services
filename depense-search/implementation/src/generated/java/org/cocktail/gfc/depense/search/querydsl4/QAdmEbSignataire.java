package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmEbSignataire is a Querydsl query type for QAdmEbSignataire
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmEbSignataire extends com.querydsl.sql.RelationalPathBase<QAdmEbSignataire> {

    private static final long serialVersionUID = -94174136;

    public static final QAdmEbSignataire admEbSignataire = new QAdmEbSignataire("ADM_EB_SIGNATAIRE");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> noIndividu = createNumber("noIndividu", Long.class);

    public final DateTimePath<java.sql.Timestamp> orsiDateCloture = createDateTime("orsiDateCloture", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> orsiDateOuverture = createDateTime("orsiDateOuverture", java.sql.Timestamp.class);

    public final NumberPath<Long> orsiId = createNumber("orsiId", Long.class);

    public final StringPath orsiLibelleSignataire = createString("orsiLibelleSignataire");

    public final StringPath orsiReferenceDelegation = createString("orsiReferenceDelegation");

    public final NumberPath<Long> tysiId = createNumber("tysiId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmEbSignataire> sysC0024460 = createPrimaryKey(orsiId);

    public QAdmEbSignataire(String variable) {
        super(QAdmEbSignataire.class, forVariable(variable), "GFC", "ADM_EB_SIGNATAIRE");
        addMetadata();
    }

    public QAdmEbSignataire(String variable, String schema, String table) {
        super(QAdmEbSignataire.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmEbSignataire(Path<? extends QAdmEbSignataire> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_EB_SIGNATAIRE");
        addMetadata();
    }

    public QAdmEbSignataire(PathMetadata metadata) {
        super(QAdmEbSignataire.class, metadata, "GFC", "ADM_EB_SIGNATAIRE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(orsiDateCloture, ColumnMetadata.named("ORSI_DATE_CLOTURE").withIndex(6).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(orsiDateOuverture, ColumnMetadata.named("ORSI_DATE_OUVERTURE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(orsiId, ColumnMetadata.named("ORSI_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(orsiLibelleSignataire, ColumnMetadata.named("ORSI_LIBELLE_SIGNATAIRE").withIndex(7).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orsiReferenceDelegation, ColumnMetadata.named("ORSI_REFERENCE_DELEGATION").withIndex(9).ofType(Types.VARCHAR).withSize(100));
        addMetadata(tysiId, ColumnMetadata.named("TYSI_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


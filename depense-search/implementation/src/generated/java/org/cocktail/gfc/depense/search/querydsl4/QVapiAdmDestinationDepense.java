package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVapiAdmDestinationDepense is a Querydsl query type for QVapiAdmDestinationDepense
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVapiAdmDestinationDepense extends com.querydsl.sql.RelationalPathBase<QVapiAdmDestinationDepense> {

    private static final long serialVersionUID = -1499675752;

    public static final QVapiAdmDestinationDepense vapiAdmDestinationDepense = new QVapiAdmDestinationDepense("VAPI_ADM_DESTINATION_DEPENSE");

    public final StringPath abreviation = createString("abreviation");

    public final StringPath code = createString("code");

    public final DateTimePath<java.sql.Timestamp> fermeture = createDateTime("fermeture", java.sql.Timestamp.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<Long> niveau = createNumber("niveau", Long.class);

    public final NumberPath<Integer> ordreAffichage = createNumber("ordreAffichage", Integer.class);

    public final DateTimePath<java.sql.Timestamp> ouverture = createDateTime("ouverture", java.sql.Timestamp.class);

    public final NumberPath<Long> pere = createNumber("pere", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final StringPath tyetLibelle = createString("tyetLibelle");

    public final StringPath type = createString("type");

    public QVapiAdmDestinationDepense(String variable) {
        super(QVapiAdmDestinationDepense.class, forVariable(variable), "GFC", "VAPI_ADM_DESTINATION_DEPENSE");
        addMetadata();
    }

    public QVapiAdmDestinationDepense(String variable, String schema, String table) {
        super(QVapiAdmDestinationDepense.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVapiAdmDestinationDepense(Path<? extends QVapiAdmDestinationDepense> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VAPI_ADM_DESTINATION_DEPENSE");
        addMetadata();
    }

    public QVapiAdmDestinationDepense(PathMetadata metadata) {
        super(QVapiAdmDestinationDepense.class, metadata, "GFC", "VAPI_ADM_DESTINATION_DEPENSE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(abreviation, ColumnMetadata.named("ABREVIATION").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(fermeture, ColumnMetadata.named("FERMETURE").withIndex(9).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(niveau, ColumnMetadata.named("NIVEAU").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ordreAffichage, ColumnMetadata.named("ORDRE_AFFICHAGE").withIndex(10).ofType(Types.DECIMAL).withSize(3));
        addMetadata(ouverture, ColumnMetadata.named("OUVERTURE").withIndex(8).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(pere, ColumnMetadata.named("PERE").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(12).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetLibelle, ColumnMetadata.named("TYET_LIBELLE").withIndex(11).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(type, ColumnMetadata.named("TYPE").withIndex(6).ofType(Types.VARCHAR).withSize(5).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEpnIdentification is a Querydsl query type for QEpnIdentification
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEpnIdentification extends com.querydsl.sql.RelationalPathBase<QEpnIdentification> {

    private static final long serialVersionUID = 996052967;

    public static final QEpnIdentification epnIdentification = new QEpnIdentification("EPN_IDENTIFICATION");

    public final StringPath codeBudget = createString("codeBudget");

    public final StringPath codeNomenclature = createString("codeNomenclature");

    public final DateTimePath<java.sql.Timestamp> dateArrete = createDateTime("dateArrete", java.sql.Timestamp.class);

    public final NumberPath<Integer> exercice = createNumber("exercice", Integer.class);

    public final NumberPath<Long> identifiant = createNumber("identifiant", Long.class);

    public final NumberPath<Long> idEpnIdentification = createNumber("idEpnIdentification", Long.class);

    public final NumberPath<Integer> numero = createNumber("numero", Integer.class);

    public final StringPath rang = createString("rang");

    public final NumberPath<Integer> siren = createNumber("siren", Integer.class);

    public final NumberPath<Long> siret = createNumber("siret", Long.class);

    public final StringPath typeDocument = createString("typeDocument");

    public final StringPath typeEnregistrement = createString("typeEnregistrement");

    public final StringPath typeExport = createString("typeExport");

    public final com.querydsl.sql.PrimaryKey<QEpnIdentification> idEpnIdentificationPk = createPrimaryKey(idEpnIdentification);

    public QEpnIdentification(String variable) {
        super(QEpnIdentification.class, forVariable(variable), "GFC", "EPN_IDENTIFICATION");
        addMetadata();
    }

    public QEpnIdentification(String variable, String schema, String table) {
        super(QEpnIdentification.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEpnIdentification(Path<? extends QEpnIdentification> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EPN_IDENTIFICATION");
        addMetadata();
    }

    public QEpnIdentification(PathMetadata metadata) {
        super(QEpnIdentification.class, metadata, "GFC", "EPN_IDENTIFICATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(codeBudget, ColumnMetadata.named("CODE_BUDGET").withIndex(8).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(codeNomenclature, ColumnMetadata.named("CODE_NOMENCLATURE").withIndex(7).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(dateArrete, ColumnMetadata.named("DATE_ARRETE").withIndex(11).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(exercice, ColumnMetadata.named("EXERCICE").withIndex(9).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(identifiant, ColumnMetadata.named("IDENTIFIANT").withIndex(5).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(idEpnIdentification, ColumnMetadata.named("ID_EPN_IDENTIFICATION").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(numero, ColumnMetadata.named("NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(5).notNull());
        addMetadata(rang, ColumnMetadata.named("RANG").withIndex(10).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(siren, ColumnMetadata.named("SIREN").withIndex(12).ofType(Types.DECIMAL).withSize(9).notNull());
        addMetadata(siret, ColumnMetadata.named("SIRET").withIndex(13).ofType(Types.DECIMAL).withSize(14).notNull());
        addMetadata(typeDocument, ColumnMetadata.named("TYPE_DOCUMENT").withIndex(6).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(typeEnregistrement, ColumnMetadata.named("TYPE_ENREGISTREMENT").withIndex(3).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(typeExport, ColumnMetadata.named("TYPE_EXPORT").withIndex(2).ofType(Types.VARCHAR).withSize(5).notNull());
    }

}


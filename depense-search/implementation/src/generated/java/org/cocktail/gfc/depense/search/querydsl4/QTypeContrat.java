package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeContrat is a Querydsl query type for QTypeContrat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeContrat extends com.querydsl.sql.RelationalPathBase<QTypeContrat> {

    private static final long serialVersionUID = -1881949937;

    public static final QTypeContrat typeContrat = new QTypeContrat("TYPE_CONTRAT");

    public final NumberPath<Long> tyconId = createNumber("tyconId", Long.class);

    public final StringPath tyconIdInterne = createString("tyconIdInterne");

    public final NumberPath<Long> tyconIdPere = createNumber("tyconIdPere", Long.class);

    public final StringPath tyconLibelle = createString("tyconLibelle");

    public final StringPath tyconNature = createString("tyconNature");

    public final NumberPath<Long> tyconNiveau = createNumber("tyconNiveau", Long.class);

    public final StringPath tyconRecherche = createString("tyconRecherche");

    public final com.querydsl.sql.PrimaryKey<QTypeContrat> typeContratPk = createPrimaryKey(tyconId);

    public QTypeContrat(String variable) {
        super(QTypeContrat.class, forVariable(variable), "GFC", "TYPE_CONTRAT");
        addMetadata();
    }

    public QTypeContrat(String variable, String schema, String table) {
        super(QTypeContrat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeContrat(Path<? extends QTypeContrat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_CONTRAT");
        addMetadata();
    }

    public QTypeContrat(PathMetadata metadata) {
        super(QTypeContrat.class, metadata, "GFC", "TYPE_CONTRAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tyconId, ColumnMetadata.named("TYCON_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyconIdInterne, ColumnMetadata.named("TYCON_ID_INTERNE").withIndex(7).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(tyconIdPere, ColumnMetadata.named("TYCON_ID_PERE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyconLibelle, ColumnMetadata.named("TYCON_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500));
        addMetadata(tyconNature, ColumnMetadata.named("TYCON_NATURE").withIndex(4).ofType(Types.VARCHAR).withSize(30));
        addMetadata(tyconNiveau, ColumnMetadata.named("TYCON_NIVEAU").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyconRecherche, ColumnMetadata.named("TYCON_RECHERCHE").withIndex(5).ofType(Types.VARCHAR).withSize(1));
    }

}


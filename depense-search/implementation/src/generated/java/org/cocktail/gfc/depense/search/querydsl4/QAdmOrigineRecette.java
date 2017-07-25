package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmOrigineRecette is a Querydsl query type for QAdmOrigineRecette
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmOrigineRecette extends com.querydsl.sql.RelationalPathBase<QAdmOrigineRecette> {

    private static final long serialVersionUID = -1341844047;

    public static final QAdmOrigineRecette admOrigineRecette = new QAdmOrigineRecette("ADM_ORIGINE_RECETTE");

    public final StringPath abreviation = createString("abreviation");

    public final StringPath code = createString("code");

    public final DateTimePath<java.sql.Timestamp> fermeture = createDateTime("fermeture", java.sql.Timestamp.class);

    public final NumberPath<Long> idAdmOrigineRecette = createNumber("idAdmOrigineRecette", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<Long> niveau = createNumber("niveau", Long.class);

    public final NumberPath<Integer> ordreAffichage = createNumber("ordreAffichage", Integer.class);

    public final DateTimePath<java.sql.Timestamp> ouverture = createDateTime("ouverture", java.sql.Timestamp.class);

    public final NumberPath<Long> pere = createNumber("pere", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmOrigineRecette> admOrigineRecettePk = createPrimaryKey(idAdmOrigineRecette);

    public QAdmOrigineRecette(String variable) {
        super(QAdmOrigineRecette.class, forVariable(variable), "GFC", "ADM_ORIGINE_RECETTE");
        addMetadata();
    }

    public QAdmOrigineRecette(String variable, String schema, String table) {
        super(QAdmOrigineRecette.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmOrigineRecette(Path<? extends QAdmOrigineRecette> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_ORIGINE_RECETTE");
        addMetadata();
    }

    public QAdmOrigineRecette(PathMetadata metadata) {
        super(QAdmOrigineRecette.class, metadata, "GFC", "ADM_ORIGINE_RECETTE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(abreviation, ColumnMetadata.named("ABREVIATION").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(2).ofType(Types.VARCHAR).withSize(7).notNull());
        addMetadata(fermeture, ColumnMetadata.named("FERMETURE").withIndex(6).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(idAdmOrigineRecette, ColumnMetadata.named("ID_ADM_ORIGINE_RECETTE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(120).notNull());
        addMetadata(niveau, ColumnMetadata.named("NIVEAU").withIndex(10).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(ordreAffichage, ColumnMetadata.named("ORDRE_AFFICHAGE").withIndex(7).ofType(Types.DECIMAL).withSize(3));
        addMetadata(ouverture, ColumnMetadata.named("OUVERTURE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(pere, ColumnMetadata.named("PERE").withIndex(9).ofType(Types.DECIMAL).withSize(38));
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


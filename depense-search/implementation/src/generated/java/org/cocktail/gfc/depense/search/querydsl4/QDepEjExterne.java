package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepEjExterne is a Querydsl query type for QDepEjExterne
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepEjExterne extends com.querydsl.sql.RelationalPathBase<QDepEjExterne> {

    private static final long serialVersionUID = -72342053;

    public static final QDepEjExterne depEjExterne = new QDepEjExterne("DEP_EJ_EXTERNE");

    public final StringPath commentaire = createString("commentaire");

    public final NumberPath<Long> devId = createNumber("devId", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> idDepEjExterne = createNumber("idDepEjExterne", Long.class);

    public final StringPath libelle = createString("libelle");

    public final StringPath referenceExt = createString("referenceExt");

    public final NumberPath<Long> tyapId = createNumber("tyapId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QDepEjExterne> idDepEjExternePk = createPrimaryKey(idDepEjExterne);

    public QDepEjExterne(String variable) {
        super(QDepEjExterne.class, forVariable(variable), "GFC", "DEP_EJ_EXTERNE");
        addMetadata();
    }

    public QDepEjExterne(String variable, String schema, String table) {
        super(QDepEjExterne.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepEjExterne(Path<? extends QDepEjExterne> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_EJ_EXTERNE");
        addMetadata();
    }

    public QDepEjExterne(PathMetadata metadata) {
        super(QDepEjExterne.class, metadata, "GFC", "DEP_EJ_EXTERNE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(8).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(devId, ColumnMetadata.named("DEV_ID").withIndex(7).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepEjExterne, ColumnMetadata.named("ID_DEP_EJ_EXTERNE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(referenceExt, ColumnMetadata.named("REFERENCE_EXT").withIndex(4).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(tyapId, ColumnMetadata.named("TYAP_ID").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


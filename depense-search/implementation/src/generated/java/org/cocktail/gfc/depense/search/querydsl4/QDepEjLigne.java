package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepEjLigne is a Querydsl query type for QDepEjLigne
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepEjLigne extends com.querydsl.sql.RelationalPathBase<QDepEjLigne> {

    private static final long serialVersionUID = -1799654313;

    public static final QDepEjLigne depEjLigne = new QDepEjLigne("DEP_EJ_LIGNE");

    public final StringPath cDepEjLigneType = createString("cDepEjLigneType");

    public final NumberPath<Long> idAttribution = createNumber("idAttribution", Long.class);

    public final NumberPath<Long> idDepCommandeLigne = createNumber("idDepCommandeLigne", Long.class);

    public final NumberPath<Long> idDepEj = createNumber("idDepEj", Long.class);

    public final NumberPath<Long> idDepEjCplt = createNumber("idDepEjCplt", Long.class);

    public final NumberPath<Long> idDepEjExterneLigne = createNumber("idDepEjExterneLigne", Long.class);

    public final NumberPath<Long> idDepEjLigne = createNumber("idDepEjLigne", Long.class);

    public final com.querydsl.sql.PrimaryKey<QDepEjLigne> idDepEjLignePk = createPrimaryKey(idDepEjLigne);

    public QDepEjLigne(String variable) {
        super(QDepEjLigne.class, forVariable(variable), "GFC", "DEP_EJ_LIGNE");
        addMetadata();
    }

    public QDepEjLigne(String variable, String schema, String table) {
        super(QDepEjLigne.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepEjLigne(Path<? extends QDepEjLigne> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_EJ_LIGNE");
        addMetadata();
    }

    public QDepEjLigne(PathMetadata metadata) {
        super(QDepEjLigne.class, metadata, "GFC", "DEP_EJ_LIGNE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cDepEjLigneType, ColumnMetadata.named("C_DEP_EJ_LIGNE_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idAttribution, ColumnMetadata.named("ID_ATTRIBUTION").withIndex(6).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepCommandeLigne, ColumnMetadata.named("ID_DEP_COMMANDE_LIGNE").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepEj, ColumnMetadata.named("ID_DEP_EJ").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepEjCplt, ColumnMetadata.named("ID_DEP_EJ_CPLT").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepEjExterneLigne, ColumnMetadata.named("ID_DEP_EJ_EXTERNE_LIGNE").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDepEjLigne, ColumnMetadata.named("ID_DEP_EJ_LIGNE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


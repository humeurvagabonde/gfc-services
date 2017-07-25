package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmTypeNatureBudget is a Querydsl query type for QAdmTypeNatureBudget
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmTypeNatureBudget extends com.querydsl.sql.RelationalPathBase<QAdmTypeNatureBudget> {

    private static final long serialVersionUID = -1697484826;

    public static final QAdmTypeNatureBudget admTypeNatureBudget = new QAdmTypeNatureBudget("ADM_TYPE_NATURE_BUDGET");

    public final NumberPath<Long> tnbCategorie = createNumber("tnbCategorie", Long.class);

    public final StringPath tnbCode = createString("tnbCode");

    public final NumberPath<Long> tnbId = createNumber("tnbId", Long.class);

    public final StringPath tnbLibelle = createString("tnbLibelle");

    public final StringPath tnbNiveauCofisup = createString("tnbNiveauCofisup");

    public final NumberPath<Long> tnbNiveauEb = createNumber("tnbNiveauEb", Long.class);

    public final NumberPath<Long> tnbOrdreAffichage = createNumber("tnbOrdreAffichage", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmTypeNatureBudget> sysC0026070 = createPrimaryKey(tnbId);

    public QAdmTypeNatureBudget(String variable) {
        super(QAdmTypeNatureBudget.class, forVariable(variable), "GFC", "ADM_TYPE_NATURE_BUDGET");
        addMetadata();
    }

    public QAdmTypeNatureBudget(String variable, String schema, String table) {
        super(QAdmTypeNatureBudget.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmTypeNatureBudget(Path<? extends QAdmTypeNatureBudget> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_TYPE_NATURE_BUDGET");
        addMetadata();
    }

    public QAdmTypeNatureBudget(PathMetadata metadata) {
        super(QAdmTypeNatureBudget.class, metadata, "GFC", "ADM_TYPE_NATURE_BUDGET");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tnbCategorie, ColumnMetadata.named("TNB_CATEGORIE").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tnbCode, ColumnMetadata.named("TNB_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(tnbId, ColumnMetadata.named("TNB_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tnbLibelle, ColumnMetadata.named("TNB_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(tnbNiveauCofisup, ColumnMetadata.named("TNB_NIVEAU_COFISUP").withIndex(5).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(tnbNiveauEb, ColumnMetadata.named("TNB_NIVEAU_EB").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tnbOrdreAffichage, ColumnMetadata.named("TNB_ORDRE_AFFICHAGE").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


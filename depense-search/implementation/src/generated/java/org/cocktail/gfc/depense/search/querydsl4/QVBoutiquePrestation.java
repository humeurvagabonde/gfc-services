package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVBoutiquePrestation is a Querydsl query type for QVBoutiquePrestation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVBoutiquePrestation extends com.querydsl.sql.RelationalPathBase<QVBoutiquePrestation> {

    private static final long serialVersionUID = -1371406655;

    public static final QVBoutiquePrestation vBoutiquePrestation = new QVBoutiquePrestation("V_BOUTIQUE_PRESTATION");

    public final NumberPath<Long> boutiqueId = createNumber("boutiqueId", Long.class);

    public final NumberPath<Long> catId = createNumber("catId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Integer> noIndividu = createNumber("noIndividu", Integer.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> prestId = createNumber("prestId", Long.class);

    public QVBoutiquePrestation(String variable) {
        super(QVBoutiquePrestation.class, forVariable(variable), "GFC", "V_BOUTIQUE_PRESTATION");
        addMetadata();
    }

    public QVBoutiquePrestation(String variable, String schema, String table) {
        super(QVBoutiquePrestation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVBoutiquePrestation(Path<? extends QVBoutiquePrestation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_BOUTIQUE_PRESTATION");
        addMetadata();
    }

    public QVBoutiquePrestation(PathMetadata metadata) {
        super(QVBoutiquePrestation.class, metadata, "GFC", "V_BOUTIQUE_PRESTATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boutiqueId, ColumnMetadata.named("BOUTIQUE_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(4));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(5).ofType(Types.DECIMAL).withSize(8));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prestId, ColumnMetadata.named("PREST_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


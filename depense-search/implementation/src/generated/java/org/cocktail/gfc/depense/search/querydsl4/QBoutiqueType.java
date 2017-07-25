package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBoutiqueType is a Querydsl query type for QBoutiqueType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBoutiqueType extends com.querydsl.sql.RelationalPathBase<QBoutiqueType> {

    private static final long serialVersionUID = 1693640072;

    public static final QBoutiqueType boutiqueType = new QBoutiqueType("BOUTIQUE_TYPE");

    public final StringPath btCode = createString("btCode");

    public final StringPath btLibelle = createString("btLibelle");

    public final StringPath btPrive = createString("btPrive");

    public final com.querydsl.sql.PrimaryKey<QBoutiqueType> boutiqueTypePk = createPrimaryKey(btCode);

    public QBoutiqueType(String variable) {
        super(QBoutiqueType.class, forVariable(variable), "GFC", "BOUTIQUE_TYPE");
        addMetadata();
    }

    public QBoutiqueType(String variable, String schema, String table) {
        super(QBoutiqueType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBoutiqueType(Path<? extends QBoutiqueType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BOUTIQUE_TYPE");
        addMetadata();
    }

    public QBoutiqueType(PathMetadata metadata) {
        super(QBoutiqueType.class, metadata, "GFC", "BOUTIQUE_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(btCode, ColumnMetadata.named("BT_CODE").withIndex(1).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(btLibelle, ColumnMetadata.named("BT_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(btPrive, ColumnMetadata.named("BT_PRIVE").withIndex(3).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


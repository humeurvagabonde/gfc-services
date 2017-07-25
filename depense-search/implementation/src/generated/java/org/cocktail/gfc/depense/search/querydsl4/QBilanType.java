package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBilanType is a Querydsl query type for QBilanType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBilanType extends com.querydsl.sql.RelationalPathBase<QBilanType> {

    private static final long serialVersionUID = 1549016514;

    public static final QBilanType bilanType = new QBilanType("BILAN_TYPE");

    public final NumberPath<Long> btId = createNumber("btId", Long.class);

    public final StringPath btLibelle = createString("btLibelle");

    public final StringPath btStrId = createString("btStrId");

    public final com.querydsl.sql.PrimaryKey<QBilanType> bilanTypePk = createPrimaryKey(btId);

    public QBilanType(String variable) {
        super(QBilanType.class, forVariable(variable), "GFC", "BILAN_TYPE");
        addMetadata();
    }

    public QBilanType(String variable, String schema, String table) {
        super(QBilanType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBilanType(Path<? extends QBilanType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BILAN_TYPE");
        addMetadata();
    }

    public QBilanType(PathMetadata metadata) {
        super(QBilanType.class, metadata, "GFC", "BILAN_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(btId, ColumnMetadata.named("BT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(btLibelle, ColumnMetadata.named("BT_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(btStrId, ColumnMetadata.named("BT_STR_ID").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}


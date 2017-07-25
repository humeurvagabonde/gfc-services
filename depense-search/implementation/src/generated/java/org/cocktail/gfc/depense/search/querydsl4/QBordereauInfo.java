package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBordereauInfo is a Querydsl query type for QBordereauInfo
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBordereauInfo extends com.querydsl.sql.RelationalPathBase<QBordereauInfo> {

    private static final long serialVersionUID = -109565327;

    public static final QBordereauInfo bordereauInfo = new QBordereauInfo("BORDEREAU_INFO");

    public final NumberPath<Long> borId = createNumber("borId", Long.class);

    public final StringPath borLibelle = createString("borLibelle");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath pcoNumVisa = createString("pcoNumVisa");

    public final com.querydsl.sql.PrimaryKey<QBordereauInfo> bordereauInfoPk = createPrimaryKey(borId);

    public QBordereauInfo(String variable) {
        super(QBordereauInfo.class, forVariable(variable), "GFC", "BORDEREAU_INFO");
        addMetadata();
    }

    public QBordereauInfo(String variable, String schema, String table) {
        super(QBordereauInfo.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBordereauInfo(Path<? extends QBordereauInfo> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BORDEREAU_INFO");
        addMetadata();
    }

    public QBordereauInfo(PathMetadata metadata) {
        super(QBordereauInfo.class, metadata, "GFC", "BORDEREAU_INFO");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(borId, ColumnMetadata.named("BOR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(borLibelle, ColumnMetadata.named("BOR_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(100));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(4));
        addMetadata(pcoNumVisa, ColumnMetadata.named("PCO_NUM_VISA").withIndex(3).ofType(Types.VARCHAR).withSize(20));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeRetenue is a Querydsl query type for QTypeRetenue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeRetenue extends com.querydsl.sql.RelationalPathBase<QTypeRetenue> {

    private static final long serialVersionUID = -1735497098;

    public static final QTypeRetenue typeRetenue = new QTypeRetenue("TYPE_RETENUE");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final StringPath treLibelle = createString("treLibelle");

    public final NumberPath<Long> treOrdre = createNumber("treOrdre", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTypeRetenue> typeRetenuePk = createPrimaryKey(treOrdre);

    public QTypeRetenue(String variable) {
        super(QTypeRetenue.class, forVariable(variable), "GFC", "TYPE_RETENUE");
        addMetadata();
    }

    public QTypeRetenue(String variable, String schema, String table) {
        super(QTypeRetenue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeRetenue(Path<? extends QTypeRetenue> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_RETENUE");
        addMetadata();
    }

    public QTypeRetenue(PathMetadata metadata) {
        super(QTypeRetenue.class, metadata, "GFC", "TYPE_RETENUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(treLibelle, ColumnMetadata.named("TRE_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(treOrdre, ColumnMetadata.named("TRE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


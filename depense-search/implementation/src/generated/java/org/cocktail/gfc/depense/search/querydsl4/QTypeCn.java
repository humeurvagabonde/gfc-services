package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeCn is a Querydsl query type for QTypeCn
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeCn extends com.querydsl.sql.RelationalPathBase<QTypeCn> {

    private static final long serialVersionUID = -1159541361;

    public static final QTypeCn typeCn = new QTypeCn("TYPE_CN");

    public final StringPath tcnCode = createString("tcnCode");

    public final NumberPath<Long> tcnId = createNumber("tcnId", Long.class);

    public final StringPath tcnLibelle = createString("tcnLibelle");

    public final com.querydsl.sql.PrimaryKey<QTypeCn> typeCnPk = createPrimaryKey(tcnId);

    public QTypeCn(String variable) {
        super(QTypeCn.class, forVariable(variable), "GFC", "TYPE_CN");
        addMetadata();
    }

    public QTypeCn(String variable, String schema, String table) {
        super(QTypeCn.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeCn(Path<? extends QTypeCn> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_CN");
        addMetadata();
    }

    public QTypeCn(PathMetadata metadata) {
        super(QTypeCn.class, metadata, "GFC", "TYPE_CN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tcnCode, ColumnMetadata.named("TCN_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(tcnId, ColumnMetadata.named("TCN_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tcnLibelle, ColumnMetadata.named("TCN_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


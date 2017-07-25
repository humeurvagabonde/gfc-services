package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeDocument is a Querydsl query type for QTypeDocument
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeDocument extends com.querydsl.sql.RelationalPathBase<QTypeDocument> {

    private static final long serialVersionUID = -1077205185;

    public static final QTypeDocument typeDocument = new QTypeDocument("TYPE_DOCUMENT");

    public final NumberPath<Long> tcomId = createNumber("tcomId", Long.class);

    public final StringPath tcomLibelle = createString("tcomLibelle");

    public final com.querydsl.sql.PrimaryKey<QTypeDocument> typeDocumentPk = createPrimaryKey(tcomId);

    public QTypeDocument(String variable) {
        super(QTypeDocument.class, forVariable(variable), "GFC", "TYPE_DOCUMENT");
        addMetadata();
    }

    public QTypeDocument(String variable, String schema, String table) {
        super(QTypeDocument.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeDocument(Path<? extends QTypeDocument> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_DOCUMENT");
        addMetadata();
    }

    public QTypeDocument(PathMetadata metadata) {
        super(QTypeDocument.class, metadata, "GFC", "TYPE_DOCUMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tcomId, ColumnMetadata.named("TCOM_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tcomLibelle, ColumnMetadata.named("TCOM_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


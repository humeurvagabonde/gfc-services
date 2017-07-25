package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvenantDocument is a Querydsl query type for QAvenantDocument
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvenantDocument extends com.querydsl.sql.RelationalPathBase<QAvenantDocument> {

    private static final long serialVersionUID = 901497018;

    public static final QAvenantDocument avenantDocument = new QAvenantDocument("AVENANT_DOCUMENT");

    public final NumberPath<Long> adOrdre = createNumber("adOrdre", Long.class);

    public final NumberPath<Long> avtOrdre = createNumber("avtOrdre", Long.class);

    public final NumberPath<Long> couNumero = createNumber("couNumero", Long.class);

    public final NumberPath<Long> docId = createNumber("docId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAvenantDocument> avenantDocumentPk = createPrimaryKey(adOrdre);

    public QAvenantDocument(String variable) {
        super(QAvenantDocument.class, forVariable(variable), "GFC", "AVENANT_DOCUMENT");
        addMetadata();
    }

    public QAvenantDocument(String variable, String schema, String table) {
        super(QAvenantDocument.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvenantDocument(Path<? extends QAvenantDocument> path) {
        super(path.getType(), path.getMetadata(), "GFC", "AVENANT_DOCUMENT");
        addMetadata();
    }

    public QAvenantDocument(PathMetadata metadata) {
        super(QAvenantDocument.class, metadata, "GFC", "AVENANT_DOCUMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adOrdre, ColumnMetadata.named("AD_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(avtOrdre, ColumnMetadata.named("AVT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(couNumero, ColumnMetadata.named("COU_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(docId, ColumnMetadata.named("DOC_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


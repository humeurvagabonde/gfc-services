package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmSignature is a Querydsl query type for QAdmSignature
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmSignature extends com.querydsl.sql.RelationalPathBase<QAdmSignature> {

    private static final long serialVersionUID = 456498168;

    public static final QAdmSignature admSignature = new QAdmSignature("ADM_SIGNATURE");

    public final NumberPath<Long> noIndividu = createNumber("noIndividu", Long.class);

    public final DateTimePath<java.sql.Timestamp> signDateModification = createDateTime("signDateModification", java.sql.Timestamp.class);

    public final SimplePath<java.sql.Blob> signImg = createSimple("signImg", java.sql.Blob.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmSignature> signaturePk = createPrimaryKey(noIndividu);

    public QAdmSignature(String variable) {
        super(QAdmSignature.class, forVariable(variable), "GFC", "ADM_SIGNATURE");
        addMetadata();
    }

    public QAdmSignature(String variable, String schema, String table) {
        super(QAdmSignature.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmSignature(Path<? extends QAdmSignature> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_SIGNATURE");
        addMetadata();
    }

    public QAdmSignature(PathMetadata metadata) {
        super(QAdmSignature.class, metadata, "GFC", "ADM_SIGNATURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(signDateModification, ColumnMetadata.named("SIGN_DATE_MODIFICATION").withIndex(3).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(signImg, ColumnMetadata.named("SIGN_IMG").withIndex(2).ofType(Types.BLOB).withSize(4000).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


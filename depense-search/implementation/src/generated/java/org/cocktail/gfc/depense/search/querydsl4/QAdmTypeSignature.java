package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmTypeSignature is a Querydsl query type for QAdmTypeSignature
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmTypeSignature extends com.querydsl.sql.RelationalPathBase<QAdmTypeSignature> {

    private static final long serialVersionUID = -1613623842;

    public static final QAdmTypeSignature admTypeSignature = new QAdmTypeSignature("ADM_TYPE_SIGNATURE");

    public final NumberPath<Long> tysiId = createNumber("tysiId", Long.class);

    public final StringPath tysiLibelle = createString("tysiLibelle");

    public final com.querydsl.sql.PrimaryKey<QAdmTypeSignature> sysC0022676 = createPrimaryKey(tysiId);

    public QAdmTypeSignature(String variable) {
        super(QAdmTypeSignature.class, forVariable(variable), "GFC", "ADM_TYPE_SIGNATURE");
        addMetadata();
    }

    public QAdmTypeSignature(String variable, String schema, String table) {
        super(QAdmTypeSignature.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmTypeSignature(Path<? extends QAdmTypeSignature> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_TYPE_SIGNATURE");
        addMetadata();
    }

    public QAdmTypeSignature(PathMetadata metadata) {
        super(QAdmTypeSignature.class, metadata, "GFC", "ADM_TYPE_SIGNATURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tysiId, ColumnMetadata.named("TYSI_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tysiLibelle, ColumnMetadata.named("TYSI_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


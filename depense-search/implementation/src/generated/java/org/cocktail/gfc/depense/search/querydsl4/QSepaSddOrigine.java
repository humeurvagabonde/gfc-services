package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSepaSddOrigine is a Querydsl query type for QSepaSddOrigine
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSepaSddOrigine extends com.querydsl.sql.RelationalPathBase<QSepaSddOrigine> {

    private static final long serialVersionUID = -1447049031;

    public static final QSepaSddOrigine sepaSddOrigine = new QSepaSddOrigine("SEPA_SDD_ORIGINE");

    public final NumberPath<Long> idSepaSddOrigine = createNumber("idSepaSddOrigine", Long.class);

    public final NumberPath<Long> idSepaSddOrigineType = createNumber("idSepaSddOrigineType", Long.class);

    public final NumberPath<Long> origineId = createNumber("origineId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSepaSddOrigine> sepaSddOriginePk = createPrimaryKey(idSepaSddOrigine);

    public QSepaSddOrigine(String variable) {
        super(QSepaSddOrigine.class, forVariable(variable), "GFC", "SEPA_SDD_ORIGINE");
        addMetadata();
    }

    public QSepaSddOrigine(String variable, String schema, String table) {
        super(QSepaSddOrigine.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSepaSddOrigine(Path<? extends QSepaSddOrigine> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SEPA_SDD_ORIGINE");
        addMetadata();
    }

    public QSepaSddOrigine(PathMetadata metadata) {
        super(QSepaSddOrigine.class, metadata, "GFC", "SEPA_SDD_ORIGINE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idSepaSddOrigine, ColumnMetadata.named("ID_SEPA_SDD_ORIGINE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddOrigineType, ColumnMetadata.named("ID_SEPA_SDD_ORIGINE_TYPE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(origineId, ColumnMetadata.named("ORIGINE_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


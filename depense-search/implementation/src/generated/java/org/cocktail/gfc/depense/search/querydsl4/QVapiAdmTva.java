package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVapiAdmTva is a Querydsl query type for QVapiAdmTva
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVapiAdmTva extends com.querydsl.sql.RelationalPathBase<QVapiAdmTva> {

    private static final long serialVersionUID = -1668214941;

    public static final QVapiAdmTva vapiAdmTva = new QVapiAdmTva("VAPI_ADM_TVA");

    public final NumberPath<Long> tvaId = createNumber("tvaId", Long.class);

    public final NumberPath<java.math.BigDecimal> tvaTaux = createNumber("tvaTaux", java.math.BigDecimal.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final StringPath tyetLibelle = createString("tyetLibelle");

    public QVapiAdmTva(String variable) {
        super(QVapiAdmTva.class, forVariable(variable), "GFC", "VAPI_ADM_TVA");
        addMetadata();
    }

    public QVapiAdmTva(String variable, String schema, String table) {
        super(QVapiAdmTva.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVapiAdmTva(Path<? extends QVapiAdmTva> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VAPI_ADM_TVA");
        addMetadata();
    }

    public QVapiAdmTva(PathMetadata metadata) {
        super(QVapiAdmTva.class, metadata, "GFC", "VAPI_ADM_TVA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tvaId, ColumnMetadata.named("TVA_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tvaTaux, ColumnMetadata.named("TVA_TAUX").withIndex(2).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetLibelle, ColumnMetadata.named("TYET_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


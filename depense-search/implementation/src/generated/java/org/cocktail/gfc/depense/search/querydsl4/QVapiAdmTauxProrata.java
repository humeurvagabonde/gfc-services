package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVapiAdmTauxProrata is a Querydsl query type for QVapiAdmTauxProrata
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVapiAdmTauxProrata extends com.querydsl.sql.RelationalPathBase<QVapiAdmTauxProrata> {

    private static final long serialVersionUID = 1647632989;

    public static final QVapiAdmTauxProrata vapiAdmTauxProrata = new QVapiAdmTauxProrata("VAPI_ADM_TAUX_PRORATA");

    public final NumberPath<Long> tapId = createNumber("tapId", Long.class);

    public final NumberPath<java.math.BigDecimal> tapTaux = createNumber("tapTaux", java.math.BigDecimal.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final StringPath tyetLibelle = createString("tyetLibelle");

    public QVapiAdmTauxProrata(String variable) {
        super(QVapiAdmTauxProrata.class, forVariable(variable), "GFC", "VAPI_ADM_TAUX_PRORATA");
        addMetadata();
    }

    public QVapiAdmTauxProrata(String variable, String schema, String table) {
        super(QVapiAdmTauxProrata.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVapiAdmTauxProrata(Path<? extends QVapiAdmTauxProrata> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VAPI_ADM_TAUX_PRORATA");
        addMetadata();
    }

    public QVapiAdmTauxProrata(PathMetadata metadata) {
        super(QVapiAdmTauxProrata.class, metadata, "GFC", "VAPI_ADM_TAUX_PRORATA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tapId, ColumnMetadata.named("TAP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tapTaux, ColumnMetadata.named("TAP_TAUX").withIndex(2).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetLibelle, ColumnMetadata.named("TYET_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


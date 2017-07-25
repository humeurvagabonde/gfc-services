package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmTauxProrata is a Querydsl query type for QAdmTauxProrata
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmTauxProrata extends com.querydsl.sql.RelationalPathBase<QAdmTauxProrata> {

    private static final long serialVersionUID = -1168552871;

    public static final QAdmTauxProrata admTauxProrata = new QAdmTauxProrata("ADM_TAUX_PRORATA");

    public final NumberPath<Long> tapId = createNumber("tapId", Long.class);

    public final NumberPath<java.math.BigDecimal> tapTaux = createNumber("tapTaux", java.math.BigDecimal.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmTauxProrata> sysC0025408 = createPrimaryKey(tapId);

    public QAdmTauxProrata(String variable) {
        super(QAdmTauxProrata.class, forVariable(variable), "GFC", "ADM_TAUX_PRORATA");
        addMetadata();
    }

    public QAdmTauxProrata(String variable, String schema, String table) {
        super(QAdmTauxProrata.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmTauxProrata(Path<? extends QAdmTauxProrata> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_TAUX_PRORATA");
        addMetadata();
    }

    public QAdmTauxProrata(PathMetadata metadata) {
        super(QAdmTauxProrata.class, metadata, "GFC", "ADM_TAUX_PRORATA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tapId, ColumnMetadata.named("TAP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tapTaux, ColumnMetadata.named("TAP_TAUX").withIndex(2).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


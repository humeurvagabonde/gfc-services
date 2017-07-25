package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmDevise is a Querydsl query type for QAdmDevise
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmDevise extends com.querydsl.sql.RelationalPathBase<QAdmDevise> {

    private static final long serialVersionUID = -1012669178;

    public static final QAdmDevise admDevise = new QAdmDevise("ADM_DEVISE");

    public final StringPath devCode = createString("devCode");

    public final NumberPath<Long> devId = createNumber("devId", Long.class);

    public final StringPath devLibelle = createString("devLibelle");

    public final NumberPath<Long> devNbDecimales = createNumber("devNbDecimales", Long.class);

    public final NumberPath<java.math.BigDecimal> devTauxConversion = createNumber("devTauxConversion", java.math.BigDecimal.class);

    public final com.querydsl.sql.PrimaryKey<QAdmDevise> devisePk = createPrimaryKey(devId);

    public QAdmDevise(String variable) {
        super(QAdmDevise.class, forVariable(variable), "GFC", "ADM_DEVISE");
        addMetadata();
    }

    public QAdmDevise(String variable, String schema, String table) {
        super(QAdmDevise.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmDevise(Path<? extends QAdmDevise> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_DEVISE");
        addMetadata();
    }

    public QAdmDevise(PathMetadata metadata) {
        super(QAdmDevise.class, metadata, "GFC", "ADM_DEVISE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(devCode, ColumnMetadata.named("DEV_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(devId, ColumnMetadata.named("DEV_ID").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(devLibelle, ColumnMetadata.named("DEV_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(devNbDecimales, ColumnMetadata.named("DEV_NB_DECIMALES").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(devTauxConversion, ColumnMetadata.named("DEV_TAUX_CONVERSION").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(9));
    }

}


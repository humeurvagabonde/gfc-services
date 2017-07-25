package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmTva is a Querydsl query type for QAdmTva
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmTva extends com.querydsl.sql.RelationalPathBase<QAdmTva> {

    private static final long serialVersionUID = -1722993313;

    public static final QAdmTva admTva = new QAdmTva("ADM_TVA");

    public final NumberPath<Long> tvaId = createNumber("tvaId", Long.class);

    public final NumberPath<java.math.BigDecimal> tvaTaux = createNumber("tvaTaux", java.math.BigDecimal.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmTva> sysC0022224 = createPrimaryKey(tvaId);

    public QAdmTva(String variable) {
        super(QAdmTva.class, forVariable(variable), "GFC", "ADM_TVA");
        addMetadata();
    }

    public QAdmTva(String variable, String schema, String table) {
        super(QAdmTva.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmTva(Path<? extends QAdmTva> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_TVA");
        addMetadata();
    }

    public QAdmTva(PathMetadata metadata) {
        super(QAdmTva.class, metadata, "GFC", "ADM_TVA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tvaId, ColumnMetadata.named("TVA_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tvaTaux, ColumnMetadata.named("TVA_TAUX").withIndex(2).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


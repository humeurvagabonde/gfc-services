package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QLotOrgan is a Querydsl query type for QLotOrgan
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLotOrgan extends com.querydsl.sql.RelationalPathBase<QLotOrgan> {

    private static final long serialVersionUID = 1125161738;

    public static final QLotOrgan lotOrgan = new QLotOrgan("LOT_ORGAN");

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<java.math.BigDecimal> loMontant = createNumber("loMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> loOrdre = createNumber("loOrdre", Long.class);

    public final NumberPath<Long> lotOrdre = createNumber("lotOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QLotOrgan> lotOrganPk = createPrimaryKey(loOrdre);

    public QLotOrgan(String variable) {
        super(QLotOrgan.class, forVariable(variable), "GFC", "LOT_ORGAN");
        addMetadata();
    }

    public QLotOrgan(String variable, String schema, String table) {
        super(QLotOrgan.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLotOrgan(Path<? extends QLotOrgan> path) {
        super(path.getType(), path.getMetadata(), "GFC", "LOT_ORGAN");
        addMetadata();
    }

    public QLotOrgan(PathMetadata metadata) {
        super(QLotOrgan.class, metadata, "GFC", "LOT_ORGAN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(loMontant, ColumnMetadata.named("LO_MONTANT").withIndex(2).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(loOrdre, ColumnMetadata.named("LO_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(lotOrdre, ColumnMetadata.named("LOT_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


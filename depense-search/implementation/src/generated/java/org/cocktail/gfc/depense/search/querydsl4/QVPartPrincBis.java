package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVPartPrincBis is a Querydsl query type for QVPartPrincBis
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVPartPrincBis extends com.querydsl.sql.RelationalPathBase<QVPartPrincBis> {

    private static final long serialVersionUID = -954150417;

    public static final QVPartPrincBis vPartPrincBis = new QVPartPrincBis("V_PART_PRINC_BIS");

    public final NumberPath<java.math.BigDecimal> apMontant = createNumber("apMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> apOrdre = createNumber("apOrdre", Long.class);

    public final StringPath apPrincipal = createString("apPrincipal");

    public final NumberPath<Long> avtOrdre = createNumber("avtOrdre", Long.class);

    public final StringPath persLibelleLc = createString("persLibelleLc");

    public final NumberPath<Long> typePartOrdre = createNumber("typePartOrdre", Long.class);

    public QVPartPrincBis(String variable) {
        super(QVPartPrincBis.class, forVariable(variable), "GFC", "V_PART_PRINC_BIS");
        addMetadata();
    }

    public QVPartPrincBis(String variable, String schema, String table) {
        super(QVPartPrincBis.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVPartPrincBis(Path<? extends QVPartPrincBis> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_PART_PRINC_BIS");
        addMetadata();
    }

    public QVPartPrincBis(PathMetadata metadata) {
        super(QVPartPrincBis.class, metadata, "GFC", "V_PART_PRINC_BIS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(apMontant, ColumnMetadata.named("AP_MONTANT").withIndex(4).ofType(Types.DECIMAL).withSize(20).withDigits(2));
        addMetadata(apOrdre, ColumnMetadata.named("AP_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(apPrincipal, ColumnMetadata.named("AP_PRINCIPAL").withIndex(5).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(avtOrdre, ColumnMetadata.named("AVT_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persLibelleLc, ColumnMetadata.named("PERS_LIBELLE_LC").withIndex(2).ofType(Types.VARCHAR).withSize(241));
        addMetadata(typePartOrdre, ColumnMetadata.named("TYPE_PART_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(38));
    }

}


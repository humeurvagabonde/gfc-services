package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVPartPrincUniqBis is a Querydsl query type for QVPartPrincUniqBis
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVPartPrincUniqBis extends com.querydsl.sql.RelationalPathBase<QVPartPrincUniqBis> {

    private static final long serialVersionUID = -1161929938;

    public static final QVPartPrincUniqBis vPartPrincUniqBis = new QVPartPrincUniqBis("V_PART_PRINC_UNIQ_BIS");

    public final NumberPath<Long> apOrdre = createNumber("apOrdre", Long.class);

    public final NumberPath<Long> avtOrdre = createNumber("avtOrdre", Long.class);

    public QVPartPrincUniqBis(String variable) {
        super(QVPartPrincUniqBis.class, forVariable(variable), "GFC", "V_PART_PRINC_UNIQ_BIS");
        addMetadata();
    }

    public QVPartPrincUniqBis(String variable, String schema, String table) {
        super(QVPartPrincUniqBis.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVPartPrincUniqBis(Path<? extends QVPartPrincUniqBis> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_PART_PRINC_UNIQ_BIS");
        addMetadata();
    }

    public QVPartPrincUniqBis(PathMetadata metadata) {
        super(QVPartPrincUniqBis.class, metadata, "GFC", "V_PART_PRINC_UNIQ_BIS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(apOrdre, ColumnMetadata.named("AP_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(avtOrdre, ColumnMetadata.named("AVT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


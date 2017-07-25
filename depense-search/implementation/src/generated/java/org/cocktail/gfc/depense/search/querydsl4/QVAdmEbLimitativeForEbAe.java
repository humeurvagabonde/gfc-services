package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmEbLimitativeForEbAe is a Querydsl query type for QVAdmEbLimitativeForEbAe
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmEbLimitativeForEbAe extends com.querydsl.sql.RelationalPathBase<QVAdmEbLimitativeForEbAe> {

    private static final long serialVersionUID = -1985084763;

    public static final QVAdmEbLimitativeForEbAe vAdmEbLimitativeForEbAe = new QVAdmEbLimitativeForEbAe("V_ADM_EB_LIMITATIVE_FOR_EB_AE");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmEbLimitative = createNumber("idAdmEbLimitative", Long.class);

    public QVAdmEbLimitativeForEbAe(String variable) {
        super(QVAdmEbLimitativeForEbAe.class, forVariable(variable), "GFC", "V_ADM_EB_LIMITATIVE_FOR_EB_AE");
        addMetadata();
    }

    public QVAdmEbLimitativeForEbAe(String variable, String schema, String table) {
        super(QVAdmEbLimitativeForEbAe.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmEbLimitativeForEbAe(Path<? extends QVAdmEbLimitativeForEbAe> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_EB_LIMITATIVE_FOR_EB_AE");
        addMetadata();
    }

    public QVAdmEbLimitativeForEbAe(PathMetadata metadata) {
        super(QVAdmEbLimitativeForEbAe.class, metadata, "GFC", "V_ADM_EB_LIMITATIVE_FOR_EB_AE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmEbLimitative, ColumnMetadata.named("ID_ADM_EB_LIMITATIVE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmEbLimitativeForEbCp is a Querydsl query type for QVAdmEbLimitativeForEbCp
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmEbLimitativeForEbCp extends com.querydsl.sql.RelationalPathBase<QVAdmEbLimitativeForEbCp> {

    private static final long serialVersionUID = -1985084690;

    public static final QVAdmEbLimitativeForEbCp vAdmEbLimitativeForEbCp = new QVAdmEbLimitativeForEbCp("V_ADM_EB_LIMITATIVE_FOR_EB_CP");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmEbLimitative = createNumber("idAdmEbLimitative", Long.class);

    public QVAdmEbLimitativeForEbCp(String variable) {
        super(QVAdmEbLimitativeForEbCp.class, forVariable(variable), "GFC", "V_ADM_EB_LIMITATIVE_FOR_EB_CP");
        addMetadata();
    }

    public QVAdmEbLimitativeForEbCp(String variable, String schema, String table) {
        super(QVAdmEbLimitativeForEbCp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmEbLimitativeForEbCp(Path<? extends QVAdmEbLimitativeForEbCp> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_EB_LIMITATIVE_FOR_EB_CP");
        addMetadata();
    }

    public QVAdmEbLimitativeForEbCp(PathMetadata metadata) {
        super(QVAdmEbLimitativeForEbCp.class, metadata, "GFC", "V_ADM_EB_LIMITATIVE_FOR_EB_CP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmEbLimitative, ColumnMetadata.named("ID_ADM_EB_LIMITATIVE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
    }

}


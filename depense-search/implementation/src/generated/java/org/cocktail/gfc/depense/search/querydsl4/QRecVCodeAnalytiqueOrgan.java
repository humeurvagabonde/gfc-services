package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecVCodeAnalytiqueOrgan is a Querydsl query type for QRecVCodeAnalytiqueOrgan
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecVCodeAnalytiqueOrgan extends com.querydsl.sql.RelationalPathBase<QRecVCodeAnalytiqueOrgan> {

    private static final long serialVersionUID = -740126199;

    public static final QRecVCodeAnalytiqueOrgan recVCodeAnalytiqueOrgan = new QRecVCodeAnalytiqueOrgan("REC_V_CODE_ANALYTIQUE_ORGAN");

    public final NumberPath<Long> canId = createNumber("canId", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public QRecVCodeAnalytiqueOrgan(String variable) {
        super(QRecVCodeAnalytiqueOrgan.class, forVariable(variable), "GFC", "REC_V_CODE_ANALYTIQUE_ORGAN");
        addMetadata();
    }

    public QRecVCodeAnalytiqueOrgan(String variable, String schema, String table) {
        super(QRecVCodeAnalytiqueOrgan.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecVCodeAnalytiqueOrgan(Path<? extends QRecVCodeAnalytiqueOrgan> path) {
        super(path.getType(), path.getMetadata(), "GFC", "REC_V_CODE_ANALYTIQUE_ORGAN");
        addMetadata();
    }

    public QRecVCodeAnalytiqueOrgan(PathMetadata metadata) {
        super(QRecVCodeAnalytiqueOrgan.class, metadata, "GFC", "REC_V_CODE_ANALYTIQUE_ORGAN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(canId, ColumnMetadata.named("CAN_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmUbForEb is a Querydsl query type for QVAdmUbForEb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmUbForEb extends com.querydsl.sql.RelationalPathBase<QVAdmUbForEb> {

    private static final long serialVersionUID = 892061627;

    public static final QVAdmUbForEb vAdmUbForEb = new QVAdmUbForEb("V_ADM_UB_FOR_EB");

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmEbUb = createNumber("idAdmEbUb", Long.class);

    public QVAdmUbForEb(String variable) {
        super(QVAdmUbForEb.class, forVariable(variable), "GFC", "V_ADM_UB_FOR_EB");
        addMetadata();
    }

    public QVAdmUbForEb(String variable, String schema, String table) {
        super(QVAdmUbForEb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmUbForEb(Path<? extends QVAdmUbForEb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_UB_FOR_EB");
        addMetadata();
    }

    public QVAdmUbForEb(PathMetadata metadata) {
        super(QVAdmUbForEb.class, metadata, "GFC", "V_ADM_UB_FOR_EB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEbUb, ColumnMetadata.named("ID_ADM_EB_UB").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


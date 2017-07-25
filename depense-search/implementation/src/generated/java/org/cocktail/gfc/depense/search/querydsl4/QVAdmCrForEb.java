package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmCrForEb is a Querydsl query type for QVAdmCrForEb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmCrForEb extends com.querydsl.sql.RelationalPathBase<QVAdmCrForEb> {

    private static final long serialVersionUID = -1740036327;

    public static final QVAdmCrForEb vAdmCrForEb = new QVAdmCrForEb("V_ADM_CR_FOR_EB");

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmEbCr = createNumber("idAdmEbCr", Long.class);

    public QVAdmCrForEb(String variable) {
        super(QVAdmCrForEb.class, forVariable(variable), "GFC", "V_ADM_CR_FOR_EB");
        addMetadata();
    }

    public QVAdmCrForEb(String variable, String schema, String table) {
        super(QVAdmCrForEb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmCrForEb(Path<? extends QVAdmCrForEb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_CR_FOR_EB");
        addMetadata();
    }

    public QVAdmCrForEb(PathMetadata metadata) {
        super(QVAdmCrForEb.class, metadata, "GFC", "V_ADM_CR_FOR_EB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEbCr, ColumnMetadata.named("ID_ADM_EB_CR").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


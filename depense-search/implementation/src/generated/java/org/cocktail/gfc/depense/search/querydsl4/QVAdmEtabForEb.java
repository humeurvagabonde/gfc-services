package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmEtabForEb is a Querydsl query type for QVAdmEtabForEb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmEtabForEb extends com.querydsl.sql.RelationalPathBase<QVAdmEtabForEb> {

    private static final long serialVersionUID = 514297496;

    public static final QVAdmEtabForEb vAdmEtabForEb = new QVAdmEtabForEb("V_ADM_ETAB_FOR_EB");

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmEbEtab = createNumber("idAdmEbEtab", Long.class);

    public QVAdmEtabForEb(String variable) {
        super(QVAdmEtabForEb.class, forVariable(variable), "GFC", "V_ADM_ETAB_FOR_EB");
        addMetadata();
    }

    public QVAdmEtabForEb(String variable, String schema, String table) {
        super(QVAdmEtabForEb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmEtabForEb(Path<? extends QVAdmEtabForEb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_ETAB_FOR_EB");
        addMetadata();
    }

    public QVAdmEtabForEb(PathMetadata metadata) {
        super(QVAdmEtabForEb.class, metadata, "GFC", "V_ADM_ETAB_FOR_EB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEbEtab, ColumnMetadata.named("ID_ADM_EB_ETAB").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


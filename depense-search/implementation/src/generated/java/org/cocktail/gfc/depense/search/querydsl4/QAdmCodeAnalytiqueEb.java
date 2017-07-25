package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmCodeAnalytiqueEb is a Querydsl query type for QAdmCodeAnalytiqueEb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmCodeAnalytiqueEb extends com.querydsl.sql.RelationalPathBase<QAdmCodeAnalytiqueEb> {

    private static final long serialVersionUID = -1914077259;

    public static final QAdmCodeAnalytiqueEb admCodeAnalytiqueEb = new QAdmCodeAnalytiqueEb("ADM_CODE_ANALYTIQUE_EB");

    public final NumberPath<Long> canId = createNumber("canId", Long.class);

    public final NumberPath<Long> caoId = createNumber("caoId", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmCodeAnalytiqueEb> sysC0024654 = createPrimaryKey(caoId);

    public QAdmCodeAnalytiqueEb(String variable) {
        super(QAdmCodeAnalytiqueEb.class, forVariable(variable), "GFC", "ADM_CODE_ANALYTIQUE_EB");
        addMetadata();
    }

    public QAdmCodeAnalytiqueEb(String variable, String schema, String table) {
        super(QAdmCodeAnalytiqueEb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmCodeAnalytiqueEb(Path<? extends QAdmCodeAnalytiqueEb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_CODE_ANALYTIQUE_EB");
        addMetadata();
    }

    public QAdmCodeAnalytiqueEb(PathMetadata metadata) {
        super(QAdmCodeAnalytiqueEb.class, metadata, "GFC", "ADM_CODE_ANALYTIQUE_EB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(canId, ColumnMetadata.named("CAN_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(caoId, ColumnMetadata.named("CAO_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


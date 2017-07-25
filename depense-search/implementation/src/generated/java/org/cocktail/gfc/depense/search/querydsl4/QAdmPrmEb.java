package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmPrmEb is a Querydsl query type for QAdmPrmEb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmPrmEb extends com.querydsl.sql.RelationalPathBase<QAdmPrmEb> {

    private static final long serialVersionUID = 2057002984;

    public static final QAdmPrmEb admPrmEb = new QAdmPrmEb("ADM_PRM_EB");

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> pjId = createNumber("pjId", Long.class);

    public final NumberPath<Long> proId = createNumber("proId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmPrmEb> prmEbPk = createPrimaryKey(proId);

    public QAdmPrmEb(String variable) {
        super(QAdmPrmEb.class, forVariable(variable), "GFC", "ADM_PRM_EB");
        addMetadata();
    }

    public QAdmPrmEb(String variable, String schema, String table) {
        super(QAdmPrmEb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmPrmEb(Path<? extends QAdmPrmEb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_PRM_EB");
        addMetadata();
    }

    public QAdmPrmEb(PathMetadata metadata) {
        super(QAdmPrmEb.class, metadata, "GFC", "ADM_PRM_EB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pjId, ColumnMetadata.named("PJ_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(proId, ColumnMetadata.named("PRO_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


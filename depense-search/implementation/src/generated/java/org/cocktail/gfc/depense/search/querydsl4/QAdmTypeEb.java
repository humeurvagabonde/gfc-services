package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmTypeEb is a Querydsl query type for QAdmTypeEb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmTypeEb extends com.querydsl.sql.RelationalPathBase<QAdmTypeEb> {

    private static final long serialVersionUID = -536316361;

    public static final QAdmTypeEb admTypeEb = new QAdmTypeEb("ADM_TYPE_EB");

    public final NumberPath<Long> tyorId = createNumber("tyorId", Long.class);

    public final StringPath tyorLibelle = createString("tyorLibelle");

    public final com.querydsl.sql.PrimaryKey<QAdmTypeEb> sysC0023096 = createPrimaryKey(tyorId);

    public QAdmTypeEb(String variable) {
        super(QAdmTypeEb.class, forVariable(variable), "GFC", "ADM_TYPE_EB");
        addMetadata();
    }

    public QAdmTypeEb(String variable, String schema, String table) {
        super(QAdmTypeEb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmTypeEb(Path<? extends QAdmTypeEb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_TYPE_EB");
        addMetadata();
    }

    public QAdmTypeEb(PathMetadata metadata) {
        super(QAdmTypeEb.class, metadata, "GFC", "ADM_TYPE_EB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tyorId, ColumnMetadata.named("TYOR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyorLibelle, ColumnMetadata.named("TYOR_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVBilanPosteTri is a Querydsl query type for QVBilanPosteTri
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVBilanPosteTri extends com.querydsl.sql.RelationalPathBase<QVBilanPosteTri> {

    private static final long serialVersionUID = -1953072340;

    public static final QVBilanPosteTri vBilanPosteTri = new QVBilanPosteTri("V_BILAN_POSTE_TRI");

    public final NumberPath<Long> bpId = createNumber("bpId", Long.class);

    public final StringPath cleTri = createString("cleTri");

    public QVBilanPosteTri(String variable) {
        super(QVBilanPosteTri.class, forVariable(variable), "GFC", "V_BILAN_POSTE_TRI");
        addMetadata();
    }

    public QVBilanPosteTri(String variable, String schema, String table) {
        super(QVBilanPosteTri.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVBilanPosteTri(Path<? extends QVBilanPosteTri> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_BILAN_POSTE_TRI");
        addMetadata();
    }

    public QVBilanPosteTri(PathMetadata metadata) {
        super(QVBilanPosteTri.class, metadata, "GFC", "V_BILAN_POSTE_TRI");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bpId, ColumnMetadata.named("BP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(cleTri, ColumnMetadata.named("CLE_TRI").withIndex(2).ofType(Types.VARCHAR).withSize(4000));
    }

}


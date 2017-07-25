package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QLotNomenclature is a Querydsl query type for QLotNomenclature
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLotNomenclature extends com.querydsl.sql.RelationalPathBase<QLotNomenclature> {

    private static final long serialVersionUID = 120791134;

    public static final QLotNomenclature lotNomenclature = new QLotNomenclature("LOT_NOMENCLATURE");

    public final NumberPath<Long> cmOrdre = createNumber("cmOrdre", Long.class);

    public final NumberPath<Long> lnId = createNumber("lnId", Long.class);

    public final NumberPath<Long> lotOrdre = createNumber("lotOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QLotNomenclature> lotNomenclaturePk = createPrimaryKey(cmOrdre, lotOrdre);

    public QLotNomenclature(String variable) {
        super(QLotNomenclature.class, forVariable(variable), "GFC", "LOT_NOMENCLATURE");
        addMetadata();
    }

    public QLotNomenclature(String variable, String schema, String table) {
        super(QLotNomenclature.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLotNomenclature(Path<? extends QLotNomenclature> path) {
        super(path.getType(), path.getMetadata(), "GFC", "LOT_NOMENCLATURE");
        addMetadata();
    }

    public QLotNomenclature(PathMetadata metadata) {
        super(QLotNomenclature.class, metadata, "GFC", "LOT_NOMENCLATURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cmOrdre, ColumnMetadata.named("CM_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(22).notNull());
        addMetadata(lnId, ColumnMetadata.named("LN_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(lotOrdre, ColumnMetadata.named("LOT_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(22).notNull());
    }

}


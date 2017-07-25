package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVLotNomenclature is a Querydsl query type for QVLotNomenclature
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVLotNomenclature extends com.querydsl.sql.RelationalPathBase<QVLotNomenclature> {

    private static final long serialVersionUID = -1474900516;

    public static final QVLotNomenclature vLotNomenclature = new QVLotNomenclature("V_LOT_NOMENCLATURE");

    public final NumberPath<Long> ceOrdre = createNumber("ceOrdre", Long.class);

    public final NumberPath<Long> lotOrdre = createNumber("lotOrdre", Long.class);

    public QVLotNomenclature(String variable) {
        super(QVLotNomenclature.class, forVariable(variable), "GFC", "V_LOT_NOMENCLATURE");
        addMetadata();
    }

    public QVLotNomenclature(String variable, String schema, String table) {
        super(QVLotNomenclature.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVLotNomenclature(Path<? extends QVLotNomenclature> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_LOT_NOMENCLATURE");
        addMetadata();
    }

    public QVLotNomenclature(PathMetadata metadata) {
        super(QVLotNomenclature.class, metadata, "GFC", "V_LOT_NOMENCLATURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ceOrdre, ColumnMetadata.named("CE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(lotOrdre, ColumnMetadata.named("LOT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(22).notNull());
    }

}


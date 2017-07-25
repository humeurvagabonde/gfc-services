package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmNomenclatureLolfDest is a Querydsl query type for QAdmNomenclatureLolfDest
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmNomenclatureLolfDest extends com.querydsl.sql.RelationalPathBase<QAdmNomenclatureLolfDest> {

    private static final long serialVersionUID = 1473955798;

    public static final QAdmNomenclatureLolfDest admNomenclatureLolfDest = new QAdmNomenclatureLolfDest("ADM_NOMENCLATURE_LOLF_DEST");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath nldrCode = createString("nldrCode");

    public final NumberPath<Long> nldrId = createNumber("nldrId", Long.class);

    public final StringPath nldrLibelle = createString("nldrLibelle");

    public final StringPath nldrType = createString("nldrType");

    public final com.querydsl.sql.PrimaryKey<QAdmNomenclatureLolfDest> sysC0021699 = createPrimaryKey(nldrId);

    public QAdmNomenclatureLolfDest(String variable) {
        super(QAdmNomenclatureLolfDest.class, forVariable(variable), "GFC", "ADM_NOMENCLATURE_LOLF_DEST");
        addMetadata();
    }

    public QAdmNomenclatureLolfDest(String variable, String schema, String table) {
        super(QAdmNomenclatureLolfDest.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmNomenclatureLolfDest(Path<? extends QAdmNomenclatureLolfDest> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_NOMENCLATURE_LOLF_DEST");
        addMetadata();
    }

    public QAdmNomenclatureLolfDest(PathMetadata metadata) {
        super(QAdmNomenclatureLolfDest.class, metadata, "GFC", "ADM_NOMENCLATURE_LOLF_DEST");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(nldrCode, ColumnMetadata.named("NLDR_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(8).notNull());
        addMetadata(nldrId, ColumnMetadata.named("NLDR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(nldrLibelle, ColumnMetadata.named("NLDR_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(nldrType, ColumnMetadata.named("NLDR_TYPE").withIndex(5).ofType(Types.VARCHAR).withSize(8).notNull());
    }

}


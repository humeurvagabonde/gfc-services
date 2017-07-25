package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmNomenclaturePrevRec is a Querydsl query type for QAdmNomenclaturePrevRec
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmNomenclaturePrevRec extends com.querydsl.sql.RelationalPathBase<QAdmNomenclaturePrevRec> {

    private static final long serialVersionUID = -63303386;

    public static final QAdmNomenclaturePrevRec admNomenclaturePrevRec = new QAdmNomenclaturePrevRec("ADM_NOMENCLATURE_PREV_REC");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath nprCode = createString("nprCode");

    public final StringPath nprDetails = createString("nprDetails");

    public final NumberPath<Long> nprId = createNumber("nprId", Long.class);

    public final StringPath nprLibelle = createString("nprLibelle");

    public final com.querydsl.sql.PrimaryKey<QAdmNomenclaturePrevRec> sysC0022145 = createPrimaryKey(nprId);

    public QAdmNomenclaturePrevRec(String variable) {
        super(QAdmNomenclaturePrevRec.class, forVariable(variable), "GFC", "ADM_NOMENCLATURE_PREV_REC");
        addMetadata();
    }

    public QAdmNomenclaturePrevRec(String variable, String schema, String table) {
        super(QAdmNomenclaturePrevRec.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmNomenclaturePrevRec(Path<? extends QAdmNomenclaturePrevRec> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_NOMENCLATURE_PREV_REC");
        addMetadata();
    }

    public QAdmNomenclaturePrevRec(PathMetadata metadata) {
        super(QAdmNomenclaturePrevRec.class, metadata, "GFC", "ADM_NOMENCLATURE_PREV_REC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(nprCode, ColumnMetadata.named("NPR_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(8).notNull());
        addMetadata(nprDetails, ColumnMetadata.named("NPR_DETAILS").withIndex(5).ofType(Types.VARCHAR).withSize(200));
        addMetadata(nprId, ColumnMetadata.named("NPR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(nprLibelle, ColumnMetadata.named("NPR_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}


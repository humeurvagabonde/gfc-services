package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOpeFluxDepRec is a Querydsl query type for QOpeFluxDepRec
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpeFluxDepRec extends com.querydsl.sql.RelationalPathBase<QOpeFluxDepRec> {

    private static final long serialVersionUID = -303754364;

    public static final QOpeFluxDepRec opeFluxDepRec = new QOpeFluxDepRec("OPE_FLUX_DEP_REC");

    public final StringPath codeFluxDepRec = createString("codeFluxDepRec");

    public final NumberPath<Long> idOpeFluxDepRec = createNumber("idOpeFluxDepRec", Long.class);

    public final StringPath llFluxDepRec = createString("llFluxDepRec");

    public final com.querydsl.sql.PrimaryKey<QOpeFluxDepRec> idOpeFluxDepRecPk = createPrimaryKey(idOpeFluxDepRec);

    public QOpeFluxDepRec(String variable) {
        super(QOpeFluxDepRec.class, forVariable(variable), "GFC", "OPE_FLUX_DEP_REC");
        addMetadata();
    }

    public QOpeFluxDepRec(String variable, String schema, String table) {
        super(QOpeFluxDepRec.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpeFluxDepRec(Path<? extends QOpeFluxDepRec> path) {
        super(path.getType(), path.getMetadata(), "GFC", "OPE_FLUX_DEP_REC");
        addMetadata();
    }

    public QOpeFluxDepRec(PathMetadata metadata) {
        super(QOpeFluxDepRec.class, metadata, "GFC", "OPE_FLUX_DEP_REC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(codeFluxDepRec, ColumnMetadata.named("CODE_FLUX_DEP_REC").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idOpeFluxDepRec, ColumnMetadata.named("ID_OPE_FLUX_DEP_REC").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(llFluxDepRec, ColumnMetadata.named("LL_FLUX_DEP_REC").withIndex(3).ofType(Types.VARCHAR).withSize(100).notNull());
    }

}


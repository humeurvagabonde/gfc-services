package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPlancoNatureRec is a Querydsl query type for QPlancoNatureRec
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPlancoNatureRec extends com.querydsl.sql.RelationalPathBase<QPlancoNatureRec> {

    private static final long serialVersionUID = -195714166;

    public static final QPlancoNatureRec plancoNatureRec = new QPlancoNatureRec("PLANCO_NATURE_REC");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> idPlancoNatureRec = createNumber("idPlancoNatureRec", Long.class);

    public final StringPath pcdEtat = createString("pcdEtat");

    public final StringPath pcoNum = createString("pcoNum");

    public final com.querydsl.sql.PrimaryKey<QPlancoNatureRec> plancoNatureRecPk = createPrimaryKey(idPlancoNatureRec);

    public QPlancoNatureRec(String variable) {
        super(QPlancoNatureRec.class, forVariable(variable), "GFC", "PLANCO_NATURE_REC");
        addMetadata();
    }

    public QPlancoNatureRec(String variable, String schema, String table) {
        super(QPlancoNatureRec.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPlancoNatureRec(Path<? extends QPlancoNatureRec> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PLANCO_NATURE_REC");
        addMetadata();
    }

    public QPlancoNatureRec(PathMetadata metadata) {
        super(QPlancoNatureRec.class, metadata, "GFC", "PLANCO_NATURE_REC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idPlancoNatureRec, ColumnMetadata.named("ID_PLANCO_NATURE_REC").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(pcdEtat, ColumnMetadata.named("PCD_ETAT").withIndex(5).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


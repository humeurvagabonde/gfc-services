package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCptPlancoNatureDepense is a Querydsl query type for QVCptPlancoNatureDepense
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCptPlancoNatureDepense extends com.querydsl.sql.RelationalPathBase<QVCptPlancoNatureDepense> {

    private static final long serialVersionUID = 365050675;

    public static final QVCptPlancoNatureDepense vCptPlancoNatureDepense = new QVCptPlancoNatureDepense("V_CPT_PLANCO_NATURE_DEPENSE");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath natureCode = createString("natureCode");

    public final StringPath natureLibelle = createString("natureLibelle");

    public final StringPath pcoLibelle = createString("pcoLibelle");

    public final StringPath pcoNum = createString("pcoNum");

    public final StringPath pcoValidite = createString("pcoValidite");

    public QVCptPlancoNatureDepense(String variable) {
        super(QVCptPlancoNatureDepense.class, forVariable(variable), "GFC", "V_CPT_PLANCO_NATURE_DEPENSE");
        addMetadata();
    }

    public QVCptPlancoNatureDepense(String variable, String schema, String table) {
        super(QVCptPlancoNatureDepense.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCptPlancoNatureDepense(Path<? extends QVCptPlancoNatureDepense> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CPT_PLANCO_NATURE_DEPENSE");
        addMetadata();
    }

    public QVCptPlancoNatureDepense(PathMetadata metadata) {
        super(QVCptPlancoNatureDepense.class, metadata, "GFC", "V_CPT_PLANCO_NATURE_DEPENSE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4));
        addMetadata(natureCode, ColumnMetadata.named("NATURE_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(5));
        addMetadata(natureLibelle, ColumnMetadata.named("NATURE_LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(500));
        addMetadata(pcoLibelle, ColumnMetadata.named("PCO_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(200));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(2).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pcoValidite, ColumnMetadata.named("PCO_VALIDITE").withIndex(6).ofType(Types.VARCHAR).withSize(20));
    }

}


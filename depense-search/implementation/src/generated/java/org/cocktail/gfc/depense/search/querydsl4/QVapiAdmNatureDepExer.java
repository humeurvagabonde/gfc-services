package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVapiAdmNatureDepExer is a Querydsl query type for QVapiAdmNatureDepExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVapiAdmNatureDepExer extends com.querydsl.sql.RelationalPathBase<QVapiAdmNatureDepExer> {

    private static final long serialVersionUID = 306019052;

    public static final QVapiAdmNatureDepExer vapiAdmNatureDepExer = new QVapiAdmNatureDepExer("VAPI_ADM_NATURE_DEP_EXER");

    public final StringPath active = createString("active");

    public final StringPath code = createString("code");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final StringPath libelle = createString("libelle");

    public QVapiAdmNatureDepExer(String variable) {
        super(QVapiAdmNatureDepExer.class, forVariable(variable), "GFC", "VAPI_ADM_NATURE_DEP_EXER");
        addMetadata();
    }

    public QVapiAdmNatureDepExer(String variable, String schema, String table) {
        super(QVapiAdmNatureDepExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVapiAdmNatureDepExer(Path<? extends QVapiAdmNatureDepExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VAPI_ADM_NATURE_DEP_EXER");
        addMetadata();
    }

    public QVapiAdmNatureDepExer(PathMetadata metadata) {
        super(QVapiAdmNatureDepExer.class, metadata, "GFC", "VAPI_ADM_NATURE_DEP_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("ACTIVE").withIndex(5).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(3).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


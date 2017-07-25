package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVapiAdmNatureDepense is a Querydsl query type for QVapiAdmNatureDepense
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVapiAdmNatureDepense extends com.querydsl.sql.RelationalPathBase<QVapiAdmNatureDepense> {

    private static final long serialVersionUID = 306963175;

    public static final QVapiAdmNatureDepense vapiAdmNatureDepense = new QVapiAdmNatureDepense("VAPI_ADM_NATURE_DEPENSE");

    public final StringPath code = createString("code");

    public final NumberPath<Integer> fongible = createNumber("fongible", Integer.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final StringPath libelle = createString("libelle");

    public QVapiAdmNatureDepense(String variable) {
        super(QVapiAdmNatureDepense.class, forVariable(variable), "GFC", "VAPI_ADM_NATURE_DEPENSE");
        addMetadata();
    }

    public QVapiAdmNatureDepense(String variable, String schema, String table) {
        super(QVapiAdmNatureDepense.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVapiAdmNatureDepense(Path<? extends QVapiAdmNatureDepense> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VAPI_ADM_NATURE_DEPENSE");
        addMetadata();
    }

    public QVapiAdmNatureDepense(PathMetadata metadata) {
        super(QVapiAdmNatureDepense.class, metadata, "GFC", "VAPI_ADM_NATURE_DEPENSE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(2).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(fongible, ColumnMetadata.named("FONGIBLE").withIndex(3).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPlanComptableRef is a Querydsl query type for QPlanComptableRef
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPlanComptableRef extends com.querydsl.sql.RelationalPathBase<QPlanComptableRef> {

    private static final long serialVersionUID = -1473107065;

    public static final QPlanComptableRef planComptableRef = new QPlanComptableRef("PLAN_COMPTABLE_REF");

    public final StringPath refPcoLibelle = createString("refPcoLibelle");

    public final StringPath refPcoNum = createString("refPcoNum");

    public final com.querydsl.sql.PrimaryKey<QPlanComptableRef> planComptableRefPk = createPrimaryKey(refPcoNum);

    public QPlanComptableRef(String variable) {
        super(QPlanComptableRef.class, forVariable(variable), "GFC", "PLAN_COMPTABLE_REF");
        addMetadata();
    }

    public QPlanComptableRef(String variable, String schema, String table) {
        super(QPlanComptableRef.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPlanComptableRef(Path<? extends QPlanComptableRef> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PLAN_COMPTABLE_REF");
        addMetadata();
    }

    public QPlanComptableRef(PathMetadata metadata) {
        super(QPlanComptableRef.class, metadata, "GFC", "PLAN_COMPTABLE_REF");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(refPcoLibelle, ColumnMetadata.named("REF_PCO_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(500));
        addMetadata(refPcoNum, ColumnMetadata.named("REF_PCO_NUM").withIndex(1).ofType(Types.VARCHAR).withSize(30).notNull());
    }

}


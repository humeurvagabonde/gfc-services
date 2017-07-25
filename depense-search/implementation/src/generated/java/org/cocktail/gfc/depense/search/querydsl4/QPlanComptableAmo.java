package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPlanComptableAmo is a Querydsl query type for QPlanComptableAmo
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPlanComptableAmo extends com.querydsl.sql.RelationalPathBase<QPlanComptableAmo> {

    private static final long serialVersionUID = -1473123145;

    public static final QPlanComptableAmo planComptableAmo = new QPlanComptableAmo("PLAN_COMPTABLE_AMO");

    public final NumberPath<Long> pcoaId = createNumber("pcoaId", Long.class);

    public final StringPath pcoaLibelle = createString("pcoaLibelle");

    public final StringPath pcoaNum = createString("pcoaNum");

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QPlanComptableAmo> planComptableAmoPk = createPrimaryKey(pcoaId);

    public QPlanComptableAmo(String variable) {
        super(QPlanComptableAmo.class, forVariable(variable), "GFC", "PLAN_COMPTABLE_AMO");
        addMetadata();
    }

    public QPlanComptableAmo(String variable, String schema, String table) {
        super(QPlanComptableAmo.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPlanComptableAmo(Path<? extends QPlanComptableAmo> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PLAN_COMPTABLE_AMO");
        addMetadata();
    }

    public QPlanComptableAmo(PathMetadata metadata) {
        super(QPlanComptableAmo.class, metadata, "GFC", "PLAN_COMPTABLE_AMO");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pcoaId, ColumnMetadata.named("PCOA_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pcoaLibelle, ColumnMetadata.named("PCOA_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(pcoaNum, ColumnMetadata.named("PCOA_NUM").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


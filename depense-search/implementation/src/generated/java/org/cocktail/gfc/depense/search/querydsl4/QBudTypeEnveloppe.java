package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudTypeEnveloppe is a Querydsl query type for QBudTypeEnveloppe
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudTypeEnveloppe extends com.querydsl.sql.RelationalPathBase<QBudTypeEnveloppe> {

    private static final long serialVersionUID = 2123118249;

    public static final QBudTypeEnveloppe budTypeEnveloppe = new QBudTypeEnveloppe("BUD_TYPE_ENVELOPPE");

    public final StringPath codeTypeEnveloppe = createString("codeTypeEnveloppe");

    public final NumberPath<Long> idBudTypeEnveloppe = createNumber("idBudTypeEnveloppe", Long.class);

    public final StringPath llTypeEnveloppe = createString("llTypeEnveloppe");

    public final com.querydsl.sql.PrimaryKey<QBudTypeEnveloppe> budTypeEnveloppePk = createPrimaryKey(idBudTypeEnveloppe);

    public QBudTypeEnveloppe(String variable) {
        super(QBudTypeEnveloppe.class, forVariable(variable), "GFC", "BUD_TYPE_ENVELOPPE");
        addMetadata();
    }

    public QBudTypeEnveloppe(String variable, String schema, String table) {
        super(QBudTypeEnveloppe.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudTypeEnveloppe(Path<? extends QBudTypeEnveloppe> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_TYPE_ENVELOPPE");
        addMetadata();
    }

    public QBudTypeEnveloppe(PathMetadata metadata) {
        super(QBudTypeEnveloppe.class, metadata, "GFC", "BUD_TYPE_ENVELOPPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(codeTypeEnveloppe, ColumnMetadata.named("CODE_TYPE_ENVELOPPE").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idBudTypeEnveloppe, ColumnMetadata.named("ID_BUD_TYPE_ENVELOPPE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(llTypeEnveloppe, ColumnMetadata.named("LL_TYPE_ENVELOPPE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudEnveloppe is a Querydsl query type for QBudEnveloppe
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudEnveloppe extends com.querydsl.sql.RelationalPathBase<QBudEnveloppe> {

    private static final long serialVersionUID = 1709472067;

    public static final QBudEnveloppe budEnveloppe = new QBudEnveloppe("BUD_ENVELOPPE");

    public final StringPath codeEnveloppe = createString("codeEnveloppe");

    public final NumberPath<Long> idBudEnveloppe = createNumber("idBudEnveloppe", Long.class);

    public final NumberPath<Long> idBudTypeEnveloppe = createNumber("idBudTypeEnveloppe", Long.class);

    public final StringPath llEnveloppe = createString("llEnveloppe");

    public final com.querydsl.sql.PrimaryKey<QBudEnveloppe> budEnveloppePk = createPrimaryKey(idBudEnveloppe);

    public QBudEnveloppe(String variable) {
        super(QBudEnveloppe.class, forVariable(variable), "GFC", "BUD_ENVELOPPE");
        addMetadata();
    }

    public QBudEnveloppe(String variable, String schema, String table) {
        super(QBudEnveloppe.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudEnveloppe(Path<? extends QBudEnveloppe> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_ENVELOPPE");
        addMetadata();
    }

    public QBudEnveloppe(PathMetadata metadata) {
        super(QBudEnveloppe.class, metadata, "GFC", "BUD_ENVELOPPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(codeEnveloppe, ColumnMetadata.named("CODE_ENVELOPPE").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idBudEnveloppe, ColumnMetadata.named("ID_BUD_ENVELOPPE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudTypeEnveloppe, ColumnMetadata.named("ID_BUD_TYPE_ENVELOPPE").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(llEnveloppe, ColumnMetadata.named("LL_ENVELOPPE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


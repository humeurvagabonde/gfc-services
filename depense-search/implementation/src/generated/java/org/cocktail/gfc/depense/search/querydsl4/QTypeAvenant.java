package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeAvenant is a Querydsl query type for QTypeAvenant
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeAvenant extends com.querydsl.sql.RelationalPathBase<QTypeAvenant> {

    private static final long serialVersionUID = 829907685;

    public static final QTypeAvenant typeAvenant = new QTypeAvenant("TYPE_AVENANT");

    public final StringPath taCode = createString("taCode");

    public final StringPath taCommentaire = createString("taCommentaire");

    public final StringPath taLibelle = createString("taLibelle");

    public final NumberPath<Long> taOrdre = createNumber("taOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTypeAvenant> typeAvenantPk = createPrimaryKey(taOrdre);

    public QTypeAvenant(String variable) {
        super(QTypeAvenant.class, forVariable(variable), "GFC", "TYPE_AVENANT");
        addMetadata();
    }

    public QTypeAvenant(String variable, String schema, String table) {
        super(QTypeAvenant.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeAvenant(Path<? extends QTypeAvenant> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_AVENANT");
        addMetadata();
    }

    public QTypeAvenant(PathMetadata metadata) {
        super(QTypeAvenant.class, metadata, "GFC", "TYPE_AVENANT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(taCode, ColumnMetadata.named("TA_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(5));
        addMetadata(taCommentaire, ColumnMetadata.named("TA_COMMENTAIRE").withIndex(4).ofType(Types.VARCHAR).withSize(128));
        addMetadata(taLibelle, ColumnMetadata.named("TA_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(taOrdre, ColumnMetadata.named("TA_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeReconduction is a Querydsl query type for QTypeReconduction
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeReconduction extends com.querydsl.sql.RelationalPathBase<QTypeReconduction> {

    private static final long serialVersionUID = 1790478043;

    public static final QTypeReconduction typeReconduction = new QTypeReconduction("TYPE_RECONDUCTION");

    public final StringPath trCommentaire = createString("trCommentaire");

    public final StringPath trIdInterne = createString("trIdInterne");

    public final StringPath trLibelle = createString("trLibelle");

    public final NumberPath<Long> trOrdre = createNumber("trOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTypeReconduction> typeReconductionPk = createPrimaryKey(trOrdre);

    public QTypeReconduction(String variable) {
        super(QTypeReconduction.class, forVariable(variable), "GFC", "TYPE_RECONDUCTION");
        addMetadata();
    }

    public QTypeReconduction(String variable, String schema, String table) {
        super(QTypeReconduction.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeReconduction(Path<? extends QTypeReconduction> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_RECONDUCTION");
        addMetadata();
    }

    public QTypeReconduction(PathMetadata metadata) {
        super(QTypeReconduction.class, metadata, "GFC", "TYPE_RECONDUCTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(trCommentaire, ColumnMetadata.named("TR_COMMENTAIRE").withIndex(1).ofType(Types.VARCHAR).withSize(250));
        addMetadata(trIdInterne, ColumnMetadata.named("TR_ID_INTERNE").withIndex(4).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(trLibelle, ColumnMetadata.named("TR_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(trOrdre, ColumnMetadata.named("TR_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


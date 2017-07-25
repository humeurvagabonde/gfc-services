package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeClassificationContrat is a Querydsl query type for QTypeClassificationContrat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeClassificationContrat extends com.querydsl.sql.RelationalPathBase<QTypeClassificationContrat> {

    private static final long serialVersionUID = 962755913;

    public static final QTypeClassificationContrat typeClassificationContrat = new QTypeClassificationContrat("TYPE_CLASSIFICATION_CONTRAT");

    public final StringPath tccCode = createString("tccCode");

    public final NumberPath<Long> tccId = createNumber("tccId", Long.class);

    public final StringPath tccLibelle = createString("tccLibelle");

    public final com.querydsl.sql.PrimaryKey<QTypeClassificationContrat> typeClassificationContratPk = createPrimaryKey(tccId);

    public QTypeClassificationContrat(String variable) {
        super(QTypeClassificationContrat.class, forVariable(variable), "GFC", "TYPE_CLASSIFICATION_CONTRAT");
        addMetadata();
    }

    public QTypeClassificationContrat(String variable, String schema, String table) {
        super(QTypeClassificationContrat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeClassificationContrat(Path<? extends QTypeClassificationContrat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_CLASSIFICATION_CONTRAT");
        addMetadata();
    }

    public QTypeClassificationContrat(PathMetadata metadata) {
        super(QTypeClassificationContrat.class, metadata, "GFC", "TYPE_CLASSIFICATION_CONTRAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tccCode, ColumnMetadata.named("TCC_CODE").withIndex(1).ofType(Types.VARCHAR).withSize(10));
        addMetadata(tccId, ColumnMetadata.named("TCC_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tccLibelle, ColumnMetadata.named("TCC_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(256));
    }

}


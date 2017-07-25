package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeBrouillard is a Querydsl query type for QTypeBrouillard
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeBrouillard extends com.querydsl.sql.RelationalPathBase<QTypeBrouillard> {

    private static final long serialVersionUID = -1510672156;

    public static final QTypeBrouillard typeBrouillard = new QTypeBrouillard("TYPE_BROUILLARD");

    public final StringPath tbrLibelle = createString("tbrLibelle");

    public final NumberPath<Long> tbrOrdre = createNumber("tbrOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTypeBrouillard> typeBrouillardPk = createPrimaryKey(tbrOrdre);

    public QTypeBrouillard(String variable) {
        super(QTypeBrouillard.class, forVariable(variable), "GFC", "TYPE_BROUILLARD");
        addMetadata();
    }

    public QTypeBrouillard(String variable, String schema, String table) {
        super(QTypeBrouillard.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeBrouillard(Path<? extends QTypeBrouillard> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_BROUILLARD");
        addMetadata();
    }

    public QTypeBrouillard(PathMetadata metadata) {
        super(QTypeBrouillard.class, metadata, "GFC", "TYPE_BROUILLARD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tbrLibelle, ColumnMetadata.named("TBR_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(tbrOrdre, ColumnMetadata.named("TBR_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


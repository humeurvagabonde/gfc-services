package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudTypeVirement is a Querydsl query type for QBudTypeVirement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudTypeVirement extends com.querydsl.sql.RelationalPathBase<QBudTypeVirement> {

    private static final long serialVersionUID = 1314107365;

    public static final QBudTypeVirement budTypeVirement = new QBudTypeVirement("BUD_TYPE_VIREMENT");

    public final StringPath code = createString("code");

    public final NumberPath<Long> idBudTypeVirement = createNumber("idBudTypeVirement", Long.class);

    public final StringPath libelle = createString("libelle");

    public final com.querydsl.sql.PrimaryKey<QBudTypeVirement> budTypeVirementPk = createPrimaryKey(idBudTypeVirement);

    public QBudTypeVirement(String variable) {
        super(QBudTypeVirement.class, forVariable(variable), "GFC", "BUD_TYPE_VIREMENT");
        addMetadata();
    }

    public QBudTypeVirement(String variable, String schema, String table) {
        super(QBudTypeVirement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudTypeVirement(Path<? extends QBudTypeVirement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_TYPE_VIREMENT");
        addMetadata();
    }

    public QBudTypeVirement(PathMetadata metadata) {
        super(QBudTypeVirement.class, metadata, "GFC", "BUD_TYPE_VIREMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idBudTypeVirement, ColumnMetadata.named("ID_BUD_TYPE_VIREMENT").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


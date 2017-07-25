package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOpeModePilotage is a Querydsl query type for QOpeModePilotage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpeModePilotage extends com.querydsl.sql.RelationalPathBase<QOpeModePilotage> {

    private static final long serialVersionUID = 1886799300;

    public static final QOpeModePilotage opeModePilotage = new QOpeModePilotage("OPE_MODE_PILOTAGE");

    public final StringPath codeModePilotage = createString("codeModePilotage");

    public final NumberPath<Long> idOpeModePilotage = createNumber("idOpeModePilotage", Long.class);

    public final StringPath llModePilotage = createString("llModePilotage");

    public final com.querydsl.sql.PrimaryKey<QOpeModePilotage> idOpeModePilotagePk = createPrimaryKey(idOpeModePilotage);

    public QOpeModePilotage(String variable) {
        super(QOpeModePilotage.class, forVariable(variable), "GFC", "OPE_MODE_PILOTAGE");
        addMetadata();
    }

    public QOpeModePilotage(String variable, String schema, String table) {
        super(QOpeModePilotage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpeModePilotage(Path<? extends QOpeModePilotage> path) {
        super(path.getType(), path.getMetadata(), "GFC", "OPE_MODE_PILOTAGE");
        addMetadata();
    }

    public QOpeModePilotage(PathMetadata metadata) {
        super(QOpeModePilotage.class, metadata, "GFC", "OPE_MODE_PILOTAGE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(codeModePilotage, ColumnMetadata.named("CODE_MODE_PILOTAGE").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(idOpeModePilotage, ColumnMetadata.named("ID_OPE_MODE_PILOTAGE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(llModePilotage, ColumnMetadata.named("LL_MODE_PILOTAGE").withIndex(3).ofType(Types.VARCHAR).withSize(100).notNull());
    }

}


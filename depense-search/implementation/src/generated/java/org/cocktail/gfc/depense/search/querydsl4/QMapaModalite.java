package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMapaModalite is a Querydsl query type for QMapaModalite
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMapaModalite extends com.querydsl.sql.RelationalPathBase<QMapaModalite> {

    private static final long serialVersionUID = -353217220;

    public static final QMapaModalite mapaModalite = new QMapaModalite("MAPA_MODALITE");

    public final StringPath descRegl = createString("descRegl");

    public final StringPath mmLibelle = createString("mmLibelle");

    public final NumberPath<Long> modId = createNumber("modId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QMapaModalite> mapaModalitePk = createPrimaryKey(modId);

    public QMapaModalite(String variable) {
        super(QMapaModalite.class, forVariable(variable), "GFC", "MAPA_MODALITE");
        addMetadata();
    }

    public QMapaModalite(String variable, String schema, String table) {
        super(QMapaModalite.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMapaModalite(Path<? extends QMapaModalite> path) {
        super(path.getType(), path.getMetadata(), "GFC", "MAPA_MODALITE");
        addMetadata();
    }

    public QMapaModalite(PathMetadata metadata) {
        super(QMapaModalite.class, metadata, "GFC", "MAPA_MODALITE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(descRegl, ColumnMetadata.named("DESC_REGL").withIndex(3).ofType(Types.VARCHAR).withSize(512));
        addMetadata(mmLibelle, ColumnMetadata.named("MM_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(512));
        addMetadata(modId, ColumnMetadata.named("MOD_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


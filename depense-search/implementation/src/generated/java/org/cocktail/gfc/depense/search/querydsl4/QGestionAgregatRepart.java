package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGestionAgregatRepart is a Querydsl query type for QGestionAgregatRepart
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGestionAgregatRepart extends com.querydsl.sql.RelationalPathBase<QGestionAgregatRepart> {

    private static final long serialVersionUID = -412647224;

    public static final QGestionAgregatRepart gestionAgregatRepart = new QGestionAgregatRepart("GESTION_AGREGAT_REPART");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> gaId = createNumber("gaId", Long.class);

    public final NumberPath<Long> garId = createNumber("garId", Long.class);

    public final StringPath gesCode = createString("gesCode");

    public final com.querydsl.sql.PrimaryKey<QGestionAgregatRepart> gestionAgregatRepartPk = createPrimaryKey(garId);

    public QGestionAgregatRepart(String variable) {
        super(QGestionAgregatRepart.class, forVariable(variable), "GFC", "GESTION_AGREGAT_REPART");
        addMetadata();
    }

    public QGestionAgregatRepart(String variable, String schema, String table) {
        super(QGestionAgregatRepart.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGestionAgregatRepart(Path<? extends QGestionAgregatRepart> path) {
        super(path.getType(), path.getMetadata(), "GFC", "GESTION_AGREGAT_REPART");
        addMetadata();
    }

    public QGestionAgregatRepart(PathMetadata metadata) {
        super(QGestionAgregatRepart.class, metadata, "GFC", "GESTION_AGREGAT_REPART");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gaId, ColumnMetadata.named("GA_ID").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(garId, ColumnMetadata.named("GAR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QComptabilite is a Querydsl query type for QComptabilite
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QComptabilite extends com.querydsl.sql.RelationalPathBase<QComptabilite> {

    private static final long serialVersionUID = -2123925765;

    public static final QComptabilite comptabilite = new QComptabilite("COMPTABILITE");

    public final StringPath comLibelle = createString("comLibelle");

    public final NumberPath<Long> comOrdre = createNumber("comOrdre", Long.class);

    public final StringPath gesCode = createString("gesCode");

    public final com.querydsl.sql.PrimaryKey<QComptabilite> comptabilitePk = createPrimaryKey(comOrdre);

    public QComptabilite(String variable) {
        super(QComptabilite.class, forVariable(variable), "GFC", "COMPTABILITE");
        addMetadata();
    }

    public QComptabilite(String variable, String schema, String table) {
        super(QComptabilite.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QComptabilite(Path<? extends QComptabilite> path) {
        super(path.getType(), path.getMetadata(), "GFC", "COMPTABILITE");
        addMetadata();
    }

    public QComptabilite(PathMetadata metadata) {
        super(QComptabilite.class, metadata, "GFC", "COMPTABILITE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(comLibelle, ColumnMetadata.named("COM_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(50));
        addMetadata(comOrdre, ColumnMetadata.named("COM_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(10).notNull());
    }

}


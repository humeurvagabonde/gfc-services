package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCatImportDevise is a Querydsl query type for QCatImportDevise
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCatImportDevise extends com.querydsl.sql.RelationalPathBase<QCatImportDevise> {

    private static final long serialVersionUID = -1167570377;

    public static final QCatImportDevise catImportDevise = new QCatImportDevise("CAT_IMPORT_DEVISE");

    public final StringPath catMonnaie = createString("catMonnaie");

    public final NumberPath<Long> devId = createNumber("devId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCatImportDevise> catImportDevisePk = createPrimaryKey(catMonnaie);

    public QCatImportDevise(String variable) {
        super(QCatImportDevise.class, forVariable(variable), "GFC", "CAT_IMPORT_DEVISE");
        addMetadata();
    }

    public QCatImportDevise(String variable, String schema, String table) {
        super(QCatImportDevise.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCatImportDevise(Path<? extends QCatImportDevise> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CAT_IMPORT_DEVISE");
        addMetadata();
    }

    public QCatImportDevise(PathMetadata metadata) {
        super(QCatImportDevise.class, metadata, "GFC", "CAT_IMPORT_DEVISE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(catMonnaie, ColumnMetadata.named("CAT_MONNAIE").withIndex(1).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(devId, ColumnMetadata.named("DEV_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


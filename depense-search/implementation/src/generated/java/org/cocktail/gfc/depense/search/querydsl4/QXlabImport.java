package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXlabImport is a Querydsl query type for QXlabImport
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXlabImport extends com.querydsl.sql.RelationalPathBase<QXlabImport> {

    private static final long serialVersionUID = 1774113124;

    public static final QXlabImport xlabImport = new QXlabImport("XLAB_IMPORT");

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> ximpDate = createDateTime("ximpDate", java.sql.Timestamp.class);

    public final StringPath ximpFilename = createString("ximpFilename");

    public final NumberPath<Long> ximpId = createNumber("ximpId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QXlabImport> xlabImportPk = createPrimaryKey(ximpId);

    public QXlabImport(String variable) {
        super(QXlabImport.class, forVariable(variable), "GFC", "XLAB_IMPORT");
        addMetadata();
    }

    public QXlabImport(String variable, String schema, String table) {
        super(QXlabImport.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXlabImport(Path<? extends QXlabImport> path) {
        super(path.getType(), path.getMetadata(), "GFC", "XLAB_IMPORT");
        addMetadata();
    }

    public QXlabImport(PathMetadata metadata) {
        super(QXlabImport.class, metadata, "GFC", "XLAB_IMPORT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ximpDate, ColumnMetadata.named("XIMP_DATE").withIndex(2).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(ximpFilename, ColumnMetadata.named("XIMP_FILENAME").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(ximpId, ColumnMetadata.named("XIMP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


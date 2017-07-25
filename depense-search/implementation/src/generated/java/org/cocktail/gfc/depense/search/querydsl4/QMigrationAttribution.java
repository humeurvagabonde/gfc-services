package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMigrationAttribution is a Querydsl query type for QMigrationAttribution
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMigrationAttribution extends com.querydsl.sql.RelationalPathBase<QMigrationAttribution> {

    private static final long serialVersionUID = 616499867;

    public static final QMigrationAttribution migrationAttribution = new QMigrationAttribution("MIGRATION_ATTRIBUTION");

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Long> lotOrdre = createNumber("lotOrdre", Long.class);

    public QMigrationAttribution(String variable) {
        super(QMigrationAttribution.class, forVariable(variable), "GFC", "MIGRATION_ATTRIBUTION");
        addMetadata();
    }

    public QMigrationAttribution(String variable, String schema, String table) {
        super(QMigrationAttribution.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMigrationAttribution(Path<? extends QMigrationAttribution> path) {
        super(path.getType(), path.getMetadata(), "GFC", "MIGRATION_ATTRIBUTION");
        addMetadata();
    }

    public QMigrationAttribution(PathMetadata metadata) {
        super(QMigrationAttribution.class, metadata, "GFC", "MIGRATION_ATTRIBUTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(lotOrdre, ColumnMetadata.named("LOT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


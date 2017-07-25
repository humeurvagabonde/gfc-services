package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QZTmpOpeDateFin is a Querydsl query type for QZTmpOpeDateFin
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QZTmpOpeDateFin extends com.querydsl.sql.RelationalPathBase<QZTmpOpeDateFin> {

    private static final long serialVersionUID = -904811872;

    public static final QZTmpOpeDateFin zTmpOpeDateFin = new QZTmpOpeDateFin("Z_TMP_OPE_DATE_FIN");

    public final DateTimePath<java.sql.Timestamp> dateFinNew = createDateTime("dateFinNew", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateFinOld = createDateTime("dateFinOld", java.sql.Timestamp.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public QZTmpOpeDateFin(String variable) {
        super(QZTmpOpeDateFin.class, forVariable(variable), "GFC", "Z_TMP_OPE_DATE_FIN");
        addMetadata();
    }

    public QZTmpOpeDateFin(String variable, String schema, String table) {
        super(QZTmpOpeDateFin.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QZTmpOpeDateFin(Path<? extends QZTmpOpeDateFin> path) {
        super(path.getType(), path.getMetadata(), "GFC", "Z_TMP_OPE_DATE_FIN");
        addMetadata();
    }

    public QZTmpOpeDateFin(PathMetadata metadata) {
        super(QZTmpOpeDateFin.class, metadata, "GFC", "Z_TMP_OPE_DATE_FIN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateFinNew, ColumnMetadata.named("DATE_FIN_NEW").withIndex(3).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dateFinOld, ColumnMetadata.named("DATE_FIN_OLD").withIndex(2).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


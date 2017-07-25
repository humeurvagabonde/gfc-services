package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEcritureDetailBeLog is a Querydsl query type for QEcritureDetailBeLog
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEcritureDetailBeLog extends com.querydsl.sql.RelationalPathBase<QEcritureDetailBeLog> {

    private static final long serialVersionUID = 115554589;

    public static final QEcritureDetailBeLog ecritureDetailBeLog = new QEcritureDetailBeLog("ECRITURE_DETAIL_BE_LOG");

    public final StringPath commentaire = createString("commentaire");

    public final NumberPath<Long> ecdOrdreDst = createNumber("ecdOrdreDst", Long.class);

    public final NumberPath<Long> ecdOrdreSrc = createNumber("ecdOrdreSrc", Long.class);

    public final DateTimePath<java.sql.Timestamp> edbDate = createDateTime("edbDate", java.sql.Timestamp.class);

    public final NumberPath<Long> edbOrdre = createNumber("edbOrdre", Long.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public QEcritureDetailBeLog(String variable) {
        super(QEcritureDetailBeLog.class, forVariable(variable), "GFC", "ECRITURE_DETAIL_BE_LOG");
        addMetadata();
    }

    public QEcritureDetailBeLog(String variable, String schema, String table) {
        super(QEcritureDetailBeLog.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEcritureDetailBeLog(Path<? extends QEcritureDetailBeLog> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ECRITURE_DETAIL_BE_LOG");
        addMetadata();
    }

    public QEcritureDetailBeLog(PathMetadata metadata) {
        super(QEcritureDetailBeLog.class, metadata, "GFC", "ECRITURE_DETAIL_BE_LOG");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(6).ofType(Types.VARCHAR).withSize(500));
        addMetadata(ecdOrdreDst, ColumnMetadata.named("ECD_ORDRE_DST").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(ecdOrdreSrc, ColumnMetadata.named("ECD_ORDRE_SRC").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(edbDate, ColumnMetadata.named("EDB_DATE").withIndex(2).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(edbOrdre, ColumnMetadata.named("EDB_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptReport is a Querydsl query type for QCptReport
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptReport extends com.querydsl.sql.RelationalPathBase<QCptReport> {

    private static final long serialVersionUID = 1424470321;

    public static final QCptReport cptReport = new QCptReport("CPT_REPORT");

    public final StringPath repId = createString("repId");

    public final StringPath repLocation = createString("repLocation");

    public final StringPath repNom = createString("repNom");

    public final com.querydsl.sql.PrimaryKey<QCptReport> cptReportPk = createPrimaryKey(repId);

    public QCptReport(String variable) {
        super(QCptReport.class, forVariable(variable), "GFC", "CPT_REPORT");
        addMetadata();
    }

    public QCptReport(String variable, String schema, String table) {
        super(QCptReport.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptReport(Path<? extends QCptReport> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_REPORT");
        addMetadata();
    }

    public QCptReport(PathMetadata metadata) {
        super(QCptReport.class, metadata, "GFC", "CPT_REPORT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(repId, ColumnMetadata.named("REP_ID").withIndex(1).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(repLocation, ColumnMetadata.named("REP_LOCATION").withIndex(3).ofType(Types.VARCHAR).withSize(500));
        addMetadata(repNom, ColumnMetadata.named("REP_NOM").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


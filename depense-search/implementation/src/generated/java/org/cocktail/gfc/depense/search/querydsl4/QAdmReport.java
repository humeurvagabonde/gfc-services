package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmReport is a Querydsl query type for QAdmReport
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmReport extends com.querydsl.sql.RelationalPathBase<QAdmReport> {

    private static final long serialVersionUID = -612034060;

    public static final QAdmReport admReport = new QAdmReport("ADM_REPORT");

    public final StringPath repId = createString("repId");

    public final StringPath repLocation = createString("repLocation");

    public final StringPath repNom = createString("repNom");

    public final com.querydsl.sql.PrimaryKey<QAdmReport> reportPk = createPrimaryKey(repId);

    public QAdmReport(String variable) {
        super(QAdmReport.class, forVariable(variable), "GFC", "ADM_REPORT");
        addMetadata();
    }

    public QAdmReport(String variable, String schema, String table) {
        super(QAdmReport.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmReport(Path<? extends QAdmReport> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_REPORT");
        addMetadata();
    }

    public QAdmReport(PathMetadata metadata) {
        super(QAdmReport.class, metadata, "GFC", "ADM_REPORT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(repId, ColumnMetadata.named("REP_ID").withIndex(1).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(repLocation, ColumnMetadata.named("REP_LOCATION").withIndex(3).ofType(Types.VARCHAR).withSize(500));
        addMetadata(repNom, ColumnMetadata.named("REP_NOM").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


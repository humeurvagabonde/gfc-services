package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSitSituation is a Querydsl query type for QSitSituation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSitSituation extends com.querydsl.sql.RelationalPathBase<QSitSituation> {

    private static final long serialVersionUID = -137391222;

    public static final QSitSituation sitSituation = new QSitSituation("SIT_SITUATION");

    public final NumberPath<Long> scatId = createNumber("scatId", Long.class);

    public final StringPath situActivation = createString("situActivation");

    public final NumberPath<Integer> situBuiltIn = createNumber("situBuiltIn", Integer.class);

    public final DateTimePath<java.sql.Timestamp> situDateCreationDoc = createDateTime("situDateCreationDoc", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> situDateModifDoc = createDateTime("situDateModifDoc", java.sql.Timestamp.class);

    public final NumberPath<Long> situId = createNumber("situId", Long.class);

    public final StringPath situIn = createString("situIn");

    public final StringPath situInfileExcel = createString("situInfileExcel");

    public final StringPath situInfileJasper = createString("situInfileJasper");

    public final StringPath situInsqlCommand = createString("situInsqlCommand");

    public final StringPath situInsqlExceltype = createString("situInsqlExceltype");

    public final StringPath situInsqlProjection = createString("situInsqlProjection");

    public final StringPath situLibelle = createString("situLibelle");

    public final StringPath situOutfileCsv = createString("situOutfileCsv");

    public final StringPath situOutfilePdf = createString("situOutfilePdf");

    public final StringPath situOutfileXls = createString("situOutfileXls");

    public final StringPath situOutfileXlstb = createString("situOutfileXlstb");

    public final StringPath situStrid = createString("situStrid");

    public final NumberPath<Long> utlOrdreCreationDoc = createNumber("utlOrdreCreationDoc", Long.class);

    public final NumberPath<Long> utlOrdreModifDoc = createNumber("utlOrdreModifDoc", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSitSituation> sitSituationPk = createPrimaryKey(situId);

    public QSitSituation(String variable) {
        super(QSitSituation.class, forVariable(variable), "GFC", "SIT_SITUATION");
        addMetadata();
    }

    public QSitSituation(String variable, String schema, String table) {
        super(QSitSituation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSitSituation(Path<? extends QSitSituation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SIT_SITUATION");
        addMetadata();
    }

    public QSitSituation(PathMetadata metadata) {
        super(QSitSituation.class, metadata, "GFC", "SIT_SITUATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(scatId, ColumnMetadata.named("SCAT_ID").withIndex(12).ofType(Types.DECIMAL).withSize(38));
        addMetadata(situActivation, ColumnMetadata.named("SITU_ACTIVATION").withIndex(15).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(situBuiltIn, ColumnMetadata.named("SITU_BUILT_IN").withIndex(13).ofType(Types.DECIMAL).withSize(1));
        addMetadata(situDateCreationDoc, ColumnMetadata.named("SITU_DATE_CREATION_DOC").withIndex(18).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(situDateModifDoc, ColumnMetadata.named("SITU_DATE_MODIF_DOC").withIndex(19).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(situId, ColumnMetadata.named("SITU_ID").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(situIn, ColumnMetadata.named("SITU_IN").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(situInfileExcel, ColumnMetadata.named("SITU_INFILE_EXCEL").withIndex(7).ofType(Types.VARCHAR).withSize(50));
        addMetadata(situInfileJasper, ColumnMetadata.named("SITU_INFILE_JASPER").withIndex(4).ofType(Types.VARCHAR).withSize(50));
        addMetadata(situInsqlCommand, ColumnMetadata.named("SITU_INSQL_COMMAND").withIndex(20).ofType(Types.CLOB).withSize(4000));
        addMetadata(situInsqlExceltype, ColumnMetadata.named("SITU_INSQL_EXCELTYPE").withIndex(6).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(situInsqlProjection, ColumnMetadata.named("SITU_INSQL_PROJECTION").withIndex(5).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(situLibelle, ColumnMetadata.named("SITU_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(situOutfileCsv, ColumnMetadata.named("SITU_OUTFILE_CSV").withIndex(9).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(situOutfilePdf, ColumnMetadata.named("SITU_OUTFILE_PDF").withIndex(8).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(situOutfileXls, ColumnMetadata.named("SITU_OUTFILE_XLS").withIndex(10).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(situOutfileXlstb, ColumnMetadata.named("SITU_OUTFILE_XLSTB").withIndex(11).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(situStrid, ColumnMetadata.named("SITU_STRID").withIndex(14).ofType(Types.VARCHAR).withSize(100));
        addMetadata(utlOrdreCreationDoc, ColumnMetadata.named("UTL_ORDRE_CREATION_DOC").withIndex(16).ofType(Types.DECIMAL).withSize(38));
        addMetadata(utlOrdreModifDoc, ColumnMetadata.named("UTL_ORDRE_MODIF_DOC").withIndex(17).ofType(Types.DECIMAL).withSize(38));
    }

}


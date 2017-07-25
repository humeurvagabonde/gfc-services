package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOpeTrancheBud is a Querydsl query type for QOpeTrancheBud
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpeTrancheBud extends com.querydsl.sql.RelationalPathBase<QOpeTrancheBud> {

    private static final long serialVersionUID = -906407210;

    public static final QOpeTrancheBud opeTrancheBud = new QOpeTrancheBud("OPE_TRANCHE_BUD");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dValidation = createDateTime("dValidation", java.sql.Timestamp.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> idOpeTrancheBud = createNumber("idOpeTrancheBud", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final NumberPath<Long> persIdValidation = createNumber("persIdValidation", Long.class);

    public final NumberPath<java.math.BigDecimal> reportNMoins1 = createNumber("reportNMoins1", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> reportNPlus1 = createNumber("reportNPlus1", java.math.BigDecimal.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QOpeTrancheBud> opeTrancheBudPk = createPrimaryKey(idOpeTrancheBud);

    public QOpeTrancheBud(String variable) {
        super(QOpeTrancheBud.class, forVariable(variable), "GFC", "OPE_TRANCHE_BUD");
        addMetadata();
    }

    public QOpeTrancheBud(String variable, String schema, String table) {
        super(QOpeTrancheBud.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpeTrancheBud(Path<? extends QOpeTrancheBud> path) {
        super(path.getType(), path.getMetadata(), "GFC", "OPE_TRANCHE_BUD");
        addMetadata();
    }

    public QOpeTrancheBud(PathMetadata metadata) {
        super(QOpeTrancheBud.class, metadata, "GFC", "OPE_TRANCHE_BUD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(6).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(8).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dValidation, ColumnMetadata.named("D_VALIDATION").withIndex(10).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeTrancheBud, ColumnMetadata.named("ID_OPE_TRANCHE_BUD").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(persIdValidation, ColumnMetadata.named("PERS_ID_VALIDATION").withIndex(9).ofType(Types.DECIMAL).withSize(38));
        addMetadata(reportNMoins1, ColumnMetadata.named("REPORT_N_MOINS_1").withIndex(11).ofType(Types.DECIMAL).withSize(20).withDigits(2).notNull());
        addMetadata(reportNPlus1, ColumnMetadata.named("REPORT_N_PLUS_1").withIndex(12).ofType(Types.DECIMAL).withSize(20).withDigits(2).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


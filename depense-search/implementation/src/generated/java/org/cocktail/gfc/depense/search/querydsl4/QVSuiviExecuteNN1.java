package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVSuiviExecuteNN1 is a Querydsl query type for QVSuiviExecuteNN1
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVSuiviExecuteNN1 extends com.querydsl.sql.RelationalPathBase<QVSuiviExecuteNN1> {

    private static final long serialVersionUID = 505265706;

    public static final QVSuiviExecuteNN1 vSuiviExecuteNN1 = new QVSuiviExecuteNN1("V_SUIVI_EXECUTE_N_N_1");

    public final NumberPath<Long> engage = createNumber("engage", Long.class);

    public final NumberPath<Long> exeOrdre = createNumber("exeOrdre", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> liquide = createNumber("liquide", Long.class);

    public final NumberPath<Long> mandate = createNumber("mandate", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> reverse = createNumber("reverse", Long.class);

    public final NumberPath<Long> tcdOrdre = createNumber("tcdOrdre", Long.class);

    public QVSuiviExecuteNN1(String variable) {
        super(QVSuiviExecuteNN1.class, forVariable(variable), "GFC", "V_SUIVI_EXECUTE_N_N_1");
        addMetadata();
    }

    public QVSuiviExecuteNN1(String variable, String schema, String table) {
        super(QVSuiviExecuteNN1.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVSuiviExecuteNN1(Path<? extends QVSuiviExecuteNN1> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_SUIVI_EXECUTE_N_N_1");
        addMetadata();
    }

    public QVSuiviExecuteNN1(PathMetadata metadata) {
        super(QVSuiviExecuteNN1.class, metadata, "GFC", "V_SUIVI_EXECUTE_N_N_1");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(engage, ColumnMetadata.named("ENGAGE").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(liquide, ColumnMetadata.named("LIQUIDE").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(mandate, ColumnMetadata.named("MANDATE").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(4).ofType(Types.CHAR).withSize(1));
        addMetadata(reverse, ColumnMetadata.named("REVERSE").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tcdOrdre, ColumnMetadata.named("TCD_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
    }

}


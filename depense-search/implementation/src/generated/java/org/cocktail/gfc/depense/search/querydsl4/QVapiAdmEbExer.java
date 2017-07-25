package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVapiAdmEbExer is a Querydsl query type for QVapiAdmEbExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVapiAdmEbExer extends com.querydsl.sql.RelationalPathBase<QVapiAdmEbExer> {

    private static final long serialVersionUID = -1173348583;

    public static final QVapiAdmEbExer vapiAdmEbExer = new QVapiAdmEbExer("VAPI_ADM_EB_EXER");

    public final NumberPath<Long> canalObligatoire = createNumber("canalObligatoire", Long.class);

    public final StringPath cStructure = createString("cStructure");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmEbExer = createNumber("idAdmEbExer", Long.class);

    public final NumberPath<Long> idAdmEbReprise = createNumber("idAdmEbReprise", Long.class);

    public final NumberPath<Integer> limitativeAe = createNumber("limitativeAe", Integer.class);

    public final NumberPath<Integer> limitativeReglementaire = createNumber("limitativeReglementaire", Integer.class);

    public final NumberPath<Long> logOrdre = createNumber("logOrdre", Long.class);

    public final NumberPath<Long> onbId = createNumber("onbId", Long.class);

    public final NumberPath<Long> opAutorisees = createNumber("opAutorisees", Long.class);

    public final NumberPath<Long> operationObligatoire = createNumber("operationObligatoire", Long.class);

    public final StringPath orgCr = createString("orgCr");

    public final StringPath orgEtab = createString("orgEtab");

    public final StringPath orgLib = createString("orgLib");

    public final NumberPath<Integer> orgNiv = createNumber("orgNiv", Integer.class);

    public final NumberPath<Long> orgPere = createNumber("orgPere", Long.class);

    public final StringPath orgSouscr = createString("orgSouscr");

    public final StringPath orgUb = createString("orgUb");

    public final StringPath orgUniv = createString("orgUniv");

    public final NumberPath<Integer> saisieBudgetaire = createNumber("saisieBudgetaire", Integer.class);

    public final NumberPath<Long> tyorId = createNumber("tyorId", Long.class);

    public QVapiAdmEbExer(String variable) {
        super(QVapiAdmEbExer.class, forVariable(variable), "GFC", "VAPI_ADM_EB_EXER");
        addMetadata();
    }

    public QVapiAdmEbExer(String variable, String schema, String table) {
        super(QVapiAdmEbExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVapiAdmEbExer(Path<? extends QVapiAdmEbExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VAPI_ADM_EB_EXER");
        addMetadata();
    }

    public QVapiAdmEbExer(PathMetadata metadata) {
        super(QVapiAdmEbExer.class, metadata, "GFC", "VAPI_ADM_EB_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(canalObligatoire, ColumnMetadata.named("CANAL_OBLIGATOIRE").withIndex(18).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(cStructure, ColumnMetadata.named("C_STRUCTURE").withIndex(12).ofType(Types.VARCHAR).withSize(10));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEbExer, ColumnMetadata.named("ID_ADM_EB_EXER").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEbReprise, ColumnMetadata.named("ID_ADM_EB_REPRISE").withIndex(22).ofType(Types.DECIMAL).withSize(38));
        addMetadata(limitativeAe, ColumnMetadata.named("LIMITATIVE_AE").withIndex(21).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(limitativeReglementaire, ColumnMetadata.named("LIMITATIVE_REGLEMENTAIRE").withIndex(16).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(logOrdre, ColumnMetadata.named("LOG_ORDRE").withIndex(13).ofType(Types.DECIMAL).withSize(0));
        addMetadata(onbId, ColumnMetadata.named("ONB_ID").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(opAutorisees, ColumnMetadata.named("OP_AUTORISEES").withIndex(17).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(operationObligatoire, ColumnMetadata.named("OPERATION_OBLIGATOIRE").withIndex(19).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(orgCr, ColumnMetadata.named("ORG_CR").withIndex(9).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgEtab, ColumnMetadata.named("ORG_ETAB").withIndex(7).ofType(Types.VARCHAR).withSize(10));
        addMetadata(orgLib, ColumnMetadata.named("ORG_LIB").withIndex(11).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(orgNiv, ColumnMetadata.named("ORG_NIV").withIndex(4).ofType(Types.DECIMAL).withSize(5).notNull());
        addMetadata(orgPere, ColumnMetadata.named("ORG_PERE").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(orgSouscr, ColumnMetadata.named("ORG_SOUSCR").withIndex(10).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgUb, ColumnMetadata.named("ORG_UB").withIndex(8).ofType(Types.VARCHAR).withSize(10));
        addMetadata(orgUniv, ColumnMetadata.named("ORG_UNIV").withIndex(6).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(saisieBudgetaire, ColumnMetadata.named("SAISIE_BUDGETAIRE").withIndex(20).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(tyorId, ColumnMetadata.named("TYOR_ID").withIndex(14).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


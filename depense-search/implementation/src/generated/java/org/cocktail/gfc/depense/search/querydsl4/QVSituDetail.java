package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVSituDetail is a Querydsl query type for QVSituDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVSituDetail extends com.querydsl.sql.RelationalPathBase<QVSituDetail> {

    private static final long serialVersionUID = -1977546348;

    public static final QVSituDetail vSituDetail = new QVSituDetail("V_SITU_DETAIL");

    public final StringPath cdeLib = createString("cdeLib");

    public final NumberPath<Long> cdeOrdre = createNumber("cdeOrdre", Long.class);

    public final StringPath cdeReferencePapier = createString("cdeReferencePapier");

    public final NumberPath<Long> cdeRegroupement = createNumber("cdeRegroupement", Long.class);

    public final StringPath cmCode = createString("cmCode");

    public final StringPath cmLib = createString("cmLib");

    public final NumberPath<Long> cmOrdre = createNumber("cmOrdre", Long.class);

    public final NumberPath<Long> convOrdre = createNumber("convOrdre", Long.class);

    public final NumberPath<Long> engage = createNumber("engage", Long.class);

    public final NumberPath<Long> engOrdre = createNumber("engOrdre", Long.class);

    public final NumberPath<Long> exeOrdre = createNumber("exeOrdre", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> liquide = createNumber("liquide", Long.class);

    public final NumberPath<Long> lolfId = createNumber("lolfId", Long.class);

    public final NumberPath<Long> mandate = createNumber("mandate", Long.class);

    public final StringPath orgCr = createString("orgCr");

    public final StringPath orgEtab = createString("orgEtab");

    public final StringPath orgSouscr = createString("orgSouscr");

    public final StringPath orgUb = createString("orgUb");

    public final StringPath orgUniv = createString("orgUniv");

    public final StringPath pcoNum = createString("pcoNum");

    public final StringPath persLibelle = createString("persLibelle");

    public final NumberPath<Long> reverse = createNumber("reverse", Long.class);

    public final NumberPath<Long> tcdOrdre = createNumber("tcdOrdre", Long.class);

    public QVSituDetail(String variable) {
        super(QVSituDetail.class, forVariable(variable), "GFC", "V_SITU_DETAIL");
        addMetadata();
    }

    public QVSituDetail(String variable, String schema, String table) {
        super(QVSituDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVSituDetail(Path<? extends QVSituDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_SITU_DETAIL");
        addMetadata();
    }

    public QVSituDetail(PathMetadata metadata) {
        super(QVSituDetail.class, metadata, "GFC", "V_SITU_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cdeLib, ColumnMetadata.named("CDE_LIB").withIndex(16).ofType(Types.CHAR).withSize(1));
        addMetadata(cdeOrdre, ColumnMetadata.named("CDE_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(cdeReferencePapier, ColumnMetadata.named("CDE_REFERENCE_PAPIER").withIndex(15).ofType(Types.CHAR).withSize(1));
        addMetadata(cdeRegroupement, ColumnMetadata.named("CDE_REGROUPEMENT").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(cmCode, ColumnMetadata.named("CM_CODE").withIndex(20).ofType(Types.CHAR).withSize(1));
        addMetadata(cmLib, ColumnMetadata.named("CM_LIB").withIndex(21).ofType(Types.CHAR).withSize(1));
        addMetadata(cmOrdre, ColumnMetadata.named("CM_ORDRE").withIndex(19).ofType(Types.DECIMAL).withSize(0));
        addMetadata(convOrdre, ColumnMetadata.named("CONV_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(engage, ColumnMetadata.named("ENGAGE").withIndex(22).ofType(Types.DECIMAL).withSize(0));
        addMetadata(engOrdre, ColumnMetadata.named("ENG_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(17).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(liquide, ColumnMetadata.named("LIQUIDE").withIndex(23).ofType(Types.DECIMAL).withSize(0));
        addMetadata(lolfId, ColumnMetadata.named("LOLF_ID").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(mandate, ColumnMetadata.named("MANDATE").withIndex(24).ofType(Types.DECIMAL).withSize(0));
        addMetadata(orgCr, ColumnMetadata.named("ORG_CR").withIndex(13).ofType(Types.CHAR).withSize(1));
        addMetadata(orgEtab, ColumnMetadata.named("ORG_ETAB").withIndex(11).ofType(Types.CHAR).withSize(1));
        addMetadata(orgSouscr, ColumnMetadata.named("ORG_SOUSCR").withIndex(14).ofType(Types.CHAR).withSize(1));
        addMetadata(orgUb, ColumnMetadata.named("ORG_UB").withIndex(12).ofType(Types.CHAR).withSize(1));
        addMetadata(orgUniv, ColumnMetadata.named("ORG_UNIV").withIndex(10).ofType(Types.CHAR).withSize(1));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(8).ofType(Types.CHAR).withSize(1));
        addMetadata(persLibelle, ColumnMetadata.named("PERS_LIBELLE").withIndex(18).ofType(Types.CHAR).withSize(1));
        addMetadata(reverse, ColumnMetadata.named("REVERSE").withIndex(25).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tcdOrdre, ColumnMetadata.named("TCD_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(0));
    }

}


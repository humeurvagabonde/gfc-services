package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOrganJefys is a Querydsl query type for QOrganJefys
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOrganJefys extends com.querydsl.sql.RelationalPathBase<QOrganJefys> {

    private static final long serialVersionUID = -1000981858;

    public static final QOrganJefys organJefys = new QOrganJefys("ORGAN_JEFYS");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final StringPath orgCr = createString("orgCr");

    public final StringPath orgEtab = createString("orgEtab");

    public final StringPath orgLib = createString("orgLib");

    public final NumberPath<Long> orgLucrativite = createNumber("orgLucrativite", Long.class);

    public final NumberPath<Long> orgNiv = createNumber("orgNiv", Long.class);

    public final NumberPath<Long> orgPere = createNumber("orgPere", Long.class);

    public final StringPath orgSouscr = createString("orgSouscr");

    public final StringPath orgUb = createString("orgUb");

    public final StringPath orgUniv = createString("orgUniv");

    public QOrganJefys(String variable) {
        super(QOrganJefys.class, forVariable(variable), "GFC", "ORGAN_JEFYS");
        addMetadata();
    }

    public QOrganJefys(String variable, String schema, String table) {
        super(QOrganJefys.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOrganJefys(Path<? extends QOrganJefys> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ORGAN_JEFYS");
        addMetadata();
    }

    public QOrganJefys(PathMetadata metadata) {
        super(QOrganJefys.class, metadata, "GFC", "ORGAN_JEFYS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(22));
        addMetadata(orgCr, ColumnMetadata.named("ORG_CR").withIndex(8).ofType(Types.VARCHAR).withSize(10));
        addMetadata(orgEtab, ColumnMetadata.named("ORG_ETAB").withIndex(6).ofType(Types.VARCHAR).withSize(10));
        addMetadata(orgLib, ColumnMetadata.named("ORG_LIB").withIndex(10).ofType(Types.VARCHAR).withSize(200));
        addMetadata(orgLucrativite, ColumnMetadata.named("ORG_LUCRATIVITE").withIndex(11).ofType(Types.DECIMAL).withSize(22));
        addMetadata(orgNiv, ColumnMetadata.named("ORG_NIV").withIndex(4).ofType(Types.DECIMAL).withSize(22));
        addMetadata(orgPere, ColumnMetadata.named("ORG_PERE").withIndex(3).ofType(Types.DECIMAL).withSize(22));
        addMetadata(orgSouscr, ColumnMetadata.named("ORG_SOUSCR").withIndex(9).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgUb, ColumnMetadata.named("ORG_UB").withIndex(7).ofType(Types.VARCHAR).withSize(10));
        addMetadata(orgUniv, ColumnMetadata.named("ORG_UNIV").withIndex(5).ofType(Types.VARCHAR).withSize(10));
    }

}


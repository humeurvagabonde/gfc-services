package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVOrganExer is a Querydsl query type for QVOrganExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVOrganExer extends com.querydsl.sql.RelationalPathBase<QVOrganExer> {

    private static final long serialVersionUID = -858949179;

    public static final QVOrganExer vOrganExer = new QVOrganExer("V_ORGAN_EXER");

    public final NumberPath<Long> exeOrdre = createNumber("exeOrdre", Long.class);

    public final StringPath orgCr = createString("orgCr");

    public final StringPath orgEtab = createString("orgEtab");

    public final NumberPath<Long> orgId = createNumber("orgId", Long.class);

    public final StringPath orgLib = createString("orgLib");

    public final NumberPath<Long> orgLucrativite = createNumber("orgLucrativite", Long.class);

    public final NumberPath<Long> orgNiv = createNumber("orgNiv", Long.class);

    public final NumberPath<Long> orgPere = createNumber("orgPere", Long.class);

    public final StringPath orgSouscr = createString("orgSouscr");

    public final StringPath orgUb = createString("orgUb");

    public final NumberPath<Long> tyorId = createNumber("tyorId", Long.class);

    public QVOrganExer(String variable) {
        super(QVOrganExer.class, forVariable(variable), "GFC", "V_ORGAN_EXER");
        addMetadata();
    }

    public QVOrganExer(String variable, String schema, String table) {
        super(QVOrganExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVOrganExer(Path<? extends QVOrganExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ORGAN_EXER");
        addMetadata();
    }

    public QVOrganExer(PathMetadata metadata) {
        super(QVOrganExer.class, metadata, "GFC", "V_ORGAN_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(orgCr, ColumnMetadata.named("ORG_CR").withIndex(5).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgEtab, ColumnMetadata.named("ORG_ETAB").withIndex(3).ofType(Types.VARCHAR).withSize(10));
        addMetadata(orgId, ColumnMetadata.named("ORG_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(orgLib, ColumnMetadata.named("ORG_LIB").withIndex(7).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(orgLucrativite, ColumnMetadata.named("ORG_LUCRATIVITE").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(orgNiv, ColumnMetadata.named("ORG_NIV").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(orgPere, ColumnMetadata.named("ORG_PERE").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(orgSouscr, ColumnMetadata.named("ORG_SOUSCR").withIndex(6).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgUb, ColumnMetadata.named("ORG_UB").withIndex(4).ofType(Types.VARCHAR).withSize(10));
        addMetadata(tyorId, ColumnMetadata.named("TYOR_ID").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


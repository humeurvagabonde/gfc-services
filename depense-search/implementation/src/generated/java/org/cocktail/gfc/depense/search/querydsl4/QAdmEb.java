package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmEb is a Querydsl query type for QAdmEb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmEb extends com.querydsl.sql.RelationalPathBase<QAdmEb> {

    private static final long serialVersionUID = -1579601571;

    public static final QAdmEb admEb = new QAdmEb("ADM_EB");

    public final StringPath cStructure = createString("cStructure");

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Integer> limitativeReglementaire = createNumber("limitativeReglementaire", Integer.class);

    public final NumberPath<Long> logOrdre = createNumber("logOrdre", Long.class);

    public final NumberPath<Long> onbId = createNumber("onbId", Long.class);

    public final StringPath orgCr = createString("orgCr");

    public final DateTimePath<java.sql.Timestamp> orgDateModification = createDateTime("orgDateModification", java.sql.Timestamp.class);

    public final StringPath orgEtab = createString("orgEtab");

    public final StringPath orgLib = createString("orgLib");

    public final NumberPath<Integer> orgNiv = createNumber("orgNiv", Integer.class);

    public final NumberPath<Long> orgPere = createNumber("orgPere", Long.class);

    public final NumberPath<Long> orgPersIdModification = createNumber("orgPersIdModification", Long.class);

    public final StringPath orgSouscr = createString("orgSouscr");

    public final StringPath orgUb = createString("orgUb");

    public final StringPath orgUniv = createString("orgUniv");

    public final NumberPath<Long> tyorId = createNumber("tyorId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmEb> sysC0024038 = createPrimaryKey(idAdmEb);

    public QAdmEb(String variable) {
        super(QAdmEb.class, forVariable(variable), "GFC", "ADM_EB");
        addMetadata();
    }

    public QAdmEb(String variable, String schema, String table) {
        super(QAdmEb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmEb(Path<? extends QAdmEb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_EB");
        addMetadata();
    }

    public QAdmEb(PathMetadata metadata) {
        super(QAdmEb.class, metadata, "GFC", "ADM_EB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cStructure, ColumnMetadata.named("C_STRUCTURE").withIndex(10).ofType(Types.VARCHAR).withSize(10));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(limitativeReglementaire, ColumnMetadata.named("LIMITATIVE_REGLEMENTAIRE").withIndex(14).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(logOrdre, ColumnMetadata.named("LOG_ORDRE").withIndex(11).ofType(Types.DECIMAL).withSize(0));
        addMetadata(onbId, ColumnMetadata.named("ONB_ID").withIndex(13).ofType(Types.DECIMAL).withSize(0));
        addMetadata(orgCr, ColumnMetadata.named("ORG_CR").withIndex(7).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgDateModification, ColumnMetadata.named("ORG_DATE_MODIFICATION").withIndex(15).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(orgEtab, ColumnMetadata.named("ORG_ETAB").withIndex(5).ofType(Types.VARCHAR).withSize(10));
        addMetadata(orgLib, ColumnMetadata.named("ORG_LIB").withIndex(9).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(orgNiv, ColumnMetadata.named("ORG_NIV").withIndex(2).ofType(Types.DECIMAL).withSize(5).notNull());
        addMetadata(orgPere, ColumnMetadata.named("ORG_PERE").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(orgPersIdModification, ColumnMetadata.named("ORG_PERS_ID_MODIFICATION").withIndex(16).ofType(Types.DECIMAL).withSize(0));
        addMetadata(orgSouscr, ColumnMetadata.named("ORG_SOUSCR").withIndex(8).ofType(Types.VARCHAR).withSize(50));
        addMetadata(orgUb, ColumnMetadata.named("ORG_UB").withIndex(6).ofType(Types.VARCHAR).withSize(10));
        addMetadata(orgUniv, ColumnMetadata.named("ORG_UNIV").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(tyorId, ColumnMetadata.named("TYOR_ID").withIndex(12).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


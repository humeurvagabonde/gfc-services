package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXlabFacture is a Querydsl query type for QXlabFacture
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXlabFacture extends com.querydsl.sql.RelationalPathBase<QXlabFacture> {

    private static final long serialVersionUID = 439984541;

    public static final QXlabFacture xlabFacture = new QXlabFacture("XLAB_FACTURE");

    public final NumberPath<Long> attOrdre = createNumber("attOrdre", Long.class);

    public final NumberPath<Long> ceOrdre = createNumber("ceOrdre", Long.class);

    public final NumberPath<Long> depId = createNumber("depId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> modOrdre = createNumber("modOrdre", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> ribOrdre = createNumber("ribOrdre", Long.class);

    public final NumberPath<Long> tapId = createNumber("tapId", Long.class);

    public final NumberPath<Long> tcdOrdre = createNumber("tcdOrdre", Long.class);

    public final NumberPath<Long> tyacId = createNumber("tyacId", Long.class);

    public final StringPath xcdeCode = createString("xcdeCode");

    public final NumberPath<Long> xcdeId = createNumber("xcdeId", Long.class);

    public final StringPath xfactCode = createString("xfactCode");

    public final StringPath xfactCommentaire = createString("xfactCommentaire");

    public final DateTimePath<java.sql.Timestamp> xfactDateEmis = createDateTime("xfactDateEmis", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> xfactDateRecept = createDateTime("xfactDateRecept", java.sql.Timestamp.class);

    public final StringPath xfactExer = createString("xfactExer");

    public final NumberPath<java.math.BigDecimal> xfactHt = createNumber("xfactHt", java.math.BigDecimal.class);

    public final NumberPath<Long> xfactId = createNumber("xfactId", Long.class);

    public final StringPath xfactNumero = createString("xfactNumero");

    public final StringPath xfactObjet = createString("xfactObjet");

    public final NumberPath<java.math.BigDecimal> xfactTva = createNumber("xfactTva", java.math.BigDecimal.class);

    public final NumberPath<Long> xfouOrdre = createNumber("xfouOrdre", Long.class);

    public final NumberPath<Long> ximpId = createNumber("ximpId", Long.class);

    public final NumberPath<Long> xlabId = createNumber("xlabId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QXlabFacture> xlabFacturePk = createPrimaryKey(xfactId);

    public QXlabFacture(String variable) {
        super(QXlabFacture.class, forVariable(variable), "GFC", "XLAB_FACTURE");
        addMetadata();
    }

    public QXlabFacture(String variable, String schema, String table) {
        super(QXlabFacture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXlabFacture(Path<? extends QXlabFacture> path) {
        super(path.getType(), path.getMetadata(), "GFC", "XLAB_FACTURE");
        addMetadata();
    }

    public QXlabFacture(PathMetadata metadata) {
        super(QXlabFacture.class, metadata, "GFC", "XLAB_FACTURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attOrdre, ColumnMetadata.named("ATT_ORDRE").withIndex(22).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ceOrdre, ColumnMetadata.named("CE_ORDRE").withIndex(21).ofType(Types.DECIMAL).withSize(0));
        addMetadata(depId, ColumnMetadata.named("DEP_ID").withIndex(16).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(25).ofType(Types.DECIMAL).withSize(4));
        addMetadata(modOrdre, ColumnMetadata.named("MOD_ORDRE").withIndex(23).ofType(Types.DECIMAL).withSize(0));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(20).ofType(Types.VARCHAR).withSize(20));
        addMetadata(ribOrdre, ColumnMetadata.named("RIB_ORDRE").withIndex(24).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tapId, ColumnMetadata.named("TAP_ID").withIndex(19).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tcdOrdre, ColumnMetadata.named("TCD_ORDRE").withIndex(18).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tyacId, ColumnMetadata.named("TYAC_ID").withIndex(17).ofType(Types.DECIMAL).withSize(0));
        addMetadata(xcdeCode, ColumnMetadata.named("XCDE_CODE").withIndex(14).ofType(Types.VARCHAR).withSize(6));
        addMetadata(xcdeId, ColumnMetadata.named("XCDE_ID").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(xfactCode, ColumnMetadata.named("XFACT_CODE").withIndex(8).ofType(Types.VARCHAR).withSize(6).notNull());
        addMetadata(xfactCommentaire, ColumnMetadata.named("XFACT_COMMENTAIRE").withIndex(9).ofType(Types.VARCHAR).withSize(80));
        addMetadata(xfactDateEmis, ColumnMetadata.named("XFACT_DATE_EMIS").withIndex(6).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(xfactDateRecept, ColumnMetadata.named("XFACT_DATE_RECEPT").withIndex(13).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(xfactExer, ColumnMetadata.named("XFACT_EXER").withIndex(2).ofType(Types.VARCHAR).withSize(6).notNull());
        addMetadata(xfactHt, ColumnMetadata.named("XFACT_HT").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(xfactId, ColumnMetadata.named("XFACT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(xfactNumero, ColumnMetadata.named("XFACT_NUMERO").withIndex(7).ofType(Types.VARCHAR).withSize(25).notNull());
        addMetadata(xfactObjet, ColumnMetadata.named("XFACT_OBJET").withIndex(10).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(xfactTva, ColumnMetadata.named("XFACT_TVA").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(xfouOrdre, ColumnMetadata.named("XFOU_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ximpId, ColumnMetadata.named("XIMP_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(xlabId, ColumnMetadata.named("XLAB_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


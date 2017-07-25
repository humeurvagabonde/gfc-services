package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXlabCommande is a Querydsl query type for QXlabCommande
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXlabCommande extends com.querydsl.sql.RelationalPathBase<QXlabCommande> {

    private static final long serialVersionUID = -359467911;

    public static final QXlabCommande xlabCommande = new QXlabCommande("XLAB_COMMANDE");

    public final NumberPath<Long> commId = createNumber("commId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> tapId = createNumber("tapId", Long.class);

    public final NumberPath<Long> tcdOrdre = createNumber("tcdOrdre", Long.class);

    public final StringPath xcdeCode = createString("xcdeCode");

    public final StringPath xcdeExer = createString("xcdeExer");

    public final NumberPath<java.math.BigDecimal> xcdeHt = createNumber("xcdeHt", java.math.BigDecimal.class);

    public final NumberPath<Long> xcdeId = createNumber("xcdeId", Long.class);

    public final StringPath xcdeLibelle = createString("xcdeLibelle");

    public final StringPath xcdeMission = createString("xcdeMission");

    public final NumberPath<java.math.BigDecimal> xcdeTva = createNumber("xcdeTva", java.math.BigDecimal.class);

    public final NumberPath<Long> xconId = createNumber("xconId", Long.class);

    public final NumberPath<Long> xdesId = createNumber("xdesId", Long.class);

    public final NumberPath<Long> xfouOrdre = createNumber("xfouOrdre", Long.class);

    public final NumberPath<Long> ximpId = createNumber("ximpId", Long.class);

    public final NumberPath<Long> xlabId = createNumber("xlabId", Long.class);

    public final NumberPath<Long> xmarId = createNumber("xmarId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QXlabCommande> xlabCommandePk = createPrimaryKey(xcdeId);

    public QXlabCommande(String variable) {
        super(QXlabCommande.class, forVariable(variable), "GFC", "XLAB_COMMANDE");
        addMetadata();
    }

    public QXlabCommande(String variable, String schema, String table) {
        super(QXlabCommande.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXlabCommande(Path<? extends QXlabCommande> path) {
        super(path.getType(), path.getMetadata(), "GFC", "XLAB_COMMANDE");
        addMetadata();
    }

    public QXlabCommande(PathMetadata metadata) {
        super(QXlabCommande.class, metadata, "GFC", "XLAB_COMMANDE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commId, ColumnMetadata.named("COMM_ID").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(18).ofType(Types.DECIMAL).withSize(4));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(17).ofType(Types.VARCHAR).withSize(20));
        addMetadata(tapId, ColumnMetadata.named("TAP_ID").withIndex(16).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tcdOrdre, ColumnMetadata.named("TCD_ORDRE").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(xcdeCode, ColumnMetadata.named("XCDE_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(6).notNull());
        addMetadata(xcdeExer, ColumnMetadata.named("XCDE_EXER").withIndex(2).ofType(Types.VARCHAR).withSize(4).notNull());
        addMetadata(xcdeHt, ColumnMetadata.named("XCDE_HT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(xcdeId, ColumnMetadata.named("XCDE_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(xcdeLibelle, ColumnMetadata.named("XCDE_LIBELLE").withIndex(7).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(xcdeMission, ColumnMetadata.named("XCDE_MISSION").withIndex(12).ofType(Types.VARCHAR).withSize(5));
        addMetadata(xcdeTva, ColumnMetadata.named("XCDE_TVA").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(xconId, ColumnMetadata.named("XCON_ID").withIndex(13).ofType(Types.DECIMAL).withSize(0));
        addMetadata(xdesId, ColumnMetadata.named("XDES_ID").withIndex(14).ofType(Types.DECIMAL).withSize(0));
        addMetadata(xfouOrdre, ColumnMetadata.named("XFOU_ORDRE").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ximpId, ColumnMetadata.named("XIMP_ID").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(xlabId, ColumnMetadata.named("XLAB_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(xmarId, ColumnMetadata.named("XMAR_ID").withIndex(11).ofType(Types.DECIMAL).withSize(0));
    }

}


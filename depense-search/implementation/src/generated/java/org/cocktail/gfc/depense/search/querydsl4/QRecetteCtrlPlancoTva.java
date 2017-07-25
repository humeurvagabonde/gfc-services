package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecetteCtrlPlancoTva is a Querydsl query type for QRecetteCtrlPlancoTva
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecetteCtrlPlancoTva extends com.querydsl.sql.RelationalPathBase<QRecetteCtrlPlancoTva> {

    private static final long serialVersionUID = -1338765543;

    public static final QRecetteCtrlPlancoTva recetteCtrlPlancoTva = new QRecetteCtrlPlancoTva("RECETTE_CTRL_PLANCO_TVA");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> rpcoId = createNumber("rpcoId", Long.class);

    public final DateTimePath<java.sql.Timestamp> rpcotvaDateSaisie = createDateTime("rpcotvaDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<Long> rpcotvaId = createNumber("rpcotvaId", Long.class);

    public final NumberPath<java.math.BigDecimal> rpcotvaTvaSaisie = createNumber("rpcotvaTvaSaisie", java.math.BigDecimal.class);

    public final com.querydsl.sql.PrimaryKey<QRecetteCtrlPlancoTva> recetteCtrlPlancoTvaPk = createPrimaryKey(rpcotvaId);

    public QRecetteCtrlPlancoTva(String variable) {
        super(QRecetteCtrlPlancoTva.class, forVariable(variable), "GFC", "RECETTE_CTRL_PLANCO_TVA");
        addMetadata();
    }

    public QRecetteCtrlPlancoTva(String variable, String schema, String table) {
        super(QRecetteCtrlPlancoTva.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecetteCtrlPlancoTva(Path<? extends QRecetteCtrlPlancoTva> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RECETTE_CTRL_PLANCO_TVA");
        addMetadata();
    }

    public QRecetteCtrlPlancoTva(PathMetadata metadata) {
        super(QRecetteCtrlPlancoTva.class, metadata, "GFC", "RECETTE_CTRL_PLANCO_TVA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(7).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(rpcoId, ColumnMetadata.named("RPCO_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rpcotvaDateSaisie, ColumnMetadata.named("RPCOTVA_DATE_SAISIE").withIndex(6).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(rpcotvaId, ColumnMetadata.named("RPCOTVA_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rpcotvaTvaSaisie, ColumnMetadata.named("RPCOTVA_TVA_SAISIE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
    }

}


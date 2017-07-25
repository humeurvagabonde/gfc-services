package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVirementParamBdf is a Querydsl query type for QVirementParamBdf
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVirementParamBdf extends com.querydsl.sql.RelationalPathBase<QVirementParamBdf> {

    private static final long serialVersionUID = -1211679995;

    public static final QVirementParamBdf virementParamBdf = new QVirementParamBdf("VIREMENT_PARAM_BDF");

    public final NumberPath<Long> tviOrdre = createNumber("tviOrdre", Long.class);

    public final StringPath vpbA1 = createString("vpbA1");

    public final StringPath vpbA2 = createString("vpbA2");

    public final StringPath vpbB1 = createString("vpbB1");

    public final StringPath vpbC1 = createString("vpbC1");

    public final StringPath vpbC2 = createString("vpbC2");

    public final StringPath vpbC3 = createString("vpbC3");

    public final StringPath vpbC41 = createString("vpbC41");

    public final StringPath vpbC42 = createString("vpbC42");

    public final StringPath vpbC5 = createString("vpbC5");

    public final StringPath vpbC6 = createString("vpbC6");

    public final StringPath vpbCompteTpg = createString("vpbCompteTpg");

    public final StringPath vpbD10 = createString("vpbD10");

    public final StringPath vpbEtat = createString("vpbEtat");

    public final StringPath vpbNomRemettant = createString("vpbNomRemettant");

    public final StringPath vpbNomTpg = createString("vpbNomTpg");

    public final NumberPath<Long> vpbOrdre = createNumber("vpbOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QVirementParamBdf> virementParamBdfPk = createPrimaryKey(vpbOrdre);

    public QVirementParamBdf(String variable) {
        super(QVirementParamBdf.class, forVariable(variable), "GFC", "VIREMENT_PARAM_BDF");
        addMetadata();
    }

    public QVirementParamBdf(String variable, String schema, String table) {
        super(QVirementParamBdf.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVirementParamBdf(Path<? extends QVirementParamBdf> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VIREMENT_PARAM_BDF");
        addMetadata();
    }

    public QVirementParamBdf(PathMetadata metadata) {
        super(QVirementParamBdf.class, metadata, "GFC", "VIREMENT_PARAM_BDF");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tviOrdre, ColumnMetadata.named("TVI_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(vpbA1, ColumnMetadata.named("VPB_A1").withIndex(3).ofType(Types.VARCHAR).withSize(6));
        addMetadata(vpbA2, ColumnMetadata.named("VPB_A2").withIndex(4).ofType(Types.VARCHAR).withSize(6));
        addMetadata(vpbB1, ColumnMetadata.named("VPB_B1").withIndex(5).ofType(Types.VARCHAR).withSize(6));
        addMetadata(vpbC1, ColumnMetadata.named("VPB_C1").withIndex(6).ofType(Types.VARCHAR).withSize(5));
        addMetadata(vpbC2, ColumnMetadata.named("VPB_C2").withIndex(7).ofType(Types.VARCHAR).withSize(5));
        addMetadata(vpbC3, ColumnMetadata.named("VPB_C3").withIndex(8).ofType(Types.VARCHAR).withSize(5));
        addMetadata(vpbC41, ColumnMetadata.named("VPB_C41").withIndex(9).ofType(Types.VARCHAR).withSize(4));
        addMetadata(vpbC42, ColumnMetadata.named("VPB_C42").withIndex(10).ofType(Types.VARCHAR).withSize(7));
        addMetadata(vpbC5, ColumnMetadata.named("VPB_C5").withIndex(11).ofType(Types.VARCHAR).withSize(24));
        addMetadata(vpbC6, ColumnMetadata.named("VPB_C6").withIndex(12).ofType(Types.VARCHAR).withSize(6));
        addMetadata(vpbCompteTpg, ColumnMetadata.named("VPB_COMPTE_TPG").withIndex(15).ofType(Types.VARCHAR).withSize(50));
        addMetadata(vpbD10, ColumnMetadata.named("VPB_D10").withIndex(13).ofType(Types.VARCHAR).withSize(12));
        addMetadata(vpbEtat, ColumnMetadata.named("VPB_ETAT").withIndex(14).ofType(Types.VARCHAR).withSize(10));
        addMetadata(vpbNomRemettant, ColumnMetadata.named("VPB_NOM_REMETTANT").withIndex(17).ofType(Types.VARCHAR).withSize(100));
        addMetadata(vpbNomTpg, ColumnMetadata.named("VPB_NOM_TPG").withIndex(16).ofType(Types.VARCHAR).withSize(100));
        addMetadata(vpbOrdre, ColumnMetadata.named("VPB_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


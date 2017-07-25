package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPrelevementParamBdf is a Querydsl query type for QPrelevementParamBdf
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPrelevementParamBdf extends com.querydsl.sql.RelationalPathBase<QPrelevementParamBdf> {

    private static final long serialVersionUID = -207683946;

    public static final QPrelevementParamBdf prelevementParamBdf = new QPrelevementParamBdf("PRELEVEMENT_PARAM_BDF");

    public final StringPath ppbC3 = createString("ppbC3");

    public final StringPath ppbC41 = createString("ppbC41");

    public final StringPath ppbC42 = createString("ppbC42");

    public final StringPath ppbC5 = createString("ppbC5");

    public final StringPath ppbC6 = createString("ppbC6");

    public final StringPath ppbCompteTpg = createString("ppbCompteTpg");

    public final StringPath ppbEtat = createString("ppbEtat");

    public final StringPath ppbNomRemettant = createString("ppbNomRemettant");

    public final StringPath ppbNomTpg = createString("ppbNomTpg");

    public final NumberPath<Long> ppbOrdre = createNumber("ppbOrdre", Long.class);

    public final NumberPath<Long> trecOrdre = createNumber("trecOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QPrelevementParamBdf> prelevementParamBdfPk = createPrimaryKey(ppbOrdre);

    public QPrelevementParamBdf(String variable) {
        super(QPrelevementParamBdf.class, forVariable(variable), "GFC", "PRELEVEMENT_PARAM_BDF");
        addMetadata();
    }

    public QPrelevementParamBdf(String variable, String schema, String table) {
        super(QPrelevementParamBdf.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPrelevementParamBdf(Path<? extends QPrelevementParamBdf> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PRELEVEMENT_PARAM_BDF");
        addMetadata();
    }

    public QPrelevementParamBdf(PathMetadata metadata) {
        super(QPrelevementParamBdf.class, metadata, "GFC", "PRELEVEMENT_PARAM_BDF");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ppbC3, ColumnMetadata.named("PPB_C3").withIndex(3).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(ppbC41, ColumnMetadata.named("PPB_C41").withIndex(4).ofType(Types.VARCHAR).withSize(4).notNull());
        addMetadata(ppbC42, ColumnMetadata.named("PPB_C42").withIndex(5).ofType(Types.VARCHAR).withSize(7).notNull());
        addMetadata(ppbC5, ColumnMetadata.named("PPB_C5").withIndex(6).ofType(Types.VARCHAR).withSize(24).notNull());
        addMetadata(ppbC6, ColumnMetadata.named("PPB_C6").withIndex(7).ofType(Types.VARCHAR).withSize(6).notNull());
        addMetadata(ppbCompteTpg, ColumnMetadata.named("PPB_COMPTE_TPG").withIndex(9).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(ppbEtat, ColumnMetadata.named("PPB_ETAT").withIndex(8).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(ppbNomRemettant, ColumnMetadata.named("PPB_NOM_REMETTANT").withIndex(11).ofType(Types.VARCHAR).withSize(100));
        addMetadata(ppbNomTpg, ColumnMetadata.named("PPB_NOM_TPG").withIndex(10).ofType(Types.VARCHAR).withSize(100));
        addMetadata(ppbOrdre, ColumnMetadata.named("PPB_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(trecOrdre, ColumnMetadata.named("TREC_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCodeExer is a Querydsl query type for QCodeExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCodeExer extends com.querydsl.sql.RelationalPathBase<QCodeExer> {

    private static final long serialVersionUID = -2114302473;

    public static final QCodeExer codeExer = new QCodeExer("CODE_EXER");

    public final NumberPath<Long> ce3cmp = createNumber("ce3cmp", Long.class);

    public final StringPath ceActif = createString("ceActif");

    public final NumberPath<Long> ceAutres = createNumber("ceAutres", Long.class);

    public final NumberPath<java.math.BigDecimal> ceControle = createNumber("ceControle", java.math.BigDecimal.class);

    public final NumberPath<Long> ceMonopole = createNumber("ceMonopole", Long.class);

    public final NumberPath<Long> ceOrdre = createNumber("ceOrdre", Long.class);

    public final StringPath ceRech = createString("ceRech");

    public final StringPath ceSuppr = createString("ceSuppr");

    public final StringPath ceType = createString("ceType");

    public final NumberPath<Long> cmOrdre = createNumber("cmOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> tcnId = createNumber("tcnId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCodeExer> codeExerPk = createPrimaryKey(ceOrdre);

    public QCodeExer(String variable) {
        super(QCodeExer.class, forVariable(variable), "GFC", "CODE_EXER");
        addMetadata();
    }

    public QCodeExer(String variable, String schema, String table) {
        super(QCodeExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCodeExer(Path<? extends QCodeExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CODE_EXER");
        addMetadata();
    }

    public QCodeExer(PathMetadata metadata) {
        super(QCodeExer.class, metadata, "GFC", "CODE_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ce3cmp, ColumnMetadata.named("CE_3CMP").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(ceActif, ColumnMetadata.named("CE_ACTIF").withIndex(12).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(ceAutres, ColumnMetadata.named("CE_AUTRES").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(ceControle, ColumnMetadata.named("CE_CONTROLE").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(ceMonopole, ColumnMetadata.named("CE_MONOPOLE").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(ceOrdre, ColumnMetadata.named("CE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ceRech, ColumnMetadata.named("CE_RECH").withIndex(6).ofType(Types.VARCHAR).withSize(1));
        addMetadata(ceSuppr, ColumnMetadata.named("CE_SUPPR").withIndex(7).ofType(Types.VARCHAR).withSize(1));
        addMetadata(ceType, ColumnMetadata.named("CE_TYPE").withIndex(8).ofType(Types.VARCHAR).withSize(1));
        addMetadata(cmOrdre, ColumnMetadata.named("CM_ORDRE").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(10).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(tcnId, ColumnMetadata.named("TCN_ID").withIndex(11).ofType(Types.DECIMAL).withSize(0));
    }

}


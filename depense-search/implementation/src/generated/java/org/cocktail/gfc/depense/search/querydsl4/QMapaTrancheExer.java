package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMapaTrancheExer is a Querydsl query type for QMapaTrancheExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMapaTrancheExer extends com.querydsl.sql.RelationalPathBase<QMapaTrancheExer> {

    private static final long serialVersionUID = -1734412538;

    public static final QMapaTrancheExer mapaTrancheExer = new QMapaTrancheExer("MAPA_TRANCHE_EXER");

    public final DateTimePath<java.sql.Timestamp> dateModification = createDateTime("dateModification", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateVoteCa = createDateTime("dateVoteCa", java.sql.Timestamp.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> modId = createNumber("modId", Long.class);

    public final NumberPath<Long> mteId = createNumber("mteId", Long.class);

    public final StringPath mteLibelle = createString("mteLibelle");

    public final NumberPath<java.math.BigDecimal> mteMax = createNumber("mteMax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> mteMin = createNumber("mteMin", java.math.BigDecimal.class);

    public final NumberPath<Long> tcnId = createNumber("tcnId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QMapaTrancheExer> mapaTrancheExerPk = createPrimaryKey(mteId);

    public QMapaTrancheExer(String variable) {
        super(QMapaTrancheExer.class, forVariable(variable), "GFC", "MAPA_TRANCHE_EXER");
        addMetadata();
    }

    public QMapaTrancheExer(String variable, String schema, String table) {
        super(QMapaTrancheExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMapaTrancheExer(Path<? extends QMapaTrancheExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "MAPA_TRANCHE_EXER");
        addMetadata();
    }

    public QMapaTrancheExer(PathMetadata metadata) {
        super(QMapaTrancheExer.class, metadata, "GFC", "MAPA_TRANCHE_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateModification, ColumnMetadata.named("DATE_MODIFICATION").withIndex(9).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dateVoteCa, ColumnMetadata.named("DATE_VOTE_CA").withIndex(3).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(modId, ColumnMetadata.named("MOD_ID").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(mteId, ColumnMetadata.named("MTE_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(mteLibelle, ColumnMetadata.named("MTE_LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(512));
        addMetadata(mteMax, ColumnMetadata.named("MTE_MAX").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(mteMin, ColumnMetadata.named("MTE_MIN").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(tcnId, ColumnMetadata.named("TCN_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(0));
    }

}


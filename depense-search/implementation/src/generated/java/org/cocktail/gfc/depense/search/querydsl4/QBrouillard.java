package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBrouillard is a Querydsl query type for QBrouillard
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBrouillard extends com.querydsl.sql.RelationalPathBase<QBrouillard> {

    private static final long serialVersionUID = -1225030902;

    public static final QBrouillard brouillard = new QBrouillard("BROUILLARD");

    public final NumberPath<Long> borId = createNumber("borId", Long.class);

    public final DateTimePath<java.sql.Timestamp> broDateVisa = createDateTime("broDateVisa", java.sql.Timestamp.class);

    public final StringPath broEtat = createString("broEtat");

    public final NumberPath<Long> broId = createNumber("broId", Long.class);

    public final StringPath broLibelle = createString("broLibelle");

    public final StringPath broMotifRejet = createString("broMotifRejet");

    public final NumberPath<Long> broNumero = createNumber("broNumero", Long.class);

    public final StringPath broPostit = createString("broPostit");

    public final NumberPath<Long> comOrdre = createNumber("comOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> dateCreation = createDateTime("dateCreation", java.sql.Timestamp.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> oriOrdre = createNumber("oriOrdre", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdVisa = createNumber("persIdVisa", Long.class);

    public final NumberPath<Long> tjoOrdre = createNumber("tjoOrdre", Long.class);

    public final NumberPath<Long> topOrdre = createNumber("topOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBrouillard> brouillardPk = createPrimaryKey(broId);

    public QBrouillard(String variable) {
        super(QBrouillard.class, forVariable(variable), "GFC", "BROUILLARD");
        addMetadata();
    }

    public QBrouillard(String variable, String schema, String table) {
        super(QBrouillard.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBrouillard(Path<? extends QBrouillard> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BROUILLARD");
        addMetadata();
    }

    public QBrouillard(PathMetadata metadata) {
        super(QBrouillard.class, metadata, "GFC", "BROUILLARD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(borId, ColumnMetadata.named("BOR_ID").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(broDateVisa, ColumnMetadata.named("BRO_DATE_VISA").withIndex(13).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(broEtat, ColumnMetadata.named("BRO_ETAT").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(broId, ColumnMetadata.named("BRO_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(broLibelle, ColumnMetadata.named("BRO_LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(broMotifRejet, ColumnMetadata.named("BRO_MOTIF_REJET").withIndex(12).ofType(Types.VARCHAR).withSize(200));
        addMetadata(broNumero, ColumnMetadata.named("BRO_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(broPostit, ColumnMetadata.named("BRO_POSTIT").withIndex(6).ofType(Types.VARCHAR).withSize(200));
        addMetadata(comOrdre, ColumnMetadata.named("COM_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(11).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(16).ofType(Types.DECIMAL).withSize(4));
        addMetadata(oriOrdre, ColumnMetadata.named("ORI_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdVisa, ColumnMetadata.named("PERS_ID_VISA").withIndex(14).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tjoOrdre, ColumnMetadata.named("TJO_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(topOrdre, ColumnMetadata.named("TOP_ORDRE").withIndex(9).ofType(Types.DECIMAL).withSize(0));
    }

}


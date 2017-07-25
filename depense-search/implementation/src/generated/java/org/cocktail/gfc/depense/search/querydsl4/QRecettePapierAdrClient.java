package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecettePapierAdrClient is a Querydsl query type for QRecettePapierAdrClient
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecettePapierAdrClient extends com.querydsl.sql.RelationalPathBase<QRecettePapierAdrClient> {

    private static final long serialVersionUID = 1960211325;

    public static final QRecettePapierAdrClient recettePapierAdrClient = new QRecettePapierAdrClient("RECETTE_PAPIER_ADR_CLIENT");

    public final NumberPath<Long> adrOrdre = createNumber("adrOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> dateCreation = createDateTime("dateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateFin = createDateTime("dateFin", java.sql.Timestamp.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> rppadcId = createNumber("rppadcId", Long.class);

    public final NumberPath<Long> rppId = createNumber("rppId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRecettePapierAdrClient> recettePapierAdrClientPk = createPrimaryKey(rppadcId);

    public QRecettePapierAdrClient(String variable) {
        super(QRecettePapierAdrClient.class, forVariable(variable), "GFC", "RECETTE_PAPIER_ADR_CLIENT");
        addMetadata();
    }

    public QRecettePapierAdrClient(String variable, String schema, String table) {
        super(QRecettePapierAdrClient.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecettePapierAdrClient(Path<? extends QRecettePapierAdrClient> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RECETTE_PAPIER_ADR_CLIENT");
        addMetadata();
    }

    public QRecettePapierAdrClient(PathMetadata metadata) {
        super(QRecettePapierAdrClient.class, metadata, "GFC", "RECETTE_PAPIER_ADR_CLIENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adrOrdre, ColumnMetadata.named("ADR_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dateFin, ColumnMetadata.named("DATE_FIN").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rppadcId, ColumnMetadata.named("RPPADC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rppId, ColumnMetadata.named("RPP_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


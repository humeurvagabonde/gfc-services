package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPrestationAdrClient is a Querydsl query type for QPrestationAdrClient
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPrestationAdrClient extends com.querydsl.sql.RelationalPathBase<QPrestationAdrClient> {

    private static final long serialVersionUID = 1321257759;

    public static final QPrestationAdrClient prestationAdrClient = new QPrestationAdrClient("PRESTATION_ADR_CLIENT");

    public final NumberPath<Long> adrOrdre = createNumber("adrOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> dateCreation = createDateTime("dateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateFin = createDateTime("dateFin", java.sql.Timestamp.class);

    public final NumberPath<Long> padcId = createNumber("padcId", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> prestId = createNumber("prestId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QPrestationAdrClient> prestAdrClientPk = createPrimaryKey(padcId);

    public QPrestationAdrClient(String variable) {
        super(QPrestationAdrClient.class, forVariable(variable), "GFC", "PRESTATION_ADR_CLIENT");
        addMetadata();
    }

    public QPrestationAdrClient(String variable, String schema, String table) {
        super(QPrestationAdrClient.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPrestationAdrClient(Path<? extends QPrestationAdrClient> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PRESTATION_ADR_CLIENT");
        addMetadata();
    }

    public QPrestationAdrClient(PathMetadata metadata) {
        super(QPrestationAdrClient.class, metadata, "GFC", "PRESTATION_ADR_CLIENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adrOrdre, ColumnMetadata.named("ADR_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dateFin, ColumnMetadata.named("DATE_FIN").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(padcId, ColumnMetadata.named("PADC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prestId, ColumnMetadata.named("PREST_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


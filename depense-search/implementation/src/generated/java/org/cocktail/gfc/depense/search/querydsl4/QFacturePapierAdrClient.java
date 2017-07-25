package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFacturePapierAdrClient is a Querydsl query type for QFacturePapierAdrClient
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFacturePapierAdrClient extends com.querydsl.sql.RelationalPathBase<QFacturePapierAdrClient> {

    private static final long serialVersionUID = 610778737;

    public static final QFacturePapierAdrClient facturePapierAdrClient = new QFacturePapierAdrClient("FACTURE_PAPIER_ADR_CLIENT");

    public final NumberPath<Long> adrOrdre = createNumber("adrOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> dateCreation = createDateTime("dateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateFin = createDateTime("dateFin", java.sql.Timestamp.class);

    public final NumberPath<Long> fapadcId = createNumber("fapadcId", Long.class);

    public final NumberPath<Long> fapId = createNumber("fapId", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final com.querydsl.sql.PrimaryKey<QFacturePapierAdrClient> fapAdrClientPk = createPrimaryKey(fapadcId);

    public QFacturePapierAdrClient(String variable) {
        super(QFacturePapierAdrClient.class, forVariable(variable), "GFC", "FACTURE_PAPIER_ADR_CLIENT");
        addMetadata();
    }

    public QFacturePapierAdrClient(String variable, String schema, String table) {
        super(QFacturePapierAdrClient.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFacturePapierAdrClient(Path<? extends QFacturePapierAdrClient> path) {
        super(path.getType(), path.getMetadata(), "GFC", "FACTURE_PAPIER_ADR_CLIENT");
        addMetadata();
    }

    public QFacturePapierAdrClient(PathMetadata metadata) {
        super(QFacturePapierAdrClient.class, metadata, "GFC", "FACTURE_PAPIER_ADR_CLIENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adrOrdre, ColumnMetadata.named("ADR_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dateFin, ColumnMetadata.named("DATE_FIN").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(fapadcId, ColumnMetadata.named("FAPADC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fapId, ColumnMetadata.named("FAP_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


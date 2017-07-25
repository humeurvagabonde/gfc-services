package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVRecetteRelInfo is a Querydsl query type for QVRecetteRelInfo
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVRecetteRelInfo extends com.querydsl.sql.RelationalPathBase<QVRecetteRelInfo> {

    private static final long serialVersionUID = -218028061;

    public static final QVRecetteRelInfo vRecetteRelInfo = new QVRecetteRelInfo("V_RECETTE_REL_INFO");

    public final DateTimePath<java.sql.Timestamp> dateProchaineRelance = createDateTime("dateProchaineRelance", java.sql.Timestamp.class);

    public final NumberPath<Long> nbRelances = createNumber("nbRelances", Long.class);

    public final DateTimePath<java.sql.Timestamp> recDateLimitePaiement = createDateTime("recDateLimitePaiement", java.sql.Timestamp.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public QVRecetteRelInfo(String variable) {
        super(QVRecetteRelInfo.class, forVariable(variable), "GFC", "V_RECETTE_REL_INFO");
        addMetadata();
    }

    public QVRecetteRelInfo(String variable, String schema, String table) {
        super(QVRecetteRelInfo.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVRecetteRelInfo(Path<? extends QVRecetteRelInfo> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_RECETTE_REL_INFO");
        addMetadata();
    }

    public QVRecetteRelInfo(PathMetadata metadata) {
        super(QVRecetteRelInfo.class, metadata, "GFC", "V_RECETTE_REL_INFO");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateProchaineRelance, ColumnMetadata.named("DATE_PROCHAINE_RELANCE").withIndex(4).ofType(Types.TIMESTAMP).withSize(8));
        addMetadata(nbRelances, ColumnMetadata.named("NB_RELANCES").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(recDateLimitePaiement, ColumnMetadata.named("REC_DATE_LIMITE_PAIEMENT").withIndex(2).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


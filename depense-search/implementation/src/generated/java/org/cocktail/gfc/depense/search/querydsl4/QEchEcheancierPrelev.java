package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEchEcheancierPrelev is a Querydsl query type for QEchEcheancierPrelev
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEchEcheancierPrelev extends com.querydsl.sql.RelationalPathBase<QEchEcheancierPrelev> {

    private static final long serialVersionUID = -252328139;

    public static final QEchEcheancierPrelev echEcheancierPrelev = new QEchEcheancierPrelev("ECH_ECHEANCIER_PRELEV");

    public final NumberPath<Long> echId = createNumber("echId", Long.class);

    public final NumberPath<Long> echpId = createNumber("echpId", Long.class);

    public final NumberPath<Long> ribOrdreDebiteur = createNumber("ribOrdreDebiteur", Long.class);

    public final com.querydsl.sql.PrimaryKey<QEchEcheancierPrelev> echEcheancierPrelevPk = createPrimaryKey(echpId);

    public QEchEcheancierPrelev(String variable) {
        super(QEchEcheancierPrelev.class, forVariable(variable), "GFC", "ECH_ECHEANCIER_PRELEV");
        addMetadata();
    }

    public QEchEcheancierPrelev(String variable, String schema, String table) {
        super(QEchEcheancierPrelev.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEchEcheancierPrelev(Path<? extends QEchEcheancierPrelev> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ECH_ECHEANCIER_PRELEV");
        addMetadata();
    }

    public QEchEcheancierPrelev(PathMetadata metadata) {
        super(QEchEcheancierPrelev.class, metadata, "GFC", "ECH_ECHEANCIER_PRELEV");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(echId, ColumnMetadata.named("ECH_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(echpId, ColumnMetadata.named("ECHP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ribOrdreDebiteur, ColumnMetadata.named("RIB_ORDRE_DEBITEUR").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


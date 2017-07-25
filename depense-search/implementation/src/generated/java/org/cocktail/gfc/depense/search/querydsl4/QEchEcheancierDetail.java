package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEchEcheancierDetail is a Querydsl query type for QEchEcheancierDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEchEcheancierDetail extends com.querydsl.sql.RelationalPathBase<QEchEcheancierDetail> {

    private static final long serialVersionUID = -607447316;

    public static final QEchEcheancierDetail echEcheancierDetail = new QEchEcheancierDetail("ECH_ECHEANCIER_DETAIL");

    public final StringPath echdCommentaire = createString("echdCommentaire");

    public final DateTimePath<java.sql.Timestamp> echdDatePrevue = createDateTime("echdDatePrevue", java.sql.Timestamp.class);

    public final NumberPath<Long> echdId = createNumber("echdId", Long.class);

    public final NumberPath<java.math.BigDecimal> echdMontant = createNumber("echdMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> echdNumero = createNumber("echdNumero", Long.class);

    public final NumberPath<Long> echId = createNumber("echId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QEchEcheancierDetail> echEcheancierDetailPk = createPrimaryKey(echdId);

    public QEchEcheancierDetail(String variable) {
        super(QEchEcheancierDetail.class, forVariable(variable), "GFC", "ECH_ECHEANCIER_DETAIL");
        addMetadata();
    }

    public QEchEcheancierDetail(String variable, String schema, String table) {
        super(QEchEcheancierDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEchEcheancierDetail(Path<? extends QEchEcheancierDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ECH_ECHEANCIER_DETAIL");
        addMetadata();
    }

    public QEchEcheancierDetail(PathMetadata metadata) {
        super(QEchEcheancierDetail.class, metadata, "GFC", "ECH_ECHEANCIER_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(echdCommentaire, ColumnMetadata.named("ECHD_COMMENTAIRE").withIndex(6).ofType(Types.VARCHAR).withSize(500));
        addMetadata(echdDatePrevue, ColumnMetadata.named("ECHD_DATE_PREVUE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(echdId, ColumnMetadata.named("ECHD_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(echdMontant, ColumnMetadata.named("ECHD_MONTANT").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(echdNumero, ColumnMetadata.named("ECHD_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(echId, ColumnMetadata.named("ECH_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


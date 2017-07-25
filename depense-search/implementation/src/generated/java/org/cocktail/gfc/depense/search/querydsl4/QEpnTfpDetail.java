package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEpnTfpDetail is a Querydsl query type for QEpnTfpDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEpnTfpDetail extends com.querydsl.sql.RelationalPathBase<QEpnTfpDetail> {

    private static final long serialVersionUID = 440633622;

    public static final QEpnTfpDetail epnTfpDetail = new QEpnTfpDetail("EPN_TFP_DETAIL");

    public final NumberPath<Long> idEpnIdentification = createNumber("idEpnIdentification", Long.class);

    public final NumberPath<Long> idEpnTfpDetail = createNumber("idEpnTfpDetail", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<java.math.BigDecimal> montant = createNumber("montant", java.math.BigDecimal.class);

    public final NumberPath<Integer> numero = createNumber("numero", Integer.class);

    public final StringPath typeEnregistrement = createString("typeEnregistrement");

    public final com.querydsl.sql.PrimaryKey<QEpnTfpDetail> idEpnTfpDetailPk = createPrimaryKey(idEpnTfpDetail);

    public QEpnTfpDetail(String variable) {
        super(QEpnTfpDetail.class, forVariable(variable), "GFC", "EPN_TFP_DETAIL");
        addMetadata();
    }

    public QEpnTfpDetail(String variable, String schema, String table) {
        super(QEpnTfpDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEpnTfpDetail(Path<? extends QEpnTfpDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EPN_TFP_DETAIL");
        addMetadata();
    }

    public QEpnTfpDetail(PathMetadata metadata) {
        super(QEpnTfpDetail.class, metadata, "GFC", "EPN_TFP_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idEpnIdentification, ColumnMetadata.named("ID_EPN_IDENTIFICATION").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idEpnTfpDetail, ColumnMetadata.named("ID_EPN_TFP_DETAIL").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(montant, ColumnMetadata.named("MONTANT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(numero, ColumnMetadata.named("NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(5).notNull());
        addMetadata(typeEnregistrement, ColumnMetadata.named("TYPE_ENREGISTREMENT").withIndex(3).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


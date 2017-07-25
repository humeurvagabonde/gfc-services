package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEpnAbpDetail is a Querydsl query type for QEpnAbpDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEpnAbpDetail extends com.querydsl.sql.RelationalPathBase<QEpnAbpDetail> {

    private static final long serialVersionUID = 2041223303;

    public static final QEpnAbpDetail epnAbpDetail = new QEpnAbpDetail("EPN_ABP_DETAIL");

    public final NumberPath<Long> idEpnAbpDetail = createNumber("idEpnAbpDetail", Long.class);

    public final NumberPath<Long> idEpnIdentification = createNumber("idEpnIdentification", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<java.math.BigDecimal> montant = createNumber("montant", java.math.BigDecimal.class);

    public final NumberPath<Integer> numero = createNumber("numero", Integer.class);

    public final StringPath typeEnregistrement = createString("typeEnregistrement");

    public final com.querydsl.sql.PrimaryKey<QEpnAbpDetail> idEpnAbpDetailPk = createPrimaryKey(idEpnAbpDetail);

    public QEpnAbpDetail(String variable) {
        super(QEpnAbpDetail.class, forVariable(variable), "GFC", "EPN_ABP_DETAIL");
        addMetadata();
    }

    public QEpnAbpDetail(String variable, String schema, String table) {
        super(QEpnAbpDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEpnAbpDetail(Path<? extends QEpnAbpDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EPN_ABP_DETAIL");
        addMetadata();
    }

    public QEpnAbpDetail(PathMetadata metadata) {
        super(QEpnAbpDetail.class, metadata, "GFC", "EPN_ABP_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idEpnAbpDetail, ColumnMetadata.named("ID_EPN_ABP_DETAIL").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idEpnIdentification, ColumnMetadata.named("ID_EPN_IDENTIFICATION").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(montant, ColumnMetadata.named("MONTANT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(numero, ColumnMetadata.named("NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(5).notNull());
        addMetadata(typeEnregistrement, ColumnMetadata.named("TYPE_ENREGISTREMENT").withIndex(3).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


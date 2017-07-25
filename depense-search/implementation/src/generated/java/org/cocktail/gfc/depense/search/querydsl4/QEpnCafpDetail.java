package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEpnCafpDetail is a Querydsl query type for QEpnCafpDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEpnCafpDetail extends com.querydsl.sql.RelationalPathBase<QEpnCafpDetail> {

    private static final long serialVersionUID = -542993902;

    public static final QEpnCafpDetail epnCafpDetail = new QEpnCafpDetail("EPN_CAFP_DETAIL");

    public final NumberPath<Long> idEpnCafpDetail = createNumber("idEpnCafpDetail", Long.class);

    public final NumberPath<Long> idEpnIdentification = createNumber("idEpnIdentification", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<java.math.BigDecimal> montant = createNumber("montant", java.math.BigDecimal.class);

    public final NumberPath<Integer> numero = createNumber("numero", Integer.class);

    public final StringPath typeEnregistrement = createString("typeEnregistrement");

    public final com.querydsl.sql.PrimaryKey<QEpnCafpDetail> idEpnCafpDetailPk = createPrimaryKey(idEpnCafpDetail);

    public QEpnCafpDetail(String variable) {
        super(QEpnCafpDetail.class, forVariable(variable), "GFC", "EPN_CAFP_DETAIL");
        addMetadata();
    }

    public QEpnCafpDetail(String variable, String schema, String table) {
        super(QEpnCafpDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEpnCafpDetail(Path<? extends QEpnCafpDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EPN_CAFP_DETAIL");
        addMetadata();
    }

    public QEpnCafpDetail(PathMetadata metadata) {
        super(QEpnCafpDetail.class, metadata, "GFC", "EPN_CAFP_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idEpnCafpDetail, ColumnMetadata.named("ID_EPN_CAFP_DETAIL").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idEpnIdentification, ColumnMetadata.named("ID_EPN_IDENTIFICATION").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(montant, ColumnMetadata.named("MONTANT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(numero, ColumnMetadata.named("NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(5).notNull());
        addMetadata(typeEnregistrement, ColumnMetadata.named("TYPE_ENREGISTREMENT").withIndex(3).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


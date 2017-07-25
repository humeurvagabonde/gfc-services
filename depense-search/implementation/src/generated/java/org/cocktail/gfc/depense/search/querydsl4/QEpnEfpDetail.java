package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEpnEfpDetail is a Querydsl query type for QEpnEfpDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEpnEfpDetail extends com.querydsl.sql.RelationalPathBase<QEpnEfpDetail> {

    private static final long serialVersionUID = 1782646791;

    public static final QEpnEfpDetail epnEfpDetail = new QEpnEfpDetail("EPN_EFP_DETAIL");

    public final NumberPath<Long> idEpnEfpDetail = createNumber("idEpnEfpDetail", Long.class);

    public final NumberPath<Long> idEpnIdentification = createNumber("idEpnIdentification", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<java.math.BigDecimal> montant = createNumber("montant", java.math.BigDecimal.class);

    public final NumberPath<Integer> numero = createNumber("numero", Integer.class);

    public final StringPath typeEnregistrement = createString("typeEnregistrement");

    public final com.querydsl.sql.PrimaryKey<QEpnEfpDetail> idEpnEfpDetailPk = createPrimaryKey(idEpnEfpDetail);

    public QEpnEfpDetail(String variable) {
        super(QEpnEfpDetail.class, forVariable(variable), "GFC", "EPN_EFP_DETAIL");
        addMetadata();
    }

    public QEpnEfpDetail(String variable, String schema, String table) {
        super(QEpnEfpDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEpnEfpDetail(Path<? extends QEpnEfpDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EPN_EFP_DETAIL");
        addMetadata();
    }

    public QEpnEfpDetail(PathMetadata metadata) {
        super(QEpnEfpDetail.class, metadata, "GFC", "EPN_EFP_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idEpnEfpDetail, ColumnMetadata.named("ID_EPN_EFP_DETAIL").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idEpnIdentification, ColumnMetadata.named("ID_EPN_IDENTIFICATION").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(montant, ColumnMetadata.named("MONTANT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(numero, ColumnMetadata.named("NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(5).notNull());
        addMetadata(typeEnregistrement, ColumnMetadata.named("TYPE_ENREGISTREMENT").withIndex(3).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


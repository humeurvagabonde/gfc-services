package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEpnBalDetail is a Querydsl query type for QEpnBalDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEpnBalDetail extends com.querydsl.sql.RelationalPathBase<QEpnBalDetail> {

    private static final long serialVersionUID = -764088923;

    public static final QEpnBalDetail epnBalDetail = new QEpnBalDetail("EPN_BAL_DETAIL");

    public final NumberPath<java.math.BigDecimal> bscre = createNumber("bscre", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> bsdeb = createNumber("bsdeb", java.math.BigDecimal.class);

    public final StringPath compte = createString("compte");

    public final NumberPath<java.math.BigDecimal> crebe = createNumber("crebe", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> crecum = createNumber("crecum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> cretot = createNumber("cretot", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> debbe = createNumber("debbe", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> debcum = createNumber("debcum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> debtot = createNumber("debtot", java.math.BigDecimal.class);

    public final NumberPath<Long> idEpnBalDetail = createNumber("idEpnBalDetail", Long.class);

    public final NumberPath<Long> idEpnIdentification = createNumber("idEpnIdentification", Long.class);

    public final NumberPath<Integer> numero = createNumber("numero", Integer.class);

    public final NumberPath<Integer> typeCompte = createNumber("typeCompte", Integer.class);

    public final StringPath typeEnregistrement = createString("typeEnregistrement");

    public final com.querydsl.sql.PrimaryKey<QEpnBalDetail> idEpnBalDetailPk = createPrimaryKey(idEpnBalDetail);

    public QEpnBalDetail(String variable) {
        super(QEpnBalDetail.class, forVariable(variable), "GFC", "EPN_BAL_DETAIL");
        addMetadata();
    }

    public QEpnBalDetail(String variable, String schema, String table) {
        super(QEpnBalDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEpnBalDetail(Path<? extends QEpnBalDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EPN_BAL_DETAIL");
        addMetadata();
    }

    public QEpnBalDetail(PathMetadata metadata) {
        super(QEpnBalDetail.class, metadata, "GFC", "EPN_BAL_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bscre, ColumnMetadata.named("BSCRE").withIndex(14).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(bsdeb, ColumnMetadata.named("BSDEB").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(compte, ColumnMetadata.named("COMPTE").withIndex(6).ofType(Types.VARCHAR).withSize(15).notNull());
        addMetadata(crebe, ColumnMetadata.named("CREBE").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(crecum, ColumnMetadata.named("CRECUM").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(cretot, ColumnMetadata.named("CRETOT").withIndex(12).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(debbe, ColumnMetadata.named("DEBBE").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(debcum, ColumnMetadata.named("DEBCUM").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(debtot, ColumnMetadata.named("DEBTOT").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(idEpnBalDetail, ColumnMetadata.named("ID_EPN_BAL_DETAIL").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idEpnIdentification, ColumnMetadata.named("ID_EPN_IDENTIFICATION").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(numero, ColumnMetadata.named("NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(5).notNull());
        addMetadata(typeCompte, ColumnMetadata.named("TYPE_COMPTE").withIndex(5).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(typeEnregistrement, ColumnMetadata.named("TYPE_ENREGISTREMENT").withIndex(3).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


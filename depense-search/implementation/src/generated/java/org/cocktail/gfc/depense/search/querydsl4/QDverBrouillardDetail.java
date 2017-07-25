package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDverBrouillardDetail is a Querydsl query type for QDverBrouillardDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDverBrouillardDetail extends com.querydsl.sql.RelationalPathBase<QDverBrouillardDetail> {

    private static final long serialVersionUID = -1032469030;

    public static final QDverBrouillardDetail dverBrouillardDetail = new QDverBrouillardDetail("DVER_BROUILLARD_DETAIL");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> idDverBrouillardDetail = createNumber("idDverBrouillardDetail", Long.class);

    public final NumberPath<Long> idDverDemandeVersement = createNumber("idDverDemandeVersement", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<java.math.BigDecimal> montant = createNumber("montant", java.math.BigDecimal.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final StringPath sens = createString("sens");

    public final com.querydsl.sql.PrimaryKey<QDverBrouillardDetail> dverBrodIdBrodPk = createPrimaryKey(idDverBrouillardDetail);

    public QDverBrouillardDetail(String variable) {
        super(QDverBrouillardDetail.class, forVariable(variable), "GFC", "DVER_BROUILLARD_DETAIL");
        addMetadata();
    }

    public QDverBrouillardDetail(String variable, String schema, String table) {
        super(QDverBrouillardDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDverBrouillardDetail(Path<? extends QDverBrouillardDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DVER_BROUILLARD_DETAIL");
        addMetadata();
    }

    public QDverBrouillardDetail(PathMetadata metadata) {
        super(QDverBrouillardDetail.class, metadata, "GFC", "DVER_BROUILLARD_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idDverBrouillardDetail, ColumnMetadata.named("ID_DVER_BROUILLARD_DETAIL").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idDverDemandeVersement, ColumnMetadata.named("ID_DVER_DEMANDE_VERSEMENT").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(7).ofType(Types.VARCHAR).withSize(200));
        addMetadata(montant, ColumnMetadata.named("MONTANT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(sens, ColumnMetadata.named("SENS").withIndex(5).ofType(Types.VARCHAR).withSize(1));
    }

}


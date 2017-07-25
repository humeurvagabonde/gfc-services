package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDverEcritureDetail is a Querydsl query type for QDverEcritureDetail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDverEcritureDetail extends com.querydsl.sql.RelationalPathBase<QDverEcritureDetail> {

    private static final long serialVersionUID = 1434955491;

    public static final QDverEcritureDetail dverEcritureDetail = new QDverEcritureDetail("DVER_ECRITURE_DETAIL");

    public final StringPath dateDverEcd = createString("dateDverEcd");

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<Long> idDverDemandeVersement = createNumber("idDverDemandeVersement", Long.class);

    public final NumberPath<Long> idDverEcritureDetail = createNumber("idDverEcritureDetail", Long.class);

    public final StringPath origine = createString("origine");

    public QDverEcritureDetail(String variable) {
        super(QDverEcritureDetail.class, forVariable(variable), "GFC", "DVER_ECRITURE_DETAIL");
        addMetadata();
    }

    public QDverEcritureDetail(String variable, String schema, String table) {
        super(QDverEcritureDetail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDverEcritureDetail(Path<? extends QDverEcritureDetail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DVER_ECRITURE_DETAIL");
        addMetadata();
    }

    public QDverEcritureDetail(PathMetadata metadata) {
        super(QDverEcritureDetail.class, metadata, "GFC", "DVER_ECRITURE_DETAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateDverEcd, ColumnMetadata.named("DATE_DVER_ECD").withIndex(4).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDverDemandeVersement, ColumnMetadata.named("ID_DVER_DEMANDE_VERSEMENT").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idDverEcritureDetail, ColumnMetadata.named("ID_DVER_ECRITURE_DETAIL").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(origine, ColumnMetadata.named("ORIGINE").withIndex(5).ofType(Types.VARCHAR).withSize(8));
    }

}


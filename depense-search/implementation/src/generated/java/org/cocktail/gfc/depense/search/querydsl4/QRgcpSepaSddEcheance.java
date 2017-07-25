package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRgcpSepaSddEcheance is a Querydsl query type for QRgcpSepaSddEcheance
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRgcpSepaSddEcheance extends com.querydsl.sql.RelationalPathBase<QRgcpSepaSddEcheance> {

    private static final long serialVersionUID = 785458606;

    public static final QRgcpSepaSddEcheance rgcpSepaSddEcheance = new QRgcpSepaSddEcheance("RGCP_SEPA_SDD_ECHEANCE");

    public final NumberPath<Long> idSepaSddEcheanceGfc = createNumber("idSepaSddEcheanceGfc", Long.class);

    public final NumberPath<Long> idSepaSddEcheanceMcj = createNumber("idSepaSddEcheanceMcj", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRgcpSepaSddEcheance> rgcpSepaSddEcheancePk = createPrimaryKey(idSepaSddEcheanceGfc, idSepaSddEcheanceMcj);

    public QRgcpSepaSddEcheance(String variable) {
        super(QRgcpSepaSddEcheance.class, forVariable(variable), "GFC", "RGCP_SEPA_SDD_ECHEANCE");
        addMetadata();
    }

    public QRgcpSepaSddEcheance(String variable, String schema, String table) {
        super(QRgcpSepaSddEcheance.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRgcpSepaSddEcheance(Path<? extends QRgcpSepaSddEcheance> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RGCP_SEPA_SDD_ECHEANCE");
        addMetadata();
    }

    public QRgcpSepaSddEcheance(PathMetadata metadata) {
        super(QRgcpSepaSddEcheance.class, metadata, "GFC", "RGCP_SEPA_SDD_ECHEANCE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idSepaSddEcheanceGfc, ColumnMetadata.named("ID_SEPA_SDD_ECHEANCE_GFC").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddEcheanceMcj, ColumnMetadata.named("ID_SEPA_SDD_ECHEANCE_MCJ").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


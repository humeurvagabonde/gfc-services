package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRgcpSepaSddEcheancier is a Querydsl query type for QRgcpSepaSddEcheancier
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRgcpSepaSddEcheancier extends com.querydsl.sql.RelationalPathBase<QRgcpSepaSddEcheancier> {

    private static final long serialVersionUID = -1088516641;

    public static final QRgcpSepaSddEcheancier rgcpSepaSddEcheancier = new QRgcpSepaSddEcheancier("RGCP_SEPA_SDD_ECHEANCIER");

    public final NumberPath<Long> idSepaSddEcheancierGfc = createNumber("idSepaSddEcheancierGfc", Long.class);

    public final NumberPath<Long> idSepaSddEcheancierMcj = createNumber("idSepaSddEcheancierMcj", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRgcpSepaSddEcheancier> rgcpSepaSddEcheancierPk = createPrimaryKey(idSepaSddEcheancierGfc, idSepaSddEcheancierMcj);

    public QRgcpSepaSddEcheancier(String variable) {
        super(QRgcpSepaSddEcheancier.class, forVariable(variable), "GFC", "RGCP_SEPA_SDD_ECHEANCIER");
        addMetadata();
    }

    public QRgcpSepaSddEcheancier(String variable, String schema, String table) {
        super(QRgcpSepaSddEcheancier.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRgcpSepaSddEcheancier(Path<? extends QRgcpSepaSddEcheancier> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RGCP_SEPA_SDD_ECHEANCIER");
        addMetadata();
    }

    public QRgcpSepaSddEcheancier(PathMetadata metadata) {
        super(QRgcpSepaSddEcheancier.class, metadata, "GFC", "RGCP_SEPA_SDD_ECHEANCIER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idSepaSddEcheancierGfc, ColumnMetadata.named("ID_SEPA_SDD_ECHEANCIER_GFC").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddEcheancierMcj, ColumnMetadata.named("ID_SEPA_SDD_ECHEANCIER_MCJ").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRgcpSepaSddMandat is a Querydsl query type for QRgcpSepaSddMandat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRgcpSepaSddMandat extends com.querydsl.sql.RelationalPathBase<QRgcpSepaSddMandat> {

    private static final long serialVersionUID = 1747732673;

    public static final QRgcpSepaSddMandat rgcpSepaSddMandat = new QRgcpSepaSddMandat("RGCP_SEPA_SDD_MANDAT");

    public final NumberPath<Long> idSepaSddMandatGfc = createNumber("idSepaSddMandatGfc", Long.class);

    public final NumberPath<Long> idSepaSddMandatMcj = createNumber("idSepaSddMandatMcj", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRgcpSepaSddMandat> rgcpSepaSddMandatPk = createPrimaryKey(idSepaSddMandatGfc, idSepaSddMandatMcj);

    public QRgcpSepaSddMandat(String variable) {
        super(QRgcpSepaSddMandat.class, forVariable(variable), "GFC", "RGCP_SEPA_SDD_MANDAT");
        addMetadata();
    }

    public QRgcpSepaSddMandat(String variable, String schema, String table) {
        super(QRgcpSepaSddMandat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRgcpSepaSddMandat(Path<? extends QRgcpSepaSddMandat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RGCP_SEPA_SDD_MANDAT");
        addMetadata();
    }

    public QRgcpSepaSddMandat(PathMetadata metadata) {
        super(QRgcpSepaSddMandat.class, metadata, "GFC", "RGCP_SEPA_SDD_MANDAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idSepaSddMandatGfc, ColumnMetadata.named("ID_SEPA_SDD_MANDAT_GFC").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddMandatMcj, ColumnMetadata.named("ID_SEPA_SDD_MANDAT_MCJ").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


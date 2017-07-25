package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRgcpSepaSddOrigine is a Querydsl query type for QRgcpSepaSddOrigine
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRgcpSepaSddOrigine extends com.querydsl.sql.RelationalPathBase<QRgcpSepaSddOrigine> {

    private static final long serialVersionUID = 602320315;

    public static final QRgcpSepaSddOrigine rgcpSepaSddOrigine = new QRgcpSepaSddOrigine("RGCP_SEPA_SDD_ORIGINE");

    public final NumberPath<Long> idSepaSddOrigineGfc = createNumber("idSepaSddOrigineGfc", Long.class);

    public final NumberPath<Long> idSepaSddOrigineMcj = createNumber("idSepaSddOrigineMcj", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRgcpSepaSddOrigine> rgcpSepaSddOriginePk = createPrimaryKey(idSepaSddOrigineGfc, idSepaSddOrigineMcj);

    public QRgcpSepaSddOrigine(String variable) {
        super(QRgcpSepaSddOrigine.class, forVariable(variable), "GFC", "RGCP_SEPA_SDD_ORIGINE");
        addMetadata();
    }

    public QRgcpSepaSddOrigine(String variable, String schema, String table) {
        super(QRgcpSepaSddOrigine.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRgcpSepaSddOrigine(Path<? extends QRgcpSepaSddOrigine> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RGCP_SEPA_SDD_ORIGINE");
        addMetadata();
    }

    public QRgcpSepaSddOrigine(PathMetadata metadata) {
        super(QRgcpSepaSddOrigine.class, metadata, "GFC", "RGCP_SEPA_SDD_ORIGINE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idSepaSddOrigineGfc, ColumnMetadata.named("ID_SEPA_SDD_ORIGINE_GFC").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddOrigineMcj, ColumnMetadata.named("ID_SEPA_SDD_ORIGINE_MCJ").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


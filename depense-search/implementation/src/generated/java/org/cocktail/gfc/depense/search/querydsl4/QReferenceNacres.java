package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QReferenceNacres is a Querydsl query type for QReferenceNacres
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QReferenceNacres extends com.querydsl.sql.RelationalPathBase<QReferenceNacres> {

    private static final long serialVersionUID = 136975281;

    public static final QReferenceNacres referenceNacres = new QReferenceNacres("REFERENCE_NACRES");

    public final StringPath refnCeType = createString("refnCeType");

    public final StringPath refnCode = createString("refnCode");

    public final NumberPath<Long> refnId = createNumber("refnId", Long.class);

    public final StringPath refnLibelle = createString("refnLibelle");

    public final com.querydsl.sql.PrimaryKey<QReferenceNacres> referenceNacresPk = createPrimaryKey(refnId);

    public QReferenceNacres(String variable) {
        super(QReferenceNacres.class, forVariable(variable), "GFC", "REFERENCE_NACRES");
        addMetadata();
    }

    public QReferenceNacres(String variable, String schema, String table) {
        super(QReferenceNacres.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QReferenceNacres(Path<? extends QReferenceNacres> path) {
        super(path.getType(), path.getMetadata(), "GFC", "REFERENCE_NACRES");
        addMetadata();
    }

    public QReferenceNacres(PathMetadata metadata) {
        super(QReferenceNacres.class, metadata, "GFC", "REFERENCE_NACRES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(refnCeType, ColumnMetadata.named("REFN_CE_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(1));
        addMetadata(refnCode, ColumnMetadata.named("REFN_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(refnId, ColumnMetadata.named("REFN_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(refnLibelle, ColumnMetadata.named("REFN_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(150).notNull());
    }

}


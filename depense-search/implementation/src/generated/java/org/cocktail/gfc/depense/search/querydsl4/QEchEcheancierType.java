package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEchEcheancierType is a Querydsl query type for QEchEcheancierType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEchEcheancierType extends com.querydsl.sql.RelationalPathBase<QEchEcheancierType> {

    private static final long serialVersionUID = -1586726763;

    public static final QEchEcheancierType echEcheancierType = new QEchEcheancierType("ECH_ECHEANCIER_TYPE");

    public final StringPath echtCode = createString("echtCode");

    public final NumberPath<Long> echtId = createNumber("echtId", Long.class);

    public final StringPath echtLibelle = createString("echtLibelle");

    public final com.querydsl.sql.PrimaryKey<QEchEcheancierType> echEcheancierTypePk = createPrimaryKey(echtId);

    public QEchEcheancierType(String variable) {
        super(QEchEcheancierType.class, forVariable(variable), "GFC", "ECH_ECHEANCIER_TYPE");
        addMetadata();
    }

    public QEchEcheancierType(String variable, String schema, String table) {
        super(QEchEcheancierType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEchEcheancierType(Path<? extends QEchEcheancierType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ECH_ECHEANCIER_TYPE");
        addMetadata();
    }

    public QEchEcheancierType(PathMetadata metadata) {
        super(QEchEcheancierType.class, metadata, "GFC", "ECH_ECHEANCIER_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(echtCode, ColumnMetadata.named("ECHT_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(echtId, ColumnMetadata.named("ECHT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(echtLibelle, ColumnMetadata.named("ECHT_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(1000));
    }

}


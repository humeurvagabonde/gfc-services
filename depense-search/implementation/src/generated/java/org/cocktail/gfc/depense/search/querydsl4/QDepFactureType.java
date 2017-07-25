package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepFactureType is a Querydsl query type for QDepFactureType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepFactureType extends com.querydsl.sql.RelationalPathBase<QDepFactureType> {

    private static final long serialVersionUID = -647973999;

    public static final QDepFactureType depFactureType = new QDepFactureType("DEP_FACTURE_TYPE");

    public final StringPath code = createString("code");

    public final StringPath libelle = createString("libelle");

    public final com.querydsl.sql.PrimaryKey<QDepFactureType> codeDepFactureTypePk = createPrimaryKey(code);

    public QDepFactureType(String variable) {
        super(QDepFactureType.class, forVariable(variable), "GFC", "DEP_FACTURE_TYPE");
        addMetadata();
    }

    public QDepFactureType(String variable, String schema, String table) {
        super(QDepFactureType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepFactureType(Path<? extends QDepFactureType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_FACTURE_TYPE");
        addMetadata();
    }

    public QDepFactureType(PathMetadata metadata) {
        super(QDepFactureType.class, metadata, "GFC", "DEP_FACTURE_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(1).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEcritureDetailType is a Querydsl query type for QEcritureDetailType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEcritureDetailType extends com.querydsl.sql.RelationalPathBase<QEcritureDetailType> {

    private static final long serialVersionUID = 2082494110;

    public static final QEcritureDetailType ecritureDetailType = new QEcritureDetailType("ECRITURE_DETAIL_TYPE");

    public final StringPath code = createString("code");

    public final StringPath libelle = createString("libelle");

    public final com.querydsl.sql.PrimaryKey<QEcritureDetailType> ecritureDetailTypePk = createPrimaryKey(code);

    public QEcritureDetailType(String variable) {
        super(QEcritureDetailType.class, forVariable(variable), "GFC", "ECRITURE_DETAIL_TYPE");
        addMetadata();
    }

    public QEcritureDetailType(String variable, String schema, String table) {
        super(QEcritureDetailType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEcritureDetailType(Path<? extends QEcritureDetailType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ECRITURE_DETAIL_TYPE");
        addMetadata();
    }

    public QEcritureDetailType(PathMetadata metadata) {
        super(QEcritureDetailType.class, metadata, "GFC", "ECRITURE_DETAIL_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(1).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


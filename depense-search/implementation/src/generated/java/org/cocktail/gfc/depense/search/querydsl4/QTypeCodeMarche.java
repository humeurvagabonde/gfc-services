package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeCodeMarche is a Querydsl query type for QTypeCodeMarche
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeCodeMarche extends com.querydsl.sql.RelationalPathBase<QTypeCodeMarche> {

    private static final long serialVersionUID = -402618381;

    public static final QTypeCodeMarche typeCodeMarche = new QTypeCodeMarche("TYPE_CODE_MARCHE");

    public final StringPath tcmCode = createString("tcmCode");

    public final NumberPath<Long> tcmId = createNumber("tcmId", Long.class);

    public final StringPath tcmLibelle = createString("tcmLibelle");

    public final com.querydsl.sql.PrimaryKey<QTypeCodeMarche> typeCodeMarchePk = createPrimaryKey(tcmId);

    public QTypeCodeMarche(String variable) {
        super(QTypeCodeMarche.class, forVariable(variable), "GFC", "TYPE_CODE_MARCHE");
        addMetadata();
    }

    public QTypeCodeMarche(String variable, String schema, String table) {
        super(QTypeCodeMarche.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeCodeMarche(Path<? extends QTypeCodeMarche> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_CODE_MARCHE");
        addMetadata();
    }

    public QTypeCodeMarche(PathMetadata metadata) {
        super(QTypeCodeMarche.class, metadata, "GFC", "TYPE_CODE_MARCHE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tcmCode, ColumnMetadata.named("TCM_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(tcmId, ColumnMetadata.named("TCM_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tcmLibelle, ColumnMetadata.named("TCM_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(25).notNull());
    }

}


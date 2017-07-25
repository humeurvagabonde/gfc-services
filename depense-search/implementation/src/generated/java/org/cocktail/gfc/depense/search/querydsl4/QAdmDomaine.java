package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmDomaine is a Querydsl query type for QAdmDomaine
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmDomaine extends com.querydsl.sql.RelationalPathBase<QAdmDomaine> {

    private static final long serialVersionUID = -1050241183;

    public static final QAdmDomaine admDomaine = new QAdmDomaine("ADM_DOMAINE");

    public final NumberPath<Long> domId = createNumber("domId", Long.class);

    public final StringPath domLibelle = createString("domLibelle");

    public final com.querydsl.sql.PrimaryKey<QAdmDomaine> domainePk = createPrimaryKey(domId);

    public QAdmDomaine(String variable) {
        super(QAdmDomaine.class, forVariable(variable), "GFC", "ADM_DOMAINE");
        addMetadata();
    }

    public QAdmDomaine(String variable, String schema, String table) {
        super(QAdmDomaine.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmDomaine(Path<? extends QAdmDomaine> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_DOMAINE");
        addMetadata();
    }

    public QAdmDomaine(PathMetadata metadata) {
        super(QAdmDomaine.class, metadata, "GFC", "ADM_DOMAINE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(domId, ColumnMetadata.named("DOM_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(domLibelle, ColumnMetadata.named("DOM_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmTypeEtat is a Querydsl query type for QAdmTypeEtat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmTypeEtat extends com.querydsl.sql.RelationalPathBase<QAdmTypeEtat> {

    private static final long serialVersionUID = -3926980;

    public static final QAdmTypeEtat admTypeEtat = new QAdmTypeEtat("ADM_TYPE_ETAT");

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final StringPath tyetLibelle = createString("tyetLibelle");

    public final com.querydsl.sql.PrimaryKey<QAdmTypeEtat> typeEtatPk = createPrimaryKey(tyetId);

    public QAdmTypeEtat(String variable) {
        super(QAdmTypeEtat.class, forVariable(variable), "GFC", "ADM_TYPE_ETAT");
        addMetadata();
    }

    public QAdmTypeEtat(String variable, String schema, String table) {
        super(QAdmTypeEtat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmTypeEtat(Path<? extends QAdmTypeEtat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_TYPE_ETAT");
        addMetadata();
    }

    public QAdmTypeEtat(PathMetadata metadata) {
        super(QAdmTypeEtat.class, metadata, "GFC", "ADM_TYPE_ETAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tyetLibelle, ColumnMetadata.named("TYET_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmPersjurPersonne is a Querydsl query type for QAdmPersjurPersonne
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmPersjurPersonne extends com.querydsl.sql.RelationalPathBase<QAdmPersjurPersonne> {

    private static final long serialVersionUID = 102661117;

    public static final QAdmPersjurPersonne admPersjurPersonne = new QAdmPersjurPersonne("ADM_PERSJUR_PERSONNE");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> pjId = createNumber("pjId", Long.class);

    public final DateTimePath<java.sql.Timestamp> prpDateDebut = createDateTime("prpDateDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> prpDateFin = createDateTime("prpDateFin", java.sql.Timestamp.class);

    public final NumberPath<Long> prpId = createNumber("prpId", Long.class);

    public final StringPath prpLibelle = createString("prpLibelle");

    public final com.querydsl.sql.PrimaryKey<QAdmPersjurPersonne> persjurPersonnePk = createPrimaryKey(prpId);

    public QAdmPersjurPersonne(String variable) {
        super(QAdmPersjurPersonne.class, forVariable(variable), "GFC", "ADM_PERSJUR_PERSONNE");
        addMetadata();
    }

    public QAdmPersjurPersonne(String variable, String schema, String table) {
        super(QAdmPersjurPersonne.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmPersjurPersonne(Path<? extends QAdmPersjurPersonne> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_PERSJUR_PERSONNE");
        addMetadata();
    }

    public QAdmPersjurPersonne(PathMetadata metadata) {
        super(QAdmPersjurPersonne.class, metadata, "GFC", "ADM_PERSJUR_PERSONNE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pjId, ColumnMetadata.named("PJ_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prpDateDebut, ColumnMetadata.named("PRP_DATE_DEBUT").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(prpDateFin, ColumnMetadata.named("PRP_DATE_FIN").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(prpId, ColumnMetadata.named("PRP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prpLibelle, ColumnMetadata.named("PRP_LIBELLE").withIndex(6).ofType(Types.VARCHAR).withSize(50));
    }

}


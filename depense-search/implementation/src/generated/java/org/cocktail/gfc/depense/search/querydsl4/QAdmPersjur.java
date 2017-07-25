package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmPersjur is a Querydsl query type for QAdmPersjur
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmPersjur extends com.querydsl.sql.RelationalPathBase<QAdmPersjur> {

    private static final long serialVersionUID = 728731921;

    public static final QAdmPersjur admPersjur = new QAdmPersjur("ADM_PERSJUR");

    public final StringPath pjCommentaire = createString("pjCommentaire");

    public final DateTimePath<java.sql.Timestamp> pjDateDebut = createDateTime("pjDateDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> pjDateFin = createDateTime("pjDateFin", java.sql.Timestamp.class);

    public final NumberPath<Long> pjId = createNumber("pjId", Long.class);

    public final StringPath pjLibelle = createString("pjLibelle");

    public final NumberPath<Long> pjNiveau = createNumber("pjNiveau", Long.class);

    public final NumberPath<Long> pjPere = createNumber("pjPere", Long.class);

    public final NumberPath<Long> tpjId = createNumber("tpjId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmPersjur> persjurPk = createPrimaryKey(pjId);

    public QAdmPersjur(String variable) {
        super(QAdmPersjur.class, forVariable(variable), "GFC", "ADM_PERSJUR");
        addMetadata();
    }

    public QAdmPersjur(String variable, String schema, String table) {
        super(QAdmPersjur.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmPersjur(Path<? extends QAdmPersjur> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_PERSJUR");
        addMetadata();
    }

    public QAdmPersjur(PathMetadata metadata) {
        super(QAdmPersjur.class, metadata, "GFC", "ADM_PERSJUR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pjCommentaire, ColumnMetadata.named("PJ_COMMENTAIRE").withIndex(7).ofType(Types.VARCHAR).withSize(500));
        addMetadata(pjDateDebut, ColumnMetadata.named("PJ_DATE_DEBUT").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(pjDateFin, ColumnMetadata.named("PJ_DATE_FIN").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(pjId, ColumnMetadata.named("PJ_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pjLibelle, ColumnMetadata.named("PJ_LIBELLE").withIndex(6).ofType(Types.VARCHAR).withSize(50));
        addMetadata(pjNiveau, ColumnMetadata.named("PJ_NIVEAU").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pjPere, ColumnMetadata.named("PJ_PERE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tpjId, ColumnMetadata.named("TPJ_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


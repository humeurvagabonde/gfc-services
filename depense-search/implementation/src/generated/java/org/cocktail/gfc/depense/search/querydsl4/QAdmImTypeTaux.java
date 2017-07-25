package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmImTypeTaux is a Querydsl query type for QAdmImTypeTaux
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmImTypeTaux extends com.querydsl.sql.RelationalPathBase<QAdmImTypeTaux> {

    private static final long serialVersionUID = -1164607954;

    public static final QAdmImTypeTaux admImTypeTaux = new QAdmImTypeTaux("ADM_IM_TYPE_TAUX");

    public final StringPath imttCode = createString("imttCode");

    public final DateTimePath<java.sql.Timestamp> imttDebut = createDateTime("imttDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> imttFin = createDateTime("imttFin", java.sql.Timestamp.class);

    public final NumberPath<Long> imttId = createNumber("imttId", Long.class);

    public final StringPath imttLibelle = createString("imttLibelle");

    public final NumberPath<Integer> imttPriorite = createNumber("imttPriorite", Integer.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmImTypeTaux> sysC0024150 = createPrimaryKey(imttId);

    public QAdmImTypeTaux(String variable) {
        super(QAdmImTypeTaux.class, forVariable(variable), "GFC", "ADM_IM_TYPE_TAUX");
        addMetadata();
    }

    public QAdmImTypeTaux(String variable, String schema, String table) {
        super(QAdmImTypeTaux.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmImTypeTaux(Path<? extends QAdmImTypeTaux> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_IM_TYPE_TAUX");
        addMetadata();
    }

    public QAdmImTypeTaux(PathMetadata metadata) {
        super(QAdmImTypeTaux.class, metadata, "GFC", "ADM_IM_TYPE_TAUX");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(imttCode, ColumnMetadata.named("IMTT_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(imttDebut, ColumnMetadata.named("IMTT_DEBUT").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(imttFin, ColumnMetadata.named("IMTT_FIN").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(imttId, ColumnMetadata.named("IMTT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(imttLibelle, ColumnMetadata.named("IMTT_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(250).notNull());
        addMetadata(imttPriorite, ColumnMetadata.named("IMTT_PRIORITE").withIndex(6).ofType(Types.DECIMAL).withSize(3).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(7).ofType(Types.DECIMAL).withSize(10).notNull());
    }

}


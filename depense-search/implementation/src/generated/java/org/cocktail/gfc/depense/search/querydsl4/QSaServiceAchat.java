package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSaServiceAchat is a Querydsl query type for QSaServiceAchat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSaServiceAchat extends com.querydsl.sql.RelationalPathBase<QSaServiceAchat> {

    private static final long serialVersionUID = 1993948476;

    public static final QSaServiceAchat saServiceAchat = new QSaServiceAchat("SA_SERVICE_ACHAT");

    public final StringPath cStructure = createString("cStructure");

    public final NumberPath<Long> svacId = createNumber("svacId", Long.class);

    public final StringPath svacInfos = createString("svacInfos");

    public final StringPath svacLibelle = createString("svacLibelle");

    public final StringPath svacType = createString("svacType");

    public final com.querydsl.sql.PrimaryKey<QSaServiceAchat> saServiceAchatPk = createPrimaryKey(svacId);

    public QSaServiceAchat(String variable) {
        super(QSaServiceAchat.class, forVariable(variable), "GFC", "SA_SERVICE_ACHAT");
        addMetadata();
    }

    public QSaServiceAchat(String variable, String schema, String table) {
        super(QSaServiceAchat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSaServiceAchat(Path<? extends QSaServiceAchat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SA_SERVICE_ACHAT");
        addMetadata();
    }

    public QSaServiceAchat(PathMetadata metadata) {
        super(QSaServiceAchat.class, metadata, "GFC", "SA_SERVICE_ACHAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cStructure, ColumnMetadata.named("C_STRUCTURE").withIndex(2).ofType(Types.VARCHAR).withSize(10));
        addMetadata(svacId, ColumnMetadata.named("SVAC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(svacInfos, ColumnMetadata.named("SVAC_INFOS").withIndex(3).ofType(Types.VARCHAR).withSize(100));
        addMetadata(svacLibelle, ColumnMetadata.named("SVAC_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(25).notNull());
        addMetadata(svacType, ColumnMetadata.named("SVAC_TYPE").withIndex(5).ofType(Types.VARCHAR).withSize(25));
    }

}


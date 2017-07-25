package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QImSuspension is a Querydsl query type for QImSuspension
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QImSuspension extends com.querydsl.sql.RelationalPathBase<QImSuspension> {

    private static final long serialVersionUID = 1387075819;

    public static final QImSuspension imSuspension = new QImSuspension("IM_SUSPENSION");

    public final DateTimePath<java.sql.Timestamp> dateCreation = createDateTime("dateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModification = createDateTime("dateModification", java.sql.Timestamp.class);

    public final NumberPath<Long> dppId = createNumber("dppId", Long.class);

    public final StringPath imsusCommentaire = createString("imsusCommentaire");

    public final DateTimePath<java.sql.Timestamp> imsusDebut = createDateTime("imsusDebut", java.sql.Timestamp.class);

    public final NumberPath<Long> imsusEtat = createNumber("imsusEtat", Long.class);

    public final DateTimePath<java.sql.Timestamp> imsusFin = createDateTime("imsusFin", java.sql.Timestamp.class);

    public final NumberPath<Long> imsusId = createNumber("imsusId", Long.class);

    public final StringPath imsusType = createString("imsusType");

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QImSuspension> imSuspensionPk = createPrimaryKey(imsusId);

    public QImSuspension(String variable) {
        super(QImSuspension.class, forVariable(variable), "GFC", "IM_SUSPENSION");
        addMetadata();
    }

    public QImSuspension(String variable, String schema, String table) {
        super(QImSuspension.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QImSuspension(Path<? extends QImSuspension> path) {
        super(path.getType(), path.getMetadata(), "GFC", "IM_SUSPENSION");
        addMetadata();
    }

    public QImSuspension(PathMetadata metadata) {
        super(QImSuspension.class, metadata, "GFC", "IM_SUSPENSION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(8).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dateModification, ColumnMetadata.named("DATE_MODIFICATION").withIndex(9).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dppId, ColumnMetadata.named("DPP_ID").withIndex(10).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(imsusCommentaire, ColumnMetadata.named("IMSUS_COMMENTAIRE").withIndex(5).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(imsusDebut, ColumnMetadata.named("IMSUS_DEBUT").withIndex(3).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(imsusEtat, ColumnMetadata.named("IMSUS_ETAT").withIndex(6).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(imsusFin, ColumnMetadata.named("IMSUS_FIN").withIndex(4).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(imsusId, ColumnMetadata.named("IMSUS_ID").withIndex(1).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(imsusType, ColumnMetadata.named("IMSUS_TYPE").withIndex(2).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(10).notNull());
    }

}


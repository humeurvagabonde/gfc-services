package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmImDgp is a Querydsl query type for QAdmImDgp
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmImDgp extends com.querydsl.sql.RelationalPathBase<QAdmImDgp> {

    private static final long serialVersionUID = 2050351049;

    public static final QAdmImDgp admImDgp = new QAdmImDgp("ADM_IM_DGP");

    public final DateTimePath<java.sql.Timestamp> dateCreation = createDateTime("dateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModification = createDateTime("dateModification", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> imdgDebut = createDateTime("imdgDebut", java.sql.Timestamp.class);

    public final NumberPath<Long> imdgDgp = createNumber("imdgDgp", Long.class);

    public final DateTimePath<java.sql.Timestamp> imdgFin = createDateTime("imdgFin", java.sql.Timestamp.class);

    public final NumberPath<Long> imdgId = createNumber("imdgId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmImDgp> sysC0022553 = createPrimaryKey(imdgId);

    public QAdmImDgp(String variable) {
        super(QAdmImDgp.class, forVariable(variable), "GFC", "ADM_IM_DGP");
        addMetadata();
    }

    public QAdmImDgp(String variable, String schema, String table) {
        super(QAdmImDgp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmImDgp(Path<? extends QAdmImDgp> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_IM_DGP");
        addMetadata();
    }

    public QAdmImDgp(PathMetadata metadata) {
        super(QAdmImDgp.class, metadata, "GFC", "ADM_IM_DGP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(6).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dateModification, ColumnMetadata.named("DATE_MODIFICATION").withIndex(7).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(imdgDebut, ColumnMetadata.named("IMDG_DEBUT").withIndex(2).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(imdgDgp, ColumnMetadata.named("IMDG_DGP").withIndex(4).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(imdgFin, ColumnMetadata.named("IMDG_FIN").withIndex(3).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(imdgId, ColumnMetadata.named("IMDG_ID").withIndex(1).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(10).notNull());
    }

}


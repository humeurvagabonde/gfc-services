package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMapaCe is a Querydsl query type for QMapaCe
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMapaCe extends com.querydsl.sql.RelationalPathBase<QMapaCe> {

    private static final long serialVersionUID = -1382113775;

    public static final QMapaCe mapaCe = new QMapaCe("MAPA_CE");

    public final NumberPath<Long> ceOrdre = createNumber("ceOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> dateModification = createDateTime("dateModification", java.sql.Timestamp.class);

    public final NumberPath<Long> mcId = createNumber("mcId", Long.class);

    public final StringPath mcSupp = createString("mcSupp");

    public final NumberPath<Long> mteId = createNumber("mteId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QMapaCe> mapaCePk = createPrimaryKey(mcId);

    public QMapaCe(String variable) {
        super(QMapaCe.class, forVariable(variable), "GFC", "MAPA_CE");
        addMetadata();
    }

    public QMapaCe(String variable, String schema, String table) {
        super(QMapaCe.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMapaCe(Path<? extends QMapaCe> path) {
        super(path.getType(), path.getMetadata(), "GFC", "MAPA_CE");
        addMetadata();
    }

    public QMapaCe(PathMetadata metadata) {
        super(QMapaCe.class, metadata, "GFC", "MAPA_CE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ceOrdre, ColumnMetadata.named("CE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(dateModification, ColumnMetadata.named("DATE_MODIFICATION").withIndex(4).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(mcId, ColumnMetadata.named("MC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(mcSupp, ColumnMetadata.named("MC_SUPP").withIndex(6).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(mteId, ColumnMetadata.named("MTE_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0));
    }

}


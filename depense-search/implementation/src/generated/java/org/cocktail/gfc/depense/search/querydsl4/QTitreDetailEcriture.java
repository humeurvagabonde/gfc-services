package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTitreDetailEcriture is a Querydsl query type for QTitreDetailEcriture
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTitreDetailEcriture extends com.querydsl.sql.RelationalPathBase<QTitreDetailEcriture> {

    private static final long serialVersionUID = -1786795934;

    public static final QTitreDetailEcriture titreDetailEcriture = new QTitreDetailEcriture("TITRE_DETAIL_ECRITURE");

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> oriOrdre = createNumber("oriOrdre", Long.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final DateTimePath<java.sql.Timestamp> tdeDate = createDateTime("tdeDate", java.sql.Timestamp.class);

    public final NumberPath<Long> tdeOrdre = createNumber("tdeOrdre", Long.class);

    public final StringPath tdeOrigine = createString("tdeOrigine");

    public final NumberPath<Long> titId = createNumber("titId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTitreDetailEcriture> titreDetailEcriturePk = createPrimaryKey(tdeOrdre);

    public QTitreDetailEcriture(String variable) {
        super(QTitreDetailEcriture.class, forVariable(variable), "GFC", "TITRE_DETAIL_ECRITURE");
        addMetadata();
    }

    public QTitreDetailEcriture(String variable, String schema, String table) {
        super(QTitreDetailEcriture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTitreDetailEcriture(Path<? extends QTitreDetailEcriture> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TITRE_DETAIL_ECRITURE");
        addMetadata();
    }

    public QTitreDetailEcriture(PathMetadata metadata) {
        super(QTitreDetailEcriture.class, metadata, "GFC", "TITRE_DETAIL_ECRITURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(oriOrdre, ColumnMetadata.named("ORI_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tdeDate, ColumnMetadata.named("TDE_DATE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(tdeOrdre, ColumnMetadata.named("TDE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tdeOrigine, ColumnMetadata.named("TDE_ORIGINE").withIndex(6).ofType(Types.VARCHAR).withSize(30));
        addMetadata(titId, ColumnMetadata.named("TIT_ID").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


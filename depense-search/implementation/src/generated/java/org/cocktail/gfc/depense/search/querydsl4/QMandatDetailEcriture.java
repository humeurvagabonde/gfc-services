package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMandatDetailEcriture is a Querydsl query type for QMandatDetailEcriture
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMandatDetailEcriture extends com.querydsl.sql.RelationalPathBase<QMandatDetailEcriture> {

    private static final long serialVersionUID = -65938207;

    public static final QMandatDetailEcriture mandatDetailEcriture = new QMandatDetailEcriture("MANDAT_DETAIL_ECRITURE");

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> manId = createNumber("manId", Long.class);

    public final DateTimePath<java.sql.Timestamp> mdeDate = createDateTime("mdeDate", java.sql.Timestamp.class);

    public final NumberPath<Long> mdeOrdre = createNumber("mdeOrdre", Long.class);

    public final StringPath mdeOrigine = createString("mdeOrigine");

    public final NumberPath<Long> oriOrdre = createNumber("oriOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QMandatDetailEcriture> mandatDetailEcriturePk = createPrimaryKey(mdeOrdre);

    public QMandatDetailEcriture(String variable) {
        super(QMandatDetailEcriture.class, forVariable(variable), "GFC", "MANDAT_DETAIL_ECRITURE");
        addMetadata();
    }

    public QMandatDetailEcriture(String variable, String schema, String table) {
        super(QMandatDetailEcriture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMandatDetailEcriture(Path<? extends QMandatDetailEcriture> path) {
        super(path.getType(), path.getMetadata(), "GFC", "MANDAT_DETAIL_ECRITURE");
        addMetadata();
    }

    public QMandatDetailEcriture(PathMetadata metadata) {
        super(QMandatDetailEcriture.class, metadata, "GFC", "MANDAT_DETAIL_ECRITURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4));
        addMetadata(manId, ColumnMetadata.named("MAN_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(mdeDate, ColumnMetadata.named("MDE_DATE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(mdeOrdre, ColumnMetadata.named("MDE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(mdeOrigine, ColumnMetadata.named("MDE_ORIGINE").withIndex(6).ofType(Types.VARCHAR).withSize(30));
        addMetadata(oriOrdre, ColumnMetadata.named("ORI_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(0));
    }

}


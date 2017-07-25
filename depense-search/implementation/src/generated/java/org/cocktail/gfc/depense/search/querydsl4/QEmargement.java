package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEmargement is a Querydsl query type for QEmargement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEmargement extends com.querydsl.sql.RelationalPathBase<QEmargement> {

    private static final long serialVersionUID = 1571992223;

    public static final QEmargement emargement = new QEmargement("EMARGEMENT");

    public final NumberPath<Long> comOrdre = createNumber("comOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> emaDate = createDateTime("emaDate", java.sql.Timestamp.class);

    public final StringPath emaEtat = createString("emaEtat");

    public final NumberPath<java.math.BigDecimal> emaMontant = createNumber("emaMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> emaNumero = createNumber("emaNumero", Long.class);

    public final NumberPath<Long> emaOrdre = createNumber("emaOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> temOrdre = createNumber("temOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QEmargement> emargementPk = createPrimaryKey(emaOrdre);

    public QEmargement(String variable) {
        super(QEmargement.class, forVariable(variable), "GFC", "EMARGEMENT");
        addMetadata();
    }

    public QEmargement(String variable, String schema, String table) {
        super(QEmargement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEmargement(Path<? extends QEmargement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EMARGEMENT");
        addMetadata();
    }

    public QEmargement(PathMetadata metadata) {
        super(QEmargement.class, metadata, "GFC", "EMARGEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(comOrdre, ColumnMetadata.named("COM_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(emaDate, ColumnMetadata.named("EMA_DATE").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(emaEtat, ColumnMetadata.named("EMA_ETAT").withIndex(9).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(emaMontant, ColumnMetadata.named("EMA_MONTANT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(emaNumero, ColumnMetadata.named("EMA_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(emaOrdre, ColumnMetadata.named("EMA_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(temOrdre, ColumnMetadata.named("TEM_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


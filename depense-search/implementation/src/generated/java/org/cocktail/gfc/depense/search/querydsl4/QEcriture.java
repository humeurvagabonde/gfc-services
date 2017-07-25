package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEcriture is a Querydsl query type for QEcriture
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEcriture extends com.querydsl.sql.RelationalPathBase<QEcriture> {

    private static final long serialVersionUID = -282891501;

    public static final QEcriture ecriture = new QEcriture("ECRITURE");

    public final NumberPath<Long> broOrdre = createNumber("broOrdre", Long.class);

    public final NumberPath<Long> comOrdre = createNumber("comOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> ecrDate = createDateTime("ecrDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> ecrDateSaisie = createDateTime("ecrDateSaisie", java.sql.Timestamp.class);

    public final StringPath ecrEtat = createString("ecrEtat");

    public final StringPath ecrLibelle = createString("ecrLibelle");

    public final NumberPath<Long> ecrNumero = createNumber("ecrNumero", Long.class);

    public final NumberPath<Long> ecrNumeroBrouillard = createNumber("ecrNumeroBrouillard", Long.class);

    public final NumberPath<Long> ecrOrdre = createNumber("ecrOrdre", Long.class);

    public final StringPath ecrPostit = createString("ecrPostit");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idCptEvent = createNumber("idCptEvent", Long.class);

    public final NumberPath<Long> oriOrdre = createNumber("oriOrdre", Long.class);

    public final NumberPath<Long> tjoOrdre = createNumber("tjoOrdre", Long.class);

    public final NumberPath<Long> topOrdre = createNumber("topOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QEcriture> ecriturePk = createPrimaryKey(ecrOrdre);

    public QEcriture(String variable) {
        super(QEcriture.class, forVariable(variable), "GFC", "ECRITURE");
        addMetadata();
    }

    public QEcriture(String variable, String schema, String table) {
        super(QEcriture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEcriture(Path<? extends QEcriture> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ECRITURE");
        addMetadata();
    }

    public QEcriture(PathMetadata metadata) {
        super(QEcriture.class, metadata, "GFC", "ECRITURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(broOrdre, ColumnMetadata.named("BRO_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(comOrdre, ColumnMetadata.named("COM_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ecrDate, ColumnMetadata.named("ECR_DATE").withIndex(6).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(ecrDateSaisie, ColumnMetadata.named("ECR_DATE_SAISIE").withIndex(7).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(ecrEtat, ColumnMetadata.named("ECR_ETAT").withIndex(8).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(ecrLibelle, ColumnMetadata.named("ECR_LIBELLE").withIndex(9).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(ecrNumero, ColumnMetadata.named("ECR_NUMERO").withIndex(3).ofType(Types.DECIMAL).withSize(32));
        addMetadata(ecrNumeroBrouillard, ColumnMetadata.named("ECR_NUMERO_BROUILLARD").withIndex(10).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ecrOrdre, ColumnMetadata.named("ECR_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ecrPostit, ColumnMetadata.named("ECR_POSTIT").withIndex(11).ofType(Types.VARCHAR).withSize(200));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idCptEvent, ColumnMetadata.named("ID_CPT_EVENT").withIndex(16).ofType(Types.DECIMAL).withSize(38));
        addMetadata(oriOrdre, ColumnMetadata.named("ORI_ORDRE").withIndex(12).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tjoOrdre, ColumnMetadata.named("TJO_ORDRE").withIndex(13).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(topOrdre, ColumnMetadata.named("TOP_ORDRE").withIndex(14).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(15).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


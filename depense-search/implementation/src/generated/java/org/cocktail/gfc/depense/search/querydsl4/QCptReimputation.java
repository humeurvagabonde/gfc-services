package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptReimputation is a Querydsl query type for QCptReimputation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptReimputation extends com.querydsl.sql.RelationalPathBase<QCptReimputation> {

    private static final long serialVersionUID = 1959302938;

    public static final QCptReimputation cptReimputation = new QCptReimputation("CPT_REIMPUTATION");

    public final NumberPath<Long> ecrOrdre = createNumber("ecrOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> manId = createNumber("manId", Long.class);

    public final StringPath pcoNumAncien = createString("pcoNumAncien");

    public final StringPath pcoNumNouveau = createString("pcoNumNouveau");

    public final DateTimePath<java.sql.Timestamp> reiDate = createDateTime("reiDate", java.sql.Timestamp.class);

    public final StringPath reiLibelle = createString("reiLibelle");

    public final NumberPath<Long> reiNumero = createNumber("reiNumero", Long.class);

    public final NumberPath<Long> reiOrdre = createNumber("reiOrdre", Long.class);

    public final NumberPath<Long> titId = createNumber("titId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCptReimputation> cptReimputationPk = createPrimaryKey(reiOrdre);

    public QCptReimputation(String variable) {
        super(QCptReimputation.class, forVariable(variable), "GFC", "CPT_REIMPUTATION");
        addMetadata();
    }

    public QCptReimputation(String variable, String schema, String table) {
        super(QCptReimputation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptReimputation(Path<? extends QCptReimputation> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_REIMPUTATION");
        addMetadata();
    }

    public QCptReimputation(PathMetadata metadata) {
        super(QCptReimputation.class, metadata, "GFC", "CPT_REIMPUTATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecrOrdre, ColumnMetadata.named("ECR_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(manId, ColumnMetadata.named("MAN_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(pcoNumAncien, ColumnMetadata.named("PCO_NUM_ANCIEN").withIndex(5).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(pcoNumNouveau, ColumnMetadata.named("PCO_NUM_NOUVEAU").withIndex(6).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(reiDate, ColumnMetadata.named("REI_DATE").withIndex(7).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(reiLibelle, ColumnMetadata.named("REI_LIBELLE").withIndex(8).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(reiNumero, ColumnMetadata.named("REI_NUMERO").withIndex(11).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(reiOrdre, ColumnMetadata.named("REI_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(titId, ColumnMetadata.named("TIT_ID").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(10).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


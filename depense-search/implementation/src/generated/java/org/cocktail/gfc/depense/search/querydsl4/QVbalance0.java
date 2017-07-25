package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVbalance0 is a Querydsl query type for QVbalance0
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVbalance0 extends com.querydsl.sql.RelationalPathBase<QVbalance0> {

    private static final long serialVersionUID = -424042816;

    public static final QVbalance0 vbalance0 = new QVbalance0("VBALANCE0");

    public final NumberPath<Long> beCr = createNumber("beCr", Long.class);

    public final NumberPath<Long> beDb = createNumber("beDb", Long.class);

    public final StringPath ecrSacd = createString("ecrSacd");

    public final NumberPath<Integer> exeExercice = createNumber("exeExercice", Integer.class);

    public final StringPath gestion = createString("gestion");

    public final StringPath imputation = createString("imputation");

    public final DateTimePath<java.sql.Timestamp> jouDate = createDateTime("jouDate", java.sql.Timestamp.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<Long> montantCr = createNumber("montantCr", Long.class);

    public final NumberPath<Long> montantDb = createNumber("montantDb", Long.class);

    public QVbalance0(String variable) {
        super(QVbalance0.class, forVariable(variable), "GFC", "VBALANCE0");
        addMetadata();
    }

    public QVbalance0(String variable, String schema, String table) {
        super(QVbalance0.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVbalance0(Path<? extends QVbalance0> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VBALANCE0");
        addMetadata();
    }

    public QVbalance0(PathMetadata metadata) {
        super(QVbalance0.class, metadata, "GFC", "VBALANCE0");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(beCr, ColumnMetadata.named("BE_CR").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(beDb, ColumnMetadata.named("BE_DB").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ecrSacd, ColumnMetadata.named("ECR_SACD").withIndex(6).ofType(Types.VARCHAR).withSize(1));
        addMetadata(exeExercice, ColumnMetadata.named("EXE_EXERCICE").withIndex(1).ofType(Types.DECIMAL).withSize(4));
        addMetadata(gestion, ColumnMetadata.named("GESTION").withIndex(4).ofType(Types.VARCHAR).withSize(10));
        addMetadata(imputation, ColumnMetadata.named("IMPUTATION").withIndex(3).ofType(Types.VARCHAR).withSize(20));
        addMetadata(jouDate, ColumnMetadata.named("JOU_DATE").withIndex(2).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(montantCr, ColumnMetadata.named("MONTANT_CR").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(montantDb, ColumnMetadata.named("MONTANT_DB").withIndex(10).ofType(Types.DECIMAL).withSize(0));
    }

}


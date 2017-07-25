package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVEcdEmargement is a Querydsl query type for QVEcdEmargement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVEcdEmargement extends com.querydsl.sql.RelationalPathBase<QVEcdEmargement> {

    private static final long serialVersionUID = -1528803089;

    public static final QVEcdEmargement vEcdEmargement = new QVEcdEmargement("V_ECD_EMARGEMENT");

    public final NumberPath<Long> ecdIndex = createNumber("ecdIndex", Long.class);

    public final StringPath ecdLibelle = createString("ecdLibelle");

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<Long> ecdOrdre2 = createNumber("ecdOrdre2", Long.class);

    public final NumberPath<Long> ecrNumero = createNumber("ecrNumero", Long.class);

    public final DateTimePath<java.sql.Timestamp> emaDate = createDateTime("emaDate", java.sql.Timestamp.class);

    public final NumberPath<Long> emaNumero = createNumber("emaNumero", Long.class);

    public final NumberPath<java.math.BigDecimal> emdMontant = createNumber("emdMontant", java.math.BigDecimal.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public QVEcdEmargement(String variable) {
        super(QVEcdEmargement.class, forVariable(variable), "GFC", "V_ECD_EMARGEMENT");
        addMetadata();
    }

    public QVEcdEmargement(String variable, String schema, String table) {
        super(QVEcdEmargement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVEcdEmargement(Path<? extends QVEcdEmargement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ECD_EMARGEMENT");
        addMetadata();
    }

    public QVEcdEmargement(PathMetadata metadata) {
        super(QVEcdEmargement.class, metadata, "GFC", "V_ECD_EMARGEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdIndex, ColumnMetadata.named("ECD_INDEX").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ecdLibelle, ColumnMetadata.named("ECD_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500));
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ecdOrdre2, ColumnMetadata.named("ECD_ORDRE2").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ecrNumero, ColumnMetadata.named("ECR_NUMERO").withIndex(9).ofType(Types.DECIMAL).withSize(32));
        addMetadata(emaDate, ColumnMetadata.named("EMA_DATE").withIndex(7).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(emaNumero, ColumnMetadata.named("EMA_NUMERO").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(emdMontant, ColumnMetadata.named("EMD_MONTANT").withIndex(8).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4));
    }

}


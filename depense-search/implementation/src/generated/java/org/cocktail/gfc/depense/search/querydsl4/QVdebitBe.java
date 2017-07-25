package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVdebitBe is a Querydsl query type for QVdebitBe
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVdebitBe extends com.querydsl.sql.RelationalPathBase<QVdebitBe> {

    private static final long serialVersionUID = -211356957;

    public static final QVdebitBe vdebitBe = new QVdebitBe("VDEBIT_BE");

    public final DateTimePath<java.sql.Timestamp> ecrDateSaisie = createDateTime("ecrDateSaisie", java.sql.Timestamp.class);

    public final StringPath ecrSacd = createString("ecrSacd");

    public final NumberPath<Integer> exeExercice = createNumber("exeExercice", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> montant = createNumber("montant", Long.class);

    public final StringPath pcoLibelle = createString("pcoLibelle");

    public final StringPath pcoNum = createString("pcoNum");

    public QVdebitBe(String variable) {
        super(QVdebitBe.class, forVariable(variable), "GFC", "VDEBIT_BE");
        addMetadata();
    }

    public QVdebitBe(String variable, String schema, String table) {
        super(QVdebitBe.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVdebitBe(Path<? extends QVdebitBe> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VDEBIT_BE");
        addMetadata();
    }

    public QVdebitBe(PathMetadata metadata) {
        super(QVdebitBe.class, metadata, "GFC", "VDEBIT_BE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecrDateSaisie, ColumnMetadata.named("ECR_DATE_SAISIE").withIndex(2).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(ecrSacd, ColumnMetadata.named("ECR_SACD").withIndex(6).ofType(Types.VARCHAR).withSize(1));
        addMetadata(exeExercice, ColumnMetadata.named("EXE_EXERCICE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(montant, ColumnMetadata.named("MONTANT").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(pcoLibelle, ColumnMetadata.named("PCO_LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


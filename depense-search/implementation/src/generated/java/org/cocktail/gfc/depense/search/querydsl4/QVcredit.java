package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVcredit is a Querydsl query type for QVcredit
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVcredit extends com.querydsl.sql.RelationalPathBase<QVcredit> {

    private static final long serialVersionUID = -438999067;

    public static final QVcredit vcredit = new QVcredit("VCREDIT");

    public final DateTimePath<java.sql.Timestamp> ecrDateSaisie = createDateTime("ecrDateSaisie", java.sql.Timestamp.class);

    public final StringPath ecrSacd = createString("ecrSacd");

    public final NumberPath<Integer> exeExercice = createNumber("exeExercice", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> montant = createNumber("montant", Long.class);

    public final StringPath pcoLibelle = createString("pcoLibelle");

    public final StringPath pcoNum = createString("pcoNum");

    public QVcredit(String variable) {
        super(QVcredit.class, forVariable(variable), "GFC", "VCREDIT");
        addMetadata();
    }

    public QVcredit(String variable, String schema, String table) {
        super(QVcredit.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVcredit(Path<? extends QVcredit> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VCREDIT");
        addMetadata();
    }

    public QVcredit(PathMetadata metadata) {
        super(QVcredit.class, metadata, "GFC", "VCREDIT");
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


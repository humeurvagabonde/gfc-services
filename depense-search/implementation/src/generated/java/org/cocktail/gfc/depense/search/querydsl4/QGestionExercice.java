package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGestionExercice is a Querydsl query type for QGestionExercice
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGestionExercice extends com.querydsl.sql.RelationalPathBase<QGestionExercice> {

    private static final long serialVersionUID = -209538585;

    public static final QGestionExercice gestionExercice = new QGestionExercice("GESTION_EXERCICE");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath gesLibelle = createString("gesLibelle");

    public final StringPath pcoNum185 = createString("pcoNum185");

    public final StringPath pcoNum185CtpSacd = createString("pcoNum185CtpSacd");

    public final com.querydsl.sql.PrimaryKey<QGestionExercice> gestionExercicePk = createPrimaryKey(exeOrdre, gesCode);

    public QGestionExercice(String variable) {
        super(QGestionExercice.class, forVariable(variable), "GFC", "GESTION_EXERCICE");
        addMetadata();
    }

    public QGestionExercice(String variable, String schema, String table) {
        super(QGestionExercice.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGestionExercice(Path<? extends QGestionExercice> path) {
        super(path.getType(), path.getMetadata(), "GFC", "GESTION_EXERCICE");
        addMetadata();
    }

    public QGestionExercice(PathMetadata metadata) {
        super(QGestionExercice.class, metadata, "GFC", "GESTION_EXERCICE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(1).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(gesLibelle, ColumnMetadata.named("GES_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(200));
        addMetadata(pcoNum185, ColumnMetadata.named("PCO_NUM_185").withIndex(4).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pcoNum185CtpSacd, ColumnMetadata.named("PCO_NUM_185_CTP_SACD").withIndex(5).ofType(Types.VARCHAR).withSize(20));
    }

}


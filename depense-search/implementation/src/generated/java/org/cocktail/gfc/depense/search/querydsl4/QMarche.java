package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMarche is a Querydsl query type for QMarche
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMarche extends com.querydsl.sql.RelationalPathBase<QMarche> {

    private static final long serialVersionUID = -1382051124;

    public static final QMarche marche = new QMarche("MARCHE");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath marClauses = createString("marClauses");

    public final DateTimePath<java.sql.Timestamp> marDebut = createDateTime("marDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> marFin = createDateTime("marFin", java.sql.Timestamp.class);

    public final StringPath marIndex = createString("marIndex");

    public final StringPath marLibelle = createString("marLibelle");

    public final NumberPath<Long> marOrdre = createNumber("marOrdre", Long.class);

    public final StringPath marPassation = createString("marPassation");

    public final StringPath marRefExterne = createString("marRefExterne");

    public final StringPath marSuppr = createString("marSuppr");

    public final StringPath marValide = createString("marValide");

    public final com.querydsl.sql.PrimaryKey<QMarche> marchePk = createPrimaryKey(marOrdre);

    public QMarche(String variable) {
        super(QMarche.class, forVariable(variable), "GFC", "MARCHE");
        addMetadata();
    }

    public QMarche(String variable, String schema, String table) {
        super(QMarche.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMarche(Path<? extends QMarche> path) {
        super(path.getType(), path.getMetadata(), "GFC", "MARCHE");
        addMetadata();
    }

    public QMarche(PathMetadata metadata) {
        super(QMarche.class, metadata, "GFC", "MARCHE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(marClauses, ColumnMetadata.named("MAR_CLAUSES").withIndex(4).ofType(Types.VARCHAR).withSize(512));
        addMetadata(marDebut, ColumnMetadata.named("MAR_DEBUT").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(marFin, ColumnMetadata.named("MAR_FIN").withIndex(6).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(marIndex, ColumnMetadata.named("MAR_INDEX").withIndex(7).ofType(Types.VARCHAR).withSize(8));
        addMetadata(marLibelle, ColumnMetadata.named("MAR_LIBELLE").withIndex(8).ofType(Types.VARCHAR).withSize(512));
        addMetadata(marOrdre, ColumnMetadata.named("MAR_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(marPassation, ColumnMetadata.named("MAR_PASSATION").withIndex(9).ofType(Types.VARCHAR).withSize(1));
        addMetadata(marRefExterne, ColumnMetadata.named("MAR_REF_EXTERNE").withIndex(11).ofType(Types.VARCHAR).withSize(20));
        addMetadata(marSuppr, ColumnMetadata.named("MAR_SUPPR").withIndex(2).ofType(Types.VARCHAR).withSize(1));
        addMetadata(marValide, ColumnMetadata.named("MAR_VALIDE").withIndex(10).ofType(Types.VARCHAR).withSize(1));
    }

}


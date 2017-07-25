package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSaControleCodeMarche is a Querydsl query type for QSaControleCodeMarche
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSaControleCodeMarche extends com.querydsl.sql.RelationalPathBase<QSaControleCodeMarche> {

    private static final long serialVersionUID = -2039414449;

    public static final QSaControleCodeMarche saControleCodeMarche = new QSaControleCodeMarche("SA_CONTROLE_CODE_MARCHE");

    public final DateTimePath<java.sql.Timestamp> ccmaDate = createDateTime("ccmaDate", java.sql.Timestamp.class);

    public final NumberPath<Long> ccmaId = createNumber("ccmaId", Long.class);

    public final NumberPath<Long> cmOrdre = createNumber("cmOrdre", Long.class);

    public final NumberPath<Long> exeOrdre = createNumber("exeOrdre", Long.class);

    public final NumberPath<Long> svacId = createNumber("svacId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSaControleCodeMarche> saControleCodeMarchePk = createPrimaryKey(ccmaId);

    public QSaControleCodeMarche(String variable) {
        super(QSaControleCodeMarche.class, forVariable(variable), "GFC", "SA_CONTROLE_CODE_MARCHE");
        addMetadata();
    }

    public QSaControleCodeMarche(String variable, String schema, String table) {
        super(QSaControleCodeMarche.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSaControleCodeMarche(Path<? extends QSaControleCodeMarche> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SA_CONTROLE_CODE_MARCHE");
        addMetadata();
    }

    public QSaControleCodeMarche(PathMetadata metadata) {
        super(QSaControleCodeMarche.class, metadata, "GFC", "SA_CONTROLE_CODE_MARCHE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ccmaDate, ColumnMetadata.named("CCMA_DATE").withIndex(2).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(ccmaId, ColumnMetadata.named("CCMA_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(cmOrdre, ColumnMetadata.named("CM_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(svacId, ColumnMetadata.named("SVAC_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0));
    }

}


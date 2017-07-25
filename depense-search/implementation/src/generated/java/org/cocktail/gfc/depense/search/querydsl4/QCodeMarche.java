package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCodeMarche is a Querydsl query type for QCodeMarche
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCodeMarche extends com.querydsl.sql.RelationalPathBase<QCodeMarche> {

    private static final long serialVersionUID = -116977127;

    public static final QCodeMarche codeMarche = new QCodeMarche("CODE_MARCHE");

    public final StringPath cmCode = createString("cmCode");

    public final StringPath cmDetail = createString("cmDetail");

    public final StringPath cmLib = createString("cmLib");

    public final StringPath cmLibCourt = createString("cmLibCourt");

    public final NumberPath<Long> cmNiveau = createNumber("cmNiveau", Long.class);

    public final NumberPath<Long> cmOrdre = createNumber("cmOrdre", Long.class);

    public final NumberPath<Long> cmPere = createNumber("cmPere", Long.class);

    public final StringPath cmSuppr = createString("cmSuppr");

    public final NumberPath<Long> tcmId = createNumber("tcmId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCodeMarche> codeMarchePk = createPrimaryKey(cmOrdre);

    public QCodeMarche(String variable) {
        super(QCodeMarche.class, forVariable(variable), "GFC", "CODE_MARCHE");
        addMetadata();
    }

    public QCodeMarche(String variable, String schema, String table) {
        super(QCodeMarche.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCodeMarche(Path<? extends QCodeMarche> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CODE_MARCHE");
        addMetadata();
    }

    public QCodeMarche(PathMetadata metadata) {
        super(QCodeMarche.class, metadata, "GFC", "CODE_MARCHE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cmCode, ColumnMetadata.named("CM_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(cmDetail, ColumnMetadata.named("CM_DETAIL").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cmLib, ColumnMetadata.named("CM_LIB").withIndex(5).ofType(Types.VARCHAR).withSize(150).notNull());
        addMetadata(cmLibCourt, ColumnMetadata.named("CM_LIB_COURT").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cmNiveau, ColumnMetadata.named("CM_NIVEAU").withIndex(7).ofType(Types.DECIMAL).withSize(22));
        addMetadata(cmOrdre, ColumnMetadata.named("CM_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(cmPere, ColumnMetadata.named("CM_PERE").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(cmSuppr, ColumnMetadata.named("CM_SUPPR").withIndex(8).ofType(Types.VARCHAR).withSize(1));
        addMetadata(tcmId, ColumnMetadata.named("TCM_ID").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


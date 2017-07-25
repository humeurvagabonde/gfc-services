package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAbricotBordSelection is a Querydsl query type for QAbricotBordSelection
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAbricotBordSelection extends com.querydsl.sql.RelationalPathBase<QAbricotBordSelection> {

    private static final long serialVersionUID = -1852231353;

    public static final QAbricotBordSelection abricotBordSelection = new QAbricotBordSelection("ABRICOT_BORD_SELECTION");

    public final StringPath abrEtat = createString("abrEtat");

    public final StringPath abrGroupBy = createString("abrGroupBy");

    public final NumberPath<Long> abrId = createNumber("abrId", Long.class);

    public final NumberPath<Long> borId = createNumber("borId", Long.class);

    public final NumberPath<Long> depId = createNumber("depId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> tboOrdre = createNumber("tboOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public QAbricotBordSelection(String variable) {
        super(QAbricotBordSelection.class, forVariable(variable), "GFC", "ABRICOT_BORD_SELECTION");
        addMetadata();
    }

    public QAbricotBordSelection(String variable, String schema, String table) {
        super(QAbricotBordSelection.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAbricotBordSelection(Path<? extends QAbricotBordSelection> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ABRICOT_BORD_SELECTION");
        addMetadata();
    }

    public QAbricotBordSelection(PathMetadata metadata) {
        super(QAbricotBordSelection.class, metadata, "GFC", "ABRICOT_BORD_SELECTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(abrEtat, ColumnMetadata.named("ABR_ETAT").withIndex(6).ofType(Types.VARCHAR).withSize(25));
        addMetadata(abrGroupBy, ColumnMetadata.named("ABR_GROUP_BY").withIndex(7).ofType(Types.VARCHAR).withSize(200));
        addMetadata(abrId, ColumnMetadata.named("ABR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(borId, ColumnMetadata.named("BOR_ID").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(depId, ColumnMetadata.named("DEP_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(10).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(8).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tboOrdre, ColumnMetadata.named("TBO_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


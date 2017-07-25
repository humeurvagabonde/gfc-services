package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCtrlSeuilMapa is a Querydsl query type for QVCtrlSeuilMapa
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCtrlSeuilMapa extends com.querydsl.sql.RelationalPathBase<QVCtrlSeuilMapa> {

    private static final long serialVersionUID = -648406092;

    public static final QVCtrlSeuilMapa vCtrlSeuilMapa = new QVCtrlSeuilMapa("V_CTRL_SEUIL_MAPA");

    public final NumberPath<Long> ceOrdre = createNumber("ceOrdre", Long.class);

    public final StringPath cmCode = createString("cmCode");

    public final StringPath cmCodeFam = createString("cmCodeFam");

    public final StringPath cmLib = createString("cmLib");

    public final StringPath cmLibFam = createString("cmLibFam");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> montantHt = createNumber("montantHt", Long.class);

    public final NumberPath<Long> seuilMin = createNumber("seuilMin", Long.class);

    public QVCtrlSeuilMapa(String variable) {
        super(QVCtrlSeuilMapa.class, forVariable(variable), "GFC", "V_CTRL_SEUIL_MAPA");
        addMetadata();
    }

    public QVCtrlSeuilMapa(String variable, String schema, String table) {
        super(QVCtrlSeuilMapa.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCtrlSeuilMapa(Path<? extends QVCtrlSeuilMapa> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CTRL_SEUIL_MAPA");
        addMetadata();
    }

    public QVCtrlSeuilMapa(PathMetadata metadata) {
        super(QVCtrlSeuilMapa.class, metadata, "GFC", "V_CTRL_SEUIL_MAPA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ceOrdre, ColumnMetadata.named("CE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(cmCode, ColumnMetadata.named("CM_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(10));
        addMetadata(cmCodeFam, ColumnMetadata.named("CM_CODE_FAM").withIndex(7).ofType(Types.VARCHAR).withSize(10));
        addMetadata(cmLib, ColumnMetadata.named("CM_LIB").withIndex(4).ofType(Types.VARCHAR).withSize(150));
        addMetadata(cmLibFam, ColumnMetadata.named("CM_LIB_FAM").withIndex(8).ofType(Types.VARCHAR).withSize(150));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4));
        addMetadata(montantHt, ColumnMetadata.named("MONTANT_HT").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(seuilMin, ColumnMetadata.named("SEUIL_MIN").withIndex(6).ofType(Types.DECIMAL).withSize(0));
    }

}


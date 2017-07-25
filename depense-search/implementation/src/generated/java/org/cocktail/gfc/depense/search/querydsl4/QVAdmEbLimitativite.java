package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmEbLimitativite is a Querydsl query type for QVAdmEbLimitativite
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmEbLimitativite extends com.querydsl.sql.RelationalPathBase<QVAdmEbLimitativite> {

    private static final long serialVersionUID = 1811300314;

    public static final QVAdmEbLimitativite vAdmEbLimitativite = new QVAdmEbLimitativite("V_ADM_EB_LIMITATIVITE");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Integer> limitativeAe = createNumber("limitativeAe", Integer.class);

    public final NumberPath<Integer> limitativeCp = createNumber("limitativeCp", Integer.class);

    public final NumberPath<Integer> limitativeRec = createNumber("limitativeRec", Integer.class);

    public final NumberPath<Long> orgPere = createNumber("orgPere", Long.class);

    public QVAdmEbLimitativite(String variable) {
        super(QVAdmEbLimitativite.class, forVariable(variable), "GFC", "V_ADM_EB_LIMITATIVITE");
        addMetadata();
    }

    public QVAdmEbLimitativite(String variable, String schema, String table) {
        super(QVAdmEbLimitativite.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmEbLimitativite(Path<? extends QVAdmEbLimitativite> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_EB_LIMITATIVITE");
        addMetadata();
    }

    public QVAdmEbLimitativite(PathMetadata metadata) {
        super(QVAdmEbLimitativite.class, metadata, "GFC", "V_ADM_EB_LIMITATIVITE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(limitativeAe, ColumnMetadata.named("LIMITATIVE_AE").withIndex(4).ofType(Types.DECIMAL).withSize(1));
        addMetadata(limitativeCp, ColumnMetadata.named("LIMITATIVE_CP").withIndex(5).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(limitativeRec, ColumnMetadata.named("LIMITATIVE_REC").withIndex(6).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(orgPere, ColumnMetadata.named("ORG_PERE").withIndex(3).ofType(Types.DECIMAL).withSize(38));
    }

}


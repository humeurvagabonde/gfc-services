package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmNatureRecProdExer is a Querydsl query type for QAdmNatureRecProdExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmNatureRecProdExer extends com.querydsl.sql.RelationalPathBase<QAdmNatureRecProdExer> {

    private static final long serialVersionUID = -2067912352;

    public static final QAdmNatureRecProdExer admNatureRecProdExer = new QAdmNatureRecProdExer("ADM_NATURE_REC_PROD_EXER");

    public final StringPath active = createString("active");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmNatureRecProd = createNumber("idAdmNatureRecProd", Long.class);

    public final NumberPath<Long> idAdmNatureRecProdExer = createNumber("idAdmNatureRecProdExer", Long.class);

    public QAdmNatureRecProdExer(String variable) {
        super(QAdmNatureRecProdExer.class, forVariable(variable), "GFC", "ADM_NATURE_REC_PROD_EXER");
        addMetadata();
    }

    public QAdmNatureRecProdExer(String variable, String schema, String table) {
        super(QAdmNatureRecProdExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmNatureRecProdExer(Path<? extends QAdmNatureRecProdExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_NATURE_REC_PROD_EXER");
        addMetadata();
    }

    public QAdmNatureRecProdExer(PathMetadata metadata) {
        super(QAdmNatureRecProdExer.class, metadata, "GFC", "ADM_NATURE_REC_PROD_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("ACTIVE").withIndex(4).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmNatureRecProd, ColumnMetadata.named("ID_ADM_NATURE_REC_PROD").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureRecProdExer, ColumnMetadata.named("ID_ADM_NATURE_REC_PROD_EXER").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


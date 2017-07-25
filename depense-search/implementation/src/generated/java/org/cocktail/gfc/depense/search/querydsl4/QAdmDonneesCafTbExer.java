package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmDonneesCafTbExer is a Querydsl query type for QAdmDonneesCafTbExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmDonneesCafTbExer extends com.querydsl.sql.RelationalPathBase<QAdmDonneesCafTbExer> {

    private static final long serialVersionUID = 628326222;

    public static final QAdmDonneesCafTbExer admDonneesCafTbExer = new QAdmDonneesCafTbExer("ADM_DONNEES_CAF_TB_EXER");

    public final StringPath active = createString("active");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDonneesCafTb = createNumber("idAdmDonneesCafTb", Long.class);

    public final NumberPath<Long> idAdmDonneesCafTbExer = createNumber("idAdmDonneesCafTbExer", Long.class);

    public QAdmDonneesCafTbExer(String variable) {
        super(QAdmDonneesCafTbExer.class, forVariable(variable), "GFC", "ADM_DONNEES_CAF_TB_EXER");
        addMetadata();
    }

    public QAdmDonneesCafTbExer(String variable, String schema, String table) {
        super(QAdmDonneesCafTbExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmDonneesCafTbExer(Path<? extends QAdmDonneesCafTbExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_DONNEES_CAF_TB_EXER");
        addMetadata();
    }

    public QAdmDonneesCafTbExer(PathMetadata metadata) {
        super(QAdmDonneesCafTbExer.class, metadata, "GFC", "ADM_DONNEES_CAF_TB_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("ACTIVE").withIndex(4).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDonneesCafTb, ColumnMetadata.named("ID_ADM_DONNEES_CAF_TB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmDonneesCafTbExer, ColumnMetadata.named("ID_ADM_DONNEES_CAF_TB_EXER").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


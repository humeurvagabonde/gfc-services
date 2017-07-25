package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmEbExer is a Querydsl query type for QAdmEbExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmEbExer extends com.querydsl.sql.RelationalPathBase<QAdmEbExer> {

    private static final long serialVersionUID = -988256355;

    public static final QAdmEbExer admEbExer = new QAdmEbExer("ADM_EB_EXER");

    public final NumberPath<Long> canalObligatoire = createNumber("canalObligatoire", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmEbExer = createNumber("idAdmEbExer", Long.class);

    public final NumberPath<Long> idAdmEbReprise = createNumber("idAdmEbReprise", Long.class);

    public final NumberPath<Integer> limitativeAe = createNumber("limitativeAe", Integer.class);

    public final NumberPath<Long> opAutorisees = createNumber("opAutorisees", Long.class);

    public final NumberPath<Long> operationObligatoire = createNumber("operationObligatoire", Long.class);

    public final NumberPath<Integer> saisieBudgetaire = createNumber("saisieBudgetaire", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QAdmEbExer> admEbExerPk = createPrimaryKey(idAdmEbExer);

    public QAdmEbExer(String variable) {
        super(QAdmEbExer.class, forVariable(variable), "GFC", "ADM_EB_EXER");
        addMetadata();
    }

    public QAdmEbExer(String variable, String schema, String table) {
        super(QAdmEbExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmEbExer(Path<? extends QAdmEbExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_EB_EXER");
        addMetadata();
    }

    public QAdmEbExer(PathMetadata metadata) {
        super(QAdmEbExer.class, metadata, "GFC", "ADM_EB_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(canalObligatoire, ColumnMetadata.named("CANAL_OBLIGATOIRE").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEbExer, ColumnMetadata.named("ID_ADM_EB_EXER").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEbReprise, ColumnMetadata.named("ID_ADM_EB_REPRISE").withIndex(9).ofType(Types.DECIMAL).withSize(38));
        addMetadata(limitativeAe, ColumnMetadata.named("LIMITATIVE_AE").withIndex(8).ofType(Types.DECIMAL).withSize(1).notNull());
        addMetadata(opAutorisees, ColumnMetadata.named("OP_AUTORISEES").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(operationObligatoire, ColumnMetadata.named("OPERATION_OBLIGATOIRE").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(saisieBudgetaire, ColumnMetadata.named("SAISIE_BUDGETAIRE").withIndex(7).ofType(Types.DECIMAL).withSize(1).notNull());
    }

}


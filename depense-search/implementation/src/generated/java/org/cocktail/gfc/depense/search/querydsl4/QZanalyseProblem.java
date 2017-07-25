package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QZanalyseProblem is a Querydsl query type for QZanalyseProblem
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QZanalyseProblem extends com.querydsl.sql.RelationalPathBase<QZanalyseProblem> {

    private static final long serialVersionUID = -643211108;

    public static final QZanalyseProblem zanalyseProblem = new QZanalyseProblem("ZANALYSE_PROBLEM");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath zapCategorie = createString("zapCategorie");

    public final StringPath zapConsequence = createString("zapConsequence");

    public final DateTimePath<java.sql.Timestamp> zapDate = createDateTime("zapDate", java.sql.Timestamp.class);

    public final StringPath zapEntity = createString("zapEntity");

    public final StringPath zapEntityKey = createString("zapEntityKey");

    public final StringPath zapEntityKeyValue = createString("zapEntityKeyValue");

    public final NumberPath<Long> zapId = createNumber("zapId", Long.class);

    public final NumberPath<Integer> zapNiveau = createNumber("zapNiveau", Integer.class);

    public final StringPath zapProbleme = createString("zapProbleme");

    public final StringPath zapSolution = createString("zapSolution");

    public final StringPath zapSousCategorie = createString("zapSousCategorie");

    public final com.querydsl.sql.PrimaryKey<QZanalyseProblem> zanalyseProblemPk = createPrimaryKey(zapId);

    public QZanalyseProblem(String variable) {
        super(QZanalyseProblem.class, forVariable(variable), "GFC", "ZANALYSE_PROBLEM");
        addMetadata();
    }

    public QZanalyseProblem(String variable, String schema, String table) {
        super(QZanalyseProblem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QZanalyseProblem(Path<? extends QZanalyseProblem> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ZANALYSE_PROBLEM");
        addMetadata();
    }

    public QZanalyseProblem(PathMetadata metadata) {
        super(QZanalyseProblem.class, metadata, "GFC", "ZANALYSE_PROBLEM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(zapCategorie, ColumnMetadata.named("ZAP_CATEGORIE").withIndex(3).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(zapConsequence, ColumnMetadata.named("ZAP_CONSEQUENCE").withIndex(9).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(zapDate, ColumnMetadata.named("ZAP_DATE").withIndex(11).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(zapEntity, ColumnMetadata.named("ZAP_ENTITY").withIndex(5).ofType(Types.VARCHAR).withSize(100));
        addMetadata(zapEntityKey, ColumnMetadata.named("ZAP_ENTITY_KEY").withIndex(6).ofType(Types.VARCHAR).withSize(100));
        addMetadata(zapEntityKeyValue, ColumnMetadata.named("ZAP_ENTITY_KEY_VALUE").withIndex(7).ofType(Types.VARCHAR).withSize(100));
        addMetadata(zapId, ColumnMetadata.named("ZAP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(27).notNull());
        addMetadata(zapNiveau, ColumnMetadata.named("ZAP_NIVEAU").withIndex(12).ofType(Types.DECIMAL).withSize(2));
        addMetadata(zapProbleme, ColumnMetadata.named("ZAP_PROBLEME").withIndex(8).ofType(Types.VARCHAR).withSize(1000).notNull());
        addMetadata(zapSolution, ColumnMetadata.named("ZAP_SOLUTION").withIndex(10).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(zapSousCategorie, ColumnMetadata.named("ZAP_SOUS_CATEGORIE").withIndex(4).ofType(Types.VARCHAR).withSize(100).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvenantEvenement is a Querydsl query type for QAvenantEvenement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvenantEvenement extends com.querydsl.sql.RelationalPathBase<QAvenantEvenement> {

    private static final long serialVersionUID = 1251364522;

    public static final QAvenantEvenement avenantEvenement = new QAvenantEvenement("AVENANT_EVENEMENT");

    public final NumberPath<Long> aeOrdre = createNumber("aeOrdre", Long.class);

    public final NumberPath<Long> avtOrdre = createNumber("avtOrdre", Long.class);

    public final NumberPath<Long> evtOrdre = createNumber("evtOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAvenantEvenement> avenantEvenementPk = createPrimaryKey(aeOrdre);

    public QAvenantEvenement(String variable) {
        super(QAvenantEvenement.class, forVariable(variable), "GFC", "AVENANT_EVENEMENT");
        addMetadata();
    }

    public QAvenantEvenement(String variable, String schema, String table) {
        super(QAvenantEvenement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvenantEvenement(Path<? extends QAvenantEvenement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "AVENANT_EVENEMENT");
        addMetadata();
    }

    public QAvenantEvenement(PathMetadata metadata) {
        super(QAvenantEvenement.class, metadata, "GFC", "AVENANT_EVENEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeOrdre, ColumnMetadata.named("AE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(avtOrdre, ColumnMetadata.named("AVT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(evtOrdre, ColumnMetadata.named("EVT_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


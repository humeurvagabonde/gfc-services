package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEcheancierBrouillard is a Querydsl query type for QEcheancierBrouillard
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEcheancierBrouillard extends com.querydsl.sql.RelationalPathBase<QEcheancierBrouillard> {

    private static final long serialVersionUID = 1853314053;

    public static final QEcheancierBrouillard echeancierBrouillard = new QEcheancierBrouillard("ECHEANCIER_BROUILLARD");

    public final NumberPath<Long> bobOrdre = createNumber("bobOrdre", Long.class);

    public final NumberPath<Long> ebrId = createNumber("ebrId", Long.class);

    public final NumberPath<Long> echeEcheancierOrdre = createNumber("echeEcheancierOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QEcheancierBrouillard> echeancierBrouillardPk = createPrimaryKey(ebrId);

    public QEcheancierBrouillard(String variable) {
        super(QEcheancierBrouillard.class, forVariable(variable), "GFC", "ECHEANCIER_BROUILLARD");
        addMetadata();
    }

    public QEcheancierBrouillard(String variable, String schema, String table) {
        super(QEcheancierBrouillard.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEcheancierBrouillard(Path<? extends QEcheancierBrouillard> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ECHEANCIER_BROUILLARD");
        addMetadata();
    }

    public QEcheancierBrouillard(PathMetadata metadata) {
        super(QEcheancierBrouillard.class, metadata, "GFC", "ECHEANCIER_BROUILLARD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bobOrdre, ColumnMetadata.named("BOB_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ebrId, ColumnMetadata.named("EBR_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(echeEcheancierOrdre, ColumnMetadata.named("ECHE_ECHEANCIER_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


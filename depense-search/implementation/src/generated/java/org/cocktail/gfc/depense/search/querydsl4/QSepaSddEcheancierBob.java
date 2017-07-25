package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSepaSddEcheancierBob is a Querydsl query type for QSepaSddEcheancierBob
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSepaSddEcheancierBob extends com.querydsl.sql.RelationalPathBase<QSepaSddEcheancierBob> {

    private static final long serialVersionUID = -1574102060;

    public static final QSepaSddEcheancierBob sepaSddEcheancierBob = new QSepaSddEcheancierBob("SEPA_SDD_ECHEANCIER_BOB");

    public final NumberPath<Long> bobOrdre = createNumber("bobOrdre", Long.class);

    public final NumberPath<Long> idSepaSddEcheancier = createNumber("idSepaSddEcheancier", Long.class);

    public final NumberPath<Long> sebId = createNumber("sebId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSepaSddEcheancierBob> sepaSddEcheancierBobPk = createPrimaryKey(sebId);

    public QSepaSddEcheancierBob(String variable) {
        super(QSepaSddEcheancierBob.class, forVariable(variable), "GFC", "SEPA_SDD_ECHEANCIER_BOB");
        addMetadata();
    }

    public QSepaSddEcheancierBob(String variable, String schema, String table) {
        super(QSepaSddEcheancierBob.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSepaSddEcheancierBob(Path<? extends QSepaSddEcheancierBob> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SEPA_SDD_ECHEANCIER_BOB");
        addMetadata();
    }

    public QSepaSddEcheancierBob(PathMetadata metadata) {
        super(QSepaSddEcheancierBob.class, metadata, "GFC", "SEPA_SDD_ECHEANCIER_BOB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bobOrdre, ColumnMetadata.named("BOB_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddEcheancier, ColumnMetadata.named("ID_SEPA_SDD_ECHEANCIER").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(sebId, ColumnMetadata.named("SEB_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


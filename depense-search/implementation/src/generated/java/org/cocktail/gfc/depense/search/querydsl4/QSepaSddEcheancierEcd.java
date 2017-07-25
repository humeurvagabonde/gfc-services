package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSepaSddEcheancierEcd is a Querydsl query type for QSepaSddEcheancierEcd
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSepaSddEcheancierEcd extends com.querydsl.sql.RelationalPathBase<QSepaSddEcheancierEcd> {

    private static final long serialVersionUID = -1574099547;

    public static final QSepaSddEcheancierEcd sepaSddEcheancierEcd = new QSepaSddEcheancierEcd("SEPA_SDD_ECHEANCIER_ECD");

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<Long> idSepaSddEcheancier = createNumber("idSepaSddEcheancier", Long.class);

    public final NumberPath<Long> idSepaSddEcheancierEcd = createNumber("idSepaSddEcheancierEcd", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSepaSddEcheancierEcd> sepaSddEcheancierEcdPk = createPrimaryKey(idSepaSddEcheancierEcd);

    public QSepaSddEcheancierEcd(String variable) {
        super(QSepaSddEcheancierEcd.class, forVariable(variable), "GFC", "SEPA_SDD_ECHEANCIER_ECD");
        addMetadata();
    }

    public QSepaSddEcheancierEcd(String variable, String schema, String table) {
        super(QSepaSddEcheancierEcd.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSepaSddEcheancierEcd(Path<? extends QSepaSddEcheancierEcd> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SEPA_SDD_ECHEANCIER_ECD");
        addMetadata();
    }

    public QSepaSddEcheancierEcd(PathMetadata metadata) {
        super(QSepaSddEcheancierEcd.class, metadata, "GFC", "SEPA_SDD_ECHEANCIER_ECD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddEcheancier, ColumnMetadata.named("ID_SEPA_SDD_ECHEANCIER").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddEcheancierEcd, ColumnMetadata.named("ID_SEPA_SDD_ECHEANCIER_ECD").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSepaSddEcheanceEcd is a Querydsl query type for QSepaSddEcheanceEcd
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSepaSddEcheanceEcd extends com.querydsl.sql.RelationalPathBase<QSepaSddEcheanceEcd> {

    private static final long serialVersionUID = -1838657802;

    public static final QSepaSddEcheanceEcd sepaSddEcheanceEcd = new QSepaSddEcheanceEcd("SEPA_SDD_ECHEANCE_ECD");

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final NumberPath<Long> idSepaSddEcheance = createNumber("idSepaSddEcheance", Long.class);

    public final NumberPath<Long> idSepaSddEcheanceEcd = createNumber("idSepaSddEcheanceEcd", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSepaSddEcheanceEcd> sepaSddEcheanceEcdPk = createPrimaryKey(idSepaSddEcheanceEcd);

    public QSepaSddEcheanceEcd(String variable) {
        super(QSepaSddEcheanceEcd.class, forVariable(variable), "GFC", "SEPA_SDD_ECHEANCE_ECD");
        addMetadata();
    }

    public QSepaSddEcheanceEcd(String variable, String schema, String table) {
        super(QSepaSddEcheanceEcd.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSepaSddEcheanceEcd(Path<? extends QSepaSddEcheanceEcd> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SEPA_SDD_ECHEANCE_ECD");
        addMetadata();
    }

    public QSepaSddEcheanceEcd(PathMetadata metadata) {
        super(QSepaSddEcheanceEcd.class, metadata, "GFC", "SEPA_SDD_ECHEANCE_ECD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddEcheance, ColumnMetadata.named("ID_SEPA_SDD_ECHEANCE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddEcheanceEcd, ColumnMetadata.named("ID_SEPA_SDD_ECHEANCE_ECD").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


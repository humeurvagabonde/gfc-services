package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSepaSddEcheancier is a Querydsl query type for QSepaSddEcheancier
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSepaSddEcheancier extends com.querydsl.sql.RelationalPathBase<QSepaSddEcheancier> {

    private static final long serialVersionUID = -890590687;

    public static final QSepaSddEcheancier sepaSddEcheancier = new QSepaSddEcheancier("SEPA_SDD_ECHEANCIER");

    public final StringPath dCreation = createString("dCreation");

    public final StringPath dModification = createString("dModification");

    public final NumberPath<Long> idSepaSddEcheancier = createNumber("idSepaSddEcheancier", Long.class);

    public final NumberPath<Long> idSepaSddMandat = createNumber("idSepaSddMandat", Long.class);

    public final NumberPath<Long> idSepaSddOrigine = createNumber("idSepaSddOrigine", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSepaSddEcheancier> sepaSddEcheancierPk = createPrimaryKey(idSepaSddEcheancier);

    public QSepaSddEcheancier(String variable) {
        super(QSepaSddEcheancier.class, forVariable(variable), "GFC", "SEPA_SDD_ECHEANCIER");
        addMetadata();
    }

    public QSepaSddEcheancier(String variable, String schema, String table) {
        super(QSepaSddEcheancier.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSepaSddEcheancier(Path<? extends QSepaSddEcheancier> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SEPA_SDD_ECHEANCIER");
        addMetadata();
    }

    public QSepaSddEcheancier(PathMetadata metadata) {
        super(QSepaSddEcheancier.class, metadata, "GFC", "SEPA_SDD_ECHEANCIER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(5).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(6).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(idSepaSddEcheancier, ColumnMetadata.named("ID_SEPA_SDD_ECHEANCIER").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddMandat, ColumnMetadata.named("ID_SEPA_SDD_MANDAT").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(idSepaSddOrigine, ColumnMetadata.named("ID_SEPA_SDD_ORIGINE").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


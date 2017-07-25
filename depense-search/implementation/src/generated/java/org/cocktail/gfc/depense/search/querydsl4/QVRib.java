package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVRib is a Querydsl query type for QVRib
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVRib extends com.querydsl.sql.RelationalPathBase<QVRib> {

    private static final long serialVersionUID = 1612221311;

    public static final QVRib vRib = new QVRib("V_RIB");

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final StringPath ribBic = createString("ribBic");

    public final StringPath ribCle = createString("ribCle");

    public final StringPath ribCodbanc = createString("ribCodbanc");

    public final StringPath ribDomicil = createString("ribDomicil");

    public final StringPath ribGuich = createString("ribGuich");

    public final StringPath ribIban = createString("ribIban");

    public final StringPath ribNum = createString("ribNum");

    public final NumberPath<Long> ribOrdre = createNumber("ribOrdre", Long.class);

    public final StringPath ribTitco = createString("ribTitco");

    public final StringPath ribValide = createString("ribValide");

    public QVRib(String variable) {
        super(QVRib.class, forVariable(variable), "GFC", "V_RIB");
        addMetadata();
    }

    public QVRib(String variable, String schema, String table) {
        super(QVRib.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVRib(Path<? extends QVRib> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_RIB");
        addMetadata();
    }

    public QVRib(PathMetadata metadata) {
        super(QVRib.class, metadata, "GFC", "V_RIB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(12).ofType(Types.DECIMAL).withSize(0));
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(13).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ribBic, ColumnMetadata.named("RIB_BIC").withIndex(3).ofType(Types.VARCHAR).withSize(11));
        addMetadata(ribCle, ColumnMetadata.named("RIB_CLE").withIndex(4).ofType(Types.VARCHAR).withSize(2));
        addMetadata(ribCodbanc, ColumnMetadata.named("RIB_CODBANC").withIndex(5).ofType(Types.VARCHAR).withSize(5));
        addMetadata(ribDomicil, ColumnMetadata.named("RIB_DOMICIL").withIndex(8).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(ribGuich, ColumnMetadata.named("RIB_GUICH").withIndex(6).ofType(Types.VARCHAR).withSize(5));
        addMetadata(ribIban, ColumnMetadata.named("RIB_IBAN").withIndex(7).ofType(Types.VARCHAR).withSize(34));
        addMetadata(ribNum, ColumnMetadata.named("RIB_NUM").withIndex(9).ofType(Types.VARCHAR).withSize(11));
        addMetadata(ribOrdre, ColumnMetadata.named("RIB_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(ribTitco, ColumnMetadata.named("RIB_TITCO").withIndex(10).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(ribValide, ColumnMetadata.named("RIB_VALIDE").withIndex(11).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


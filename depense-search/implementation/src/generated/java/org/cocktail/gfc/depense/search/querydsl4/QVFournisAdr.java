package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVFournisAdr is a Querydsl query type for QVFournisAdr
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVFournisAdr extends com.querydsl.sql.RelationalPathBase<QVFournisAdr> {

    private static final long serialVersionUID = -1391305943;

    public static final QVFournisAdr vFournisAdr = new QVFournisAdr("V_FOURNIS_ADR");

    public final NumberPath<Long> adrOrdre = createNumber("adrOrdre", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public QVFournisAdr(String variable) {
        super(QVFournisAdr.class, forVariable(variable), "GFC", "V_FOURNIS_ADR");
        addMetadata();
    }

    public QVFournisAdr(String variable, String schema, String table) {
        super(QVFournisAdr.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVFournisAdr(Path<? extends QVFournisAdr> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_FOURNIS_ADR");
        addMetadata();
    }

    public QVFournisAdr(PathMetadata metadata) {
        super(QVFournisAdr.class, metadata, "GFC", "V_FOURNIS_ADR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adrOrdre, ColumnMetadata.named("ADR_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


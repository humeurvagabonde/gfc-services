package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVOpeNumeroEtLibelle is a Querydsl query type for QVOpeNumeroEtLibelle
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVOpeNumeroEtLibelle extends com.querydsl.sql.RelationalPathBase<QVOpeNumeroEtLibelle> {

    private static final long serialVersionUID = -188835902;

    public static final QVOpeNumeroEtLibelle vOpeNumeroEtLibelle = new QVOpeNumeroEtLibelle("V_OPE_NUMERO_ET_LIBELLE");

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final StringPath llOperation = createString("llOperation");

    public final StringPath opeNumero = createString("opeNumero");

    public QVOpeNumeroEtLibelle(String variable) {
        super(QVOpeNumeroEtLibelle.class, forVariable(variable), "GFC", "V_OPE_NUMERO_ET_LIBELLE");
        addMetadata();
    }

    public QVOpeNumeroEtLibelle(String variable, String schema, String table) {
        super(QVOpeNumeroEtLibelle.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVOpeNumeroEtLibelle(Path<? extends QVOpeNumeroEtLibelle> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_OPE_NUMERO_ET_LIBELLE");
        addMetadata();
    }

    public QVOpeNumeroEtLibelle(PathMetadata metadata) {
        super(QVOpeNumeroEtLibelle.class, metadata, "GFC", "V_OPE_NUMERO_ET_LIBELLE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(llOperation, ColumnMetadata.named("LL_OPERATION").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(opeNumero, ColumnMetadata.named("OPE_NUMERO").withIndex(2).ofType(Types.VARCHAR).withSize(57));
    }

}


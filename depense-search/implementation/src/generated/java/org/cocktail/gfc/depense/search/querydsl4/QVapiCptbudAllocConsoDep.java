package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVapiCptbudAllocConsoDep is a Querydsl query type for QVapiCptbudAllocConsoDep
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVapiCptbudAllocConsoDep extends com.querydsl.sql.RelationalPathBase<QVapiCptbudAllocConsoDep> {

    private static final long serialVersionUID = -634572978;

    public static final QVapiCptbudAllocConsoDep vapiCptbudAllocConsoDep = new QVapiCptbudAllocConsoDep("VAPI_CPTBUD_ALLOC_CONSO_DEP");

    public final NumberPath<Long> aeAllouees = createNumber("aeAllouees", Long.class);

    public final NumberPath<Long> aeConsommees = createNumber("aeConsommees", Long.class);

    public final NumberPath<Long> cpAlloues = createNumber("cpAlloues", Long.class);

    public final NumberPath<Long> cpConsommes = createNumber("cpConsommes", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDestinationDepense = createNumber("idAdmDestinationDepense", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public QVapiCptbudAllocConsoDep(String variable) {
        super(QVapiCptbudAllocConsoDep.class, forVariable(variable), "GFC", "VAPI_CPTBUD_ALLOC_CONSO_DEP");
        addMetadata();
    }

    public QVapiCptbudAllocConsoDep(String variable, String schema, String table) {
        super(QVapiCptbudAllocConsoDep.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVapiCptbudAllocConsoDep(Path<? extends QVapiCptbudAllocConsoDep> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VAPI_CPTBUD_ALLOC_CONSO_DEP");
        addMetadata();
    }

    public QVapiCptbudAllocConsoDep(PathMetadata metadata) {
        super(QVapiCptbudAllocConsoDep.class, metadata, "GFC", "VAPI_CPTBUD_ALLOC_CONSO_DEP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeAllouees, ColumnMetadata.named("AE_ALLOUEES").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(aeConsommees, ColumnMetadata.named("AE_CONSOMMEES").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(cpAlloues, ColumnMetadata.named("CP_ALLOUES").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(cpConsommes, ColumnMetadata.named("CP_CONSOMMES").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDestinationDepense, ColumnMetadata.named("ID_ADM_DESTINATION_DEPENSE").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(3).ofType(Types.DECIMAL).withSize(38));
    }

}


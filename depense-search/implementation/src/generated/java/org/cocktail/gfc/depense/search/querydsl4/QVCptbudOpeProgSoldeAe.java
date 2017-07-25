package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCptbudOpeProgSoldeAe is a Querydsl query type for QVCptbudOpeProgSoldeAe
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCptbudOpeProgSoldeAe extends com.querydsl.sql.RelationalPathBase<QVCptbudOpeProgSoldeAe> {

    private static final long serialVersionUID = -463492563;

    public static final QVCptbudOpeProgSoldeAe vCptbudOpeProgSoldeAe = new QVCptbudOpeProgSoldeAe("V_CPTBUD_OPE_PROG_SOLDE_AE");

    public final NumberPath<java.math.BigDecimal> credit = createNumber("credit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> debit = createNumber("debit", java.math.BigDecimal.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<java.math.BigDecimal> solde = createNumber("solde", java.math.BigDecimal.class);

    public QVCptbudOpeProgSoldeAe(String variable) {
        super(QVCptbudOpeProgSoldeAe.class, forVariable(variable), "GFC", "V_CPTBUD_OPE_PROG_SOLDE_AE");
        addMetadata();
    }

    public QVCptbudOpeProgSoldeAe(String variable, String schema, String table) {
        super(QVCptbudOpeProgSoldeAe.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCptbudOpeProgSoldeAe(Path<? extends QVCptbudOpeProgSoldeAe> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CPTBUD_OPE_PROG_SOLDE_AE");
        addMetadata();
    }

    public QVCptbudOpeProgSoldeAe(PathMetadata metadata) {
        super(QVCptbudOpeProgSoldeAe.class, metadata, "GFC", "V_CPTBUD_OPE_PROG_SOLDE_AE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(credit, ColumnMetadata.named("CREDIT").withIndex(3).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(debit, ColumnMetadata.named("DEBIT").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(solde, ColumnMetadata.named("SOLDE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptbudDepSoldeCpEblim is a Querydsl query type for QCptbudDepSoldeCpEblim
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptbudDepSoldeCpEblim extends com.querydsl.sql.RelationalPathBase<QCptbudDepSoldeCpEblim> {

    private static final long serialVersionUID = -2040491920;

    public static final QCptbudDepSoldeCpEblim cptbudDepSoldeCpEblim = new QCptbudDepSoldeCpEblim("CPTBUD_DEP_SOLDE_CP_EBLIM");

    public final NumberPath<java.math.BigDecimal> cpMutualiseSolde = createNumber("cpMutualiseSolde", java.math.BigDecimal.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idCptbudDepSoldeCpEblim = createNumber("idCptbudDepSoldeCpEblim", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCptbudDepSoldeCpEblim> idCptbudDepSldCpEblimPk = createPrimaryKey(idCptbudDepSoldeCpEblim);

    public QCptbudDepSoldeCpEblim(String variable) {
        super(QCptbudDepSoldeCpEblim.class, forVariable(variable), "GFC", "CPTBUD_DEP_SOLDE_CP_EBLIM");
        addMetadata();
    }

    public QCptbudDepSoldeCpEblim(String variable, String schema, String table) {
        super(QCptbudDepSoldeCpEblim.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptbudDepSoldeCpEblim(Path<? extends QCptbudDepSoldeCpEblim> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTBUD_DEP_SOLDE_CP_EBLIM");
        addMetadata();
    }

    public QCptbudDepSoldeCpEblim(PathMetadata metadata) {
        super(QCptbudDepSoldeCpEblim.class, metadata, "GFC", "CPTBUD_DEP_SOLDE_CP_EBLIM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cpMutualiseSolde, ColumnMetadata.named("CP_MUTUALISE_SOLDE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idCptbudDepSoldeCpEblim, ColumnMetadata.named("ID_CPTBUD_DEP_SOLDE_CP_EBLIM").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


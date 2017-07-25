package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptbudDepSoldeAeEblim is a Querydsl query type for QCptbudDepSoldeAeEblim
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptbudDepSoldeAeEblim extends com.querydsl.sql.RelationalPathBase<QCptbudDepSoldeAeEblim> {

    private static final long serialVersionUID = 164547353;

    public static final QCptbudDepSoldeAeEblim cptbudDepSoldeAeEblim = new QCptbudDepSoldeAeEblim("CPTBUD_DEP_SOLDE_AE_EBLIM");

    public final NumberPath<java.math.BigDecimal> aeMutualiseSolde = createNumber("aeMutualiseSolde", java.math.BigDecimal.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<Long> idCptbudDepSoldeAeEblim = createNumber("idCptbudDepSoldeAeEblim", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCptbudDepSoldeAeEblim> idCptbudDepSldAeEblimPk = createPrimaryKey(idCptbudDepSoldeAeEblim);

    public QCptbudDepSoldeAeEblim(String variable) {
        super(QCptbudDepSoldeAeEblim.class, forVariable(variable), "GFC", "CPTBUD_DEP_SOLDE_AE_EBLIM");
        addMetadata();
    }

    public QCptbudDepSoldeAeEblim(String variable, String schema, String table) {
        super(QCptbudDepSoldeAeEblim.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptbudDepSoldeAeEblim(Path<? extends QCptbudDepSoldeAeEblim> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTBUD_DEP_SOLDE_AE_EBLIM");
        addMetadata();
    }

    public QCptbudDepSoldeAeEblim(PathMetadata metadata) {
        super(QCptbudDepSoldeAeEblim.class, metadata, "GFC", "CPTBUD_DEP_SOLDE_AE_EBLIM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aeMutualiseSolde, ColumnMetadata.named("AE_MUTUALISE_SOLDE").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idCptbudDepSoldeAeEblim, ColumnMetadata.named("ID_CPTBUD_DEP_SOLDE_AE_EBLIM").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


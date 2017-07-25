package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOpeRepartPartenaire is a Querydsl query type for QOpeRepartPartenaire
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpeRepartPartenaire extends com.querydsl.sql.RelationalPathBase<QOpeRepartPartenaire> {

    private static final long serialVersionUID = -1871552969;

    public static final QOpeRepartPartenaire opeRepartPartenaire = new QOpeRepartPartenaire("OPE_REPART_PARTENAIRE");

    public final NumberPath<Long> idOpeOperationPartenaire = createNumber("idOpeOperationPartenaire", Long.class);

    public final NumberPath<Long> idOpeRepartPartenaire = createNumber("idOpeRepartPartenaire", Long.class);

    public final NumberPath<Long> idOpeTrancheBud = createNumber("idOpeTrancheBud", Long.class);

    public final NumberPath<java.math.BigDecimal> montantParticipation = createNumber("montantParticipation", java.math.BigDecimal.class);

    public final com.querydsl.sql.PrimaryKey<QOpeRepartPartenaire> idOpeRepartPartenairePk = createPrimaryKey(idOpeRepartPartenaire);

    public QOpeRepartPartenaire(String variable) {
        super(QOpeRepartPartenaire.class, forVariable(variable), "GFC", "OPE_REPART_PARTENAIRE");
        addMetadata();
    }

    public QOpeRepartPartenaire(String variable, String schema, String table) {
        super(QOpeRepartPartenaire.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpeRepartPartenaire(Path<? extends QOpeRepartPartenaire> path) {
        super(path.getType(), path.getMetadata(), "GFC", "OPE_REPART_PARTENAIRE");
        addMetadata();
    }

    public QOpeRepartPartenaire(PathMetadata metadata) {
        super(QOpeRepartPartenaire.class, metadata, "GFC", "OPE_REPART_PARTENAIRE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idOpeOperationPartenaire, ColumnMetadata.named("ID_OPE_OPERATION_PARTENAIRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeRepartPartenaire, ColumnMetadata.named("ID_OPE_REPART_PARTENAIRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeTrancheBud, ColumnMetadata.named("ID_OPE_TRANCHE_BUD").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(montantParticipation, ColumnMetadata.named("MONTANT_PARTICIPATION").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
    }

}


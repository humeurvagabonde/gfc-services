package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVEcritureMontant is a Querydsl query type for QVEcritureMontant
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVEcritureMontant extends com.querydsl.sql.RelationalPathBase<QVEcritureMontant> {

    private static final long serialVersionUID = 1959150826;

    public static final QVEcritureMontant vEcritureMontant = new QVEcritureMontant("V_ECRITURE_MONTANT");

    public final NumberPath<Long> ecrMontant = createNumber("ecrMontant", Long.class);

    public final NumberPath<Long> ecrOrdre = createNumber("ecrOrdre", Long.class);

    public QVEcritureMontant(String variable) {
        super(QVEcritureMontant.class, forVariable(variable), "GFC", "V_ECRITURE_MONTANT");
        addMetadata();
    }

    public QVEcritureMontant(String variable, String schema, String table) {
        super(QVEcritureMontant.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVEcritureMontant(Path<? extends QVEcritureMontant> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ECRITURE_MONTANT");
        addMetadata();
    }

    public QVEcritureMontant(PathMetadata metadata) {
        super(QVEcritureMontant.class, metadata, "GFC", "V_ECRITURE_MONTANT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecrMontant, ColumnMetadata.named("ECR_MONTANT").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ecrOrdre, ColumnMetadata.named("ECR_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


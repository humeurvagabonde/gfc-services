package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVirementFichier is a Querydsl query type for QVirementFichier
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVirementFichier extends com.querydsl.sql.RelationalPathBase<QVirementFichier> {

    private static final long serialVersionUID = -385897152;

    public static final QVirementFichier virementFichier = new QVirementFichier("VIREMENT_FICHIER");

    public final NumberPath<Long> paiOrdre = createNumber("paiOrdre", Long.class);

    public final NumberPath<Long> tviOrdre = createNumber("tviOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final StringPath virCompte = createString("virCompte");

    public final StringPath virContenu = createString("virContenu");

    public final DateTimePath<java.sql.Timestamp> virDateCreation = createDateTime("virDateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> virDateValeur = createDateTime("virDateValeur", java.sql.Timestamp.class);

    public final NumberPath<Long> virOrdre = createNumber("virOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QVirementFichier> virementFichierPk = createPrimaryKey(virOrdre);

    public QVirementFichier(String variable) {
        super(QVirementFichier.class, forVariable(variable), "GFC", "VIREMENT_FICHIER");
        addMetadata();
    }

    public QVirementFichier(String variable, String schema, String table) {
        super(QVirementFichier.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVirementFichier(Path<? extends QVirementFichier> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VIREMENT_FICHIER");
        addMetadata();
    }

    public QVirementFichier(PathMetadata metadata) {
        super(QVirementFichier.class, metadata, "GFC", "VIREMENT_FICHIER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(paiOrdre, ColumnMetadata.named("PAI_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(tviOrdre, ColumnMetadata.named("TVI_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(virCompte, ColumnMetadata.named("VIR_COMPTE").withIndex(8).ofType(Types.VARCHAR).withSize(34));
        addMetadata(virContenu, ColumnMetadata.named("VIR_CONTENU").withIndex(5).ofType(Types.CLOB).withSize(4000));
        addMetadata(virDateCreation, ColumnMetadata.named("VIR_DATE_CREATION").withIndex(4).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(virDateValeur, ColumnMetadata.named("VIR_DATE_VALEUR").withIndex(6).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(virOrdre, ColumnMetadata.named("VIR_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(10).notNull());
    }

}


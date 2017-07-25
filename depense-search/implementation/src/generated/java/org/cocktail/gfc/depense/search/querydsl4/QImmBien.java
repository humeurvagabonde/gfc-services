package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QImmBien is a Querydsl query type for QImmBien
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QImmBien extends com.querydsl.sql.RelationalPathBase<QImmBien> {

    private static final long serialVersionUID = 1188990863;

    public static final QImmBien immBien = new QImmBien("IMM_BIEN");

    public final StringPath codeBarre = createString("codeBarre");

    public final StringPath commentaire = createString("commentaire");

    public final DateTimePath<java.sql.Timestamp> dateSortie = createDateTime("dateSortie", java.sql.Timestamp.class);

    public final StringPath documentation = createString("documentation");

    public final StringPath garantie = createString("garantie");

    public final NumberPath<Long> idBien = createNumber("idBien", Long.class);

    public final NumberPath<Long> idInventaireComptable = createNumber("idInventaireComptable", Long.class);

    public final NumberPath<Long> idLocalisation = createNumber("idLocalisation", Long.class);

    public final NumberPath<Long> idResponsable = createNumber("idResponsable", Long.class);

    public final NumberPath<Long> idUtilisateur = createNumber("idUtilisateur", Long.class);

    public final StringPath libelle = createString("libelle");

    public final StringPath magasin = createString("magasin");

    public final StringPath maintenance = createString("maintenance");

    public final StringPath modele = createString("modele");

    public final NumberPath<java.math.BigDecimal> montantBudgetaire = createNumber("montantBudgetaire", java.math.BigDecimal.class);

    public final StringPath motifSortie = createString("motifSortie");

    public final NumberPath<Long> nombreBiens = createNumber("nombreBiens", Long.class);

    public final StringPath numeroSerie = createString("numeroSerie");

    public final StringPath typeSortie = createString("typeSortie");

    public final NumberPath<java.math.BigDecimal> valeurCession = createNumber("valeurCession", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> valeurNetteComptable = createNumber("valeurNetteComptable", java.math.BigDecimal.class);

    public final com.querydsl.sql.PrimaryKey<QImmBien> immBienPk = createPrimaryKey(idBien);

    public QImmBien(String variable) {
        super(QImmBien.class, forVariable(variable), "GFC", "IMM_BIEN");
        addMetadata();
    }

    public QImmBien(String variable, String schema, String table) {
        super(QImmBien.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QImmBien(Path<? extends QImmBien> path) {
        super(path.getType(), path.getMetadata(), "GFC", "IMM_BIEN");
        addMetadata();
    }

    public QImmBien(PathMetadata metadata) {
        super(QImmBien.class, metadata, "GFC", "IMM_BIEN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(codeBarre, ColumnMetadata.named("CODE_BARRE").withIndex(14).ofType(Types.VARCHAR).withSize(50));
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(15).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(dateSortie, ColumnMetadata.named("DATE_SORTIE").withIndex(17).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(documentation, ColumnMetadata.named("DOCUMENTATION").withIndex(10).ofType(Types.VARCHAR).withSize(100));
        addMetadata(garantie, ColumnMetadata.named("GARANTIE").withIndex(11).ofType(Types.VARCHAR).withSize(100));
        addMetadata(idBien, ColumnMetadata.named("ID_BIEN").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idInventaireComptable, ColumnMetadata.named("ID_INVENTAIRE_COMPTABLE").withIndex(16).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idLocalisation, ColumnMetadata.named("ID_LOCALISATION").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idResponsable, ColumnMetadata.named("ID_RESPONSABLE").withIndex(7).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idUtilisateur, ColumnMetadata.named("ID_UTILISATEUR").withIndex(8).ofType(Types.DECIMAL).withSize(38));
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(magasin, ColumnMetadata.named("MAGASIN").withIndex(4).ofType(Types.VARCHAR).withSize(200));
        addMetadata(maintenance, ColumnMetadata.named("MAINTENANCE").withIndex(12).ofType(Types.VARCHAR).withSize(100));
        addMetadata(modele, ColumnMetadata.named("MODELE").withIndex(13).ofType(Types.VARCHAR).withSize(200));
        addMetadata(montantBudgetaire, ColumnMetadata.named("MONTANT_BUDGETAIRE").withIndex(3).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(motifSortie, ColumnMetadata.named("MOTIF_SORTIE").withIndex(19).ofType(Types.VARCHAR).withSize(200));
        addMetadata(nombreBiens, ColumnMetadata.named("NOMBRE_BIENS").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(numeroSerie, ColumnMetadata.named("NUMERO_SERIE").withIndex(9).ofType(Types.VARCHAR).withSize(100));
        addMetadata(typeSortie, ColumnMetadata.named("TYPE_SORTIE").withIndex(18).ofType(Types.VARCHAR).withSize(20));
        addMetadata(valeurCession, ColumnMetadata.named("VALEUR_CESSION").withIndex(20).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(valeurNetteComptable, ColumnMetadata.named("VALEUR_NETTE_COMPTABLE").withIndex(21).ofType(Types.DECIMAL).withSize(12).withDigits(2));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QImmInventaireComptable is a Querydsl query type for QImmInventaireComptable
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QImmInventaireComptable extends com.querydsl.sql.RelationalPathBase<QImmInventaireComptable> {

    private static final long serialVersionUID = 265408683;

    public static final QImmInventaireComptable immInventaireComptable = new QImmInventaireComptable("IMM_INVENTAIRE_COMPTABLE");

    public final StringPath commentaire = createString("commentaire");

    public final DateTimePath<java.sql.Timestamp> debutAmortissement = createDateTime("debutAmortissement", java.sql.Timestamp.class);

    public final NumberPath<Long> dureeAmortissement = createNumber("dureeAmortissement", Long.class);

    public final StringPath etat = createString("etat");

    public final NumberPath<Integer> exeOrdreCompteAmortissement = createNumber("exeOrdreCompteAmortissement", Integer.class);

    public final NumberPath<Long> idInventaireComptable = createNumber("idInventaireComptable", Long.class);

    public final NumberPath<Long> nombreEtiquettes = createNumber("nombreEtiquettes", Long.class);

    public final StringPath numeroEj = createString("numeroEj");

    public final StringPath numInventaireComptable = createString("numInventaireComptable");

    public final StringPath pcoNumCompteAmortissement = createString("pcoNumCompteAmortissement");

    public final StringPath pcoNumImputation = createString("pcoNumImputation");

    public final StringPath typeAmortissement = createString("typeAmortissement");

    public final com.querydsl.sql.PrimaryKey<QImmInventaireComptable> immInventaireComptablePk = createPrimaryKey(idInventaireComptable);

    public QImmInventaireComptable(String variable) {
        super(QImmInventaireComptable.class, forVariable(variable), "GFC", "IMM_INVENTAIRE_COMPTABLE");
        addMetadata();
    }

    public QImmInventaireComptable(String variable, String schema, String table) {
        super(QImmInventaireComptable.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QImmInventaireComptable(Path<? extends QImmInventaireComptable> path) {
        super(path.getType(), path.getMetadata(), "GFC", "IMM_INVENTAIRE_COMPTABLE");
        addMetadata();
    }

    public QImmInventaireComptable(PathMetadata metadata) {
        super(QImmInventaireComptable.class, metadata, "GFC", "IMM_INVENTAIRE_COMPTABLE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(7).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(debutAmortissement, ColumnMetadata.named("DEBUT_AMORTISSEMENT").withIndex(4).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dureeAmortissement, ColumnMetadata.named("DUREE_AMORTISSEMENT").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(etat, ColumnMetadata.named("ETAT").withIndex(10).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(exeOrdreCompteAmortissement, ColumnMetadata.named("EXE_ORDRE_COMPTE_AMORTISSEMENT").withIndex(2).ofType(Types.DECIMAL).withSize(4));
        addMetadata(idInventaireComptable, ColumnMetadata.named("ID_INVENTAIRE_COMPTABLE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(nombreEtiquettes, ColumnMetadata.named("NOMBRE_ETIQUETTES").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(numeroEj, ColumnMetadata.named("NUMERO_EJ").withIndex(12).ofType(Types.VARCHAR).withSize(20));
        addMetadata(numInventaireComptable, ColumnMetadata.named("NUM_INVENTAIRE_COMPTABLE").withIndex(9).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(pcoNumCompteAmortissement, ColumnMetadata.named("PCO_NUM_COMPTE_AMORTISSEMENT").withIndex(3).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pcoNumImputation, ColumnMetadata.named("PCO_NUM_IMPUTATION").withIndex(11).ofType(Types.VARCHAR).withSize(20));
        addMetadata(typeAmortissement, ColumnMetadata.named("TYPE_AMORTISSEMENT").withIndex(8).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


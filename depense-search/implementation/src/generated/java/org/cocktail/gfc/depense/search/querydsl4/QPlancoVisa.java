package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPlancoVisa is a Querydsl query type for QPlancoVisa
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPlancoVisa extends com.querydsl.sql.RelationalPathBase<QPlancoVisa> {

    private static final long serialVersionUID = 1856788096;

    public static final QPlancoVisa plancoVisa = new QPlancoVisa("PLANCO_VISA");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath pcoNumCtrepartie = createString("pcoNumCtrepartie");

    public final StringPath pcoNumFactureNonParvenue = createString("pcoNumFactureNonParvenue");

    public final StringPath pcoNumOrdonnateur = createString("pcoNumOrdonnateur");

    public final StringPath pcoNumTva = createString("pcoNumTva");

    public final StringPath pviContrepartieGestion = createString("pviContrepartieGestion");

    public final StringPath pviEtat = createString("pviEtat");

    public final StringPath pviLibelle = createString("pviLibelle");

    public final NumberPath<Long> pviOrdre = createNumber("pviOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QPlancoVisa> plancoVisaPk = createPrimaryKey(pviOrdre);

    public QPlancoVisa(String variable) {
        super(QPlancoVisa.class, forVariable(variable), "GFC", "PLANCO_VISA");
        addMetadata();
    }

    public QPlancoVisa(String variable, String schema, String table) {
        super(QPlancoVisa.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPlancoVisa(Path<? extends QPlancoVisa> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PLANCO_VISA");
        addMetadata();
    }

    public QPlancoVisa(PathMetadata metadata) {
        super(QPlancoVisa.class, metadata, "GFC", "PLANCO_VISA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(pcoNumCtrepartie, ColumnMetadata.named("PCO_NUM_CTREPARTIE").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(pcoNumFactureNonParvenue, ColumnMetadata.named("PCO_NUM_FACTURE_NON_PARVENUE").withIndex(9).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pcoNumOrdonnateur, ColumnMetadata.named("PCO_NUM_ORDONNATEUR").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(pcoNumTva, ColumnMetadata.named("PCO_NUM_TVA").withIndex(5).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(pviContrepartieGestion, ColumnMetadata.named("PVI_CONTREPARTIE_GESTION").withIndex(8).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(pviEtat, ColumnMetadata.named("PVI_ETAT").withIndex(7).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pviLibelle, ColumnMetadata.named("PVI_LIBELLE").withIndex(6).ofType(Types.VARCHAR).withSize(20));
        addMetadata(pviOrdre, ColumnMetadata.named("PVI_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptCompteResultatPoste is a Querydsl query type for QCptCompteResultatPoste
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptCompteResultatPoste extends com.querydsl.sql.RelationalPathBase<QCptCompteResultatPoste> {

    private static final long serialVersionUID = 576949720;

    public static final QCptCompteResultatPoste cptCompteResultatPoste = new QCptCompteResultatPoste("CPT_COMPTE_RESULTAT_POSTE");

    public final StringPath cptrFormuleMontant = createString("cptrFormuleMontant");

    public final StringPath cptrGroupe = createString("cptrGroupe");

    public final NumberPath<Long> cptrIdPere = createNumber("cptrIdPere", Long.class);

    public final StringPath cptrLibelle = createString("cptrLibelle");

    public final StringPath cptrModifiable = createString("cptrModifiable");

    public final NumberPath<Long> cptrNiveau = createNumber("cptrNiveau", Long.class);

    public final NumberPath<Long> cptrOrdre = createNumber("cptrOrdre", Long.class);

    public final StringPath cptrStrId = createString("cptrStrId");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idCptCompteResultatPoste = createNumber("idCptCompteResultatPoste", Long.class);

    public final NumberPath<Long> idCptCompteResultatType = createNumber("idCptCompteResultatType", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCptCompteResultatPoste> cptCompteResultatPostePk = createPrimaryKey(idCptCompteResultatPoste);

    public QCptCompteResultatPoste(String variable) {
        super(QCptCompteResultatPoste.class, forVariable(variable), "GFC", "CPT_COMPTE_RESULTAT_POSTE");
        addMetadata();
    }

    public QCptCompteResultatPoste(String variable, String schema, String table) {
        super(QCptCompteResultatPoste.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptCompteResultatPoste(Path<? extends QCptCompteResultatPoste> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPT_COMPTE_RESULTAT_POSTE");
        addMetadata();
    }

    public QCptCompteResultatPoste(PathMetadata metadata) {
        super(QCptCompteResultatPoste.class, metadata, "GFC", "CPT_COMPTE_RESULTAT_POSTE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cptrFormuleMontant, ColumnMetadata.named("CPTR_FORMULE_MONTANT").withIndex(11).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(cptrGroupe, ColumnMetadata.named("CPTR_GROUPE").withIndex(9).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(cptrIdPere, ColumnMetadata.named("CPTR_ID_PERE").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(cptrLibelle, ColumnMetadata.named("CPTR_LIBELLE").withIndex(8).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(cptrModifiable, ColumnMetadata.named("CPTR_MODIFIABLE").withIndex(10).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(cptrNiveau, ColumnMetadata.named("CPTR_NIVEAU").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(cptrOrdre, ColumnMetadata.named("CPTR_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(cptrStrId, ColumnMetadata.named("CPTR_STR_ID").withIndex(7).ofType(Types.VARCHAR).withSize(1000).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idCptCompteResultatPoste, ColumnMetadata.named("ID_CPT_COMPTE_RESULTAT_POSTE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idCptCompteResultatType, ColumnMetadata.named("ID_CPT_COMPTE_RESULTAT_TYPE").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


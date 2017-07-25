package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBilanPoste is a Querydsl query type for QBilanPoste
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBilanPoste extends com.querydsl.sql.RelationalPathBase<QBilanPoste> {

    private static final long serialVersionUID = 770883133;

    public static final QBilanPoste bilanPoste = new QBilanPoste("BILAN_POSTE");

    public final StringPath bpFormuleAmortissement = createString("bpFormuleAmortissement");

    public final StringPath bpFormuleMontant = createString("bpFormuleMontant");

    public final StringPath bpGroupe = createString("bpGroupe");

    public final NumberPath<Long> bpId = createNumber("bpId", Long.class);

    public final NumberPath<Long> bpIdPere = createNumber("bpIdPere", Long.class);

    public final StringPath bpLibelle = createString("bpLibelle");

    public final StringPath bpModifiable = createString("bpModifiable");

    public final NumberPath<Long> bpNiveau = createNumber("bpNiveau", Long.class);

    public final NumberPath<Long> bpOrdre = createNumber("bpOrdre", Long.class);

    public final StringPath bpStrId = createString("bpStrId");

    public final NumberPath<Long> btId = createNumber("btId", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QBilanPoste> bilanPostePk = createPrimaryKey(bpId);

    public QBilanPoste(String variable) {
        super(QBilanPoste.class, forVariable(variable), "GFC", "BILAN_POSTE");
        addMetadata();
    }

    public QBilanPoste(String variable, String schema, String table) {
        super(QBilanPoste.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBilanPoste(Path<? extends QBilanPoste> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BILAN_POSTE");
        addMetadata();
    }

    public QBilanPoste(PathMetadata metadata) {
        super(QBilanPoste.class, metadata, "GFC", "BILAN_POSTE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bpFormuleAmortissement, ColumnMetadata.named("BP_FORMULE_AMORTISSEMENT").withIndex(12).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(bpFormuleMontant, ColumnMetadata.named("BP_FORMULE_MONTANT").withIndex(11).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(bpGroupe, ColumnMetadata.named("BP_GROUPE").withIndex(9).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(bpId, ColumnMetadata.named("BP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(bpIdPere, ColumnMetadata.named("BP_ID_PERE").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(bpLibelle, ColumnMetadata.named("BP_LIBELLE").withIndex(8).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(bpModifiable, ColumnMetadata.named("BP_MODIFIABLE").withIndex(10).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(bpNiveau, ColumnMetadata.named("BP_NIVEAU").withIndex(5).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(bpOrdre, ColumnMetadata.named("BP_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(bpStrId, ColumnMetadata.named("BP_STR_ID").withIndex(7).ofType(Types.VARCHAR).withSize(1000).notNull());
        addMetadata(btId, ColumnMetadata.named("BT_ID").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
    }

}


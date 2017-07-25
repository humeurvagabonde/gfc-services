package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVDelegueCommandeBoutique is a Querydsl query type for QVDelegueCommandeBoutique
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVDelegueCommandeBoutique extends com.querydsl.sql.RelationalPathBase<QVDelegueCommandeBoutique> {

    private static final long serialVersionUID = -512456753;

    public static final QVDelegueCommandeBoutique vDelegueCommandeBoutique = new QVDelegueCommandeBoutique("V_DELEGUE_COMMANDE_BOUTIQUE");

    public final NumberPath<Long> boutiqueId = createNumber("boutiqueId", Long.class);

    public final StringPath cStructure = createString("cStructure");

    public final NumberPath<Integer> noIndividu = createNumber("noIndividu", Integer.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public QVDelegueCommandeBoutique(String variable) {
        super(QVDelegueCommandeBoutique.class, forVariable(variable), "GFC", "V_DELEGUE_COMMANDE_BOUTIQUE");
        addMetadata();
    }

    public QVDelegueCommandeBoutique(String variable, String schema, String table) {
        super(QVDelegueCommandeBoutique.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVDelegueCommandeBoutique(Path<? extends QVDelegueCommandeBoutique> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_DELEGUE_COMMANDE_BOUTIQUE");
        addMetadata();
    }

    public QVDelegueCommandeBoutique(PathMetadata metadata) {
        super(QVDelegueCommandeBoutique.class, metadata, "GFC", "V_DELEGUE_COMMANDE_BOUTIQUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boutiqueId, ColumnMetadata.named("BOUTIQUE_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(cStructure, ColumnMetadata.named("C_STRUCTURE").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(3).ofType(Types.DECIMAL).withSize(8).notNull());
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


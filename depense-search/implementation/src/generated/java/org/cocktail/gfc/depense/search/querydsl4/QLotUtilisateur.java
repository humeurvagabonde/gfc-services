package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QLotUtilisateur is a Querydsl query type for QLotUtilisateur
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLotUtilisateur extends com.querydsl.sql.RelationalPathBase<QLotUtilisateur> {

    private static final long serialVersionUID = -195109444;

    public static final QLotUtilisateur lotUtilisateur = new QLotUtilisateur("LOT_UTILISATEUR");

    public final NumberPath<Long> lotOrdre = createNumber("lotOrdre", Long.class);

    public final NumberPath<Long> luId = createNumber("luId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QLotUtilisateur> lotUtilisateurPk = createPrimaryKey(lotOrdre, utlOrdre);

    public QLotUtilisateur(String variable) {
        super(QLotUtilisateur.class, forVariable(variable), "GFC", "LOT_UTILISATEUR");
        addMetadata();
    }

    public QLotUtilisateur(String variable, String schema, String table) {
        super(QLotUtilisateur.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLotUtilisateur(Path<? extends QLotUtilisateur> path) {
        super(path.getType(), path.getMetadata(), "GFC", "LOT_UTILISATEUR");
        addMetadata();
    }

    public QLotUtilisateur(PathMetadata metadata) {
        super(QLotUtilisateur.class, metadata, "GFC", "LOT_UTILISATEUR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(lotOrdre, ColumnMetadata.named("LOT_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(22).notNull());
        addMetadata(luId, ColumnMetadata.named("LU_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(22).notNull());
    }

}


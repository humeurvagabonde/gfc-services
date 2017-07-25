package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmUtilisateurStructure is a Querydsl query type for QVAdmUtilisateurStructure
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmUtilisateurStructure extends com.querydsl.sql.RelationalPathBase<QVAdmUtilisateurStructure> {

    private static final long serialVersionUID = 1485709678;

    public static final QVAdmUtilisateurStructure vAdmUtilisateurStructure = new QVAdmUtilisateurStructure("V_ADM_UTILISATEUR_STRUCTURE");

    public final StringPath cStructure = createString("cStructure");

    public final StringPath llStructure = createString("llStructure");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public QVAdmUtilisateurStructure(String variable) {
        super(QVAdmUtilisateurStructure.class, forVariable(variable), "GFC", "V_ADM_UTILISATEUR_STRUCTURE");
        addMetadata();
    }

    public QVAdmUtilisateurStructure(String variable, String schema, String table) {
        super(QVAdmUtilisateurStructure.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmUtilisateurStructure(Path<? extends QVAdmUtilisateurStructure> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_UTILISATEUR_STRUCTURE");
        addMetadata();
    }

    public QVAdmUtilisateurStructure(PathMetadata metadata) {
        super(QVAdmUtilisateurStructure.class, metadata, "GFC", "V_ADM_UTILISATEUR_STRUCTURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cStructure, ColumnMetadata.named("C_STRUCTURE").withIndex(3).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(llStructure, ColumnMetadata.named("LL_STRUCTURE").withIndex(4).ofType(Types.VARCHAR).withSize(200));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


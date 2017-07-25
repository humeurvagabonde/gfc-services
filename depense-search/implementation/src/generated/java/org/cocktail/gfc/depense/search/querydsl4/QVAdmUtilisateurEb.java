package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmUtilisateurEb is a Querydsl query type for QVAdmUtilisateurEb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmUtilisateurEb extends com.querydsl.sql.RelationalPathBase<QVAdmUtilisateurEb> {

    private static final long serialVersionUID = 418237698;

    public static final QVAdmUtilisateurEb vAdmUtilisateurEb = new QVAdmUtilisateurEb("V_ADM_UTILISATEUR_EB");

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public QVAdmUtilisateurEb(String variable) {
        super(QVAdmUtilisateurEb.class, forVariable(variable), "GFC", "V_ADM_UTILISATEUR_EB");
        addMetadata();
    }

    public QVAdmUtilisateurEb(String variable, String schema, String table) {
        super(QVAdmUtilisateurEb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmUtilisateurEb(Path<? extends QVAdmUtilisateurEb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_UTILISATEUR_EB");
        addMetadata();
    }

    public QVAdmUtilisateurEb(PathMetadata metadata) {
        super(QVAdmUtilisateurEb.class, metadata, "GFC", "V_ADM_UTILISATEUR_EB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


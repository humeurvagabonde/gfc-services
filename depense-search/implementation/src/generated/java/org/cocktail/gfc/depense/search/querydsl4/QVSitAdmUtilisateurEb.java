package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVSitAdmUtilisateurEb is a Querydsl query type for QVSitAdmUtilisateurEb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVSitAdmUtilisateurEb extends com.querydsl.sql.RelationalPathBase<QVSitAdmUtilisateurEb> {

    private static final long serialVersionUID = -1800932760;

    public static final QVSitAdmUtilisateurEb vSitAdmUtilisateurEb = new QVSitAdmUtilisateurEb("V_SIT_ADM_UTILISATEUR_EB");

    public final StringPath cptLogin = createString("cptLogin");

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public QVSitAdmUtilisateurEb(String variable) {
        super(QVSitAdmUtilisateurEb.class, forVariable(variable), "GFC", "V_SIT_ADM_UTILISATEUR_EB");
        addMetadata();
    }

    public QVSitAdmUtilisateurEb(String variable, String schema, String table) {
        super(QVSitAdmUtilisateurEb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVSitAdmUtilisateurEb(Path<? extends QVSitAdmUtilisateurEb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_SIT_ADM_UTILISATEUR_EB");
        addMetadata();
    }

    public QVSitAdmUtilisateurEb(PathMetadata metadata) {
        super(QVSitAdmUtilisateurEb.class, metadata, "GFC", "V_SIT_ADM_UTILISATEUR_EB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cptLogin, ColumnMetadata.named("CPT_LOGIN").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


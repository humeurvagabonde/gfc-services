package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCptCpteResultatPosteTri is a Querydsl query type for QVCptCpteResultatPosteTri
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCptCpteResultatPosteTri extends com.querydsl.sql.RelationalPathBase<QVCptCpteResultatPosteTri> {

    private static final long serialVersionUID = 990148943;

    public static final QVCptCpteResultatPosteTri vCptCpteResultatPosteTri = new QVCptCpteResultatPosteTri("V_CPT_CPTE_RESULTAT_POSTE_TRI");

    public final StringPath cleTri = createString("cleTri");

    public final NumberPath<Long> idCptCompteResultatPoste = createNumber("idCptCompteResultatPoste", Long.class);

    public QVCptCpteResultatPosteTri(String variable) {
        super(QVCptCpteResultatPosteTri.class, forVariable(variable), "GFC", "V_CPT_CPTE_RESULTAT_POSTE_TRI");
        addMetadata();
    }

    public QVCptCpteResultatPosteTri(String variable, String schema, String table) {
        super(QVCptCpteResultatPosteTri.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCptCpteResultatPosteTri(Path<? extends QVCptCpteResultatPosteTri> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CPT_CPTE_RESULTAT_POSTE_TRI");
        addMetadata();
    }

    public QVCptCpteResultatPosteTri(PathMetadata metadata) {
        super(QVCptCpteResultatPosteTri.class, metadata, "GFC", "V_CPT_CPTE_RESULTAT_POSTE_TRI");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cleTri, ColumnMetadata.named("CLE_TRI").withIndex(2).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(idCptCompteResultatPoste, ColumnMetadata.named("ID_CPT_COMPTE_RESULTAT_POSTE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


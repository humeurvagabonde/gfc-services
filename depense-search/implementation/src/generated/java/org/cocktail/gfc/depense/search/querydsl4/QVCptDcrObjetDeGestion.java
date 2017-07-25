package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCptDcrObjetDeGestion is a Querydsl query type for QVCptDcrObjetDeGestion
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCptDcrObjetDeGestion extends com.querydsl.sql.RelationalPathBase<QVCptDcrObjetDeGestion> {

    private static final long serialVersionUID = 1982270138;

    public static final QVCptDcrObjetDeGestion vCptDcrObjetDeGestion = new QVCptDcrObjetDeGestion("V_CPT_DCR_OBJET_DE_GESTION");

    public final NumberPath<Long> idDcr = createNumber("idDcr", Long.class);

    public final NumberPath<Long> idObjet = createNumber("idObjet", Long.class);

    public final StringPath numObjet = createString("numObjet");

    public final StringPath typeObjet = createString("typeObjet");

    public QVCptDcrObjetDeGestion(String variable) {
        super(QVCptDcrObjetDeGestion.class, forVariable(variable), "GFC", "V_CPT_DCR_OBJET_DE_GESTION");
        addMetadata();
    }

    public QVCptDcrObjetDeGestion(String variable, String schema, String table) {
        super(QVCptDcrObjetDeGestion.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCptDcrObjetDeGestion(Path<? extends QVCptDcrObjetDeGestion> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CPT_DCR_OBJET_DE_GESTION");
        addMetadata();
    }

    public QVCptDcrObjetDeGestion(PathMetadata metadata) {
        super(QVCptDcrObjetDeGestion.class, metadata, "GFC", "V_CPT_DCR_OBJET_DE_GESTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idDcr, ColumnMetadata.named("ID_DCR").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idObjet, ColumnMetadata.named("ID_OBJET").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(numObjet, ColumnMetadata.named("NUM_OBJET").withIndex(4).ofType(Types.VARCHAR).withSize(50));
        addMetadata(typeObjet, ColumnMetadata.named("TYPE_OBJET").withIndex(2).ofType(Types.VARCHAR).withSize(3).notNull());
    }

}


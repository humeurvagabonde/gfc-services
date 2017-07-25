package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVapiAdmNatureRecette is a Querydsl query type for QVapiAdmNatureRecette
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVapiAdmNatureRecette extends com.querydsl.sql.RelationalPathBase<QVapiAdmNatureRecette> {

    private static final long serialVersionUID = -164887155;

    public static final QVapiAdmNatureRecette vapiAdmNatureRecette = new QVapiAdmNatureRecette("VAPI_ADM_NATURE_RECETTE");

    public final StringPath code = createString("code");

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final StringPath libelle = createString("libelle");

    public final StringPath type = createString("type");

    public QVapiAdmNatureRecette(String variable) {
        super(QVapiAdmNatureRecette.class, forVariable(variable), "GFC", "VAPI_ADM_NATURE_RECETTE");
        addMetadata();
    }

    public QVapiAdmNatureRecette(String variable, String schema, String table) {
        super(QVapiAdmNatureRecette.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVapiAdmNatureRecette(Path<? extends QVapiAdmNatureRecette> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VAPI_ADM_NATURE_RECETTE");
        addMetadata();
    }

    public QVapiAdmNatureRecette(PathMetadata metadata) {
        super(QVapiAdmNatureRecette.class, metadata, "GFC", "VAPI_ADM_NATURE_RECETTE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(type, ColumnMetadata.named("TYPE").withIndex(2).ofType(Types.VARCHAR).withSize(2).notNull());
    }

}


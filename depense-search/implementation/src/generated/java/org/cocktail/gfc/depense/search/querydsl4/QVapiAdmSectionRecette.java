package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVapiAdmSectionRecette is a Querydsl query type for QVapiAdmSectionRecette
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVapiAdmSectionRecette extends com.querydsl.sql.RelationalPathBase<QVapiAdmSectionRecette> {

    private static final long serialVersionUID = -2115135097;

    public static final QVapiAdmSectionRecette vapiAdmSectionRecette = new QVapiAdmSectionRecette("VAPI_ADM_SECTION_RECETTE");

    public final StringPath code = createString("code");

    public final NumberPath<Long> idAdmSectionRecette = createNumber("idAdmSectionRecette", Long.class);

    public final StringPath libelle = createString("libelle");

    public QVapiAdmSectionRecette(String variable) {
        super(QVapiAdmSectionRecette.class, forVariable(variable), "GFC", "VAPI_ADM_SECTION_RECETTE");
        addMetadata();
    }

    public QVapiAdmSectionRecette(String variable, String schema, String table) {
        super(QVapiAdmSectionRecette.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVapiAdmSectionRecette(Path<? extends QVapiAdmSectionRecette> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VAPI_ADM_SECTION_RECETTE");
        addMetadata();
    }

    public QVapiAdmSectionRecette(PathMetadata metadata) {
        super(QVapiAdmSectionRecette.class, metadata, "GFC", "VAPI_ADM_SECTION_RECETTE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(2).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(idAdmSectionRecette, ColumnMetadata.named("ID_ADM_SECTION_RECETTE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


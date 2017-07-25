package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmSectionRecette is a Querydsl query type for QAdmSectionRecette
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmSectionRecette extends com.querydsl.sql.RelationalPathBase<QAdmSectionRecette> {

    private static final long serialVersionUID = -1216930293;

    public static final QAdmSectionRecette admSectionRecette = new QAdmSectionRecette("ADM_SECTION_RECETTE");

    public final StringPath code = createString("code");

    public final NumberPath<Long> idAdmSectionRecette = createNumber("idAdmSectionRecette", Long.class);

    public final StringPath libelle = createString("libelle");

    public final com.querydsl.sql.PrimaryKey<QAdmSectionRecette> admSectionRecettePk = createPrimaryKey(idAdmSectionRecette);

    public QAdmSectionRecette(String variable) {
        super(QAdmSectionRecette.class, forVariable(variable), "GFC", "ADM_SECTION_RECETTE");
        addMetadata();
    }

    public QAdmSectionRecette(String variable, String schema, String table) {
        super(QAdmSectionRecette.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmSectionRecette(Path<? extends QAdmSectionRecette> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_SECTION_RECETTE");
        addMetadata();
    }

    public QAdmSectionRecette(PathMetadata metadata) {
        super(QAdmSectionRecette.class, metadata, "GFC", "ADM_SECTION_RECETTE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(2).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(idAdmSectionRecette, ColumnMetadata.named("ID_ADM_SECTION_RECETTE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(500).notNull());
    }

}


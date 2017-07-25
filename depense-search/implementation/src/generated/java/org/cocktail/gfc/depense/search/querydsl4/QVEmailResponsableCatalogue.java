package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVEmailResponsableCatalogue is a Querydsl query type for QVEmailResponsableCatalogue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVEmailResponsableCatalogue extends com.querydsl.sql.RelationalPathBase<QVEmailResponsableCatalogue> {

    private static final long serialVersionUID = 135414587;

    public static final QVEmailResponsableCatalogue vEmailResponsableCatalogue = new QVEmailResponsableCatalogue("V_EMAIL_RESPONSABLE_CATALOGUE");

    public final NumberPath<Long> boutiqueId = createNumber("boutiqueId", Long.class);

    public final NumberPath<Long> catId = createNumber("catId", Long.class);

    public final StringPath email = createString("email");

    public final StringPath nomComplet = createString("nomComplet");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public QVEmailResponsableCatalogue(String variable) {
        super(QVEmailResponsableCatalogue.class, forVariable(variable), "GFC", "V_EMAIL_RESPONSABLE_CATALOGUE");
        addMetadata();
    }

    public QVEmailResponsableCatalogue(String variable, String schema, String table) {
        super(QVEmailResponsableCatalogue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVEmailResponsableCatalogue(Path<? extends QVEmailResponsableCatalogue> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_EMAIL_RESPONSABLE_CATALOGUE");
        addMetadata();
    }

    public QVEmailResponsableCatalogue(PathMetadata metadata) {
        super(QVEmailResponsableCatalogue.class, metadata, "GFC", "V_EMAIL_RESPONSABLE_CATALOGUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boutiqueId, ColumnMetadata.named("BOUTIQUE_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(email, ColumnMetadata.named("EMAIL").withIndex(4).ofType(Types.VARCHAR).withSize(101));
        addMetadata(nomComplet, ColumnMetadata.named("NOM_COMPLET").withIndex(5).ofType(Types.VARCHAR).withSize(127));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


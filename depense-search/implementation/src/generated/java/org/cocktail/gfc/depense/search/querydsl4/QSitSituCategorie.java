package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSitSituCategorie is a Querydsl query type for QSitSituCategorie
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSitSituCategorie extends com.querydsl.sql.RelationalPathBase<QSitSituCategorie> {

    private static final long serialVersionUID = -1236203732;

    public static final QSitSituCategorie sitSituCategorie = new QSitSituCategorie("SIT_SITU_CATEGORIE");

    public final StringPath scatCode = createString("scatCode");

    public final NumberPath<Long> scatId = createNumber("scatId", Long.class);

    public final StringPath scatLibelle = createString("scatLibelle");

    public final com.querydsl.sql.PrimaryKey<QSitSituCategorie> sitSituCategoriePk = createPrimaryKey(scatId);

    public QSitSituCategorie(String variable) {
        super(QSitSituCategorie.class, forVariable(variable), "GFC", "SIT_SITU_CATEGORIE");
        addMetadata();
    }

    public QSitSituCategorie(String variable, String schema, String table) {
        super(QSitSituCategorie.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSitSituCategorie(Path<? extends QSitSituCategorie> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SIT_SITU_CATEGORIE");
        addMetadata();
    }

    public QSitSituCategorie(PathMetadata metadata) {
        super(QSitSituCategorie.class, metadata, "GFC", "SIT_SITU_CATEGORIE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(scatCode, ColumnMetadata.named("SCAT_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(scatId, ColumnMetadata.named("SCAT_ID").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(scatLibelle, ColumnMetadata.named("SCAT_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(255));
    }

}


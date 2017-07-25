package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSitSituCritere is a Querydsl query type for QSitSituCritere
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSitSituCritere extends com.querydsl.sql.RelationalPathBase<QSitSituCritere> {

    private static final long serialVersionUID = 198600819;

    public static final QSitSituCritere sitSituCritere = new QSitSituCritere("SIT_SITU_CRITERE");

    public final StringPath scriCode = createString("scriCode");

    public final NumberPath<Long> scriId = createNumber("scriId", Long.class);

    public final StringPath scriLibelle = createString("scriLibelle");

    public final StringPath scriRecherche = createString("scriRecherche");

    public final StringPath scriType = createString("scriType");

    public final StringPath scriValeur = createString("scriValeur");

    public final com.querydsl.sql.PrimaryKey<QSitSituCritere> sitSituCriterePk = createPrimaryKey(scriId);

    public QSitSituCritere(String variable) {
        super(QSitSituCritere.class, forVariable(variable), "GFC", "SIT_SITU_CRITERE");
        addMetadata();
    }

    public QSitSituCritere(String variable, String schema, String table) {
        super(QSitSituCritere.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSitSituCritere(Path<? extends QSitSituCritere> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SIT_SITU_CRITERE");
        addMetadata();
    }

    public QSitSituCritere(PathMetadata metadata) {
        super(QSitSituCritere.class, metadata, "GFC", "SIT_SITU_CRITERE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(scriCode, ColumnMetadata.named("SCRI_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(25).notNull());
        addMetadata(scriId, ColumnMetadata.named("SCRI_ID").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(scriLibelle, ColumnMetadata.named("SCRI_LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(100));
        addMetadata(scriRecherche, ColumnMetadata.named("SCRI_RECHERCHE").withIndex(6).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(scriType, ColumnMetadata.named("SCRI_TYPE").withIndex(2).ofType(Types.VARCHAR).withSize(10));
        addMetadata(scriValeur, ColumnMetadata.named("SCRI_VALEUR").withIndex(3).ofType(Types.VARCHAR).withSize(10).notNull());
    }

}


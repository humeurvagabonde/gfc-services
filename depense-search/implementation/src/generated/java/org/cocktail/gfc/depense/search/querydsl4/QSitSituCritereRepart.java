package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSitSituCritereRepart is a Querydsl query type for QSitSituCritereRepart
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSitSituCritereRepart extends com.querydsl.sql.RelationalPathBase<QSitSituCritereRepart> {

    private static final long serialVersionUID = 814093049;

    public static final QSitSituCritereRepart sitSituCritereRepart = new QSitSituCritereRepart("SIT_SITU_CRITERE_REPART");

    public final NumberPath<Long> screpEtape = createNumber("screpEtape", Long.class);

    public final StringPath screpEtapeCommand = createString("screpEtapeCommand");

    public final NumberPath<Long> screpId = createNumber("screpId", Long.class);

    public final StringPath screpLibelle = createString("screpLibelle");

    public final NumberPath<Long> screpPosition = createNumber("screpPosition", Long.class);

    public final NumberPath<Long> scriId = createNumber("scriId", Long.class);

    public final NumberPath<Long> situId = createNumber("situId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSitSituCritereRepart> sitSituCritereRepartPk = createPrimaryKey(screpId);

    public QSitSituCritereRepart(String variable) {
        super(QSitSituCritereRepart.class, forVariable(variable), "GFC", "SIT_SITU_CRITERE_REPART");
        addMetadata();
    }

    public QSitSituCritereRepart(String variable, String schema, String table) {
        super(QSitSituCritereRepart.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSitSituCritereRepart(Path<? extends QSitSituCritereRepart> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SIT_SITU_CRITERE_REPART");
        addMetadata();
    }

    public QSitSituCritereRepart(PathMetadata metadata) {
        super(QSitSituCritereRepart.class, metadata, "GFC", "SIT_SITU_CRITERE_REPART");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(screpEtape, ColumnMetadata.named("SCREP_ETAPE").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(screpEtapeCommand, ColumnMetadata.named("SCREP_ETAPE_COMMAND").withIndex(7).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(screpId, ColumnMetadata.named("SCREP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(screpLibelle, ColumnMetadata.named("SCREP_LIBELLE").withIndex(6).ofType(Types.VARCHAR).withSize(100));
        addMetadata(screpPosition, ColumnMetadata.named("SCREP_POSITION").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(scriId, ColumnMetadata.named("SCRI_ID").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(situId, ColumnMetadata.named("SITU_ID").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSitSituCriterePopup is a Querydsl query type for QSitSituCriterePopup
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSitSituCriterePopup extends com.querydsl.sql.RelationalPathBase<QSitSituCriterePopup> {

    private static final long serialVersionUID = 717449209;

    public static final QSitSituCriterePopup sitSituCriterePopup = new QSitSituCriterePopup("SIT_SITU_CRITERE_POPUP");

    public final NumberPath<Long> scpoId = createNumber("scpoId", Long.class);

    public final NumberPath<Long> scpoIndice = createNumber("scpoIndice", Long.class);

    public final StringPath scpoLibelle = createString("scpoLibelle");

    public final StringPath scpoSqlCommand = createString("scpoSqlCommand");

    public final StringPath scpoType = createString("scpoType");

    public final NumberPath<Long> scriId = createNumber("scriId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSitSituCriterePopup> sitSituCriterePopupPk = createPrimaryKey(scpoId);

    public QSitSituCriterePopup(String variable) {
        super(QSitSituCriterePopup.class, forVariable(variable), "GFC", "SIT_SITU_CRITERE_POPUP");
        addMetadata();
    }

    public QSitSituCriterePopup(String variable, String schema, String table) {
        super(QSitSituCriterePopup.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSitSituCriterePopup(Path<? extends QSitSituCriterePopup> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SIT_SITU_CRITERE_POPUP");
        addMetadata();
    }

    public QSitSituCriterePopup(PathMetadata metadata) {
        super(QSitSituCriterePopup.class, metadata, "GFC", "SIT_SITU_CRITERE_POPUP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(scpoId, ColumnMetadata.named("SCPO_ID").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(scpoIndice, ColumnMetadata.named("SCPO_INDICE").withIndex(4).ofType(Types.DECIMAL).withSize(38));
        addMetadata(scpoLibelle, ColumnMetadata.named("SCPO_LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(50));
        addMetadata(scpoSqlCommand, ColumnMetadata.named("SCPO_SQL_COMMAND").withIndex(6).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(scpoType, ColumnMetadata.named("SCPO_TYPE").withIndex(3).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(scriId, ColumnMetadata.named("SCRI_ID").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


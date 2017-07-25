package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QNatureEvenement is a Querydsl query type for QNatureEvenement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QNatureEvenement extends com.querydsl.sql.RelationalPathBase<QNatureEvenement> {

    private static final long serialVersionUID = -853389192;

    public static final QNatureEvenement natureEvenement = new QNatureEvenement("NATURE_EVENEMENT");

    public final StringPath neCommentaire = createString("neCommentaire");

    public final StringPath neLibelle = createString("neLibelle");

    public final StringPath neLibelleCourt = createString("neLibelleCourt");

    public final NumberPath<Long> neOrdre = createNumber("neOrdre", Long.class);

    public final NumberPath<Long> typeEvtOrdre = createNumber("typeEvtOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QNatureEvenement> natureEvenementPk = createPrimaryKey(neOrdre);

    public QNatureEvenement(String variable) {
        super(QNatureEvenement.class, forVariable(variable), "GFC", "NATURE_EVENEMENT");
        addMetadata();
    }

    public QNatureEvenement(String variable, String schema, String table) {
        super(QNatureEvenement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNatureEvenement(Path<? extends QNatureEvenement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "NATURE_EVENEMENT");
        addMetadata();
    }

    public QNatureEvenement(PathMetadata metadata) {
        super(QNatureEvenement.class, metadata, "GFC", "NATURE_EVENEMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(neCommentaire, ColumnMetadata.named("NE_COMMENTAIRE").withIndex(1).ofType(Types.VARCHAR).withSize(250));
        addMetadata(neLibelle, ColumnMetadata.named("NE_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(neLibelleCourt, ColumnMetadata.named("NE_LIBELLE_COURT").withIndex(3).ofType(Types.VARCHAR).withSize(32));
        addMetadata(neOrdre, ColumnMetadata.named("NE_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(typeEvtOrdre, ColumnMetadata.named("TYPE_EVT_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


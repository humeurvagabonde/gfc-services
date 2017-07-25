package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeJournal is a Querydsl query type for QTypeJournal
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeJournal extends com.querydsl.sql.RelationalPathBase<QTypeJournal> {

    private static final long serialVersionUID = 42009747;

    public static final QTypeJournal typeJournal = new QTypeJournal("TYPE_JOURNAL");

    public final StringPath tjoLibelle = createString("tjoLibelle");

    public final NumberPath<Long> tjoOrdre = createNumber("tjoOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTypeJournal> typeJournalPk = createPrimaryKey(tjoOrdre);

    public QTypeJournal(String variable) {
        super(QTypeJournal.class, forVariable(variable), "GFC", "TYPE_JOURNAL");
        addMetadata();
    }

    public QTypeJournal(String variable, String schema, String table) {
        super(QTypeJournal.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeJournal(Path<? extends QTypeJournal> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_JOURNAL");
        addMetadata();
    }

    public QTypeJournal(PathMetadata metadata) {
        super(QTypeJournal.class, metadata, "GFC", "TYPE_JOURNAL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tjoLibelle, ColumnMetadata.named("TJO_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(tjoOrdre, ColumnMetadata.named("TJO_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


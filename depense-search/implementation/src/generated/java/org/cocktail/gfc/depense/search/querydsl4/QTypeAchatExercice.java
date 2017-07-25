package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeAchatExercice is a Querydsl query type for QTypeAchatExercice
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeAchatExercice extends com.querydsl.sql.RelationalPathBase<QTypeAchatExercice> {

    private static final long serialVersionUID = 436762269;

    public static final QTypeAchatExercice typeAchatExercice = new QTypeAchatExercice("TYPE_ACHAT_EXERCICE");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> typaeId = createNumber("typaeId", Long.class);

    public final NumberPath<Long> typaId = createNumber("typaId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTypeAchatExercice> typeAchatExercicePk = createPrimaryKey(typaeId);

    public QTypeAchatExercice(String variable) {
        super(QTypeAchatExercice.class, forVariable(variable), "GFC", "TYPE_ACHAT_EXERCICE");
        addMetadata();
    }

    public QTypeAchatExercice(String variable, String schema, String table) {
        super(QTypeAchatExercice.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeAchatExercice(Path<? extends QTypeAchatExercice> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_ACHAT_EXERCICE");
        addMetadata();
    }

    public QTypeAchatExercice(PathMetadata metadata) {
        super(QTypeAchatExercice.class, metadata, "GFC", "TYPE_ACHAT_EXERCICE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(typaeId, ColumnMetadata.named("TYPAE_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(typaId, ColumnMetadata.named("TYPA_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


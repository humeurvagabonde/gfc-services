package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeRecouvrement is a Querydsl query type for QTypeRecouvrement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeRecouvrement extends com.querydsl.sql.RelationalPathBase<QTypeRecouvrement> {

    private static final long serialVersionUID = -183807243;

    public static final QTypeRecouvrement typeRecouvrement = new QTypeRecouvrement("TYPE_RECOUVREMENT");

    public final StringPath modDom = createString("modDom");

    public final StringPath trecFormat = createString("trecFormat");

    public final StringPath trecLibelle = createString("trecLibelle");

    public final NumberPath<Long> trecOrdre = createNumber("trecOrdre", Long.class);

    public final StringPath trecValidite = createString("trecValidite");

    public final com.querydsl.sql.PrimaryKey<QTypeRecouvrement> typeRecouvrementPk = createPrimaryKey(trecOrdre);

    public QTypeRecouvrement(String variable) {
        super(QTypeRecouvrement.class, forVariable(variable), "GFC", "TYPE_RECOUVREMENT");
        addMetadata();
    }

    public QTypeRecouvrement(String variable, String schema, String table) {
        super(QTypeRecouvrement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeRecouvrement(Path<? extends QTypeRecouvrement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_RECOUVREMENT");
        addMetadata();
    }

    public QTypeRecouvrement(PathMetadata metadata) {
        super(QTypeRecouvrement.class, metadata, "GFC", "TYPE_RECOUVREMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(modDom, ColumnMetadata.named("MOD_DOM").withIndex(4).ofType(Types.VARCHAR).withSize(20));
        addMetadata(trecFormat, ColumnMetadata.named("TREC_FORMAT").withIndex(5).ofType(Types.VARCHAR).withSize(20));
        addMetadata(trecLibelle, ColumnMetadata.named("TREC_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(trecOrdre, ColumnMetadata.named("TREC_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(trecValidite, ColumnMetadata.named("TREC_VALIDITE").withIndex(3).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


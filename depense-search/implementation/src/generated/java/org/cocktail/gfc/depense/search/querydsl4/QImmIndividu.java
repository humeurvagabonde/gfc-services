package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QImmIndividu is a Querydsl query type for QImmIndividu
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QImmIndividu extends com.querydsl.sql.RelationalPathBase<QImmIndividu> {

    private static final long serialVersionUID = 1824620237;

    public static final QImmIndividu immIndividu = new QImmIndividu("IMM_INDIVIDU");

    public final NumberPath<Long> idImmIndividu = createNumber("idImmIndividu", Long.class);

    public final StringPath libelleIndividuNonGrhum = createString("libelleIndividuNonGrhum");

    public final NumberPath<Long> persIdIndividuGrhum = createNumber("persIdIndividuGrhum", Long.class);

    public final com.querydsl.sql.PrimaryKey<QImmIndividu> immIndividuPk = createPrimaryKey(idImmIndividu);

    public QImmIndividu(String variable) {
        super(QImmIndividu.class, forVariable(variable), "GFC", "IMM_INDIVIDU");
        addMetadata();
    }

    public QImmIndividu(String variable, String schema, String table) {
        super(QImmIndividu.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QImmIndividu(Path<? extends QImmIndividu> path) {
        super(path.getType(), path.getMetadata(), "GFC", "IMM_INDIVIDU");
        addMetadata();
    }

    public QImmIndividu(PathMetadata metadata) {
        super(QImmIndividu.class, metadata, "GFC", "IMM_INDIVIDU");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idImmIndividu, ColumnMetadata.named("ID_IMM_INDIVIDU").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelleIndividuNonGrhum, ColumnMetadata.named("LIBELLE_INDIVIDU_NON_GRHUM").withIndex(3).ofType(Types.VARCHAR).withSize(100));
        addMetadata(persIdIndividuGrhum, ColumnMetadata.named("PERS_ID_INDIVIDU_GRHUM").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


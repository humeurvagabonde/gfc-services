package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVPlancoChapitre is a Querydsl query type for QVPlancoChapitre
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVPlancoChapitre extends com.querydsl.sql.RelationalPathBase<QVPlancoChapitre> {

    private static final long serialVersionUID = 2090849139;

    public static final QVPlancoChapitre vPlancoChapitre = new QVPlancoChapitre("V_PLANCO_CHAPITRE");

    public final StringPath pcoChapitre = createString("pcoChapitre");

    public final StringPath pcoClasse = createString("pcoClasse");

    public final StringPath pcoNum = createString("pcoNum");

    public QVPlancoChapitre(String variable) {
        super(QVPlancoChapitre.class, forVariable(variable), "GFC", "V_PLANCO_CHAPITRE");
        addMetadata();
    }

    public QVPlancoChapitre(String variable, String schema, String table) {
        super(QVPlancoChapitre.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVPlancoChapitre(Path<? extends QVPlancoChapitre> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_PLANCO_CHAPITRE");
        addMetadata();
    }

    public QVPlancoChapitre(PathMetadata metadata) {
        super(QVPlancoChapitre.class, metadata, "GFC", "V_PLANCO_CHAPITRE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pcoChapitre, ColumnMetadata.named("PCO_CHAPITRE").withIndex(3).ofType(Types.VARCHAR).withSize(3));
        addMetadata(pcoClasse, ColumnMetadata.named("PCO_CLASSE").withIndex(2).ofType(Types.VARCHAR).withSize(1));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(1).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


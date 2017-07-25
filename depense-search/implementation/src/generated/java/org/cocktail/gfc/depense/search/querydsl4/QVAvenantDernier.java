package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAvenantDernier is a Querydsl query type for QVAvenantDernier
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAvenantDernier extends com.querydsl.sql.RelationalPathBase<QVAvenantDernier> {

    private static final long serialVersionUID = -1403423108;

    public static final QVAvenantDernier vAvenantDernier = new QVAvenantDernier("V_AVENANT_DERNIER");

    public final NumberPath<Long> avtOrdre = createNumber("avtOrdre", Long.class);

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public QVAvenantDernier(String variable) {
        super(QVAvenantDernier.class, forVariable(variable), "GFC", "V_AVENANT_DERNIER");
        addMetadata();
    }

    public QVAvenantDernier(String variable, String schema, String table) {
        super(QVAvenantDernier.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAvenantDernier(Path<? extends QVAvenantDernier> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_AVENANT_DERNIER");
        addMetadata();
    }

    public QVAvenantDernier(PathMetadata metadata) {
        super(QVAvenantDernier.class, metadata, "GFC", "V_AVENANT_DERNIER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(avtOrdre, ColumnMetadata.named("AVT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVRecetteResteRecouvrer is a Querydsl query type for QVRecetteResteRecouvrer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVRecetteResteRecouvrer extends com.querydsl.sql.RelationalPathBase<QVRecetteResteRecouvrer> {

    private static final long serialVersionUID = 2064046418;

    public static final QVRecetteResteRecouvrer vRecetteResteRecouvrer = new QVRecetteResteRecouvrer("V_RECETTE_RESTE_RECOUVRER");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> resteRecouvrer = createNumber("resteRecouvrer", Long.class);

    public QVRecetteResteRecouvrer(String variable) {
        super(QVRecetteResteRecouvrer.class, forVariable(variable), "GFC", "V_RECETTE_RESTE_RECOUVRER");
        addMetadata();
    }

    public QVRecetteResteRecouvrer(String variable, String schema, String table) {
        super(QVRecetteResteRecouvrer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVRecetteResteRecouvrer(Path<? extends QVRecetteResteRecouvrer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_RECETTE_RESTE_RECOUVRER");
        addMetadata();
    }

    public QVRecetteResteRecouvrer(PathMetadata metadata) {
        super(QVRecetteResteRecouvrer.class, metadata, "GFC", "V_RECETTE_RESTE_RECOUVRER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(resteRecouvrer, ColumnMetadata.named("RESTE_RECOUVRER").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


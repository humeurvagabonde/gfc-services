package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVRecetteRecouvrementDate is a Querydsl query type for QVRecetteRecouvrementDate
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVRecetteRecouvrementDate extends com.querydsl.sql.RelationalPathBase<QVRecetteRecouvrementDate> {

    private static final long serialVersionUID = -569290077;

    public static final QVRecetteRecouvrementDate vRecetteRecouvrementDate = new QVRecetteRecouvrementDate("V_RECETTE_RECOUVREMENT_DATE");

    public final DateTimePath<java.sql.Timestamp> dateRecouvrement = createDateTime("dateRecouvrement", java.sql.Timestamp.class);

    public final NumberPath<Long> ecrNumRecouvrement = createNumber("ecrNumRecouvrement", Long.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> resteRecouvrer = createNumber("resteRecouvrer", Long.class);

    public QVRecetteRecouvrementDate(String variable) {
        super(QVRecetteRecouvrementDate.class, forVariable(variable), "GFC", "V_RECETTE_RECOUVREMENT_DATE");
        addMetadata();
    }

    public QVRecetteRecouvrementDate(String variable, String schema, String table) {
        super(QVRecetteRecouvrementDate.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVRecetteRecouvrementDate(Path<? extends QVRecetteRecouvrementDate> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_RECETTE_RECOUVREMENT_DATE");
        addMetadata();
    }

    public QVRecetteRecouvrementDate(PathMetadata metadata) {
        super(QVRecetteRecouvrementDate.class, metadata, "GFC", "V_RECETTE_RECOUVREMENT_DATE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateRecouvrement, ColumnMetadata.named("DATE_RECOUVREMENT").withIndex(3).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(ecrNumRecouvrement, ColumnMetadata.named("ECR_NUM_RECOUVREMENT").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(resteRecouvrer, ColumnMetadata.named("RESTE_RECOUVRER").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


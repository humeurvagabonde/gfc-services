package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVRibFou is a Querydsl query type for QVRibFou
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVRibFou extends com.querydsl.sql.RelationalPathBase<QVRibFou> {

    private static final long serialVersionUID = -934124339;

    public static final QVRibFou vRibFou = new QVRibFou("V_RIB_FOU");

    public final StringPath bic = createString("bic");

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath iban = createString("iban");

    public final StringPath ribNum = createString("ribNum");

    public final NumberPath<Long> ribOrdre = createNumber("ribOrdre", Long.class);

    public final StringPath ribTitco = createString("ribTitco");

    public QVRibFou(String variable) {
        super(QVRibFou.class, forVariable(variable), "GFC", "V_RIB_FOU");
        addMetadata();
    }

    public QVRibFou(String variable, String schema, String table) {
        super(QVRibFou.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVRibFou(Path<? extends QVRibFou> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_RIB_FOU");
        addMetadata();
    }

    public QVRibFou(PathMetadata metadata) {
        super(QVRibFou.class, metadata, "GFC", "V_RIB_FOU");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bic, ColumnMetadata.named("BIC").withIndex(6).ofType(Types.VARCHAR).withSize(11));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(iban, ColumnMetadata.named("IBAN").withIndex(5).ofType(Types.VARCHAR).withSize(34));
        addMetadata(ribNum, ColumnMetadata.named("RIB_NUM").withIndex(4).ofType(Types.VARCHAR).withSize(26));
        addMetadata(ribOrdre, ColumnMetadata.named("RIB_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(ribTitco, ColumnMetadata.named("RIB_TITCO").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}


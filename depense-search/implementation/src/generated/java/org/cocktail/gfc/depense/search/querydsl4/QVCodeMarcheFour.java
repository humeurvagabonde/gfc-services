package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCodeMarcheFour is a Querydsl query type for QVCodeMarcheFour
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCodeMarcheFour extends com.querydsl.sql.RelationalPathBase<QVCodeMarcheFour> {

    private static final long serialVersionUID = -1509848671;

    public static final QVCodeMarcheFour vCodeMarcheFour = new QVCodeMarcheFour("V_CODE_MARCHE_FOUR");

    public final NumberPath<Long> ceOrdre = createNumber("ceOrdre", Long.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public QVCodeMarcheFour(String variable) {
        super(QVCodeMarcheFour.class, forVariable(variable), "GFC", "V_CODE_MARCHE_FOUR");
        addMetadata();
    }

    public QVCodeMarcheFour(String variable, String schema, String table) {
        super(QVCodeMarcheFour.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCodeMarcheFour(Path<? extends QVCodeMarcheFour> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CODE_MARCHE_FOUR");
        addMetadata();
    }

    public QVCodeMarcheFour(PathMetadata metadata) {
        super(QVCodeMarcheFour.class, metadata, "GFC", "V_CODE_MARCHE_FOUR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ceOrdre, ColumnMetadata.named("CE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


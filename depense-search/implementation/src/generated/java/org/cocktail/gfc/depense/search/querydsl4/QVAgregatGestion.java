package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAgregatGestion is a Querydsl query type for QVAgregatGestion
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAgregatGestion extends com.querydsl.sql.RelationalPathBase<QVAgregatGestion> {

    private static final long serialVersionUID = -1414940076;

    public static final QVAgregatGestion vAgregatGestion = new QVAgregatGestion("V_AGREGAT_GESTION");

    public final StringPath agregat = createString("agregat");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public QVAgregatGestion(String variable) {
        super(QVAgregatGestion.class, forVariable(variable), "GFC", "V_AGREGAT_GESTION");
        addMetadata();
    }

    public QVAgregatGestion(String variable, String schema, String table) {
        super(QVAgregatGestion.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAgregatGestion(Path<? extends QVAgregatGestion> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_AGREGAT_GESTION");
        addMetadata();
    }

    public QVAgregatGestion(PathMetadata metadata) {
        super(QVAgregatGestion.class, metadata, "GFC", "V_AGREGAT_GESTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(agregat, ColumnMetadata.named("AGREGAT").withIndex(2).ofType(Types.VARCHAR).withSize(200));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(10));
    }

}

